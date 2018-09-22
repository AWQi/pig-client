package com.pig.client.view;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.BoarAddActivity;
import com.pig.client.pojo.Pigsty;
import com.pig.client.util.DateUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;
import com.pig.client.util.XMLUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AddBoarLayout extends LinearLayout implements View.OnClickListener{
    private List<String> pigstyNameList = new ArrayList<>();

    public AddBoarLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        LinearLayout.inflate(context,R.layout.activity_boar_add,this);
        init();
    }

    public AddBoarLayout(Context context) {
        super(context);
        this.context = context;
        LinearLayout.inflate(context,R.layout.activity_boar_add,this);
        init();
    }
    private EditText earlabelET = null;
    private Context context = null;
    private Spinner pigstySpinner  = null;
    private Spinner varietySpinner  = null;
    private Spinner stateSpinner  = null;

    private List<Pigsty> pigstyList = new ArrayList<>();
    private List<String> varietyList = new ArrayList<>();
    private List<String> stateList = new ArrayList<>();
    private ArrayAdapter<String> pigstyAdapter ;
    private ArrayAdapter<String> varietyAdapter ;
    private ArrayAdapter<String> stateAdapter ;


    private ImageView birthdayIV = null;
    private ImageView entergroupdayIV = null;
    private Integer calenderSelect  = R.id.birthdayIV;
    private TextView birthdayTV = null;
    private TextView entergroupdayTV = null;
    private CalendarView calendar = null;
    private RadioGroup genderRG = null;

    protected void init() {

        earlabelET = findViewById(R.id.earlabelET);
        genderRG  = findViewById(R.id.genderRG);
        genderRG.check(0);

        pigstySpinner = findViewById(R.id.pigstySpinner);
//        pigstyList = XMLUtil.analysisMapXml(context,"");
//        pigstyNameList.add("123");
//        pigstyNameList.add("142");
//        pigstyNameList.add("784");
//        pigstyNameList.add("624");
        new Thread(new Runnable() {
            @Override
            public void run() {
                PigHttpUtil.queryAllPigsty(new PigHttpUtil.PigListCallBack(PigHttpUtil.PIGSTY_LIST_TYPE) {
                    @Override
                    public void analyticData(final PigResult.PigList pigList) {
                        ((Activity)context).runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                List list = pigList.getData();
                                pigstyList.addAll(list);
                                for (int i = 0;i<pigstyList.size();i++){
                                    pigstyNameList.add(pigstyList.get(i).getName());
                                }
                                pigstyAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,pigstyNameList);
                                pigstyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                pigstySpinner.setAdapter(pigstyAdapter);
                            }
                        });
                    }
                });
            }
        }).start();




        varietySpinner = findViewById(R.id.varietySpinner);
        varietyList =  XMLUtil.analysisMapXml(context,"varietyinfo.xml");
//        varietyList.add("123");
//        varietyList.add("142");
//        varietyList.add("784");
//        varietyList.add("624");
        varietyAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,varietyList);
        varietyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        varietySpinner.setAdapter(varietyAdapter);


        stateSpinner = findViewById(R.id.stateSpinner);
        stateList =  XMLUtil.analysisMapXml(context,"stateinfo.xml");

//        stateList.add("123");
//        stateList.add("142");
//        stateList.add("784");
//        stateList.add("624");
        stateAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,stateList);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(stateAdapter);

//        calendar = findViewById(R.id.calendar);
        birthdayIV = findViewById(R.id.birthdayIV);
        entergroupdayIV = findViewById(R.id.entergroupdayIV);
        birthdayTV = findViewById(R.id.birthdayTV);
        entergroupdayTV = findViewById(R.id.entergroupdayTV);
        birthdayIV.setOnClickListener(this);
        entergroupdayIV.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        calenderSelect = v.getId();
//        calendar.setVisibility(View.VISIBLE);

        Calendar calendar = Calendar.getInstance();
        // 日期对话框
        new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
//                        ((TextView)v).setText(i + "-" + (i1 + 1) + "-" + i2);
                switch (calenderSelect){
                    case R.id.birthdayIV:birthdayTV.setText(i + "-" + (i1 + 1) + "-" + i2);break;
                    case R.id.entergroupdayIV:entergroupdayTV.setText(i + "-" + (i1 + 1) + "-" + i2);break;
                    default:break;
                }

            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
    public String getEarlabel(){
        return earlabelET.getText().toString();
    }
    public  int getPigsty(){
        for (Pigsty pigsty:pigstyList){
            if (pigstySpinner.getSelectedItem().toString().equals(pigsty.getName())){
                return  pigsty.getId();
            }
        }
        return  0;
    }
    public String getVariety(){
        return  varietySpinner.getSelectedItem().toString();
    }
    public  String getState(){
        return  stateSpinner.getSelectedItem().toString();
    }
    public  long getBirthDay(){
        return   DateUtil.stringToLong(birthdayTV.getText().toString());
    }
    public  long getEntergroupday(){
        return DateUtil.stringToLong(entergroupdayTV.getText().toString());
    }
    public int getGender(){
        return genderRG.getCheckedRadioButtonId();
    }
}
