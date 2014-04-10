// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class ViewCompatICS
{

    ViewCompatICS()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean canScrollHorizontally(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #15  <Method boolean View.canScrollHorizontally(int)>
    //    3    5:ireturn         
    }

    public static boolean canScrollVertically(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #18  <Method boolean View.canScrollVertically(int)>
    //    3    5:ireturn         
    }

    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #23  <Method void View.onInitializeAccessibilityEvent(AccessibilityEvent)>
    //    3    5:return          
    }

    public static void onInitializeAccessibilityNodeInfo(View view, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #27  <Class AccessibilityNodeInfo>
    //    3    5:invokevirtual   #30  <Method void View.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
    //    4    8:return          
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #33  <Method void View.onPopulateAccessibilityEvent(AccessibilityEvent)>
    //    3    5:return          
    }

    public static void setAccessibilityDelegate(View view, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #36  <Class android.view.View$AccessibilityDelegate>
    //    3    5:invokevirtual   #39  <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
    //    4    8:return          
    }
}
