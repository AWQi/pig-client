package com.pig.client.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pig.client.R;
import com.pig.client.adapter.BoarAdapter;
import com.pig.client.adapter.CommericalPigAdapter;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;
import com.pig.client.view.TitleBar;

import java.util.List;

public class CommercialPigActivity extends AppCompatActivity {
private TitleBar titleBar = null;
private RecyclerView commercialPigRV = null;
private Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_pig);


        titleBar = findViewById(R.id.commercialPigTitleBar);
        titleBar.setTitle("商品猪管理");
        titleBar.setMenuIV(R.drawable.add);

        commercialPigRV = findViewById(R.id.commercialPigRV);

        new Thread(new Runnable() {
            @Override
            public void run() {
                PigHttpUtil.queryAllCommerical(new PigHttpUtil.PigListCallBack(PigHttpUtil.COMMERICAL_LIST_TYPE) {
                    @Override
                    public void analyticData(PigResult.PigList pigList) {
                       final List list =  pigList.getData();
                       activity.runOnUiThread(new Runnable() {
                           @Override
                           public void run() {
                               LinearLayoutManager layoutManager  = new LinearLayoutManager(CommercialPigActivity.this);
                               commercialPigRV.setLayoutManager(layoutManager);
                               commercialPigRV.setAdapter(new CommericalPigAdapter(CommercialPigActivity.this,list));
                               commercialPigRV.addItemDecoration(new DividerItemDecoration(CommercialPigActivity.this,DividerItemDecoration.VERTICAL));
                           }
                       });

                    }
                });
            }
        }).start();

    }
}
