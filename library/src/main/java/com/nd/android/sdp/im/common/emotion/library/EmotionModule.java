package com.nd.android.sdp.im.common.emotion.library;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.getter.DefaultEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.getter.IEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.stragedy.decode.DefaultDecoder;
import com.nd.android.sdp.im.common.emotion.library.stragedy.decode.EmojiDecoder;
import com.nd.android.sdp.im.common.emotion.library.stragedy.decode.IDecoder;

import java.util.ArrayList;
import java.util.Map;

/**
 * 对外调用类
 */
public class EmotionModule {

    private static EmotionModule mInstance = new EmotionModule();
    private Map<String, Group> mGroups;
    private ArrayList<IDecoder> mDecoders;

    public EmotionModule() {
        mDecoders = new ArrayList<IDecoder>();
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static EmotionModule getInstance() {
        return mInstance;
    }

    public ArrayList<IDecoder> getDecoders() {
        return mDecoders;
    }

    public void setCachedGroups(Map<String, Group> pGroups) {
        mGroups = pGroups;
        mDecoders.add(new DefaultDecoder(mGroups));
        mDecoders.add(new EmojiDecoder(mGroups));
    }

    public IEmotionGetter getEmotionGetter() {
        return new DefaultEmotionGetter();
    }

    /**
     * 获取缓存
     *
     * @return the cached group
     */
    public Map<String, Group> getCachedGroup() {
        return mGroups;
    }

    /**
     * 增加一个解析器
     *
     * @author Young
     */
    public void addDecoders(IDecoder pDecoder) {
        mDecoders.add(pDecoder);
    }

    /**
     * 解码
     *
     * @param text          the text
     * @param pTextSize     the text size
     * @param pDrawableSize the drawable size
     * @return the spannable
     * @author Young
     */
    public Spannable decode(String text, int pTextSize, int pDrawableSize) {
        if (mGroups == null) {
            // TODO 外头需要等待
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        for (IDecoder decoder : mDecoders) {
            decoder.decode(spannableStringBuilder, pTextSize, pDrawableSize);
        }
        return spannableStringBuilder;
    }

    /**
     * 解析图片消息返回图片URL
     *
     * @param text the text
     * @return the string
     * @author Young
     */
    public String decodePic(String text) {
        Spannable spannable = new SpannableStringBuilder(text);
        for (IDecoder decoder : mDecoders) {
            decoder.decode(spannable, 0, 0);
        }
        return spannable.toString();
    }

}
