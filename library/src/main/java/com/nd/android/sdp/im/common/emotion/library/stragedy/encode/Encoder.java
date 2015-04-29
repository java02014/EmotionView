package com.nd.android.sdp.im.common.emotion.library.stragedy.encode;

import java.io.Serializable;

/**
 * Created by Young on 2015/4/27.
 */
public class Encoder implements IEncoder, Serializable {

    @Override
    public String encode(String pGroup, String pId) {
        return String.format("[%s:%s]", pGroup, pId);
    }

}
