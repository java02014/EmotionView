package com.nd.android.sdp.im.common.emotion.library.stragedy.configs;

import android.content.Context;
import android.os.Environment;

import com.nd.android.sdp.im.common.emotion.library.utils.FileUtils;

import java.io.File;

/**
 * SD卡配置组策略
 *
 * @author Young
 */
public class SdcardConfigsStragedy implements IConfigsStragedy {

    @Override
    public String[] getConfigs(Context pContext) {
        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return null;
        }
        File dir = FileUtils.getSdcardEmotionDir(pContext);
        if (!dir.exists() || !dir.isDirectory()) {
            return null;
        }
        return dir.list();
    }
}
