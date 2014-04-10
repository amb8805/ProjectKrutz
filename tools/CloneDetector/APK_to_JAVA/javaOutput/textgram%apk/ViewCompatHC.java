// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ViewCompatHC
{

    ViewCompatHC()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static float getAlpha(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #15  <Method float View.getAlpha()>
    //    2    4:freturn         
    }

    static long getFrameTime()
    {
    //    0    0:invokestatic    #22  <Method long ValueAnimator.getFrameDelay()>
    //    1    3:lreturn         
    }

    public static int getLayerType(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #27  <Method int View.getLayerType()>
    //    2    4:ireturn         
    }

    public static int getMeasuredHeightAndState(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #30  <Method int View.getMeasuredHeightAndState()>
    //    2    4:ireturn         
    }

    public static int getMeasuredState(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #33  <Method int View.getMeasuredState()>
    //    2    4:ireturn         
    }

    public static int getMeasuredWidthAndState(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #36  <Method int View.getMeasuredWidthAndState()>
    //    2    4:ireturn         
    }

    public static int resolveSizeAndState(int i, int j, int k)
    {
    //    0    0:iload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #40  <Method int View.resolveSizeAndState(int, int, int)>
    //    4    6:ireturn         
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #45  <Method void View.setLayerType(int, Paint)>
    //    4    6:return          
    }
}
