package com.pig.client.activity;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.adapter.BoarAdapter;
import com.pig.client.adapter.GuardilAdapter;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.pojo.Pigsty;
import com.pig.client.util.JsonUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;
import com.pig.client.view.TitleBar;
import com.pig.client.websocket.PersistentConnection;
import com.pig.client.websocket.ZigbeeDate;

import java.util.ArrayList;
import java.util.List;

public class PigstyActivity extends AppCompatActivity {
    private static final String TAG = "PigstyActivity";
private TitleBar titleBar ;
private RecyclerView pigstyRV;
private TextView totalTV;
private Activity activity = this;
private  List<Pigsty> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigsty);

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
                                GuardilAdapter adapter = new GuardilAdapter(PigstyActivity.this,list);
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
                            for (Pigsty p :list){
                                if (p.getAddress().equals(zigbeeDate.address)){
                                    if (zigbeeDate.type.equals("01")){
                                        Log.d(TAG, "温度-------------: "+zigbeeDate.date);
                                        p.setTemperature(zigbeeDate.date);
                                        pigstyRV.getAdapter().notifyDataSetChanged();
                                    }else if(zigbeeDate.type.equals("02")) {
                                        Log.d(TAG, "湿度: "+zigbeeDate.date);
                                        p.setHumidity(zigbeeDate.date);
                                        pigstyRV.getAdapter().notifyDataSetChanged();
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
}
