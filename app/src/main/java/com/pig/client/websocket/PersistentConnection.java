package com.pig.client.websocket;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;


import com.pig.client.util.ApplicationUtil;
import com.pig.client.util.JsonUtil;
import com.pig.client.util.MacAddressUtil;
import com.pig.client.util.NotificationUtil;

import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.logging.LogRecord;


public class PersistentConnection{
    private static final String TAG = "PersistentConnection";
//    public static final String WEBSOCKET_ARRD = "ws://10.155.26.107:8887";
//    public static final String WEBSOCKET_ARRD = "ws://192.168.137.1:8887";
    public static final String WEBSOCKET_ARRD = "ws://10.0.2.2:8887";
    private static PersistentConnection mInstance;
    private ReconnectingWSClient mSocketClient;
    static  public   Handler handler;

    public static PersistentConnection getInstance() {
        if (mInstance == null) {
            synchronized (PersistentConnection.class) {
                if (mInstance == null) {
                    mInstance = new PersistentConnection();
                }
            }
        }
        return mInstance;
    }

    private PersistentConnection() {
        //
    }


    public void init(final Activity activity)
    {
       handler = new Handler();

        try {

            mSocketClient = new ReconnectingWSClient(new URI(WEBSOCKET_ARRD),new Draft_17())
            {

                @Override
                public void onOpenEvent(ServerHandshake handshakedata) {

                    Log.d("picher_log", "打开通道" + handshakedata.getHttpStatus());
                    //handler.obtainMessage(0, message).sendToTarget();
                    ClientMsg msg = new ClientMsg();
                    msg.setEventType("online");
                    msg.setMsg(MacAddressUtil.getLocalMacAddress());
                    mSocketClient.send(JsonUtil.ObjToStr(msg));
                }
                @Override
                public void onErrorEvent(Exception ex) {
                    Log.d("", "发生错误: "+ex.getMessage());
                }

                @Override
                public void onMessageEvent(String messageStr) {
//                    Log.d(TAG, "接收消息------------------------------: "+messageStr);
                    ClientMsg message = JsonUtil.StrToObj(messageStr,ClientMsg.class);
                    switch (message.getEventType()){
                        case ClientMsg.EVENT_ONLINE:
                                activity.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(ApplicationUtil.getContext(),"设备已上线",Toast.LENGTH_SHORT).show();
                                    }
                                });
                                break;
                        case ClientMsg.EVENT_RFID:
//                            NotificationUtil.sendNotification(ApplicationUtil.getContext());
                            if (ApplicationUtil.getTopActivity(ApplicationUtil.getContext())
                                    .equals("com.pig.client.activity.BoarActivity")){
                                Message m1 = new Message();
                                m1.what = 1;
                                Bundle b1 = new Bundle();
                                b1.putString("earlabel",message.getMsg());
                                m1.setData(b1);
                                handler.sendMessage(m1);
                            }
                            break;
                        case ClientMsg.EVENT_ZIGBEE:
                            if (ApplicationUtil.getTopActivity(ApplicationUtil.getContext())
                                    .equals("com.pig.client.activity.PigstyActivity")){
                                Message m2 = new Message();
                                m2.what = 2;
                                Bundle b1 = new Bundle();
                                b1.putString("date",message.getMsg());
                                m2.setData(b1);
                                handler.sendMessage(m2);
                            }
                            break;
                    }

                }
            };
            mSocketClient.connect();
        }catch (Exception e) { }

    }

     public void close(){
       if (!mSocketClient.isClosed()){
            mSocketClient.close();
        }

    }

}
