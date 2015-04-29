package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.nd.android.sdp.im.common.emotion.library.EmotionHandlers;
import com.nd.android.sdp.im.common.emotion.library.EmotionModule;
import com.nd.android.sdp.im.common.emotion.library.EmotionRecentsManager;
import com.nd.android.sdp.im.common.emotion.library.IEmotionEvent;
import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.bean.BackspaceEmotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.PicEmotion;
import com.nd.android.sdp.im.common.emotion.library.bean.RecentGroup;
import com.nd.android.sdp.im.common.emotion.library.getter.IEmotionGetter;
import com.nd.android.sdp.im.common.emotion.library.parser.EmotionParser;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 表情控件
 *
 * @author Young
 */
public class EmotionView extends LinearLayout implements OnItemClickListener {

    private static final int GROUP_WEIGHT_SUM = 5;
    private ViewPager mVpEmotion;
    private LinearLayout mLlGroup;
    private Context mContext;
    private IEmotionEvent mEmotionEvent;

    private int mScreenWidth;

    private List<Bitmap> mToRecycleBitmap = new ArrayList<Bitmap>();
    private Map<String, Group> mEmotionGroups;
    private IInputView mInputView;

    /**
     * 构造表情控件
     *
     * @param context the context
     * @param attrs   the attrs
     */
    public EmotionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!ImageLoader.getInstance().isInited() && !isInEditMode()) {
            ImageLoaderConfiguration config = new ImageLoaderConfiguration
                    .Builder(context)
                    .threadPriority(Thread.NORM_PRIORITY - 2)
                    .denyCacheImageMultipleSizesInMemory()
                    .discCacheFileNameGenerator(new Md5FileNameGenerator())
                    .memoryCache(new WeakMemoryCache())
                    .tasksProcessingOrder(QueueProcessingType.LIFO).build();
            ImageLoader.getInstance().init(config);
        }
        mContext = context;
        setOrientation(VERTICAL);
        inflate(context, R.layout.emtioin_view, this);

        mVpEmotion = (ViewPager) findViewById(R.id.vpEmotion);
        mLlGroup = (LinearLayout) findViewById(R.id.llGroup);

        mScreenWidth = mContext.getResources().getDisplayMetrics().widthPixels;
    }

    /**
     * 初始化操作
     *
     * @param pEmotionTypes 表情类型
     * @param pEmotionEvent 表情事件
     * @param pInputView    输入输出控件
     * @author Young
     */
    public void init(int pEmotionTypes, IEmotionEvent pEmotionEvent, IInputView pInputView) {
        mInputView = pInputView;
        mEmotionEvent = pEmotionEvent;
        Observable.create(pSubscriber -> {
            final IEmotionGetter emotionGetter = EmotionModule.getInstance().getEmotionGetter();
            final Map<String, Group> emotionGroups = emotionGetter.getEmotionGroups(mContext, pEmotionTypes);
            if (emotionGroups != null) {
                pSubscriber.onNext(emotionGroups);
            } else {
                pSubscriber.onError(new Throwable(mContext.getString(R.string.emotion_view_get_config_error)));
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(pResult -> {
                    mEmotionGroups = (Map<String, Group>) pResult;
                    mVpEmotion.setAdapter(new EmotionPagerAdapter(mContext, mEmotionGroups.get(EmotionParser.SYS_TAG)));
                    // 获取到表情
                    initGroupBtn();
                }, pError -> {
                    pError.printStackTrace();
                    Toast.makeText(mContext, pError.getMessage(), Toast.LENGTH_LONG).show();
                }, () -> {

                });
    }

    /**
     * 初始化表情分组列表
     */
    private void initGroupBtn() {
        for (String id : mEmotionGroups.keySet()) {
            ImageView imageView = new ImageView(mContext);
            LayoutParams layoutParams = new LayoutParams(mScreenWidth / GROUP_WEIGHT_SUM, ViewGroup.LayoutParams.MATCH_PARENT);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            mLlGroup.addView(imageView, layoutParams);
            int pressed = android.R.attr.state_pressed;
            final Group emotionGroup = mEmotionGroups.get(id);
            final Bitmap normalBitmap = ImageLoader.getInstance().loadImageSync(emotionGroup.getNormalImg());
            BitmapDrawable normalDrawable = new BitmapDrawable(normalBitmap);
            mToRecycleBitmap.add(normalBitmap);
            final Bitmap pressedBitmap = ImageLoader.getInstance().loadImageSync(emotionGroup.getSelecteddImg());
            BitmapDrawable pressedDrawable = new BitmapDrawable(pressedBitmap);
            StateListDrawable stateListDrawable = new StateListDrawable();
            mToRecycleBitmap.add(pressedBitmap);

            normalDrawable.setBounds(0, 0, normalBitmap.getWidth(), normalBitmap.getHeight());
            pressedDrawable.setBounds(0, 0, pressedBitmap.getWidth(), pressedBitmap.getHeight());
            stateListDrawable.addState(new int[]{pressed}, pressedDrawable);
            stateListDrawable.addState(new int[]{}, normalDrawable);
            imageView.setImageDrawable(stateListDrawable);
            imageView.setOnClickListener(mOnGroupClick);
            imageView.setTag(id);

            emotionGroup.setListener(this);
        }
    }

    private OnClickListener mOnGroupClick = v -> {
        final Group group = mEmotionGroups.get(v.getTag());
        if (group instanceof RecentGroup) {
            ((RecentGroup) group).refresh(mContext);
        }
        mVpEmotion.setAdapter(new EmotionPagerAdapter(mContext, group));
    };

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Bitmap bitmap : mToRecycleBitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    @Override
    public void onItemClick(Emotion pEmotion) {
        if ((pEmotion instanceof PicEmotion)) {
            if (mEmotionEvent != null) {
                mEmotionEvent.onEmotionSend(pEmotion.encode());
            }
        } else {
            pEmotion.click(mContext, mInputView);
        }
    }

}
