package com.nd.android.sdp.im.common.emotion.library;

import android.content.Context;
import android.content.SharedPreferences;

import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.utils.ObjectSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 * 最近列表
 *
 * @author Young
 */
public class EmotionRecentsManager extends ArrayList<Emotion> {
    private static final String DELIMITER = ",";
    private static final String PREFERENCE_NAME = "emojicon";
    private static final String PREF_RECENTS = "recent_emojis";
    private static final String PREF_PAGE = "recent_page";


    private static final Object LOCK = new Object();
    private static EmotionRecentsManager sInstance;
    private static int maximumSize = 40;


    private Context mContext;


    private EmotionRecentsManager(Context context) {
        mContext = context.getApplicationContext();
        try {
            loadRecents();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static EmotionRecentsManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                if (sInstance == null) {
                    sInstance = new EmotionRecentsManager(context);
                }
            }
        }
        return sInstance;
    }


    public int getRecentPage() {
        return getPreferences().getInt(PREF_PAGE, 0);
    }


    public void setRecentPage(int page) {
        getPreferences().edit().putInt(PREF_PAGE, page).commit();
    }


    public void push(Emotion object) {
        // FIXME totally inefficient way of adding the emoji to the adapter 
        // TODO this should be probably replaced by a deque 
        if (contains(object)) {
            super.remove(object);
        }
        add(0, object);
    }


    @Override
    public boolean add(Emotion object) {
        boolean ret = super.add(object);


        while (this.size() > EmotionRecentsManager.maximumSize) {
            super.remove(0);
        }


        try {
            saveRecents();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }


    @Override
    public void add(int index, Emotion object) {
        super.add(index, object);


        if (index == 0) {
            while (this.size() > EmotionRecentsManager.maximumSize) {
                super.remove(EmotionRecentsManager.maximumSize);
            }
        } else {
            while (this.size() > EmotionRecentsManager.maximumSize) {
                super.remove(0);
            }
        }


        try {
            saveRecents();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean remove(Object object) {
        boolean ret = super.remove(object);
        try {
            saveRecents();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }


    private SharedPreferences getPreferences() {
        return mContext.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }


    private void loadRecents() throws IOException, ClassNotFoundException {
        SharedPreferences prefs = getPreferences();
        String str = prefs.getString(PREF_RECENTS, "");
        StringTokenizer tokenizer = new StringTokenizer(str, EmotionRecentsManager.DELIMITER);
        while (tokenizer.hasMoreTokens()) {
            final Emotion deserialize = (Emotion) ObjectSerializer.deserialize(tokenizer.nextToken());
            add(deserialize);
        }
    }


    private void saveRecents() throws IOException {
        StringBuilder str = new StringBuilder();
        int c = size();
        for (int i = 0; i < c; i++) {
            Emotion e = get(i);
            str.append(e.seriaze());
            if (i < (c - 1)) {
                str.append(EmotionRecentsManager.DELIMITER);
            }
        }
        SharedPreferences prefs = getPreferences();
        prefs.edit().putString(PREF_RECENTS, str.toString()).commit();
    }


    public static void setMaximumSize(int maximumSize) {
        EmotionRecentsManager.maximumSize = maximumSize;
    }
} 