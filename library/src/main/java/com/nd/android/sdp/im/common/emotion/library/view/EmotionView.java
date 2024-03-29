package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.EmotionRecentsManager;
import com.nd.android.sdp.im.common.emotion.library.IEmotionEvent;
import com.nd.android.sdp.im.common.emotion.library.IEmotionEventV2;
import com.nd.android.sdp.im.common.emotion.library.R;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.PicEmotion;
import com.nd.android.sdp.im.common.emotion.library.parser.DefaultEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionImageLoader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * 表情控件
 *
 * @author Young
 */
public class EmotionView extends LinearLayout implements CompoundButton.OnCheckedChangeListener, ViewPager.OnPageChangeListener {

    private static final int GROUP_WEIGHT_SUM = 5;
    private final RadioGroup mRbGroup;
    private ViewPager mVpEmotion;
    private LinearLayout mLlGroup;
    private Context mContext;
    private IEmotionEvent mEmotionEvent;
    private IEmotionEventV2 mEmotionEventV2;

    private int mScreenWidth;

    private List<Bitmap> mToRecycleBitmap = new ArrayList<Bitmap>();
    private Map<String, Group> mEmotionGroups;
    private IInputView mInputView;
    private Subscription mSubscription;

    /**
     * 构造表情控件
     *
     * @param context the context
     * @param attrs   the attrs
     */
    public EmotionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setOrientation(VERTICAL);
        inflate(context, R.layout.emtioin_view, this);

        mVpEmotion = (ViewPager) findViewById(R.id.vpEmotion);
        mLlGroup = (LinearLayout) findViewById(R.id.llGroup);
        mRbGroup = (RadioGroup) findViewById(R.id.rgDot);

        mScreenWidth = mContext.getResources().getDisplayMetrics().widthPixels;

