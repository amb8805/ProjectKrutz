// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

// Referenced classes of package android.support.v4.view:
//            ViewParentCompatICS

public class ViewParentCompat
{
    static class ViewParentCompatICSImpl extends ViewParentCompatStubImpl
    {

        ViewParentCompatICSImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewParentCompat$ViewParentCompatStubImpl()>
        //    2    4:return          
        }

        public boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #14  <Method boolean ViewParentCompatICS.requestSendAccessibilityEvent(ViewParent, View, AccessibilityEvent)>
        //    4    6:ireturn         
        }
    }

    static interface ViewParentCompatImpl
    {

        public abstract boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent);
    }

    static class ViewParentCompatStubImpl
        implements ViewParentCompatImpl
    {

        ViewParentCompatStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_2         
        //    1    1:ifnonnull       6
        //    2    4:iconst_0        
        //    3    5:ireturn         
        //    4    6:aload_2         
        //    5    7:invokevirtual   #18  <Method Context View.getContext()>
        //    6   10:ldc1            #20  <String "accessibility">
        //    7   12:invokevirtual   #26  <Method Object Context.getSystemService(String)>
        //    8   15:checkcast       #28  <Class AccessibilityManager>
        //    9   18:aload_3         
        //   10   19:invokevirtual   #32  <Method void AccessibilityManager.sendAccessibilityEvent(AccessibilityEvent)>
        //   11   22:iconst_1        
        //   12   23:ireturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class ViewParentCompat$ViewParentCompatICSImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void ViewParentCompat$ViewParentCompatICSImpl()>
    //    6   15:putstatic       #21  <Field ViewParentCompat$ViewParentCompatImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class ViewParentCompat$ViewParentCompatStubImpl>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void ViewParentCompat$ViewParentCompatStubImpl()>
    //   11   26:putstatic       #21  <Field ViewParentCompat$ViewParentCompatImpl IMPL>
    //   12   29:return          
    }

    private ViewParentCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static boolean requestSendAccessibilityEvent(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #21  <Field ViewParentCompat$ViewParentCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #31  <Method boolean ViewParentCompat$ViewParentCompatImpl.requestSendAccessibilityEvent(ViewParent, View, AccessibilityEvent)>
    //    5   11:ireturn         
    }

    static final ViewParentCompatImpl IMPL;
}
