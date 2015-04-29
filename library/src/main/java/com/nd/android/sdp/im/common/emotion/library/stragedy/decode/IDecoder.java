package com.nd.android.sdp.im.common.emotion.library.stragedy.decode;

import android.text.Spannable;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;

import java.util.Map;

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

}
