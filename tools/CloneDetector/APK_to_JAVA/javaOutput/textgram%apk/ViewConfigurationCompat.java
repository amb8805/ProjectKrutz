// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            ViewConfigurationCompatFroyo

public class ViewConfigurationCompat
{
    static class BaseViewConfigurationVersionImpl
        implements ViewConfigurationVersionImpl
    {

        BaseViewConfigurationVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #18  <Method int ViewConfiguration.getScaledTouchSlop()>
        //    2    4:ireturn         
        }
    }

    static class FroyoViewConfigurationVersionImpl
        implements ViewConfigurationVersionImpl
    {

        FroyoViewConfigurationVersionImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method int ViewConfigurationCompatFroyo.getScaledPagingTouchSlop(ViewConfiguration)>
        //    2    4:ireturn         
        }
    }

    static interface ViewConfigurationVersionImpl
    {

        public abstract int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration);
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class ViewConfigurationCompat$FroyoViewConfigurationVersionImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void ViewConfigurationCompat$FroyoViewConfigurationVersionImpl()>
    //    6   15:putstatic       #21  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class ViewConfigurationCompat$BaseViewConfigurationVersionImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void ViewConfigurationCompat$BaseViewConfigurationVersionImpl()>
    //   11   26:putstatic       #21  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
    //   12   29:return          
    }

    public ViewConfigurationCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
    {
    //    0    0:getstatic       #21  <Field ViewConfigurationCompat$ViewConfigurationVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #31  <Method int ViewConfigurationCompat$ViewConfigurationVersionImpl.getScaledPagingTouchSlop(ViewConfiguration)>
    //    3    9:ireturn         
    }

    static final ViewConfigurationVersionImpl IMPL;
}
