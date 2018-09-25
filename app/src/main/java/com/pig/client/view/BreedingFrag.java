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
import android.widget.Toast;

import com.pig.client.R;
import com.pig.client.activity.BoarAddActivity;
import com.pig.client.pojo.Breeder;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.pojo.Pigsty;
import com.pig.client.pojo.SwineBreeding;
import com.pig.client.util.DateUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreedingFrag extends Fragment implements View.OnClickListener{
private Context context;
private List<String> earlabelList = new ArrayList();
private List<Pigsty> pigstyList = new ArrayList();
private List<String> pigstyNameList = new ArrayList<>();

private List<String> breedWayList = new ArrayList();
private List<Breeder> breederList = new ArrayList<>();
private List<String>breederNameList = new ArrayList<>();
private List<BreedingPig> breedingPigList = new ArrayList<>();
private int selectList ;
private EditText femaleBreedTV;
private EditText maleBreedTV;
private TextView pigstyTV;
private TextView breederTV;
private TextView breedWayTV;
private TextView breedDateTV;
private ListView breedingLV;
private Button commitBtn;
private Button resetBtn;
private FrameLayout selLayout ;
private EditText addDescribeET;
private Activity activity;
private BreedingPig breedingPig;
private Fragment fragment  = this;
private RelativeLayout breedingLL;


//    public BreedingFrag(Context context, BreedingPig breedingPig) {
//        this.context = context;
//        this.breedingPig = breedingPig;
//    }
//
//    public BreedingFrag(Context context) {
//        this.context = context;
//    }

    public BreedingFrag() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.breeding_frag, container, false);

        Bundle bundle = getArguments();
        breedingPig = bundle.getParcelable("BreedingPig");
        femaleBreedTV = rootView.findViewById(R.id.femaleBreedTV);
        maleBreedTV = rootView.findViewById(R.id.maleBreedTV);
        pigstyTV = rootView.findViewById(R.id.pigstyTV);
        breederTV = rootView.findViewById(R.id.breederTV);
        breedWayTV = rootView.findViewById(R.id.breedWayTV);
        breedDateTV = rootView.findViewById(R.id.breedDateTV);
        breedingLV = rootView.findViewById(R.id.breedingLV);
        commitBtn  =rootView.findViewById(R.id.commitBtn);
        resetBtn = rootView.findViewById(R.id.resetBtn);
        selLayout = rootView.findViewById(R.id.selLayout);
        addDescribeET = rootView.findViewById(R.id.addDescribeET);
        breedingLL = rootView.findViewById(R.id.breedingLL);
        if (breedingPig.getGender()==0){ //母
            femaleBreedTV.setText(String.valueOf(breedingPig.getEarlabel()));
            femaleBreedTV.setFocusable(View.NOT_FOCUSABLE);
//            Map params = new HashMap();
//            params.put("gender","1");
//            PigHttpUtil.queryBreedByGender(params, new PigHttpUtil.PigListCallBack(PigHttpUtil.BREED_LIST_TYPE) {
//                @Override
//                public void analyticData(final PigResult.PigList pigList) {
//                    List list =  pigList.getData();
//                    breedingPigList.addAll(list);
//                    for (BreedingPig b:breedingPigList){
//                        earlabelList.add(b.getEarlabel());
//                    }
//                }
//            });
        }else if (breedingPig.getGender()==1){//公
            maleBreedTV.setText(String.valueOf(breedingPig.getEarlabel()));
            maleBreedTV.setFocusable(View.NOT_FOCUSABLE);
        }

        //    加载fragment
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        context = getContext();
//        Bundle bundle = getArguments();
//        breedingPig =  savedInstanceState.getParcelable("BreedingPig");
        init();
    }

    private void init(){


//  猪舍

                PigHttpUtil.queryAllPigsty(new PigHttpUtil.PigListCallBack(PigHttpUtil.PIGSTY_LIST_TYPE) {
                    @Override
                    public void analyticData(final PigResult.PigList pigList) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                List list = pigList.getData();
                                pigstyList.addAll(list);
                                for (int i = 0;i<pigstyList.size();i++){
                                    pigstyNameList.add(pigstyList.get(i).getName());
                                }
                            }
                        });
                    }
                });

