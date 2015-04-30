package com.nd.android.sdp.im.common.emotion.library.stragedy.configs;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.utils.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * SD卡配置文件流策略
 *
 * @author Young
 */
public class SdcardConfigsFilesStragedy implements IConfigFileStragedy {

    private String mGroupName;
    private Context mContext;

    /**
     * Instantiates a new Asset config file stragedy.
     *
     * @param pContext   the p context
     * @param pGroupName the p group name
     */
    public SdcardConfigsFilesStragedy(Context pContext, String pGroupName) {
        mGroupName = pGroupName;
        mContext = pContext;
    }

    @Override
    public InputStream getConfig() throws IOException {
        final File file = new File(FileUtils.getSdcardEmotionDir(mContext).getAbsolutePath() + "/" + mGroupName + "/smiley.xml");
        InputStream inputStream = new FileInputStream(file);
        return inputStream;
    }
}
