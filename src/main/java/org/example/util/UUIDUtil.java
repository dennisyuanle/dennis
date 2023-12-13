package org.example.util;

import java.util.UUID;

/**
 * 生成uuid
 * 
 * @author
 *
 */
public final class UUIDUtil {

    /**
     * 生成uuid字符串
     * 
     * @param isLowerCase
     *            true=小写，false=大写
     * @return
     */
    public static String generateUUID(boolean isLowerCase) {
        String uuid = UUID.randomUUID().toString();
        if (isLowerCase) {
            return uuid.toLowerCase();
        } else {
            return uuid.toUpperCase();
        }
    }

    /**
     * 生成uuid字符串
     * 
     * @param isLowerCase
     *            true=小写，false=大写
     * @param justLetter
     *            true=只显示字母，false=不做处理
     * @return
     */
    public static String generateUUID(boolean isLowerCase, boolean justLetter) {
        String uuid = generateUUID(isLowerCase);
        if (justLetter) {
            uuid = uuid.replaceAll("-", "");
        }
        return uuid;
    }
}
