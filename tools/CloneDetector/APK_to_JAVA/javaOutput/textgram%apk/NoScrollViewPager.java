// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import codeadore.textgram.StylingActivity;
import codeadore.textgram.SuperSurface;

// Referenced classes of package codeadore.textgram.custom_widgets:
//            ViewPager3D

public class NoScrollViewPager extends ViewPager3D
{

    public NoScrollViewPager(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #12  <Method void ViewPager3D(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_1        
    //    6    8:putfield        #14  <Field boolean scrollDisable>
    //    7   11:return          
    }

    public void disableScroll()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #14  <Field boolean scrollDisable>
    //    3    5:return          
    }

    public void enableScroll()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #14  <Field boolean scrollDisable>
    //    3    5:return          
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
    // try 0 12 handler(s) 21
    //    0    0:getstatic       #27  <Field SuperSurface StylingActivity.superSurface>
    //    1    3:ifnull          12
    //    2    6:getstatic       #27  <Field SuperSurface StylingActivity.superSurface>
    //    3    9:invokevirtual   #32  <Method void SuperSurface.clearSelection()>
    //    4   12:aload_0         
    //    5   13:getfield        #14  <Field boolean scrollDisable>
    //    6   16:ifeq            29
    //    7   19:iconst_0        
    //    8   20:ireturn         
    // catch Exception
    //    9   21:astore_2        
    //   10   22:aload_2         
    //   11   23:invokevirtual   #35  <Method void Exception.printStackTrace()>
    //   12   26:goto            12
    //   13   29:aload_0         
    //   14   30:aload_1         
    //   15   31:invokespecial   #37  <Method boolean ViewPager3D.onInterceptTouchEvent(MotionEvent)>
    //   16   34:ireturn         
    }

    int childId;
    private boolean scrollDisable;
}
