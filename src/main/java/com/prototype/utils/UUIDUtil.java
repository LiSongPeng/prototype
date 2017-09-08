package com.prototype.utils;

import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * UUID工具类，自动生成UUID
 */
public class UUIDUtil {

    private UUIDUtil(){
    }

    private static UUIDUtil uuidUtil = new UUIDUtil();

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        //return uuid.replaceAll("-", "");
        return uuid;
    }
}
