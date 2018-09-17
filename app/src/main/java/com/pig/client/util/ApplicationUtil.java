package com.pig.client.util;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatDelegate;

import com.pig.client.R;




public class ApplicationUtil extends Application {
    private static Context context;
//    private static User user;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
//        LitePal.initialize(context);
//        registerReceiver();
    }
    static  public Context getContext(){
        return  context;
    }

//    public static User getUser() {
//        return user;
//    }
//    public static void setUser(User user) {
//        ApplicationUtil.user = user;
//    }
//    /**
//     * 初始化夜间模式
//     */
//    static  public void exchangeNightMode() {
//        nightMode = !nightMode;
//        AppCompatDelegate.setDefaultNightMode(nightMode ?
//                AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
//    }
//
//
//    public void registerReceiver() {
//       IntentFilter filter  = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
//       ConnectionChangeReceiver mReceiver = new ConnectionChangeReceiver();
//        this.registerReceiver(mReceiver,filter);
//    }
}
