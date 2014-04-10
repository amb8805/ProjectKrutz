// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            ValueAnimator

public class TimeAnimator extends ValueAnimator
{
    public static interface TimeListener
    {

        public abstract void onTimeUpdate(TimeAnimator timeanimator, long l, long l1);
    }


    public TimeAnimator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void ValueAnimator()>
    //    2    4:aload_0         
    //    3    5:ldc2w           #13  <Long -1L>
    //    4    8:putfield        #16  <Field long mPreviousTime>
    //    5   11:return          
    }

    void animateValue(float f)
    {
    //    0    0:return          
    }

    boolean animationFrame(long l)
    {
    //    0    0:lconst_0        
    //    1    1:lstore_3        
    //    2    2:aload_0         
    //    3    3:getfield        #24  <Field int mPlayingState>
    //    4    6:ifne            28
    //    5    9:aload_0         
    //    6   10:iconst_1        
    //    7   11:putfield        #24  <Field int mPlayingState>
    //    8   14:aload_0         
    //    9   15:getfield        #27  <Field long mSeekTime>
    //   10   18:lload_3         
    //   11   19:lcmp            
    //   12   20:ifge            72
    //   13   23:aload_0         
    //   14   24:lload_1         
    //   15   25:putfield        #30  <Field long mStartTime>
    //   16   28:aload_0         
    //   17   29:getfield        #32  <Field TimeAnimator$TimeListener mListener>
    //   18   32:ifnull          70
    //   19   35:lload_1         
    //   20   36:aload_0         
    //   21   37:getfield        #30  <Field long mStartTime>
    //   22   40:lsub            
    //   23   41:lstore          5
    //   24   43:aload_0         
    //   25   44:getfield        #16  <Field long mPreviousTime>
    //   26   47:lload_3         
    //   27   48:lcmp            
    //   28   49:ifge            92
    //   29   52:aload_0         
    //   30   53:lload_1         
    //   31   54:putfield        #16  <Field long mPreviousTime>
    //   32   57:aload_0         
    //   33   58:getfield        #32  <Field TimeAnimator$TimeListener mListener>
    //   34   61:aload_0         
    //   35   62:lload           5
    //   36   64:lload_3         
    //   37   65:invokeinterface #38  <Method void TimeAnimator$TimeListener.onTimeUpdate(TimeAnimator, long, long)>
    //   38   70:iconst_0        
    //   39   71:ireturn         
    //   40   72:aload_0         
    //   41   73:lload_1         
    //   42   74:aload_0         
    //   43   75:getfield        #27  <Field long mSeekTime>
    //   44   78:lsub            
    //   45   79:putfield        #30  <Field long mStartTime>
    //   46   82:aload_0         
    //   47   83:ldc2w           #13  <Long -1L>
    //   48   86:putfield        #27  <Field long mSeekTime>
    //   49   89:goto            28
    //   50   92:lload_1         
    //   51   93:aload_0         
    //   52   94:getfield        #16  <Field long mPreviousTime>
    //   53   97:lsub            
    //   54   98:lstore_3        
    //   55   99:goto            52
    }

    void initAnimation()
    {
    //    0    0:return          
    }

    public void setTimeListener(TimeListener timelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #32  <Field TimeAnimator$TimeListener mListener>
    //    3    5:return          
    }

    private TimeListener mListener;
    private long mPreviousTime;
}
