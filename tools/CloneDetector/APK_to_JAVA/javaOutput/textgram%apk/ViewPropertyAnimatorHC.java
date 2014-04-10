// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimator

class ViewPropertyAnimatorHC extends ViewPropertyAnimator
{
    private class AnimatorEventListener
        implements com.nineoldandroids.animation.Animator.AnimatorListener, com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener
    {

        private AnimatorEventListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        AnimatorEventListener(AnimatorEventListener animatoreventlistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #20  <Method void ViewPropertyAnimatorHC$AnimatorEventListener(ViewPropertyAnimatorHC)>
        //    3    5:return          
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #30  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationCancel(Animator)>
        //    9   23:return          
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #33  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationEnd(Animator)>
        //    9   23:aload_0         
        //   10   24:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //   11   27:invokestatic    #37  <Method HashMap ViewPropertyAnimatorHC.access$2(ViewPropertyAnimatorHC)>
        //   12   30:aload_1         
        //   13   31:invokevirtual   #43  <Method Object HashMap.remove(Object)>
        //   14   34:pop             
        //   15   35:aload_0         
        //   16   36:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //   17   39:invokestatic    #37  <Method HashMap ViewPropertyAnimatorHC.access$2(ViewPropertyAnimatorHC)>
        //   18   42:invokevirtual   #47  <Method boolean HashMap.isEmpty()>
        //   19   45:ifeq            56
        //   20   48:aload_0         
        //   21   49:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //   22   52:aconst_null     
        //   23   53:invokestatic    #51  <Method void ViewPropertyAnimatorHC.access$3(ViewPropertyAnimatorHC, com.nineoldandroids.animation.Animator$AnimatorListener)>
        //   24   56:return          
        }

        public void onAnimationRepeat(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #54  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationRepeat(Animator)>
        //    9   23:return          
        }

        public void onAnimationStart(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorHC.access$1(ViewPropertyAnimatorHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #57  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationStart(Animator)>
        //    9   23:return          
        }

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #65  <Method float ValueAnimator.getAnimatedFraction()>
        //    2    4:fstore_2        
        //    3    5:aload_0         
        //    4    6:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    5    9:invokestatic    #37  <Method HashMap ViewPropertyAnimatorHC.access$2(ViewPropertyAnimatorHC)>
        //    6   12:aload_1         
        //    7   13:invokevirtual   #68  <Method Object HashMap.get(Object)>
        //    8   16:checkcast       #70  <Class ViewPropertyAnimatorHC$PropertyBundle>
        //    9   19:astore_3        
        //   10   20:sipush          511
        //   11   23:aload_3         
        //   12   24:getfield        #74  <Field int ViewPropertyAnimatorHC$PropertyBundle.mPropertyMask>
        //   13   27:iand            
        //   14   28:ifeq            56
        //   15   31:aload_0         
        //   16   32:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //   17   35:invokestatic    #78  <Method WeakReference ViewPropertyAnimatorHC.access$4(ViewPropertyAnimatorHC)>
        //   18   38:invokevirtual   #83  <Method Object WeakReference.get()>
        //   19   41:checkcast       #85  <Class View>
        //   20   44:astore          10
        //   21   46:aload           10
        //   22   48:ifnull          56
        //   23   51:aload           10
        //   24   53:invokevirtual   #88  <Method void View.invalidate()>
        //   25   56:aload_3         
        //   26   57:getfield        #92  <Field ArrayList ViewPropertyAnimatorHC$PropertyBundle.mNameValuesHolder>
        //   27   60:astore          4
        //   28   62:aload           4
        //   29   64:ifnull          84
        //   30   67:aload           4
        //   31   69:invokevirtual   #98  <Method int ArrayList.size()>
        //   32   72:istore          6
        //   33   74:iconst_0        
        //   34   75:istore          7
        //   35   77:iload           7
        //   36   79:iload           6
        //   37   81:icmplt          110
        //   38   84:aload_0         
        //   39   85:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //   40   88:invokestatic    #78  <Method WeakReference ViewPropertyAnimatorHC.access$4(ViewPropertyAnimatorHC)>
        //   41   91:invokevirtual   #83  <Method Object WeakReference.get()>
        //   42   94:checkcast       #85  <Class View>
        //   43   97:astore          5
        //   44   99:aload           5
        //   45  101:ifnull          109
        //   46  104:aload           5
        //   47  106:invokevirtual   #88  <Method void View.invalidate()>
        //   48  109:return          
        //   49  110:aload           4
        //   50  112:iload           7
        //   51  114:invokevirtual   #101 <Method Object ArrayList.get(int)>
        //   52  117:checkcast       #103 <Class ViewPropertyAnimatorHC$NameValuesHolder>
        //   53  120:astore          8
        //   54  122:aload           8
        //   55  124:getfield        #107 <Field float ViewPropertyAnimatorHC$NameValuesHolder.mFromValue>
        //   56  127:fload_2         
        //   57  128:aload           8
        //   58  130:getfield        #110 <Field float ViewPropertyAnimatorHC$NameValuesHolder.mDeltaValue>
        //   59  133:fmul            
        //   60  134:fadd            
        //   61  135:fstore          9
        //   62  137:aload_0         
        //   63  138:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //   64  141:aload           8
        //   65  143:getfield        #113 <Field int ViewPropertyAnimatorHC$NameValuesHolder.mNameConstant>
        //   66  146:fload           9
        //   67  148:invokestatic    #117 <Method void ViewPropertyAnimatorHC.access$5(ViewPropertyAnimatorHC, int, float)>
        //   68  151:iinc            7  1
        //   69  154:goto            77
        }

        final ViewPropertyAnimatorHC this$0;
    }

