package com.nd.android.sdp.im.common.emotion.library;

import com.nd.android.sdp.im.common.emotion.library.decode.IDecoder;
import com.nd.android.sdp.im.common.emotion.library.decode.IPicDecorder;
import com.nd.android.sdp.im.common.emotion.library.getter.IEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.stragedy.IAssetsStragedyFactory;

import java.util.ArrayList;

/**
 * Created by Young on 2015/4/29.
 */
public class EmotionConfig {

    private ArrayList<IEmotionGetter> mGetters = new ArrayList<IEmotionGetter>();
    private ArrayList<IDecoder> mDecoders = new ArrayList<IDecoder>();
    private ArrayList<IPicDecorder> mPicDecorders = new ArrayList<IPicDecorder>();
    private IAssetsStragedyFactory mAssetsStragedyFactory;

    public ArrayList<IPicDecorder> getPicDecorders() {
        return mPicDecorders;
    }

    public IAssetsStragedyFactory getAssetsStragedyFactory() {
        return mAssetsStragedyFactory;
    }

    public ArrayList<IEmotionGetter> getGetters() {
        return mGetters;
    }

    public ArrayList<IDecoder> getDecoders() {
        return mDecoders;
    }

    public static class Builder {

        private EmotionConfig mEmotionConfig;

        public Builder() {
            mEmotionConfig = new EmotionConfig();
        }

        /**
         * 添加解析器
         *
         * @author Young
         */
        public Builder addDecoders(IDecoder pDecoder) {
            mEmotionConfig.mDecoders.add(pDecoder);
            return this;
        }

        /**
         * 添加获取器
         *
         * @param pGetter the p getter
         * @author Young
         */
        public Builder addGetters(IEmotionGetter pGetter) {
            mEmotionConfig.mGetters.add(pGetter);
            return this;
        }

        /**
         * 设置预设文件
         *
         * @param pFactory the factory
         * @return the assets stragedy
         */
        public Builder setAssetsStragedy(IAssetsStragedyFactory pFactory) {
            mEmotionConfig.mAssetsStragedyFactory = pFactory;
            return this;
        }

        /**
         * Sets 图像解析器
         *
         * @param pPicDecorders the p pic decorders
         * @return the pic decorders
         */
        public Builder addPicDecorders(IPicDecorder pPicDecorders) {
            mEmotionConfig.mPicDecorders.add(pPicDecorders);
            return this;
        }

        public EmotionConfig build() {
            return mEmotionConfig;
        }
    }

}
