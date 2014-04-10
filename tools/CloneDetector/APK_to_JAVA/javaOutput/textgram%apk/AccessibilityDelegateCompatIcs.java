// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityDelegateCompatIcs
{
    public static interface AccessibilityDelegateBridge
    {

        public abstract boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(View view, Object obj);

        public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void sendAccessibilityEvent(View view, int i);

        public abstract void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent);
    }


    AccessibilityDelegateCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #15  <Method boolean android.view.View$AccessibilityDelegate.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
    //    5    9:ireturn         
    }

    public static Object newAccessibilityDelegateBridge(AccessibilityDelegateBridge accessibilitydelegatebridge)
    {
    //    0    0:new             #19  <Class AccessibilityDelegateCompatIcs$1>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #22  <Method void AccessibilityDelegateCompatIcs$1(AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge)>
    //    4    8:areturn         
    }

    public static Object newAccessibilityDelegateDefaultImpl()
    {
    //    0    0:new             #12  <Class android.view.View$AccessibilityDelegate>
    //    1    3:dup             
    //    2    4:invokespecial   #25  <Method void android.view.View$AccessibilityDelegate()>
    //    3    7:areturn         
    }

    public static void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #30  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
    //    5    9:return          
    }

    public static void onInitializeAccessibilityNodeInfo(Object obj, View view, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:checkcast       #34  <Class AccessibilityNodeInfo>
    //    5    9:invokevirtual   #37  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
    //    6   12:return          
    }

    public static void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #40  <Method void android.view.View$AccessibilityDelegate.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
    //    5    9:return          
    }

    public static boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:invokevirtual   #45  <Method boolean android.view.View$AccessibilityDelegate.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
    //    6   10:ireturn         
    }

    public static void sendAccessibilityEvent(Object obj, View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #50  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
    //    5    9:return          
    }

    public static void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #53  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
    //    5    9:return          
    }

    // Unreferenced inner class android/support/v4/view/AccessibilityDelegateCompatIcs$1

/* anonymous class */
    static final class _cls1 extends android.view.View.AccessibilityDelegate
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    3    5:aload_0         
        //    4    6:invokespecial   #18  <Method void android.view.View$AccessibilityDelegate()>
        //    5    9:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #24  <Method boolean AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5   11:ireturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #28  <Method void AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    5   11:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #33  <Method void AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.onInitializeAccessibilityNodeInfo(View, Object)>
        //    5   11:return          
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #36  <Method void AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5   11:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokeinterface #40  <Method boolean AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    6   12:ireturn         
        }

        public void sendAccessibilityEvent(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokeinterface #44  <Method void AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.sendAccessibilityEvent(View, int)>
        //    5   11:return          
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #47  <Method void AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
        //    5   11:return          
        }

        final AccessibilityDelegateBridge val$bridge;
    }

}
