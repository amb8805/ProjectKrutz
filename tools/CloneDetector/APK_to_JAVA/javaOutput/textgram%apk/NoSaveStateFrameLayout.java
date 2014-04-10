// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class NoSaveStateFrameLayout extends FrameLayout
{

    public NoSaveStateFrameLayout(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #8   <Method void FrameLayout(Context)>
    //    3    5:return          
    }

    static ViewGroup wrap(View view)
    {
    //    0    0:new             #2   <Class NoSaveStateFrameLayout>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #16  <Method Context View.getContext()>
    //    4    8:invokespecial   #17  <Method void NoSaveStateFrameLayout(Context)>
    //    5   11:astore_1        
    //    6   12:aload_0         
    //    7   13:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    8   16:astore_2        
    //    9   17:aload_2         
    //   10   18:ifnull          26
    //   11   21:aload_1         
    //   12   22:aload_2         
    //   13   23:invokevirtual   #25  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   14   26:aload_0         
    //   15   27:new             #27  <Class android.widget.FrameLayout$LayoutParams>
    //   16   30:dup             
    //   17   31:iconst_m1       
    //   18   32:iconst_m1       
    //   19   33:invokespecial   #30  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
    //   20   36:invokevirtual   #31  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   21   39:aload_1         
    //   22   40:aload_0         
    //   23   41:invokevirtual   #35  <Method void addView(View)>
    //   24   44:aload_1         
    //   25   45:areturn         
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #40  <Method void dispatchThawSelfOnly(SparseArray)>
    //    3    5:return          
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #44  <Method void dispatchFreezeSelfOnly(SparseArray)>
    //    3    5:return          
    }
}
