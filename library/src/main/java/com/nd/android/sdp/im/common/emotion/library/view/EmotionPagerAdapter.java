package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.nd.android.sdp.im.common.emotion.library.bean.IGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.RecentGroup;

/**
 * Created by Young on 2015/4/23.
 */
public class EmotionPagerAdapter extends PagerAdapter {

    private final Context mContext;
    private IGroup mGroup;
    private final int mWidth;
    private View.OnClickListener mOnItemClickListener;

    /**
     * 初始化
     *
     * @param pContext         上下文
     * @param pGroup           分组
     * @param pWidth           控件宽度
     * @param pOnClickListener 表情点击事件（TAG为表情）
     */
    public EmotionPagerAdapter(Context pContext,
                               IGroup pGroup,
                               int pWidth,
                               View.OnClickListener pOnClickListener) {
        mContext = pContext;
        mGroup = pGroup;
        mWidth = pWidth;
        if (mGroup instanceof RecentGroup) {
            ((RecentGroup) mGroup).refresh(pContext);
        }
        mOnItemClickListener = pOnClickListener;
    }

    @Override
    public int getCount() {
        final int pageCount = mGroup.getPageCount();
        return pageCount == 0 ? 1 : pageCount;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = mGroup.getGridView(mContext, position, mWidth, mOnItemClickListener);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
