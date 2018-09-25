package com.pig.client.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.activity.BoarOperaActivity;
import com.pig.client.pojo.BreedingPig;
import com.pig.client.util.DateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class BoarAdapter extends RecyclerView.Adapter {
    private List<BreedingPig> list = new ArrayList<>();
    private Context context;
    public BoarAdapter(Context context) {
        this.context = context;
    }

    public BoarAdapter(List<BreedingPig> list, Context context) {
        this.list = list;
        this.context = context;
    }
    public void refresh(List list){
        this.list.clear();
        this.list.addAll(list);
        this.notifyDataSetChanged();

    }

    @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
          View boarItem = LayoutInflater.from(context).inflate(R.layout.boar_item,viewGroup,false);
         BoarHolder holder = new BoarHolder(boarItem);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
            BoarHolder holder = (BoarHolder) viewHolder;
            BreedingPig breedingPig = list.get(i);
            holder.earlabelTV.setText(String.valueOf(breedingPig.getEarlabel()));
            holder.typeTV.setText(breedingPig.getPigType());
            holder.pigstyTV.setText(String.valueOf(breedingPig.getPigstyName()));

            holder.birthdayTV.setText(DateUtil.longToString(breedingPig.getBirthdate()));
            holder.varietyTV.setText(breedingPig.getPigVariety());
            holder.stateTV.setText(breedingPig.getPigState());
            holder.entergroupdayTV.setText(DateUtil.longToString(breedingPig.getEntergroupDate()));
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent t = new Intent(context, BoarOperaActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("BreedingPig",list.get(i));
                    t.putExtras(bundle);
                    context.startActivity(t);
                }
            });
        }
        @Override
        public int getItemCount() {
            return list.size();
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






