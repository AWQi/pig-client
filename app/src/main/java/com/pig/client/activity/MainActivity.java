package com.pig.client.activity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.SurfaceView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.pig.client.R;
import com.pig.client.adapter.MainCardRVAdapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
private  RecyclerView mainCardRV = null;
private ImageView fgIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCardRV = findViewById(R.id.mainCardRV);
        GridLayoutManager layoutManager  = new GridLayoutManager(MainActivity.this,2);
        mainCardRV.setLayoutManager(layoutManager);
        mainCardRV.setAdapter(new MainCardRVAdapter(MainActivity.this));
        mainCardRV.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));


         fgIV = findViewById(R.id.fgIV);
//         Glide.with(MainActivity.this).load("file:///pig.gif")
//                 .asGif().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(fgSV);

//        Glide.with(this).load("file:///pig.gif").asGif().into(fgSV);

        Glide.with(this).load(R.drawable.pig).asGif().into(fgIV);


    }



}
