package com.nd.android.sdp.im.common.emotion.library.decode;

import android.content.Context;
import android.text.Spannable;

/**
 * 解码器
 *
 * @author Young
 */
public interface IDecoder {

    /**
     * 解码
     *
     * @param text       the text
     * @param pEmojiSize the emoji size
     * @param pTextSize  @return the spannable
     * @return the spannable
     * @author Young
     */
    Spannable decode(Spannable text, int pEmojiSize, int pTextSize);

    /**
     * 解析成普通文本，如:[高兴]
     *
     * @param pContext
     * @param text
     * @return
     */
    String decodeToText(Context pContext, String text);

}
