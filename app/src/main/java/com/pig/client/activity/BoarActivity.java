package com.pig.client.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.pig.client.R;
import com.pig.client.adapter.BoarAdapter;
import com.pig.client.adapter.MainCardRVAdapter;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;
import com.pig.client.view.AddBoarLayout;
import com.pig.client.view.BreedingFrag;
import com.pig.client.view.TitleBar;
import com.pig.client.websocket.PersistentConnection;

import java.util.ArrayList;
import java.util.List;

public class BoarActivity extends AppCompatActivity {
    private static final String TAG = "BoarActivity";
    private SearchView searchView = null;
    private TitleBar titleBar = null;
    private ImageView refreshIV ;
    private ImageView selIV;
    private boolean isSel = false;
    private RecyclerView boarRV = null;
    private Activity activity = this;
    private List<BreedingPig> list = new ArrayList<>();
    private List<BreedingPig> thisPig = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boar);
        titleBar = findViewById(R.id.boarTitleBar);
        titleBar.setTitle("种猪管理");
        titleBar.setMenuIV(R.drawable.add);
        titleBar.setMenuOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent t =  new Intent(BoarActivity.this,BoarAddActivity.class);
//                startActivity(t);

//                LayoutInflater layoutInflater = LayoutInflater.from(BoarActivity.this); //context
//                LinearLayout layout = (LinearLayout) layoutInflater.inflate(R.layout.activity_boar_add, null);//自定义的layout

                final AddBoarLayout layout  = new AddBoarLayout(BoarActivity.this);
                Dialog dialog = new AlertDialog.Builder(BoarActivity.this)
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //  do  something
                                layout.getEarlabel();
                                layout.getPigsty();
                                layout.getVariety();
                                layout.getState();
                                layout.getBirthDay();
                                layout.getEntergroupday();

                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //  do   something
                            }
                        })
                        .setView(layout)
                        .create();
                     dialog.show();
//                     dialog.getWindow().setContentView(layout);


            }
        });
        searchView = findViewById(R.id.boarSearch);
        searchView.setIconifiedByDefault(false);

        selIV = findViewById(R.id.selIV);
        selIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSel = !isSel;
                if (isSel){

                }else {

                }
            }
        });
        refreshIV = findViewById(R.id.refreshIV);
        refreshIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boarRV.swapAdapter(new BoarAdapter(list,BoarActivity.this),true);
            }
        });
        boarRV = findViewById(R.id.boarRV);
        queryAllBoarding();

        PersistentConnection.handler =  new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case  1:
                        if (isSel){
                            Bundle bundle = msg.getData();
                            String earlabel =  bundle.getString("earlabel");
                            for (BreedingPig b :list){
                                if (b.getEarlabel().equals(earlabel)){
                                    thisPig.clear();
                                    thisPig.add(b);
                                    boarRV.swapAdapter(new BoarAdapter(thisPig,BoarActivity.this),true);
//                                ((BoarAdapter)boarRV.getAdapter()).refresh(thisPig);
//                                boarRV.invalidate();
                                }
                            }
                        }
                        break;

                }
            }
        };


    }

    public  void  queryAllBoarding(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                PigHttpUtil.queryAllBreed(new PigHttpUtil.PigListCallBack(PigHttpUtil.BREED_LIST_TYPE) {
                    @Override
                    public void analyticData(final PigResult.PigList pigList) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                list =  pigList.getData();
                                LinearLayoutManager layoutManager  = new LinearLayoutManager(BoarActivity.this);
                                boarRV.setLayoutManager(layoutManager);
                                boarRV.setAdapter(new BoarAdapter(list,BoarActivity.this));
                                boarRV.addItemDecoration(new DividerItemDecoration(BoarActivity.this,DividerItemDecoration.VERTICAL));
                            }
                        });

                    }
                });
            }
        }).start();
    }
}
