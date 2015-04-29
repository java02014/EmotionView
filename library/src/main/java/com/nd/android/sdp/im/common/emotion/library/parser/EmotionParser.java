package com.nd.android.sdp.im.common.emotion.library.parser;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;

import com.nd.android.sdp.im.common.emotion.library.bean.EmojiGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.PicGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.SysGroup;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Young on 2015/4/27.
 */
public class EmotionParser implements IEmotionParser {

    public static final String SYS_TAG = "sys";

    @Override
    public Group parse(Context pContext, String pDirName, IFileStragedy pFileStragedy) {
        try {
            final InputStream inputStream = pFileStragedy.getConfigStream(pContext, pDirName);
            XmlPullParser xrp = Xml.newPullParser();
            xrp.setInput(inputStream, "UTF-8");
            Group group = null;
            ArrayList<Emotion> emotionArrayList = new ArrayList<Emotion>();
            while (xrp.getEventType() != XmlPullParser.END_DOCUMENT) {
                if (xrp.getEventType() == XmlResourceParser.START_TAG) {
                    String tagName = xrp.getName();
                    if (tagName.equals("group")) {
                        final String id = xrp.getAttributeValue(null, "id");
                        if (id.equals(SYS_TAG)) {
                            group = new SysGroup(pFileStragedy);
                            group.setId("sys");
                        } else if (id.equals("e")) {
                            group = new EmojiGroup(pFileStragedy);
                            group.setId("e");
                        } else {
                            group = new PicGroup(pFileStragedy);
                            group.setId(xrp.getAttributeValue(null, "id"));
                        }
                        group.setNormalImg(xrp.getAttributeValue(null, "normal_img"));
                        group.setSelecteddImg(xrp.getAttributeValue(null, "selected_img"));
                        group.setType(xrp.getAttributeValue(null, "type"));
                        group.setExt(xrp.getAttributeValue(null, "ext"));
                        group.setThumbExt("png");
                        group.setDirName(pDirName);
                        group.setOrder(Integer.parseInt(xrp.getAttributeValue(null, "order")));
                    } else if (tagName.equals("smiley")) {
                        Emotion emotion = Emotion.create(pFileStragedy, group.getClass());
                        emotion.setId(xrp.getAttributeValue(null, "id"));
                        emotion.setFileName(xrp.getAttributeValue(null, "filename"));
                        emotion.setGroupID(group.getId());
                        emotion.setGroupDirName(pDirName);
                        group.addEmotion(emotion.getId(), emotion);
                        emotion.setExt(group.getExt());
                        emotion.setThumbExt("png");
                        emotionArrayList.add(emotion);
                    }
                }
                xrp.next();
            }
            group.setEmotionArrays(emotionArrayList.toArray(new Emotion[emotionArrayList.size()]));
            return group;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        return null;
    }
}