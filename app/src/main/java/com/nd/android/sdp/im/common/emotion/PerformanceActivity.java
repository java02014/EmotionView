package com.nd.android.sdp.im.common.emotion;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.encode.EmojiEncoder;


public class PerformanceActivity extends ActionBarActivity {

    private TextView mInputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);
        mInputView = ((TextView) findViewById(R.id.tvPerformance));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_performance, menu);
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

        return super.onOptionsItemSelected(item);
    }

    public void onDecodeNotification(View view) {
        final CharSequence decode = EmotionManager.getInstance().decodeToText(this, "[sys:1003][sys:1002]" + EmojiEncoder.newString(128530) + EmojiEncoder.newString(128527));


        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_NO_CREATE);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        final Notification notification = new NotificationCompat.Builder(this)
//                .setSmallIcon(R.drawable.ic_launcher)
                .setContentText(decode)
                .setContentTitle("表情测试")
                .setContentIntent(pi)
                .setAutoCancel(true)
                .build();
        mNotificationManager.notify(0, notification);
    }

    public void onDecodePerformance(View view) {
        final long now = System.currentTimeMillis();
        Log.d("MainActivity", "System.currentTimeMillis():" + now);
        final CharSequence decode = EmotionManager.getInstance().decode("[sys:1004][sys:1005][sys:1006][sys:1007][sys:1013][sys:1011][sys:1010][sys:1009][sys:1001][sys:1002][sys:1011][sys:1012][sys:1012][sys:1010][sys:1009][sys:1009][sys:1009][sys:1008][sys:1010][sys:1013][sys:1013][sys:1005][sys:1011][sys:1010][sys:1010][sys:1009][sys:1009][sys:1010][sys:1013][sys:1020][sys:1020][sys:1011][sys:1011][sys:1010][sys:1010][sys:1017][sys:1016][sys:1032][sys:1032][sys:1025][sys:1024][sys:1030][sys:1036][sys:1038][sys:1040][sys:1026][sys:1027][sys:1034][sys:1025][sys:1025]", (int) mInputView.getTextSize(), (int) mInputView.getTextSize());
        final long newNow = System.currentTimeMillis();
        Log.e("MainActivity", (newNow - now) + "");
        Log.d("MainActivity", "System.currentTimeMillis():" + newNow);
        mInputView.setText(decode);
    }
}
