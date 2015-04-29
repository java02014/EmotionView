package com.nd.android.sdp.im.common.emotion.library.getter;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.EmotionModule;
import com.nd.android.sdp.im.common.emotion.library.EmotionRecentsManager;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.RecentGroup;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.AssetsConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.AssetsFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.parser.EmotionParser;
import com.nd.android.sdp.im.common.emotion.library.parser.IEmotionParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 获取者默认实现
 *
 * @author Young
 */
public class DefaultEmotionGetter implements IEmotionGetter {

    private static final String TAG = "DefaultEmotionGetter";

    @Override
    public LinkedHashMap<String, Group> getEmotionGroups(Context pContext, int pEmotionTypes) {
        LinkedHashMap<String, Group> groupMap = new LinkedHashMap<String, Group>();
        ArrayList<Group> groupList = new ArrayList<Group>();
        // 读取历史
        final Group recentGroup = new RecentGroup(new AssetsFileStragedy());
        recentGroup.setId("recent");
        recentGroup.setOrder(0);
        groupList.add(recentGroup);
        IEmotionParser mEmotionParser = new EmotionParser();
        IConfigsStragedy configsStragedy = new AssetsConfigsStragedy();
        final String[] smileys = configsStragedy.getConfigs(pContext);
        for (String smiley : smileys) {
            IFileStragedy mFileStragedy = new AssetsFileStragedy();
            final Group group = mEmotionParser.parse(pContext, smiley, mFileStragedy);
            groupList.add(group);
        }
        Collections.sort(groupList, (lhs, rhs) -> lhs.getOrder() - rhs.getOrder());
        for (Group group : groupList) {
            groupMap.put(group.getId(), group);
        }
        EmotionModule.getInstance().setCachedGroups(groupMap);
        // TODO : 过滤emotionType
        return groupMap;
    }
}
