package com.nd.android.sdp.im.common.emotion.library.stragedy;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;

/**
 * 预置表情获取策略抽象工厂
 *
 * @author Young
 */
public interface IAssetsStragedyFactory {

    /**
     * 获取预置文件
     *
     * @return the assets configs
     */
    IConfigsStragedy getAssetsConfigs();

    /**
     * 获取配置文件
     *
     * @param pContext the context
     * @return the config file stragedy
     */
    IConfigFileStragedy getConfigFileStragedy(Context pContext, String pGroupName);

    /**
     * 表情文件策略
     *
     * @return the file stragedy
     */
    IFileStragedy getFileStragedy();

}
