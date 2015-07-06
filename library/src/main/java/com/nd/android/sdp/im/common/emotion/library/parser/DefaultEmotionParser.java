package com.nd.android.sdp.im.common.emotion.library.parser;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;

import com.nd.android.sdp.im.common.emotion.library.bean.EmojiGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.PicGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.TextPicGroup;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.stragedy.files.IFileStragedy;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionTypeUtils;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

/**
 * 默认解析器
 *
 * @author Young
 */
public class DefaultEmotionParser implements IEmotionParser {

    public static final String SYS_TAG = "sys";

    private IFileStragedy mFileStragedy;

    /**
     * 构造器
     *
     * @param pFileStragedy the p config file stragedy
     */
    public DefaultEmotionParser(IFileStragedy pFileStragedy) {
        mFileStragedy = pFileStragedy;
    }

    @Override
    public Group parse(Context pContext, String pDirName, IConfigFileStragedy pFileStragedy) {
        try {
            final InputStream inputStream = pFileStragedy.getConfig();
            if (inputStream == null) {
                return null;
            }
            IFileStragedy fileStragedy = mFileStragedy;
            XmlPullParser xrp = Xml.newPullParser();
            xrp.setInput(inputStream, "UTF-8");
            Group group = null;
            Emotion lastEmotion = null;
            ArrayList<Emotion> emotionArrayList = new ArrayList<Emotion>();
            while (xrp.getEventType() != XmlPullParser.END_DOCUMENT) {
                if (xrp.getEventType() == XmlResourceParser.START_TAG) {
                    String tagName = xrp.getName();
                    if (tagName.equals("group")) {
                        final String type = xrp.getAttributeValue(null, "type");
                        if (EmotionTypeUtils.TEXT_PIC_STR.equals(type)) {
                            group = new TextPicGroup(fileStragedy);
                        } else if (EmotionTypeUtils.EMOJI_STR.equals(type)) {
                            group = new EmojiGroup(fileStragedy);
                        } else {
                            group = new PicGroup(fileStragedy);
                        }
                        final String id = xrp.getAttributeValue(null, "id");
                        group.setId(id);
                        group.setNormalImg(xrp.getAttributeValue(null, "normal_img"));
                        group.setSelecteddImg(xrp.getAttributeValue(null, "selected_img"));
                        group.setType(EmotionTypeUtils.strToInt(type));
                        group.setExt(xrp.getAttributeValue(null, "ext"));
                        group.setThumbExt("png");
                        group.setDirName(pDirName);
                        group.setOrder(Integer.parseInt(xrp.getAttributeValue(null, "order")));
                    } else if (tagName.equals("smiley")) {
                        Emotion emotion = Emotion.create(fileStragedy, group.getClass());
                        emotion.setId(xrp.getAttributeValue(null, "id"));
                        emotion.setFileName(xrp.getAttributeValue(null, "filename"));
                        emotion.setGroupID(group.getId());
                        emotion.setGroupDirName(pDirName);
                        group.addEmotion(emotion.getId(), emotion);
                        emotion.setExt(group.getExt());
                        emotion.setThumbExt("png");
                        emotionArrayList.add(emotion);
                        lastEmotion = emotion;
                    } else if (tagName.equalsIgnoreCase("def")) {
                        lastEmotion.putLangText(Locale.ENGLISH, xrp.nextText().trim());
                    } else if (tagName.equalsIgnoreCase("cn")) {
                        lastEmotion.putLangText(Locale.CHINA, xrp.nextText().trim());
                    } else if (tagName.equalsIgnoreCase("tw")) {
                        lastEmotion.putLangText(Locale.TAIWAN, xrp.nextText().trim());
                    } else if (tagName.equalsIgnoreCase("en")) {
                        lastEmotion.putLangText(Locale.ENGLISH, xrp.nextText().trim());
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
