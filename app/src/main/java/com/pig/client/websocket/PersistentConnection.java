package com.pig.client.websocket;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;


import com.pig.client.util.ApplicationUtil;
import com.pig.client.util.JsonUtil;
import com.pig.client.util.MacAddressUtil;

import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;


public class PersistentConnection{
    private static final String TAG = "PersistentConnection";
    public static final String WEBSOCKET_ARRD = "ws://10.0.2.2:8887";
    private static PersistentConnection mInstance;
    private ReconnectingWSClient mSocketClient;


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


    public void init(final Context context)
    {

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
                public void onMessageEvent(String message) {
                    Log.d(TAG, "接收消息------------------------------: "+message);
                    ClientMsg msg = JsonUtil.StrToObj(message,ClientMsg.class);
                    if (msg.getEventType().equals("online")){
                        Toast.makeText(context,msg.msg,Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "onMessageEvent: ");
                    }

                }
            };


            /*mSocketClient = new WebSocketClient(new URI(DomainDefine.WEBSOCKET_ARRD), new Draft_17()) {
                @Override
                public void onOpen(ServerHandshake handshakedata) {
                    Log.d("picher_log", "打开通道" + handshakedata.getHttpStatus());
                    //handler.obtainMessage(0, message).sendToTarget();
                    mSocketClient.send("online001");
                }

                @Override
                public void onMessage(String message) {


                    Log.d("picher_log", "接收消息" + message);

                    if(message.startsWith("eventcode"))
                    {
                        String[] strSplit = message.split("eventcode");

                        Log.d("DEMO",strSplit[1]);

                        Bundle bundle = new Bundle();
                        bundle.putInt("intvalue",Integer.valueOf(strSplit[1]));
                        VMessageDispatcher.getInstance().dispatchMessage(RobotConst.COMMON_CODE,bundle);
                    }
                    else {


                        if (TextUtils.equals(message, "今天过来路上堵吗") || TextUtils.equals(message, "您是第几次来我们公司啊")) {
                            AIEngine.getInstance().processTTS(message);
                            AIEngine.getInstance().setCallback(internalCallback);
                        } else {
                            AIEngine.getInstance().processTTS(message);
                            AIEngine.getInstance().setCallback(null);
                        }
                    }


                            *//*Message msg = Message.obtain();
                            msg.what = ON_MSG_RECEIVED;
                            String strMsg ="接收消息" + message;
                            msg.obj = strMsg;
                            mHandler.sendMessage(msg);*//*
                    //handler.obtainMessage(0, message).sendToTarget();
                }

                @Override
                public void onClose(int code, String reason, boolean remote) {
                    Log.d("picher_log", "通道关闭");
                    //handler.obtainMessage(0, message).sendToTarget();
                }

                @Override
                public void onError(Exception ex) {
                    Log.d("picher_log", "链接错误");
                    //长连接，连接异常重连
                    //mSocketClient.connect();

                }
            };*/
            mSocketClient.connect();
        }catch (Exception e)
        {
            //
        }

    }

     public void close(){
       if (!mSocketClient.isClosed()){
            mSocketClient.close();
        }

    }

}
