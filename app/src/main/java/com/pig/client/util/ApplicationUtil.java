package com.pig.client.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;

import com.pig.client.R;
import com.pig.client.activity.PigstyActivity;
import com.pig.client.websocket.PersistentConnection;


public class ApplicationUtil extends Application {
    private static final String TAG = "ApplicationUtil";
    private static Context context;
//    private static User user;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    static  public Context getContext(){
        return  context;
    }
    public static String getTopActivity(Context context){
        ActivityManager am = (ActivityManager) context.getSystemService(context.ACTIVITY_SERVICE);
        ComponentName cn = am.getRunningTasks(1).get(0).topActivity;
        Log.d("Chunna.zheng", "pkg:"+cn.getPackageName());//包名
        Log.d("Chunna.zheng", "cls:"+cn.getClassName());//包名加类名
        return cn.getClassName();
    }
}
