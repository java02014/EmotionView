package com.nd.android.sdp.im.common.emotion.library.stragedy.files;

import android.content.Context;
import android.content.res.AssetManager;

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
    public String getImagePath(String pGroupName, String pFileName, String pExt) {
        return "assets://emotion/" + pGroupName + "/res(android)/" + pFileName + "." + pExt;
    }

    @Override
    public long getFileSize(Context pContext, String pGroupName, String pFileName, String pExt) {
        AssetManager mngr = pContext.getAssets();
        InputStream open = null;
        try {
            open = mngr.open("emotion/" + pGroupName + "/res(android)/" + pFileName + "." + pExt);
            if (open != null) {
                return open.available();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (open != null) {
                    open.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

}
