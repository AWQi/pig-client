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
import android.widget.Toast;

import com.pig.client.R;
import com.pig.client.activity.BoarAddActivity;
import com.pig.client.pojo.CommercialPig;
import com.pig.client.pojo.Sale;
import com.pig.client.util.DateUtil;
import com.pig.client.util.PigHttpUtil;
import com.pig.client.util.PigResult;

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
    private EditText customerAddrET;
    private  EditText customerTelET;
    private TextView salesDateTV;

    private Button commitBtn;
    private Button resetBtn;
    private FrameLayout selLayout ;
    private Activity activity;
    private CommercialPig commercialPig;

    public SaleFrag() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       Bundle bundle  = getArguments();
       commercialPig = bundle.getParcelable("CommericalPig");
        View rootView = inflater.inflate(R.layout.sale_frag,container,false);
        earlabelTV = rootView.findViewById(R.id.earlabelTV);
        pigTypeTV = rootView.findViewById(R.id.pigTypeTV);
        pigstyTV = rootView.findViewById(R.id.pigstyTV);
        numberET = rootView.findViewById(R.id.numberET);
        totalWeightET = rootView.findViewById(R.id.totalWeightET);
        unitPriceET = rootView.findViewById(R.id.unitPriceET);
        salesDateTV = rootView.findViewById(R.id.salesDateTV);
        selLayout = rootView.findViewById(R.id.selLayout);

        customerNameET = rootView.findViewById(R.id.customerNameET);
        customerAddrET = rootView.findViewById(R.id.customerAddrET);
        customerTelET = rootView.findViewById(R.id.customerTelET);

        commitBtn = rootView.findViewById(R.id.commitBtn);

        earlabelTV.setText(commercialPig.getEarlabel());
        pigstyTV.setText(commercialPig.getPigstyName());
        pigTypeTV.setText(commercialPig.getPigType());
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();
        context = getContext();
        init();
    }


    private void init(){

        salesDateTV.setOnClickListener(this);
        commitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Sale sale = new Sale();
                    sale.setCustomerAddress(getCustomerAddr());
                    sale.setCustomerName(getCustomerName());
                    sale.setCustomerTel(getCustomTel());
                    sale.setEarlabel(getEarlabel());
                    sale.setNumber(getNumber());
                    sale.setPigstyMessage(getPigsty());
                    sale.setPigType(getPigType());
                    sale.setSalesDate(getSalesDate());
                    sale.setTotalWeight((float) getTotalWeight());
                    sale.setUnitPrice((float) getUnitPrice());
                    PigHttpUtil.commitSale(sale, new PigHttpUtil.PigObjCallBack(PigHttpUtil.STRING_TYPE) {
                        @Override
                        public void analyticData(PigResult.PigObj pigObj) {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(context,"添加订单成功",Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(context,"数据错误,请重新输入",Toast.LENGTH_SHORT).show();
                }
            }
        });
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
     public   int getEarlabel(){
          return   commercialPig.getBatchNumber();
        }
     public  int getPigsty(){
        return  commercialPig.getPigstyMessage();
     }
     public  String getPigType(){
        return  commercialPig.getPigType();
     }
     public  int getUnitPrice(){
        return  Integer.parseInt(unitPriceET.getText().toString());
     }
     public  int getNumber(){
        return  Integer.parseInt(numberET.getText().toString());
     }
    public  int getTotalWeight(){
        return  Integer.parseInt(totalWeightET.getText().toString());
    }
    public  String getCustomerName(){
        return  customerNameET.getText().toString();
    }
    public  String getCustomerAddr(){
        return  customerAddrET.getText().toString();
    }
    public  String getCustomTel(){
        return  customerTelET.getText().toString();
    }
    public  long getSalesDate(){
        return DateUtil.stringToLong(salesDateTV.getText().toString());
    }

}