    private static class NameValuesHolder
    {

        NameValuesHolder(int i, float f, float f1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iload_1         
        //    4    6:putfield        #16  <Field int mNameConstant>
        //    5    9:aload_0         
        //    6   10:fload_2         
        //    7   11:putfield        #18  <Field float mFromValue>
        //    8   14:aload_0         
        //    9   15:fload_3         
        //   10   16:putfield        #20  <Field float mDeltaValue>
        //   11   19:return          
        }

        float mDeltaValue;
        float mFromValue;
        int mNameConstant;
    }

    private static class PropertyBundle
    {

        PropertyBundle(int i, ArrayList arraylist)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iload_1         
        //    4    6:putfield        #16  <Field int mPropertyMask>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #18  <Field ArrayList mNameValuesHolder>
        //    8   14:return          
        }

        boolean cancel(int i)
        {
        //    0    0:iload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #16  <Field int mPropertyMask>
        //    3    5:iand            
        //    4    6:ifeq            31
        //    5    9:aload_0         
        //    6   10:getfield        #18  <Field ArrayList mNameValuesHolder>
        //    7   13:ifnull          31
        //    8   16:aload_0         
        //    9   17:getfield        #18  <Field ArrayList mNameValuesHolder>
        //   10   20:invokevirtual   #26  <Method int ArrayList.size()>
        //   11   23:istore_2        
        //   12   24:iconst_0        
        //   13   25:istore_3        
        //   14   26:iload_3         
        //   15   27:iload_2         
        //   16   28:icmplt          33
        //   17   31:iconst_0        
        //   18   32:ireturn         
        //   19   33:aload_0         
        //   20   34:getfield        #18  <Field ArrayList mNameValuesHolder>
        //   21   37:iload_3         
        //   22   38:invokevirtual   #30  <Method Object ArrayList.get(int)>
        //   23   41:checkcast       #32  <Class ViewPropertyAnimatorHC$NameValuesHolder>
        //   24   44:getfield        #35  <Field int ViewPropertyAnimatorHC$NameValuesHolder.mNameConstant>
        //   25   47:iload_1         
        //   26   48:icmpne          74
        //   27   51:aload_0         
        //   28   52:getfield        #18  <Field ArrayList mNameValuesHolder>
        //   29   55:iload_3         
        //   30   56:invokevirtual   #38  <Method Object ArrayList.remove(int)>
        //   31   59:pop             
        //   32   60:aload_0         
        //   33   61:aload_0         
        //   34   62:getfield        #16  <Field int mPropertyMask>
        //   35   65:iload_1         
        //   36   66:iconst_m1       
        //   37   67:ixor            
        //   38   68:iand            
        //   39   69:putfield        #16  <Field int mPropertyMask>
        //   40   72:iconst_1        
        //   41   73:ireturn         
        //   42   74:iinc            3  1
        //   43   77:goto            26
        }