// 配种员

                PigHttpUtil.queryAllBreeder(new PigHttpUtil.PigListCallBack(PigHttpUtil.BREEDER_LIST_TYPE) {
                    @Override
                    public void analyticData(final PigResult.PigList pigList) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                List list = pigList.getData();
                                breederList.addAll(list);
                                for (int i = 0;i<breederList.size();i++){
                                    breederNameList.add(breederList.get(i).getName());
                                }
                            }
                        });
                    }
                });




//        femaleBreedTV.setOnClickListener(this);
//        maleBreedTV.setOnClickListener(this);
        pigstyTV.setOnClickListener(this);
        breederTV.setOnClickListener(this);
        breedWayTV.setOnClickListener(this);
        breedDateTV.setOnClickListener(this);





        setListViewBasedOnChildren(breedingLV);
        breedingLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              breedingLV.setVisibility(View.GONE);
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


        final int maxNum = 50;
        final TextView leftNum = (TextView) activity.findViewById(R.id.leftNum);
        addDescribeET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                leftNum.setText("剩余字数："+ (maxNum-s.length()));
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });



//        earlabelList.add("AAA");
//        earlabelList.add("AAA");
//        earlabelList.add("AAA");

//        pigstyList.add("BBB");
//        pigstyList.add("BBB");
//        pigstyList.add("BBB");

        breedWayList.add("本交");
        breedWayList.add("人工授精");
        breedWayList.add("深部受精");
//
//        breederList.add("DDD");
//        breederList.add("DDD");
//        breederList.add("DDD");
        /**
         *
         *   提交
         * @param
         */
        commitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SwineBreeding swineBreeding = new SwineBreeding();
                swineBreeding.setBreeder(getBreeder());
                swineBreeding.setBreederDate(getBreederDate());
                swineBreeding.setBreederWay(getBreederWay());
                swineBreeding.setEarlabelFemale(getEarlabelFemale());
                swineBreeding.setEarlabelMale(getEarlabelFemale());
                swineBreeding.setPigId(getPigId());
                swineBreeding.setPigstyMessage(getPigstyMessage());
                swineBreeding.setRemark(getRemark());
                PigHttpUtil.commitSwineBreeding(swineBreeding, new PigHttpUtil.PigObjCallBack(PigHttpUtil.STRING_TYPE) {
                    @Override
                    public void analyticData(PigResult.PigObj pigObj) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(context,"添加成功",Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
            }
        });



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
                breedingLV.setVisibility(View.VISIBLE);
                selectList = R.id.femaleBreedTV;
                break;
            case  R.id.maleBreedTV:
                ArrayAdapter a2 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,earlabelList);
                a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a2);
                breedingLV.setVisibility(View.VISIBLE);
                selectList = R.id.maleBreedTV;

                break;
            case  R.id.pigstyTV:
                ArrayAdapter a3 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,pigstyNameList);
                a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a3);
                breedingLV.setVisibility(View.VISIBLE);
                selectList = R.id.pigstyTV;

                break;
            case  R.id.breederTV:
                ArrayAdapter a4 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,breederNameList);
                a4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a4);
                breedingLV.setVisibility(View.VISIBLE);
                selectList = R.id.breederTV;

                break;
            case  R.id.breedWayTV:
                ArrayAdapter a5 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,breedWayList);
                a5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                breedingLV.setAdapter(a5);
                breedingLV.setVisibility(View.VISIBLE);
                selectList = R.id.breedWayTV;

                break;
            case  R.id.breedDateTV:
                Calendar calendar = Calendar.getInstance();
                // 日期对话框
                new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        breedDateTV.setText(i + "-" + (i1 + 1) + "-" + i2);
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


   public int getPigId(){
        return  breedingPig.getId();
   }
   public  String getEarlabelFemale(){
        return  femaleBreedTV.getText().toString();
   }
   public String getEarlabelMale(){
        return  maleBreedTV.getText().toString();
   }
   public  int getPigstyMessage(){
        for (Pigsty p: pigstyList){
            if (p.getName().equals(pigstyTV.getText().toString())){
                return p.getId();
            }
        }
        return  0;
   }
   public  int getBreeder(){
        for (Breeder b:breederList){
            if (b.getName().equals(breederTV.getText().toString())){
                return b.getId();
            }
        }
        return  0;
   }
   public  String getBreederWay(){
        return  breedWayTV.getText().toString();
   }
   public  long getBreederDate(){
        return DateUtil.stringToLong(breedDateTV.getText().toString());
   }

  public  String getRemark(){
        return  addDescribeET.getText().toString();
  }

}
