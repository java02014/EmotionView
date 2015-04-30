package com.nd.android.sdp.im.common.emotion.library.decode;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.exception.DecodeException;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 默认图片解析器
 *
 * @author Young
 */
public class DefaultPictureDecoder implements IPicDecorder {

    public static final String CONTENT_SERVICE_URL = "http://cs.101.com/v0.1/download?dentryId=%s&size=80";

    @Override
    public String decode(String text) throws DecodeException {
        LinkedHashMap<String, Group> groups = EmotionManager.getInstance().getGroups();
        String regEx = "\\[(\\w*):(\\w*)\\]"; //表示a或f
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(text);
        if (m.find()) {
            final String group = m.group(1);
            final String id = m.group(2);
            final Group emotionGroup = groups.get(group);
            if (emotionGroup != null) {
                final Emotion emotion = emotionGroup.getEmotions().get(id);
                if (emotion != null) {
                    return emotion.getFileName();
                }
            }
            return String.format(CONTENT_SERVICE_URL, id);
        }
        throw new DecodeException();
    }

}
