package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.stragedy.encode.IEncoder;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.view.IInputView;

/**
 * 图片表情
 *
 * @author Young
 */
public class PicEmotion extends Emotion {

    public static final long serialVersionUID = -9047681836555324223L;

    protected PicEmotion(IFileStragedy pFileStragedy, IEncoder pEncoder) {
        super(pFileStragedy, pEncoder);
    }

    @Override
    public void click(Context pContext, IInputView pInputView) {

    }
}
