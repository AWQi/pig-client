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
import com.pig.client.activity.BoarActivity;


public class MainCardRVAdapter extends RecyclerView.Adapter{
    private int[] cardImages = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    private String[] cardTexts ={"种猪管理","商品猪管理","生产管理","存栏信息"};
    private Context context;
    public MainCardRVAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View card = LayoutInflater.from(context).inflate(R.layout.card_item,null);
        CardHolder holder = new CardHolder(card);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        CardHolder holder = (CardHolder) viewHolder;
        holder.cardImage.setImageResource(cardImages[i]);
        holder.cardText.setText(cardTexts[i]);
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i){
                    case  0:
                        Intent t0 = new Intent(context, BoarActivity.class);
                        context.startActivity(t0);
                        break;
                    case  1:break;
                    case  2:break;
                    case  3:break;
                    default:break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return cardImages.length;
    }
    class  CardHolder extends RecyclerView.ViewHolder{
        public View view = null;
        public ImageView cardImage = null;
        public TextView cardText = null;

        public CardHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;
            cardImage = itemView.findViewById(R.id.cardImage);
            cardText = itemView.findViewById(R.id.cardText);
        }
    }
}



