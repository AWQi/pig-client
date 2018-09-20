package com.pig.client.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.pig.client.R;
import com.pig.client.activity.MainActivity;

public class NotificationUtil {

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
       builder.setContentTitle("title");
       builder.setContentText("content title");
       //                builder.setNumber(3); //久按桌面图标时允许的此条通知的数量
       // 4、 绑定  layout
       RemoteViews rv = new RemoteViews(context.getPackageName(),R.layout.boar_item);






       /* 更改视图内容  */




       //rv.setTextViewText(R.id.title,"泡沫");//修改自定义View中的歌名
       //修改自定义View中的图片(两种方法)
       //rv.setImageViewResource(R.id.iv,R.mipmap.ic_launcher);
       // rv.setImageViewBitmap(R.id.poster, BitmapFactory.decodeResource(getResources(),R.drawable.music));
       builder.setContent(rv);
       //  5、 创建  notification
       Notification notification = builder.build();
       // 6、发送通知
       notificationManager.notify(0,notification);

//                //删除NotificationChannel
//                NotificationChannel mChannel =manager.getNotificationChannel(id);
//                manager.deleteNotificationChannel(mChannel);
    }


}
