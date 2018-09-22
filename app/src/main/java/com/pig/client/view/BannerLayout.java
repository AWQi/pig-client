package com.pig.client.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;

public class BannerLayout extends RelativeLayout {
    private static final String TAG = "BannerLayout";
    private Scroller scroller;
    private float mLastMotionX;
    //    private int mTouchSlop;
    private int currentScreenIndex=0;

    private boolean autoScroll=true;

    private int scrollTime=3*1000;
    int measuredWidth  = 0;
    int measureHeight  = 0;
    private int currentWhat=0;

    private Handler handler=new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            if(autoScroll && currentWhat==msg.what)
            {
                currentScreenIndex=(currentScreenIndex+1)%getChildCount();
                scrollToScreen(currentScreenIndex);
                if(autoScroll)
                    handler.sendEmptyMessageDelayed(currentWhat, scrollTime);
            }
        }
    };

    public BannerLayout(Context context) {
        super(context);

        initView(context);
        // TODO Auto-generated constructor stub
    }

    public BannerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
        initView(context);
    }

    public BannerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        // TODO Auto-generated constructor stub
    }

    private void initView(final Context context) {
        this.scroller = new Scroller(context, new DecelerateInterpolator(2));//OvershootInterpolator(1.1f)


        handler.sendEmptyMessageDelayed(currentWhat, scrollTime);

//        final ViewConfiguration configuration = ViewConfiguration
//                .get(getContext());
//        mTouchSlop = configuration.getScaledTouchSlop();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

//        int maxHeight=-1;
//
//        final int count = getChildCount();
//        for (int i = 0; i < count; i++) {
//            getChildAt(i).measure(widthMeasureSpec, heightMeasureSpec);  //将父控件测量模式传入子控件
//
//            maxHeight= Math.max(maxHeight, getChildAt(i).getMeasuredHeight());
//
//        }
//        maxHeight= Math.min(maxHeight, MeasureSpec.getSize(heightMeasureSpec));
//        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),maxHeight); // 确定父控件的大小
    }
    @Override
    protected void onLayout(boolean changed, int left, int top, int right,
                            int bottom) {
        super.onLayout(changed,left,top,right,bottom);
//        final int count = getChildCount();
//
//        int cLeft = 0;
//
//
//        for (int i = 0; i < count; i++) {
//            View child = getChildAt(i);
//            if (child.getVisibility() == View.GONE)
//                continue;
//
////            child.setVisibility(View.VISIBLE);
//            final int childMeasuredWidth = child.getMeasuredWidth();
//            Log.d(TAG, "childMeasuredWidth: "+childMeasuredWidth);
//            Log.d(TAG, "measuredWidth: "+measuredWidth);
//            measuredWidth = getMeasuredWidth();
//            measureHeight = getMeasuredHeight();
//            child.layout(cLeft, 0, cLeft +childMeasuredWidth, measureHeight);// 确定子控件的位置
//            cLeft += childMeasuredWidth;
//        }
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), 0);
            postInvalidate();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (getChildCount() == 0)
            return false;
        final int action = ev.getAction();
        final float x = ev.getX();
        switch (action) {
            case MotionEvent.ACTION_DOWN:

                return true;

            case MotionEvent.ACTION_MOVE:

            case MotionEvent.ACTION_UP:

            case MotionEvent.ACTION_CANCEL:


        }
        return false;
    }
    private void scrollToScreen(int whichScreen)
    {
//        if (!scroller.isFinished())
//            return;
//        Log.e("TAG","scrollToScreen:"+whichScreen);
        int delta = 0;

        delta = whichScreen * getWidth() - getScrollX();

//        scroller.startScroll(getScrollX(), 0, delta, 0, Math.abs(delta) * 2);
        scroller.startScroll(getScrollX(), 0, delta, 0, 1500);
        invalidate();

        currentScreenIndex=whichScreen;
    }
    private void snapToDestination()
    {
        final int x=getScrollX();
        final int screenWidth = getWidth();

        scrollToScreen((x + (screenWidth / 2))/ screenWidth);
    }

    @Override
    protected void finalize() throws Throwable {

        Log.e("TAG","finalize===");

        super.finalize();
    }

}