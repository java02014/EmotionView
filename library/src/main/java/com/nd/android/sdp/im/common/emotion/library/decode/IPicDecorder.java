package com.nd.android.sdp.im.common.emotion.library.decode;

import com.nd.android.sdp.im.common.emotion.library.exception.DecodeException;

/**
 * Created by Young on 2015/4/29.
 */
public interface IPicDecorder {

    /**
     * 解析图片成URI
     *
     * @param text the text
     * @return the string
     * @author Young
     */
    String decode(String text) throws DecodeException;

}
