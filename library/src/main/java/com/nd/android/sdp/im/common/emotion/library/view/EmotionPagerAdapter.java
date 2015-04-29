package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.GridLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nd.android.sdp.im.common.emotion.library.bean.IGroup;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Young on 2015/4/23.
 */
public class EmotionPagerAdapter extends PagerAdapter {

    private final Context mContext;
    private IGroup mGroup;

    /**
     * 初始化
     *
     * @param pContext 上下文
     * @param pGroup   分组
     */
    public EmotionPagerAdapter(Context pContext, IGroup pGroup) {
        mContext = pContext;
        mGroup = pGroup;
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
        View view = mGroup.getGridView(mContext, position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
