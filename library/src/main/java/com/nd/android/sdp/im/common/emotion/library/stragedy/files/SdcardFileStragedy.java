package com.nd.android.sdp.im.common.emotion.library.stragedy.files;

import android.content.Context;
import android.net.Uri;

import com.nd.android.sdp.im.common.emotion.library.utils.FileUtils;

import java.io.File;

/**
 * SD卡策略
 *
 * @author Young
 */
public class SdcardFileStragedy implements IFileStragedy {

    private String mGroupDir;

    /**
     * Instantiates a new Sdcard file stragedy.
     *
     * @param pContext the p context
     */
    public SdcardFileStragedy(Context pContext, String pGroupDir) {
        mGroupDir = new File(FileUtils.getSdcardEmotionDir(pContext), pGroupDir).getAbsolutePath();
    }

    @Override
    public String getImagePath(String pGroupName, String pFileName, String pExt) {
        File picFile = new File(mGroupDir, "/res(android)/" + pFileName + "." + pExt);
        return Uri.fromFile(picFile).toString();
    }
}
