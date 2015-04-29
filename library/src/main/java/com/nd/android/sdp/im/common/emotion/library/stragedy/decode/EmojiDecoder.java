package com.nd.android.sdp.im.common.emotion.library.stragedy.decode;

import android.text.Spannable;

import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.span.EmotionSpan;

import java.util.Map;

/**
 * Created by Young on 2015/4/28.
 */
public class EmojiDecoder implements IDecoder {

    private Map<String,Group> mGroupMap;

    public EmojiDecoder(Map<String, Group> pGroupMap) {
        mGroupMap = pGroupMap;
    }

    @Override
    public Spannable decode(Spannable pSpannable, int pEmojiSize, int pTextSize) {
        String textString = pSpannable.toString();
        final int length = textString.length();
        int skip;
        for (int i = 0; i < length; i += skip) {
            int unicode = Character.codePointAt(pSpannable, i);
            skip = Character.charCount(unicode);
            final Emotion emotion = mGroupMap.get("e").getEmotions().get(String.valueOf(unicode));
            if (emotion != null) {
                pSpannable.setSpan(new EmotionSpan(emotion, pEmojiSize, pTextSize), i, i + skip, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return null;
    }

}
