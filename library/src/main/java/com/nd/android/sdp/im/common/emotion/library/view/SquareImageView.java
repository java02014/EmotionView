package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * 方形ImageView
 *
 * @author Young
 */
public class SquareImageView extends ImageView {
    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
