package com.nd.android.sdp.im.common.emotion.library.getter;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Emotion获取接口
 *
 * @author Young
 */
public interface IEmotionGetter {

    /**
     * 获取表情分组
     *
     * @param pContext      上下文
     * @param pEmotionTypes
     * @return 表情分组
     */
    LinkedHashMap<String, Group> getEmotionGroups(Context pContext, int pEmotionTypes);

}
