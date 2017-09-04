package com.prototype.utils;

import org.springframework.util.DigestUtils;

/**
 * MD5加密工具类
 */
public class MDfiveUtil {

    private static String slat = "as#2%(1~!@safsoww2-0--*r41";

    private MDfiveUtil() {
    }

    private static MDfiveUtil mDfiveUtil = new MDfiveUtil();

    public static String getMD5(String password){
        String base = password + "/" +slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
