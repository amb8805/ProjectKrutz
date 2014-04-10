// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompatIcs, AccessibilityDelegateCompatJellyBean

public class AccessibilityDelegateCompat
{
    static class AccessibilityDelegateIcsImpl extends AccessibilityDelegateStubImpl
    {

        AccessibilityDelegateIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityDelegateCompat$AccessibilityDelegateStubImpl()>
        //    2    4:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #14  <Method boolean AccessibilityDelegateCompatIcs.dispatchPopulateAccessibilityEvent(Object, View, AccessibilityEvent)>
        //    4    6:ireturn         
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        //    0    0:new             #18  <Class AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #21  <Method void AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1(AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl, AccessibilityDelegateCompat)>
        //    5    9:invokestatic    #25  <Method Object AccessibilityDelegateCompatIcs.newAccessibilityDelegateBridge(AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge)>
        //    6   12:areturn         
        }

        public Object newAccessiblityDelegateDefaultImpl()
        {
        //    0    0:invokestatic    #30  <Method Object AccessibilityDelegateCompatIcs.newAccessibilityDelegateDefaultImpl()>
        //    1    3:areturn         
        }

        public void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #34  <Method void AccessibilityDelegateCompatIcs.onInitializeAccessibilityEvent(Object, View, AccessibilityEvent)>
        //    4    6:return          
        }

        public void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokevirtual   #41  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //    4    6:invokestatic    #44  <Method void AccessibilityDelegateCompatIcs.onInitializeAccessibilityNodeInfo(Object, View, Object)>
        //    5    9:return          
        }

        public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #47  <Method void AccessibilityDelegateCompatIcs.onPopulateAccessibilityEvent(Object, View, AccessibilityEvent)>
        //    4    6:return          
        }

        public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:aload           4
        //    4    5:invokestatic    #51  <Method boolean AccessibilityDelegateCompatIcs.onRequestSendAccessibilityEvent(Object, ViewGroup, View, AccessibilityEvent)>
        //    5    8:ireturn         
        }

        public void sendAccessibilityEvent(Object obj, View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:iload_3         
        //    3    3:invokestatic    #55  <Method void AccessibilityDelegateCompatIcs.sendAccessibilityEvent(Object, View, int)>
        //    4    6:return          
        }

        public void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #58  <Method void AccessibilityDelegateCompatIcs.sendAccessibilityEventUnchecked(Object, View, AccessibilityEvent)>
        //    4    6:return          
        }
    }

    static interface AccessibilityDelegateImpl
    {

        public abstract boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view);

        public abstract Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract Object newAccessiblityDelegateDefaultImpl();

        public abstract void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

        public abstract void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle);

        public abstract void sendAccessibilityEvent(Object obj, View view, int i);

        public abstract void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent);
    }

    static class AccessibilityDelegateJellyBeanImpl extends AccessibilityDelegateIcsImpl
    {

        AccessibilityDelegateJellyBeanImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl()>
        //    2    4:return          
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #15  <Method Object AccessibilityDelegateCompatJellyBean.getAccessibilityNodeProvider(Object, View)>
        //    3    5:astore_3        
        //    4    6:aload_3         
        //    5    7:ifnull          19
        //    6   10:new             #17  <Class AccessibilityNodeProviderCompat>
        //    7   13:dup             
        //    8   14:aload_3         
        //    9   15:invokespecial   #20  <Method void AccessibilityNodeProviderCompat(Object)>
        //   10   18:areturn         
        //   11   19:aconst_null     
        //   12   20:areturn         
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        //    0    0:new             #24  <Class AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #27  <Method void AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1(AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl, AccessibilityDelegateCompat)>
        //    5    9:invokestatic    #31  <Method Object AccessibilityDelegateCompatJellyBean.newAccessibilityDelegateBridge(AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean)>
        //    6   12:areturn         
        }

        public boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:iload_3         
        //    3    3:aload           4
        //    4    5:invokestatic    #35  <Method boolean AccessibilityDelegateCompatJellyBean.performAccessibilityAction(Object, View, int, Bundle)>
        //    5    8:ireturn         
        }
    }

    static class AccessibilityDelegateStubImpl
        implements AccessibilityDelegateImpl
    {

        AccessibilityDelegateStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(Object obj, View view)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public Object newAccessiblityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public Object newAccessiblityDelegateDefaultImpl()
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public void onInitializeAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:return          
        }

        public void onInitializeAccessibilityNodeInfo(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:return          
        }

        public void onPopulateAccessibilityEvent(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:return          
        }

        public boolean onRequestSendAccessibilityEvent(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void sendAccessibilityEvent(Object obj, View view, int i)
        {
        //    0    0:return          
        }

        public void sendAccessibilityEventUnchecked(Object obj, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:return          
        }
    }


    static 
    {
    //    0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          30
    //    3    8:new             #19  <Class AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #22  <Method void AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl()>
    //    6   15:putstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    7   18:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    8   21:invokeinterface #30  <Method Object AccessibilityDelegateCompat$AccessibilityDelegateImpl.newAccessiblityDelegateDefaultImpl()>
    //    9   26:putstatic       #32  <Field Object DEFAULT_DELEGATE>
    //   10   29:return          
    //   11   30:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
    //   12   33:bipush          14
    //   13   35:icmplt          51
    //   14   38:new             #34  <Class AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl>
    //   15   41:dup             
    //   16   42:invokespecial   #35  <Method void AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl()>
    //   17   45:putstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //   18   48:goto            18
    //   19   51:new             #37  <Class AccessibilityDelegateCompat$AccessibilityDelegateStubImpl>
    //   20   54:dup             
    //   21   55:invokespecial   #38  <Method void AccessibilityDelegateCompat$AccessibilityDelegateStubImpl()>
    //   22   58:putstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //   23   61:goto            18
    }

    public AccessibilityDelegateCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #39  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    4    8:aload_0         
    //    5    9:invokeinterface #43  <Method Object AccessibilityDelegateCompat$AccessibilityDelegateImpl.newAccessiblityDelegateBridge(AccessibilityDelegateCompat)>
    //    6   14:putfield        #45  <Field Object mBridge>
    //    7   17:return          
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:aload_2         
    //    4    8:invokeinterface #50  <Method boolean AccessibilityDelegateCompat$AccessibilityDelegateImpl.dispatchPopulateAccessibilityEvent(Object, View, AccessibilityEvent)>
    //    5   13:ireturn         
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:invokeinterface #55  <Method AccessibilityNodeProviderCompat AccessibilityDelegateCompat$AccessibilityDelegateImpl.getAccessibilityNodeProvider(Object, View)>
    //    4   12:areturn         
    }

    Object getBridge()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #45  <Field Object mBridge>
    //    2    4:areturn         
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:aload_2         
    //    4    8:invokeinterface #61  <Method void AccessibilityDelegateCompat$AccessibilityDelegateImpl.onInitializeAccessibilityEvent(Object, View, AccessibilityEvent)>
    //    5   13:return          
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:aload_2         
    //    4    8:invokeinterface #66  <Method void AccessibilityDelegateCompat$AccessibilityDelegateImpl.onInitializeAccessibilityNodeInfo(Object, View, AccessibilityNodeInfoCompat)>
    //    5   13:return          
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:aload_2         
    //    4    8:invokeinterface #69  <Method void AccessibilityDelegateCompat$AccessibilityDelegateImpl.onPopulateAccessibilityEvent(Object, View, AccessibilityEvent)>
    //    5   13:return          
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:aload_2         
    //    4    8:aload_3         
    //    5    9:invokeinterface #74  <Method boolean AccessibilityDelegateCompat$AccessibilityDelegateImpl.onRequestSendAccessibilityEvent(Object, ViewGroup, View, AccessibilityEvent)>
    //    6   14:ireturn         
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:iload_2         
    //    4    8:aload_3         
    //    5    9:invokeinterface #79  <Method boolean AccessibilityDelegateCompat$AccessibilityDelegateImpl.performAccessibilityAction(Object, View, int, Bundle)>
    //    6   14:ireturn         
    }

    public void sendAccessibilityEvent(View view, int i)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:iload_2         
    //    4    8:invokeinterface #84  <Method void AccessibilityDelegateCompat$AccessibilityDelegateImpl.sendAccessibilityEvent(Object, View, int)>
    //    5   13:return          
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #24  <Field AccessibilityDelegateCompat$AccessibilityDelegateImpl IMPL>
    //    1    3:getstatic       #32  <Field Object DEFAULT_DELEGATE>
    //    2    6:aload_1         
    //    3    7:aload_2         
    //    4    8:invokeinterface #87  <Method void AccessibilityDelegateCompat$AccessibilityDelegateImpl.sendAccessibilityEventUnchecked(Object, View, AccessibilityEvent)>
    //    5   13:return          
    }

    private static final Object DEFAULT_DELEGATE;
    private static final AccessibilityDelegateImpl IMPL;
    final Object mBridge;

    // Unreferenced inner class android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1