        ArrayList mNameValuesHolder;
        int mPropertyMask;
    }


    ViewPropertyAnimatorHC(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #58  <Method void ViewPropertyAnimator()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #60  <Field boolean mDurationSet>
    //    5    9:aload_0         
    //    6   10:lconst_0        
    //    7   11:putfield        #62  <Field long mStartDelay>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #64  <Field boolean mStartDelaySet>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #66  <Field boolean mInterpolatorSet>
    //   14   24:aload_0         
    //   15   25:aconst_null     
    //   16   26:putfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //   17   29:aload_0         
    //   18   30:new             #70  <Class ViewPropertyAnimatorHC$AnimatorEventListener>
    //   19   33:dup             
    //   20   34:aload_0         
    //   21   35:aconst_null     
    //   22   36:invokespecial   #73  <Method void ViewPropertyAnimatorHC$AnimatorEventListener(ViewPropertyAnimatorHC, ViewPropertyAnimatorHC$AnimatorEventListener)>
    //   23   39:putfield        #75  <Field ViewPropertyAnimatorHC$AnimatorEventListener mAnimatorEventListener>
    //   24   42:aload_0         
    //   25   43:new             #77  <Class ArrayList>
    //   26   46:dup             
    //   27   47:invokespecial   #78  <Method void ArrayList()>
    //   28   50:putfield        #80  <Field ArrayList mPendingAnimations>
    //   29   53:aload_0         
    //   30   54:new             #82  <Class ViewPropertyAnimatorHC$1>
    //   31   57:dup             
    //   32   58:aload_0         
    //   33   59:invokespecial   #85  <Method void ViewPropertyAnimatorHC$1(ViewPropertyAnimatorHC)>
    //   34   62:putfield        #87  <Field Runnable mAnimationStarter>
    //   35   65:aload_0         
    //   36   66:new             #89  <Class HashMap>
    //   37   69:dup             
    //   38   70:invokespecial   #90  <Method void HashMap()>
    //   39   73:putfield        #92  <Field HashMap mAnimatorMap>
    //   40   76:aload_0         
    //   41   77:new             #94  <Class WeakReference>
    //   42   80:dup             
    //   43   81:aload_1         
    //   44   82:invokespecial   #97  <Method void WeakReference(Object)>
    //   45   85:putfield        #99  <Field WeakReference mView>
    //   46   88:return          
    }

    static void access$0(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #103 <Method void startAnimation()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #103 <Method void startAnimation()>
    //    5    4:return          
    }

    static com.nineoldandroids.animation.Animator.AnimatorListener access$1(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    5    4:areturn         
    }

    static HashMap access$2(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field HashMap mAnimatorMap>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #92  <Field HashMap mAnimatorMap>
    //    5    4:areturn         
    }

    static void access$3(ViewPropertyAnimatorHC viewpropertyanimatorhc, com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:putfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    7    5:return          
    }

    static WeakReference access$4(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #99  <Field WeakReference mView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #99  <Field WeakReference mView>
    //    5    4:areturn         
    }

    static void access$5(ViewPropertyAnimatorHC viewpropertyanimatorhc, int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:fload_2         
    //    3    3:invokespecial   #117 <Method void setValue(int, float)>
    //    4    6:return          
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:fload_2         
    //    8    3:invokespecial   #117 <Method void setValue(int, float)>
    //    9    6:return          
    }

    private void animateProperty(int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #122 <Method float getValue(int)>
    //    3    5:fstore_3        
    //    4    6:aload_0         
    //    5    7:iload_1         
    //    6    8:fload_3         
    //    7    9:fload_2         
    //    8   10:fload_3         
    //    9   11:fsub            
    //   10   12:invokespecial   #126 <Method void animatePropertyBy(int, float, float)>
    //   11   15:return          
    }

    private void animatePropertyBy(int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_0         
    //    3    3:iload_1         
    //    4    4:invokespecial   #122 <Method float getValue(int)>
    //    5    7:fload_2         
    //    6    8:invokespecial   #126 <Method void animatePropertyBy(int, float, float)>
    //    7   11:return          
    }

    private void animatePropertyBy(int i, float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field HashMap mAnimatorMap>
    //    2    4:invokevirtual   #130 <Method int HashMap.size()>
    //    3    7:ifle            51
    //    4   10:aload_0         
    //    5   11:getfield        #92  <Field HashMap mAnimatorMap>
    //    6   14:invokevirtual   #134 <Method Set HashMap.keySet()>
    //    7   17:invokeinterface #140 <Method Iterator Set.iterator()>
    //    8   22:astore          9
    //    9   24:aload           9
    //   10   26:invokeinterface #146 <Method boolean Iterator.hasNext()>
    //   11   31:istore          10
    //   12   33:aconst_null     
    //   13   34:astore          11
    //   14   36:iload           10
    //   15   38:ifne            111
    //   16   41:aload           11
    //   17   43:ifnull          51
    //   18   46:aload           11
    //   19   48:invokevirtual   #151 <Method void Animator.cancel()>
    //   20   51:new             #153 <Class ViewPropertyAnimatorHC$NameValuesHolder>
    //   21   54:dup             
    //   22   55:iload_1         
    //   23   56:fload_2         
    //   24   57:fload_3         
    //   25   58:invokespecial   #155 <Method void ViewPropertyAnimatorHC$NameValuesHolder(int, float, float)>
    //   26   61:astore          4
    //   27   63:aload_0         
    //   28   64:getfield        #80  <Field ArrayList mPendingAnimations>
    //   29   67:aload           4
    //   30   69:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
    //   31   72:pop             
    //   32   73:aload_0         
    //   33   74:getfield        #99  <Field WeakReference mView>
    //   34   77:invokevirtual   #163 <Method Object WeakReference.get()>
    //   35   80:checkcast       #165 <Class View>
    //   36   83:astore          6
    //   37   85:aload           6
    //   38   87:ifnull          110
    //   39   90:aload           6
    //   40   92:aload_0         
    //   41   93:getfield        #87  <Field Runnable mAnimationStarter>
    //   42   96:invokevirtual   #169 <Method boolean View.removeCallbacks(Runnable)>
    //   43   99:pop             
    //   44  100:aload           6
    //   45  102:aload_0         
    //   46  103:getfield        #87  <Field Runnable mAnimationStarter>
    //   47  106:invokevirtual   #172 <Method boolean View.post(Runnable)>
    //   48  109:pop             
    //   49  110:return          
    //   50  111:aload           9
    //   51  113:invokeinterface #175 <Method Object Iterator.next()>
    //   52  118:checkcast       #148 <Class Animator>
    //   53  121:astore          12
    //   54  123:aload_0         
    //   55  124:getfield        #92  <Field HashMap mAnimatorMap>
    //   56  127:aload           12
    //   57  129:invokevirtual   #178 <Method Object HashMap.get(Object)>
    //   58  132:checkcast       #180 <Class ViewPropertyAnimatorHC$PropertyBundle>
    //   59  135:astore          13
    //   60  137:aload           13
    //   61  139:iload_1         
    //   62  140:invokevirtual   #183 <Method boolean ViewPropertyAnimatorHC$PropertyBundle.cancel(int)>
    //   63  143:ifeq            24
    //   64  146:aload           13
    //   65  148:getfield        #186 <Field int ViewPropertyAnimatorHC$PropertyBundle.mPropertyMask>
    //   66  151:ifne            24
    //   67  154:aload           12
    //   68  156:astore          11
    //   69  158:goto            41
    }

    private float getValue(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #99  <Field WeakReference mView>
    //    2    4:invokevirtual   #163 <Method Object WeakReference.get()>
    //    3    7:checkcast       #165 <Class View>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnull          108
    //    7   15:iload_1         
    //    8   16:lookupswitch    10: default 108
    //                   1: 110
    //                   2: 115
    //                   4: 135
    //                   8: 140
    //                   16: 120
    //                   32: 125
    //                   64: 130
    //                   128: 145
    //                   256: 150
    //                   512: 155
    //    9  108:fconst_0        
    //   10  109:freturn         
    //   11  110:aload_2         
    //   12  111:invokevirtual   #190 <Method float View.getTranslationX()>
    //   13  114:freturn         
    //   14  115:aload_2         
    //   15  116:invokevirtual   #193 <Method float View.getTranslationY()>
    //   16  119:freturn         
    //   17  120:aload_2         
    //   18  121:invokevirtual   #196 <Method float View.getRotation()>
    //   19  124:freturn         
    //   20  125:aload_2         
    //   21  126:invokevirtual   #199 <Method float View.getRotationX()>
    //   22  129:freturn         
    //   23  130:aload_2         
    //   24  131:invokevirtual   #202 <Method float View.getRotationY()>
    //   25  134:freturn         
    //   26  135:aload_2         
    //   27  136:invokevirtual   #205 <Method float View.getScaleX()>
    //   28  139:freturn         
    //   29  140:aload_2         
    //   30  141:invokevirtual   #208 <Method float View.getScaleY()>
    //   31  144:freturn         
    //   32  145:aload_2         
    //   33  146:invokevirtual   #211 <Method float View.getX()>
    //   34  149:freturn         
    //   35  150:aload_2         
    //   36  151:invokevirtual   #214 <Method float View.getY()>
    //   37  154:freturn         
    //   38  155:aload_2         
    //   39  156:invokevirtual   #217 <Method float View.getAlpha()>
    //   40  159:freturn         
    }

    private void setValue(int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #99  <Field WeakReference mView>
    //    2    4:invokevirtual   #163 <Method Object WeakReference.get()>
    //    3    7:checkcast       #165 <Class View>
    //    4   10:astore_3        
    //    5   11:aload_3         
    //    6   12:ifnull          108
    //    7   15:iload_1         
    //    8   16:lookupswitch    10: default 108
    //                   1: 109
    //                   2: 115
    //                   4: 139
    //                   8: 145
    //                   16: 121
    //                   32: 127
    //                   64: 133
    //                   128: 151
    //                   256: 157
    //                   512: 163
    //    9  108:return          
    //   10  109:aload_3         
    //   11  110:fload_2         
    //   12  111:invokevirtual   #221 <Method void View.setTranslationX(float)>
    //   13  114:return          
    //   14  115:aload_3         
    //   15  116:fload_2         
    //   16  117:invokevirtual   #224 <Method void View.setTranslationY(float)>
    //   17  120:return          
    //   18  121:aload_3         
    //   19  122:fload_2         
    //   20  123:invokevirtual   #227 <Method void View.setRotation(float)>
    //   21  126:return          
    //   22  127:aload_3         
    //   23  128:fload_2         
    //   24  129:invokevirtual   #230 <Method void View.setRotationX(float)>
    //   25  132:return          
    //   26  133:aload_3         
    //   27  134:fload_2         
    //   28  135:invokevirtual   #233 <Method void View.setRotationY(float)>
    //   29  138:return          
    //   30  139:aload_3         
    //   31  140:fload_2         
    //   32  141:invokevirtual   #236 <Method void View.setScaleX(float)>
    //   33  144:return          
    //   34  145:aload_3         
    //   35  146:fload_2         
    //   36  147:invokevirtual   #239 <Method void View.setScaleY(float)>
    //   37  150:return          
    //   38  151:aload_3         
    //   39  152:fload_2         
    //   40  153:invokevirtual   #242 <Method void View.setX(float)>
    //   41  156:return          
    //   42  157:aload_3         
    //   43  158:fload_2         
    //   44  159:invokevirtual   #245 <Method void View.setY(float)>
    //   45  162:return          
    //   46  163:aload_3         
    //   47  164:fload_2         
    //   48  165:invokevirtual   #248 <Method void View.setAlpha(float)>
    //   49  168:return          
    }

    private void startAnimation()
    {
    //    0    0:iconst_1        
    //    1    1:newarray        float[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:fconst_1        
    //    5    6:fastore         
    //    6    7:invokestatic    #254 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
    //    7   10:astore_1        
    //    8   11:aload_0         
    //    9   12:getfield        #80  <Field ArrayList mPendingAnimations>
    //   10   15:invokevirtual   #257 <Method Object ArrayList.clone()>
    //   11   18:checkcast       #77  <Class ArrayList>
    //   12   21:astore_2        
    //   13   22:aload_0         
    //   14   23:getfield        #80  <Field ArrayList mPendingAnimations>
    //   15   26:invokevirtual   #260 <Method void ArrayList.clear()>
    //   16   29:iconst_0        
    //   17   30:istore_3        
    //   18   31:aload_2         
    //   19   32:invokevirtual   #261 <Method int ArrayList.size()>
    //   20   35:istore          4
    //   21   37:iconst_0        
    //   22   38:istore          5
    //   23   40:iload           5
    //   24   42:iload           4
    //   25   44:icmplt          132
    //   26   47:aload_0         
    //   27   48:getfield        #92  <Field HashMap mAnimatorMap>
    //   28   51:aload_1         
    //   29   52:new             #180 <Class ViewPropertyAnimatorHC$PropertyBundle>
    //   30   55:dup             
    //   31   56:iload_3         
    //   32   57:aload_2         
    //   33   58:invokespecial   #264 <Method void ViewPropertyAnimatorHC$PropertyBundle(int, ArrayList)>
    //   34   61:invokevirtual   #268 <Method Object HashMap.put(Object, Object)>
    //   35   64:pop             
    //   36   65:aload_1         
    //   37   66:aload_0         
    //   38   67:getfield        #75  <Field ViewPropertyAnimatorHC$AnimatorEventListener mAnimatorEventListener>
    //   39   70:invokevirtual   #272 <Method void ValueAnimator.addUpdateListener(com.nineoldandroids.animation.ValueAnimator$AnimatorUpdateListener)>
    //   40   73:aload_1         
    //   41   74:aload_0         
    //   42   75:getfield        #75  <Field ViewPropertyAnimatorHC$AnimatorEventListener mAnimatorEventListener>
    //   43   78:invokevirtual   #276 <Method void ValueAnimator.addListener(com.nineoldandroids.animation.Animator$AnimatorListener)>
    //   44   81:aload_0         
    //   45   82:getfield        #64  <Field boolean mStartDelaySet>
    //   46   85:ifeq            96
    //   47   88:aload_1         
    //   48   89:aload_0         
    //   49   90:getfield        #62  <Field long mStartDelay>
    //   50   93:invokevirtual   #280 <Method void ValueAnimator.setStartDelay(long)>
    //   51   96:aload_0         
    //   52   97:getfield        #60  <Field boolean mDurationSet>
    //   53  100:ifeq            112
    //   54  103:aload_1         
    //   55  104:aload_0         
    //   56  105:getfield        #282 <Field long mDuration>
    //   57  108:invokevirtual   #286 <Method ValueAnimator ValueAnimator.setDuration(long)>
    //   58  111:pop             
    //   59  112:aload_0         
    //   60  113:getfield        #66  <Field boolean mInterpolatorSet>
    //   61  116:ifeq            127
    //   62  119:aload_1         
    //   63  120:aload_0         
    //   64  121:getfield        #288 <Field Interpolator mInterpolator>
    //   65  124:invokevirtual   #292 <Method void ValueAnimator.setInterpolator(Interpolator)>
    //   66  127:aload_1         
    //   67  128:invokevirtual   #295 <Method void ValueAnimator.start()>
    //   68  131:return          
    //   69  132:iload_3         
    //   70  133:aload_2         
    //   71  134:iload           5
    //   72  136:invokevirtual   #298 <Method Object ArrayList.get(int)>
    //   73  139:checkcast       #153 <Class ViewPropertyAnimatorHC$NameValuesHolder>
    //   74  142:getfield        #301 <Field int ViewPropertyAnimatorHC$NameValuesHolder.mNameConstant>
    //   75  145:ior             
    //   76  146:istore_3        
    //   77  147:iinc            5  1
    //   78  150:goto            40
    }

    public ViewPropertyAnimator alpha(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          512
    //    2    4:fload_1         
    //    3    5:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator alphaBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          512
    //    2    4:fload_1         
    //    3    5:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public void cancel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field HashMap mAnimatorMap>
    //    2    4:invokevirtual   #130 <Method int HashMap.size()>
    //    3    7:ifle            38
    //    4   10:aload_0         
    //    5   11:getfield        #92  <Field HashMap mAnimatorMap>
    //    6   14:invokevirtual   #309 <Method Object HashMap.clone()>
    //    7   17:checkcast       #89  <Class HashMap>
    //    8   20:invokevirtual   #134 <Method Set HashMap.keySet()>
    //    9   23:invokeinterface #140 <Method Iterator Set.iterator()>
    //   10   28:astore_3        
    //   11   29:aload_3         
    //   12   30:invokeinterface #146 <Method boolean Iterator.hasNext()>
    //   13   35:ifne            70
    //   14   38:aload_0         
    //   15   39:getfield        #80  <Field ArrayList mPendingAnimations>
    //   16   42:invokevirtual   #260 <Method void ArrayList.clear()>
    //   17   45:aload_0         
    //   18   46:getfield        #99  <Field WeakReference mView>
    //   19   49:invokevirtual   #163 <Method Object WeakReference.get()>
    //   20   52:checkcast       #165 <Class View>
    //   21   55:astore_1        
    //   22   56:aload_1         
    //   23   57:ifnull          69
    //   24   60:aload_1         
    //   25   61:aload_0         
    //   26   62:getfield        #87  <Field Runnable mAnimationStarter>
    //   27   65:invokevirtual   #169 <Method boolean View.removeCallbacks(Runnable)>
    //   28   68:pop             
    //   29   69:return          
    //   30   70:aload_3         
    //   31   71:invokeinterface #175 <Method Object Iterator.next()>
    //   32   76:checkcast       #148 <Class Animator>
    //   33   79:invokevirtual   #151 <Method void Animator.cancel()>
    //   34   82:goto            29
    }

    public long getDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field boolean mDurationSet>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:getfield        #282 <Field long mDuration>
    //    5   11:lreturn         
    //    6   12:new             #250 <Class ValueAnimator>
    //    7   15:dup             
    //    8   16:invokespecial   #312 <Method void ValueAnimator()>
    //    9   19:invokevirtual   #314 <Method long ValueAnimator.getDuration()>
    //   10   22:lreturn         
    }

    public long getStartDelay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field boolean mStartDelaySet>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:getfield        #62  <Field long mStartDelay>
    //    5   11:lreturn         
    //    6   12:lconst_0        
    //    7   13:lreturn         
    }

    public ViewPropertyAnimator rotation(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          16
    //    2    3:fload_1         
    //    3    4:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          16
    //    2    3:fload_1         
    //    3    4:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          32
    //    2    3:fload_1         
    //    3    4:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          32
    //    2    3:fload_1         
    //    3    4:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          64
    //    2    3:fload_1         
    //    3    4:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          64
    //    2    3:fload_1         
    //    3    4:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator scaleX(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_4        
    //    2    2:fload_1         
    //    3    3:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator scaleXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_4        
    //    2    2:fload_1         
    //    3    3:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator scaleY(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          8
    //    2    3:fload_1         
    //    3    4:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator scaleYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          8
    //    2    3:fload_1         
    //    3    4:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator setDuration(long l)
    {
    //    0    0:lload_1         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifge            31
    //    4    6:new             #328 <Class IllegalArgumentException>
    //    5    9:dup             
    //    6   10:new             #330 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:ldc2            #332 <String "Animators cannot have negative duration: ">
    //    9   17:invokespecial   #335 <Method void StringBuilder(String)>
    //   10   20:lload_1         
    //   11   21:invokevirtual   #339 <Method StringBuilder StringBuilder.append(long)>
    //   12   24:invokevirtual   #343 <Method String StringBuilder.toString()>
    //   13   27:invokespecial   #344 <Method void IllegalArgumentException(String)>
    //   14   30:athrow          
    //   15   31:aload_0         
    //   16   32:iconst_1        
    //   17   33:putfield        #60  <Field boolean mDurationSet>
    //   18   36:aload_0         
    //   19   37:lload_1         
    //   20   38:putfield        #282 <Field long mDuration>
    //   21   41:aload_0         
    //   22   42:areturn         
    }

    public ViewPropertyAnimator setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #66  <Field boolean mInterpolatorSet>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #288 <Field Interpolator mInterpolator>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public ViewPropertyAnimator setListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public ViewPropertyAnimator setStartDelay(long l)
    {
    //    0    0:lload_1         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifge            31
    //    4    6:new             #328 <Class IllegalArgumentException>
    //    5    9:dup             
    //    6   10:new             #330 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:ldc2            #332 <String "Animators cannot have negative duration: ">
    //    9   17:invokespecial   #335 <Method void StringBuilder(String)>
    //   10   20:lload_1         
    //   11   21:invokevirtual   #339 <Method StringBuilder StringBuilder.append(long)>
    //   12   24:invokevirtual   #343 <Method String StringBuilder.toString()>
    //   13   27:invokespecial   #344 <Method void IllegalArgumentException(String)>
    //   14   30:athrow          
    //   15   31:aload_0         
    //   16   32:iconst_1        
    //   17   33:putfield        #64  <Field boolean mStartDelaySet>
    //   18   36:aload_0         
    //   19   37:lload_1         
    //   20   38:putfield        #62  <Field long mStartDelay>
    //   21   41:aload_0         
    //   22   42:areturn         
    }

    public void start()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #103 <Method void startAnimation()>
    //    2    4:return          
    }

    public ViewPropertyAnimator translationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:fload_1         
    //    3    3:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator translationXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:fload_1         
    //    3    3:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator translationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_2        
    //    2    2:fload_1         
    //    3    3:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator translationYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_2        
    //    2    2:fload_1         
    //    3    3:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator x(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          128
    //    2    4:fload_1         
    //    3    5:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator xBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          128
    //    2    4:fload_1         
    //    3    5:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator y(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          256
    //    2    4:fload_1         
    //    3    5:invokespecial   #305 <Method void animateProperty(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator yBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          256
    //    2    4:fload_1         
    //    3    5:invokespecial   #308 <Method void animatePropertyBy(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    private static final int ALPHA = 512;
    private static final int NONE = 0;
    private static final int ROTATION = 16;
    private static final int ROTATION_X = 32;
    private static final int ROTATION_Y = 64;
    private static final int SCALE_X = 4;
    private static final int SCALE_Y = 8;
    private static final int TRANSFORM_MASK = 511;
    private static final int TRANSLATION_X = 1;
    private static final int TRANSLATION_Y = 2;
    private static final int X = 128;
    private static final int Y = 256;
    private Runnable mAnimationStarter;
    private AnimatorEventListener mAnimatorEventListener;
    private HashMap mAnimatorMap;
    private long mDuration;
    private boolean mDurationSet;
    private Interpolator mInterpolator;
    private boolean mInterpolatorSet;
    private com.nineoldandroids.animation.Animator.AnimatorListener mListener;
    ArrayList mPendingAnimations;
    private long mStartDelay;
    private boolean mStartDelaySet;
    private final WeakReference mView;

    static void access$0(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #103 <Method void startAnimation()>
    //    2    4:return          
    }

    static com.nineoldandroids.animation.Animator.AnimatorListener access$1(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    2    4:areturn         
    }

    static HashMap access$2(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field HashMap mAnimatorMap>
    //    2    4:areturn         
    }

    static void access$3(ViewPropertyAnimatorHC viewpropertyanimatorhc, com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #68  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    3    5:return          
    }

    static WeakReference access$4(ViewPropertyAnimatorHC viewpropertyanimatorhc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #99  <Field WeakReference mView>
    //    2    4:areturn         
    }

    static void access$5(ViewPropertyAnimatorHC viewpropertyanimatorhc, int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:fload_2         
    //    3    3:invokespecial   #117 <Method void setValue(int, float)>
    //    4    6:return          
    }

    // Unreferenced inner class com/nineoldandroids/view/ViewPropertyAnimatorHC$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorHC this$0>
        //    2    4:invokestatic    #21  <Method void ViewPropertyAnimatorHC.access$0(ViewPropertyAnimatorHC)>
        //    3    7:return          
        }

        final ViewPropertyAnimatorHC this$0;
    }

}
