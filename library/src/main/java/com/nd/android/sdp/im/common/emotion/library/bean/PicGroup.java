package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Young on 2015/4/23.
 */
public class PicGroup extends Group {
    public PicGroup(IFileStragedy pFileStragedy) {
        super(pFileStragedy);
    }

    @Override
    public int getColumn() {
        return 4;
    }

    @Override
    public int getRow() {
        return 2;
    }

    @Override
    public int getEmotionCount(int page) {
        final int size = mEmotions.keySet().size();
        if ((page + 1) * (getColumn() * getRow()) <= size) {
            return getRow() * getColumn();
        } else {
            return size - (page) * (getColumn() * getRow());
        }
    }

    @Override
    public Emotion getEmotion(int page, int position) {
        return mEmotionArrays[page * (getColumn() * getRow()) + position];
    }

    @Override
    public int getPageCount() {
        return (int) Math.ceil((float) mEmotionArrays.length / (float) (getColumn() * getRow()));
    }

    @Override
    public View getGridView(Context pContext, int pPosition) {
        final LayoutInflater inflater = LayoutInflater.from(pContext);
        FrameLayout view = (FrameLayout) inflater.inflate(R.layout.pager_emotion, null);
        TableLayout tableLayout = (TableLayout) view.getChildAt(0);
        final int emotionCount = getEmotionCount(pPosition);
        if (emotionCount > 0) {
            final int row = ((emotionCount - 1) / getColumn()) + 1;
            for (int i = 0; i < row; i++) {
                TableRow tableRow = new TableRow(pContext);
                final int column = i < (row - 1) ? getColumn() : ((emotionCount - 1) % getColumn() + 1);
                tableRow.setWeightSum(getColumn());
                for (int j = 0; j < column; j++) {
                    final LinearLayout inflate = (LinearLayout) inflater.inflate(R.layout.emotion_view_item_pic_emotion, null);
                    final ImageView emotionView = (ImageView) inflate.getChildAt(0);
                    final Emotion emotion = getEmotion(pPosition, i * getColumn() + j);
                    ImageLoader.getInstance().displayImage(emotion.getFileName(), emotionView, mOptions);
                    inflate.setOnClickListener(this);
                    tableRow.addView(inflate);
                    final TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) inflate.getLayoutParams();
                    layoutParams.weight = 1;
                    inflate.setLayoutParams(layoutParams);
                    inflate.setTag(emotion);
                }
                tableLayout.addView(tableRow);
            }
        } else {
            TextView tvNoHistory = (TextView) view.getChildAt(1);
            tvNoHistory.setVisibility(View.VISIBLE);
        }
        return view;
    }

}
