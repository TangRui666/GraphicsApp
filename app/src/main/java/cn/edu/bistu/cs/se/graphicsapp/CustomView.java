package cn.edu.bistu.cs.se.graphicsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2016/9/9.
 */
public class CustomView extends View {


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.WHITE);

        Paint paint=new Paint();

        ////绘制矩形，内部不填充
        //抗锯齿
        paint.setAntiAlias(true);

        //画笔颜色
        paint.setColor(Color.BLUE);

        //设置填充类型
        paint.setStyle(Paint.Style.STROKE);

        //设置画笔宽度
        paint.setStrokeWidth(5);

        //绘制普通矩形
        canvas.drawRect(5, 10, 100, 100, paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(60, 120);
        path.lineTo(60, 180);
        path.lineTo(180, 180);
        path.close();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.CYAN);
        canvas.drawPath(path, paint);

        //绘制文本
        paint.setTextSize(12);
        paint.setColor(Color.YELLOW);
        paint.setStrikeThruText(true);
        canvas.drawText("hello world", 30, 300, paint);
        paint.setColor(Color.GRAY);
        Path pathText=new Path();
        pathText.addCircle(200,300,80, Path.Direction.CCW);


        canvas.drawOval(400,120,650,300,paint);
        paint.setColor(Color.MAGENTA);


        canvas.drawTextOnPath("Draw the text, with origin at (x,y), using the specified paint, along the specified path.",pathText,0,10,paint);
    }
}
