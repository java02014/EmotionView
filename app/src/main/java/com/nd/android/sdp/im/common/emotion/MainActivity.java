package com.nd.android.sdp.im.common.emotion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.IEmotionEvent;
import com.nd.android.sdp.im.common.emotion.library.encode.EmojiEncoder;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionTypeUtils;
import com.nd.android.sdp.im.common.emotion.library.view.EmotionEditText;
import com.nd.android.sdp.im.common.emotion.library.view.EmotionView;


public class MainActivity extends ActionBarActivity {

    private EmotionEditText mInputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EmotionView emotionView = (EmotionView) findViewById(R.id.vEmotion);
        mInputView = (EmotionEditText) findViewById(R.id.etInput);
        emotionView.init(EmotionTypeUtils.ALL_TYPE, new IEmotionEvent() {
            @Override
            public void onEmotionSend(String emotionEncoded) {
                Log.e("TEST", emotionEncoded);
            }
        }, mInputView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_second) {
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSend(View view) {
        Log.e("TEST", mInputView.getText().toString());
    }

    public void onDecode(View view) {
        final CharSequence decode = EmotionManager.getInstance().decode("[sys:1003][sys:1002]" + EmojiEncoder.newString(128530) + EmojiEncoder.newString(128527), (int) mInputView.getTextSize(), (int) mInputView.getTextSize());
        mInputView.setText(decode);
    }

    public void onPicDecode(View view) {
        Log.e("TEST", EmotionManager.getInstance().decodePic("[cat:281]"));
        Log.e("TEST", EmotionManager.getInstance().decodePic("[sdcard:1006]"));
        Log.e("TEST", EmotionManager.getInstance().decodePic("[content:1714297]"));
    }

    public void onDecodeNotification(View view) {
        Log.e("TEST", EmotionManager.getInstance().decodeToText(this, "[sys:1012]"));
    }
}
