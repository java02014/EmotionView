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

import com.nd.android.sdp.im.common.emotion.library.EmotionRecentsManager;
import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionImageLoader;

/**
 * 最近分组
 *
 * @author Young
 */
public class RecentGroup extends PicGroup {

    public RecentGroup(IFileStragedy pFileStragedy) {
        super(pFileStragedy);
    }

    @Override
    public String getNormalImg() {
        return "drawable://" + R.drawable.emotion_view_history_normal;
    }

    @Override
    public String getSelecteddImg() {
        return "drawable://" + R.drawable.emotion_view_history_pressed;
    }

    /**
     * 刷新数据
     *
     * @param pContext the context
     * @author Young
     */
    public void refresh(Context pContext) {
        final EmotionRecentsManager recents = EmotionRecentsManager.getInstance(pContext);
        for (Emotion recent : recents) {
            addEmotion(recent.getGroupID() + ":" + recent.getId(), recent);
        }
        setEmotionArrays(recents.toArray(new Emotion[recents.size()]));
    }

    @Override
    public View getGridView(Context pContext, int pPosition, int pWidth, View.OnClickListener pOnClickListener) {
        final LayoutInflater inflater = LayoutInflater.from(pContext);
        FrameLayout view = (FrameLayout) inflater.inflate(R.layout.pager_emotion, null);
        TableLayout tableLayout = (TableLayout) view.getChildAt(0);
        final int emotionCount = getEmotionCount(pPosition);
        if (emotionCount > 0) {
            final int row = ((emotionCount - 1) / getColumn()) + 1;
            for (int i = 0; i < row; i++) {
                TableRow tableRow = new TableRow(pContext);
                final int column = i < (row - 1) ? getColumn() : ((emotionCount - 1) % getColumn() + 1);
                for (int j = 0; j < column; j++) {
                    final LinearLayout inflate = (LinearLayout) inflater.inflate(R.layout.emotion_view_item_pic_emotion, null);
                    final ImageView emotionView = (ImageView) inflate.getChildAt(0);
                    final Emotion emotion = getEmotion(pPosition, i * getColumn() + j);
                    emotionView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    emotion.setHistorymageViewProperty(emotionView);
                    EmotionImageLoader.getInstance().displayImage(emotion.getThumbFileName(), emotionView, sDisplayImageOptions);
                    inflate.setOnClickListener(pOnClickListener);
                    tableRow.addView(inflate);
                    final TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) inflate.getLayoutParams();
                    layoutParams.width = pWidth / getColumn();
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
