// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class AccessibilityNodeProviderCompatJellyBean
{
    static interface AccessibilityNodeInfoBridge
    {

        public abstract Object createAccessibilityNodeInfo(int i);

        public abstract List findAccessibilityNodeInfosByText(String s, int i);

        public abstract boolean performAction(int i, int j, Bundle bundle);
    }


    AccessibilityNodeProviderCompatJellyBean()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static Object newAccessibilityNodeProviderBridge(AccessibilityNodeInfoBridge accessibilitynodeinfobridge)
    {
    //    0    0:new             #12  <Class AccessibilityNodeProviderCompatJellyBean$1>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #15  <Method void AccessibilityNodeProviderCompatJellyBean$1(AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge)>
    //    4    8:areturn         
    }

    // Unreferenced inner class android/support/v4/view/accessibility/AccessibilityNodeProviderCompatJellyBean$1

/* anonymous class */
    static final class _cls1 extends AccessibilityNodeProvider
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
        //    3    5:aload_0         
        //    4    6:invokespecial   #18  <Method void AccessibilityNodeProvider()>
        //    5    9:return          
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
        //    2    4:iload_1         
        //    3    5:invokeinterface #25  <Method Object AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge.createAccessibilityNodeInfo(int)>
        //    4   10:checkcast       #27  <Class AccessibilityNodeInfo>
        //    5   13:areturn         
        }

        public List findAccessibilityNodeInfosByText(String s, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokeinterface #31  <Method List AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge.findAccessibilityNodeInfosByText(String, int)>
        //    5   11:areturn         
        }

        public boolean performAction(int i, int j, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
        //    2    4:iload_1         
        //    3    5:iload_2         
        //    4    6:aload_3         
        //    5    7:invokeinterface #35  <Method boolean AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge.performAction(int, int, Bundle)>
        //    6   12:ireturn         
        }

        final AccessibilityNodeInfoBridge val$bridge;
    }

}
