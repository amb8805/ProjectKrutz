// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            ListPopupWindowCompatKitKat

public class ListPopupWindowCompat
{
    static class BaseListPopupWindowImpl
        implements ListPopupWindowImpl
    {

        BaseListPopupWindowImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }
    }

    static class KitKatListPopupWindowImpl extends BaseListPopupWindowImpl
    {

        KitKatListPopupWindowImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ListPopupWindowCompat$BaseListPopupWindowImpl()>
        //    2    4:return          
        }

        public android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #14  <Method android.view.View$OnTouchListener ListPopupWindowCompatKitKat.createDragToOpenListener(Object, View)>
        //    3    5:areturn         
        }
    }

    static interface ListPopupWindowImpl
    {

        public abstract android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view);
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          19
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class ListPopupWindowCompat$KitKatListPopupWindowImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void ListPopupWindowCompat$KitKatListPopupWindowImpl()>
    //    6   15:putstatic       #21  <Field ListPopupWindowCompat$ListPopupWindowImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class ListPopupWindowCompat$BaseListPopupWindowImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void ListPopupWindowCompat$BaseListPopupWindowImpl()>
    //   11   26:putstatic       #21  <Field ListPopupWindowCompat$ListPopupWindowImpl IMPL>
    //   12   29:return          
    }

    private ListPopupWindowCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
    {
    //    0    0:getstatic       #21  <Field ListPopupWindowCompat$ListPopupWindowImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #31  <Method android.view.View$OnTouchListener ListPopupWindowCompat$ListPopupWindowImpl.createDragToOpenListener(Object, View)>
    //    4   10:areturn         
    }

    static final ListPopupWindowImpl IMPL;
}
