package com.nd.android.sdp.im.common.emotion.library.encode;

import java.io.Serializable;

/**
 * Emoji 编码器d
 *
 * @author Young
 */
public class EmojiEncoder implements IEncoder, Serializable {
    @Override
    public String encode(String pGroup, String pId) {
        int codePoint = Integer.parseInt(pId);
        return newString(codePoint);
    }

    public static final String newString(int codePoint) {
//        if (Character.charCount(codePoint) == 1) {
//            return String.valueOf(codePoint);
//        } else {
        return new String(Character.toChars(codePoint));
//        }
    }
}
