package com.nd.android.sdp.im.common.emotion.library;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.decode.DefaultDecoder;
import com.nd.android.sdp.im.common.emotion.library.decode.DefaultPictureDecoder;
import com.nd.android.sdp.im.common.emotion.library.decode.EmojiDecoder;
import com.nd.android.sdp.im.common.emotion.library.decode.IDecoder;
import com.nd.android.sdp.im.common.emotion.library.decode.IPicDecorder;
import com.nd.android.sdp.im.common.emotion.library.exception.DecodeException;
import com.nd.android.sdp.im.common.emotion.library.getter.AssetsEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.getter.HistoryEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.getter.IEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.getter.SdcardEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.stragedy.AssetsStragedyFactory;
import com.nd.android.sdp.im.common.emotion.library.stragedy.IAssetsStragedyFactory;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionTypeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 对外调用类
 *
 * @author Young
 */
public class EmotionManager {

    private static EmotionManager mInstance = new EmotionManager();
    private LinkedHashMap<String, Group> mGroups = new LinkedHashMap<String, Group>();
    private EmotionConfig mEmotionConfig;
    private IAssetsStragedyFactory mAssetsStragedyFactory;

    public EmotionManager() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static EmotionManager getInstance() {
        return mInstance;
    }

    /**
     * Gets assets stragedy factory.
     *
     * @return the assets stragedy factory
     */
    public IAssetsStragedyFactory getAssetsStragedyFactory() {
        return mAssetsStragedyFactory;
    }

    public LinkedHashMap<String, Group> getGroups() {
        return mGroups;
    }

    /**
     * 初始化模块
     *
     * @param pEmotionConfig the emotion config
     * @author Young
     */
    public void init(EmotionConfig pEmotionConfig) {
        mEmotionConfig = pEmotionConfig;
        checkConfig();
    }

    private void checkConfig() {
        if (mEmotionConfig == null) {
            mEmotionConfig = new EmotionConfig.Builder()
                    .addDecoders(new DefaultDecoder())
                    .addDecoders(new EmojiDecoder())
                    .addGetters(new HistoryEmotionGetter())
                    .addGetters(new AssetsEmotionGetter())
                    .addGetters(new SdcardEmotionGetter())
                    .addPicDecorders(new DefaultPictureDecoder())
                    .setAssetsStragedy(new AssetsStragedyFactory())
                    .build();
        }
        mAssetsStragedyFactory = mEmotionConfig.getAssetsStragedyFactory();
    }

    /**
     * 初始化表情组
     *
     * @param pContext the p context
     * @return the linked hash map
     * @author Young
     */
    public void initData(Context pContext) {
        checkConfig();
        if (mGroups.isEmpty()) {
            refreshData(pContext);
        }
    }

    /**
     * 刷新表情组
     *
     * @param pContext the p context
     * @author Young
     */
    public void refreshData(Context pContext) {
        checkConfig();
        ArrayList<Group> groups = new ArrayList<Group>();
        ArrayList<IEmotionGetter> getters = mEmotionConfig.getGetters();
        for (IEmotionGetter getter : getters) {
            final List<Group> emotionGroups = getter.getEmotionGroups(pContext);
            groups.addAll(emotionGroups);
        }
        Collections.sort(groups, new Comparator<Group>() {
            @Override
            public int compare(Group lhs, Group rhs) {
                return lhs.getOrder() - rhs.getOrder();
            }
        });
        for (Group group : groups) {
            mGroups.put(group.getId(), group);
        }
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
    public CharSequence decode(CharSequence text, int pTextSize, int pDrawableSize) {
        checkConfig();
        if (mGroups == null) {
            // TODO 外头需要等待
            return null;
        }
        Spannable spannable;
        if (!(text instanceof Spannable)) {
            spannable = new SpannableStringBuilder(text);
        } else {
            spannable = (Spannable) text;
        }
        final ArrayList<IDecoder> decoders = mEmotionConfig.getDecoders();
        for (IDecoder decoder : decoders) {
            decoder.decode(spannable, pTextSize, pDrawableSize);
        }
        return spannable;
    }

    /**
     * 解析图片消息返回图片URL
     *
     * @param text the text
     * @return the string
     * @author Young
     */
    public String decodePic(String text) {
        checkConfig();
        final ArrayList<IPicDecorder> decoders = mEmotionConfig.getPicDecorders();
        for (IPicDecorder decoder : decoders) {
            try {
                return decoder.decode(text);
            } catch (DecodeException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Gets groups.
     *
     * @param pEmotionTypes the p emotion types
     * @return the groups
     */
    public LinkedHashMap<String, Group> getGroups(int pEmotionTypes) {
        if (EmotionTypeUtils.allMatch(pEmotionTypes)) {
            return mGroups;
        }
        LinkedHashMap<String, Group> groups = new LinkedHashMap<String, Group>();
        groups.put("recent", mGroups.get("recent"));
        for (Group group : mGroups.values()) {
            if (EmotionTypeUtils.typeMatch(group, pEmotionTypes)) {
                groups.put(group.getId(), group);
            }
        }
        return groups;
    }

    public EmotionConfig getConfigs() {
        return mEmotionConfig;
    }
}
