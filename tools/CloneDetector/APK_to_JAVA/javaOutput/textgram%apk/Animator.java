// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class Animator
    implements Cloneable
{
    public static interface AnimatorListener
    {

        public abstract void onAnimationCancel(Animator animator);

        public abstract void onAnimationEnd(Animator animator);

        public abstract void onAnimationRepeat(Animator animator);

        public abstract void onAnimationStart(Animator animator);
    }


    public Animator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #13  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #15  <Field ArrayList mListeners>
    //    5    9:return          
    }

    public void addListener(AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field ArrayList mListeners>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #19  <Class ArrayList>
    //    5   11:dup             
    //    6   12:invokespecial   #20  <Method void ArrayList()>
    //    7   15:putfield        #15  <Field ArrayList mListeners>
    //    8   18:aload_0         
    //    9   19:getfield        #15  <Field ArrayList mListeners>
    //   10   22:aload_1         
    //   11   23:invokevirtual   #24  <Method boolean ArrayList.add(Object)>
    //   12   26:pop             
    //   13   27:return          
    }

    public void cancel()
    {
    //    0    0:return          
    }

    public Animator clone()
    {
    // try 0 37 handler(s) 66
    //    0    0:aload_0         
    //    1    1:invokespecial   #32  <Method Object Object.clone()>
    //    2    4:checkcast       #2   <Class Animator>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:getfield        #15  <Field ArrayList mListeners>
    //    6   12:ifnull          82
    //    7   15:aload_0         
    //    8   16:getfield        #15  <Field ArrayList mListeners>
    //    9   19:astore_3        
    //   10   20:aload_2         
    //   11   21:new             #19  <Class ArrayList>
    //   12   24:dup             
    //   13   25:invokespecial   #20  <Method void ArrayList()>
    //   14   28:putfield        #15  <Field ArrayList mListeners>
    //   15   31:aload_3         
    //   16   32:invokevirtual   #36  <Method int ArrayList.size()>
    //   17   35:istore          4
    //   18   37:iconst_0        
    //   19   38:istore          5
    //   20   40:goto            75
    // try 43 60 handler(s) 66
    //   21   43:aload_2         
    //   22   44:getfield        #15  <Field ArrayList mListeners>
    //   23   47:aload_3         
    //   24   48:iload           5
    //   25   50:invokevirtual   #40  <Method Object ArrayList.get(int)>
    //   26   53:checkcast       #42  <Class Animator$AnimatorListener>
    //   27   56:invokevirtual   #24  <Method boolean ArrayList.add(Object)>
    //   28   59:pop             
    //   29   60:iinc            5  1
    //   30   63:goto            75
    // catch CloneNotSupportedException CloneNotSupportedException
    //   31   66:astore_1        
    //   32   67:new             #44  <Class AssertionError>
    //   33   70:dup             
    //   34   71:invokespecial   #45  <Method void AssertionError()>
    //   35   74:athrow          
    //   36   75:iload           5
    //   37   77:iload           4
    //   38   79:icmplt          43
    //   39   82:aload_2         
    //   40   83:areturn         
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #47  <Method Animator clone()>
    //    2    4:areturn         
    }

    public void end()
    {
    //    0    0:return          
    }

    public abstract long getDuration();

    public ArrayList getListeners()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field ArrayList mListeners>
    //    2    4:areturn         
    }

    public abstract long getStartDelay();

    public abstract boolean isRunning();

    public boolean isStarted()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #58  <Method boolean isRunning()>
    //    2    4:ireturn         
    }

    public void removeAllListeners()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field ArrayList mListeners>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #15  <Field ArrayList mListeners>
    //    5   11:invokevirtual   #62  <Method void ArrayList.clear()>
    //    6   14:aload_0         
    //    7   15:aconst_null     
    //    8   16:putfield        #15  <Field ArrayList mListeners>
    //    9   19:return          
    }

    public void removeListener(AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #15  <Field ArrayList mListeners>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #15  <Field ArrayList mListeners>
    //    6   12:aload_1         
    //    7   13:invokevirtual   #66  <Method boolean ArrayList.remove(Object)>
    //    8   16:pop             
    //    9   17:aload_0         
    //   10   18:getfield        #15  <Field ArrayList mListeners>
    //   11   21:invokevirtual   #36  <Method int ArrayList.size()>
    //   12   24:ifne            7
    //   13   27:aload_0         
    //   14   28:aconst_null     
    //   15   29:putfield        #15  <Field ArrayList mListeners>
    //   16   32:return          
    }

    public abstract Animator setDuration(long l);

    public abstract void setInterpolator(Interpolator interpolator);

    public abstract void setStartDelay(long l);

    public void setTarget(Object obj)
    {
    //    0    0:return          
    }

    public void setupEndValues()
    {
    //    0    0:return          
    }

    public void setupStartValues()
    {
    //    0    0:return          
    }

    public void start()
    {
    //    0    0:return          
    }

    ArrayList mListeners;
}
