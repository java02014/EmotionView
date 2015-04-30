package com.nd.android.sdp.im.common.emotion.library.getter;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.parser.DefaultEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.parser.IEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.SdcardConfigsFilesStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.SdcardConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.SdcardFileStragedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Sd卡获取规则
 *
 * @author Young
 */
public class SdcardEmotionGetter implements IEmotionGetter {

    @Override
    public List<Group> getEmotionGroups(Context pContext) {
        ArrayList<Group> groupList = new ArrayList<Group>();
        IConfigsStragedy configsStragedy = new SdcardConfigsStragedy();
        final String[] smileys = configsStragedy.getConfigs(pContext);
        if (smileys != null) {
            for (String smiley : smileys) {
                IEmotionParser emotionParser = new DefaultEmotionParser(new SdcardFileStragedy(pContext, smiley));
                IConfigFileStragedy mFileStragedy = new SdcardConfigsFilesStragedy(pContext, smiley);
                final Group group = emotionParser.parse(pContext, smiley, mFileStragedy);
                if (group != null) {
                    groupList.add(group);
                }
            }
        }
        return groupList;
    }
}
