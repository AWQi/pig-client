package com.pig.client.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pig.client.R;


public class TitleBar extends LinearLayout{
    private ImageView retIV = null;
    private TextView titleTV = null;
    private ImageView menuIV= null;
    private  Context context = null;
    public TitleBar(final Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.titlebar,this);
        retIV  = this.findViewById(R.id.retIV);
        titleTV = this.findViewById(R.id.titleTV);
        menuIV = this.findViewById(R.id.menuIV);
        retIV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).finish();
            }
        });
    }
    void setRetIV(int id){
        this.retIV.setImageResource(id);
    }
    void  setMenuOnClick(OnClickListener listener){
        this.menuIV.setOnClickListener(listener);
    }
    void  setTitle(String title){
        this.titleTV.setText(title);
    }
    void  setMenuIV(int id){
        this.menuIV.setImageResource(id);
    }
    void init(){

    }
}
