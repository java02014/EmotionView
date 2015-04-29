package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nostra13.universalimageloader.core.ImageLoader;

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
