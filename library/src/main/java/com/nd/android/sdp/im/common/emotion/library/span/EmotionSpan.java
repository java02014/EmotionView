package com.nd.android.sdp.im.common.emotion.library.span;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionImageLoader;
import com.nostra13.universalimageloader.core.DisplayImageOptions;

import java.lang.ref.WeakReference;

/**
 * Created by Young on 2015/4/27.
 */
public class EmotionSpan extends DynamicDrawableSpan {

    private static DisplayImageOptions sOptions = new DisplayImageOptions.Builder()
            .cacheInMemory(true)
            .build();

    private final Emotion mEmotion;
    private final int mSize;
    private final int mTextSize;
    private int mWidth;
    private int mHeight;
    private Drawable mDrawable;
    private WeakReference<Drawable> mDrawableRef;
    private int mTop;

    public EmotionSpan(Emotion pEmotion, int pSize, int pTextSize) {
        super(DynamicDrawableSpan.ALIGN_BASELINE);
        mEmotion = pEmotion;
        mWidth = mHeight = mSize = pSize + 8;
        mTextSize = pTextSize;
    }

    /**
     * Gets emotion.
     *
     * @return the emotion
     */
    public Emotion getEmotion() {
        return mEmotion;
    }

    @Override
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (fm != null) {
            fm.ascent = -mSize;
            fm.descent = 0;

            fm.top = fm.ascent;
            fm.bottom = 0;
        }

        return mSize;
    }

    @Override
    public Drawable getDrawable() {
        if (mDrawable == null) {
            try {
                final Bitmap bitmap = EmotionImageLoader.getInstance().loadImageSync(mEmotion.getThumbFileName(), sOptions);
                mHeight = mSize;
                mWidth = mHeight * bitmap.getWidth() / bitmap.getHeight();
                mTop = (mTextSize - mHeight) / 2;
                mDrawable = new BitmapDrawable(bitmap);
                mDrawable.setBounds(0, mTop, mWidth, mTop + mHeight);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mDrawable;
    }

    @Override
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        //super.draw(canvas, text, start, end, x, top, y, bottom, paint);
        Drawable b = getCachedDrawable();
        if (b == null) {
            return;
        }
        canvas.save();

        int transY = bottom - b.getBounds().bottom;
        if (mVerticalAlignment == ALIGN_BASELINE) {
            transY = top + ((bottom - top) / 2) - ((b.getBounds().bottom - b.getBounds().top) / 2) - mTop;
        }

        canvas.translate(x, transY);
        b.draw(canvas);
        canvas.restore();
    }


    private Drawable getCachedDrawable() {
        if (mDrawableRef == null
                || mDrawableRef.get() == null
                || (((BitmapDrawable) mDrawableRef.get()).getBitmap()) == null
                || (((BitmapDrawable) mDrawableRef.get()).getBitmap()).isRecycled()) {
            mDrawable = null;
            mDrawableRef = new WeakReference<>(getDrawable());
        }
        return mDrawableRef.get();
    }
}
