package com.pig.client.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.BoarOperaActivity;

public class BoarAdapter extends RecyclerView.Adapter {

    private Context context;
    public BoarAdapter(Context context) {
        this.context = context;
    }

    @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
          View boarItem = LayoutInflater.from(context).inflate(R.layout.boar_item,viewGroup,false);
         BoarHolder holder = new BoarHolder(boarItem);
            return holder;
        }



        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            BoarHolder holder = (BoarHolder) viewHolder;
            holder.earlabelTV.setText("asa");
            holder.typeTV.setText("asa");
            holder.pigstyTV.setText("asa");
            holder.birthdayTV.setText("asa");
            holder.varietyTV.setText("asa");
            holder.stateTV.setText("asa");
            holder.entergroupdayTV.setText("asa");
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent t = new Intent(context, BoarOperaActivity.class);
                    context.startActivity(t);
                }
            });
        }
        @Override
        public int getItemCount() {
            return 5;
        }
        class  BoarHolder extends RecyclerView.ViewHolder{
            public View view = null;
            public TextView earlabelTV = null;
            public TextView typeTV = null;
            public TextView pigstyTV = null;
            public TextView birthdayTV = null;
            public TextView varietyTV = null;
            public TextView stateTV = null;
            public TextView entergroupdayTV = null;

            public BoarHolder(@NonNull View itemView) {
                super(itemView);
                this.view = itemView;
                earlabelTV = itemView.findViewById(R.id.earlabelTV);
                typeTV = itemView.findViewById(R.id.typeTV);
                pigstyTV = itemView.findViewById(R.id.pigstyTV);
                birthdayTV = itemView.findViewById(R.id.birthdayTV);
                varietyTV = itemView.findViewById(R.id.varietyTV);
                stateTV = itemView.findViewById(R.id.stateTV);
                entergroupdayTV = itemView.findViewById(R.id.entergroupdayTV);
            }
        }
    }






