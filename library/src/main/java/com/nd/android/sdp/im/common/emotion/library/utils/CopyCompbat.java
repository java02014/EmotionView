package com.nd.android.sdp.im.common.emotion.library.utils;

import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextUtils;

import com.nd.android.sdp.im.common.emotion.library.span.EmotionSpan;
import com.nd.android.sdp.im.common.emotion.library.view.EmotionEditText;

/**
 * 复制粘贴兼容性处理
 *
 * @author Young
 */
public class CopyCompbat {

    /**
     * GetSelectionEnd 兼容性处理
     *
     * @param pEmotionEditText the p emotion edit text
     * @return the selection end compbat
     */
    public static int getSelectionEndCompbat(EmotionEditText pEmotionEditText) {
        final int selectionStart = pEmotionEditText.getSelectionStart();
        CharSequence content = pEmotionEditText.getText();
        int selectionEnd;
        if (content instanceof Spanned) {
            selectionEnd = ((Spanned) content)
                    .getSpanEnd(Selection.SELECTION_END);
            EmotionSpan[] spans = pEmotionEditText.getEditableText().getSpans(selectionStart,
                    content.length(), EmotionSpan.class);
            if (spans != null
                    && spans.length > 0
                    && selectionStart == selectionEnd - 1) {
                String source;
                for (EmotionSpan span : spans) {
                    source = span.getEmotion().encode();
                    if (selectionStart + source.length() > content.length())
                        break;
                    if (!TextUtils.isEmpty(source)
                            && source.equals(content.subSequence(
                            selectionStart,
                            selectionStart + source.length())
                            .toString())) {
                        return selectionStart + source.length();
                    }
                }
            }
            return selectionEnd;
        } else {
            return pEmotionEditText.getSelectionEnd();
        }
    }

    /**
     * onSelectionChangeCombat 兼容性处理
     *
     * @param pEmotionEditText
     * @param selStart
     * @param selEnd
     */
    public static void onSelectionChangeCombat(EmotionEditText pEmotionEditText, int selStart, int selEnd) {
        boolean isMultiSelect = (selStart != selEnd);// 是否区域性选择
        final Editable editableText = pEmotionEditText.getEditableText();
        if (!TextUtils.isEmpty(editableText) && selEnd < editableText.length()) {
            final EmotionSpan[] spans = editableText.getSpans(selStart - 1, selEnd, EmotionSpan.class);
            if (spans.length > 0) {
                final int spanEnd = editableText.getSpanEnd(spans[spans.length - 1]);
                if (selEnd != spanEnd) {
                    selEnd = spanEnd;
                }
                if (!isMultiSelect) {
                    selStart = selEnd;
                } else {
                    final int firstSpanStart = editableText.getSpanStart(spans[0]);
                    final int firstSpanEnd = editableText.getSpanEnd(spans[0]);
                    if (selStart >= firstSpanStart && selStart < firstSpanEnd) {
                        selStart = firstSpanStart;
                    }
                }
                pEmotionEditText.setSelection(selStart, selEnd);
            }
        }
    }
}
