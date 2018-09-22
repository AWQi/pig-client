package com.pig.client.util;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String TAG = "DateUtil";

   public static Date stringToDate(String s){
        java.text.SimpleDateFormat   formatter   =
                new SimpleDateFormat( "yyyy-MM-dd ");
       Date date   = null;
       try {
           date = formatter.parse(s);
       } catch (ParseException e) {
           e.printStackTrace();
           Log.d(TAG, "DateStringToDate: "+e.getMessage());
       }
       return  date;
    }
 public  static  String dateToString(Date date){
     java.text.SimpleDateFormat   formatter   =
             new   SimpleDateFormat( "yyyy-MM-dd ");
     String s = formatter.format(date);//格式化数据
     return  s;
 }
public  static  Date longToDate(long l){
//    Date date = java.sql.Date.valueOf(long);//Long-->Date
    Date date = new Date(l);//Long-->Date（常用）
    return date;
}
 public  static String longToString(long l){
     Date date = new Date(l);//Long-->Date（常用）
     java.text.SimpleDateFormat   formatter   =
             new   SimpleDateFormat( "yyyy-MM-dd ");
     String s = formatter.format(date);//格式化数据
     return  s;
 }

    public  static long stringToLong(String s){
        java.text.SimpleDateFormat   formatter   =
                new SimpleDateFormat( "yyyy-MM-dd");
        Date date   = null;
        try {
            date = formatter.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            Log.d(TAG, "DateStringToDate: "+e.getMessage());
        }
        return  date.getTime();

    }

}
