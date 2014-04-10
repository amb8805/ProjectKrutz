// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellyBean
{

    AccessibilityNodeInfoCompatJellyBean()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void addChild(Object obj, View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #15  <Method void AccessibilityNodeInfo.addChild(View, int)>
    //    5    9:return          
    }

    public static Object findFocus(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #20  <Method AccessibilityNodeInfo AccessibilityNodeInfo.findFocus(int)>
    //    4    8:areturn         
    }

    public static Object focusSearch(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #23  <Method AccessibilityNodeInfo AccessibilityNodeInfo.focusSearch(int)>
    //    4    8:areturn         
    }

    public static int getMovementGranularities(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #28  <Method int AccessibilityNodeInfo.getMovementGranularities()>
    //    3    7:ireturn         
    }

    public static boolean isAccessibilityFocused(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #33  <Method boolean AccessibilityNodeInfo.isAccessibilityFocused()>
    //    3    7:ireturn         
    }

    public static boolean isVisibleToUser(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #36  <Method boolean AccessibilityNodeInfo.isVisibleToUser()>
    //    3    7:ireturn         
    }

    public static Object obtain(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokestatic    #41  <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View, int)>
    //    3    5:areturn         
    }

    public static boolean performAction(Object obj, int i, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #46  <Method boolean AccessibilityNodeInfo.performAction(int, Bundle)>
    //    5    9:ireturn         
    }

    public static void setAccesibilityFocused(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #52  <Method void AccessibilityNodeInfo.setAccessibilityFocused(boolean)>
    //    4    8:return          
    }

    public static void setMovementGranularities(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #57  <Method void AccessibilityNodeInfo.setMovementGranularities(int)>
    //    4    8:return          
    }

    public static void setParent(Object obj, View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #60  <Method void AccessibilityNodeInfo.setParent(View, int)>
    //    5    9:return          
    }

    public static void setSource(Object obj, View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #63  <Method void AccessibilityNodeInfo.setSource(View, int)>
    //    5    9:return          
    }

    public static void setVisibleToUser(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #66  <Method void AccessibilityNodeInfo.setVisibleToUser(boolean)>
    //    4    8:return          
    }
}
