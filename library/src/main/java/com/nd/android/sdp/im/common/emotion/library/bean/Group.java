package com.nd.android.sdp.im.common.emotion.library.bean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionImageLoader;
import com.nostra13.universalimageloader.core.DisplayImageOptions;

import java.util.HashMap;
import java.util.Map;

/**
 * 表情组
 *
 * @author Young
 */
public abstract class Group implements IGroup {

    protected static DisplayImageOptions sDisplayImageOptions = new DisplayImageOptions.Builder()
            .cacheInMemory(true)
            .cacheOnDisk(true)
            .build();

    private final IFileStragedy mFileStragedy;
    /**
     * 表情
     */
    protected Map<String, Emotion> mEmotions = new HashMap<String, Emotion>();
    /**
     * 表情数组
     */
    protected Emotion[] mEmotionArrays;
    /**
     * ID
     */
    private String mId;
    /**
     * 类型
     */
    private int mType;
    /**
     * 扩展
     */
    private String mExt;
    /**
     * 缩略图扩展名
     */
    private String mThumbExt;
    /**
     * 指示栏图片
     */
    private String mNormalImg;
    /**
     * 点击态
     */
    private String mSelecteddImg;
    /**
     * 顺序
     */
    private int mOrder;
    /**
     * 文件夹名称
     */
    private String mDirName;

    public Group(IFileStragedy pFileStragedy) {
        mFileStragedy = pFileStragedy;
    }

    public String getThumbExt() {
        return mThumbExt;
    }

    public void setThumbExt(String pThumbExt) {
        mThumbExt = pThumbExt;
    }

    public void setDirName(String pDirName) {
        mDirName = pDirName;
    }

    public Emotion[] getEmotionArrays() {
        return mEmotionArrays;
    }

    public void setEmotionArrays(Emotion[] pEmotionArrays) {
        mEmotionArrays = pEmotionArrays;
    }

    public String getSelecteddImg() {
        return mFileStragedy.getImagePath(mDirName, mSelecteddImg, mThumbExt);
    }

    public void setSelecteddImg(String pSelecteddImg) {
        mSelecteddImg = pSelecteddImg;
    }

    public String getExt() {
        return mExt;
    }

    ;

    public void setExt(String pExt) {
        mExt = pExt;
    }

    public Map<String, Emotion> getEmotions() {
        return mEmotions;
    }

    public void addEmotion(String id, Emotion pEmotions) {
        mEmotions.put(id, pEmotions);
    }

    public String getId() {
        return mId;
    }

    public void setId(String pId) {
        mId = pId;
    }

    public int getType() {
        return mType;
    }

    public void setType(int pType) {
        mType = pType;
    }

    public String getNormalImg() {
        return mFileStragedy.getImagePath(mDirName, mNormalImg, mThumbExt);
    }

    public void setNormalImg(String pNormalImg) {
        mNormalImg = pNormalImg;
    }

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int pOrder) {
        mOrder = pOrder;
    }

    @Override
    public int getPageCount() {
        if (mEmotionArrays == null) {
            return 1;
        }
        return (int) Math.ceil((float) mEmotionArrays.length / (float) (getColumn() * getRow() - 1));
    }

    @Override
    public int getEmotionCount(int page) {
        final int size = mEmotions.keySet().size();
        if ((page + 1) * (getColumn() * getRow() - 1) <= size) {
            return getRow() * getColumn();
        } else {
            return size - (page) * (getColumn() * getRow() - 1) + 1;
        }
    }

    @Override
    public View getGridView(Context pContext, int pPosition, int pWidth, View.OnClickListener pOnClickListener) {
        final LayoutInflater inflater = LayoutInflater.from(pContext);
        FrameLayout view = (FrameLayout) inflater.inflate(R.layout.pager_emotion, null);
        TableLayout tableLayout = (TableLayout) view.getChildAt(0);
        final int emotionCount = getEmotionCount(pPosition);
        final int row = (int) Math.ceil((float) emotionCount / (float) getColumn());
        for (int i = 0; i < row; i++) {
            TableRow tableRow = new TableRow(pContext);
            final int column = i < (row - 1) ? getColumn() : ((emotionCount - 1) % getColumn() + 1);
            for (int j = 0; j < column; j++) {
                final LinearLayout inflate = (LinearLayout) inflater.inflate(R.layout.emotion_view_item_emotion, null);
                final ImageView emotionView = (ImageView) inflate.getChildAt(0);
                final Emotion emotion = getEmotion(pPosition, i * getColumn() + j);
                EmotionImageLoader.getInstance().displayImage(emotion.getThumbFileName(), emotionView, sDisplayImageOptions);
                inflate.setOnClickListener(pOnClickListener);
                tableRow.addView(inflate);
                final TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) inflate.getLayoutParams();
                layoutParams.width = pWidth / getColumn();
                inflate.setLayoutParams(layoutParams);
                inflate.setTag(emotion);
            }
            tableLayout.addView(tableRow);
        }
        return view;
    }

    @Override
    public Emotion getEmotion(int page, int position) {
        if (position >= 0 && position < getEmotionCount(page) - 1) {
            return mEmotionArrays[page * (getColumn() * getRow() - 1) + position];
        } else {
            return new BackspaceEmotion();
        }
    }
}
