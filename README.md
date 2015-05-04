## Preview
<img src="https://raw.githubusercontent.com/eyyoung/EmotionView/master/preview/screenshot.png" alt="Preview" style="width: 320px;height: 480px"/>
## Setup
Add repositories to root(build.gradle) all project
```groovy
repositories {
    jcenter()
    maven {
        url "http://dl.bintray.com/eyyoung/maven"
    }
}
```
Add dependencies to Module
```groovy
compile 'com.young.android.EmotionView:library:1.0.+@aar'
```

## Use

### View

In Xml:

```xml
<com.nd.android.sdp.im.common.emotion.library.view.EmotionView
        android:id="@+id/vEmotion"
        android:layout_below="@id/etInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"></com.nd.android.sdp.im.common.emotion.library.view.EmotionView>
```

Init:

```Java
EmotionView emotionView = (EmotionView) findViewById(R.id.vEmotion);
mInputView = (EmotionEditText) findViewById(R.id.etInput);
emotionView.init(EmotionTypeUtils.ALL_TYPE, new IEmotionEvent() {
      @Override
      public void onEmotionSend(String emotionEncoded) {
          Log.e("TEST", emotionEncoded);
      }
}, mInputView);
```

Use | to choose different support type

### Decode
Use EmotionManager Class to Decode the encoded text
```Java
public Spannable decode(String text, int pTextSize, int pDrawableSize)
```
