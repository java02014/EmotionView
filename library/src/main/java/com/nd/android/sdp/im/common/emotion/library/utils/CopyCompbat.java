package com.nd.android.sdp.im.common.emotion.library.utils;

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
}
