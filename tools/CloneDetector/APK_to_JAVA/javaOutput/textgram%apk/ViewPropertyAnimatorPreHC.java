// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.animation.AnimatorProxy;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimator

class ViewPropertyAnimatorPreHC extends ViewPropertyAnimator
{
    private class AnimatorEventListener
        implements com.nineoldandroids.animation.Animator.AnimatorListener, com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener
    {

        private AnimatorEventListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        AnimatorEventListener(AnimatorEventListener animatoreventlistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #20  <Method void ViewPropertyAnimatorPreHC$AnimatorEventListener(ViewPropertyAnimatorPreHC)>
        //    3    5:return          
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #30  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationCancel(Animator)>
        //    9   23:return          
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #33  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationEnd(Animator)>
        //    9   23:aload_0         
        //   10   24:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //   11   27:invokestatic    #37  <Method HashMap ViewPropertyAnimatorPreHC.access$2(ViewPropertyAnimatorPreHC)>
        //   12   30:aload_1         
        //   13   31:invokevirtual   #43  <Method Object HashMap.remove(Object)>
        //   14   34:pop             
        //   15   35:aload_0         
        //   16   36:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //   17   39:invokestatic    #37  <Method HashMap ViewPropertyAnimatorPreHC.access$2(ViewPropertyAnimatorPreHC)>
        //   18   42:invokevirtual   #47  <Method boolean HashMap.isEmpty()>
        //   19   45:ifeq            56
        //   20   48:aload_0         
        //   21   49:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //   22   52:aconst_null     
        //   23   53:invokestatic    #51  <Method void ViewPropertyAnimatorPreHC.access$3(ViewPropertyAnimatorPreHC, com.nineoldandroids.animation.Animator$AnimatorListener)>
        //   24   56:return          
        }

        public void onAnimationRepeat(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #54  <Method void com.nineoldandroids.animation.Animator$AnimatorListener.onAnimationRepeat(Animator)>
        //    9   23:return          
        }

        public void onAnimationStart(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    2    4:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    6   14:invokestatic    #28  <Method com.nineoldandroids.animation.Animator$AnimatorListener ViewPropertyAnimatorPreHC.access$1(ViewPropertyAnimatorPreHC)>
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
        //    4    6:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    5    9:invokestatic    #37  <Method HashMap ViewPropertyAnimatorPreHC.access$2(ViewPropertyAnimatorPreHC)>
        //    6   12:aload_1         
        //    7   13:invokevirtual   #68  <Method Object HashMap.get(Object)>
        //    8   16:checkcast       #70  <Class ViewPropertyAnimatorPreHC$PropertyBundle>
        //    9   19:astore_3        
        //   10   20:sipush          511
        //   11   23:aload_3         
        //   12   24:getfield        #74  <Field int ViewPropertyAnimatorPreHC$PropertyBundle.mPropertyMask>
        //   13   27:iand            
        //   14   28:ifeq            56
        //   15   31:aload_0         
        //   16   32:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //   17   35:invokestatic    #78  <Method WeakReference ViewPropertyAnimatorPreHC.access$4(ViewPropertyAnimatorPreHC)>
        //   18   38:invokevirtual   #83  <Method Object WeakReference.get()>
        //   19   41:checkcast       #85  <Class View>
        //   20   44:astore          10
        //   21   46:aload           10
        //   22   48:ifnull          56
        //   23   51:aload           10
        //   24   53:invokevirtual   #88  <Method void View.invalidate()>
        //   25   56:aload_3         
        //   26   57:getfield        #92  <Field ArrayList ViewPropertyAnimatorPreHC$PropertyBundle.mNameValuesHolder>
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
        //   39   85:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //   40   88:invokestatic    #78  <Method WeakReference ViewPropertyAnimatorPreHC.access$4(ViewPropertyAnimatorPreHC)>
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
        //   52  117:checkcast       #103 <Class ViewPropertyAnimatorPreHC$NameValuesHolder>
        //   53  120:astore          8
        //   54  122:aload           8
        //   55  124:getfield        #107 <Field float ViewPropertyAnimatorPreHC$NameValuesHolder.mFromValue>
        //   56  127:fload_2         
        //   57  128:aload           8
        //   58  130:getfield        #110 <Field float ViewPropertyAnimatorPreHC$NameValuesHolder.mDeltaValue>
        //   59  133:fmul            
        //   60  134:fadd            
        //   61  135:fstore          9
        //   62  137:aload_0         
        //   63  138:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //   64  141:aload           8
        //   65  143:getfield        #113 <Field int ViewPropertyAnimatorPreHC$NameValuesHolder.mNameConstant>
        //   66  146:fload           9
        //   67  148:invokestatic    #117 <Method void ViewPropertyAnimatorPreHC.access$5(ViewPropertyAnimatorPreHC, int, float)>
        //   68  151:iinc            7  1
        //   69  154:goto            77
        }

        final ViewPropertyAnimatorPreHC this$0;
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
        //   23   41:checkcast       #32  <Class ViewPropertyAnimatorPreHC$NameValuesHolder>
        //   24   44:getfield        #35  <Field int ViewPropertyAnimatorPreHC$NameValuesHolder.mNameConstant>
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


    ViewPropertyAnimatorPreHC(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #60  <Method void ViewPropertyAnimator()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #62  <Field boolean mDurationSet>
    //    5    9:aload_0         
    //    6   10:lconst_0        
    //    7   11:putfield        #64  <Field long mStartDelay>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #66  <Field boolean mStartDelaySet>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #68  <Field boolean mInterpolatorSet>
    //   14   24:aload_0         
    //   15   25:aconst_null     
    //   16   26:putfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //   17   29:aload_0         
    //   18   30:new             #72  <Class ViewPropertyAnimatorPreHC$AnimatorEventListener>
    //   19   33:dup             
    //   20   34:aload_0         
    //   21   35:aconst_null     
    //   22   36:invokespecial   #75  <Method void ViewPropertyAnimatorPreHC$AnimatorEventListener(ViewPropertyAnimatorPreHC, ViewPropertyAnimatorPreHC$AnimatorEventListener)>
    //   23   39:putfield        #77  <Field ViewPropertyAnimatorPreHC$AnimatorEventListener mAnimatorEventListener>
    //   24   42:aload_0         
    //   25   43:new             #79  <Class ArrayList>
    //   26   46:dup             
    //   27   47:invokespecial   #80  <Method void ArrayList()>
    //   28   50:putfield        #82  <Field ArrayList mPendingAnimations>
    //   29   53:aload_0         
    //   30   54:new             #84  <Class ViewPropertyAnimatorPreHC$1>
    //   31   57:dup             
    //   32   58:aload_0         
    //   33   59:invokespecial   #87  <Method void ViewPropertyAnimatorPreHC$1(ViewPropertyAnimatorPreHC)>
    //   34   62:putfield        #89  <Field Runnable mAnimationStarter>
    //   35   65:aload_0         
    //   36   66:new             #91  <Class HashMap>
    //   37   69:dup             
    //   38   70:invokespecial   #92  <Method void HashMap()>
    //   39   73:putfield        #94  <Field HashMap mAnimatorMap>
    //   40   76:aload_0         
    //   41   77:new             #96  <Class WeakReference>
    //   42   80:dup             
    //   43   81:aload_1         
    //   44   82:invokespecial   #99  <Method void WeakReference(Object)>
    //   45   85:putfield        #101 <Field WeakReference mView>
    //   46   88:aload_0         
    //   47   89:aload_1         
    //   48   90:invokestatic    #107 <Method AnimatorProxy AnimatorProxy.wrap(View)>
    //   49   93:putfield        #109 <Field AnimatorProxy mProxy>
    //   50   96:return          
    }

    static void access$0(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #113 <Method void startAnimation()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #113 <Method void startAnimation()>
    //    5    4:return          
    }

    static com.nineoldandroids.animation.Animator.AnimatorListener access$1(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    5    4:areturn         
    }

    static HashMap access$2(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field HashMap mAnimatorMap>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #94  <Field HashMap mAnimatorMap>
    //    5    4:areturn         
    }

    static void access$3(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc, com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:putfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    7    5:return          
    }

    static WeakReference access$4(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field WeakReference mView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #101 <Field WeakReference mView>
    //    5    4:areturn         
    }

    static void access$5(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc, int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:fload_2         
    //    3    3:invokespecial   #127 <Method void setValue(int, float)>
    //    4    6:return          
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:fload_2         
    //    8    3:invokespecial   #127 <Method void setValue(int, float)>
    //    9    6:return          
    }

    private void animateProperty(int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #132 <Method float getValue(int)>
    //    3    5:fstore_3        
    //    4    6:aload_0         
    //    5    7:iload_1         
    //    6    8:fload_3         
    //    7    9:fload_2         
    //    8   10:fload_3         
    //    9   11:fsub            
    //   10   12:invokespecial   #136 <Method void animatePropertyBy(int, float, float)>
    //   11   15:return          
    }

    private void animatePropertyBy(int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_0         
    //    3    3:iload_1         
    //    4    4:invokespecial   #132 <Method float getValue(int)>
    //    5    7:fload_2         
    //    6    8:invokespecial   #136 <Method void animatePropertyBy(int, float, float)>
    //    7   11:return          
    }

    private void animatePropertyBy(int i, float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field HashMap mAnimatorMap>
    //    2    4:invokevirtual   #140 <Method int HashMap.size()>
    //    3    7:ifle            51
    //    4   10:aload_0         
    //    5   11:getfield        #94  <Field HashMap mAnimatorMap>
    //    6   14:invokevirtual   #144 <Method Set HashMap.keySet()>
    //    7   17:invokeinterface #150 <Method Iterator Set.iterator()>
    //    8   22:astore          9
    //    9   24:aload           9
    //   10   26:invokeinterface #156 <Method boolean Iterator.hasNext()>
    //   11   31:istore          10
    //   12   33:aconst_null     
    //   13   34:astore          11
    //   14   36:iload           10
    //   15   38:ifne            111
    //   16   41:aload           11
    //   17   43:ifnull          51
    //   18   46:aload           11
    //   19   48:invokevirtual   #161 <Method void Animator.cancel()>
    //   20   51:new             #163 <Class ViewPropertyAnimatorPreHC$NameValuesHolder>
    //   21   54:dup             
    //   22   55:iload_1         
    //   23   56:fload_2         
    //   24   57:fload_3         
    //   25   58:invokespecial   #165 <Method void ViewPropertyAnimatorPreHC$NameValuesHolder(int, float, float)>
    //   26   61:astore          4
    //   27   63:aload_0         
    //   28   64:getfield        #82  <Field ArrayList mPendingAnimations>
    //   29   67:aload           4
    //   30   69:invokevirtual   #169 <Method boolean ArrayList.add(Object)>
    //   31   72:pop             
    //   32   73:aload_0         
    //   33   74:getfield        #101 <Field WeakReference mView>
    //   34   77:invokevirtual   #173 <Method Object WeakReference.get()>
    //   35   80:checkcast       #175 <Class View>
    //   36   83:astore          6
    //   37   85:aload           6
    //   38   87:ifnull          110
    //   39   90:aload           6
    //   40   92:aload_0         
    //   41   93:getfield        #89  <Field Runnable mAnimationStarter>
    //   42   96:invokevirtual   #179 <Method boolean View.removeCallbacks(Runnable)>
    //   43   99:pop             
    //   44  100:aload           6
    //   45  102:aload_0         
    //   46  103:getfield        #89  <Field Runnable mAnimationStarter>
    //   47  106:invokevirtual   #182 <Method boolean View.post(Runnable)>
    //   48  109:pop             
    //   49  110:return          
    //   50  111:aload           9
    //   51  113:invokeinterface #185 <Method Object Iterator.next()>
    //   52  118:checkcast       #158 <Class Animator>
    //   53  121:astore          12
    //   54  123:aload_0         
    //   55  124:getfield        #94  <Field HashMap mAnimatorMap>
    //   56  127:aload           12
    //   57  129:invokevirtual   #188 <Method Object HashMap.get(Object)>
    //   58  132:checkcast       #190 <Class ViewPropertyAnimatorPreHC$PropertyBundle>
    //   59  135:astore          13
    //   60  137:aload           13
    //   61  139:iload_1         
    //   62  140:invokevirtual   #193 <Method boolean ViewPropertyAnimatorPreHC$PropertyBundle.cancel(int)>
    //   63  143:ifeq            24
    //   64  146:aload           13
    //   65  148:getfield        #196 <Field int ViewPropertyAnimatorPreHC$PropertyBundle.mPropertyMask>
    //   66  151:ifne            24
    //   67  154:aload           12
    //   68  156:astore          11
    //   69  158:goto            41
    }

    private float getValue(int i)
    {
    //    0    0:iload_1         
    //    1    1:lookupswitch    10: default 92
    //                   1: 94
    //                   2: 102
    //                   4: 134
    //                   8: 142
    //                   16: 110
    //                   32: 118
    //                   64: 126
    //                   128: 150
    //                   256: 158
    //                   512: 166
    //    2   92:fconst_0        
    //    3   93:freturn         
    //    4   94:aload_0         
    //    5   95:getfield        #109 <Field AnimatorProxy mProxy>
    //    6   98:invokevirtual   #200 <Method float AnimatorProxy.getTranslationX()>
    //    7  101:freturn         
    //    8  102:aload_0         
    //    9  103:getfield        #109 <Field AnimatorProxy mProxy>
    //   10  106:invokevirtual   #203 <Method float AnimatorProxy.getTranslationY()>
    //   11  109:freturn         
    //   12  110:aload_0         
    //   13  111:getfield        #109 <Field AnimatorProxy mProxy>
    //   14  114:invokevirtual   #206 <Method float AnimatorProxy.getRotation()>
    //   15  117:freturn         
    //   16  118:aload_0         
    //   17  119:getfield        #109 <Field AnimatorProxy mProxy>
    //   18  122:invokevirtual   #209 <Method float AnimatorProxy.getRotationX()>
    //   19  125:freturn         
    //   20  126:aload_0         
    //   21  127:getfield        #109 <Field AnimatorProxy mProxy>
    //   22  130:invokevirtual   #212 <Method float AnimatorProxy.getRotationY()>
    //   23  133:freturn         
    //   24  134:aload_0         
    //   25  135:getfield        #109 <Field AnimatorProxy mProxy>
    //   26  138:invokevirtual   #215 <Method float AnimatorProxy.getScaleX()>
    //   27  141:freturn         
    //   28  142:aload_0         
    //   29  143:getfield        #109 <Field AnimatorProxy mProxy>
    //   30  146:invokevirtual   #218 <Method float AnimatorProxy.getScaleY()>
    //   31  149:freturn         
    //   32  150:aload_0         
    //   33  151:getfield        #109 <Field AnimatorProxy mProxy>
    //   34  154:invokevirtual   #221 <Method float AnimatorProxy.getX()>
    //   35  157:freturn         
    //   36  158:aload_0         
    //   37  159:getfield        #109 <Field AnimatorProxy mProxy>
    //   38  162:invokevirtual   #224 <Method float AnimatorProxy.getY()>
    //   39  165:freturn         
    //   40  166:aload_0         
    //   41  167:getfield        #109 <Field AnimatorProxy mProxy>
    //   42  170:invokevirtual   #227 <Method float AnimatorProxy.getAlpha()>
    //   43  173:freturn         
    }

    private void setValue(int i, float f)
    {
    //    0    0:iload_1         
    //    1    1:lookupswitch    10: default 92
    //                   1: 93
    //                   2: 102
    //                   4: 138
    //                   8: 147
    //                   16: 111
    //                   32: 120
    //                   64: 129
    //                   128: 156
    //                   256: 165
    //                   512: 174
    //    2   92:return          
    //    3   93:aload_0         
    //    4   94:getfield        #109 <Field AnimatorProxy mProxy>
    //    5   97:fload_2         
    //    6   98:invokevirtual   #231 <Method void AnimatorProxy.setTranslationX(float)>
    //    7  101:return          
    //    8  102:aload_0         
    //    9  103:getfield        #109 <Field AnimatorProxy mProxy>
    //   10  106:fload_2         
    //   11  107:invokevirtual   #234 <Method void AnimatorProxy.setTranslationY(float)>
    //   12  110:return          
    //   13  111:aload_0         
    //   14  112:getfield        #109 <Field AnimatorProxy mProxy>
    //   15  115:fload_2         
    //   16  116:invokevirtual   #237 <Method void AnimatorProxy.setRotation(float)>
    //   17  119:return          
    //   18  120:aload_0         
    //   19  121:getfield        #109 <Field AnimatorProxy mProxy>
    //   20  124:fload_2         
    //   21  125:invokevirtual   #240 <Method void AnimatorProxy.setRotationX(float)>
    //   22  128:return          
    //   23  129:aload_0         
    //   24  130:getfield        #109 <Field AnimatorProxy mProxy>
    //   25  133:fload_2         
    //   26  134:invokevirtual   #243 <Method void AnimatorProxy.setRotationY(float)>
    //   27  137:return          
    //   28  138:aload_0         
    //   29  139:getfield        #109 <Field AnimatorProxy mProxy>
    //   30  142:fload_2         
    //   31  143:invokevirtual   #246 <Method void AnimatorProxy.setScaleX(float)>
    //   32  146:return          
    //   33  147:aload_0         
    //   34  148:getfield        #109 <Field AnimatorProxy mProxy>
    //   35  151:fload_2         
    //   36  152:invokevirtual   #249 <Method void AnimatorProxy.setScaleY(float)>
    //   37  155:return          
    //   38  156:aload_0         
    //   39  157:getfield        #109 <Field AnimatorProxy mProxy>
    //   40  160:fload_2         
    //   41  161:invokevirtual   #252 <Method void AnimatorProxy.setX(float)>
    //   42  164:return          
    //   43  165:aload_0         
    //   44  166:getfield        #109 <Field AnimatorProxy mProxy>
    //   45  169:fload_2         
    //   46  170:invokevirtual   #255 <Method void AnimatorProxy.setY(float)>
    //   47  173:return          
    //   48  174:aload_0         
    //   49  175:getfield        #109 <Field AnimatorProxy mProxy>
    //   50  178:fload_2         
    //   51  179:invokevirtual   #258 <Method void AnimatorProxy.setAlpha(float)>
    //   52  182:return          
    }

    private void startAnimation()
    {
    //    0    0:iconst_1        
    //    1    1:newarray        float[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:fconst_1        
    //    5    6:fastore         
    //    6    7:invokestatic    #264 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
    //    7   10:astore_1        
    //    8   11:aload_0         
    //    9   12:getfield        #82  <Field ArrayList mPendingAnimations>
    //   10   15:invokevirtual   #267 <Method Object ArrayList.clone()>
    //   11   18:checkcast       #79  <Class ArrayList>
    //   12   21:astore_2        
    //   13   22:aload_0         
    //   14   23:getfield        #82  <Field ArrayList mPendingAnimations>
    //   15   26:invokevirtual   #270 <Method void ArrayList.clear()>
    //   16   29:iconst_0        
    //   17   30:istore_3        
    //   18   31:aload_2         
    //   19   32:invokevirtual   #271 <Method int ArrayList.size()>
    //   20   35:istore          4
    //   21   37:iconst_0        
    //   22   38:istore          5
    //   23   40:iload           5
    //   24   42:iload           4
    //   25   44:icmplt          132
    //   26   47:aload_0         
    //   27   48:getfield        #94  <Field HashMap mAnimatorMap>
    //   28   51:aload_1         
    //   29   52:new             #190 <Class ViewPropertyAnimatorPreHC$PropertyBundle>
    //   30   55:dup             
    //   31   56:iload_3         
    //   32   57:aload_2         
    //   33   58:invokespecial   #274 <Method void ViewPropertyAnimatorPreHC$PropertyBundle(int, ArrayList)>
    //   34   61:invokevirtual   #278 <Method Object HashMap.put(Object, Object)>
    //   35   64:pop             
    //   36   65:aload_1         
    //   37   66:aload_0         
    //   38   67:getfield        #77  <Field ViewPropertyAnimatorPreHC$AnimatorEventListener mAnimatorEventListener>
    //   39   70:invokevirtual   #282 <Method void ValueAnimator.addUpdateListener(com.nineoldandroids.animation.ValueAnimator$AnimatorUpdateListener)>
    //   40   73:aload_1         
    //   41   74:aload_0         
    //   42   75:getfield        #77  <Field ViewPropertyAnimatorPreHC$AnimatorEventListener mAnimatorEventListener>
    //   43   78:invokevirtual   #286 <Method void ValueAnimator.addListener(com.nineoldandroids.animation.Animator$AnimatorListener)>
    //   44   81:aload_0         
    //   45   82:getfield        #66  <Field boolean mStartDelaySet>
    //   46   85:ifeq            96
    //   47   88:aload_1         
    //   48   89:aload_0         
    //   49   90:getfield        #64  <Field long mStartDelay>
    //   50   93:invokevirtual   #290 <Method void ValueAnimator.setStartDelay(long)>
    //   51   96:aload_0         
    //   52   97:getfield        #62  <Field boolean mDurationSet>
    //   53  100:ifeq            112
    //   54  103:aload_1         
    //   55  104:aload_0         
    //   56  105:getfield        #292 <Field long mDuration>
    //   57  108:invokevirtual   #296 <Method ValueAnimator ValueAnimator.setDuration(long)>
    //   58  111:pop             
    //   59  112:aload_0         
    //   60  113:getfield        #68  <Field boolean mInterpolatorSet>
    //   61  116:ifeq            127
    //   62  119:aload_1         
    //   63  120:aload_0         
    //   64  121:getfield        #298 <Field Interpolator mInterpolator>
    //   65  124:invokevirtual   #302 <Method void ValueAnimator.setInterpolator(Interpolator)>
    //   66  127:aload_1         
    //   67  128:invokevirtual   #305 <Method void ValueAnimator.start()>
    //   68  131:return          
    //   69  132:iload_3         
    //   70  133:aload_2         
    //   71  134:iload           5
    //   72  136:invokevirtual   #308 <Method Object ArrayList.get(int)>
    //   73  139:checkcast       #163 <Class ViewPropertyAnimatorPreHC$NameValuesHolder>
    //   74  142:getfield        #311 <Field int ViewPropertyAnimatorPreHC$NameValuesHolder.mNameConstant>
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
    //    3    5:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator alphaBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          512
    //    2    4:fload_1         
    //    3    5:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public void cancel()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field HashMap mAnimatorMap>
    //    2    4:invokevirtual   #140 <Method int HashMap.size()>
    //    3    7:ifle            38
    //    4   10:aload_0         
    //    5   11:getfield        #94  <Field HashMap mAnimatorMap>
    //    6   14:invokevirtual   #319 <Method Object HashMap.clone()>
    //    7   17:checkcast       #91  <Class HashMap>
    //    8   20:invokevirtual   #144 <Method Set HashMap.keySet()>
    //    9   23:invokeinterface #150 <Method Iterator Set.iterator()>
    //   10   28:astore_3        
    //   11   29:aload_3         
    //   12   30:invokeinterface #156 <Method boolean Iterator.hasNext()>
    //   13   35:ifne            70
    //   14   38:aload_0         
    //   15   39:getfield        #82  <Field ArrayList mPendingAnimations>
    //   16   42:invokevirtual   #270 <Method void ArrayList.clear()>
    //   17   45:aload_0         
    //   18   46:getfield        #101 <Field WeakReference mView>
    //   19   49:invokevirtual   #173 <Method Object WeakReference.get()>
    //   20   52:checkcast       #175 <Class View>
    //   21   55:astore_1        
    //   22   56:aload_1         
    //   23   57:ifnull          69
    //   24   60:aload_1         
    //   25   61:aload_0         
    //   26   62:getfield        #89  <Field Runnable mAnimationStarter>
    //   27   65:invokevirtual   #179 <Method boolean View.removeCallbacks(Runnable)>
    //   28   68:pop             
    //   29   69:return          
    //   30   70:aload_3         
    //   31   71:invokeinterface #185 <Method Object Iterator.next()>
    //   32   76:checkcast       #158 <Class Animator>
    //   33   79:invokevirtual   #161 <Method void Animator.cancel()>
    //   34   82:goto            29
    }

    public long getDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field boolean mDurationSet>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:getfield        #292 <Field long mDuration>
    //    5   11:lreturn         
    //    6   12:new             #260 <Class ValueAnimator>
    //    7   15:dup             
    //    8   16:invokespecial   #322 <Method void ValueAnimator()>
    //    9   19:invokevirtual   #324 <Method long ValueAnimator.getDuration()>
    //   10   22:lreturn         
    }

