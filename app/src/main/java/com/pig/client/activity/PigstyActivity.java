package com.pig.client.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pig.client.R;
import com.pig.client.adapter.BoarAdapter;
import com.pig.client.adapter.GuardilAdapter;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.pojo.Pigsty;
import com.pig.client.util.JsonUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;
import com.pig.client.view.CircleTextView;
import com.pig.client.view.TitleBar;
import com.pig.client.websocket.ClientMsg;
import com.pig.client.websocket.PersistentConnection;
import com.pig.client.websocket.ZigbeeDate;

import java.util.ArrayList;
import java.util.List;

public class PigstyActivity extends AppCompatActivity implements CircleTextView.CircleTextViewClickListener{
    private static final String TAG = "PigstyActivity";
private TitleBar titleBar ;
private RecyclerView pigstyRV;
private TextView totalTV;
private Activity activity = this;
private  List<Pigsty> list = new ArrayList<>();
private  GuardilAdapter adapter  ;
private CircleTextView light;
private CircleTextView temperature;
private CircleTextView humidity;
private CircleTextView breeding;

    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigsty);

        light = findViewById(R.id.light);
        temperature = findViewById(R.id.temperature);
        humidity = findViewById(R.id.humidity);
        breeding = findViewById(R.id.breeding);
        light.setCircleTextViewClickListener(this);
        temperature.setCircleTextViewClickListener(this);
        humidity.setCircleTextViewClickListener(this);
        breeding.setCircleTextViewClickListener(this);

        titleBar = findViewById(R.id.titleBar);
        titleBar.setTitle("存栏信息");
        titleBar.setMenuIV(R.drawable.add);


        pigstyRV = findViewById(R.id.pigstyRV);
        new Thread(new Runnable() {
            @Override
            public void run() {
                PigHttpUtil.queryAllPigsty(new PigHttpUtil.PigListCallBack(PigHttpUtil.PIGSTY_LIST_TYPE) {
                    @Override
                    public void analyticData(final PigResult.PigList pigList) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                list = pigList.getData();
                                GridLayoutManager layoutManager = new GridLayoutManager(PigstyActivity.this,2);
                                pigstyRV.setLayoutManager(layoutManager);
                                 adapter = new GuardilAdapter(PigstyActivity.this,list);
                                pigstyRV.setAdapter(adapter);

                            }
                        });

                    }
                });
            }
        }).start();

        PersistentConnection.handler =  new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case  2:
                            Bundle bundle = msg.getData();
                            String date =  bundle.getString("date");
                            ZigbeeDate zigbeeDate = JsonUtil.StrToObj(date,ZigbeeDate.class);
                            Log.d(TAG, "handleMessage: zigbeeDate "+zigbeeDate.toString());
                           if(zigbeeDate.address.equals("86CD")){// 继电器
                            light.setOnCLick((zigbeeDate.di&0x01)!=0?true:false);
                            temperature.setOnCLick((zigbeeDate.di&0x02)!=0?true:false);
                            humidity.setOnCLick((zigbeeDate.di&0x04)!=0?true:false);
                            breeding.setOnCLick((zigbeeDate.di&0x08)!=0?true:false);
                           }else { //温湿度
                               for (int i  =0 ;i<list.size();i++){
                                   if (list.get(i).getAddress().equals(zigbeeDate.address)){
                                       if (zigbeeDate.type.equals("01")){
                                           Log.d(TAG, "温度-------------: "+zigbeeDate.df);
                                           list.get(i).setTemperature(zigbeeDate.df);
                                           pigstyRV.getAdapter().notifyItemChanged(i);

                                       }else if(zigbeeDate.type.equals("02")) {
                                           Log.d(TAG, "湿度: "+zigbeeDate.df);
                                           list.get(i).setHumidity(zigbeeDate.df);
                                           pigstyRV.getAdapter().notifyItemChanged(i);
                                       }

                                   }
                               }
                           }


                        break;

                }
            }
        };

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PersistentConnection.getInstance().close();
    }


    @Override
    public void click(CircleTextView circleTextView) {

        int b = 0x00;
        b = b|(light.isOnCLick()?0x01:0x00);
        b = b|(temperature.isOnCLick()?0x02:0x00);
        b = b|(humidity.isOnCLick()?0x04:0x00);
        b = b|(breeding.isOnCLick()?0x08:0x00);
        String s = String.valueOf(b);
        Log.d(TAG, "click: =================================================="+s);
        ZigbeeDate zigbeeDate  = new ZigbeeDate("86CD","01",0,b);
        ClientMsg clientMsg = new ClientMsg();
        clientMsg.setEventType(ClientMsg.EVENT_ZIGBEE);
        clientMsg.setMsg(JsonUtil.ObjToStr(zigbeeDate));
        PersistentConnection.getInstance().sendMessage(clientMsg);
    }

}
