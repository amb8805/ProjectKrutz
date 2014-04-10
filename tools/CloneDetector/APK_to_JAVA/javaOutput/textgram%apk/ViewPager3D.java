// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.custom_widgets;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.view.*;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;

public class ViewPager3D extends ViewPager
{
    private class MyOnPageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private MyOnPageChangeListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ViewPager3D this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        MyOnPageChangeListener(MyOnPageChangeListener myonpagechangelistener)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ViewPager3D$MyOnPageChangeListener(ViewPager3D)>
        //    3    5:return          
        }

        public void onPageScrollStateChanged(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ViewPager3D this$0>
        //    2    4:invokestatic    #26  <Method android.support.v4.view.ViewPager$OnPageChangeListener ViewPager3D.access$4(ViewPager3D)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ViewPager3D this$0>
        //    6   14:invokestatic    #26  <Method android.support.v4.view.ViewPager$OnPageChangeListener ViewPager3D.access$4(ViewPager3D)>
        //    7   17:iload_1         
        //    8   18:invokeinterface #28  <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
        //    9   23:iload_1         
        //   10   24:ifne            35
        //   11   27:aload_0         
        //   12   28:getfield        #12  <Field ViewPager3D this$0>
        //   13   31:fconst_0        
        //   14   32:invokestatic    #32  <Method void ViewPager3D.access$6(ViewPager3D, float)>
        //   15   35:return          
        }

        public void onPageScrolled(int i, float f, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ViewPager3D this$0>
        //    2    4:invokestatic    #26  <Method android.support.v4.view.ViewPager$OnPageChangeListener ViewPager3D.access$4(ViewPager3D)>
        //    3    7:ifnull          25
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ViewPager3D this$0>
        //    6   14:invokestatic    #26  <Method android.support.v4.view.ViewPager$OnPageChangeListener ViewPager3D.access$4(ViewPager3D)>
        //    7   17:iload_1         
        //    8   18:fload_2         
        //    9   19:iload_3         
        //   10   20:invokeinterface #36  <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
        //   11   25:aload_0         
        //   12   26:getfield        #12  <Field ViewPager3D this$0>
        //   13   29:iload_1         
        //   14   30:invokestatic    #40  <Method void ViewPager3D.access$5(ViewPager3D, int)>
        //   15   33:aload_0         
        //   16   34:getfield        #12  <Field ViewPager3D this$0>
        //   17   37:fload_2         
        //   18   38:invokestatic    #32  <Method void ViewPager3D.access$6(ViewPager3D, float)>
        //   19   41:aload_0         
        //   20   42:getfield        #12  <Field ViewPager3D this$0>
        //   21   45:iload_1         
        //   22   46:invokestatic    #43  <Method void ViewPager3D.access$7(ViewPager3D, int)>
        //   23   49:aload_0         
        //   24   50:getfield        #12  <Field ViewPager3D this$0>
        //   25   53:iload_1         
        //   26   54:invokestatic    #46  <Method void ViewPager3D.access$1(ViewPager3D, int)>
        //   27   57:return          
        }

        public void onPageSelected(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ViewPager3D this$0>
        //    2    4:invokestatic    #26  <Method android.support.v4.view.ViewPager$OnPageChangeListener ViewPager3D.access$4(ViewPager3D)>
        //    3    7:ifnull          23
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ViewPager3D this$0>
        //    6   14:invokestatic    #26  <Method android.support.v4.view.ViewPager$OnPageChangeListener ViewPager3D.access$4(ViewPager3D)>
        //    7   17:iload_1         
        //    8   18:invokeinterface #49  <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
        //    9   23:return          
        }

        final ViewPager3D this$0;
    }

    private class OverscrollEffect
    {

        private OverscrollEffect()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewPager3D this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        OverscrollEffect(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #20  <Method void ViewPager3D$OverscrollEffect(ViewPager3D)>
        //    3    5:return          
        }

        static void access$1(OverscrollEffect overscrolleffect, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokespecial   #26  <Method void startAnimation(float)>
        //    3    5:return          
// Previous instruction length mismatch
        //    4    0:aload_0         
        //    5    1:fload_1         
        //    6    2:invokespecial   #26  <Method void startAnimation(float)>
        //    7    5:return          
        }

        static void access$2(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #31  <Method void onRelease()>
        //    2    4:return          
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:invokespecial   #31  <Method void onRelease()>
        //    5    4:return          
        }

        static boolean access$3(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #37  <Method boolean isOverscrolling()>
        //    2    4:ireturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:invokespecial   #37  <Method boolean isOverscrolling()>
        //    5    4:ireturn         
        }

        static float access$4(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field float mOverscroll>
        //    2    4:freturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #41  <Field float mOverscroll>
        //    5    4:freturn         
        }

        private boolean isOverscrolling()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPager3D this$0>
        //    2    4:invokestatic    #46  <Method int ViewPager3D.access$3(ViewPager3D)>
        //    3    7:ifne            21
        //    4   10:aload_0         
        //    5   11:getfield        #41  <Field float mOverscroll>
        //    6   14:fconst_0        
        //    7   15:fcmpg           
        //    8   16:ifge            21
        //    9   19:iconst_1        
        //   10   20:ireturn         
        //   11   21:iconst_m1       
        //   12   22:aload_0         
        //   13   23:getfield        #14  <Field ViewPager3D this$0>
        //   14   26:invokevirtual   #50  <Method PagerAdapter ViewPager3D.getAdapter()>
        //   15   29:invokevirtual   #56  <Method int PagerAdapter.getCount()>
        //   16   32:iadd            
        //   17   33:aload_0         
        //   18   34:getfield        #14  <Field ViewPager3D this$0>
        //   19   37:invokestatic    #46  <Method int ViewPager3D.access$3(ViewPager3D)>
        //   20   40:icmpne          60
        //   21   43:iconst_1        
        //   22   44:istore_1        
        //   23   45:iload_1         
        //   24   46:ifeq            58
        //   25   49:aload_0         
        //   26   50:getfield        #41  <Field float mOverscroll>
        //   27   53:fconst_0        
        //   28   54:fcmpl           
        //   29   55:ifgt            19
        //   30   58:iconst_0        
        //   31   59:ireturn         
        //   32   60:iconst_0        
        //   33   61:istore_1        
        //   34   62:goto            45
        }

        private void onRelease()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #58  <Field Animator mAnimator>
        //    2    4:ifnull          40
        //    3    7:aload_0         
        //    4    8:getfield        #58  <Field Animator mAnimator>
        //    5   11:invokevirtual   #63  <Method boolean Animator.isRunning()>
        //    6   14:ifeq            40
        //    7   17:aload_0         
        //    8   18:getfield        #58  <Field Animator mAnimator>
        //    9   21:new             #65  <Class ViewPager3D$OverscrollEffect$1>
        //   10   24:dup             
        //   11   25:aload_0         
        //   12   26:invokespecial   #67  <Method void ViewPager3D$OverscrollEffect$1(ViewPager3D$OverscrollEffect)>
        //   13   29:invokevirtual   #71  <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
        //   14   32:aload_0         
        //   15   33:getfield        #58  <Field Animator mAnimator>
        //   16   36:invokevirtual   #74  <Method void Animator.cancel()>
        //   17   39:return          
        //   18   40:aload_0         
        //   19   41:fconst_0        
        //   20   42:invokespecial   #26  <Method void startAnimation(float)>
        //   21   45:return          
        }

        private void startAnimation(float f)
        {
        //    0    0:iconst_2        
        //    1    1:newarray        float[]
        //    2    3:astore_2        
        //    3    4:aload_2         
        //    4    5:iconst_0        
        //    5    6:aload_0         
        //    6    7:getfield        #41  <Field float mOverscroll>
        //    7   10:fastore         
        //    8   11:aload_2         
        //    9   12:iconst_1        
        //   10   13:fload_1         
        //   11   14:fastore         
        //   12   15:aload_0         
        //   13   16:aload_0         
        //   14   17:ldc1            #76  <String "pull">
        //   15   19:aload_2         
        //   16   20:invokestatic    #82  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
        //   17   23:putfield        #58  <Field Animator mAnimator>
        //   18   26:aload_0         
        //   19   27:getfield        #58  <Field Animator mAnimator>
        //   20   30:new             #84  <Class DecelerateInterpolator>
        //   21   33:dup             
        //   22   34:invokespecial   #85  <Method void DecelerateInterpolator()>
        //   23   37:invokevirtual   #89  <Method void Animator.setInterpolator(android.animation.TimeInterpolator)>
        //   24   40:fload_1         
        //   25   41:aload_0         
        //   26   42:getfield        #41  <Field float mOverscroll>
        //   27   45:fsub            
        //   28   46:invokestatic    #95  <Method float Math.abs(float)>
        //   29   49:fstore_3        
        //   30   50:aload_0         
        //   31   51:getfield        #58  <Field Animator mAnimator>
        //   32   54:fload_3         
        //   33   55:aload_0         
        //   34   56:getfield        #14  <Field ViewPager3D this$0>
        //   35   59:invokestatic    #97  <Method int ViewPager3D.access$2(ViewPager3D)>
        //   36   62:i2f             
        //   37   63:fmul            
        //   38   64:f2l             
        //   39   65:invokevirtual   #101 <Method Animator Animator.setDuration(long)>
        //   40   68:pop             
        //   41   69:aload_0         
        //   42   70:getfield        #58  <Field Animator mAnimator>
        //   43   73:invokevirtual   #104 <Method void Animator.start()>
        //   44   76:return          
        }

        public void setPull(float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:putfield        #41  <Field float mOverscroll>
        //    3    5:aload_0         
        //    4    6:getfield        #14  <Field ViewPager3D this$0>
        //    5    9:aload_0         
        //    6   10:getfield        #14  <Field ViewPager3D this$0>
        //    7   13:invokestatic    #108 <Method int ViewPager3D.access$0(ViewPager3D)>
        //    8   16:invokestatic    #111 <Method void ViewPager3D.access$1(ViewPager3D, int)>
        //    9   19:return          
        }

        private Animator mAnimator;
        private float mOverscroll;
        final ViewPager3D this$0;

        static void access$1(OverscrollEffect overscrolleffect, float f)
        {
        //    0    0:aload_0         
        //    1    1:fload_1         
        //    2    2:invokespecial   #26  <Method void startAnimation(float)>
        //    3    5:return          
        }

        static void access$2(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #31  <Method void onRelease()>
        //    2    4:return          
        }

        static boolean access$3(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #37  <Method boolean isOverscrolling()>
        //    2    4:ireturn         
        }

        static float access$4(OverscrollEffect overscrolleffect)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field float mOverscroll>
        //    2    4:freturn         
        }
    }


    static 
    {
    //    0    0:ldc1            #4   <Class ViewPager>
    //    1    2:invokevirtual   #54  <Method String Class.getSimpleName()>
    //    2    5:putstatic       #56  <Field String DEBUG_TAG>
    //    3    8:return          
    }

    public ViewPager3D(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #60  <Method void ViewPager(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_0        
    //    6    8:putfield        #62  <Field boolean enable3D>
    //    7   11:aload_0         
    //    8   12:new             #64  <Class ViewPager3D$OverscrollEffect>
    //    9   15:dup             
    //   10   16:aload_0         
    //   11   17:aconst_null     
    //   12   18:invokespecial   #67  <Method void ViewPager3D$OverscrollEffect(ViewPager3D, ViewPager3D$OverscrollEffect)>
    //   13   21:putfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //   14   24:aload_0         
    //   15   25:new             #71  <Class Camera>
    //   16   28:dup             
    //   17   29:invokespecial   #73  <Method void Camera()>
    //   18   32:putfield        #75  <Field Camera mCamera>
    //   19   35:aload_0         
    //   20   36:iconst_0        
    //   21   37:putfield        #77  <Field int mLastPosition>
    //   22   40:aload_0         
    //   23   41:iconst_1        
    //   24   42:invokevirtual   #81  <Method void setStaticTransformationsEnabled(boolean)>
    //   25   45:aload_0         
    //   26   46:aload_1         
    //   27   47:invokestatic    #87  <Method ViewConfiguration ViewConfiguration.get(Context)>
    //   28   50:invokestatic    #93  <Method int ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration)>
    //   29   53:putfield        #95  <Field int mTouchSlop>
    //   30   56:aload_0         
    //   31   57:new             #97  <Class ViewPager3D$MyOnPageChangeListener>
    //   32   60:dup             
    //   33   61:aload_0         
    //   34   62:aconst_null     
    //   35   63:invokespecial   #100 <Method void ViewPager3D$MyOnPageChangeListener(ViewPager3D, ViewPager3D$MyOnPageChangeListener)>
    //   36   66:invokespecial   #104 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   37   69:aload_0         
    //   38   70:aload_2         
    //   39   71:invokespecial   #108 <Method void init(AttributeSet)>
    //   40   74:return          
    }

    static int access$0(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field int mLastPosition>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #77  <Field int mLastPosition>
    //    5    4:ireturn         
    }

    static void access$1(ViewPager3D viewpager3d, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #116 <Method void invalidateVisibleChilds(int)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #116 <Method void invalidateVisibleChilds(int)>
    //    7    5:return          
    }

    static int access$2(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field int mOverscrollAnimationDuration>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #119 <Field int mOverscrollAnimationDuration>
    //    5    4:ireturn         
    }

    static int access$3(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field int mScrollPosition>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #122 <Field int mScrollPosition>
    //    5    4:ireturn         
    }

    static android.support.v4.view.ViewPager.OnPageChangeListener access$4(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field android.support.v4.view.ViewPager$OnPageChangeListener mScrollListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #126 <Field android.support.v4.view.ViewPager$OnPageChangeListener mScrollListener>
    //    5    4:areturn         
    }

    static void access$5(ViewPager3D viewpager3d, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #122 <Field int mScrollPosition>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:putfield        #122 <Field int mScrollPosition>
    //    7    5:return          
    }

    static void access$6(ViewPager3D viewpager3d, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #131 <Field float mScrollPositionOffset>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:fload_1         
    //    6    2:putfield        #131 <Field float mScrollPositionOffset>
    //    7    5:return          
    }

    static void access$7(ViewPager3D viewpager3d, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #77  <Field int mLastPosition>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:putfield        #77  <Field int mLastPosition>
    //    7    5:return          
    }

    private void init(AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #136 <Method Context getContext()>
    //    2    4:aload_1         
    //    3    5:getstatic       #142 <Field int[] codeadore.textgram.R$styleable.ViewPager3D>
    //    4    8:invokevirtual   #148 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //    5   11:astore_2        
    //    6   12:aload_0         
    //    7   13:aload_2         
    //    8   14:iconst_0        
    //    9   15:fconst_2        
    //   10   16:invokevirtual   #154 <Method float TypedArray.getFloat(int, float)>
    //   11   19:putfield        #156 <Field float mOverscrollRotation>
    //   12   22:aload_0         
    //   13   23:aload_2         
    //   14   24:iconst_2        
    //   15   25:ldc1            #19  <Float 3F>
    //   16   27:invokevirtual   #154 <Method float TypedArray.getFloat(int, float)>
    //   17   30:putfield        #158 <Field float mSwipeRotation>
    //   18   33:aload_0         
    //   19   34:aload_2         
    //   20   35:iconst_3        
    //   21   36:bipush          100
    //   22   38:invokevirtual   #162 <Method int TypedArray.getInt(int, int)>
    //   23   41:putfield        #164 <Field int mSwipeTranslation>
    //   24   44:aload_0         
    //   25   45:aload_2         
    //   26   46:iconst_1        
    //   27   47:sipush          150
    //   28   50:invokevirtual   #162 <Method int TypedArray.getInt(int, int)>
    //   29   53:putfield        #166 <Field int mOverscrollTranslation>
    //   30   56:aload_0         
    //   31   57:aload_2         
    //   32   58:iconst_4        
    //   33   59:sipush          400
    //   34   62:invokevirtual   #162 <Method int TypedArray.getInt(int, int)>
    //   35   65:putfield        #119 <Field int mOverscrollAnimationDuration>
    //   36   68:aload_0         
    //   37   69:aload_2         
    //   38   70:iconst_5        
    //   39   71:iconst_1        
    //   40   72:invokevirtual   #170 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   41   75:putfield        #172 <Field boolean mAnimateAlpha>
    //   42   78:aload_2         
    //   43   79:invokevirtual   #175 <Method void TypedArray.recycle()>
    //   44   82:return          
    }

    private void invalidateVisibleChilds(int i)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:invokevirtual   #179 <Method int getChildCount()>
    //    5    7:icmplt          67
    //    6   10:aload_0         
    //    7   11:invokevirtual   #182 <Method void invalidate()>
    //    8   14:aload_0         
    //    9   15:iload_1         
    //   10   16:invokevirtual   #186 <Method View getChildAt(int)>
    //   11   19:astore_3        
    //   12   20:aload_0         
    //   13   21:iload_1         
    //   14   22:iconst_1        
    //   15   23:isub            
    //   16   24:invokevirtual   #186 <Method View getChildAt(int)>
    //   17   27:astore          4
    //   18   29:aload_0         
    //   19   30:iload_1         
    //   20   31:iconst_1        
    //   21   32:iadd            
    //   22   33:invokevirtual   #186 <Method View getChildAt(int)>
    //   23   36:astore          5
    //   24   38:aload_3         
    //   25   39:ifnull          46
    //   26   42:aload_3         
    //   27   43:invokevirtual   #189 <Method void View.invalidate()>
    //   28   46:aload           4
    //   29   48:ifnull          56
    //   30   51:aload           4
    //   31   53:invokevirtual   #189 <Method void View.invalidate()>
    //   32   56:aload           5
    //   33   58:ifnull          66
    //   34   61:aload           5
    //   35   63:invokevirtual   #189 <Method void View.invalidate()>
    //   36   66:return          
    //   37   67:aload_0         
    //   38   68:iload_2         
    //   39   69:invokevirtual   #186 <Method View getChildAt(int)>
    //   40   72:invokevirtual   #189 <Method void View.invalidate()>
    //   41   75:iinc            2  1
    //   42   78:goto            2
    }

    protected boolean getChildStaticTransformation(View view, Transformation transformation)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field boolean enable3D>
    //    2    4:ifeq            587
    //    3    7:aload_1         
    //    4    8:invokevirtual   #194 <Method int View.getWidth()>
    //    5   11:ifne            16
    //    6   14:iconst_0        
    //    7   15:ireturn         
    //    8   16:aload_1         
    //    9   17:invokevirtual   #197 <Method int View.getLeft()>
    //   10   20:aload_1         
    //   11   21:invokevirtual   #194 <Method int View.getWidth()>
    //   12   24:idiv            
    //   13   25:istore          4
    //   14   27:iload           4
    //   15   29:ifeq            277
    //   16   32:iload           4
    //   17   34:iconst_m1       
    //   18   35:aload_0         
    //   19   36:invokevirtual   #201 <Method PagerAdapter getAdapter()>
    //   20   39:invokevirtual   #206 <Method int PagerAdapter.getCount()>
    //   21   42:iadd            
    //   22   43:icmpeq          277
    //   23   46:iconst_0        
    //   24   47:istore          5
    //   25   49:aload_0         
    //   26   50:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //   27   53:invokestatic    #209 <Method boolean ViewPager3D$OverscrollEffect.access$3(ViewPager3D$OverscrollEffect)>
    //   28   56:ifeq            290
    //   29   59:iload           5
    //   30   61:ifeq            290
    //   31   64:aload_0         
    //   32   65:invokevirtual   #210 <Method int getWidth()>
    //   33   68:iconst_2        
    //   34   69:idiv            
    //   35   70:i2f             
    //   36   71:fstore          13
    //   37   73:aload_0         
    //   38   74:invokevirtual   #213 <Method int getHeight()>
    //   39   77:iconst_2        
    //   40   78:idiv            
    //   41   79:istore          14
    //   42   81:aload_2         
    //   43   82:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //   44   85:invokevirtual   #224 <Method void Matrix.reset()>
    //   45   88:aload_0         
    //   46   89:getfield        #166 <Field int mOverscrollTranslation>
    //   47   92:i2d             
    //   48   93:ldc2w           #225 <Double 3.1415926535897931D>
    //   49   96:aload_0         
    //   50   97:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //   51  100:invokestatic    #229 <Method float ViewPager3D$OverscrollEffect.access$4(ViewPager3D$OverscrollEffect)>
    //   52  103:invokestatic    #235 <Method float Math.abs(float)>
    //   53  106:f2d             
    //   54  107:dmul            
    //   55  108:invokestatic    #239 <Method double Math.sin(double)>
    //   56  111:dmul            
    //   57  112:d2f             
    //   58  113:fstore          15
    //   59  115:ldc1            #240 <Float 90F>
    //   60  117:aload_0         
    //   61  118:getfield        #156 <Field float mOverscrollRotation>
    //   62  121:fdiv            
    //   63  122:ldc2w           #26  <Double 57.295779513082323D>
    //   64  125:aload_0         
    //   65  126:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //   66  129:invokestatic    #229 <Method float ViewPager3D$OverscrollEffect.access$4(ViewPager3D$OverscrollEffect)>
    //   67  132:f2d             
    //   68  133:invokestatic    #243 <Method double Math.acos(double)>
    //   69  136:dmul            
    //   70  137:aload_0         
    //   71  138:getfield        #156 <Field float mOverscrollRotation>
    //   72  141:f2d             
    //   73  142:ddiv            
    //   74  143:d2f             
    //   75  144:fsub            
    //   76  145:fstore          16
    //   77  147:aload_0         
    //   78  148:getfield        #75  <Field Camera mCamera>
    //   79  151:invokevirtual   #246 <Method void Camera.save()>
    //   80  154:aload_0         
    //   81  155:getfield        #75  <Field Camera mCamera>
    //   82  158:fload           16
    //   83  160:invokevirtual   #250 <Method void Camera.rotateY(float)>
    //   84  163:aload_0         
    //   85  164:getfield        #75  <Field Camera mCamera>
    //   86  167:fconst_0        
    //   87  168:fconst_0        
    //   88  169:fload           15
    //   89  171:invokevirtual   #254 <Method void Camera.translate(float, float, float)>
    //   90  174:aload_0         
    //   91  175:getfield        #75  <Field Camera mCamera>
    //   92  178:aload_2         
    //   93  179:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //   94  182:invokevirtual   #257 <Method void Camera.getMatrix(Matrix)>
    //   95  185:aload_0         
    //   96  186:getfield        #75  <Field Camera mCamera>
    //   97  189:invokevirtual   #260 <Method void Camera.restore()>
    //   98  192:aload_2         
    //   99  193:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //  100  196:fload           13
    //  101  198:fneg            
    //  102  199:iload           14
    //  103  201:ineg            
    //  104  202:i2f             
    //  105  203:invokevirtual   #264 <Method boolean Matrix.preTranslate(float, float)>
    //  106  206:pop             
    //  107  207:aload_2         
    //  108  208:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //  109  211:fload           13
    //  110  213:iload           14
    //  111  215:i2f             
    //  112  216:invokevirtual   #267 <Method boolean Matrix.postTranslate(float, float)>
    //  113  219:pop             
    //  114  220:aload_0         
    //  115  221:getfield        #172 <Field boolean mAnimateAlpha>
    //  116  224:ifeq            263
    //  117  227:aload_2         
    //  118  228:getstatic       #270 <Field int Transformation.TYPE_BOTH>
    //  119  231:invokevirtual   #273 <Method void Transformation.setTransformationType(int)>
    //  120  234:aload_2         
    //  121  235:ldc2w           #225 <Double 3.1415926535897931D>
    //  122  238:fconst_1        
    //  123  239:aload_0         
    //  124  240:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //  125  243:invokestatic    #229 <Method float ViewPager3D$OverscrollEffect.access$4(ViewPager3D$OverscrollEffect)>
    //  126  246:invokestatic    #235 <Method float Math.abs(float)>
    //  127  249:fsub            
    //  128  250:f2d             
    //  129  251:dmul            
    //  130  252:ldc2w           #274 <Double 2D>
    //  131  255:ddiv            
    //  132  256:d2f             
    //  133  257:invokestatic    #279 <Method float FloatMath.sin(float)>
    //  134  260:invokevirtual   #282 <Method void Transformation.setAlpha(float)>
    //  135  263:aload_0         
    //  136  264:invokevirtual   #179 <Method int getChildCount()>
    //  137  267:iconst_1        
    //  138  268:icmpne          283
    //  139  271:aload_0         
    //  140  272:invokevirtual   #182 <Method void invalidate()>
    //  141  275:iconst_1        
    //  142  276:ireturn         
    //  143  277:iconst_1        
    //  144  278:istore          5
    //  145  280:goto            49
    //  146  283:aload_1         
    //  147  284:invokevirtual   #189 <Method void View.invalidate()>
    //  148  287:goto            275
    //  149  290:aload_0         
    //  150  291:getfield        #131 <Field float mScrollPositionOffset>
    //  151  294:fconst_0        
    //  152  295:fcmpl           
    //  153  296:ifle            585
    //  154  299:aload_0         
    //  155  300:invokevirtual   #210 <Method int getWidth()>
    //  156  303:iconst_2        
    //  157  304:idiv            
    //  158  305:i2f             
    //  159  306:fstore          6
    //  160  308:aload_0         
    //  161  309:invokevirtual   #213 <Method int getHeight()>
    //  162  312:iconst_2        
    //  163  313:idiv            
    //  164  314:i2f             
    //  165  315:fstore          7
    //  166  317:iload           4
    //  167  319:aload_0         
    //  168  320:getfield        #122 <Field int mScrollPosition>
    //  169  323:icmple          507
    //  170  326:aload_0         
    //  171  327:getfield        #172 <Field boolean mAnimateAlpha>
    //  172  330:ifeq            361
    //  173  333:aload_2         
    //  174  334:getstatic       #270 <Field int Transformation.TYPE_BOTH>
    //  175  337:invokevirtual   #273 <Method void Transformation.setTransformationType(int)>
    //  176  340:aload_2         
    //  177  341:ldc2w           #225 <Double 3.1415926535897931D>
    //  178  344:aload_0         
    //  179  345:getfield        #131 <Field float mScrollPositionOffset>
    //  180  348:f2d             
    //  181  349:dmul            
    //  182  350:ldc2w           #274 <Double 2D>
    //  183  353:ddiv            
    //  184  354:d2f             
    //  185  355:invokestatic    #279 <Method float FloatMath.sin(float)>
    //  186  358:invokevirtual   #282 <Method void Transformation.setAlpha(float)>
    //  187  361:ldc1            #240 <Float 90F>
    //  188  363:aload_0         
    //  189  364:getfield        #158 <Field float mSwipeRotation>
    //  190  367:fdiv            
    //  191  368:fneg            
    //  192  369:f2d             
    //  193  370:ldc2w           #26  <Double 57.295779513082323D>
    //  194  373:fconst_1        
    //  195  374:aload_0         
    //  196  375:getfield        #131 <Field float mScrollPositionOffset>
    //  197  378:fsub            
    //  198  379:f2d             
    //  199  380:invokestatic    #243 <Method double Math.acos(double)>
    //  200  383:dmul            
    //  201  384:aload_0         
    //  202  385:getfield        #158 <Field float mSwipeRotation>
    //  203  388:f2d             
    //  204  389:ddiv            
    //  205  390:dadd            
    //  206  391:dstore          8
    //  207  393:aload_0         
    //  208  394:getfield        #164 <Field int mSwipeTranslation>
    //  209  397:i2f             
    //  210  398:ldc2w           #225 <Double 3.1415926535897931D>
    //  211  401:aload_0         
    //  212  402:getfield        #131 <Field float mScrollPositionOffset>
    //  213  405:f2d             
    //  214  406:dmul            
    //  215  407:d2f             
    //  216  408:invokestatic    #279 <Method float FloatMath.sin(float)>
    //  217  411:fmul            
    //  218  412:fstore          10
    //  219  414:aload_2         
    //  220  415:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //  221  418:invokevirtual   #224 <Method void Matrix.reset()>
    //  222  421:aload_0         
    //  223  422:getfield        #75  <Field Camera mCamera>
    //  224  425:invokevirtual   #246 <Method void Camera.save()>
    //  225  428:aload_0         
    //  226  429:getfield        #75  <Field Camera mCamera>
    //  227  432:dload           8
    //  228  434:d2f             
    //  229  435:invokevirtual   #250 <Method void Camera.rotateY(float)>
    //  230  438:aload_0         
    //  231  439:getfield        #75  <Field Camera mCamera>
    //  232  442:fconst_0        
    //  233  443:fconst_0        
    //  234  444:fload           10
    //  235  446:invokevirtual   #254 <Method void Camera.translate(float, float, float)>
    //  236  449:aload_0         
    //  237  450:getfield        #75  <Field Camera mCamera>
    //  238  453:aload_2         
    //  239  454:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //  240  457:invokevirtual   #257 <Method void Camera.getMatrix(Matrix)>
    //  241  460:aload_0         
    //  242  461:getfield        #75  <Field Camera mCamera>
    //  243  464:invokevirtual   #260 <Method void Camera.restore()>
    //  244  467:aload_2         
    //  245  468:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //  246  471:fload           6
    //  247  473:fneg            
    //  248  474:fload           7
    //  249  476:fneg            
    //  250  477:invokevirtual   #264 <Method boolean Matrix.preTranslate(float, float)>
    //  251  480:pop             
    //  252  481:aload_2         
    //  253  482:invokevirtual   #219 <Method Matrix Transformation.getMatrix()>
    //  254  485:fload           6
    //  255  487:fload           7
    //  256  489:invokevirtual   #267 <Method boolean Matrix.postTranslate(float, float)>
    //  257  492:pop             
    //  258  493:aload_0         
    //  259  494:invokevirtual   #179 <Method int getChildCount()>
    //  260  497:iconst_1        
    //  261  498:icmpne          578
    //  262  501:aload_0         
    //  263  502:invokevirtual   #182 <Method void invalidate()>
    //  264  505:iconst_1        
    //  265  506:ireturn         
    //  266  507:aload_0         
    //  267  508:getfield        #172 <Field boolean mAnimateAlpha>
    //  268  511:ifeq            546
    //  269  514:aload_2         
    //  270  515:getstatic       #270 <Field int Transformation.TYPE_BOTH>
    //  271  518:invokevirtual   #273 <Method void Transformation.setTransformationType(int)>
    //  272  521:aload_2         
    //  273  522:ldc2w           #283 <Double 1.5707963267948966D>
    //  274  525:ldc2w           #225 <Double 3.1415926535897931D>
    //  275  528:aload_0         
    //  276  529:getfield        #131 <Field float mScrollPositionOffset>
    //  277  532:f2d             
    //  278  533:dmul            
    //  279  534:ldc2w           #274 <Double 2D>
    //  280  537:ddiv            
    //  281  538:dadd            
    //  282  539:d2f             
    //  283  540:invokestatic    #279 <Method float FloatMath.sin(float)>
    //  284  543:invokevirtual   #282 <Method void Transformation.setAlpha(float)>
    //  285  546:ldc1            #240 <Float 90F>
    //  286  548:aload_0         
    //  287  549:getfield        #158 <Field float mSwipeRotation>
    //  288  552:fdiv            
    //  289  553:f2d             
    //  290  554:ldc2w           #26  <Double 57.295779513082323D>
    //  291  557:aload_0         
    //  292  558:getfield        #131 <Field float mScrollPositionOffset>
    //  293  561:f2d             
    //  294  562:invokestatic    #243 <Method double Math.acos(double)>
    //  295  565:dmul            
    //  296  566:aload_0         
    //  297  567:getfield        #158 <Field float mSwipeRotation>
    //  298  570:f2d             
    //  299  571:ddiv            
    //  300  572:dsub            
    //  301  573:dstore          8
    //  302  575:goto            393
    //  303  578:aload_1         
    //  304  579:invokevirtual   #189 <Method void View.invalidate()>
    //  305  582:goto            505
    //  306  585:iconst_0        
    //  307  586:ireturn         
    //  308  587:aload_0         
    //  309  588:aload_1         
    //  310  589:aload_2         
    //  311  590:invokespecial   #286 <Method boolean ViewPager.getChildStaticTransformation(View, Transformation)>
    //  312  593:pop             
    //  313  594:iconst_0        
    //  314  595:ireturn         
    }

    public int getOverscrollAnimationDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field int mOverscrollAnimationDuration>
    //    2    4:ireturn         
    }

    public float getOverscrollRotation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #156 <Field float mOverscrollRotation>
    //    2    4:freturn         
    }

    public int getOverscrollTranslation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #166 <Field int mOverscrollTranslation>
    //    2    4:ireturn         
    }

    public float getSwipeRotation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #158 <Field float mSwipeRotation>
    //    2    4:freturn         
    }

    public int getSwipeTranslation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #164 <Field int mSwipeTranslation>
    //    2    4:ireturn         
    }

    public boolean isAnimateAlpha()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #172 <Field boolean mAnimateAlpha>
    //    2    4:ireturn         
    }

    public boolean isEnable3D()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field boolean enable3D>
    //    2    4:ireturn         
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
    //    0    0:sipush          255
    //    1    3:aload_1         
    //    2    4:invokevirtual   #302 <Method int MotionEvent.getAction()>
    //    3    7:iand            
    //    4    8:lookupswitch    2: default 36
    //                   0: 42
    //                   5: 62
    //    5   36:aload_0         
    //    6   37:aload_1         
    //    7   38:invokespecial   #304 <Method boolean ViewPager.onInterceptTouchEvent(MotionEvent)>
    //    8   41:ireturn         
    //    9   42:aload_0         
    //   10   43:aload_1         
    //   11   44:invokevirtual   #307 <Method float MotionEvent.getX()>
    //   12   47:putfield        #309 <Field float mLastMotionX>
    //   13   50:aload_0         
    //   14   51:aload_1         
    //   15   52:iconst_0        
    //   16   53:invokestatic    #315 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   17   56:putfield        #317 <Field int mActivePointerId>
    //   18   59:goto            36
    //   19   62:aload_1         
    //   20   63:invokestatic    #321 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //   21   66:istore_2        
    //   22   67:aload_0         
    //   23   68:aload_1         
    //   24   69:iload_2         
    //   25   70:invokestatic    #324 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   26   73:putfield        #309 <Field float mLastMotionX>
    //   27   76:aload_0         
    //   28   77:aload_1         
    //   29   78:iload_2         
    //   30   79:invokestatic    #315 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   31   82:putfield        #317 <Field int mActivePointerId>
    //   32   85:goto            36
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field boolean enable3D>
    //    2    4:ifeq            490
    //    3    7:aload_1         
    //    4    8:invokevirtual   #302 <Method int MotionEvent.getAction()>
    //    5   11:istore_3        
    //    6   12:iconst_0        
    //    7   13:istore          4
    //    8   15:iload_3         
    //    9   16:tableswitch     0 6: default 60
    //                   0 77
    //                   1 389
    //                   2 132
    //                   3 389
    //                   4 60
    //                   5 100
    //                   6 407
    //   10   60:aload_0         
    //   11   61:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //   12   64:invokestatic    #209 <Method boolean ViewPager3D$OverscrollEffect.access$3(ViewPager3D$OverscrollEffect)>
    //   13   67:ifeq            484
    //   14   70:iload           4
    //   15   72:ifne            484
    //   16   75:iconst_1        
    //   17   76:ireturn         
    //   18   77:iconst_1        
    //   19   78:istore          4
    //   20   80:aload_0         
    //   21   81:aload_1         
    //   22   82:invokevirtual   #307 <Method float MotionEvent.getX()>
    //   23   85:putfield        #309 <Field float mLastMotionX>
    //   24   88:aload_0         
    //   25   89:aload_1         
    //   26   90:iconst_0        
    //   27   91:invokestatic    #315 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   28   94:putfield        #317 <Field int mActivePointerId>
    //   29   97:goto            60
    //   30  100:iconst_1        
    //   31  101:istore          4
    //   32  103:aload_1         
    //   33  104:invokestatic    #321 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //   34  107:istore          24
    //   35  109:aload_0         
    //   36  110:aload_1         
    //   37  111:iload           24
    //   38  113:invokestatic    #324 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   39  116:putfield        #309 <Field float mLastMotionX>
    //   40  119:aload_0         
    //   41  120:aload_1         
    //   42  121:iload           24
    //   43  123:invokestatic    #315 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   44  126:putfield        #317 <Field int mActivePointerId>
    //   45  129:goto            60
    //   46  132:aload_0         
    //   47  133:getfield        #317 <Field int mActivePointerId>
    //   48  136:iconst_m1       
    //   49  137:icmpeq          376
    //   50  140:aload_1         
    //   51  141:aload_1         
    //   52  142:aload_0         
    //   53  143:getfield        #317 <Field int mActivePointerId>
    //   54  146:invokestatic    #328 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   55  149:invokestatic    #324 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   56  152:fstore          9
    //   57  154:aload_0         
    //   58  155:getfield        #309 <Field float mLastMotionX>
    //   59  158:fload           9
    //   60  160:fsub            
    //   61  161:fstore          10
    //   62  163:aload_0         
    //   63  164:invokevirtual   #331 <Method int getScrollX()>
    //   64  167:i2f             
    //   65  168:fstore          11
    //   66  170:aload_0         
    //   67  171:invokevirtual   #210 <Method int getWidth()>
    //   68  174:istore          12
    //   69  176:iload           12
    //   70  178:aload_0         
    //   71  179:invokevirtual   #334 <Method int getPageMargin()>
    //   72  182:iadd            
    //   73  183:istore          13
    //   74  185:iconst_m1       
    //   75  186:aload_0         
    //   76  187:invokevirtual   #201 <Method PagerAdapter getAdapter()>
    //   77  190:invokevirtual   #206 <Method int PagerAdapter.getCount()>
    //   78  193:iadd            
    //   79  194:istore          14
    //   80  196:aload_0         
    //   81  197:invokevirtual   #337 <Method int getCurrentItem()>
    //   82  200:istore          15
    //   83  202:iconst_0        
    //   84  203:iload           13
    //   85  205:iload           15
    //   86  207:iconst_1        
    //   87  208:isub            
    //   88  209:imul            
    //   89  210:invokestatic    #340 <Method int Math.max(int, int)>
    //   90  213:i2f             
    //   91  214:fstore          16
    //   92  216:iload           13
    //   93  218:iload           15
    //   94  220:iconst_1        
    //   95  221:iadd            
    //   96  222:iload           14
    //   97  224:invokestatic    #343 <Method int Math.min(int, int)>
    //   98  227:imul            
    //   99  228:i2f             
    //  100  229:fstore          17
    //  101  231:fload           11
    //  102  233:fload           10
    //  103  235:fadd            
    //  104  236:fstore          18
    //  105  238:aload_0         
    //  106  239:getfield        #131 <Field float mScrollPositionOffset>
    //  107  242:fconst_0        
    //  108  243:fcmpl           
    //  109  244:ifne            364
    //  110  247:fload           18
    //  111  249:fload           16
    //  112  251:fcmpg           
    //  113  252:ifge            298
    //  114  255:fload           16
    //  115  257:fconst_0        
    //  116  258:fcmpl           
    //  117  259:istore          22
    //  118  261:iconst_0        
    //  119  262:istore          4
    //  120  264:iload           22
    //  121  266:ifne            60
    //  122  269:fload           10
    //  123  271:aload_0         
    //  124  272:getfield        #95  <Field int mTouchSlop>
    //  125  275:i2f             
    //  126  276:fadd            
    //  127  277:fstore          23
    //  128  279:aload_0         
    //  129  280:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //  130  283:fload           23
    //  131  285:iload           12
    //  132  287:i2f             
    //  133  288:fdiv            
    //  134  289:invokevirtual   #346 <Method void ViewPager3D$OverscrollEffect.setPull(float)>
    //  135  292:iconst_0        
    //  136  293:istore          4
    //  137  295:goto            60
    //  138  298:fload           18
    //  139  300:fload           17
    //  140  302:fcmpl           
    //  141  303:istore          19
    //  142  305:iconst_0        
    //  143  306:istore          4
    //  144  308:iload           19
    //  145  310:ifle            60
    //  146  313:fload           17
    //  147  315:iload           14
    //  148  317:iload           13
    //  149  319:imul            
    //  150  320:i2f             
    //  151  321:fcmpl           
    //  152  322:istore          20
    //  153  324:iconst_0        
    //  154  325:istore          4
    //  155  327:iload           20
    //  156  329:ifne            60
    //  157  332:fload           18
    //  158  334:fload           17
    //  159  336:fsub            
    //  160  337:aload_0         
    //  161  338:getfield        #95  <Field int mTouchSlop>
    //  162  341:i2f             
    //  163  342:fsub            
    //  164  343:fstore          21
    //  165  345:aload_0         
    //  166  346:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //  167  349:fload           21
    //  168  351:iload           12
    //  169  353:i2f             
    //  170  354:fdiv            
    //  171  355:invokevirtual   #346 <Method void ViewPager3D$OverscrollEffect.setPull(float)>
    //  172  358:iconst_0        
    //  173  359:istore          4
    //  174  361:goto            60
    //  175  364:aload_0         
    //  176  365:fload           9
    //  177  367:putfield        #309 <Field float mLastMotionX>
    //  178  370:iconst_0        
    //  179  371:istore          4
    //  180  373:goto            60
    //  181  376:aload_0         
    //  182  377:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //  183  380:invokestatic    #349 <Method void ViewPager3D$OverscrollEffect.access$2(ViewPager3D$OverscrollEffect)>
    //  184  383:iconst_0        
    //  185  384:istore          4
    //  186  386:goto            60
    //  187  389:iconst_1        
    //  188  390:istore          4
    //  189  392:aload_0         
    //  190  393:iconst_m1       
    //  191  394:putfield        #317 <Field int mActivePointerId>
    //  192  397:aload_0         
    //  193  398:getfield        #69  <Field ViewPager3D$OverscrollEffect mOverscrollEffect>
    //  194  401:invokestatic    #349 <Method void ViewPager3D$OverscrollEffect.access$2(ViewPager3D$OverscrollEffect)>
    //  195  404:goto            60
    //  196  407:ldc2            #350 <Int 65280>
    //  197  410:aload_1         
    //  198  411:invokevirtual   #302 <Method int MotionEvent.getAction()>
    //  199  414:iand            
    //  200  415:bipush          8
    //  201  417:ishr            
    //  202  418:istore          5
    //  203  420:aload_1         
    //  204  421:iload           5
    //  205  423:invokestatic    #315 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  206  426:istore          6
    //  207  428:aload_0         
    //  208  429:getfield        #317 <Field int mActivePointerId>
    //  209  432:istore          7
    //  210  434:iconst_0        
    //  211  435:istore          4
    //  212  437:iload           6
    //  213  439:iload           7
    //  214  441:icmpne          60
    //  215  444:iload           5
    //  216  446:ifne            478
    //  217  449:iconst_1        
    //  218  450:istore          8
    //  219  452:aload_0         
    //  220  453:aload_1         
    //  221  454:iload           8
    //  222  456:invokevirtual   #353 <Method float MotionEvent.getX(int)>
    //  223  459:putfield        #309 <Field float mLastMotionX>
    //  224  462:aload_0         
    //  225  463:aload_1         
    //  226  464:iload           8
    //  227  466:invokestatic    #315 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  228  469:putfield        #317 <Field int mActivePointerId>
    //  229  472:iconst_1        
    //  230  473:istore          4
    //  231  475:goto            60
    //  232  478:iconst_0        
    //  233  479:istore          8
    //  234  481:goto            452
    //  235  484:aload_0         
    //  236  485:aload_1         
    //  237  486:invokespecial   #355 <Method boolean ViewPager.onTouchEvent(MotionEvent)>
    //  238  489:ireturn         
    //  239  490:aload_0         
    //  240  491:aload_1         
    //  241  492:invokespecial   #355 <Method boolean ViewPager.onTouchEvent(MotionEvent)>
    //  242  495:pop             
    //  243  496:iconst_1        
    //  244  497:ireturn         
    }

    public void setAnimateAlpha(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #172 <Field boolean mAnimateAlpha>
    //    3    5:return          
    }

    public void setEnable3D(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #62  <Field boolean enable3D>
    //    3    5:return          
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #126 <Field android.support.v4.view.ViewPager$OnPageChangeListener mScrollListener>
    //    3    5:return          
    }

    public void setOverscrollAnimationDuration(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #119 <Field int mOverscrollAnimationDuration>
    //    3    5:return          
    }

    public void setOverscrollRotation(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #156 <Field float mOverscrollRotation>
    //    3    5:return          
    }

    public void setOverscrollTranslation(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #166 <Field int mOverscrollTranslation>
    //    3    5:return          
    }

    public void setSwipeRotation(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #158 <Field float mSwipeRotation>
    //    3    5:return          
    }

    public void setSwipeTranslation(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #164 <Field int mSwipeTranslation>
    //    3    5:return          
    }

    private static final String DEBUG_TAG;
    private static final boolean DEFAULT_ANIMATE_ALPHA = true;
    private static final int DEFAULT_OVERSCROLL_ANIMATION_DURATION = 400;
    static final float DEFAULT_OVERSCROLL_ROTATION = 2F;
    static final int DEFAULT_OVERSCROLL_TRANSLATION = 150;
    static final float DEFAULT_SWIPE_ROTATION = 3F;
    static final int DEFAULT_SWIPE_TRANSLATION = 100;
    private static final int INVALID_POINTER_ID = -1;
    private static final double RADIANS = 57.295779513082323D;
    boolean enable3D;
    private int mActivePointerId;
    private boolean mAnimateAlpha;
    private final Camera mCamera;
    private float mLastMotionX;
    private int mLastPosition;
    private int mOverscrollAnimationDuration;
    private final OverscrollEffect mOverscrollEffect;
    private float mOverscrollRotation;
    private int mOverscrollTranslation;
    private android.support.v4.view.ViewPager.OnPageChangeListener mScrollListener;
    private int mScrollPosition;
    private float mScrollPositionOffset;
    private float mSwipeRotation;
    private int mSwipeTranslation;
    private final int mTouchSlop;

    static int access$0(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field int mLastPosition>
    //    2    4:ireturn         
    }

    static void access$1(ViewPager3D viewpager3d, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #116 <Method void invalidateVisibleChilds(int)>
    //    3    5:return          
    }

    static int access$2(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field int mOverscrollAnimationDuration>
    //    2    4:ireturn         
    }

    static int access$3(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field int mScrollPosition>
    //    2    4:ireturn         
    }

    static android.support.v4.view.ViewPager.OnPageChangeListener access$4(ViewPager3D viewpager3d)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field android.support.v4.view.ViewPager$OnPageChangeListener mScrollListener>
    //    2    4:areturn         
    }

    static void access$5(ViewPager3D viewpager3d, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #122 <Field int mScrollPosition>
    //    3    5:return          
    }

    static void access$6(ViewPager3D viewpager3d, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #131 <Field float mScrollPositionOffset>
    //    3    5:return          
    }

    static void access$7(ViewPager3D viewpager3d, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #77  <Field int mLastPosition>
    //    3    5:return          
    }

    // Unreferenced inner class codeadore/textgram/custom_widgets/ViewPager3D$OverscrollEffect$1

/* anonymous class */
    class OverscrollEffect._cls1
        implements android.animation.Animator.AnimatorListener
    {

        OverscrollEffect._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ViewPager3D$OverscrollEffect this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onAnimationCancel(Animator animator)
        {
        //    0    0:return          
        }

        public void onAnimationEnd(Animator animator)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ViewPager3D$OverscrollEffect this$1>
        //    2    4:fconst_0        
        //    3    5:invokestatic    #26  <Method void ViewPager3D$OverscrollEffect.access$1(ViewPager3D$OverscrollEffect, float)>
        //    4    8:return          
        }

        public void onAnimationRepeat(Animator animator)
        {
        //    0    0:return          
        }

        public void onAnimationStart(Animator animator)
        {
        //    0    0:return          
        }

        final OverscrollEffect this$1;
    }

}
