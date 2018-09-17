package com.pig.client.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.adapter.GuardilAdapter;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;
import com.pig.client.view.TitleBar;

import java.util.List;

public class PigstyActivity extends AppCompatActivity {
private TitleBar titleBar ;
private RecyclerView pigstyRV;
private TextView totalTV;
private Activity activity = this;

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
                                List list = pigList.getData();
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



    }
}
