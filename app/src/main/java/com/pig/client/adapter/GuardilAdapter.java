package com.pig.client.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.pig.client.R;

import java.util.ArrayList;
import java.util.List;

public class GuardilAdapter extends RecyclerView.Adapter{
    private List<String>  guardilList = new ArrayList<>();
    private Context context;

    public GuardilAdapter(List<String> guardilList, Context context) {
        this.guardilList = guardilList;
        this.context = context;

    }

    public GuardilAdapter(Context context) {
        this.context = context;
        guardilList.add("母猪");
        guardilList.add("公猪");
        guardilList.add("哺乳猪");
        guardilList.add("保育猪");
        guardilList.add("育肥猪");
        guardilList.add("无耳后备");
        guardilList.add("无耳后备");
        guardilList.add("无耳后备");
        guardilList.add("无耳后备");
        guardilList.add("无耳后备");
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
            GuardilHolder holder = (GuardilHolder) viewHolder;
            holder.guardilItemNum.setText("11");
            holder.guardilItemText.setText(guardilList.get(i));
            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
    }

    @Override
    public int getItemCount() {
        return guardilList.size();
    }
    class  GuardilHolder extends RecyclerView.ViewHolder{
        public  View view;
        public TextView guardilItemNum;
        public TextView guardilItemText;
        public GuardilHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            guardilItemNum = itemView.findViewById(R.id.guardilItemNum);
            guardilItemText = itemView.findViewById(R.id.guardilItemText);
        }
    }
}
