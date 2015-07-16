package com.nd.android.sdp.im.common.emotion.library.getter;

import android.content.Context;
import android.util.Log;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.parser.DefaultEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.parser.IEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.stragedy.IAssetsStragedyFactory;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigsStragedy;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取者默认实现
 *
 * @author Young
 */
public class AssetsEmotionGetter implements IEmotionGetter {

    private static final String TAG = "DefaultEmotionGetter";

    @Override
    public List<Group> getEmotionGroups(Context pContext) {
//        ArrayList<Group> groupList = new ArrayList<Group>();
//        final long l = System.currentTimeMillis();
//        Log.e("TEST", l +"");
//        final IAssetsStragedyFactory stragedyFactory = EmotionManager.getInstance().getAssetsStragedyFactory();
//        IEmotionParser mEmotionParser = new DefaultEmotionParser(stragedyFactory.getFileStragedy());
//        IConfigsStragedy configsStragedy = stragedyFactory.getAssetsConfigs();
//        final String[] smileys = configsStragedy.getConfigs(pContext);
//        if (smileys != null) {
//            for (String smiley : smileys) {
//                IConfigFileStragedy mFileStragedy = stragedyFactory.getConfigFileStragedy(pContext, smiley);
//                final Group group = mEmotionParser.parse(pContext, smiley, mFileStragedy);
//                groupList.add(group);
//            }
//        }
        final ArrayList<Group> groupList = AssetsGroups.getAssetsGroups();
//        Log.e(TAG, "(System.currentTimeMillis()-l):" + (System.currentTimeMillis() - l));
        return groupList;
    }
}
