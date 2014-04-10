// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.*;

class AccessibilityDelegateCompatJellyBean
{
    public static interface AccessibilityDelegateBridgeJellyBean
    {

        public abstract boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract Object getAccessibilityNodeProvider(View view);

        public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(View view, Object obj);

        public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean performAccessibilityAction(View view, int i, Bundle bundle);

        public abstract void sendAccessibilityEvent(View view, int i);

        public abstract void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent);
    }


    AccessibilityDelegateCompatJellyBean()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static Object getAccessibilityNodeProvider(Object obj, View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #15  <Method AccessibilityNodeProvider android.view.View$AccessibilityDelegate.getAccessibilityNodeProvider(View)>
    //    4    8:areturn         
    }

    public static Object newAccessibilityDelegateBridge(AccessibilityDelegateBridgeJellyBean accessibilitydelegatebridgejellybean)
    {
    //    0    0:new             #19  <Class AccessibilityDelegateCompatJellyBean$1>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #22  <Method void AccessibilityDelegateCompatJellyBean$1(AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean)>
    //    4    8:areturn         
    }

    public static boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class android.view.View$AccessibilityDelegate>
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:aload_3         
    //    5    7:invokevirtual   #27  <Method boolean android.view.View$AccessibilityDelegate.performAccessibilityAction(View, int, Bundle)>
    //    6   10:ireturn         
    }

    // Unreferenced inner class android/support/v4/view/AccessibilityDelegateCompatJellyBean$1

/* anonymous class */
    static final class _cls1 extends android.view.View.AccessibilityDelegate
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    3    5:aload_0         
        //    4    6:invokespecial   #18  <Method void android.view.View$AccessibilityDelegate()>
        //    5    9:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #24  <Method boolean AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5   11:ireturn         
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:invokeinterface #29  <Method Object AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.getAccessibilityNodeProvider(View)>
        //    4   10:checkcast       #31  <Class AccessibilityNodeProvider>
        //    5   13:areturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #35  <Method void AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    5   11:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #40  <Method void AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.onInitializeAccessibilityNodeInfo(View, Object)>
        //    5   11:return          
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #43  <Method void AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5   11:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokeinterface #47  <Method boolean AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    6   12:ireturn         
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:aload_3         
        //    5    7:invokeinterface #51  <Method boolean AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.performAccessibilityAction(View, int, Bundle)>
        //    6   12:ireturn         
        }

        public void sendAccessibilityEvent(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokeinterface #55  <Method void AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.sendAccessibilityEvent(View, int)>
        //    5   11:return          
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean val$bridge>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokeinterface #58  <Method void AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
        //    5   11:return          
        }

        final AccessibilityDelegateBridgeJellyBean val$bridge;
    }

}
