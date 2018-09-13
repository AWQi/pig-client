package com.pig.client.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.CommericalPigOperaActivity;

public class CommericalPigAdapter extends RecyclerView.Adapter {

    private Context context;
    public CommericalPigAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View boarItem = LayoutInflater.from(context).inflate(R.layout.commercial_pig_item,viewGroup,false);
        CommericalPigHolder holder = new CommericalPigHolder(boarItem);
        return holder;
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        CommericalPigHolder holder = (CommericalPigHolder) viewHolder;
        holder.batchTV.setText("asa");
        holder.numberTV.setText("asa");
        holder.typeTV.setText("asa");
        holder.pigstyTV.setText("asa");
        holder.businessDateTV.setText("asa");
        holder.ageTV.setText("asa");
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(context,CommericalPigOperaActivity.class);
                context.startActivity(t);
            }
        });
    }
    @Override
    public int getItemCount() {
        return 5;
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






