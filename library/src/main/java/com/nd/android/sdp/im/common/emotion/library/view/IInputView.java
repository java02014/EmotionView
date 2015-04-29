package com.nd.android.sdp.im.common.emotion.library.view;

import android.text.Spannable;
import android.util.Pair;

/**
 * 控件接口
 *
 * @author Young
 */
public interface IInputView {

    /**
     * 获取文本
     *
     * @return the text
     */
    Spannable getText();

    /**
     * 设置文本
     *
     * @param pText 文本
     */
    void setText(CharSequence pText);

    /**
     * 获取选择位置
     *
     * @return the selection start
     */
    int getSelectionStart();

    /**
     * 获取选择位置终止点
     *
     * @return the selection end
     */
    int getSelectionEnd();

    /**
     * 退格
     *
     * @author Young
     */
    void onBackSpace();

    /**
     * Sets selection.
     *
     * @param pSelectionPair the p selection pair
     */
    void setSelection(Pair<Integer, Integer> pSelectionPair);

    float getTextSize();
}
