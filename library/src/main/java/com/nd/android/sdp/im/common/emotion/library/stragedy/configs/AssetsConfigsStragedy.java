package com.nd.android.sdp.im.common.emotion.library.stragedy.configs;

import android.content.Context;

import java.io.IOException;

/**
 * 预置文件配置组获取
 *
 * @author Young
 */
public class AssetsConfigsStragedy implements IConfigsStragedy {
    @Override
    public String[] getConfigs(Context pContext) {
        try {
            return pContext.getAssets().list("emotion");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
