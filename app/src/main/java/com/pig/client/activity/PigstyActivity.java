package com.pig.client.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.adapter.GuardilAdapter;
import com.pig.client.view.TitleBar;

public class PigstyActivity extends AppCompatActivity {
private TitleBar titleBar ;
private RecyclerView pigstyRV;
private TextView totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pigsty);
        titleBar = findViewById(R.id.titleBar);
        titleBar.setTitle("存栏信息");
        titleBar.setMenuIV(R.drawable.add);


        pigstyRV = findViewById(R.id.pigstyRV);
        GridLayoutManager layoutManager = new GridLayoutManager(PigstyActivity.this,2);
        pigstyRV.setLayoutManager(layoutManager);
        GuardilAdapter adapter = new GuardilAdapter(PigstyActivity.this);
        pigstyRV.setAdapter(adapter);


    }
}