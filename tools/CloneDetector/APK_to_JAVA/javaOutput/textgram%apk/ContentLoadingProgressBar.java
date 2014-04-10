// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{

    public ContentLoadingProgressBar(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #22  <Method void ContentLoadingProgressBar(Context, AttributeSet)>
    //    4    6:return          
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #25  <Method void ProgressBar(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:ldc2w           #26  <Long -1L>
    //    7   11:putfield        #29  <Field long mStartTime>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #31  <Field boolean mPostedHide>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #33  <Field boolean mPostedShow>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #35  <Field boolean mDismissed>
    //   17   29:aload_0         
    //   18   30:new             #37  <Class ContentLoadingProgressBar$1>
    //   19   33:dup             
    //   20   34:aload_0         
    //   21   35:invokespecial   #40  <Method void ContentLoadingProgressBar$1(ContentLoadingProgressBar)>
    //   22   38:putfield        #42  <Field Runnable mDelayedHide>
    //   23   41:aload_0         
    //   24   42:new             #44  <Class ContentLoadingProgressBar$2>
    //   25   45:dup             
    //   26   46:aload_0         
    //   27   47:invokespecial   #45  <Method void ContentLoadingProgressBar$2(ContentLoadingProgressBar)>
    //   28   50:putfield        #47  <Field Runnable mDelayedShow>
    //   29   53:return          
    }

    static boolean access$002(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #31  <Field boolean mPostedHide>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #31  <Field boolean mPostedHide>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static long access$102(ContentLoadingProgressBar contentloadingprogressbar, long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #29  <Field long mStartTime>
    //    3    5:lload_1         
    //    4    6:lreturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:lload_1         
    //    7    2:putfield        #29  <Field long mStartTime>
    //    8    5:lload_1         
    //    9    6:lreturn         
    }

    static boolean access$202(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #33  <Field boolean mPostedShow>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #33  <Field boolean mPostedShow>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static boolean access$300(ContentLoadingProgressBar contentloadingprogressbar)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field boolean mDismissed>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #35  <Field boolean mDismissed>
    //    5    4:ireturn         
    }

    private void removeCallbacks()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #42  <Field Runnable mDelayedHide>
    //    3    5:invokevirtual   #59  <Method boolean removeCallbacks(Runnable)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:aload_0         
    //    7   11:getfield        #47  <Field Runnable mDelayedShow>
    //    8   14:invokevirtual   #59  <Method boolean removeCallbacks(Runnable)>
    //    9   17:pop             
    //   10   18:return          
    }

    public void hide()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #35  <Field boolean mDismissed>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:getfield        #47  <Field Runnable mDelayedShow>
    //    6   10:invokevirtual   #59  <Method boolean removeCallbacks(Runnable)>
    //    7   13:pop             
    //    8   14:invokestatic    #66  <Method long System.currentTimeMillis()>
    //    9   17:aload_0         
    //   10   18:getfield        #29  <Field long mStartTime>
    //   11   21:lsub            
    //   12   22:lstore_2        
    //   13   23:lload_2         
    //   14   24:ldc2w           #67  <Long 500L>
    //   15   27:lcmp            
    //   16   28:ifge            42
    //   17   31:aload_0         
    //   18   32:getfield        #29  <Field long mStartTime>
    //   19   35:ldc2w           #26  <Long -1L>
    //   20   38:lcmp            
    //   21   39:ifne            49
    //   22   42:aload_0         
    //   23   43:bipush          8
    //   24   45:invokevirtual   #72  <Method void setVisibility(int)>
    //   25   48:return          
    //   26   49:aload_0         
    //   27   50:getfield        #31  <Field boolean mPostedHide>
    //   28   53:ifne            48
    //   29   56:aload_0         
    //   30   57:aload_0         
    //   31   58:getfield        #42  <Field Runnable mDelayedHide>
    //   32   61:ldc2w           #67  <Long 500L>
    //   33   64:lload_2         
    //   34   65:lsub            
    //   35   66:invokevirtual   #76  <Method boolean postDelayed(Runnable, long)>
    //   36   69:pop             
    //   37   70:aload_0         
    //   38   71:iconst_1        
    //   39   72:putfield        #31  <Field boolean mPostedHide>
    //   40   75:return          
    }

    public void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #79  <Method void ProgressBar.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:invokespecial   #81  <Method void removeCallbacks()>
    //    4    8:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #84  <Method void ProgressBar.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:invokespecial   #81  <Method void removeCallbacks()>
    //    4    8:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:ldc2w           #26  <Long -1L>
    //    2    4:putfield        #29  <Field long mStartTime>
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #35  <Field boolean mDismissed>
    //    6   12:aload_0         
    //    7   13:aload_0         
    //    8   14:getfield        #42  <Field Runnable mDelayedHide>
    //    9   17:invokevirtual   #59  <Method boolean removeCallbacks(Runnable)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:getfield        #33  <Field boolean mPostedShow>
    //   13   25:ifne            45
    //   14   28:aload_0         
    //   15   29:aload_0         
    //   16   30:getfield        #47  <Field Runnable mDelayedShow>
    //   17   33:ldc2w           #67  <Long 500L>
    //   18   36:invokevirtual   #76  <Method boolean postDelayed(Runnable, long)>
    //   19   39:pop             
    //   20   40:aload_0         
    //   21   41:iconst_1        
    //   22   42:putfield        #33  <Field boolean mPostedShow>
    //   23   45:return          
    }

    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private long mStartTime;

    static boolean access$002(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #31  <Field boolean mPostedHide>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static long access$102(ContentLoadingProgressBar contentloadingprogressbar, long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #29  <Field long mStartTime>
    //    3    5:lload_1         
    //    4    6:lreturn         
    }

    static boolean access$202(ContentLoadingProgressBar contentloadingprogressbar, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #33  <Field boolean mPostedShow>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static boolean access$300(ContentLoadingProgressBar contentloadingprogressbar)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field boolean mDismissed>
    //    2    4:ireturn         
    }

    // Unreferenced inner class android/support/v4/widget/ContentLoadingProgressBar$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ContentLoadingProgressBar this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //    2    4:iconst_0        
        //    3    5:invokestatic    #22  <Method boolean ContentLoadingProgressBar.access$002(ContentLoadingProgressBar, boolean)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //    7   13:ldc2w           #23  <Long -1L>
        //    8   16:invokestatic    #28  <Method long ContentLoadingProgressBar.access$102(ContentLoadingProgressBar, long)>
        //    9   19:pop2            
        //   10   20:aload_0         
        //   11   21:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //   12   24:bipush          8
        //   13   26:invokevirtual   #32  <Method void ContentLoadingProgressBar.setVisibility(int)>
        //   14   29:return          
        }

        final ContentLoadingProgressBar this$0;
    }


    // Unreferenced inner class android/support/v4/widget/ContentLoadingProgressBar$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ContentLoadingProgressBar this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //    2    4:iconst_0        
        //    3    5:invokestatic    #22  <Method boolean ContentLoadingProgressBar.access$202(ContentLoadingProgressBar, boolean)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //    7   13:invokestatic    #26  <Method boolean ContentLoadingProgressBar.access$300(ContentLoadingProgressBar)>
        //    8   16:ifne            38
        //    9   19:aload_0         
        //   10   20:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //   11   23:invokestatic    #32  <Method long System.currentTimeMillis()>
        //   12   26:invokestatic    #36  <Method long ContentLoadingProgressBar.access$102(ContentLoadingProgressBar, long)>
        //   13   29:pop2            
        //   14   30:aload_0         
        //   15   31:getfield        #14  <Field ContentLoadingProgressBar this$0>
        //   16   34:iconst_0        
        //   17   35:invokevirtual   #40  <Method void ContentLoadingProgressBar.setVisibility(int)>
        //   18   38:return          
        }

        final ContentLoadingProgressBar this$0;
    }

}
