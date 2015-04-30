package com.nd.android.sdp.im.common.emotion.library.stragedy.files;

/**
 * 文件策略
 *
 * @author Young
 */
public interface IFileStragedy {

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
