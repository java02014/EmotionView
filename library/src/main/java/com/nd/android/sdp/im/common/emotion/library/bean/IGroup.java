package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;
import android.view.View;

/**
 * Created by Young on 2015/4/23.
 *
 * @author Young
 */
public interface IGroup {

    /**
     * 界面显示行数
     *
     * @return the column
     */
    int getColumn();

    /**
     * 界面行数.
     *
     * @return the row
     */
    int getRow();

    /**
     * 获取表情
     *
     * @param page     the page
     * @param position the position
     * @return the emotion
     */
    Emotion getEmotion(int page, int position);

    /**
     * 获取页数.
     *
     * @return the page count
     */
    int getPageCount();

    /**
     * 获取某页表情数量
     *
     * @param page 页码
     * @return the emotion count
     */
    int getEmotionCount(int page);

    /**
     * 获取表情网格
     *
     * @param pContext  the p context
     * @param pPosition
     * @param pWidth
     * @return the grid view
     */
    View getGridView(Context pContext, int pPosition, int pWidth, View.OnClickListener pOnClickListener);

}
