package com.pig.client.util;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String TAG = "DateUtil";

   public static Date StringToDate(String s){
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
 public  static  String DateToString(Date date){
     java.text.SimpleDateFormat   formatter   =
             new   SimpleDateFormat( "yyyy-MM-dd ");
     String s = formatter.format(new Date());//格式化数据
     return  s;
 }
}
