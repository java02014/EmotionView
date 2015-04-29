package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.EmotionRecentsManager;
import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;

/**
 * 最近分组
 *
 * @author Young
 */
public class RecentGroup extends PicGroup {

    public RecentGroup(IFileStragedy pFileStragedy) {
        super(pFileStragedy);
    }

    @Override
    public String getNormalImg() {
        return "drawable://" + R.drawable.emotion_view_history_normal;
    }

    @Override
    public String getSelecteddImg() {
        return "drawable://" + R.drawable.emotion_view_history_pressed;
    }

    /**
     * 刷新数据
     *
     * @param pContext the context
     * @author Young
     */
    public void refresh(Context pContext) {
        final EmotionRecentsManager recents = EmotionRecentsManager.getInstance(pContext);
        for (Emotion recent : recents) {
            addEmotion(recent.getGroupID() + ":" + recent.getId(), recent);
        }
        setEmotionArrays(recents.toArray(new Emotion[recents.size()]));
    }
}
