package com.pig.client.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.pig.client.R;
import com.pig.client.adapter.BoarAdapter;
import com.pig.client.adapter.MainCardRVAdapter;
import com.pig.client.view.AddBoarLayout;
import com.pig.client.view.TitleBar;

public class BoarActivity extends AppCompatActivity {
    private SearchView searchView = null;
    private TitleBar titleBar = null;
    private RecyclerView boarRV = null;
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
                Intent t =  new Intent(BoarActivity.this,BoarAddActivity.class);
                startActivity(t);

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
                     dialog.getWindow().setContentView(layout);


            }
        });
        searchView = findViewById(R.id.boarSearch);
        searchView.setIconifiedByDefault(false);

        boarRV = findViewById(R.id.boarRV);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(BoarActivity.this);
        boarRV.setLayoutManager(layoutManager);
        boarRV.setAdapter(new BoarAdapter(BoarActivity.this));
        boarRV.addItemDecoration(new DividerItemDecoration(BoarActivity.this,DividerItemDecoration.VERTICAL));
    }
}
