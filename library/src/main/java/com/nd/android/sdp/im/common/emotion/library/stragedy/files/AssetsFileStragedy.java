package com.nd.android.sdp.im.common.emotion.library.stragedy.files;

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

}
