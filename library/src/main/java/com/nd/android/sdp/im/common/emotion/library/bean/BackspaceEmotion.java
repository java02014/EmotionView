package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.view.IInputView;

/**
 * Created by Young on 2015/4/23.
 */
public class BackspaceEmotion extends Emotion {

    protected BackspaceEmotion() {
        super(null, null);
    }

    @Override
    public String getThumbFileName() {
        return "drawable://" + R.drawable.emotion_view_backspace_normal;
    }

    @Override
    public void click(Context pContext, IInputView pInputView) {
        pInputView.onBackSpace();
    }
}
