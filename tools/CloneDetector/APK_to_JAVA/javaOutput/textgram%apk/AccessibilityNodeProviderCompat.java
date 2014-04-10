// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeProviderCompatJellyBean, AccessibilityNodeProviderCompatKitKat

public class AccessibilityNodeProviderCompat
{
    static interface AccessibilityNodeProviderImpl
    {

        public abstract Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat);
    }

    static class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl
    {

        AccessibilityNodeProviderJellyBeanImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
        //    2    4:return          
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
        //    0    0:new             #12  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #15  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1(AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl, AccessibilityNodeProviderCompat)>
        //    5    9:invokestatic    #20  <Method Object AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge)>
        //    6   12:areturn         
        }
    }

    static class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl
    {

        AccessibilityNodeProviderKitKatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
        //    2    4:return          
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
        //    0    0:new             #12  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #15  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1(AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl, AccessibilityNodeProviderCompat)>
        //    5    9:invokestatic    #20  <Method Object AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge)>
        //    6   12:areturn         
        }
    }

    static class AccessibilityNodeProviderStubImpl
        implements AccessibilityNodeProviderImpl
    {

        AccessibilityNodeProviderStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          19
    //    2    5:icmplt          19
    //    3    8:new             #18  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #21  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl()>
    //    6   15:putstatic       #23  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
    //    7   18:return          
    //    8   19:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   22:bipush          16
    //   10   24:icmplt          38
    //   11   27:new             #25  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl>
    //   12   30:dup             
    //   13   31:invokespecial   #26  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl()>
    //   14   34:putstatic       #23  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
    //   15   37:return          
    //   16   38:new             #28  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl>
    //   17   41:dup             
    //   18   42:invokespecial   #29  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
    //   19   45:putstatic       #23  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
    //   20   48:return          
    }

    public AccessibilityNodeProviderCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #30  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #23  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
    //    4    8:aload_0         
    //    5    9:invokeinterface #36  <Method Object AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat)>
    //    6   14:putfield        #38  <Field Object mProvider>
    //    7   17:return          
    }

    public AccessibilityNodeProviderCompat(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #30  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #38  <Field Object mProvider>
    //    5    9:return          
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public AccessibilityNodeInfoCompat findFocus(int i)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public Object getProvider()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Object mProvider>
    //    2    4:areturn         
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    private static final AccessibilityNodeProviderImpl IMPL;
    private final Object mProvider;

    // Unreferenced inner class android/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1

/* anonymous class */
    class AccessibilityNodeProviderJellyBeanImpl._cls1
        implements AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge
    {

        AccessibilityNodeProviderJellyBeanImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public Object createAccessibilityNodeInfo(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #31  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(int)>
        //    4    8:astore_2        
        //    5    9:aload_2         
        //    6   10:ifnonnull       15
        //    7   13:aconst_null     
        //    8   14:areturn         
        //    9   15:aload_2         
        //   10   16:invokevirtual   #37  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //   11   19:areturn         
        }

        public List findAccessibilityNodeInfosByText(String s, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokevirtual   #41  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
        //    5    9:astore_3        
        //    6   10:new             #43  <Class ArrayList>
        //    7   13:dup             
        //    8   14:invokespecial   #44  <Method void ArrayList()>
        //    9   17:astore          4
        //   10   19:aload_3         
        //   11   20:invokeinterface #50  <Method int List.size()>
        //   12   25:istore          5
        //   13   27:iconst_0        
        //   14   28:istore          6
        //   15   30:iload           6
        //   16   32:iload           5
        //   17   34:icmpge          65
        //   18   37:aload           4
        //   19   39:aload_3         
        //   20   40:iload           6
        //   21   42:invokeinterface #53  <Method Object List.get(int)>
        //   22   47:checkcast       #33  <Class AccessibilityNodeInfoCompat>
        //   23   50:invokevirtual   #37  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //   24   53:invokeinterface #57  <Method boolean List.add(Object)>
        //   25   58:pop             
        //   26   59:iinc            6  1
        //   27   62:goto            30
        //   28   65:aload           4
        //   29   67:areturn         
        }

        public boolean performAction(int i, int j, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:iload_1         
        //    3    5:iload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #61  <Method boolean AccessibilityNodeProviderCompat.performAction(int, int, Bundle)>
        //    6   10:ireturn         
        }

        final AccessibilityNodeProviderJellyBeanImpl this$0;
        final AccessibilityNodeProviderCompat val$compat;
    }


    // Unreferenced inner class android/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1

/* anonymous class */
    class AccessibilityNodeProviderKitKatImpl._cls1
        implements AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge
    {

        AccessibilityNodeProviderKitKatImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public Object createAccessibilityNodeInfo(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #31  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(int)>
        //    4    8:astore_2        
        //    5    9:aload_2         
        //    6   10:ifnonnull       15
        //    7   13:aconst_null     
        //    8   14:areturn         
        //    9   15:aload_2         
        //   10   16:invokevirtual   #37  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //   11   19:areturn         
        }

        public List findAccessibilityNodeInfosByText(String s, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:invokevirtual   #41  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
        //    5    9:astore_3        
        //    6   10:new             #43  <Class ArrayList>
        //    7   13:dup             
        //    8   14:invokespecial   #44  <Method void ArrayList()>
        //    9   17:astore          4
        //   10   19:aload_3         
        //   11   20:invokeinterface #50  <Method int List.size()>
        //   12   25:istore          5
        //   13   27:iconst_0        
        //   14   28:istore          6
        //   15   30:iload           6
        //   16   32:iload           5
        //   17   34:icmpge          65
        //   18   37:aload           4
        //   19   39:aload_3         
        //   20   40:iload           6
        //   21   42:invokeinterface #53  <Method Object List.get(int)>
        //   22   47:checkcast       #33  <Class AccessibilityNodeInfoCompat>
        //   23   50:invokevirtual   #37  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //   24   53:invokeinterface #57  <Method boolean List.add(Object)>
        //   25   58:pop             
        //   26   59:iinc            6  1
        //   27   62:goto            30
        //   28   65:aload           4
        //   29   67:areturn         
        }

        public Object findFocus(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #60  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.findFocus(int)>
        //    4    8:astore_2        
        //    5    9:aload_2         
        //    6   10:ifnonnull       15
        //    7   13:aconst_null     
        //    8   14:areturn         
        //    9   15:aload_2         
        //   10   16:invokevirtual   #37  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //   11   19:areturn         
        }

        public boolean performAction(int i, int j, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat val$compat>
        //    2    4:iload_1         
        //    3    5:iload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #64  <Method boolean AccessibilityNodeProviderCompat.performAction(int, int, Bundle)>
        //    6   10:ireturn         
        }

        final AccessibilityNodeProviderKitKatImpl this$0;
        final AccessibilityNodeProviderCompat val$compat;
    }

}
