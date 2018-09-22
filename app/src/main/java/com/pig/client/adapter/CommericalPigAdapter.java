package com.pig.client.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.CommericalPigOperaActivity;
import com.pig.client.pojo.CommercialPig;
import com.pig.client.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

public class CommericalPigAdapter extends RecyclerView.Adapter {
    private List<CommercialPig> commercialPigsList = new ArrayList<>();
    private Context context;
    public CommericalPigAdapter(Context context, List list) {
        this.context = context;
        this.commercialPigsList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View boarItem = LayoutInflater.from(context).inflate(R.layout.commercial_pig_item,viewGroup,false);
        CommericalPigHolder holder = new CommericalPigHolder(boarItem);
        return holder;
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        CommericalPigHolder holder = (CommericalPigHolder) viewHolder;
        final CommercialPig commercialPig = commercialPigsList.get(i);
        holder.batchTV.setText(commercialPig.getEarlabel());
        holder.numberTV.setText(String.valueOf(commercialPig.getNumber()));
        holder.typeTV.setText(commercialPig.getPigType());
        holder.pigstyTV.setText(String.valueOf(commercialPig.getPigstyMessage()));
        holder.businessDateTV.setText(DateUtil.longToString(commercialPig.getBusinessDate()));
        holder.ageTV.setText(String.valueOf(commercialPig.getAge()));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(context,CommericalPigOperaActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("CommericalPig",commercialPigsList.get(i));
                t.putExtras(bundle);
                context.startActivity(t);
            }
        });
    }
    @Override
    public int getItemCount() {
        return commercialPigsList.size();
    }
    class  CommericalPigHolder extends RecyclerView.ViewHolder{
        public View view = null;
        public TextView batchTV = null;
        public TextView numberTV = null;
        public TextView typeTV = null;
        public TextView pigstyTV = null;
        public TextView businessDateTV = null;
        public TextView ageTV = null;

        public CommericalPigHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;
            batchTV = itemView.findViewById(R.id.batchTV);
            numberTV = itemView.findViewById(R.id.numberTV);
            typeTV = itemView.findViewById(R.id.typeTV);
            pigstyTV = itemView.findViewById(R.id.pigstyTV);
            businessDateTV = itemView.findViewById(R.id.businessDateTV);
            ageTV = itemView.findViewById(R.id.ageTV);
        }
    }
    }






