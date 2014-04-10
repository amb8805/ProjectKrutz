// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class ScrollerCompatGingerbread
{

    ScrollerCompatGingerbread()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void abortAnimation(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #14  <Method void OverScroller.abortAnimation()>
    //    3    7:return          
    }

    public static boolean computeScrollOffset(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #19  <Method boolean OverScroller.computeScrollOffset()>
    //    3    7:ireturn         
    }

    public static Object createScroller(Context context, Interpolator interpolator)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          14
    //    2    4:new             #12  <Class OverScroller>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokespecial   #24  <Method void OverScroller(Context, Interpolator)>
    //    7   13:areturn         
    //    8   14:new             #12  <Class OverScroller>
    //    9   17:dup             
    //   10   18:aload_0         
    //   11   19:invokespecial   #27  <Method void OverScroller(Context)>
    //   12   22:areturn         
    }

    public static void fling(Object obj, int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:iload           4
    //    6    9:iload           5
    //    7   11:iload           6
    //    8   13:iload           7
    //    9   15:iload           8
    //   10   17:invokevirtual   #32  <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
    //   11   20:return          
    }

    public static void fling(Object obj, int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:iload           4
    //    6    9:iload           5
    //    7   11:iload           6
    //    8   13:iload           7
    //    9   15:iload           8
    //   10   17:iload           9
    //   11   19:iload           10
    //   12   21:invokevirtual   #36  <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
    //   13   24:return          
    }

    public static int getCurrX(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #41  <Method int OverScroller.getCurrX()>
    //    3    7:ireturn         
    }

    public static int getCurrY(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #44  <Method int OverScroller.getCurrY()>
    //    3    7:ireturn         
    }

    public static int getFinalX(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #47  <Method int OverScroller.getFinalX()>
    //    3    7:ireturn         
    }

    public static int getFinalY(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #50  <Method int OverScroller.getFinalY()>
    //    3    7:ireturn         
    }

    public static boolean isFinished(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #53  <Method boolean OverScroller.isFinished()>
    //    3    7:ireturn         
    }

    public static boolean isOverScrolled(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:invokevirtual   #56  <Method boolean OverScroller.isOverScrolled()>
    //    3    7:ireturn         
    }

    public static void notifyHorizontalEdgeReached(Object obj, int i, int j, int k)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:invokevirtual   #61  <Method void OverScroller.notifyHorizontalEdgeReached(int, int, int)>
    //    6   10:return          
    }

    public static void notifyVerticalEdgeReached(Object obj, int i, int j, int k)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:invokevirtual   #64  <Method void OverScroller.notifyVerticalEdgeReached(int, int, int)>
    //    6   10:return          
    }

    public static void startScroll(Object obj, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:iload           4
    //    6    9:invokevirtual   #69  <Method void OverScroller.startScroll(int, int, int, int)>
    //    7   12:return          
    }

    public static void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class OverScroller>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:iload           4
    //    6    9:iload           5
    //    7   11:invokevirtual   #73  <Method void OverScroller.startScroll(int, int, int, int, int)>
    //    8   14:return          
    }
}
