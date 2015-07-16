package com.nd.android.sdp.im.common.emotion.library.getter;

import com.nd.android.sdp.im.common.emotion.library.EmotionManager;
import com.nd.android.sdp.im.common.emotion.library.bean.EmojiGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.Emotion;
import com.nd.android.sdp.im.common.emotion.library.bean.Group;
import com.nd.android.sdp.im.common.emotion.library.bean.PicGroup;
import com.nd.android.sdp.im.common.emotion.library.bean.TextPicGroup;
import com.nd.android.sdp.im.common.emotion.library.parser.DefaultEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.parser.IEmotionParser;
import com.nd.android.sdp.im.common.emotion.library.stragedy.IAssetsStragedyFactory;
import com.nd.android.sdp.im.common.emotion.library.stragedy.configs.IConfigsStragedy;
import com.nd.android.sdp.im.common.emotion.library.utils.EmotionTypeUtils;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Young on 15/7/7.
 */
public class AssetsGroups {

    private static ArrayList<Group> sGroupList;

    static{
        ArrayList<Group> groupList = new ArrayList<Group>();
        final IAssetsStragedyFactory stragedyFactory = EmotionManager.getInstance().getAssetsStragedyFactory();
        IEmotionParser mEmotionParser = new DefaultEmotionParser(stragedyFactory.getFileStragedy());
        IConfigsStragedy configsStragedy = stragedyFactory.getAssetsConfigs();
                {
                Group group = new PicGroup(stragedyFactory.getFileStragedy());//className
                group.setId("cat");//groupid
                group.setNormalImg("281_cutecat_renzhen");//normalimg
                group.setSelecteddImg("281_cutecat_renzhen");//selectedimg
                group.setType(EmotionTypeUtils.PIC);//type
                group.setExt("gif");//ext
                group.setThumbExt("png");//thumb
                group.setDirName("smiley_cat");//dir
                group.setOrder(4);//order
                ArrayList<Emotion> emotionArrayList = new ArrayList<Emotion>();
                
        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("281");//id
            emotion.setFileName("281_cutecat_renzhen");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("281", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "earnest");//english
            emotion.putLangText(Locale.CHINA, "认真");//chinese
            emotion.putLangText(Locale.TAIWAN, "認真");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("282");//id
            emotion.setFileName("282_cutecat_xiai");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("282", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "like");//english
            emotion.putLangText(Locale.CHINA, "喜爱");//chinese
            emotion.putLangText(Locale.TAIWAN, "喜愛");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("283");//id
            emotion.setFileName("283_cutecat_se");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("283", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "lasciviousness");//english
            emotion.putLangText(Locale.CHINA, "色");//chinese
            emotion.putLangText(Locale.TAIWAN, "色");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("284");//id
            emotion.setFileName("284_cutecat_zhuak");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("284", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "GoCrazy");//english
            emotion.putLangText(Locale.CHINA, "抓狂");//chinese
            emotion.putLangText(Locale.TAIWAN, "抓狂");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("285");//id
            emotion.setFileName("285_cutecat_yun");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("285", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "faint");//english
            emotion.putLangText(Locale.CHINA, "晕");//chinese
            emotion.putLangText(Locale.TAIWAN, "暈");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("286");//id
            emotion.setFileName("286_cutecat_guilian");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("286", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "grimace");//english
            emotion.putLangText(Locale.CHINA, "鬼脸");//chinese
            emotion.putLangText(Locale.TAIWAN, "鬼臉");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("287");//id
            emotion.setFileName("287_cutecat_image");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("287", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "fantasy");//english
            emotion.putLangText(Locale.CHINA, "幻想");//chinese
            emotion.putLangText(Locale.TAIWAN, "幻想");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("288");//id
            emotion.setFileName("288_cutecat_jings");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("288", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "terrified");//english
            emotion.putLangText(Locale.CHINA, "惊悚");//chinese
            emotion.putLangText(Locale.TAIWAN, "驚悚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("289");//id
            emotion.setFileName("289_cutecat_koubi");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("289", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "PullTheNose");//english
            emotion.putLangText(Locale.CHINA, "抠鼻");//chinese
            emotion.putLangText(Locale.TAIWAN, "摳鼻");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("290");//id
            emotion.setFileName("290_cutecat_ku");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("290", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ShedTears");//english
            emotion.putLangText(Locale.CHINA, "流泪");//chinese
            emotion.putLangText(Locale.TAIWAN, "流淚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("291");//id
            emotion.setFileName("291_cutecat_nuli");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("291", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "TryHard");//english
            emotion.putLangText(Locale.CHINA, "努力");//chinese
            emotion.putLangText(Locale.TAIWAN, "努力");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("292");//id
            emotion.setFileName("292_cutecat_jinghu");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("292", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Exclaimed");//english
            emotion.putLangText(Locale.CHINA, "惊呼");//chinese
            emotion.putLangText(Locale.TAIWAN, "驚呼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("293");//id
            emotion.setFileName("293_cutecat_xiayitiao");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("293", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "startle");//english
            emotion.putLangText(Locale.CHINA, "吓一跳");//chinese
            emotion.putLangText(Locale.TAIWAN, "嚇壹跳");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("294");//id
            emotion.setFileName("294_cutecat_chifan");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("294", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "HaveAMeal");//english
            emotion.putLangText(Locale.CHINA, "吃饭");//chinese
            emotion.putLangText(Locale.TAIWAN, "吃飯");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("295");//id
            emotion.setFileName("295_cutecat_great");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("295", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "wonderful");//english
            emotion.putLangText(Locale.CHINA, "真棒");//chinese
            emotion.putLangText(Locale.TAIWAN, "真棒");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("296");//id
            emotion.setFileName("296_cutecat_kele");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cat");//groupdir
            group.addEmotion("296", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cola");//english
            emotion.putLangText(Locale.CHINA, "可乐");//chinese
            emotion.putLangText(Locale.TAIWAN, "可樂");//taiwan
        }

                group.setEmotionArrays(emotionArrayList.toArray(new Emotion[emotionArrayList.size()]));
                groupList.add(group);
        }
        {
                Group group = new PicGroup(stragedyFactory.getFileStragedy());//className
                group.setId("cos");//groupid
                group.setNormalImg("1120_cos_aini");//normalimg
                group.setSelecteddImg("1120_cos_aini");//selectedimg
                group.setType(EmotionTypeUtils.PIC);//type
                group.setExt("gif");//ext
                group.setThumbExt("png");//thumb
                group.setDirName("smiley_cos");//dir
                group.setOrder(3);//order
                ArrayList<Emotion> emotionArrayList = new ArrayList<Emotion>();
                
        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1120");//id
            emotion.setFileName("1120_cos_aini");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1120", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "LoveYou");//english
            emotion.putLangText(Locale.CHINA, "爱你");//chinese
            emotion.putLangText(Locale.TAIWAN, "愛妳 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1121");//id
            emotion.setFileName("1121_cos_baby");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1121", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "BabyGood");//english
            emotion.putLangText(Locale.CHINA, "宝贝乖");//chinese
            emotion.putLangText(Locale.TAIWAN, "寶貝乖");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1122");//id
            emotion.setFileName("1122_cos_bigong");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1122", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ExtortAConfession");//english
            emotion.putLangText(Locale.CHINA, "逼供");//chinese
            emotion.putLangText(Locale.TAIWAN, "逼供");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1123");//id
            emotion.setFileName("1123_cos_bierewo");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1123", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Don'tMessWithMe");//english
            emotion.putLangText(Locale.CHINA, "别惹我");//chinese
            emotion.putLangText(Locale.TAIWAN, "別惹我");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1124");//id
            emotion.setFileName("1124_cos_canren");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1124", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "merciless");//english
            emotion.putLangText(Locale.CHINA, "残忍");//chinese
            emotion.putLangText(Locale.TAIWAN, "殘忍");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1125");//id
            emotion.setFileName("1125_cos_chaojia");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1125", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "quarrel");//english
            emotion.putLangText(Locale.CHINA, "吵架");//chinese
            emotion.putLangText(Locale.TAIWAN, "吵架");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1126");//id
            emotion.setFileName("1126_cos_wait");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1126", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "wait");//english
            emotion.putLangText(Locale.CHINA, "等等");//chinese
            emotion.putLangText(Locale.TAIWAN, "等等");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1127");//id
            emotion.setFileName("1127_cos_followme");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1127", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "FollowMe");//english
            emotion.putLangText(Locale.CHINA, "跟我走");//chinese
            emotion.putLangText(Locale.TAIWAN, "跟我走");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1128");//id
            emotion.setFileName("1128_cos_jiujie");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1128", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "entanglement");//english
            emotion.putLangText(Locale.CHINA, "纠结");//chinese
            emotion.putLangText(Locale.TAIWAN, "糾結");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1129");//id
            emotion.setFileName("1129_cos_kengdie");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1129", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "DeceiveMe");//english
            emotion.putLangText(Locale.CHINA, "坑爹");//chinese
            emotion.putLangText(Locale.TAIWAN, "坑爹");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1130");//id
            emotion.setFileName("1130_cos_hurryup");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1130", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "HurryUp");//english
            emotion.putLangText(Locale.CHINA, "快点");//chinese
            emotion.putLangText(Locale.TAIWAN, "快點");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1131");//id
            emotion.setFileName("1131_cos_die");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1131", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "GoToHell");//english
            emotion.putLangText(Locale.CHINA, "去死吧");//chinese
            emotion.putLangText(Locale.TAIWAN, "去死吧");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1132");//id
            emotion.setFileName("1132_cos_dameit");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1132", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Devil");//english
            emotion.putLangText(Locale.CHINA, "死鬼");//chinese
            emotion.putLangText(Locale.TAIWAN, "死鬼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1133");//id
            emotion.setFileName("1133_cos_xianqi");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1133", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "AbandonYou");//english
            emotion.putLangText(Locale.CHINA, "嫌弃你");//chinese
            emotion.putLangText(Locale.TAIWAN, "嫌棄妳 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1134");//id
            emotion.setFileName("1134_cos_xiaoxiaoqi");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1134", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "CooledDown");//english
            emotion.putLangText(Locale.CHINA, "消消气");//chinese
            emotion.putLangText(Locale.TAIWAN, "消消氣");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1135");//id
            emotion.setFileName("1135_cos_xiaoyanger");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_cos");//groupdir
            group.addEmotion("1135", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "SmallForGestationalAge");//english
            emotion.putLangText(Locale.CHINA, "小样儿");//chinese
            emotion.putLangText(Locale.TAIWAN, "小樣兒");//taiwan
        }

                group.setEmotionArrays(emotionArrayList.toArray(new Emotion[emotionArrayList.size()]));
                groupList.add(group);
        }
        {
                Group group = new TextPicGroup(stragedyFactory.getFileStragedy());//className
                group.setId("sys");//groupid
                group.setNormalImg("smiley_sys");//normalimg
                group.setSelecteddImg("smiley_sys_selected");//selectedimg
                group.setType(EmotionTypeUtils.TEXT_PIC);//type
                group.setExt("png");//ext
                group.setThumbExt("png");//thumb
                group.setDirName("smiley_default");//dir
                group.setOrder(1);//order
                ArrayList<Emotion> emotionArrayList = new ArrayList<Emotion>();
                
        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1001");//id
            emotion.setFileName("1001_stand_wx");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1001", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "smile");//english
            emotion.putLangText(Locale.CHINA, "微笑2");//chinese
            emotion.putLangText(Locale.TAIWAN, "微笑2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1002");//id
            emotion.setFileName("1002_stand_pz");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1002", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "CurlOne'sLip");//english
            emotion.putLangText(Locale.CHINA, "撇嘴1");//chinese
            emotion.putLangText(Locale.TAIWAN, "撇嘴1 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1003");//id
            emotion.setFileName("1003_stand_s");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1003", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "lasciviousness");//english
            emotion.putLangText(Locale.CHINA, "色4");//chinese
            emotion.putLangText(Locale.TAIWAN, "色4 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1004");//id
            emotion.setFileName("1004_stand_fd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1004", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "AbsenceOfMind");//english
            emotion.putLangText(Locale.CHINA, "发呆2");//chinese
            emotion.putLangText(Locale.TAIWAN, "發呆2 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1005");//id
            emotion.setFileName("1005_stand_dy");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1005", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "complacent");//english
            emotion.putLangText(Locale.CHINA, "得意1");//chinese
            emotion.putLangText(Locale.TAIWAN, "得意1 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1006");//id
            emotion.setFileName("1006_stand_ll");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1006", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "lacrimation");//english
            emotion.putLangText(Locale.CHINA, "流泪2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 流淚2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1007");//id
            emotion.setFileName("1007_stand_hx");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1007", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "shy");//english
            emotion.putLangText(Locale.CHINA, "害羞5");//chinese
            emotion.putLangText(Locale.TAIWAN, " 害羞5");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1008");//id
            emotion.setFileName("1008_stand_bz");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1008", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ShutUp");//english
            emotion.putLangText(Locale.CHINA, "闭嘴1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 閉嘴1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1009");//id
            emotion.setFileName("1009_stand_shui");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1009", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sleep");//english
            emotion.putLangText(Locale.CHINA, "睡");//chinese
            emotion.putLangText(Locale.TAIWAN, "睡 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1010");//id
            emotion.setFileName("1010_stand_dk");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1010", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cry");//english
            emotion.putLangText(Locale.CHINA, "大哭7");//chinese
            emotion.putLangText(Locale.TAIWAN, " 大哭7");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1011");//id
            emotion.setFileName("1011_stand_gg");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1011", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "embarrassed");//english
            emotion.putLangText(Locale.CHINA, "尴尬1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 尷尬1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1012");//id
            emotion.setFileName("1012_stand_fn");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1012", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "GetAngry");//english
            emotion.putLangText(Locale.CHINA, "发怒");//chinese
            emotion.putLangText(Locale.TAIWAN, " 發怒");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1013");//id
            emotion.setFileName("1013_stand_tp");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1013", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "naughty");//english
            emotion.putLangText(Locale.CHINA, "调皮1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 調皮1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1014");//id
            emotion.setFileName("1014_stand_cy");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1014", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "YiTooth");//english
            emotion.putLangText(Locale.CHINA, "呲牙");//chinese
            emotion.putLangText(Locale.TAIWAN, " 呲牙");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1015");//id
            emotion.setFileName("1015_stand_jy");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1015", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "amazed");//english
            emotion.putLangText(Locale.CHINA, "惊讶4");//chinese
            emotion.putLangText(Locale.TAIWAN, " 驚訝4");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1016");//id
            emotion.setFileName("1016_stand_ng");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1016", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "BeGrieved");//english
            emotion.putLangText(Locale.CHINA, "难过");//chinese
            emotion.putLangText(Locale.TAIWAN, "難過 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1017");//id
            emotion.setFileName("1017_stand_kuk");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1017", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cool");//english
            emotion.putLangText(Locale.CHINA, "酷");//chinese
            emotion.putLangText(Locale.TAIWAN, "酷 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1018");//id
            emotion.setFileName("1018_stand_lengh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1018", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ColdSweat");//english
            emotion.putLangText(Locale.CHINA, "冷汗");//chinese
            emotion.putLangText(Locale.TAIWAN, " 冷汗");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1019");//id
            emotion.setFileName("1019_stand_zk");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1019", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "GoCrazy");//english
            emotion.putLangText(Locale.CHINA, "抓狂");//chinese
            emotion.putLangText(Locale.TAIWAN, "抓狂 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1020");//id
            emotion.setFileName("1020_stand_tu");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1020", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "spit");//english
            emotion.putLangText(Locale.CHINA, "吐");//chinese
            emotion.putLangText(Locale.TAIWAN, "吐 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1021");//id
            emotion.setFileName("1021_stand_tx");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1021", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "titter");//english
            emotion.putLangText(Locale.CHINA, "偷笑2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 偷笑2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1022");//id
            emotion.setFileName("1022_stand_ka");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1022", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cute");//english
            emotion.putLangText(Locale.CHINA, "可爱1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 可愛1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1023");//id
            emotion.setFileName("1023_stand_by");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1023", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "SuperciliousLook");//english
            emotion.putLangText(Locale.CHINA, "白眼1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 白眼1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1024");//id
            emotion.setFileName("1024_stand_am");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1024", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "arrogance");//english
            emotion.putLangText(Locale.CHINA, "傲慢");//chinese
            emotion.putLangText(Locale.TAIWAN, " 傲慢");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1025");//id
            emotion.setFileName("1025_stand_jie");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1025", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "hunger");//english
            emotion.putLangText(Locale.CHINA, "饥饿2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 饑餓2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1026");//id
            emotion.setFileName("1026_stand_kun");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1026", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sleepy");//english
            emotion.putLangText(Locale.CHINA, "困");//chinese
            emotion.putLangText(Locale.TAIWAN, "困 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1027");//id
            emotion.setFileName("1027_stand_jk");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1027", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "terrified");//english
            emotion.putLangText(Locale.CHINA, "惊恐1");//chinese
            emotion.putLangText(Locale.TAIWAN, "驚恐1 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1028");//id
            emotion.setFileName("1028_stand_lh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1028", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sweat");//english
            emotion.putLangText(Locale.CHINA, "流汗2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 流汗2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1029");//id
            emotion.setFileName("1029_stand_hunx");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1029", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "SmileFatuously");//english
            emotion.putLangText(Locale.CHINA, "憨笑");//chinese
            emotion.putLangText(Locale.TAIWAN, " 憨笑");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1030");//id
            emotion.setFileName("1030_stand_db");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1030", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "CommonSoldier");//english
            emotion.putLangText(Locale.CHINA, "大兵");//chinese
            emotion.putLangText(Locale.TAIWAN, "大兵 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1031");//id
            emotion.setFileName("1031_stand_fendou");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1031", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "strive");//english
            emotion.putLangText(Locale.CHINA, "奋斗1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 奮鬥1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1032");//id
            emotion.setFileName("1032_stand_zhm");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1032", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "curse");//english
            emotion.putLangText(Locale.CHINA, "咒骂");//chinese
            emotion.putLangText(Locale.TAIWAN, " 咒罵");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1033");//id
            emotion.setFileName("1033_stand_yiw");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1033", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "query");//english
            emotion.putLangText(Locale.CHINA, "疑问2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 疑問2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1034");//id
            emotion.setFileName("1034_stand_xu");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1034", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "hush");//english
            emotion.putLangText(Locale.CHINA, "嘘");//chinese
            emotion.putLangText(Locale.TAIWAN, "嘘 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1035");//id
            emotion.setFileName("1035_stand_yun");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1035", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "giddy");//english
            emotion.putLangText(Locale.CHINA, "晕3");//chinese
            emotion.putLangText(Locale.TAIWAN, "暈3 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1036");//id
            emotion.setFileName("1036_stand_zhem");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1036", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "torment");//english
            emotion.putLangText(Locale.CHINA, "折磨1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 折磨1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1037");//id
            emotion.setFileName("1037_stand_shuai");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1037", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "OutOfLuck");//english
            emotion.putLangText(Locale.CHINA, "衰1");//chinese
            emotion.putLangText(Locale.TAIWAN, "衰1 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1038");//id
            emotion.setFileName("1038_stand_kl");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1038", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "HumanSkeleton");//english
            emotion.putLangText(Locale.CHINA, "骷髅");//chinese
            emotion.putLangText(Locale.TAIWAN, "骷髏 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1039");//id
            emotion.setFileName("1039_stand_qiao");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1039", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "knock");//english
            emotion.putLangText(Locale.CHINA, "敲");//chinese
            emotion.putLangText(Locale.TAIWAN, "敲 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1040");//id
            emotion.setFileName("1040_stand_zj");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1040", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "GoodBye");//english
            emotion.putLangText(Locale.CHINA, "再见");//chinese
            emotion.putLangText(Locale.TAIWAN, " 再見");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1041");//id
            emotion.setFileName("1041_stand_ch");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1041", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sweat");//english
            emotion.putLangText(Locale.CHINA, "出汗");//chinese
            emotion.putLangText(Locale.TAIWAN, "出汗 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1042");//id
            emotion.setFileName("1042_stand_kb");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1042", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "PickNose");//english
            emotion.putLangText(Locale.CHINA, "抠鼻");//chinese
            emotion.putLangText(Locale.TAIWAN, "摳鼻 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1043");//id
            emotion.setFileName("1043_stand_gz");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1043", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "handclap");//english
            emotion.putLangText(Locale.CHINA, "鼓掌1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 鼓掌1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1044");//id
            emotion.setFileName("1044_stand_qd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1044", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "embarrassing");//english
            emotion.putLangText(Locale.CHINA, "糗大了");//chinese
            emotion.putLangText(Locale.TAIWAN, "糗大了 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1045");//id
            emotion.setFileName("1045_stand_huaix");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1045", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "BadSmile");//english
            emotion.putLangText(Locale.CHINA, "坏笑1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 壞笑1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1046");//id
            emotion.setFileName("1046_stand_zhh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1046", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "LeftHem");//english
            emotion.putLangText(Locale.CHINA, "左哼哼");//chinese
            emotion.putLangText(Locale.TAIWAN, " 左哼哼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1047");//id
            emotion.setFileName("1047_stand_yhh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1047", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "RightHem");//english
            emotion.putLangText(Locale.CHINA, "右哼哼");//chinese
            emotion.putLangText(Locale.TAIWAN, "右哼哼 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1048");//id
            emotion.setFileName("1048_stand_hq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1048", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "yawn");//english
            emotion.putLangText(Locale.CHINA, "哈欠");//chinese
            emotion.putLangText(Locale.TAIWAN, " 哈欠");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1049");//id
            emotion.setFileName("1049_stand_bs");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1049", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "contempt");//english
            emotion.putLangText(Locale.CHINA, "鄙视2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 鄙視2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1050");//id
            emotion.setFileName("1050_stand_wq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1050", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "FeelWronged");//english
            emotion.putLangText(Locale.CHINA, "委屈1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 委屈1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1051");//id
            emotion.setFileName("1051_stand_kk");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1051", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "FastCry");//english
            emotion.putLangText(Locale.CHINA, "快哭了");//chinese
            emotion.putLangText(Locale.TAIWAN, " 快哭了");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1052");//id
            emotion.setFileName("1052_stand_yx");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1052", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "FastCry");//english
            emotion.putLangText(Locale.CHINA, "阴险");//chinese
            emotion.putLangText(Locale.TAIWAN, " 陰險");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1053");//id
            emotion.setFileName("1053_stand_qq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1053", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "kiss");//english
            emotion.putLangText(Locale.CHINA, "亲亲");//chinese
            emotion.putLangText(Locale.TAIWAN, "親親 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1054");//id
            emotion.setFileName("1054_stand_xia");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1054", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "scare");//english
            emotion.putLangText(Locale.CHINA, "吓");//chinese
            emotion.putLangText(Locale.TAIWAN, "嚇 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1055");//id
            emotion.setFileName("1055_stand_kel");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1055", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "pitiful");//english
            emotion.putLangText(Locale.CHINA, "可怜2");//chinese
            emotion.putLangText(Locale.TAIWAN, " 可憐2");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1056");//id
            emotion.setFileName("1056_stand_cd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1056", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "KitchenKnife");//english
            emotion.putLangText(Locale.CHINA, "菜刀");//chinese
            emotion.putLangText(Locale.TAIWAN, " 菜刀");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1057");//id
            emotion.setFileName("1057_stand_xig");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1057", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "watermelon");//english
            emotion.putLangText(Locale.CHINA, "西瓜");//chinese
            emotion.putLangText(Locale.TAIWAN, "西瓜 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1058");//id
            emotion.setFileName("1058_stand_pj");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1058", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "beer");//english
            emotion.putLangText(Locale.CHINA, "啤酒");//chinese
            emotion.putLangText(Locale.TAIWAN, " 啤酒");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1059");//id
            emotion.setFileName("1059_stand_lq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1059", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "basketball");//english
            emotion.putLangText(Locale.CHINA, "篮球");//chinese
            emotion.putLangText(Locale.TAIWAN, "籃球 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1060");//id
            emotion.setFileName("1060_stand_pp");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1060", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ping-pong");//english
            emotion.putLangText(Locale.CHINA, "乒乓");//chinese
            emotion.putLangText(Locale.TAIWAN, " 乒乓");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1061");//id
            emotion.setFileName("1061_stand_kf");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1061", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "coffee");//english
            emotion.putLangText(Locale.CHINA, "咖啡");//chinese
            emotion.putLangText(Locale.TAIWAN, "咖啡 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1062");//id
            emotion.setFileName("1062_stand_fan");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1062", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "meal");//english
            emotion.putLangText(Locale.CHINA, "饭");//chinese
            emotion.putLangText(Locale.TAIWAN, "飯 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1063");//id
            emotion.setFileName("1063_stand_zt");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1063", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Pig'sHead");//english
            emotion.putLangText(Locale.CHINA, "猪头");//chinese
            emotion.putLangText(Locale.TAIWAN, " 豬頭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1064");//id
            emotion.setFileName("1064_stand_mg");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1064", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "rose");//english
            emotion.putLangText(Locale.CHINA, "玫瑰");//chinese
            emotion.putLangText(Locale.TAIWAN, "玫瑰 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1065");//id
            emotion.setFileName("1065_stand_dx");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1065", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "WitherAway");//english
            emotion.putLangText(Locale.CHINA, "凋谢");//chinese
            emotion.putLangText(Locale.TAIWAN, "雕謝 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1066");//id
            emotion.setFileName("1066_stand_sa");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1066", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "CourtshipDisplay");//english
            emotion.putLangText(Locale.CHINA, "示爱");//chinese
            emotion.putLangText(Locale.TAIWAN, " 示愛");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1067");//id
            emotion.setFileName("1067_stand_xin");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1067", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "LovingHeart");//english
            emotion.putLangText(Locale.CHINA, "爱心");//chinese
            emotion.putLangText(Locale.TAIWAN, " 愛心");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1068");//id
            emotion.setFileName("1068_stand_xs");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1068", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "heart-broken");//english
            emotion.putLangText(Locale.CHINA, "心碎");//chinese
            emotion.putLangText(Locale.TAIWAN, " 心碎");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1069");//id
            emotion.setFileName("1069_stand_dg");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1069", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cake");//english
            emotion.putLangText(Locale.CHINA, "蛋糕");//chinese
            emotion.putLangText(Locale.TAIWAN, "蛋糕 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1070");//id
            emotion.setFileName("1070_stand_shd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1070", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "lightning");//english
            emotion.putLangText(Locale.CHINA, "闪电");//chinese
            emotion.putLangText(Locale.TAIWAN, " 閃電");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1071");//id
            emotion.setFileName("1071_stand_zhd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1071", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "bombshell");//english
            emotion.putLangText(Locale.CHINA, "炸弹");//chinese
            emotion.putLangText(Locale.TAIWAN, "炸彈 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1072");//id
            emotion.setFileName("1072_stand_dao");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1072", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "knife");//english
            emotion.putLangText(Locale.CHINA, "刀");//chinese
            emotion.putLangText(Locale.TAIWAN, " 刀");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1073");//id
            emotion.setFileName("1073_stand_zq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1073", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "football");//english
            emotion.putLangText(Locale.CHINA, "足球");//chinese
            emotion.putLangText(Locale.TAIWAN, "足球 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1074");//id
            emotion.setFileName("1074_stand_pch");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1074", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ladybird");//english
            emotion.putLangText(Locale.CHINA, "瓢虫");//chinese
            emotion.putLangText(Locale.TAIWAN, "瓢蟲 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1075");//id
            emotion.setFileName("1075_stand_bb");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1075", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "potbellied");//english
            emotion.putLangText(Locale.CHINA, "便便");//chinese
            emotion.putLangText(Locale.TAIWAN, " 便便");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1076");//id
            emotion.setFileName("1076_stand_yl");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1076", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "moon");//english
            emotion.putLangText(Locale.CHINA, "月亮");//chinese
            emotion.putLangText(Locale.TAIWAN, " 月亮");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1077");//id
            emotion.setFileName("1077_stand_ty");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1077", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sun");//english
            emotion.putLangText(Locale.CHINA, "太阳");//chinese
            emotion.putLangText(Locale.TAIWAN, "太陽 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1078");//id
            emotion.setFileName("1078_stand_lw");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1078", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "gift");//english
            emotion.putLangText(Locale.CHINA, "礼物");//chinese
            emotion.putLangText(Locale.TAIWAN, "禮物 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1079");//id
            emotion.setFileName("1079_stand_yb");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1079", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "hug");//english
            emotion.putLangText(Locale.CHINA, "拥抱");//chinese
            emotion.putLangText(Locale.TAIWAN, "擁抱 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1080");//id
            emotion.setFileName("1080_stand_qiang");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1080", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "strong");//english
            emotion.putLangText(Locale.CHINA, "强");//chinese
            emotion.putLangText(Locale.TAIWAN, "強 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1081");//id
            emotion.setFileName("1081_stand_ruo");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1081", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "weak");//english
            emotion.putLangText(Locale.CHINA, "弱");//chinese
            emotion.putLangText(Locale.TAIWAN, " 弱");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1082");//id
            emotion.setFileName("1082_stand_ws");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1082", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "handshake");//english
            emotion.putLangText(Locale.CHINA, "握手");//chinese
            emotion.putLangText(Locale.TAIWAN, "握手 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1083");//id
            emotion.setFileName("1083_stand_shl");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1083", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "victory");//english
            emotion.putLangText(Locale.CHINA, "胜利");//chinese
            emotion.putLangText(Locale.TAIWAN, " 勝利");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1084");//id
            emotion.setFileName("1084_stand_bq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1084", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "fuels");//english
            emotion.putLangText(Locale.CHINA, "抱拳");//chinese
            emotion.putLangText(Locale.TAIWAN, "抱拳 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1085");//id
            emotion.setFileName("1085_stand_gy");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1085", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "seduce");//english
            emotion.putLangText(Locale.CHINA, "勾引");//chinese
            emotion.putLangText(Locale.TAIWAN, "勾引 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1086");//id
            emotion.setFileName("1086_stand_qt");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1086", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "fist");//english
            emotion.putLangText(Locale.CHINA, "拳头");//chinese
            emotion.putLangText(Locale.TAIWAN, " 拳頭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1087");//id
            emotion.setFileName("1087_stand_cj");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1087", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "disappointing");//english
            emotion.putLangText(Locale.CHINA, "差劲");//chinese
            emotion.putLangText(Locale.TAIWAN, " 差勁");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1088");//id
            emotion.setFileName("1088_stand_aini");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1088", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "LoveYou");//english
            emotion.putLangText(Locale.CHINA, "爱你");//chinese
            emotion.putLangText(Locale.TAIWAN, "愛妳 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1089");//id
            emotion.setFileName("1089_stand_bu");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1089", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "NO");//english
            emotion.putLangText(Locale.CHINA, "NO");//chinese
            emotion.putLangText(Locale.TAIWAN, " NO");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1090");//id
            emotion.setFileName("1090_stand_hd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1090", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "OK");//english
            emotion.putLangText(Locale.CHINA, "OK");//chinese
            emotion.putLangText(Locale.TAIWAN, " OK");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1091");//id
            emotion.setFileName("1091_stand_aiq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1091", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "love");//english
            emotion.putLangText(Locale.CHINA, "爱情");//chinese
            emotion.putLangText(Locale.TAIWAN, " 愛情");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1092");//id
            emotion.setFileName("1092_stand_fw");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1092", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ThrowSomeoneAKiss");//english
            emotion.putLangText(Locale.CHINA, "飞吻1");//chinese
            emotion.putLangText(Locale.TAIWAN, " 飛吻1");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1093");//id
            emotion.setFileName("1093_stand_tiao");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1093", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "UpAndDown");//english
            emotion.putLangText(Locale.CHINA, "跳跳");//chinese
            emotion.putLangText(Locale.TAIWAN, " 跳跳");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1094");//id
            emotion.setFileName("1094_stand_fad");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1094", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "tremble");//english
            emotion.putLangText(Locale.CHINA, "发抖");//chinese
            emotion.putLangText(Locale.TAIWAN, " 發抖");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1095");//id
            emotion.setFileName("1095_stand_oh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1095", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "WasTheFire");//english
            emotion.putLangText(Locale.CHINA, "怄火");//chinese
            emotion.putLangText(Locale.TAIWAN, "慪火 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1096");//id
            emotion.setFileName("1096_stand_zhq");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1096", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "whirl");//english
            emotion.putLangText(Locale.CHINA, "转圈");//chinese
            emotion.putLangText(Locale.TAIWAN, " 轉圈");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1097");//id
            emotion.setFileName("1097_stand_kt");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1097", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "kowtow");//english
            emotion.putLangText(Locale.CHINA, "磕头");//chinese
            emotion.putLangText(Locale.TAIWAN, "磕頭 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1098");//id
            emotion.setFileName("1098_stand_ht");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1098", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "WhipRound");//english
            emotion.putLangText(Locale.CHINA, "回头");//chinese
            emotion.putLangText(Locale.TAIWAN, "回頭 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1099");//id
            emotion.setFileName("1099_stand_tsh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1099", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "RopeSkipping");//english
            emotion.putLangText(Locale.CHINA, "跳绳");//chinese
            emotion.putLangText(Locale.TAIWAN, " 跳繩");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1100");//id
            emotion.setFileName("1100_stand_hsh");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1100", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "wave");//english
            emotion.putLangText(Locale.CHINA, "挥手");//chinese
            emotion.putLangText(Locale.TAIWAN, "揮手 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1101");//id
            emotion.setFileName("1101_stand_jd");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1101", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "excite");//english
            emotion.putLangText(Locale.CHINA, "激动3");//chinese
            emotion.putLangText(Locale.TAIWAN, " 激動3");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1102");//id
            emotion.setFileName("1102_stand_jw");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1102", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "StreetDancing");//english
            emotion.putLangText(Locale.CHINA, "街舞");//chinese
            emotion.putLangText(Locale.TAIWAN, "街舞 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1103");//id
            emotion.setFileName("1103_stand_xw");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1103", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "kiss");//english
            emotion.putLangText(Locale.CHINA, "献吻");//chinese
            emotion.putLangText(Locale.TAIWAN, " 獻吻");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1104");//id
            emotion.setFileName("1104_stand_zoutj");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1104", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ZuoTaiJi");//english
            emotion.putLangText(Locale.CHINA, "左太极");//chinese
            emotion.putLangText(Locale.TAIWAN, "左太極 ");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("1105");//id
            emotion.setFileName("1105_stand_youtj");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_default");//groupdir
            group.addEmotion("1105", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "YouTaiJi");//english
            emotion.putLangText(Locale.CHINA, "右太极");//chinese
            emotion.putLangText(Locale.TAIWAN, " 右太極");//taiwan
        }

                group.setEmotionArrays(emotionArrayList.toArray(new Emotion[emotionArrayList.size()]));
                groupList.add(group);
        }
        {
                Group group = new EmojiGroup(stragedyFactory.getFileStragedy());//className
                group.setId("e");//groupid
                group.setNormalImg("emoji_111_e415");//normalimg
                group.setSelecteddImg("emoji_111_e415");//selectedimg
                group.setType(EmotionTypeUtils.EMOJI);//type
                group.setExt("png");//ext
                group.setThumbExt("png");//thumb
                group.setDirName("smiley_emoji");//dir
                group.setOrder(2);//order
                ArrayList<Emotion> emotionArrayList = new ArrayList<Emotion>();
                
        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128516");//id
            emotion.setFileName("emoji_111_e415");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128516", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Happy");//english
            emotion.putLangText(Locale.CHINA, "e高兴");//chinese
            emotion.putLangText(Locale.TAIWAN, "e高興");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128515");//id
            emotion.setFileName("emoji_112_e057");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128515", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "SmilingFace");//english
            emotion.putLangText(Locale.CHINA, "e笑脸");//chinese
            emotion.putLangText(Locale.TAIWAN, "e笑臉");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128522");//id
            emotion.setFileName("emoji_113_e056");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128522", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Cute");//english
            emotion.putLangText(Locale.CHINA, "e可爱");//chinese
            emotion.putLangText(Locale.TAIWAN, "e可愛");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9786");//id
            emotion.setFileName("emoji_114_e414");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9786", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Shy");//english
            emotion.putLangText(Locale.CHINA, "e害羞");//chinese
            emotion.putLangText(Locale.TAIWAN, "e害羞");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128521");//id
            emotion.setFileName("emoji_115_e405");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128521", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Blink");//english
            emotion.putLangText(Locale.CHINA, "e眨眼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e眨眼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128525");//id
            emotion.setFileName("emoji_116_e106");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128525", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "FickleInLove");//english
            emotion.putLangText(Locale.CHINA, "e花心");//chinese
            emotion.putLangText(Locale.TAIWAN, "e花心");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128536");//id
            emotion.setFileName("emoji_117_e418");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128536", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ThrowSomeoneAKiss");//english
            emotion.putLangText(Locale.CHINA, "e飞吻");//chinese
            emotion.putLangText(Locale.TAIWAN, "e飛吻");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128538");//id
            emotion.setFileName("emoji_121_e417");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128538", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Whistle");//english
            emotion.putLangText(Locale.CHINA, "e吹口哨");//chinese
            emotion.putLangText(Locale.TAIWAN, "e吹口哨");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128563");//id
            emotion.setFileName("emoji_122_e40d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128563", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "glare");//english
            emotion.putLangText(Locale.CHINA, "e瞪眼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e瞪眼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128524");//id
            emotion.setFileName("emoji_123_e40a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128524", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "satisfy");//english
            emotion.putLangText(Locale.CHINA, "e满足");//chinese
            emotion.putLangText(Locale.TAIWAN, "e滿足");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128513");//id
            emotion.setFileName("emoji_124_e404");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128513", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "risus");//english
            emotion.putLangText(Locale.CHINA, "e大笑");//chinese
            emotion.putLangText(Locale.TAIWAN, "e大笑");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128540");//id
            emotion.setFileName("emoji_125_e105");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128540", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "naughty");//english
            emotion.putLangText(Locale.CHINA, "e调皮");//chinese
            emotion.putLangText(Locale.TAIWAN, "e調皮");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128541");//id
            emotion.setFileName("emoji_126_e409");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128541", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "StickingTongueOut");//english
            emotion.putLangText(Locale.CHINA, "e吐舌头");//chinese
            emotion.putLangText(Locale.TAIWAN, "e吐舌頭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128530");//id
            emotion.setFileName("emoji_127_e40e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128530", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "tropia");//english
            emotion.putLangText(Locale.CHINA, "e斜眼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e斜眼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128527");//id
            emotion.setFileName("emoji_131_e402");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128527", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "proud");//english
            emotion.putLangText(Locale.CHINA, "e得意");//chinese
            emotion.putLangText(Locale.TAIWAN, "e得意");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128560");//id
            emotion.setFileName("emoji_132_e40f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128560", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "nervous");//english
            emotion.putLangText(Locale.CHINA, "e紧张");//chinese
            emotion.putLangText(Locale.TAIWAN, "e緊張");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128557");//id
            emotion.setFileName("emoji_133_e411");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128557", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cry");//english
            emotion.putLangText(Locale.CHINA, "e哭");//chinese
            emotion.putLangText(Locale.TAIWAN, "e哭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128514");//id
            emotion.setFileName("emoji_134_e412");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128514", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "CryWithJoy");//english
            emotion.putLangText(Locale.CHINA, "e喜极而泣");//chinese
            emotion.putLangText(Locale.TAIWAN, "e喜極而泣");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128561");//id
            emotion.setFileName("emoji_135_e107");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128561", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "terrified");//english
            emotion.putLangText(Locale.CHINA, "e惊悚");//chinese
            emotion.putLangText(Locale.TAIWAN, "e驚悚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128534");//id
            emotion.setFileName("emoji_136_e407");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128534", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "GoCrazy");//english
            emotion.putLangText(Locale.CHINA, "e抓狂");//chinese
            emotion.putLangText(Locale.TAIWAN, "e抓狂");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128531");//id
            emotion.setFileName("emoji_211_e108");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128531", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "perspiration");//english
            emotion.putLangText(Locale.CHINA, "e汗");//chinese
            emotion.putLangText(Locale.TAIWAN, "e汗");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128552");//id
            emotion.setFileName("emoji_212_e40b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128552", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "surprise");//english
            emotion.putLangText(Locale.CHINA, "e吃惊");//chinese
            emotion.putLangText(Locale.TAIWAN, "e吃驚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128547");//id
            emotion.setFileName("emoji_213_e406");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128547", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "FeelIll");//english
            emotion.putLangText(Locale.CHINA, "e难受");//chinese
            emotion.putLangText(Locale.TAIWAN, "e難受");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128546");//id
            emotion.setFileName("emoji_214_e413");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128546", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "grieve");//english
            emotion.putLangText(Locale.CHINA, "e难过");//chinese
            emotion.putLangText(Locale.TAIWAN, "e難過");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128549");//id
            emotion.setFileName("emoji_215_e401");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128549", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "embarrassed");//english
            emotion.putLangText(Locale.CHINA, "e尴尬");//chinese
            emotion.putLangText(Locale.TAIWAN, "e尷尬");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128532");//id
            emotion.setFileName("emoji_216_e403");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128532", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "melancholy");//english
            emotion.putLangText(Locale.CHINA, "e忧郁");//chinese
            emotion.putLangText(Locale.TAIWAN, "e憂郁");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128542");//id
            emotion.setFileName("emoji_217_e058");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128542", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "lose");//english
            emotion.putLangText(Locale.CHINA, "e失落");//chinese
            emotion.putLangText(Locale.TAIWAN, "e失落");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128562");//id
            emotion.setFileName("emoji_221_e410");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128562", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ThornBlind");//english
            emotion.putLangText(Locale.CHINA, "e刺瞎");//chinese
            emotion.putLangText(Locale.TAIWAN, "e刺瞎");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128544");//id
            emotion.setFileName("emoji_222_e059");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128544", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "anger");//english
            emotion.putLangText(Locale.CHINA, "e生气");//chinese
            emotion.putLangText(Locale.TAIWAN, "e生氣");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128545");//id
            emotion.setFileName("emoji_223_e416");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128545", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "AsMadAsAWetHen");//english
            emotion.putLangText(Locale.CHINA, "e非常生气");//chinese
            emotion.putLangText(Locale.TAIWAN, "e非常生氣");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128554");//id
            emotion.setFileName("emoji_224_e408");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128554", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sleepy");//english
            emotion.putLangText(Locale.CHINA, "e困");//chinese
            emotion.putLangText(Locale.TAIWAN, "e困");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128567");//id
            emotion.setFileName("emoji_225_e40c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128567", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "WearingAMask");//english
            emotion.putLangText(Locale.CHINA, "e戴口罩");//chinese
            emotion.putLangText(Locale.TAIWAN, "e戴口罩");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128127");//id
            emotion.setFileName("emoji_226_e11a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128127", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "demon");//english
            emotion.putLangText(Locale.CHINA, "e魔鬼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e魔鬼");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128125");//id
            emotion.setFileName("emoji_227_e10c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128125", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "extra-terrestrial");//english
            emotion.putLangText(Locale.CHINA, "e外星人");//chinese
            emotion.putLangText(Locale.TAIWAN, "e外星人");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128123");//id
            emotion.setFileName("emoji_231_e11b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128123", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ghost");//english
            emotion.putLangText(Locale.CHINA, "e幽灵");//chinese
            emotion.putLangText(Locale.TAIWAN, "e幽靈");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128128");//id
            emotion.setFileName("emoji_232_e11c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128128", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "HumanSkeleton");//english
            emotion.putLangText(Locale.CHINA, "e骷髅");//chinese
            emotion.putLangText(Locale.TAIWAN, "e骷髏");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128124");//id
            emotion.setFileName("emoji_233_e04e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128124", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "angel");//english
            emotion.putLangText(Locale.CHINA, "e天使");//chinese
            emotion.putLangText(Locale.TAIWAN, "e天使");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127877");//id
            emotion.setFileName("emoji_234_e448");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127877", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "SantaClaus");//english
            emotion.putLangText(Locale.CHINA, "e圣诞老人");//chinese
            emotion.putLangText(Locale.TAIWAN, "e聖誕老人");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128169");//id
            emotion.setFileName("emoji_235_e05a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128169", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "excrement");//english
            emotion.putLangText(Locale.CHINA, "e大便");//chinese
            emotion.putLangText(Locale.TAIWAN, "e大便");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128145");//id
            emotion.setFileName("emoji_236_e425");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128145", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "love");//english
            emotion.putLangText(Locale.CHINA, "e爱情");//chinese
            emotion.putLangText(Locale.TAIWAN, "e愛情");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128170");//id
            emotion.setFileName("emoji_311_e14c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128170", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "muscle");//english
            emotion.putLangText(Locale.CHINA, "e肌肉");//chinese
            emotion.putLangText(Locale.TAIWAN, "e肌肉");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128074");//id
            emotion.setFileName("emoji_312_e00d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128074", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "fist");//english
            emotion.putLangText(Locale.CHINA, "e拳头");//chinese
            emotion.putLangText(Locale.TAIWAN, "e拳頭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9757");//id
            emotion.setFileName("emoji_313_e00f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9757", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "IndexFinger");//english
            emotion.putLangText(Locale.CHINA, "e食指");//chinese
            emotion.putLangText(Locale.TAIWAN, "e食指");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128079");//id
            emotion.setFileName("emoji_314_e41f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128079", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "handclap");//english
            emotion.putLangText(Locale.CHINA, "e鼓掌");//chinese
            emotion.putLangText(Locale.TAIWAN, "e鼓掌");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9994");//id
            emotion.setFileName("emoji_315_e010");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9994", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "stone");//english
            emotion.putLangText(Locale.CHINA, "e石头");//chinese
            emotion.putLangText(Locale.TAIWAN, "e石頭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9996");//id
            emotion.setFileName("emoji_316_e011");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9996", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "scissor");//english
            emotion.putLangText(Locale.CHINA, "e剪刀");//chinese
            emotion.putLangText(Locale.TAIWAN, "e剪刀");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9995");//id
            emotion.setFileName("emoji_317_e012");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9995", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cloth");//english
            emotion.putLangText(Locale.CHINA, "e布");//chinese
            emotion.putLangText(Locale.TAIWAN, "e布");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128070");//id
            emotion.setFileName("emoji_321_e22e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128070", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "up");//english
            emotion.putLangText(Locale.CHINA, "e上");//chinese
            emotion.putLangText(Locale.TAIWAN, "e上");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128071");//id
            emotion.setFileName("emoji_322_e22f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128071", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "down");//english
            emotion.putLangText(Locale.CHINA, "e下");//chinese
            emotion.putLangText(Locale.TAIWAN, "e下");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128072");//id
            emotion.setFileName("emoji_323_e230");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128072", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "left");//english
            emotion.putLangText(Locale.CHINA, "e左");//chinese
            emotion.putLangText(Locale.TAIWAN, "e左");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128073");//id
            emotion.setFileName("emoji_324_e231");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128073", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "right");//english
            emotion.putLangText(Locale.CHINA, "e右");//chinese
            emotion.putLangText(Locale.TAIWAN, "e右");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128077");//id
            emotion.setFileName("emoji_325_e00e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128077", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "fierce");//english
            emotion.putLangText(Locale.CHINA, "e厉害");//chinese
            emotion.putLangText(Locale.TAIWAN, "e厲害");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128078");//id
            emotion.setFileName("emoji_326_e421");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128078", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "badly");//english
            emotion.putLangText(Locale.CHINA, "e差劲");//chinese
            emotion.putLangText(Locale.TAIWAN, "e差勁");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128076");//id
            emotion.setFileName("emoji_327_e420");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128076", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Okay");//english
            emotion.putLangText(Locale.CHINA, "eOkay");//chinese
            emotion.putLangText(Locale.TAIWAN, "eOkay");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128064");//id
            emotion.setFileName("emoji_331_e419");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128064", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "eye");//english
            emotion.putLangText(Locale.CHINA, "e眼睛");//chinese
            emotion.putLangText(Locale.TAIWAN, "e眼睛");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128067");//id
            emotion.setFileName("emoji_332_e41a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128067", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "nose");//english
            emotion.putLangText(Locale.CHINA, "e鼻子");//chinese
            emotion.putLangText(Locale.TAIWAN, "e鼻子");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128139");//id
            emotion.setFileName("emoji_333_e003");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128139", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "LipPrint");//english
            emotion.putLangText(Locale.CHINA, "e唇印");//chinese
            emotion.putLangText(Locale.TAIWAN, "e唇印");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128066");//id
            emotion.setFileName("emoji_334_e41b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128066", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ear");//english
            emotion.putLangText(Locale.CHINA, "e耳朵");//chinese
            emotion.putLangText(Locale.TAIWAN, "e耳朵");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128591");//id
            emotion.setFileName("emoji_335_e41d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128591", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "bless");//english
            emotion.putLangText(Locale.CHINA, "e保佑");//chinese
            emotion.putLangText(Locale.TAIWAN, "e保佑");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127867");//id
            emotion.setFileName("emoji_336_e30c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127867", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "beer");//english
            emotion.putLangText(Locale.CHINA, "e啤酒");//chinese
            emotion.putLangText(Locale.TAIWAN, "e啤酒");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127834");//id
            emotion.setFileName("emoji_411_e33e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127834", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "rice");//english
            emotion.putLangText(Locale.CHINA, "e米饭");//chinese
            emotion.putLangText(Locale.TAIWAN, "e米飯");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127858");//id
            emotion.setFileName("emoji_412_e34d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127858", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "soup");//english
            emotion.putLangText(Locale.CHINA, "e汤");//chinese
            emotion.putLangText(Locale.TAIWAN, "e湯");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127836");//id
            emotion.setFileName("emoji_413_e340");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127836", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "noodle");//english
            emotion.putLangText(Locale.CHINA, "e面条");//chinese
            emotion.putLangText(Locale.TAIWAN, "e面條");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127833");//id
            emotion.setFileName("emoji_414_e342");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127833", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "RiceAndVegetableRoll");//english
            emotion.putLangText(Locale.CHINA, "e饭团");//chinese
            emotion.putLangText(Locale.TAIWAN, "e飯團");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127857");//id
            emotion.setFileName("emoji_415_e34c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127857", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "BoxLunch");//english
            emotion.putLangText(Locale.CHINA, "e盒饭");//chinese
            emotion.putLangText(Locale.TAIWAN, "e盒飯");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127843");//id
            emotion.setFileName("emoji_416_e344");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127843", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Sushi");//english
            emotion.putLangText(Locale.CHINA, "e寿司");//chinese
            emotion.putLangText(Locale.TAIWAN, "e壽司");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127842");//id
            emotion.setFileName("emoji_417_e343");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127842", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Oden");//english
            emotion.putLangText(Locale.CHINA, "e关东煮");//chinese
            emotion.putLangText(Locale.TAIWAN, "e關東煮");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127874");//id
            emotion.setFileName("emoji_421_e34b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127874", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cake");//english
            emotion.putLangText(Locale.CHINA, "e蛋糕");//chinese
            emotion.putLangText(Locale.TAIWAN, "e蛋糕");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127838");//id
            emotion.setFileName("emoji_422_e339");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127838", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "bread");//english
            emotion.putLangText(Locale.CHINA, "e面包");//chinese
            emotion.putLangText(Locale.TAIWAN, "e面包");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127847");//id
            emotion.setFileName("emoji_423_e43f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127847", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "WaterIce");//english
            emotion.putLangText(Locale.CHINA, "e刨冰");//chinese
            emotion.putLangText(Locale.TAIWAN, "e刨冰");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9749");//id
            emotion.setFileName("emoji_424_e045");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9749", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "coffee");//english
            emotion.putLangText(Locale.CHINA, "e咖啡");//chinese
            emotion.putLangText(Locale.TAIWAN, "e咖啡");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127828");//id
            emotion.setFileName("emoji_425_e120");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127828", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "hamburger");//english
            emotion.putLangText(Locale.CHINA, "e汉堡");//chinese
            emotion.putLangText(Locale.TAIWAN, "e漢堡");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127839");//id
            emotion.setFileName("emoji_426_e33b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127839", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "chips");//english
            emotion.putLangText(Locale.CHINA, "e薯条");//chinese
            emotion.putLangText(Locale.TAIWAN, "e薯條");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127846");//id
            emotion.setFileName("emoji_427_e33a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127846", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "IceCream");//english
            emotion.putLangText(Locale.CHINA, "e冰淇淋");//chinese
            emotion.putLangText(Locale.TAIWAN, "e冰泣淋");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127822");//id
            emotion.setFileName("emoji_431_e345");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127822", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "apple");//english
            emotion.putLangText(Locale.CHINA, "e苹果");//chinese
            emotion.putLangText(Locale.TAIWAN, "e蘋果");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127827");//id
            emotion.setFileName("emoji_432_e347");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127827", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "strawberry");//english
            emotion.putLangText(Locale.CHINA, "e草莓");//chinese
            emotion.putLangText(Locale.TAIWAN, "e草莓");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127818");//id
            emotion.setFileName("emoji_433_e346");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127818", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "orange");//english
            emotion.putLangText(Locale.CHINA, "e橙子");//chinese
            emotion.putLangText(Locale.TAIWAN, "e橙子");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127817");//id
            emotion.setFileName("emoji_434_e348");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127817", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "watermelon");//english
            emotion.putLangText(Locale.CHINA, "e西瓜");//chinese
            emotion.putLangText(Locale.TAIWAN, "e西瓜");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127814");//id
            emotion.setFileName("emoji_435_e34a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127814", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "eggplant");//english
            emotion.putLangText(Locale.CHINA, "e茄子");//chinese
            emotion.putLangText(Locale.TAIWAN, "e茄子");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128138");//id
            emotion.setFileName("emoji_436_e30f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128138", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "pills");//english
            emotion.putLangText(Locale.CHINA, "e药丸");//chinese
            emotion.putLangText(Locale.TAIWAN, "e藥丸");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128052");//id
            emotion.setFileName("emoji_511_e01a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128052", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "horse");//english
            emotion.putLangText(Locale.CHINA, "e马");//chinese
            emotion.putLangText(Locale.TAIWAN, "e馬");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128049");//id
            emotion.setFileName("emoji_512_e04f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128049", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cat");//english
            emotion.putLangText(Locale.CHINA, "e猫");//chinese
            emotion.putLangText(Locale.TAIWAN, "e貓");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128025");//id
            emotion.setFileName("emoji_513_e10a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128025", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "octopus");//english
            emotion.putLangText(Locale.CHINA, "e八爪鱼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e八爪魚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128055");//id
            emotion.setFileName("emoji_514_e10b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128055", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "pig");//english
            emotion.putLangText(Locale.CHINA, "e猪");//chinese
            emotion.putLangText(Locale.TAIWAN, "e豬");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128047");//id
            emotion.setFileName("emoji_515_e050");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128047", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "tiger");//english
            emotion.putLangText(Locale.CHINA, "e老虎");//chinese
            emotion.putLangText(Locale.TAIWAN, "e老虎");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128059");//id
            emotion.setFileName("emoji_516_e051");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128059", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "bear");//english
            emotion.putLangText(Locale.CHINA, "e熊");//chinese
            emotion.putLangText(Locale.TAIWAN, "e熊");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128054");//id
            emotion.setFileName("emoji_517_e052");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128054", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "dog");//english
            emotion.putLangText(Locale.CHINA, "e狗");//chinese
            emotion.putLangText(Locale.TAIWAN, "e狗");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128046");//id
            emotion.setFileName("emoji_521_e52b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128046", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cow");//english
            emotion.putLangText(Locale.CHINA, "e牛");//chinese
            emotion.putLangText(Locale.TAIWAN, "e牛");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128048");//id
            emotion.setFileName("emoji_522_e52c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128048", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "rabbit");//english
            emotion.putLangText(Locale.CHINA, "e兔子");//chinese
            emotion.putLangText(Locale.TAIWAN, "e兔子");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128013");//id
            emotion.setFileName("emoji_523_e52d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128013", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "snake");//english
            emotion.putLangText(Locale.CHINA, "e蛇");//chinese
            emotion.putLangText(Locale.TAIWAN, "e蛇");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128045");//id
            emotion.setFileName("emoji_524_e053");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128045", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "mouse");//english
            emotion.putLangText(Locale.CHINA, "e老鼠");//chinese
            emotion.putLangText(Locale.TAIWAN, "e老鼠");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128051");//id
            emotion.setFileName("emoji_525_e054");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128051", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "whale");//english
            emotion.putLangText(Locale.CHINA, "e鲸鱼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e鯨魚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128039");//id
            emotion.setFileName("emoji_526_e055");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128039", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "penguin");//english
            emotion.putLangText(Locale.CHINA, "e企鹅");//chinese
            emotion.putLangText(Locale.TAIWAN, "e企鵝");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128053");//id
            emotion.setFileName("emoji_527_e109");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128053", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "monkey");//english
            emotion.putLangText(Locale.CHINA, "e猴子");//chinese
            emotion.putLangText(Locale.TAIWAN, "e猴子");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128044");//id
            emotion.setFileName("emoji_531_e520");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128044", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "dolphin");//english
            emotion.putLangText(Locale.CHINA, "e海豚");//chinese
            emotion.putLangText(Locale.TAIWAN, "e海豚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128032");//id
            emotion.setFileName("emoji_532_e522");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128032", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "fish");//english
            emotion.putLangText(Locale.CHINA, "e鱼");//chinese
            emotion.putLangText(Locale.TAIWAN, "e魚");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128036");//id
            emotion.setFileName("emoji_533_e523");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128036", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "chicken");//english
            emotion.putLangText(Locale.CHINA, "e小鸡");//chinese
            emotion.putLangText(Locale.TAIWAN, "e小雞");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128040");//id
            emotion.setFileName("emoji_534_e527");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128040", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "koala");//english
            emotion.putLangText(Locale.CHINA, "e考拉");//chinese
            emotion.putLangText(Locale.TAIWAN, "e考拉");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128017");//id
            emotion.setFileName("emoji_535_e529");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128017", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sheep");//english
            emotion.putLangText(Locale.CHINA, "e绵羊");//chinese
            emotion.putLangText(Locale.TAIWAN, "e綿羊");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128056");//id
            emotion.setFileName("emoji_536_e531");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128056", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "frog");//english
            emotion.putLangText(Locale.CHINA, "e青蛙");//chinese
            emotion.putLangText(Locale.TAIWAN, "e青蛙");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127908");//id
            emotion.setFileName("emoji_611_e03c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127908", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sing");//english
            emotion.putLangText(Locale.CHINA, "e唱K");//chinese
            emotion.putLangText(Locale.TAIWAN, "e唱K");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("126980");//id
            emotion.setFileName("emoji_612_e12d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("126980", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "mahjong");//english
            emotion.putLangText(Locale.CHINA, "e麻将");//chinese
            emotion.putLangText(Locale.TAIWAN, "e麻將");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9824");//id
            emotion.setFileName("emoji_613_e20e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9824", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "poker");//english
            emotion.putLangText(Locale.CHINA, "e扑克");//chinese
            emotion.putLangText(Locale.TAIWAN, "e撲克");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9971");//id
            emotion.setFileName("emoji_614_e014");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9971", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "golf");//english
            emotion.putLangText(Locale.CHINA, "e高尔夫");//chinese
            emotion.putLangText(Locale.TAIWAN, "e高爾夫");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127934");//id
            emotion.setFileName("emoji_615_e015");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127934", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "tennis");//english
            emotion.putLangText(Locale.CHINA, "e网球");//chinese
            emotion.putLangText(Locale.TAIWAN, "e網球");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9918");//id
            emotion.setFileName("emoji_616_e016");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9918", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "baseball");//english
            emotion.putLangText(Locale.CHINA, "e棒球");//chinese
            emotion.putLangText(Locale.TAIWAN, "e棒球");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9917");//id
            emotion.setFileName("emoji_617_e018");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9917", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "football");//english
            emotion.putLangText(Locale.CHINA, "e足球");//chinese
            emotion.putLangText(Locale.TAIWAN, "e足球");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127936");//id
            emotion.setFileName("emoji_621_e42a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127936", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "basketball");//english
            emotion.putLangText(Locale.CHINA, "e篮球");//chinese
            emotion.putLangText(Locale.TAIWAN, "e籃球");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127944");//id
            emotion.setFileName("emoji_622_e42b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127944", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "rugby");//english
            emotion.putLangText(Locale.CHINA, "e橄榄球");//chinese
            emotion.putLangText(Locale.TAIWAN, "e橄欖球");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127921");//id
            emotion.setFileName("emoji_623_e42c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127921", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "billiards");//english
            emotion.putLangText(Locale.CHINA, "e台球");//chinese
            emotion.putLangText(Locale.TAIWAN, "e臺球");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127946");//id
            emotion.setFileName("emoji_624_e42d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127946", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "swimming");//english
            emotion.putLangText(Locale.CHINA, "e游泳");//chinese
            emotion.putLangText(Locale.TAIWAN, "e遊泳");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128111");//id
            emotion.setFileName("emoji_625_e429");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128111", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "dance");//english
            emotion.putLangText(Locale.CHINA, "e跳舞");//chinese
            emotion.putLangText(Locale.TAIWAN, "e跳舞");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128663");//id
            emotion.setFileName("emoji_626_e01b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128663", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "TheSmallCar");//english
            emotion.putLangText(Locale.CHINA, "e小车");//chinese
            emotion.putLangText(Locale.TAIWAN, "e小車");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9992");//id
            emotion.setFileName("emoji_627_e01d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9992", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "airplane");//english
            emotion.putLangText(Locale.CHINA, "e飞机");//chinese
            emotion.putLangText(Locale.TAIWAN, "e飛機");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128649");//id
            emotion.setFileName("emoji_631_e039");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128649", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "train");//english
            emotion.putLangText(Locale.CHINA, "e火车");//chinese
            emotion.putLangText(Locale.TAIWAN, "e火車");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9973");//id
            emotion.setFileName("emoji_632_e01c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9973", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "boat");//english
            emotion.putLangText(Locale.CHINA, "e船");//chinese
            emotion.putLangText(Locale.TAIWAN, "e船");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128645");//id
            emotion.setFileName("emoji_633_e435");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128645", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "metro");//english
            emotion.putLangText(Locale.CHINA, "e地铁");//chinese
            emotion.putLangText(Locale.TAIWAN, "e地鐵");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128661");//id
            emotion.setFileName("emoji_634_e15a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128661", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "taxi");//english
            emotion.putLangText(Locale.CHINA, "e出租车");//chinese
            emotion.putLangText(Locale.TAIWAN, "e出租車");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128690");//id
            emotion.setFileName("emoji_635_e136");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128690", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "bicycle");//english
            emotion.putLangText(Locale.CHINA, "e自行车");//chinese
            emotion.putLangText(Locale.TAIWAN, "e自行車");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128640");//id
            emotion.setFileName("emoji_636_e10d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128640", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "rockets");//english
            emotion.putLangText(Locale.CHINA, "e火箭");//chinese
            emotion.putLangText(Locale.TAIWAN, "e火箭");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128148");//id
            emotion.setFileName("emoji_711_e023");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128148", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "heart-broken");//english
            emotion.putLangText(Locale.CHINA, "e心碎");//chinese
            emotion.putLangText(Locale.TAIWAN, "e心碎");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("11088");//id
            emotion.setFileName("emoji_712_e32f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("11088", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "star");//english
            emotion.putLangText(Locale.CHINA, "e星星");//chinese
            emotion.putLangText(Locale.TAIWAN, "e星星");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9728");//id
            emotion.setFileName("emoji_713_e04a");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9728", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sun");//english
            emotion.putLangText(Locale.CHINA, "e太阳");//chinese
            emotion.putLangText(Locale.TAIWAN, "e太陽");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127769");//id
            emotion.setFileName("emoji_714_e04c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127769", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "moon");//english
            emotion.putLangText(Locale.CHINA, "e月亮");//chinese
            emotion.putLangText(Locale.TAIWAN, "e月亮");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128161");//id
            emotion.setFileName("emoji_715_e10f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128161", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "LampBulL");//english
            emotion.putLangText(Locale.CHINA, "e灯泡");//chinese
            emotion.putLangText(Locale.TAIWAN, "e燈泡");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128293");//id
            emotion.setFileName("emoji_716_e11d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128293", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "flame");//english
            emotion.putLangText(Locale.CHINA, "e火焰");//chinese
            emotion.putLangText(Locale.TAIWAN, "e火焰");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128176");//id
            emotion.setFileName("emoji_717_e12f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128176", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "wallet");//english
            emotion.putLangText(Locale.CHINA, "e钱袋");//chinese
            emotion.putLangText(Locale.TAIWAN, "e錢袋");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128137");//id
            emotion.setFileName("emoji_721_e13b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128137", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "TakeAnInjection");//english
            emotion.putLangText(Locale.CHINA, "e打针");//chinese
            emotion.putLangText(Locale.TAIWAN, "e打針");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128164");//id
            emotion.setFileName("emoji_722_e13c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128164", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sleep");//english
            emotion.putLangText(Locale.CHINA, "e睡觉");//chinese
            emotion.putLangText(Locale.TAIWAN, "e睡觉");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9889");//id
            emotion.setFileName("emoji_723_e13d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9889", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "lightning");//english
            emotion.putLangText(Locale.CHINA, "e闪电");//chinese
            emotion.putLangText(Locale.TAIWAN, "e閃電");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128168");//id
            emotion.setFileName("emoji_724_e330");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128168", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "wind");//english
            emotion.putLangText(Locale.CHINA, "e风");//chinese
            emotion.putLangText(Locale.TAIWAN, "e風");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128166");//id
            emotion.setFileName("emoji_725_e331");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128166", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "WaterDrop");//english
            emotion.putLangText(Locale.CHINA, "e水滴");//chinese
            emotion.putLangText(Locale.TAIWAN, "e水滴");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128684");//id
            emotion.setFileName("emoji_726_e30e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128684", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cigarette");//english
            emotion.putLangText(Locale.CHINA, "e香烟");//chinese
            emotion.putLangText(Locale.TAIWAN, "e香煙");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127873");//id
            emotion.setFileName("emoji_727_e112");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127873", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "gift");//english
            emotion.putLangText(Locale.CHINA, "e礼物");//chinese
            emotion.putLangText(Locale.TAIWAN, "e禮物");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9748");//id
            emotion.setFileName("emoji_731_e04b");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9748", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "umbrella");//english
            emotion.putLangText(Locale.CHINA, "e雨伞");//chinese
            emotion.putLangText(Locale.TAIWAN, "e雨傘");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128299");//id
            emotion.setFileName("emoji_732_e113");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128299", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "handgun");//english
            emotion.putLangText(Locale.CHINA, "e手枪");//chinese
            emotion.putLangText(Locale.TAIWAN, "e手槍");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128701");//id
            emotion.setFileName("emoji_733_e140");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128701", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "closestool");//english
            emotion.putLangText(Locale.CHINA, "e马桶");//chinese
            emotion.putLangText(Locale.TAIWAN, "e馬桶");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128677");//id
            emotion.setFileName("emoji_734_e14e");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128677", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "TrafficLight");//english
            emotion.putLangText(Locale.CHINA, "e红绿灯");//chinese
            emotion.putLangText(Locale.TAIWAN, "e紅綠燈");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128089");//id
            emotion.setFileName("emoji_735_e322");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128089", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "underwear");//english
            emotion.putLangText(Locale.CHINA, "e内衣");//chinese
            emotion.putLangText(Locale.TAIWAN, "e內衣");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128344");//id
            emotion.setFileName("emoji_736_e02c");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128344", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "clock");//english
            emotion.putLangText(Locale.CHINA, "e时钟");//chinese
            emotion.putLangText(Locale.TAIWAN, "e時鐘");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128704");//id
            emotion.setFileName("emoji_811_e13f");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128704", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "TakeAShower");//english
            emotion.putLangText(Locale.CHINA, "e沐浴");//chinese
            emotion.putLangText(Locale.TAIWAN, "e沐浴");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127797");//id
            emotion.setFileName("emoji_812_e308");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127797", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "cactus");//english
            emotion.putLangText(Locale.CHINA, "e仙人掌");//chinese
            emotion.putLangText(Locale.TAIWAN, "e仙人掌");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127803");//id
            emotion.setFileName("emoji_813_e305");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127803", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "sunflower");//english
            emotion.putLangText(Locale.CHINA, "e向日葵");//chinese
            emotion.putLangText(Locale.TAIWAN, "e向日葵");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127796");//id
            emotion.setFileName("emoji_814_e307");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127796", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "CoconutTree");//english
            emotion.putLangText(Locale.CHINA, "e椰树");//chinese
            emotion.putLangText(Locale.TAIWAN, "e椰樹");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127975");//id
            emotion.setFileName("emoji_815_e154");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127975", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "aTM");//english
            emotion.putLangText(Locale.CHINA, "eaTM");//chinese
            emotion.putLangText(Locale.TAIWAN, "eaTM");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128702");//id
            emotion.setFileName("emoji_816_e309");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128702", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "Wc");//english
            emotion.putLangText(Locale.CHINA, "eWc");//chinese
            emotion.putLangText(Locale.TAIWAN, "eWc");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("11093");//id
            emotion.setFileName("emoji_817_e332");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("11093", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "O");//english
            emotion.putLangText(Locale.CHINA, "eO");//chinese
            emotion.putLangText(Locale.TAIWAN, "eO");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("10060");//id
            emotion.setFileName("emoji_821_e333");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("10060", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "×");//english
            emotion.putLangText(Locale.CHINA, "e×");//chinese
            emotion.putLangText(Locale.TAIWAN, "e×");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("128162");//id
            emotion.setFileName("emoji_822_e334");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("128162", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "frown");//english
            emotion.putLangText(Locale.CHINA, "e皱眉");//chinese
            emotion.putLangText(Locale.TAIWAN, "e皺眉");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("10068");//id
            emotion.setFileName("emoji_823_e336");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("10068", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "？");//english
            emotion.putLangText(Locale.CHINA, "e？");//chinese
            emotion.putLangText(Locale.TAIWAN, "e？");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("10069");//id
            emotion.setFileName("emoji_824_e337");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("10069", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "！");//english
            emotion.putLangText(Locale.CHINA, "e！");//chinese
            emotion.putLangText(Locale.TAIWAN, "e！");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127744");//id
            emotion.setFileName("emoji_825_e443");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127744", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "SolenoidCoil");//english
            emotion.putLangText(Locale.CHINA, "e螺线圈");//chinese
            emotion.putLangText(Locale.TAIWAN, "e螺線圈");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127974");//id
            emotion.setFileName("emoji_826_e14d");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127974", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "bank");//english
            emotion.putLangText(Locale.CHINA, "e银行");//chinese
            emotion.putLangText(Locale.TAIWAN, "e銀行");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127968");//id
            emotion.setFileName("emoji_827_e036");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127968", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "house");//english
            emotion.putLangText(Locale.CHINA, "e房子");//chinese
            emotion.putLangText(Locale.TAIWAN, "e房子");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("9962");//id
            emotion.setFileName("emoji_831_e037");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("9962", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "church");//english
            emotion.putLangText(Locale.CHINA, "e教堂");//chinese
            emotion.putLangText(Locale.TAIWAN, "e教堂");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127973");//id
            emotion.setFileName("emoji_832_e155");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127973", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "hospital");//english
            emotion.putLangText(Locale.CHINA, "e医院");//chinese
            emotion.putLangText(Locale.TAIWAN, "e醫院");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127978");//id
            emotion.setFileName("emoji_833_e156");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127978", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "ConvenienceStore");//english
            emotion.putLangText(Locale.CHINA, "e便利店");//chinese
            emotion.putLangText(Locale.TAIWAN, "e便利店");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127979");//id
            emotion.setFileName("emoji_834_e157");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127979", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "school");//english
            emotion.putLangText(Locale.CHINA, "e学校");//chinese
            emotion.putLangText(Locale.TAIWAN, "e學校");//taiwan
        }

        {
            Emotion emotion = Emotion.create(stragedyFactory.getFileStragedy(), group.getClass());
            emotion.setId("127977");//id
            emotion.setFileName("emoji_835_e501");//filename
            emotion.setGroupID(group.getId());//groupid
            emotion.setGroupDirName("smiley_emoji");//groupdir
            group.addEmotion("127977", emotion);//id
            emotion.setExt(group.getExt());//groupext
            emotion.setThumbExt("png");//thumbext
            emotionArrayList.add(emotion);
            emotion.putLangText(Locale.ENGLISH, "grogshop");//english
            emotion.putLangText(Locale.CHINA, "e酒店");//chinese
            emotion.putLangText(Locale.TAIWAN, "e酒店");//taiwan
        }

                group.setEmotionArrays(emotionArrayList.toArray(new Emotion[emotionArrayList.size()]));
                groupList.add(group);
        }

        sGroupList = groupList;
    }

    public static ArrayList<Group> getAssetsGroups() {
        return sGroupList;
    }

}
