// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.widget.LinearLayout;

public class NativeActionModeAwareLayout extends LinearLayout
{
    public static interface OnActionModeForChildListener
    {

        public abstract android.view.ActionMode.Callback onActionModeForChild(android.view.ActionMode.Callback callback);
    }


    public NativeActionModeAwareLayout(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #10  <Method void LinearLayout(Context, AttributeSet)>
    //    4    6:return          
    }

    public void setActionModeForChildListener(OnActionModeForChildListener onactionmodeforchildlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #14  <Field NativeActionModeAwareLayout$OnActionModeForChildListener mActionModeForChildListener>
    //    3    5:return          
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #14  <Field NativeActionModeAwareLayout$OnActionModeForChildListener mActionModeForChildListener>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #14  <Field NativeActionModeAwareLayout$OnActionModeForChildListener mActionModeForChildListener>
    //    5   11:aload_2         
    //    6   12:invokeinterface #22  <Method android.view.ActionMode$Callback NativeActionModeAwareLayout$OnActionModeForChildListener.onActionModeForChild(android.view.ActionMode$Callback)>
    //    7   17:astore_2        
    //    8   18:aload_0         
    //    9   19:aload_1         
    //   10   20:aload_2         
    //   11   21:invokespecial   #24  <Method ActionMode LinearLayout.startActionModeForChild(View, android.view.ActionMode$Callback)>
    //   12   24:areturn         
    }

    private OnActionModeForChildListener mActionModeForChildListener;
}
