// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.*;
import android.view.View;

public class AmbilWarnaPrefWidgetView extends View
{

    public AmbilWarnaPrefWidgetView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #13  <Method void View(Context, AttributeSet)>
    //    4    6:aload_1         
    //    5    7:invokevirtual   #19  <Method Resources Context.getResources()>
    //    6   10:invokevirtual   #25  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    7   13:getfield        #30  <Field float DisplayMetrics.density>
    //    8   16:fstore_3        
    //    9   17:aload_0         
    //   10   18:ldc1            #31  <Float 0.5F>
    //   11   20:ldc1            #32  <Float 24F>
    //   12   22:fload_3         
    //   13   23:fmul            
    //   14   24:fadd            
    //   15   25:invokestatic    #38  <Method float FloatMath.floor(float)>
    //   16   28:putfield        #40  <Field float rectSize>
    //   17   31:aload_0         
    //   18   32:ldc1            #31  <Float 0.5F>
    //   19   34:fconst_1        
    //   20   35:fload_3         
    //   21   36:fmul            
    //   22   37:fadd            
    //   23   38:invokestatic    #38  <Method float FloatMath.floor(float)>
    //   24   41:putfield        #42  <Field float strokeWidth>
    //   25   44:aload_0         
    //   26   45:new             #44  <Class Paint>
    //   27   48:dup             
    //   28   49:invokespecial   #47  <Method void Paint()>
    //   29   52:putfield        #49  <Field Paint paint>
    //   30   55:aload_0         
    //   31   56:getfield        #49  <Field Paint paint>
    //   32   59:iconst_m1       
    //   33   60:invokevirtual   #53  <Method void Paint.setColor(int)>
    //   34   63:aload_0         
    //   35   64:getfield        #49  <Field Paint paint>
    //   36   67:getstatic       #59  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
    //   37   70:invokevirtual   #63  <Method void Paint.setStyle(android.graphics.Paint$Style)>
    //   38   73:aload_0         
    //   39   74:getfield        #49  <Field Paint paint>
    //   40   77:aload_0         
    //   41   78:getfield        #42  <Field float strokeWidth>
    //   42   81:invokevirtual   #67  <Method void Paint.setStrokeWidth(float)>
    //   43   84:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #71  <Method void View.onDraw(Canvas)>
    //    3    5:aload_1         
    //    4    6:aload_0         
    //    5    7:getfield        #42  <Field float strokeWidth>
    //    6   10:aload_0         
    //    7   11:getfield        #42  <Field float strokeWidth>
    //    8   14:aload_0         
    //    9   15:getfield        #40  <Field float rectSize>
    //   10   18:aload_0         
    //   11   19:getfield        #42  <Field float strokeWidth>
    //   12   22:fsub            
    //   13   23:aload_0         
    //   14   24:getfield        #40  <Field float rectSize>
    //   15   27:aload_0         
    //   16   28:getfield        #42  <Field float strokeWidth>
    //   17   31:fsub            
    //   18   32:aload_0         
    //   19   33:getfield        #49  <Field Paint paint>
    //   20   36:invokevirtual   #77  <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //   21   39:return          
    }

    Paint paint;
    float rectSize;
    float strokeWidth;
}
