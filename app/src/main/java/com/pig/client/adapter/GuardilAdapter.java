package com.pig.client.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.pig.client.R;
import com.pig.client.pojo.Pigsty;
import com.pig.client.util.AnimationUtil;

import java.util.ArrayList;
import java.util.List;

public class GuardilAdapter extends RecyclerView.Adapter{
    private Context context;
    private List<Pigsty> pigstieList = new ArrayList<>();

    public GuardilAdapter(Context context) {
        this.context = context;

    }

    public GuardilAdapter(Context context, List<Pigsty> pigstieList) {
        this.context = context;
        this.pigstieList = pigstieList;
    }

    public  void  notifyTemperatureChanged(int position){
        this.notifyItemChanged(position);

    }

    public  void  notifyHumidityChanged(int position){
        this.notifyItemChanged(position);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View guardilItem = LayoutInflater.from(context).inflate(R.layout.guardil_item,viewGroup,false);
        GuardilHolder holder = new GuardilHolder(guardilItem);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            final GuardilHolder holder = (GuardilHolder) viewHolder;
            Pigsty pigsty = pigstieList.get(i);
            holder.guardilItemNum.setText("11");
            holder.guardilItemText.setText(pigsty.getName());
            holder.humidityTV.setText(String.valueOf(pigsty.getHumidity()));
            holder.humidityTV.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    AnimationUtil.startOnClickAnimation(holder.humidityTV);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
            holder.temperatureTV.setText(String.valueOf(pigsty.getTemperature()));
            holder.temperatureTV.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    AnimationUtil.startOnClickAnimation(holder.temperatureTV);

                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
            if (pigsty.getTemperature()<5||pigsty.getTemperature()>40){
                holder.warningIV.setVisibility(View.VISIBLE);
            }else {
                holder.warningIV.setVisibility(View.INVISIBLE);
            }
            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
    }

    @Override
    public int getItemCount() {
        return pigstieList.size();
    }
    class  GuardilHolder extends RecyclerView.ViewHolder{
        public  View view;
        public TextView guardilItemNum;
        public TextView guardilItemText;
        public TextView humidityTV;
        public TextView temperatureTV;
        public ImageView warningIV;
        public GuardilHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            guardilItemNum = itemView.findViewById(R.id.guardilItemNum);
            guardilItemText = itemView.findViewById(R.id.guardilItemText);
            humidityTV = itemView.findViewById(R.id.humidityTV);
            temperatureTV = itemView.findViewById(R.id.temperatureTV);
            warningIV = itemView.findViewById(R.id.warningIV);
        }
    }
}
