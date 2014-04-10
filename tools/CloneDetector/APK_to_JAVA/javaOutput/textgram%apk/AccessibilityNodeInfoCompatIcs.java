// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatIcs
{

    AccessibilityNodeInfoCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void addAction(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #15  <Method void AccessibilityNodeInfo.addAction(int)>
    //    4    8:return          
    }

    public static void addChild(Object obj, View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #20  <Method void AccessibilityNodeInfo.addChild(View)>
    //    4    8:return          
    }

    public static List findAccessibilityNodeInfosByText(Object obj, String s)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #25  <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByText(String)>
    //    4    8:checkcast       #27  <Class List>
    //    5   11:areturn         
    }

    public static int getActions(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #32  <Method int AccessibilityNodeInfo.getActions()>
    //    3    7:ireturn         
    }

    public static void getBoundsInParent(Object obj, Rect rect)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #37  <Method void AccessibilityNodeInfo.getBoundsInParent(Rect)>
    //    4    8:return          
    }

    public static void getBoundsInScreen(Object obj, Rect rect)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #40  <Method void AccessibilityNodeInfo.getBoundsInScreen(Rect)>
    //    4    8:return          
    }

    public static Object getChild(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #45  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getChild(int)>
    //    4    8:areturn         
    }

    public static int getChildCount(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #48  <Method int AccessibilityNodeInfo.getChildCount()>
    //    3    7:ireturn         
    }

    public static CharSequence getClassName(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #53  <Method CharSequence AccessibilityNodeInfo.getClassName()>
    //    3    7:areturn         
    }

    public static CharSequence getContentDescription(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #56  <Method CharSequence AccessibilityNodeInfo.getContentDescription()>
    //    3    7:areturn         
    }

    public static CharSequence getPackageName(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #59  <Method CharSequence AccessibilityNodeInfo.getPackageName()>
    //    3    7:areturn         
    }

    public static Object getParent(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #64  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getParent()>
    //    3    7:areturn         
    }

    public static CharSequence getText(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #67  <Method CharSequence AccessibilityNodeInfo.getText()>
    //    3    7:areturn         
    }

    public static int getWindowId(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #70  <Method int AccessibilityNodeInfo.getWindowId()>
    //    3    7:ireturn         
    }

    public static boolean isCheckable(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #75  <Method boolean AccessibilityNodeInfo.isCheckable()>
    //    3    7:ireturn         
    }

    public static boolean isChecked(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #78  <Method boolean AccessibilityNodeInfo.isChecked()>
    //    3    7:ireturn         
    }

    public static boolean isClickable(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #81  <Method boolean AccessibilityNodeInfo.isClickable()>
    //    3    7:ireturn         
    }

    public static boolean isEnabled(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #84  <Method boolean AccessibilityNodeInfo.isEnabled()>
    //    3    7:ireturn         
    }

    public static boolean isFocusable(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #87  <Method boolean AccessibilityNodeInfo.isFocusable()>
    //    3    7:ireturn         
    }

    public static boolean isFocused(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #90  <Method boolean AccessibilityNodeInfo.isFocused()>
    //    3    7:ireturn         
    }

    public static boolean isLongClickable(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #93  <Method boolean AccessibilityNodeInfo.isLongClickable()>
    //    3    7:ireturn         
    }

    public static boolean isPassword(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #96  <Method boolean AccessibilityNodeInfo.isPassword()>
    //    3    7:ireturn         
    }

    public static boolean isScrollable(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #99  <Method boolean AccessibilityNodeInfo.isScrollable()>
    //    3    7:ireturn         
    }

    public static boolean isSelected(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #102 <Method boolean AccessibilityNodeInfo.isSelected()>
    //    3    7:ireturn         
    }

    public static Object obtain()
    {
    //    0    0:invokestatic    #106 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain()>
    //    1    3:areturn         
    }

    public static Object obtain(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #110 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View)>
    //    2    4:areturn         
    }

    public static Object obtain(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokestatic    #113 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(AccessibilityNodeInfo)>
    //    3    7:areturn         
    }

    public static boolean performAction(Object obj, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #118 <Method boolean AccessibilityNodeInfo.performAction(int)>
    //    4    8:ireturn         
    }

    public static void recycle(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:invokevirtual   #122 <Method void AccessibilityNodeInfo.recycle()>
    //    3    7:return          
    }

    public static void setBoundsInParent(Object obj, Rect rect)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #125 <Method void AccessibilityNodeInfo.setBoundsInParent(Rect)>
    //    4    8:return          
    }

    public static void setBoundsInScreen(Object obj, Rect rect)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #128 <Method void AccessibilityNodeInfo.setBoundsInScreen(Rect)>
    //    4    8:return          
    }

    public static void setCheckable(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #133 <Method void AccessibilityNodeInfo.setCheckable(boolean)>
    //    4    8:return          
    }

    public static void setChecked(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #136 <Method void AccessibilityNodeInfo.setChecked(boolean)>
    //    4    8:return          
    }

    public static void setClassName(Object obj, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #141 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
    //    4    8:return          
    }

    public static void setClickable(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #144 <Method void AccessibilityNodeInfo.setClickable(boolean)>
    //    4    8:return          
    }

    public static void setContentDescription(Object obj, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #147 <Method void AccessibilityNodeInfo.setContentDescription(CharSequence)>
    //    4    8:return          
    }

    public static void setEnabled(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #150 <Method void AccessibilityNodeInfo.setEnabled(boolean)>
    //    4    8:return          
    }

    public static void setFocusable(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #153 <Method void AccessibilityNodeInfo.setFocusable(boolean)>
    //    4    8:return          
    }

    public static void setFocused(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #156 <Method void AccessibilityNodeInfo.setFocused(boolean)>
    //    4    8:return          
    }

    public static void setLongClickable(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #159 <Method void AccessibilityNodeInfo.setLongClickable(boolean)>
    //    4    8:return          
    }

    public static void setPackageName(Object obj, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #162 <Method void AccessibilityNodeInfo.setPackageName(CharSequence)>
    //    4    8:return          
    }

    public static void setParent(Object obj, View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #165 <Method void AccessibilityNodeInfo.setParent(View)>
    //    4    8:return          
    }

    public static void setPassword(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #168 <Method void AccessibilityNodeInfo.setPassword(boolean)>
    //    4    8:return          
    }

    public static void setScrollable(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #171 <Method void AccessibilityNodeInfo.setScrollable(boolean)>
    //    4    8:return          
    }

    public static void setSelected(Object obj, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #174 <Method void AccessibilityNodeInfo.setSelected(boolean)>
    //    4    8:return          
    }

    public static void setSource(Object obj, View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #177 <Method void AccessibilityNodeInfo.setSource(View)>
    //    4    8:return          
    }

    public static void setText(Object obj, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class AccessibilityNodeInfo>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #180 <Method void AccessibilityNodeInfo.setText(CharSequence)>
    //    4    8:return          
    }
}
