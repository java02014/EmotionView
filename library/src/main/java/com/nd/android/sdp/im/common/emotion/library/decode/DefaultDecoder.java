package com.nd.android.sdp.im.common.emotion.library.decode;

import android.text.Spannable;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.span.EmotionSpan;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 默认解码
 *
 * @author Young
 */
public class DefaultDecoder implements IDecoder {

    private Map<String, Group> mGroupMap;

    public DefaultDecoder() {
        mGroupMap = EmotionManager.getInstance().getGroups();
    }

    @Override
    public Spannable decode(Spannable pSpannable, int pEmojiSize, int pTextSize) {
        String textString = pSpannable.toString();
        String regEx = "\\[(\\w*):(\\w*)\\]"; //表示a或f
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(textString);
        while (m.find()) {
            final String group = m.group(1);
            final String id = m.group(2);
            final Emotion emotion = mGroupMap.get(group).getEmotions().get(id);
            if (emotion != null) {
                pSpannable.setSpan(new EmotionSpan(emotion, pEmojiSize, pTextSize), m.start(), m.end(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return pSpannable;
    }
}
