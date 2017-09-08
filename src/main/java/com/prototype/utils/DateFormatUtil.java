package com.prototype.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

    private DateFormatUtil(){
    }

    private static DateFormatUtil dateFormatUtil = new DateFormatUtil();

    public static Date StringFormatDate(String str){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            // Fri Feb 24 00:00:00 CST 2012
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 2012-02-24
        date = java.sql.Date.valueOf(str);
        return date;
    }

    public static String DateFormatString(Date date,String type){
        String str = null;

//        -----2017-09-05
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String str = format.format(date);
//        ---------
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (type.equals("SHORT")) {
            // 07-1-18
            format = DateFormat.getDateInstance(DateFormat.SHORT);
            str = format.format(date);
        } else if (type.equals("MEDIUM")) {
            // 2007-1-18
            format = DateFormat.getDateInstance(DateFormat.MEDIUM);
            str = format.format(date);
        } else if (type.equals("FULL")) {
            // 2007年1月18日 星期四
            format = DateFormat.getDateInstance(DateFormat.FULL);
            str = format.format(date);
        }
        return str;
    }

}
