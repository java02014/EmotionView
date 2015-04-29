package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;

import com.nd.android.sdp.im.common.emotion.library.EmotionHandlers;
import com.nd.android.sdp.im.common.emotion.library.EmotionRecentsManager;
import com.nd.android.sdp.im.common.emotion.library.stragedy.encode.EmojiEncoder;
import com.nd.android.sdp.im.common.emotion.library.stragedy.encode.Encoder;
import com.nd.android.sdp.im.common.emotion.library.stragedy.encode.IEncoder;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.utils.ObjectSerializer;
import com.nd.android.sdp.im.common.emotion.library.view.IInputView;

import java.io.IOException;
import java.io.Serializable;

/**
 * 表情
 *
 * @author Young
 */
public class Emotion implements Serializable {

    public static final long serialVersionUID = 3396957208882721792L;

    private final IFileStragedy mFileStragedy;
    protected IEncoder mEncoder;
    /**
     * ID
     */
    private String mId;
    /**
     * 文件名
     */
    private String mFileName;
    /**
     * 分组ID
     */
    private String mGroupID;
    /**
     * 分组文件夹名称
     */
    private String mGroupDirName;
    /**
     * 后缀
     */
    private String mExt;
    /**
     * 缩略图后缀
     */
    private String mThumbExt;

    protected Emotion(IFileStragedy pFileStragedy, IEncoder pEncoder) {
        mFileStragedy = pFileStragedy;
        mEncoder = pEncoder;
    }

    /**
     * 标准表情
     *
     * @return the emotion
     * @author Young
     */
    public static Emotion createEmotion(IFileStragedy pFileStragedy) {
        return new Emotion(pFileStragedy, new Encoder());
    }

    /**
     * Emoji表情
     *
     * @param pFileStragedy the p file stragedy
     * @return the emotion
     * @author Young
     */
    public static Emotion createEmoji(IFileStragedy pFileStragedy) {
        final Emotion emotion = new Emotion(pFileStragedy, new EmojiEncoder());
        return emotion;
    }

    /**
     * 创建
     *
     * @param pFileStragedy the file stragedy
     * @param groupClass    the group class
     * @return the emotion
     * @author Young
     */
    public static Emotion create(IFileStragedy pFileStragedy, Class<? extends Group> groupClass) {
        final IEncoder encoder = (groupClass.equals(EmojiGroup.class)) ? new EmojiEncoder() : new Encoder();
        boolean isPic = (groupClass.equals(PicGroup.class));
        final Emotion emotion = isPic ? new PicEmotion(pFileStragedy, encoder) : new Emotion(pFileStragedy, encoder);
        return emotion;
    }

    public void setGroupDirName(String pGroupDirName) {
        mGroupDirName = pGroupDirName;
    }

    public void setExt(String pExt) {
        mExt = pExt;
    }

    public String getGroupID() {
        return mGroupID;
    }

    public void setGroupID(String pGroupID) {
        mGroupID = pGroupID;
    }

    public String getId() {
        return mId;
    }

    public void setId(String pId) {
        mId = pId;
    }

    public String getFileName() {
        return mFileStragedy.getImagePath(mGroupDirName, mFileName, mThumbExt);
    }

    public void setFileName(String pFileName) {
        mFileName = pFileName;
    }

    /**
     * 编码
     *
     * @return the string
     * @author Young
     */
    public String encode() {
        return mEncoder.encode(mGroupID, String.valueOf(mId));
    }

    /**
     * 序列化
     *
     * @author Young
     */
    public String seriaze() throws IOException {
        return ObjectSerializer.serialize(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Emotion) {
            Emotion e2 = ((Emotion) o);
            if (e2.getGroupID().equals(getGroupID()) && e2.getId().equals(getId())) {
                return true;
            }
        }
        return false;
    }

    public String getThumbExt() {
        return mThumbExt;
    }

    public void setThumbExt(String pThumbExt) {
        mThumbExt = pThumbExt;
    }

    /**
     * 点击事件
     *
     * @param pContext   the p context
     * @param pInputView the p input view
     * @author Young
     */
    public void click(Context pContext, IInputView pInputView) {
        EmotionHandlers.addEmotion(pInputView, this, (int) pInputView.getTextSize(), (int) pInputView.getTextSize());
        EmotionRecentsManager.getInstance(pContext).push(this);
    }
}