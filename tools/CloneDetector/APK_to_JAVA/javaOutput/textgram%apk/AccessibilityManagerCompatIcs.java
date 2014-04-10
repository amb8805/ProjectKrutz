// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

class AccessibilityManagerCompatIcs
{
    static interface AccessibilityStateChangeListenerBridge
    {

        public abstract void onAccessibilityStateChanged(boolean flag);
    }


    AccessibilityManagerCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #12  <Class android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener>
    //    3    5:invokevirtual   #17  <Method boolean AccessibilityManager.addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener)>
    //    4    8:ireturn         
    }

    public static List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #22  <Method List AccessibilityManager.getEnabledAccessibilityServiceList(int)>
    //    3    5:areturn         
    }

    public static List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #27  <Method List AccessibilityManager.getInstalledAccessibilityServiceList()>
    //    2    4:areturn         
    }

    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #32  <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
    //    2    4:ireturn         
    }

    public static Object newAccessibilityStateChangeListener(AccessibilityStateChangeListenerBridge accessibilitystatechangelistenerbridge)
    {
    //    0    0:new             #36  <Class AccessibilityManagerCompatIcs$1>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #39  <Method void AccessibilityManagerCompatIcs$1(AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge)>
    //    4    8:areturn         
    }

    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #12  <Class android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener>
    //    3    5:invokevirtual   #42  <Method boolean AccessibilityManager.removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener)>
    //    4    8:ireturn         
    }

    // Unreferenced inner class android/support/v4/view/accessibility/AccessibilityManagerCompatIcs$1

/* anonymous class */
    static final class _cls1
        implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge val$bridge>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onAccessibilityStateChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge val$bridge>
        //    2    4:iload_1         
        //    3    5:invokeinterface #26  <Method void AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge.onAccessibilityStateChanged(boolean)>
        //    4   10:return          
        }

        final AccessibilityStateChangeListenerBridge val$bridge;
    }

}
