package com.nd.android.sdp.im.common.emotion.library.getter;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.RecentGroup;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.AssetsFileStragedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Young on 2015/4/29.
 */
public class HistoryEmotionGetter implements IEmotionGetter {
    @Override
    public List<Group> getEmotionGroups(Context pContext) {
        ArrayList<Group> groupList = new ArrayList<Group>();
        // 读取历史
        final Group recentGroup = new RecentGroup(new AssetsFileStragedy());
        recentGroup.setId("recent");
        recentGroup.setOrder(0);
        groupList.add(recentGroup);
        return groupList;
    }
}