    public long getStartDelay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field boolean mStartDelaySet>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:getfield        #64  <Field long mStartDelay>
    //    5   11:lreturn         
    //    6   12:lconst_0        
    //    7   13:lreturn         
    }

    public ViewPropertyAnimator rotation(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          16
    //    2    3:fload_1         
    //    3    4:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          16
    //    2    3:fload_1         
    //    3    4:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          32
    //    2    3:fload_1         
    //    3    4:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          32
    //    2    3:fload_1         
    //    3    4:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          64
    //    2    3:fload_1         
    //    3    4:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator rotationYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          64
    //    2    3:fload_1         
    //    3    4:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator scaleX(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_4        
    //    2    2:fload_1         
    //    3    3:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator scaleXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_4        
    //    2    2:fload_1         
    //    3    3:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator scaleY(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          8
    //    2    3:fload_1         
    //    3    4:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator scaleYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:bipush          8
    //    2    3:fload_1         
    //    3    4:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    7:aload_0         
    //    5    8:areturn         
    }

    public ViewPropertyAnimator setDuration(long l)
    {
    //    0    0:lload_1         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifge            31
    //    4    6:new             #338 <Class IllegalArgumentException>
    //    5    9:dup             
    //    6   10:new             #340 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:ldc2            #342 <String "Animators cannot have negative duration: ">
    //    9   17:invokespecial   #345 <Method void StringBuilder(String)>
    //   10   20:lload_1         
    //   11   21:invokevirtual   #349 <Method StringBuilder StringBuilder.append(long)>
    //   12   24:invokevirtual   #353 <Method String StringBuilder.toString()>
    //   13   27:invokespecial   #354 <Method void IllegalArgumentException(String)>
    //   14   30:athrow          
    //   15   31:aload_0         
    //   16   32:iconst_1        
    //   17   33:putfield        #62  <Field boolean mDurationSet>
    //   18   36:aload_0         
    //   19   37:lload_1         
    //   20   38:putfield        #292 <Field long mDuration>
    //   21   41:aload_0         
    //   22   42:areturn         
    }

    public ViewPropertyAnimator setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #68  <Field boolean mInterpolatorSet>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #298 <Field Interpolator mInterpolator>
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public ViewPropertyAnimator setListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public ViewPropertyAnimator setStartDelay(long l)
    {
    //    0    0:lload_1         
    //    1    1:lconst_0        
    //    2    2:lcmp            
    //    3    3:ifge            31
    //    4    6:new             #338 <Class IllegalArgumentException>
    //    5    9:dup             
    //    6   10:new             #340 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:ldc2            #342 <String "Animators cannot have negative duration: ">
    //    9   17:invokespecial   #345 <Method void StringBuilder(String)>
    //   10   20:lload_1         
    //   11   21:invokevirtual   #349 <Method StringBuilder StringBuilder.append(long)>
    //   12   24:invokevirtual   #353 <Method String StringBuilder.toString()>
    //   13   27:invokespecial   #354 <Method void IllegalArgumentException(String)>
    //   14   30:athrow          
    //   15   31:aload_0         
    //   16   32:iconst_1        
    //   17   33:putfield        #66  <Field boolean mStartDelaySet>
    //   18   36:aload_0         
    //   19   37:lload_1         
    //   20   38:putfield        #64  <Field long mStartDelay>
    //   21   41:aload_0         
    //   22   42:areturn         
    }

    public void start()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #113 <Method void startAnimation()>
    //    2    4:return          
    }

    public ViewPropertyAnimator translationX(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:fload_1         
    //    3    3:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator translationXBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:fload_1         
    //    3    3:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator translationY(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_2        
    //    2    2:fload_1         
    //    3    3:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator translationYBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:iconst_2        
    //    2    2:fload_1         
    //    3    3:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public ViewPropertyAnimator x(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          128
    //    2    4:fload_1         
    //    3    5:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator xBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          128
    //    2    4:fload_1         
    //    3    5:invokespecial   #318 <Method void animatePropertyBy(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator y(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          256
    //    2    4:fload_1         
    //    3    5:invokespecial   #315 <Method void animateProperty(int, float)>
    //    4    8:aload_0         
    //    5    9:areturn         
    }

    public ViewPropertyAnimator yBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          256
    //    2    4:fload_1         
    //    3    5:invokespecial   #318 <Method void animatePropertyBy(int, float)>
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
    private final AnimatorProxy mProxy;
    private long mStartDelay;
    private boolean mStartDelaySet;
    private final WeakReference mView;

    static void access$0(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #113 <Method void startAnimation()>
    //    2    4:return          
    }

    static com.nineoldandroids.animation.Animator.AnimatorListener access$1(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    2    4:areturn         
    }

    static HashMap access$2(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #94  <Field HashMap mAnimatorMap>
    //    2    4:areturn         
    }

    static void access$3(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc, com.nineoldandroids.animation.Animator.AnimatorListener animatorlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #70  <Field com.nineoldandroids.animation.Animator$AnimatorListener mListener>
    //    3    5:return          
    }

    static WeakReference access$4(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field WeakReference mView>
    //    2    4:areturn         
    }

    static void access$5(ViewPropertyAnimatorPreHC viewpropertyanimatorprehc, int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:fload_2         
    //    3    3:invokespecial   #127 <Method void setValue(int, float)>
    //    4    6:return          
    }

    // Unreferenced inner class com/nineoldandroids/view/ViewPropertyAnimatorPreHC$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPropertyAnimatorPreHC this$0>
        //    2    4:invokestatic    #21  <Method void ViewPropertyAnimatorPreHC.access$0(ViewPropertyAnimatorPreHC)>
        //    3    7:return          
        }

        final ViewPropertyAnimatorPreHC this$0;
    }

}
