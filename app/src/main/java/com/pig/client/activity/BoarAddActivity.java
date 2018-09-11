package com.pig.client.activity;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.pig.client.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BoarAddActivity extends AppCompatActivity implements View.OnClickListener{
private Spinner pigstySpinner  = null;
private Spinner varietySpinner  = null;
private Spinner stateSpinner  = null;

private List<String> pigstyList = new ArrayList<>();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boar_add);

        pigstySpinner = findViewById(R.id.pigstySpinner);
        pigstyList.add("123");
        pigstyList.add("142");
        pigstyList.add("784");
        pigstyList.add("624");
        pigstyAdapter = new ArrayAdapter<String>(BoarAddActivity.this, android.R.layout.simple_spinner_item,pigstyList);
        pigstyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pigstySpinner.setAdapter(pigstyAdapter);


        varietySpinner = findViewById(R.id.varietySpinner);
        varietyList.add("123");
        varietyList.add("142");
        varietyList.add("784");
        varietyList.add("624");
        varietyAdapter = new ArrayAdapter<String>(BoarAddActivity.this, android.R.layout.simple_spinner_item,varietyList);
        varietyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        varietySpinner.setAdapter(varietyAdapter);


        stateSpinner = findViewById(R.id.stateSpinner);
        stateList.add("123");
        stateList.add("142");
        stateList.add("784");
        stateList.add("624");
        stateAdapter = new ArrayAdapter<String>(BoarAddActivity.this, android.R.layout.simple_spinner_item,stateList);
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
                new DatePickerDialog(BoarAddActivity.this, new DatePickerDialog.OnDateSetListener() {
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
}