/* anonymous class */
    class AccessibilityDelegateIcsImpl._cls1
        implements AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge
    {

        AccessibilityDelegateIcsImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #30  <Method boolean AccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5    9:ireturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #34  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    5    9:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:new             #38  <Class AccessibilityNodeInfoCompat>
        //    4    8:dup             
        //    5    9:aload_2         
        //    6   10:invokespecial   #41  <Method void AccessibilityNodeInfoCompat(Object)>
        //    7   13:invokevirtual   #44  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
        //    8   16:return          
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #47  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5    9:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #51  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    6   10:ireturn         
        }

        public void sendAccessibilityEvent(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokevirtual   #55  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
        //    5    9:return          
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #58  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
        //    5    9:return          
        }

        final AccessibilityDelegateIcsImpl this$0;
        final AccessibilityDelegateCompat val$compat;
    }


    // Unreferenced inner class android/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1

/* anonymous class */
    class AccessibilityDelegateJellyBeanImpl._cls1
        implements AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean
    {

        AccessibilityDelegateJellyBeanImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #30  <Method boolean AccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5    9:ireturn         
        }

        public Object getAccessibilityNodeProvider(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #35  <Method AccessibilityNodeProviderCompat AccessibilityDelegateCompat.getAccessibilityNodeProvider(View)>
        //    4    8:astore_2        
        //    5    9:aload_2         
        //    6   10:ifnull          18
        //    7   13:aload_2         
        //    8   14:invokevirtual   #41  <Method Object AccessibilityNodeProviderCompat.getProvider()>
        //    9   17:areturn         
        //   10   18:aconst_null     
        //   11   19:areturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #45  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    5    9:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:new             #49  <Class AccessibilityNodeInfoCompat>
        //    4    8:dup             
        //    5    9:aload_2         
        //    6   10:invokespecial   #52  <Method void AccessibilityNodeInfoCompat(Object)>
        //    7   13:invokevirtual   #55  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
        //    8   16:return          
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #58  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    5    9:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #62  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    6   10:ireturn         
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #66  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
        //    6   10:ireturn         
        }

        public void sendAccessibilityEvent(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokevirtual   #70  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
        //    5    9:return          
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityDelegateCompat val$compat>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #73  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
        //    5    9:return          
        }

        final AccessibilityDelegateJellyBeanImpl this$0;
        final AccessibilityDelegateCompat val$compat;
    }

}
