package com.pig.client.websocket;


import android.os.Handler;
import android.os.Message;

public class SocketHandlerManage {
static  private Handler mInstance ;

    public Handler getInstance() {
        if (mInstance==null){
            mInstance = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    switch (msg.what){
                    }
                }
            };
        }
        return mInstance;
    }
}
