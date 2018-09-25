package com.pig.client.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
import android.widget.Toast;

import com.pig.client.R;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.pojo.ChangePigstyBreed;
import com.pig.client.pojo.ChangePigstyCommercial;
import com.pig.client.pojo.CommercialPig;
import com.pig.client.pojo.Pigsty;
import com.pig.client.util.DateUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class PigstyChangeFrag extends Fragment implements View.OnClickListener{
    private Context context;
    private List<Pigsty> pigstyList = new ArrayList();
    private List<String> pigstyNameList = new ArrayList<>();
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
    private BreedingPig breedingPig = null;
    private CommercialPig commercialPig = null;
    private  Bundle bundle;
    public PigstyChangeFrag() {

    }

//    public PigstyChangeFrag(Context context, BreedingPig breedingPig) {
//        this.context = context;
//        this.breedingPig = breedingPig;
//    }
//
//    public PigstyChangeFrag(Context context, CommercialPig commercialPig) {
//        this.context = context;
//        this.commercialPig = commercialPig;
//    }
//
//    public PigstyChangeFrag(Context context) {
//        this.context = context;
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();

        breedingPig =  bundle.getParcelable("BreedingPig");
        commercialPig = bundle.getParcelable("CommericalPig");
        View rootView = inflater.inflate(R.layout.pigsty_change_frag,container,false);
        earlabelTV = rootView.findViewById(R.id.earlabelTV);
        pigstyTV = rootView.findViewById(R.id.pigstyTV);
        changeTypeTV = rootView.findViewById(R.id.changeTypeTV);
        desPigstyTV = rootView.findViewById(R.id.desPigstyTV);
        changeDateTV = rootView.findViewById(R.id.changeDateTV);
        pigstyChangeLV = rootView.findViewById(R.id.pigstyChangeLV);
        selLayout = rootView.findViewById(R.id.selLayout);
        commitBtn = rootView.findViewById(R.id.commitBtn);


        if (breedingPig!=null){
            earlabelTV.setText(String.valueOf(breedingPig.getEarlabel()));
            pigstyTV.setText(String.valueOf(breedingPig.getPigstyName()));
            changeTypeTV.setText("个体");
        }
        if (commercialPig!=null){
            earlabelTV.setText(String.valueOf(commercialPig.getEarlabel()));
            pigstyTV.setText(String.valueOf(commercialPig.getPigstyName()));
            changeTypeTV.setText("群体");
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
                if (breedingPig!=null){
                    ChangePigstyBreed changePigstyBreed = new ChangePigstyBreed();
                    changePigstyBreed.setEarlabel(breedingPig.getId());
                    changePigstyBreed.setOutPigsty(breedingPig.getPigstyMessage());
                    changePigstyBreed.setInPigsty(getInPigsty());
                    changePigstyBreed.setTurngroupDate(getChangeDate());
                    PigHttpUtil.exchangePigstyBreeding(changePigstyBreed, new PigHttpUtil.PigObjCallBack(PigHttpUtil.STRING_TYPE) {
                        @Override
                        public void analyticData(PigResult.PigObj pigObj) {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(context,"转舍成功",Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    });
                }
                if (commercialPig!=null){
                    ChangePigstyCommercial changePigstyCommercial = new ChangePigstyCommercial();
                    changePigstyCommercial.setBatchNumber(commercialPig.getBatchNumber());
                    changePigstyCommercial.setDate(getChangeDate());
                    changePigstyCommercial.setInPigsty(getInPigsty());
                    changePigstyCommercial.setOutPigsty(commercialPig.getPigstyMessage());
                    PigHttpUtil.exchangePigstyCommercial(changePigstyCommercial, new PigHttpUtil.PigObjCallBack(PigHttpUtil.STRING_TYPE) {
                        @Override
                        public void analyticData(PigResult.PigObj pigObj) {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(context,"转舍成功",Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    });
                }
            }
        });

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


        //  猪舍
        new Thread(new Runnable() {
            @Override
            public void run() {
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
            }
        }).start();


    }

    @Override
    public void onClick(View v) {
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.mask);
        selLayout.setForeground(drawable);
        selectList = v.getId();


        switch (v.getId()){
            case  R.id.desPigstyTV:
                ArrayAdapter a1 = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,pigstyNameList);
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
    public int   getInPigsty(){
        for (Pigsty p : pigstyList){
            if (p.getName().equals(desPigstyTV.getText().toString())){
                return p.getId();
            }
        }
        return  0;
    }
    public  long getChangeDate(){
        return  DateUtil.stringToLong(changeDateTV.getText().toString());
    }
}
