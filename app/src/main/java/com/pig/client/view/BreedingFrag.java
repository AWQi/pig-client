package com.pig.client.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.BoarAddActivity;

import java.util.ArrayList;
import java.util.List;

public class BreedingFrag extends RelativeLayout  implements View.OnClickListener{
private Context context;
private List<String> earlabelList = new ArrayList();
private List<String> pigstyList = new ArrayList();
private List<String> breedWayList = new ArrayList();
private List<String> breederList = new ArrayList<>();
private int selectList ;
private TextView femaleBreedTV;
private TextView maleBreedTV;
private TextView pigstyTV;
private TextView breederTV;
private TextView breedWayTV;
private TextView breedDateTV;
private ListView breedingLV;
private Button commitBtn;
private Button resetBtn;
private FrameLayout selLayout ;
public BreedingFrag(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        RelativeLayout.inflate(context, R.layout.breeding_frag,this);
        init();
    }
    private void init(){
        femaleBreedTV = findViewById(R.id.femaleBreedTV);
        maleBreedTV = findViewById(R.id.maleBreedTV);
        pigstyTV = findViewById(R.id.pigstyTV);
        breederTV = findViewById(R.id.breederTV);
        breedWayTV = findViewById(R.id.breedWayTV);
        breedDateTV = findViewById(R.id.breedDateTV);
        breedingLV = findViewById(R.id.breedingLV);
        commitBtn  =findViewById(R.id.commitBtn);
        resetBtn = findViewById(R.id.resetBtn);
        selLayout = findViewById(R.id.selLayout);

        femaleBreedTV.setOnClickListener(this);
        maleBreedTV.setOnClickListener(this);
        pigstyTV.setOnClickListener(this);
        breederTV.setOnClickListener(this);
        breedWayTV.setOnClickListener(this);
        breedDateTV.setOnClickListener(this);

        setListViewBasedOnChildren(breedingLV);
        breedingLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              breedingLV.setVisibility(GONE);
              String info = ((TextView)view).getText().toString();
                selLayout.setForeground(null);

                switch (selectList){
                  case R.id.femaleBreedTV:
                      femaleBreedTV.setText(info);
                      break;
                  case R.id.maleBreedTV:
                      maleBreedTV.setText(info);
                      break;
                  case R.id.pigstyTV:
                      pigstyTV.setText(info);
                      break;
                  case R.id.breederTV:
                      breederTV.setText(info);
                      break;
                  case R.id.breedWayTV:
                      breedWayTV.setText(info);
                      break;
                  default:break;
              }
            }
        });



        earlabelList.add("AAA");
        earlabelList.add("AAA");
        earlabelList.add("AAA");

        pigstyList.add("BBB");
        pigstyList.add("BBB");
        pigstyList.add("BBB");

        breedWayList.add("CCC");
        breedWayList.add("CCC");
        breedWayList.add("CCC");

        breederList.add("DDD");
        breederList.add("DDD");
        breederList.add("DDD");

    }

    @Override
    public void onClick(View v) {
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.mask);
        selLayout.setForeground(drawable);



        switch (v.getId()){
            case  R.id.femaleBreedTV:
                ArrayAdapter a1 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,earlabelList);
                a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a1);
                breedingLV.setVisibility(VISIBLE);
                selectList = R.id.femaleBreedTV;
                break;
            case  R.id.maleBreedTV:
                ArrayAdapter a2 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,earlabelList);
                a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a2);
                breedingLV.setVisibility(VISIBLE);
                selectList = R.id.maleBreedTV;

                break;
            case  R.id.pigstyTV:
                ArrayAdapter a3 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,pigstyList);
                a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a3);
                breedingLV.setVisibility(VISIBLE);
                selectList = R.id.pigstyTV;

                break;
            case  R.id.breederTV:
                ArrayAdapter a4 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,breederList);
                a4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a4);
                breedingLV.setVisibility(VISIBLE);
                selectList = R.id.breederTV;

                break;
            case  R.id.breedWayTV:
                ArrayAdapter a5 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,breedWayList);
                a5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a5);
                breedingLV.setVisibility(VISIBLE);
                selectList = R.id.breedWayTV;

                break;
            case  R.id.breedDateTV:

                break;
            default:break;

        }
    }

    /**
     *
     *   解决listView  item   wrap_content   问题
     * @param listView
     */
    public void setListViewBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }
        int totalHeight = 0;
        int maxWidth = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
            int width = listItem.getMeasuredWidth();
            if(width>maxWidth)maxWidth = width;
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        params.width = maxWidth;
        listView.setLayoutParams(params);
    }
}