        mVpEmotion.setOnPageChangeListener(this);

    }

    /**
     * 初始化操作
     *
     * @param pEmotionTypes 表情类型
     * @param pEmotionEvent 表情事件
     * @param pInputView    输入输出控件
     * @author Young
     */
    @Deprecated
    public void init(final int pEmotionTypes, IEmotionEvent pEmotionEvent, IInputView pInputView) {
        init(pEmotionTypes, pEmotionEvent, pInputView, mScreenWidth);
    }

    /**
     * 初始化操作
     *
     * @param pEmotionTypes 表情类型
     * @param pEmotionEvent 表情事件
     * @param pInputView    输入输出控件
     * @param pWidth
     * @author Young
     */
    @Deprecated
    public void init(final int pEmotionTypes, IEmotionEvent pEmotionEvent, IInputView pInputView, final int pWidth) {
        mInputView = pInputView;
        mEmotionEvent = pEmotionEvent;
        init(pEmotionTypes, pWidth);
    }

    /**
     * 使用新版回调，选择图片可传回宽度高度，文件大小
     *
     * @param pEmotionTypes 支持表情类型
     * @param pEmotionEvent 回调
     * @param pInputView    输入 控件
     * @author Young
     */
    public void init(final int pEmotionTypes, IEmotionEventV2 pEmotionEvent, IInputView pInputView) {
        init(pEmotionTypes, pEmotionEvent, pInputView, mScreenWidth);
    }

    /**
     * 使用新版回调，选择图片可传回宽度高度，文件大小
     *
     * @param pEmotionTypes 支持表情类型
     * @param pEmotionEvent 回调
     * @param pInputView    输入控件
     * @param pWidth        控件宽度
     * @author Young
     */
    public void init(final int pEmotionTypes, IEmotionEventV2 pEmotionEvent, IInputView pInputView, final int pWidth) {
        mInputView = pInputView;
        mEmotionEventV2 = pEmotionEvent;
        init(pEmotionTypes, pWidth);
    }

    private void init(final int pEmotionTypes, final int pWidth) {
        mSubscription = Observable.create(new Observable.OnSubscribe<Object>() {
            @Override
            public void call(Subscriber<? super Object> pSubscriber) {
                EmotionManager.getInstance().initData(mContext);
                final Map<String, Group> emotionGroups = EmotionManager.getInstance().getGroups(pEmotionTypes);
                if (emotionGroups != null) {
                    pSubscriber.onNext(emotionGroups);
                } else {
                    pSubscriber.onError(new Throwable(mContext.getString(R.string.emotion_view_get_config_error)));
                }
                pSubscriber.onCompleted();
            }
        }).filter(new Func1<Object, Boolean>() {
            @Override
            public Boolean call(Object pResult) {
                return pResult != null && !((Map<String, Group>) pResult).isEmpty();
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object pResult) {
                        mEmotionGroups = (Map<String, Group>) pResult;
                        Group defaultGroup = mEmotionGroups.get(DefaultEmotionParser.SYS_TAG);
                        if (defaultGroup == null) {
                            final Iterator<Group> iterator = mEmotionGroups.values().iterator();
                            defaultGroup = iterator.next();
                        }
                        mVpEmotion.setAdapter(new EmotionPagerAdapter(mContext, defaultGroup, pWidth, new OnEmotionClick()));
                        EmotionView.this.initGroupBtn(pWidth);
                        EmotionView.this.initDot();
                        EmotionView.this.setSelectGroupBtn(defaultGroup);
                        // 获取到表情
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable pError) {
                        pError.printStackTrace();
                        Toast.makeText(mContext, pError.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }, new Action0() {
                    @Override
                    public void call() {

                    }
                });
    }

    private void setSelectGroupBtn(Group pGroup) {
        int i = 0;
        for (Group group : mEmotionGroups.values()) {
            if (group == pGroup) {
                break;
            }
            i++;
        }
        mLlGroup.getChildAt(i).setSelected(true);
    }

    private void initDot() {
        mRbGroup.removeAllViews();
        final PagerAdapter adapter = mVpEmotion.getAdapter();
        final int count = adapter.getCount();
        final int padding = dp2Px(mContext, 3);
        final int size = dp2Px(mContext, 10);
        for (int i = 0; i < count; i++) {
            RadioButton radioButton = new RadioButton(mContext);
            radioButton.setOnCheckedChangeListener(this);
            radioButton.setButtonDrawable(R.drawable.emotion_view_dot);
            final RadioGroup.LayoutParams params = new RadioGroup.LayoutParams(size, size);
            params.rightMargin = padding;
            params.leftMargin = padding;
            mRbGroup.addView(radioButton, params);
        }
        final int currentItem = mVpEmotion.getCurrentItem();
        checkRadioGroup(currentItem);
    }

    private void checkRadioGroup(int pCurrentItem) {
        final View rb = mRbGroup.getChildAt(pCurrentItem);
        if (rb != null) {
            ((RadioButton) rb).setChecked(true);
        }
    }

    public static int dp2Px(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }


    /**
     * 初始化表情分组列表
     *
     * @param pWdith 宽度
     */
    private void initGroupBtn(int pWdith) {
        int padding = mContext.getResources().getDimensionPixelSize(R.dimen.emotion_view_group_image_padding);
        final int size = mEmotionGroups.keySet().size();
        int groupWeightSum = size > GROUP_WEIGHT_SUM ? GROUP_WEIGHT_SUM : size;
        for (String id : mEmotionGroups.keySet()) {
            ImageView imageView = new ImageView(mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pWdith / groupWeightSum, ViewGroup.LayoutParams.MATCH_PARENT);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(padding, padding, padding, padding);
            mLlGroup.addView(imageView, layoutParams);
            int pressed = android.R.attr.state_pressed;
            final Group emotionGroup = mEmotionGroups.get(id);
            final Bitmap normalBitmap = EmotionImageLoader.getInstance().loadImageSync(emotionGroup.getNormalImg());
            BitmapDrawable normalDrawable = new BitmapDrawable(normalBitmap);
            mToRecycleBitmap.add(normalBitmap);
            final Bitmap pressedBitmap = EmotionImageLoader.getInstance().loadImageSync(emotionGroup.getSelecteddImg());
            BitmapDrawable pressedDrawable = new BitmapDrawable(pressedBitmap);
            StateListDrawable stateListDrawable = new StateListDrawable();
            mToRecycleBitmap.add(pressedBitmap);

            normalDrawable.setBounds(0, 0, normalBitmap.getWidth(), normalBitmap.getHeight());
            pressedDrawable.setBounds(0, 0, pressedBitmap.getWidth(), pressedBitmap.getHeight());
            stateListDrawable.addState(new int[]{pressed}, pressedDrawable);
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, pressedDrawable);
            stateListDrawable.addState(new int[]{}, normalDrawable);
            imageView.setImageDrawable(stateListDrawable);
            imageView.setOnClickListener(mOnGroupClick);
            imageView.setBackgroundResource(R.drawable.emotion_view_bg_group);
            imageView.setTag(id);
        }
    }

    private OnClickListener mOnGroupClick = new OnClickListener() {
        @Override
        public void onClick(View v) {
            final Group group = mEmotionGroups.get(v.getTag());
            mVpEmotion.setAdapter(new EmotionPagerAdapter(mContext, group, getWidth(), new OnEmotionClick()));
            EmotionView.this.initDot();
            final int childCount = mLlGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                final View view = mLlGroup.getChildAt(i);
                view.setSelected(false);
            }
            v.setSelected(true);
        }
    };

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Bitmap bitmap : mToRecycleBitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }

        if (mSubscription != null) {
            mSubscription.unsubscribe();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            final int indexOfChild = mRbGroup.indexOfChild(buttonView);
            mVpEmotion.setCurrentItem(indexOfChild);
        }
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        checkRadioGroup(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private class OnEmotionClick implements OnClickListener {
        @Override
        public void onClick(View v) {
            final Emotion emotion = (Emotion) v.getTag();
            if ((emotion instanceof PicEmotion)) {
                if (mEmotionEvent != null) {
                    mEmotionEvent.onEmotionSend(emotion.encode());
                }
                if (mEmotionEventV2 != null) {
                    int width = 0;
                    int height = 0;
                    final Bitmap bitmap = EmotionImageLoader.getInstance().loadImageSync(emotion.getFileName());
                    if (bitmap != null) {
                        width = bitmap.getWidth();
                        height = bitmap.getHeight();
                    }
                    mEmotionEventV2.onEmotionSend(emotion.encode(), width, height, emotion.getFileSize(mContext));
                }
                EmotionRecentsManager.getInstance(mContext).push(emotion);
            } else {
                emotion.click(mContext, mInputView);
            }
        }
    }
}
