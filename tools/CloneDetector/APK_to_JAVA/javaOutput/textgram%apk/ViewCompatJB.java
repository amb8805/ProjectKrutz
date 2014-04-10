// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

class ViewCompatJB
{

    ViewCompatJB()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static Object getAccessibilityNodeProvider(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #15  <Method android.view.accessibility.AccessibilityNodeProvider View.getAccessibilityNodeProvider()>
    //    2    4:areturn         
    }

    public static int getImportantForAccessibility(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #20  <Method int View.getImportantForAccessibility()>
    //    2    4:ireturn         
    }

    public static ViewParent getParentForAccessibility(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #25  <Method ViewParent View.getParentForAccessibility()>
    //    2    4:areturn         
    }

    public static boolean hasTransientState(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #30  <Method boolean View.hasTransientState()>
    //    2    4:ireturn         
    }

    public static boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #35  <Method boolean View.performAccessibilityAction(int, Bundle)>
    //    4    6:ireturn         
    }

    public static void postInvalidateOnAnimation(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #39  <Method void View.postInvalidateOnAnimation()>
    //    2    4:return          
    }

    public static void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:invokevirtual   #44  <Method void View.postInvalidate(int, int, int, int)>
    //    6    9:return          
    }

    public static void postOnAnimation(View view, Runnable runnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #49  <Method void View.postOnAnimation(Runnable)>
    //    3    5:return          
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:lload_2         
    //    3    3:invokevirtual   #54  <Method void View.postOnAnimationDelayed(Runnable, long)>
    //    4    6:return          
    }

    public static void setHasTransientState(View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #59  <Method void View.setHasTransientState(boolean)>
    //    3    5:return          
    }

    public static void setImportantForAccessibility(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #64  <Method void View.setImportantForAccessibility(int)>
    //    3    5:return          
    }
}
