package com.example.sai.myapplication.Dijk;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import com.example.sai.myapplication.Dijk.ShortestPath;

class database{
    public	int x[]={600,70,350,850,70,400,850};
    public	int y[]={200,200,600,1100,1150,1300,600};
    public	int x1[]={730,200,480,980,200,530,980};
    public	int y1[]={330,330,730,1230,1280,1430,730};
    //public int place[]={0,1,2,3};

}
public class DrawView extends View {
    ShortestPath t1 = new ShortestPath();

    public  database obj=new database();
    int i;
    String a[]={"A","B","C","D"};
    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    Paint paint = new Paint();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub

        for( i=0;i<7;i++) {
            super.onDraw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.RED);
            canvas.drawOval(obj.x[i], obj.y[i],obj.x1[i],obj.y1[i],paint);
        }
        int src[]=new int[7];
        int j=0;
        for(int i=0;i<t1.answer.length;i++)
        {
            src[j]=t1.answer[i];
            j++;
        }
        int src1[]={0,2,3,0,1,2};
        int prev1=-1;
        for(i=0;i<src1.length;i++)
        {super.onDraw(canvas);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(3);
            paint.setColor(Color.BLACK);
            if(src1[i]!=0)
            {canvas.drawLine(obj.x[prev1]+75, obj.y[prev1]+75, obj.x[src1[i]]+75, obj.y[src1[i]]+75,paint);}

            prev1=src1[i];
        }
        //t1.printSolution(t1.dist, t1.V,pres,src,dest);
        //for(int i=0;i<t1.printSolution();)
        //int src[]={0,2,3};
        int prev=-1;
        for(i=0;i<src.length;i++)
        {super.onDraw(canvas);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            paint.setColor(Color.BLUE);
            if(src[i]!=0)
            {canvas.drawLine(obj.x[prev]+75, obj.y[prev]+75, obj.x[src[i]]+75, obj.y[src[i]]+75,paint);}

            prev=src[i];
        }
        for( i=0;i<7;i++) {
            super.onDraw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.RED);
            canvas.drawOval(obj.x[i], obj.y[i],obj.x1[i],obj.y1[i],paint);
        }

    }

}
