// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class EdgeEffectCompatIcs
{

    EdgeEffectCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean draw(Object obj, Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #15  <Method boolean EdgeEffect.draw(Canvas)>
    //    4    8:ireturn         
    }

    public static void finish(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:invokevirtual   #19  <Method void EdgeEffect.finish()>
    //    3    7:return          
    }

    public static boolean isFinished(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:invokevirtual   #24  <Method boolean EdgeEffect.isFinished()>
    //    3    7:ireturn         
    }

    public static Object newEdgeEffect(Context context)
    {
    //    0    0:new             #12  <Class EdgeEffect>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #29  <Method void EdgeEffect(Context)>
    //    4    8:areturn         
    }

    public static boolean onAbsorb(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #34  <Method void EdgeEffect.onAbsorb(int)>
    //    4    8:iconst_1        
    //    5    9:ireturn         
    }

    public static boolean onPull(Object obj, float f)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:fload_1         
    //    3    5:invokevirtual   #39  <Method void EdgeEffect.onPull(float)>
    //    4    8:iconst_1        
    //    5    9:ireturn         
    }

    public static boolean onRelease(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:invokevirtual   #42  <Method void EdgeEffect.onRelease()>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #24  <Method boolean EdgeEffect.isFinished()>
    //    7   13:ireturn         
    }

    public static void setSize(Object obj, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class EdgeEffect>
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #47  <Method void EdgeEffect.setSize(int, int)>
    //    5    9:return          
    }
}
