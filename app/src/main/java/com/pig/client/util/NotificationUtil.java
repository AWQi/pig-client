package com.pig.client.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.pig.client.R;
import com.pig.client.activity.MainActivity;
import com.pig.client.activity.PigstyActivity;

public class NotificationUtil extends BroadcastReceiver {
    static  private  Notification notification;

    public static Notification getNotification() {
        return notification;
    }

    static  public  void sendNotification(Context context){
       // 1、创建 manger
       NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
       // 2、 创建  NotificationChannel（通知渠道） android 新特性
       NotificationChannel channel = new NotificationChannel("1",
               "Channel1", NotificationManager.IMPORTANCE_DEFAULT);
       channel.enableLights(true); //是否在桌面icon右上角展示小红点
       channel.setLightColor(Color.GREEN); //小红点颜色
       channel.setShowBadge(true); //是否在久按桌面图标时显示此渠道的通知
       notificationManager.createNotificationChannel(channel);
       //  3、 创建 Builder
       NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"1");
       builder.setSmallIcon(R.drawable.icon);
       builder.setContentTitle("警告");
       builder.setContentText("猪舍温湿度异常");

        /**
         *   绑定点击事件
         *
         */
        Intent intent=  new Intent(context,PigstyActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(ApplicationUtil.getContext(),0,intent,0);
        builder.setContentIntent(pendingIntent);



        //                builder.setNumber(3); //久按桌面图标时允许的此条通知的数量
       // 4、 绑定  layout
//       RemoteViews rv = new RemoteViews(context.getPackageName(),R.layout.boar_item);






       /* 更改视图内容  */




       //rv.setTextViewText(R.id.title,"泡沫");//修改自定义View中的歌名
       //修改自定义View中的图片(两种方法)
       //rv.setImageViewResource(R.id.iv,R.mipmap.ic_launcher);
       // rv.setImageViewBitmap(R.id.poster, BitmapFactory.decodeResource(getResources(),R.drawable.music));
//       builder.setContent(rv);
       //  5、 创建  notification
        notification = builder.build();

        /**
         *
         * 绑定删除通知时 的事件
         */
        Intent deleteIntent = new Intent(context,NotificationUtil.class);
        deleteIntent.setAction(Intent.ACTION_DELETE);
        notification.deleteIntent = PendingIntent.getBroadcast(ApplicationUtil.getContext(),0,deleteIntent,0);


        // 6、发送通知
       notificationManager.notify(0,notification);

//                //删除NotificationChannel
//                NotificationChannel mChannel =manager.getNotificationChannel(id);
//                manager.deleteNotificationChannel(mChannel);
    }


    public static final String TYPE = "type"; //这个type是为了Notification更新信息的，这个不明白的朋友可以去搜搜，很多


    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int type = intent.getIntExtra(TYPE, -1);
        if (action.equals(Intent.ACTION_DELETE)){
            notification=null;
        }
//        if (type != -1) {
//            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//            notificationManager.cancel(type);
//        }
//
//        if (action.equals("notification_clicked")) {
//            //处理点击事件
//        }
//
//        if (action.equals("notification_cancelled")) {
//            //处理滑动清除和点击删除事件
//        }

    }



    //系统提示音
    public static void startAlarm(Context context) {
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        if (notification == null) return;
        Ringtone r = RingtoneManager.getRingtone(context, notification);
        r.play();
    }

}

