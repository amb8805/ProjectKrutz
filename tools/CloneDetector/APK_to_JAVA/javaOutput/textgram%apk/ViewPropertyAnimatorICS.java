// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimator

class ViewPropertyAnimatorICS extends com.nineoldandroids.view.ViewPropertyAnimator
{

    ViewPropertyAnimatorICS(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void com.nineoldandroids.view.ViewPropertyAnimator()>
    //    2    4:aload_0         
    //    3    5:new             #18  <Class WeakReference>
    //    4    8:dup             
    //    5    9:aload_1         
    //    6   10:invokevirtual   #24  <Method ViewPropertyAnimator View.animate()>
    //    7   13:invokespecial   #27  <Method void WeakReference(Object)>
    //    8   16:putfield        #29  <Field WeakReference mNative>
    //    9   19:return          
    }

    public com.nineoldandroids.view.ViewPropertyAnimator alpha(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #40  <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator alphaBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #43  <Method ViewPropertyAnimator ViewPropertyAnimator.alphaBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public void cancel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          19
    //    7   15:aload_1         
    //    8   16:invokevirtual   #46  <Method void ViewPropertyAnimator.cancel()>
    //    9   19:return          
    }

    public long getDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          20
    //    7   15:aload_1         
    //    8   16:invokevirtual   #50  <Method long ViewPropertyAnimator.getDuration()>
    //    9   19:lreturn         
    //   10   20:ldc2w           #7   <Long -1L>
    //   11   23:lreturn         
    }

    public long getStartDelay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          20
    //    7   15:aload_1         
    //    8   16:invokevirtual   #53  <Method long ViewPropertyAnimator.getStartDelay()>
    //    9   19:lreturn         
    //   10   20:ldc2w           #7   <Long -1L>
    //   11   23:lreturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator rotation(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #56  <Method ViewPropertyAnimator ViewPropertyAnimator.rotation(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator rotationBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #59  <Method ViewPropertyAnimator ViewPropertyAnimator.rotationBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator rotationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #62  <Method ViewPropertyAnimator ViewPropertyAnimator.rotationX(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator rotationXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #65  <Method ViewPropertyAnimator ViewPropertyAnimator.rotationXBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator rotationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #68  <Method ViewPropertyAnimator ViewPropertyAnimator.rotationY(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator rotationYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #71  <Method ViewPropertyAnimator ViewPropertyAnimator.rotationYBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator scaleX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #74  <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator scaleXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #77  <Method ViewPropertyAnimator ViewPropertyAnimator.scaleXBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator scaleY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #80  <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator scaleYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #83  <Method ViewPropertyAnimator ViewPropertyAnimator.scaleYBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator setDuration(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_3        
    //    5   11:aload_3         
    //    6   12:ifnull          21
    //    7   15:aload_3         
    //    8   16:lload_1         
    //    9   17:invokevirtual   #88  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:aload_1         
    //    9   17:invokevirtual   #93  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator setListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          25
    //    7   15:aload_1         
    //    8   16:ifnonnull       27
    //    9   19:aload_2         
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #98  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
    //   12   24:pop             
    //   13   25:aload_0         
    //   14   26:areturn         
    //   15   27:aload_2         
    //   16   28:new             #100 <Class ViewPropertyAnimatorICS$1>
    //   17   31:dup             
    //   18   32:aload_0         
    //   19   33:aload_1         
    //   20   34:invokespecial   #103 <Method void ViewPropertyAnimatorICS$1(ViewPropertyAnimatorICS, com.nineoldandroids.animation.Animator$AnimatorListener)>
    //   21   37:invokevirtual   #98  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
    //   22   40:pop             
    //   23   41:aload_0         
    //   24   42:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator setStartDelay(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_3        
    //    5   11:aload_3         
    //    6   12:ifnull          21
    //    7   15:aload_3         
    //    8   16:lload_1         
    //    9   17:invokevirtual   #106 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public void start()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnull          19
    //    7   15:aload_1         
    //    8   16:invokevirtual   #109 <Method void ViewPropertyAnimator.start()>
    //    9   19:return          
    }

    public com.nineoldandroids.view.ViewPropertyAnimator translationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #112 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator translationXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #115 <Method ViewPropertyAnimator ViewPropertyAnimator.translationXBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator translationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #118 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator translationYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #121 <Method ViewPropertyAnimator ViewPropertyAnimator.translationYBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator x(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #124 <Method ViewPropertyAnimator ViewPropertyAnimator.x(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator xBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #127 <Method ViewPropertyAnimator ViewPropertyAnimator.xBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator y(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #130 <Method ViewPropertyAnimator ViewPropertyAnimator.y(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    public com.nineoldandroids.view.ViewPropertyAnimator yBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field WeakReference mNative>
    //    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
    //    3    7:checkcast       #37  <Class ViewPropertyAnimator>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          21
    //    7   15:aload_2         
    //    8   16:fload_1         
    //    9   17:invokevirtual   #133 <Method ViewPropertyAnimator ViewPropertyAnimator.yBy(float)>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:areturn         
    }

    private static final long RETURN_WHEN_NULL = -1L;
    private final WeakReference mNative;

    // Unreferenced inner class com/nineoldandroids/view/ViewPropertyAnimatorICS$1

/* anonymous class */
    class _cls1
        implements android.animation.Animator.AnimatorListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field ViewPropertyAnimatorICS this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field com.nineoldandroids.animation.Animator$AnimatorListener val$listener>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field com.nineoldandroids.animation.Animator$AnimatorListener val$listener>
        //    2    4:aconst_null     
        //    3    5:invokeinterface #31  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationCancel(com.nineoldandroids.animation.Animator)>
        //    4   10:return          
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field com.nineoldandroids.animation.Animator$AnimatorListener val$listener>
        //    2    4:aconst_null     
        //    3    5:invokeinterface #34  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationEnd(com.nineoldandroids.animation.Animator)>
        //    4   10:return          
        }

        public void onAnimationRepeat(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field com.nineoldandroids.animation.Animator$AnimatorListener val$listener>
        //    2    4:aconst_null     
        //    3    5:invokeinterface #37  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationRepeat(com.nineoldandroids.animation.Animator)>
        //    4   10:return          
        }

        public void onAnimationStart(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field com.nineoldandroids.animation.Animator$AnimatorListener val$listener>
        //    2    4:aconst_null     
        //    3    5:invokeinterface #40  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationStart(com.nineoldandroids.animation.Animator)>
        //    4   10:return          
        }

        final ViewPropertyAnimatorICS this$0;
        private final com.nineoldandroids.animation.Animator.AnimatorListener val$listener;
    }

}
