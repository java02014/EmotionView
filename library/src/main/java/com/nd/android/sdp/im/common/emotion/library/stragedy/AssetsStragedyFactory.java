package com.nd.android.sdp.im.common.emotion.library.stragedy;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.AssetConfigFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.AssetsConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.AssetsFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;

/**
 * 预置策略工厂
 *
 * @author Young
 */
public class AssetsStragedyFactory implements IAssetsStragedyFactory {
    @Override
    public IConfigsStragedy getAssetsConfigs() {
        return new AssetsConfigsStragedy();
    }

    @Override
    public IConfigFileStragedy getConfigFileStragedy(Context pContext, String pGroupName) {
        return new AssetConfigFileStragedy(pContext, pGroupName);
    }

    @Override
    public IFileStragedy getFileStragedy() {
        return new AssetsFileStragedy();
    }
}
