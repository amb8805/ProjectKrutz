// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            ViewGroupCompatHC, ViewGroupCompatIcs, ViewGroupCompatJellybeanMR2

public class ViewGroupCompat
{
    static class ViewGroupCompatHCImpl extends ViewGroupCompatStubImpl
    {

        ViewGroupCompatHCImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewGroupCompat$ViewGroupCompatStubImpl()>
        //    2    4:return          
        }

        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #14  <Method void ViewGroupCompatHC.setMotionEventSplittingEnabled(ViewGroup, boolean)>
        //    3    5:return          
        }
    }

    static class ViewGroupCompatIcsImpl extends ViewGroupCompatHCImpl
    {

        ViewGroupCompatIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewGroupCompat$ViewGroupCompatHCImpl()>
        //    2    4:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #14  <Method boolean ViewGroupCompatIcs.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    4    6:ireturn         
        }
    }

    static interface ViewGroupCompatImpl
    {

        public abstract int getLayoutMode(ViewGroup viewgroup);

        public abstract boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void setLayoutMode(ViewGroup viewgroup, int i);

        public abstract void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag);
    }

    static class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl
    {

        ViewGroupCompatJellybeanMR2Impl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewGroupCompat$ViewGroupCompatIcsImpl()>
        //    2    4:return          
        }

        public int getLayoutMode(ViewGroup viewgroup)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method int ViewGroupCompatJellybeanMR2.getLayoutMode(ViewGroup)>
        //    2    4:ireturn         
        }

        public void setLayoutMode(ViewGroup viewgroup, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #18  <Method void ViewGroupCompatJellybeanMR2.setLayoutMode(ViewGroup, int)>
        //    3    5:return          
        }
    }

    static class ViewGroupCompatStubImpl
        implements ViewGroupCompatImpl
    {

        ViewGroupCompatStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public int getLayoutMode(ViewGroup viewgroup)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public void setLayoutMode(ViewGroup viewgroup, int i)
        {
        //    0    0:return          
        }

        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
        {
        //    0    0:return          
        }
    }


    static 
    {
    //    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          18
    //    4    7:icmplt          21
    //    5   10:new             #20  <Class ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl>
    //    6   13:dup             
    //    7   14:invokespecial   #23  <Method void ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl()>
    //    8   17:putstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          14
    //   12   24:icmplt          38
    //   13   27:new             #27  <Class ViewGroupCompat$ViewGroupCompatIcsImpl>
    //   14   30:dup             
    //   15   31:invokespecial   #28  <Method void ViewGroupCompat$ViewGroupCompatIcsImpl()>
    //   16   34:putstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //   17   37:return          
    //   18   38:iload_0         
    //   19   39:bipush          11
    //   20   41:icmplt          55
    //   21   44:new             #30  <Class ViewGroupCompat$ViewGroupCompatHCImpl>
    //   22   47:dup             
    //   23   48:invokespecial   #31  <Method void ViewGroupCompat$ViewGroupCompatHCImpl()>
    //   24   51:putstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //   25   54:return          
    //   26   55:new             #33  <Class ViewGroupCompat$ViewGroupCompatStubImpl>
    //   27   58:dup             
    //   28   59:invokespecial   #34  <Method void ViewGroupCompat$ViewGroupCompatStubImpl()>
    //   29   62:putstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //   30   65:return          
    }

    private ViewGroupCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void Object()>
    //    2    4:return          
    }

    public static int getLayoutMode(ViewGroup viewgroup)
    {
    //    0    0:getstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #41  <Method int ViewGroupCompat$ViewGroupCompatImpl.getLayoutMode(ViewGroup)>
    //    3    9:ireturn         
    }

    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #45  <Method boolean ViewGroupCompat$ViewGroupCompatImpl.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
    //    5   11:ireturn         
    }

    public static void setLayoutMode(ViewGroup viewgroup, int i)
    {
    //    0    0:getstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #49  <Method void ViewGroupCompat$ViewGroupCompatImpl.setLayoutMode(ViewGroup, int)>
    //    4   10:return          
    }

    public static void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
    {
    //    0    0:getstatic       #25  <Field ViewGroupCompat$ViewGroupCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #53  <Method void ViewGroupCompat$ViewGroupCompatImpl.setMotionEventSplittingEnabled(ViewGroup, boolean)>
    //    4   10:return          
    }

    static final ViewGroupCompatImpl IMPL;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
}
