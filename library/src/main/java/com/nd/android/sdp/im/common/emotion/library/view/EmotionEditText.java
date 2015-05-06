package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewDebug;
import android.widget.EditText;

import com.nd.android.sdp.im.common.emotion.library.EmotionHandlers;
import com.nd.android.sdp.im.common.emotion.library.utils.CopyCompbat;

/**
 * Created by Young on 2015/4/23.
 */
public class EmotionEditText extends EditText implements IInputView {

    public EmotionEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmotionEditText(Context context) {
        super(context);
    }

    @Override
    public void onBackSpace() {
        dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
    }

    @Override
    public void setSelection(Pair<Integer, Integer> pSelectionPair) {
        setSelection(pSelectionPair.first, pSelectionPair.second);
    }

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        EmotionHandlers.updateEmotions((Spannable) text, (int) getTextSize(), (int) getTextSize());
    }

    @Override
    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionEnd() {
        return CopyCompbat.getSelectionEndCompbat(this);
    }

}
