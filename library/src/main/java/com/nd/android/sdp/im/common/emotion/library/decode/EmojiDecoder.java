package com.nd.android.sdp.im.common.emotion.library.decode;

import android.content.Context;
import android.text.Spannable;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.span.EmotionSpan;

import java.util.Locale;
import java.util.Map;

/**
 * Emoji解码器
 *
 * @author Young
 */
public class EmojiDecoder implements IDecoder {

    private Map<String, Group> mGroupMap;

    public EmojiDecoder() {
        mGroupMap = EmotionManager.getInstance().getGroups();
    }

    @Override
    public Spannable decode(Spannable pSpannable, int pEmojiSize, int pTextSize) {
        String textString = pSpannable.toString();
        final int length = textString.length();
        int skip;
        for (int i = 0; i < length; i += skip) {
            int unicode = Character.codePointAt(pSpannable, i);
            skip = Character.charCount(unicode);
            final Group group = mGroupMap.get("e");
            if (group == null) {
                return pSpannable;
            }
            final Emotion emotion = group.getEmotions().get(String.valueOf(unicode));
            if (emotion != null) {
                pSpannable.setSpan(new EmotionSpan(emotion, pEmojiSize, pTextSize), i, i + skip, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return null;
    }

    @Override
    public String decodeToText(Context pContext, String text) {
        StringBuilder result = new StringBuilder(text);
        int length;
        int skip;
        int i = 0;
        Emotion emotion = null;
        do {
            int unicode = Character.codePointAt(result, i);
            skip = Character.charCount(unicode);
            final Group group = mGroupMap.get("e");
            if (group == null) {
                return text;
            }
            emotion = group.getEmotions().get(String.valueOf(unicode));
            int destLength = 0;
            if (emotion != null) {
                final String string = "[" + emotion.getLangText(Locale.getDefault()) + "]";
                destLength = string.length();
                result.replace(i, i + skip, string);
            }
            if (destLength == 0) {
                destLength = skip;
            }
            i += destLength;
            length = result.length();
        } while (i < length);
        return result.toString();
    }

}
