package com.nd.android.sdp.im.common.emotion.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;

import com.nd.android.sdp.im.common.emotion.library.EmotionHandlers;
import com.nd.android.sdp.im.common.emotion.library.utils.CopyCompbat;

/**
 * EditText默认实现
 */
public class EmotionEditText extends EditText implements IInputView, View.OnCreateContextMenuListener {

    private boolean mIsPaste;

    public EmotionEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnCreateContextMenuListener(this);
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
        try {
            setSelection(pSelectionPair.first, pSelectionPair.second);
        } catch (IndexOutOfBoundsException e) {
            setSelection(getText().toString().length());
        }
    }

    @Override
    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionEnd() {
        return CopyCompbat.getSelectionEndCompbat(this);
    }

    @Override
    protected void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        CopyCompbat.onSelectionChangeCombat(this, selStart, selEnd);
    }

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (mIsPaste) {
            EmotionHandlers.updateEmotions(getEditableText(), (int) getTextSize(), (int) getTextSize());
            mIsPaste = false;
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        mIsPaste = true;
    }
}
