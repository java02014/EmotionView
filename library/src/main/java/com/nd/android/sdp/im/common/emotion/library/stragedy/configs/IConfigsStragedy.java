package com.nd.android.sdp.im.common.emotion.library.stragedy.configs;

import android.content.Context;

/**
 * 配置组获取策略
 *
 * @author Young
 */
public interface IConfigsStragedy {

    /**
     * 获取配置文件组
     *
     * @param pContext
     * @return the string [ ]
     * @author Young
     */
    String[] getConfigs(Context pContext);

}
