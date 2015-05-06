package com.nd.android.sdp.im.common.emotion.library.bean;

import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;

/**
 * Created by Young on 2015/4/23.
 */
public class SysGroup extends Group {

    public SysGroup(IFileStragedy pFileStragedy) {
        super(pFileStragedy);
    }

    @Override
    public int getColumn() {
        return 7;
    }

    @Override
    public int getRow() {
        return 3;
    }

}
