// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimatorICS, ViewPropertyAnimatorHC, ViewPropertyAnimatorPreHC

public abstract class ViewPropertyAnimator
{

    static 
    {
    //    0    0:new             #11  <Class WeakHashMap>
    //    1    3:dup             
    //    2    4:iconst_0        
    //    3    5:invokespecial   #15  <Method void WeakHashMap(int)>
    //    4    8:putstatic       #17  <Field WeakHashMap ANIMATORS>
    //    5   11:return          
    }

    public ViewPropertyAnimator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #19  <Method void Object()>
    //    2    4:return          
    }

    public static ViewPropertyAnimator animate(View view)
    {
    //    0    0:getstatic       #17  <Field WeakHashMap ANIMATORS>
    //    1    3:aload_0         
    //    2    4:invokevirtual   #25  <Method Object WeakHashMap.get(Object)>
    //    3    7:checkcast       #2   <Class ViewPropertyAnimator>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnonnull       49
    //    7   15:getstatic       #31  <Field String android.os.Build$VERSION.SDK>
    //    8   18:invokestatic    #37  <Method Integer Integer.valueOf(String)>
    //    9   21:invokevirtual   #41  <Method int Integer.intValue()>
    //   10   24:istore_2        
    //   11   25:iload_2         
    //   12   26:bipush          14
    //   13   28:icmplt          51
    //   14   31:new             #43  <Class ViewPropertyAnimatorICS>
    //   15   34:dup             
    //   16   35:aload_0         
    //   17   36:invokespecial   #46  <Method void ViewPropertyAnimatorICS(View)>
    //   18   39:astore_1        
    //   19   40:getstatic       #17  <Field WeakHashMap ANIMATORS>
    //   20   43:aload_0         
    //   21   44:aload_1         
    //   22   45:invokevirtual   #50  <Method Object WeakHashMap.put(Object, Object)>
    //   23   48:pop             
    //   24   49:aload_1         
    //   25   50:areturn         
    //   26   51:iload_2         
    //   27   52:bipush          11
    //   28   54:icmplt          69
    //   29   57:new             #52  <Class ViewPropertyAnimatorHC>
    //   30   60:dup             
    //   31   61:aload_0         
    //   32   62:invokespecial   #53  <Method void ViewPropertyAnimatorHC(View)>
    //   33   65:astore_1        
    //   34   66:goto            40
    //   35   69:new             #55  <Class ViewPropertyAnimatorPreHC>
    //   36   72:dup             
    //   37   73:aload_0         
    //   38   74:invokespecial   #56  <Method void ViewPropertyAnimatorPreHC(View)>
    //   39   77:astore_1        
    //   40   78:goto            40
    }

    public abstract ViewPropertyAnimator alpha(float f);

    public abstract ViewPropertyAnimator alphaBy(float f);

    public abstract void cancel();

    public abstract long getDuration();

    public abstract long getStartDelay();

    public abstract ViewPropertyAnimator rotation(float f);

    public abstract ViewPropertyAnimator rotationBy(float f);

    public abstract ViewPropertyAnimator rotationX(float f);

    public abstract ViewPropertyAnimator rotationXBy(float f);

    public abstract ViewPropertyAnimator rotationY(float f);

    public abstract ViewPropertyAnimator rotationYBy(float f);

    public abstract ViewPropertyAnimator scaleX(float f);

    public abstract ViewPropertyAnimator scaleXBy(float f);

    public abstract ViewPropertyAnimator scaleY(float f);

    public abstract ViewPropertyAnimator scaleYBy(float f);

    public abstract ViewPropertyAnimator setDuration(long l);

    public abstract ViewPropertyAnimator setInterpolator(Interpolator interpolator);

    public abstract ViewPropertyAnimator setListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener);

    public abstract ViewPropertyAnimator setStartDelay(long l);

    public abstract void start();

    public abstract ViewPropertyAnimator translationX(float f);

    public abstract ViewPropertyAnimator translationXBy(float f);

    public abstract ViewPropertyAnimator translationY(float f);

    public abstract ViewPropertyAnimator translationYBy(float f);

    public abstract ViewPropertyAnimator x(float f);

    public abstract ViewPropertyAnimator xBy(float f);

    public abstract ViewPropertyAnimator y(float f);

    public abstract ViewPropertyAnimator yBy(float f);

    private static final WeakHashMap ANIMATORS;
}
