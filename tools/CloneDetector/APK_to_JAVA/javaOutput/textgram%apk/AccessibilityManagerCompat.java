// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityManagerCompatIcs

public class AccessibilityManagerCompat
{
    static class AccessibilityManagerIcsImpl extends AccessibilityManagerStubImpl
    {

        AccessibilityManagerIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityManagerCompat$AccessibilityManagerStubImpl()>
        //    2    4:return          
        }

        public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:getfield        #16  <Field Object AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat.mListener>
        //    3    5:invokestatic    #21  <Method boolean AccessibilityManagerCompatIcs.addAccessibilityStateChangeListener(AccessibilityManager, Object)>
        //    4    8:ireturn         
        }

        public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #25  <Method List AccessibilityManagerCompatIcs.getEnabledAccessibilityServiceList(AccessibilityManager, int)>
        //    3    5:areturn         
        }

        public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #29  <Method List AccessibilityManagerCompatIcs.getInstalledAccessibilityServiceList(AccessibilityManager)>
        //    2    4:areturn         
        }

        public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #33  <Method boolean AccessibilityManagerCompatIcs.isTouchExplorationEnabled(AccessibilityManager)>
        //    2    4:ireturn         
        }

        public Object newAccessiblityStateChangeListener(AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
        {
        //    0    0:new             #37  <Class AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #40  <Method void AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1(AccessibilityManagerCompat$AccessibilityManagerIcsImpl, AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat)>
        //    5    9:invokestatic    #44  <Method Object AccessibilityManagerCompatIcs.newAccessibilityStateChangeListener(AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge)>
        //    6   12:areturn         
        }

        public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:getfield        #16  <Field Object AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat.mListener>
        //    3    5:invokestatic    #47  <Method boolean AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(AccessibilityManager, Object)>
        //    4    8:ireturn         
        }
    }

    static class AccessibilityManagerStubImpl
        implements AccessibilityManagerVersionImpl
    {

        AccessibilityManagerStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
        {
        //    0    0:invokestatic    #20  <Method List Collections.emptyList()>
        //    1    3:areturn         
        }

        public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
        {
        //    0    0:invokestatic    #20  <Method List Collections.emptyList()>
        //    1    3:areturn         
        }

        public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public Object newAccessiblityStateChangeListener(AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }
    }

    static interface AccessibilityManagerVersionImpl
    {

        public abstract boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat);

        public abstract List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i);

        public abstract List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager);

        public abstract boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager);

        public abstract Object newAccessiblityStateChangeListener(AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat);

        public abstract boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat);
    }

    public static abstract class AccessibilityStateChangeListenerCompat
    {

        public AccessibilityStateChangeListenerCompat()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:invokestatic    #16  <Method AccessibilityManagerCompat$AccessibilityManagerVersionImpl AccessibilityManagerCompat.access$000()>
        //    4    8:aload_0         
        //    5    9:invokeinterface #22  <Method Object AccessibilityManagerCompat$AccessibilityManagerVersionImpl.newAccessiblityStateChangeListener(AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat)>
        //    6   14:putfield        #24  <Field Object mListener>
        //    7   17:return          
        }

        public abstract void onAccessibilityStateChanged(boolean flag);

        final Object mListener;
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class AccessibilityManagerCompat$AccessibilityManagerIcsImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void AccessibilityManagerCompat$AccessibilityManagerIcsImpl()>
    //    6   15:putstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class AccessibilityManagerCompat$AccessibilityManagerStubImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void AccessibilityManagerCompat$AccessibilityManagerStubImpl()>
    //   11   26:putstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //   12   29:return          
    }

    public AccessibilityManagerCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    static AccessibilityManagerVersionImpl access$000()
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    3    3:areturn         
    }

    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #33  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.addAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat)>
    //    4   10:ireturn         
    }

    public static List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #37  <Method List AccessibilityManagerCompat$AccessibilityManagerVersionImpl.getEnabledAccessibilityServiceList(AccessibilityManager, int)>
    //    4   10:areturn         
    }

    public static List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #41  <Method List AccessibilityManagerCompat$AccessibilityManagerVersionImpl.getInstalledAccessibilityServiceList(AccessibilityManager)>
    //    3    9:areturn         
    }

    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #45  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.isTouchExplorationEnabled(AccessibilityManager)>
    //    3    9:ireturn         
    }

    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListenerCompat accessibilitystatechangelistenercompat)
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #48  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.removeAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat)>
    //    4   10:ireturn         
    }

    private static final AccessibilityManagerVersionImpl IMPL;

    static AccessibilityManagerVersionImpl access$000()
    {
    //    0    0:getstatic       #21  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
    //    1    3:areturn         
    }

    // Unreferenced inner class android/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1

/* anonymous class */
    class AccessibilityManagerIcsImpl._cls1
        implements AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge
    {

        AccessibilityManagerIcsImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field AccessibilityManagerCompat$AccessibilityManagerIcsImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat val$listener>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onAccessibilityStateChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat val$listener>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #30  <Method void AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat.onAccessibilityStateChanged(boolean)>
        //    4    8:return          
        }

        final AccessibilityManagerIcsImpl this$0;
        final AccessibilityStateChangeListenerCompat val$listener;
    }

}
