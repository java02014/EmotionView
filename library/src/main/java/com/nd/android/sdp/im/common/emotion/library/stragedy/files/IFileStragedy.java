package com.nd.android.sdp.im.common.emotion.library.stragedy.files;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * 文件策略
 *
 * @author Young
 */
public interface IFileStragedy {

    /**
     * 获取配置文件流
     *
     * @param pContext   上下文
     * @param pGroupName the p group name
     * @return the config stream
     * @throws IOException the iO exception
     */
    InputStream getConfigStream(Context pContext, String pGroupName) throws IOException;

    /**
     * 获取文件路径
     *
     * @param pGroupName the group name
     * @param pFileName  the file name
     * @param pExt       the ext
     * @return the image path
     */
    String getImagePath(String pGroupName, String pFileName, String pExt);

}
