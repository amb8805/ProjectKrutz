// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.*;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat
{

    static 
    {
    //    0    0:new             #25  <Class PreHoneycombCompat$1>
    //    1    3:dup             
    //    2    4:ldc1            #27  <String "alpha">
    //    3    6:invokespecial   #31  <Method void PreHoneycombCompat$1(String)>
    //    4    9:putstatic       #33  <Field Property ALPHA>
    //    5   12:new             #35  <Class PreHoneycombCompat$2>
    //    6   15:dup             
    //    7   16:ldc1            #37  <String "pivotX">
    //    8   18:invokespecial   #38  <Method void PreHoneycombCompat$2(String)>
    //    9   21:putstatic       #40  <Field Property PIVOT_X>
    //   10   24:new             #42  <Class PreHoneycombCompat$3>
    //   11   27:dup             
    //   12   28:ldc1            #44  <String "pivotY">
    //   13   30:invokespecial   #45  <Method void PreHoneycombCompat$3(String)>
    //   14   33:putstatic       #47  <Field Property PIVOT_Y>
    //   15   36:new             #49  <Class PreHoneycombCompat$4>
    //   16   39:dup             
    //   17   40:ldc1            #51  <String "translationX">
    //   18   42:invokespecial   #52  <Method void PreHoneycombCompat$4(String)>
    //   19   45:putstatic       #54  <Field Property TRANSLATION_X>
    //   20   48:new             #56  <Class PreHoneycombCompat$5>
    //   21   51:dup             
    //   22   52:ldc1            #58  <String "translationY">
    //   23   54:invokespecial   #59  <Method void PreHoneycombCompat$5(String)>
    //   24   57:putstatic       #61  <Field Property TRANSLATION_Y>
    //   25   60:new             #63  <Class PreHoneycombCompat$6>
    //   26   63:dup             
    //   27   64:ldc1            #65  <String "rotation">
    //   28   66:invokespecial   #66  <Method void PreHoneycombCompat$6(String)>
    //   29   69:putstatic       #68  <Field Property ROTATION>
    //   30   72:new             #70  <Class PreHoneycombCompat$7>
    //   31   75:dup             
    //   32   76:ldc1            #72  <String "rotationX">
    //   33   78:invokespecial   #73  <Method void PreHoneycombCompat$7(String)>
    //   34   81:putstatic       #75  <Field Property ROTATION_X>
    //   35   84:new             #77  <Class PreHoneycombCompat$8>
    //   36   87:dup             
    //   37   88:ldc1            #79  <String "rotationY">
    //   38   90:invokespecial   #80  <Method void PreHoneycombCompat$8(String)>
    //   39   93:putstatic       #82  <Field Property ROTATION_Y>
    //   40   96:new             #84  <Class PreHoneycombCompat$9>
    //   41   99:dup             
    //   42  100:ldc1            #86  <String "scaleX">
    //   43  102:invokespecial   #87  <Method void PreHoneycombCompat$9(String)>
    //   44  105:putstatic       #89  <Field Property SCALE_X>
    //   45  108:new             #91  <Class PreHoneycombCompat$10>
    //   46  111:dup             
    //   47  112:ldc1            #93  <String "scaleY">
    //   48  114:invokespecial   #94  <Method void PreHoneycombCompat$10(String)>
    //   49  117:putstatic       #96  <Field Property SCALE_Y>
    //   50  120:new             #98  <Class PreHoneycombCompat$11>
    //   51  123:dup             
    //   52  124:ldc1            #100 <String "scrollX">
    //   53  126:invokespecial   #101 <Method void PreHoneycombCompat$11(String)>
    //   54  129:putstatic       #103 <Field Property SCROLL_X>
    //   55  132:new             #105 <Class PreHoneycombCompat$12>
    //   56  135:dup             
    //   57  136:ldc1            #107 <String "scrollY">
    //   58  138:invokespecial   #108 <Method void PreHoneycombCompat$12(String)>
    //   59  141:putstatic       #110 <Field Property SCROLL_Y>
    //   60  144:new             #112 <Class PreHoneycombCompat$13>
    //   61  147:dup             
    //   62  148:ldc1            #114 <String "x">
    //   63  150:invokespecial   #115 <Method void PreHoneycombCompat$13(String)>
    //   64  153:putstatic       #117 <Field Property X>
    //   65  156:new             #119 <Class PreHoneycombCompat$14>
    //   66  159:dup             
    //   67  160:ldc1            #121 <String "y">
    //   68  162:invokespecial   #122 <Method void PreHoneycombCompat$14(String)>
    //   69  165:putstatic       #124 <Field Property Y>
    //   70  168:return          
    }

    private PreHoneycombCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #126 <Method void Object()>
    //    2    4:return          
    }

    static Property ALPHA;
    static Property PIVOT_X;
    static Property PIVOT_Y;
    static Property ROTATION;
    static Property ROTATION_X;
    static Property ROTATION_Y;
    static Property SCALE_X;
    static Property SCALE_Y;
    static Property SCROLL_X;
    static Property SCROLL_Y;
    static Property TRANSLATION_X;
    static Property TRANSLATION_Y;
    static Property X;
    static Property Y;

    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$1

