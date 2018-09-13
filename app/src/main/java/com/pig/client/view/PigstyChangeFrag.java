package com.pig.client.view;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pig.client.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PigstyChangeFrag extends Fragment implements View.OnClickListener{
    private Context context;
    private List<String> pigstyList = new ArrayList();
    private int selectList ;
    private TextView earlabelTV;
    private TextView pigstyTV;
    private TextView changeTypeTV;
    private TextView desPigstyTV;
    private TextView changeDateTV;
    private ListView pigstyChangeLV;
    private Button commitBtn;
    private Button resetBtn;
    private FrameLayout selLayout ;
    private Activity activity;

    public PigstyChangeFrag(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pigsty_change_frag,container,false);
        return  rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        init();
    }

    //    public PigstyChangeFrag(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        this.context = context;
//        RelativeLayout.inflate(context, R.layout.pigsty_change_frag,this);
//        init();
//    }
    private void init(){

        earlabelTV = activity.findViewById(R.id.earlabelTV);
        pigstyTV = activity.findViewById(R.id.pigstyTV);
        changeTypeTV = activity.findViewById(R.id.changeTypeTV);
        desPigstyTV = activity.findViewById(R.id.desPigstyTV);
        changeDateTV = activity.findViewById(R.id.changeDateTV);
        pigstyChangeLV = activity.findViewById(R.id.pigstyChangeLV);
        selLayout = activity.findViewById(R.id.selLayout);


        desPigstyTV.setOnClickListener(this);
        changeDateTV.setOnClickListener(this);


        setListViewBasedOnChildren(pigstyChangeLV);
        pigstyChangeLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pigstyChangeLV.setVisibility(View.GONE);
                String info = ((TextView)view).getText().toString();
                selLayout.setForeground(null);
                switch (selectList){
                    case R.id.desPigstyTV:
                        desPigstyTV.setText(info);
                        break;
                    default:break;
                }
            }
        });

        pigstyList.add("AAA");
        pigstyList.add("AAA");
        pigstyList.add("AAA");


    }

    @Override
    public void onClick(View v) {
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.mask);
        selLayout.setForeground(drawable);
        selectList = v.getId();


        switch (v.getId()){
            case  R.id.desPigstyTV:
                ArrayAdapter a1 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,pigstyList);
                a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                pigstyChangeLV.setAdapter(a1);
                pigstyChangeLV.setVisibility(View.VISIBLE);
                break;

            case  R.id.changeDateTV:
                Calendar calendar = Calendar.getInstance();
                // 日期对话框
                new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        changeDateTV.setText(i + "-" + (i1 + 1) + "-" + i2);
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
