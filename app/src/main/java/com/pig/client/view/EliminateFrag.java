package com.pig.client.view;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.BoarAddActivity;
import com.pig.client.pojo.BreedingPig;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EliminateFrag extends Fragment implements View.OnClickListener{
    private Context context;
    private List<String> eliminateTypeList = new ArrayList();
    private List<String> eliminateReasonList = new ArrayList();
    private int selectList ;
    private TextView earlabelTV;
    private TextView pigTypeTV;
    private TextView pigstyTV;
    private TextView eliminateStageTV;
    private TextView eliminateTypeTV;
    private TextView eliminateReasonTV;
    private EditText numberET;
    private EditText totalWeightET;
    private TextView eliminateDateTV;

    private ListView eliminateLV;
    private Button commitBtn;
    private Button resetBtn;
    private FrameLayout selLayout ;
    private Activity activity;
    private BreedingPig breedingPig;

    public EliminateFrag(Context context, BreedingPig breedingPig) {
        this.context = context;
        this.breedingPig = breedingPig;
    }

    public EliminateFrag(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView =  inflater.inflate(R.layout.eliminate_frag,container,false);
       return  rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        init();
    }

//    public EliminateFrag(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        this.context = context;
//        RelativeLayout.inflate(context, R.layout.eliminate_frag,this);
//       init();
//    }
    private void init(){

        earlabelTV = activity.findViewById(R.id.earlabelTV);
        pigTypeTV = activity.findViewById(R.id.pigTypeTV);
        pigstyTV = activity.findViewById(R.id.pigstyTV);
        eliminateStageTV = activity.findViewById(R.id.eliminateStageTV);
        eliminateTypeTV = activity.findViewById(R.id.eliminateTypeTV);
        eliminateReasonTV = activity.findViewById(R.id.eliminateReasonTV);
        numberET = activity.findViewById(R.id.numberET);
        totalWeightET = activity.findViewById(R.id.totalWeightET);
        eliminateDateTV = activity.findViewById(R.id.eliminateDateTV);
        eliminateLV = activity.findViewById(R.id.eliminateLV);
        selLayout = activity.findViewById(R.id.selLayout);


        eliminateTypeTV.setOnClickListener(this);
        eliminateReasonTV.setOnClickListener(this);
        eliminateDateTV.setOnClickListener(this);


        setListViewBasedOnChildren(eliminateLV);
        eliminateLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                eliminateLV.setVisibility(View.GONE);
                String info = ((TextView)view).getText().toString();
                selLayout.setForeground(null);

                switch (selectList){
                    case R.id.eliminateTypeTV:
                        eliminateTypeTV.setText(info);
                        break;
                    case R.id.eliminateReasonTV:
                        eliminateReasonTV.setText(info);
                        break;
                    default:break;
                }
            }
        });




        eliminateTypeList.add("AAA");
        eliminateTypeList.add("AAA");
        eliminateTypeList.add("AAA");

        eliminateReasonList.add("BBB");
        eliminateReasonList.add("BBB");
        eliminateReasonList.add("BBB");


    }

    @Override
    public void onClick(View v) {
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.mask);
        selLayout.setForeground(drawable);
        selectList = v.getId();


        switch (v.getId()){
            case  R.id.eliminateTypeTV:
                ArrayAdapter a1 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,eliminateTypeList);
                a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                eliminateLV.setAdapter(a1);
                eliminateLV.setVisibility(View.VISIBLE);
                break;
            case  R.id.eliminateReasonTV:
                ArrayAdapter a2 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,eliminateReasonList);
                a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                eliminateLV.setAdapter(a2);
                eliminateLV.setVisibility(View.VISIBLE);
                break;
            case  R.id.eliminateDateTV:
                Calendar calendar = Calendar.getInstance();
                // 日期对话框
                new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        eliminateDateTV.setText(i + "-" + (i1 + 1) + "-" + i2);
                        selLayout.setForeground(null);
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();

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
