package com.nd.android.sdp.im.common.emotion.library.stragedy.files;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * Created by Young on 2015/4/27.
 */
public class AssetsFileStragedy implements IFileStragedy, Serializable {

    /**
     * 预置文件策略
     */
    public AssetsFileStragedy() {
    }


    @Override
    public InputStream getConfigStream(Context pContext, String pGroupName) throws IOException {
        final String fileName = "emotion/" + pGroupName + "/smiley.xml";
        return pContext.getAssets().open(fileName);
    }

    @Override
    public String getImagePath(String pGroupName, String pFileName, String pExt) {
        return "assets://emotion/" + pGroupName + "/res(android)/" + pFileName + "." + pExt;
    }

}
