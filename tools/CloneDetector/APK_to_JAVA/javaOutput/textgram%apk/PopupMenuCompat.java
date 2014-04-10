// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            PopupMenuCompatKitKat

public class PopupMenuCompat
{
    static class BasePopupMenuImpl
        implements PopupMenuImpl
    {

        BasePopupMenuImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }
    }

    static class KitKatPopupMenuImpl extends BasePopupMenuImpl
    {

        KitKatPopupMenuImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void PopupMenuCompat$BasePopupMenuImpl()>
        //    2    4:return          
        }

        public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method android.view.View$OnTouchListener PopupMenuCompatKitKat.getDragToOpenListener(Object)>
        //    2    4:areturn         
        }
    }

    static interface PopupMenuImpl
    {

        public abstract android.view.View.OnTouchListener getDragToOpenListener(Object obj);
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          19
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class PopupMenuCompat$KitKatPopupMenuImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void PopupMenuCompat$KitKatPopupMenuImpl()>
    //    6   15:putstatic       #21  <Field PopupMenuCompat$PopupMenuImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class PopupMenuCompat$BasePopupMenuImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void PopupMenuCompat$BasePopupMenuImpl()>
    //   11   26:putstatic       #21  <Field PopupMenuCompat$PopupMenuImpl IMPL>
    //   12   29:return          
    }

    private PopupMenuCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static android.view.View.OnTouchListener getDragToOpenListener(Object obj)
    {
    //    0    0:getstatic       #21  <Field PopupMenuCompat$PopupMenuImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #31  <Method android.view.View$OnTouchListener PopupMenuCompat$PopupMenuImpl.getDragToOpenListener(Object)>
    //    3    9:areturn         
    }

    static final PopupMenuImpl IMPL;
}
