package com.pig.client.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;


public class CircleTextView extends android.support.v7.widget.AppCompatTextView implements View.OnClickListener{
    public boolean isOnCLick() {
        return isOnCLick;
    }

    public void setOnCLick(boolean onCLick) {
        isOnCLick = onCLick;
        this.invalidate();
    }

    private Paint mPaint;
    private boolean isOnCLick;
    public CircleTextView(Context context) {
        super(context);
    }
    public  CircleTextViewClickListener circleTextViewClickListener = null;
    //xml创建TextCircleView调用这个构造函数
    public CircleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    //new TextCircleView调用这个构造函数
    public CircleTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void setCircleTextViewClickListener(CircleTextViewClickListener circleTextViewClickListener) {
        this.circleTextViewClickListener = circleTextViewClickListener;
    }

    /**
     * 初始化画笔
     */
    public void init()
    {
        mPaint = new Paint();
        this.setOnClickListener(this);
    }
    /**
     * 调用onDraw绘制边框
     */
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        //创建一个RectF，用来限定绘制圆弧的范围
        RectF rectf = new RectF();
        //设置画笔的颜色
        mPaint.setColor(Color.BLUE);
        //设置画笔的样式，空心
        if (isOnCLick){
            mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        }else {
            mPaint.setStyle(Paint.Style.STROKE);
        }
        //设置抗锯齿
        mPaint.setAntiAlias(true);
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        //设置画得一个半径，然后比较长和宽，以最大的值来确定长方形的长宽，确定半径
        int r = getMeasuredWidth() > getMeasuredHeight() ? getMeasuredWidth() : getMeasuredHeight();
        rectf.set(getPaddingLeft(),getPaddingTop(),r-getPaddingRight(),r-getPaddingBottom());
        //绘制圆弧
        canvas.drawArc(rectf,0,360,false,mPaint);



        super.onDraw(canvas);
//
    }

    @Override
    public void onClick(View v) {
        isOnCLick=!isOnCLick;
        this.invalidate();
        if (circleTextViewClickListener!=null){
            circleTextViewClickListener.click(this);
        }
    }



    public static Bitmap drawableToBitmap(Drawable drawable) {



 Bitmap bitmap = Bitmap.createBitmap(

                 drawable.getIntrinsicWidth(),

               drawable.getIntrinsicHeight(),

                 drawable.getOpacity() != PixelFormat.OPAQUE ? Bitmap.Config.ARGB_8888

                : Bitmap.Config.RGB_565);

 Canvas canvas = new Canvas(bitmap);

 //canvas.setBitmap(bitmap);

drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());

 drawable.draw(canvas);

 return bitmap;

    }

public  interface  CircleTextViewClickListener {
        public void  click(CircleTextView circleTextView);
}
}