/* anonymous class */
    class _cls1 extends FloatProperty
    {

        _cls1(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getAlpha()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setAlpha(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$10

/* anonymous class */
    class _cls10 extends FloatProperty
    {

        _cls10(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getScaleY()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setScaleY(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$11

/* anonymous class */
    class _cls11 extends IntProperty
    {

        _cls11(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void IntProperty(String)>
        //    3    5:return          
        }

        public Integer get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method int AnimatorProxy.getScrollX()>
        //    3    7:invokestatic    #29  <Method Integer Integer.valueOf(int)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Integer get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:iload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setScrollX(int)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:iload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, int)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$12

/* anonymous class */
    class _cls12 extends IntProperty
    {

        _cls12(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void IntProperty(String)>
        //    3    5:return          
        }

        public Integer get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method int AnimatorProxy.getScrollY()>
        //    3    7:invokestatic    #29  <Method Integer Integer.valueOf(int)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Integer get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:iload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setScrollY(int)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:iload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, int)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$13

/* anonymous class */
    class _cls13 extends FloatProperty
    {

        _cls13(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getX()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setX(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$14

/* anonymous class */
    class _cls14 extends FloatProperty
    {

        _cls14(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getY()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setY(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$2

/* anonymous class */
    class _cls2 extends FloatProperty
    {

        _cls2(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getPivotX()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setPivotX(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$3

/* anonymous class */
    class _cls3 extends FloatProperty
    {

        _cls3(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getPivotY()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setPivotY(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$4

/* anonymous class */
    class _cls4 extends FloatProperty
    {

        _cls4(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getTranslationX()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setTranslationX(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$5

/* anonymous class */
    class _cls5 extends FloatProperty
    {

        _cls5(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getTranslationY()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setTranslationY(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$6

/* anonymous class */
    class _cls6 extends FloatProperty
    {

        _cls6(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getRotation()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setRotation(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$7

/* anonymous class */
    class _cls7 extends FloatProperty
    {

        _cls7(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getRotationX()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setRotationX(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$8

/* anonymous class */
    class _cls8 extends FloatProperty
    {

        _cls8(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getRotationY()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setRotationY(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }


    // Unreferenced inner class com/nineoldandroids/animation/PreHoneycombCompat$9

/* anonymous class */
    class _cls9 extends FloatProperty
    {

        _cls9(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void FloatProperty(String)>
        //    3    5:return          
        }

        public Float get(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:invokevirtual   #23  <Method float AnimatorProxy.getScaleX()>
        //    3    7:invokestatic    #29  <Method Float Float.valueOf(float)>
        //    4   10:areturn         
        }

        public volatile Object get(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:invokevirtual   #34  <Method Float get(View)>
        //    4    8:areturn         
        }

        public void setValue(View view, float f)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method AnimatorProxy AnimatorProxy.wrap(View)>
        //    2    4:fload_2         
        //    3    5:invokevirtual   #40  <Method void AnimatorProxy.setScaleX(float)>
        //    4    8:return          
        }

        public volatile void setValue(Object obj, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #32  <Class View>
        //    3    5:fload_2         
        //    4    6:invokevirtual   #43  <Method void setValue(View, float)>
        //    5    9:return          
        }
    }

}
