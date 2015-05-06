package com.nd.android.sdp.im.common.emotion.library;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.Pair;

import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.decode.IDecoder;
import com.nd.android.sdp.im.common.emotion.library.span.EmotionSpan;
import com.nd.android.sdp.im.common.emotion.library.view.IInputView;

import java.util.ArrayList;

/**
 * 富文本处理类
 */
public class EmotionHandlers {

    /**
     * Update text.
     *
     * @param pInputView    the input view
     * @param pEmotion      the emotion
     * @param pTextSize     the text size
     * @param pDrawableSize the drawable size
     * @author Young
     */
    public static void addEmotion(IInputView pInputView, Emotion pEmotion, int pTextSize, int pDrawableSize) {
        final Spannable text = pInputView.getText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        final String append = pEmotion.encode();
        final int selectionStart = pInputView.getSelectionStart();
        final int length = append.length();
        spannableStringBuilder.replace(selectionStart, selectionStart, append, 0, length);
        updateEmotions(spannableStringBuilder, pTextSize, pDrawableSize);
        pInputView.setText(spannableStringBuilder);
        pInputView.setSelection(new Pair<>(selectionStart + length, selectionStart + length));
    }

    /**
     * 添加表情
     *
     * @author Young
     */
    public static void updateEmotions(Spannable pSpannable, int emojiSize, int textSize) {
        int textLength = pSpannable.length();
        EmotionSpan[] oldSpans = pSpannable.getSpans(0, textLength, EmotionSpan.class);
        for (int i = 0; i < oldSpans.length; i++) {
            pSpannable.removeSpan(oldSpans[i]);
        }
        final EmotionConfig configs = EmotionManager.getInstance().getConfigs();
        if (configs != null) {
            ArrayList<IDecoder> decoderList = configs.getDecoders();
            if (decoderList != null) {
                for (IDecoder decoder : decoderList) {
                    decoder.decode(pSpannable, emojiSize, textSize);
                }
            }
        }
    }

}
