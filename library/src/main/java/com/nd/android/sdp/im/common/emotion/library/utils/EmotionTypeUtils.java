package com.nd.android.sdp.im.common.emotion.library.utils;

import com.nd.android.sdp.im.common.emotion.library.bean.Group;

/**
 * 类型或运算
 *
 * @author Young
 */
public class EmotionTypeUtils {

    public static final String TEXT_PIC_STR = "TEXT_PIC";
    public static final String PIC_STR = "PIC";
    public static final String EMOJI_STR = "EMOJI";

    public static final int TEXT_PIC = 2;
    public static final int EMOJI = 4;
    public static final int PIC = 8;
    public static final int ALL_TYPE = TEXT_PIC | EMOJI | PIC;

    /**
     * 类型字符串转整形
     *
     * @param pStrValue the p str value
     * @return the int
     * @author Young
     */
    public static int strToInt(String pStrValue) {
        if (TEXT_PIC_STR.equals(pStrValue)) {
            return TEXT_PIC;
        }
        if (PIC_STR.equals(pStrValue)) {
            return PIC;
        }
        if (EMOJI_STR.equals(pStrValue)) {
            return EMOJI;
        }
        return 0;
    }

    /**
     * 分组是否符合
     *
     * @param pGroup the p group
     * @param pType  the p type
     * @return the boolean
     * @author Young
     */
    public static boolean typeMatch(Group pGroup, int pType) {
        return pGroup.getType() == (pType & pGroup.getType());
    }

    /**
     * All match.
     *
     * @param pType the p type
     * @return the boolean
     * @author Young
     */
    public static boolean allMatch(int pType) {
        return ALL_TYPE == (pType & ALL_TYPE);
    }

}
