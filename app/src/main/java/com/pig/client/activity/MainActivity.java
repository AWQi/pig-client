package com.pig.client.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pig.client.R;
import com.pig.client.adapter.MainCardRVAdapter;

public class MainActivity extends AppCompatActivity {
private  RecyclerView mainCardRV = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCardRV = findViewById(R.id.mainCardRV);
        GridLayoutManager layoutManager  = new GridLayoutManager(MainActivity.this,2);
        mainCardRV.setLayoutManager(layoutManager);
        mainCardRV.setAdapter(new MainCardRVAdapter(MainActivity.this));
        mainCardRV.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));



    }
}
