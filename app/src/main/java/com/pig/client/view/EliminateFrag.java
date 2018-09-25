package com.pig.client.view;

import android.annotation.SuppressLint;
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
import android.widget.Toast;

import com.pig.client.R;
import com.pig.client.activity.BoarAddActivity;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.pojo.CommercialPig;
import com.pig.client.pojo.Eliminate;
import com.pig.client.pojo.Pigsty;
import com.pig.client.util.DateUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;

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
    private CommercialPig commercialPig;

//    public EliminateFrag(Context context, BreedingPig breedingPig) {
//        this.context = context;
//        this.breedingPig = breedingPig;
//        this.commercialPig=null;
//    }
//
//    public EliminateFrag(Context context, CommercialPig commercialPig) {
//        this.context = context;
//        this.commercialPig = commercialPig;
//        this.breedingPig = null;
//
//    }
//
//    public EliminateFrag(Context context) {
//        this.context = context;
//    }


    public EliminateFrag() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.eliminate_frag,container,false);

        Bundle bundle = getArguments();

        breedingPig = bundle.getParcelable("BreedingPig");
        commercialPig = bundle.getParcelable("CommericalPig");
        earlabelTV = rootView.findViewById(R.id.earlabelTV);
        pigTypeTV = rootView.findViewById(R.id.pigTypeTV);
        pigstyTV = rootView.findViewById(R.id.pigstyTV);
        eliminateStageTV = rootView.findViewById(R.id.eliminateStageTV);
        eliminateTypeTV = rootView.findViewById(R.id.eliminateTypeTV);
        eliminateReasonTV = rootView.findViewById(R.id.eliminateReasonTV);
        numberET = rootView.findViewById(R.id.numberET);
        totalWeightET = rootView.findViewById(R.id.totalWeightET);
        eliminateDateTV = rootView.findViewById(R.id.eliminateDateTV);
        eliminateLV = rootView.findViewById(R.id.eliminateLV);
        selLayout = rootView.findViewById(R.id.selLayout);
        commitBtn = rootView.findViewById(R.id.commitBtn);



        if (breedingPig!=null){
            earlabelTV.setText(breedingPig.getEarlabel());
            pigTypeTV.setText(breedingPig.getPigType());
            pigstyTV.setText(breedingPig.getPigstyName());
            eliminateStageTV.setText(breedingPig.getPigState());
        }
        if (commercialPig!=null){
            earlabelTV.setText(commercialPig.getEarlabel());
            pigTypeTV.setText(commercialPig.getPigType());
            pigstyTV.setText(commercialPig.getPigstyName());
//            eliminateStageTV.setText(breedingPig.get);
        }

       return  rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        context = getContext();
        init();
    }

    private void init(){
        commitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Eliminate eliminate = new Eliminate();
                eliminate.setEarlabel(getEarlabel());
                eliminate.setEliminateDate(getEliminateDate());
                eliminate.setEliminateReason(eliminateReasonTV.getText().toString());
                eliminate.setEliminateStage(eliminateStageTV.getText().toString());
                eliminate.setNumber(Integer.parseInt(numberET.getText().toString()));
                eliminate.setEliminateType(eliminateTypeTV.getText().toString());
                eliminate.setPigstyMessage(getEliminatePigsty());
                eliminate.setPigType(getPigType());
                eliminate.setTotalWeight(Float.parseFloat(totalWeightET.getText().toString()));
                PigHttpUtil.commitEliminate(eliminate, new PigHttpUtil.PigObjCallBack(PigHttpUtil.STRING_TYPE) {
                    @Override
                    public void analyticData(PigResult.PigObj pigObj) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(context,"死淘成功",Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
            }
        });
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




        eliminateTypeList.add("淘汰");
        eliminateTypeList.add("死亡");




        eliminateReasonList.add("应激性疾病");
        eliminateReasonList.add("非疾病死亡");
        eliminateReasonList.add("败血型疾病");
        eliminateReasonList.add("呼吸系统疾病");
        eliminateReasonList.add("腹泻死亡");
        eliminateReasonList.add("其他");


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
    public  int getEarlabel(){
            if (breedingPig!=null){
                return  breedingPig.getId();
            }
            if (commercialPig!=null){
                return  commercialPig.getBatchNumber();
            }
            return  0;
    }
    public  long getEliminateDate(){
        return DateUtil.stringToLong(eliminateDateTV.getText().toString());
    }
   public int getEliminatePigsty(){
       if (breedingPig!=null){
           return  breedingPig.getPigstyMessage();
       }
       if (commercialPig!=null){
           return  commercialPig.getPigstyMessage();
       }
       return  0;
    }
    public String getPigType(){
        if (breedingPig!=null){
            return  breedingPig.getPigType();
        }
        if (commercialPig!=null){
            return  commercialPig.getPigType();
        }
        return  null;
    }
}
