package com.pig.client.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pig.client.R;
import com.pig.client.adapter.BoarAdapter;
import com.pig.client.view.TitleBar;

public class CommercialPigActivity extends AppCompatActivity {
private TitleBar titleBar = null;
private RecyclerView commercialPigRV = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_pig);


        titleBar = findViewById(R.id.commercialPigTitleBar);
        titleBar.setTitle("商品猪管理");
        titleBar.setMenuIV(R.drawable.add);

        commercialPigRV = findViewById(R.id.commercialPigRV);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(CommercialPigActivity.this);
        commercialPigRV.setLayoutManager(layoutManager);
        commercialPigRV.setAdapter(new BoarAdapter(CommercialPigActivity.this));
        commercialPigRV.addItemDecoration(new DividerItemDecoration(CommercialPigActivity.this,DividerItemDecoration.VERTICAL));

    }
}
