package com.pig.client.util;

import android.graphics.Color;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

public class AnimationUtil {
    static   public  void startTextViewAnimation(final TextView view){
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation s1 = new ScaleAnimation(1f,1.2f,1f,1.2f
                ,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        s1.setDuration(500);
        view.setTextColor(Color.RED);
        view.startAnimation(s1);
        final ScaleAnimation s2 = new ScaleAnimation(1.2f,1f,1.2f,1f
                ,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        s2.setDuration(100);
        s1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                s2.start();
                view.setTextColor(Color.BLACK);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}
