package com.nd.android.sdp.im.common.emotion.library.utils;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * 使用自主ImageLoader防止被Pause
 */
public class EmotionImageLoader extends ImageLoader {

    private static volatile EmotionImageLoader instance;

    public static EmotionImageLoader getInstance() {
        if(instance == null) {
            Class className = EmotionImageLoader.class;
            synchronized(EmotionImageLoader.class) {
                if(instance == null) {
                    instance = new EmotionImageLoader();
                }
            }
        }

        return instance;
    }

    protected EmotionImageLoader() {
    }

}
