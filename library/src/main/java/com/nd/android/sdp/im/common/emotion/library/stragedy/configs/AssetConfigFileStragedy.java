package com.nd.android.sdp.im.common.emotion.library.stragedy.configs;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * 预置文件配置策略
 *
 * @author Young
 */
public class AssetConfigFileStragedy implements IConfigFileStragedy {

    private String mGroupName;
    private Context mContext;

    /**
     * Instantiates a new Asset config file stragedy.
     *
     * @param pContext   the p context
     * @param pGroupName the p group name
     */
    public AssetConfigFileStragedy(Context pContext, String pGroupName) {
        mGroupName = pGroupName;
        mContext = pContext;
    }

    @Override
    public InputStream getConfig() throws IOException {
        final String fileName = "emotion/" + mGroupName + "/smiley.xml";
        return mContext.getAssets().open(fileName);
    }
}
