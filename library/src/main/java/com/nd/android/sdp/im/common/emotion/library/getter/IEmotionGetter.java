package com.nd.android.sdp.im.common.emotion.library.getter;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;

import java.util.List;

/**
 * Emotion获取接口
 *
 * @author Young
 */
public interface IEmotionGetter {

    /**
     * 获取表情分组
     *
     * @param pContext 上下文
     * @return 表情分组
     */
    List<Group> getEmotionGroups(Context pContext);

}
