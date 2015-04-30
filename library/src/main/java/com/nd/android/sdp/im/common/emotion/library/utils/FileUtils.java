package com.nd.android.sdp.im.common.emotion.library.utils;

import android.content.Context;

import java.io.File;

/**
 * Created by Young on 2015/4/29.
 */
public class FileUtils {

    public static final String SDCARD_DIR = "emotion";

    /**
     * Gets sdcard emotion dir.
     *
     * @param pContext the p context
     * @return the sdcard emotion
     */
    public static final File getSdcardEmotionDir(Context pContext) {
        return new File(pContext.getExternalCacheDir(), SDCARD_DIR);
    }

}
