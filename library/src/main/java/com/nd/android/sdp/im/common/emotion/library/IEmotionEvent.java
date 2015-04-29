package com.nd.android.sdp.im.common.emotion.library;

/**
 * 表情事件
 *
 * @author Young
 */
public interface IEmotionEvent {

    /**
     * 发送表情（某些表情点击后自动发送）
     *
     * @param emotionEncoded 编码后的表情
     * @author Young
     */
    void onEmotionSend(String emotionEncoded);

}
