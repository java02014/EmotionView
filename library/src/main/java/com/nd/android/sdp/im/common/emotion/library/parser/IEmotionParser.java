package com.nd.android.sdp.im.common.emotion.library.parser;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;

/**
 * Created by Young on 2015/4/27.
 */
public interface IEmotionParser {
    /**
     * Parse group.
     *
     * @param pContext      the p context
     * @param pDirName      the p dir name
     * @param pFileStragedy the p file name
     * @return the group
     * @author Young
     */
    Group parse(Context pContext, String pDirName, IFileStragedy pFileStragedy);
}
