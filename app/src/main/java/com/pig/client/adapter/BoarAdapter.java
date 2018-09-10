package com.pig.client.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pig.client.R;

public class BoarAdapter extends RecyclerView.Adapter {


        private int[] cardImages = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
        private String[] cardTexts ={"种猪管理","商品猪管理","生产管理","存栏信息"};
        private Context context;


        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
          View boarItem = LayoutInflater.from(context).inflate(R.layout.boar_item,null);
         BoarHolder holder = new BoarHolder(boarItem);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            com.pig.client.adapter.MainCardRVAdapter.CardHolder holder = (com.pig.client.adapter.MainCardRVAdapter.CardHolder) viewHolder;
            holder.cardImage.setImageResource(cardImages[i]);
            holder.cardText.setText(cardTexts[i]);
        }

        @Override
        public int getItemCount() {
            return cardImages.length;
        }
        class  BoarHolder extends RecyclerView.ViewHolder{
            public View view = null;
            public ImageView cardImage = null;
            public TextView cardText = null;

            public BoarHolder(@NonNull View itemView) {
                super(itemView);
                this.view = itemView;
                cardImage = itemView.findViewById(R.id.cardImage);
                cardText = itemView.findViewById(R.id.cardText);
            }
        }
    }






