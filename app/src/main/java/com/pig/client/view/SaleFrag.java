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
import android.util.Log;
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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SaleFrag extends Fragment implements View.OnClickListener{
    private Context context;
    private int selectList ;
    private TextView earlabelTV;
    private TextView pigTypeTV;
    private TextView pigstyTV;

    private EditText unitPriceET;
    private EditText  numberET;
    private EditText totalWeightET;
    private EditText customerNameET;
    private  EditText customerTelET;
    private TextView salesDateTV;

    private Button commitBtn;
    private Button resetBtn;
    private FrameLayout selLayout ;
    private Activity activity;

    public SaleFrag(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sale_frag,container,false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        init();
    }

//    public SaleFrag(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        this.context = context;
//        RelativeLayout.inflate(context, R.layout.sale_frag,this);
//        init();
//    }
    private void init(){

        earlabelTV = activity.findViewById(R.id.earlabelTV);
        pigTypeTV = activity.findViewById(R.id.pigTypeTV);
        pigstyTV = activity.findViewById(R.id.pigstyTV);
        numberET = activity.findViewById(R.id.numberET);
        totalWeightET = activity.findViewById(R.id.totalWeightET);
        salesDateTV = activity.findViewById(R.id.salesDateTV);
        selLayout = activity.findViewById(R.id.selLayout);

        salesDateTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("", "onClick: ");
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.mask);
        selLayout.setForeground(drawable);
        selectList = v.getId();


        switch (v.getId()){
            case  R.id.salesDateTV:
                Calendar calendar = Calendar.getInstance();
                // 日期对话框
                new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        salesDateTV.setText(i + "-" + (i1 + 1) + "-" + i2);
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
