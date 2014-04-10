// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;

public abstract class Keyframe
    implements Cloneable
{
    static class FloatKeyframe extends Keyframe
    {

        FloatKeyframe(float f)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Keyframe()>
        //    2    4:aload_0         
        //    3    5:fload_1         
        //    4    6:putfield        #14  <Field float mFraction>
        //    5    9:aload_0         
        //    6   10:getstatic       #20  <Field Class Float.TYPE>
        //    7   13:putfield        #23  <Field Class mValueType>
        //    8   16:return          
        }

        FloatKeyframe(float f, float f1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Keyframe()>
        //    2    4:aload_0         
        //    3    5:fload_1         
        //    4    6:putfield        #14  <Field float mFraction>
        //    5    9:aload_0         
        //    6   10:fload_2         
        //    7   11:putfield        #26  <Field float mValue>
        //    8   14:aload_0         
        //    9   15:getstatic       #20  <Field Class Float.TYPE>
        //   10   18:putfield        #23  <Field Class mValueType>
        //   11   21:aload_0         
        //   12   22:iconst_1        
        //   13   23:putfield        #30  <Field boolean mHasValue>
        //   14   26:return          
        }

        public FloatKeyframe clone()
        {
        //    0    0:new             #2   <Class Keyframe$FloatKeyframe>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:invokevirtual   #36  <Method float getFraction()>
        //    4    8:aload_0         
        //    5    9:getfield        #26  <Field float mValue>
        //    6   12:invokespecial   #38  <Method void Keyframe$FloatKeyframe(float, float)>
        //    7   15:astore_1        
        //    8   16:aload_1         
        //    9   17:aload_0         
        //   10   18:invokevirtual   #42  <Method Interpolator getInterpolator()>
        //   11   21:invokevirtual   #46  <Method void setInterpolator(Interpolator)>
        //   12   24:aload_1         
        //   13   25:areturn         
        }

        public volatile Keyframe clone()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #49  <Method Keyframe$FloatKeyframe clone()>
        //    2    4:areturn         
        }

        public float getFloatValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #26  <Field float mValue>
        //    2    4:freturn         
        }

        public Object getValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #26  <Field float mValue>
        //    2    4:invokestatic    #56  <Method Float Float.valueOf(float)>
        //    3    7:areturn         
        }

        public void setValue(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:ifnull          29
        //    2    4:aload_1         
        //    3    5:invokevirtual   #64  <Method Class Object.getClass()>
        //    4    8:ldc1            #16  <Class Float>
        //    5   10:if_acmpne       29
        //    6   13:aload_0         
        //    7   14:aload_1         
        //    8   15:checkcast       #16  <Class Float>
        //    9   18:invokevirtual   #67  <Method float Float.floatValue()>
        //   10   21:putfield        #26  <Field float mValue>
        //   11   24:aload_0         
        //   12   25:iconst_1        
        //   13   26:putfield        #30  <Field boolean mHasValue>
        //   14   29:return          
        }

        float mValue;
    }

    static class IntKeyframe extends Keyframe
    {

        IntKeyframe(float f)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Keyframe()>
        //    2    4:aload_0         
        //    3    5:fload_1         
        //    4    6:putfield        #15  <Field float mFraction>
        //    5    9:aload_0         
        //    6   10:getstatic       #21  <Field Class Integer.TYPE>
        //    7   13:putfield        #24  <Field Class mValueType>
        //    8   16:return          
        }

        IntKeyframe(float f, int i)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Keyframe()>
        //    2    4:aload_0         
        //    3    5:fload_1         
        //    4    6:putfield        #15  <Field float mFraction>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #27  <Field int mValue>
        //    8   14:aload_0         
        //    9   15:getstatic       #21  <Field Class Integer.TYPE>
        //   10   18:putfield        #24  <Field Class mValueType>
        //   11   21:aload_0         
        //   12   22:iconst_1        
        //   13   23:putfield        #31  <Field boolean mHasValue>
        //   14   26:return          
        }

        public IntKeyframe clone()
        {
        //    0    0:new             #2   <Class Keyframe$IntKeyframe>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:invokevirtual   #37  <Method float getFraction()>
        //    4    8:aload_0         
        //    5    9:getfield        #27  <Field int mValue>
        //    6   12:invokespecial   #39  <Method void Keyframe$IntKeyframe(float, int)>
        //    7   15:astore_1        
        //    8   16:aload_1         
        //    9   17:aload_0         
        //   10   18:invokevirtual   #43  <Method Interpolator getInterpolator()>
        //   11   21:invokevirtual   #47  <Method void setInterpolator(Interpolator)>
        //   12   24:aload_1         
        //   13   25:areturn         
        }

        public volatile Keyframe clone()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #50  <Method Keyframe$IntKeyframe clone()>
        //    2    4:areturn         
        }

        public int getIntValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field int mValue>
        //    2    4:ireturn         
        }

        public Object getValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #27  <Field int mValue>
        //    2    4:invokestatic    #58  <Method Integer Integer.valueOf(int)>
        //    3    7:areturn         
        }

        public void setValue(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:ifnull          29
        //    2    4:aload_1         
        //    3    5:invokevirtual   #66  <Method Class Object.getClass()>
        //    4    8:ldc1            #17  <Class Integer>
        //    5   10:if_acmpne       29
        //    6   13:aload_0         
        //    7   14:aload_1         
        //    8   15:checkcast       #17  <Class Integer>
        //    9   18:invokevirtual   #69  <Method int Integer.intValue()>
        //   10   21:putfield        #27  <Field int mValue>
        //   11   24:aload_0         
        //   12   25:iconst_1        
        //   13   26:putfield        #31  <Field boolean mHasValue>
        //   14   29:return          
        }

        int mValue;
    }

    static class ObjectKeyframe extends Keyframe
    {

        ObjectKeyframe(float f, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Keyframe()>
        //    2    4:aload_0         
        //    3    5:fload_1         
        //    4    6:putfield        #15  <Field float mFraction>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #17  <Field Object mValue>
        //    8   14:aload_2         
        //    9   15:ifnull          45
        //   10   18:iconst_1        
        //   11   19:istore_3        
        //   12   20:aload_0         
        //   13   21:iload_3         
        //   14   22:putfield        #21  <Field boolean mHasValue>
        //   15   25:aload_0         
        //   16   26:getfield        #21  <Field boolean mHasValue>
        //   17   29:ifeq            50
        //   18   32:aload_2         
        //   19   33:invokevirtual   #27  <Method Class Object.getClass()>
        //   20   36:astore          4
        //   21   38:aload_0         
        //   22   39:aload           4
        //   23   41:putfield        #31  <Field Class mValueType>
        //   24   44:return          
        //   25   45:iconst_0        
        //   26   46:istore_3        
        //   27   47:goto            20
        //   28   50:ldc1            #23  <Class Object>
        //   29   52:astore          4
        //   30   54:goto            38
        }

        public ObjectKeyframe clone()
        {
        //    0    0:new             #2   <Class Keyframe$ObjectKeyframe>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:invokevirtual   #37  <Method float getFraction()>
        //    4    8:aload_0         
        //    5    9:getfield        #17  <Field Object mValue>
        //    6   12:invokespecial   #39  <Method void Keyframe$ObjectKeyframe(float, Object)>
        //    7   15:astore_1        
        //    8   16:aload_1         
        //    9   17:aload_0         
        //   10   18:invokevirtual   #43  <Method Interpolator getInterpolator()>
        //   11   21:invokevirtual   #47  <Method void setInterpolator(Interpolator)>
        //   12   24:aload_1         
        //   13   25:areturn         
        }

        public volatile Keyframe clone()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #50  <Method Keyframe$ObjectKeyframe clone()>
        //    2    4:areturn         
        }

        public Object getValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field Object mValue>
        //    2    4:areturn         
        }

        public void setValue(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field Object mValue>
        //    3    5:aload_1         
        //    4    6:ifnull          17
        //    5    9:iconst_1        
        //    6   10:istore_2        
        //    7   11:aload_0         
        //    8   12:iload_2         
        //    9   13:putfield        #21  <Field boolean mHasValue>
        //   10   16:return          
        //   11   17:iconst_0        
        //   12   18:istore_2        
        //   13   19:goto            11
        }

        Object mValue;
    }


    public Keyframe()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #20  <Field Interpolator mInterpolator>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #22  <Field boolean mHasValue>
    //    8   14:return          
    }

    public static Keyframe ofFloat(float f)
    {
    //    0    0:new             #26  <Class Keyframe$FloatKeyframe>
    //    1    3:dup             
    //    2    4:fload_0         
    //    3    5:invokespecial   #29  <Method void Keyframe$FloatKeyframe(float)>
    //    4    8:areturn         
    }

    public static Keyframe ofFloat(float f, float f1)
    {
    //    0    0:new             #26  <Class Keyframe$FloatKeyframe>
    //    1    3:dup             
    //    2    4:fload_0         
    //    3    5:fload_1         
    //    4    6:invokespecial   #33  <Method void Keyframe$FloatKeyframe(float, float)>
    //    5    9:areturn         
    }

    public static Keyframe ofInt(float f)
    {
    //    0    0:new             #36  <Class Keyframe$IntKeyframe>
    //    1    3:dup             
    //    2    4:fload_0         
    //    3    5:invokespecial   #37  <Method void Keyframe$IntKeyframe(float)>
    //    4    8:areturn         
    }

    public static Keyframe ofInt(float f, int i)
    {
    //    0    0:new             #36  <Class Keyframe$IntKeyframe>
    //    1    3:dup             
    //    2    4:fload_0         
    //    3    5:iload_1         
    //    4    6:invokespecial   #41  <Method void Keyframe$IntKeyframe(float, int)>
    //    5    9:areturn         
    }

    public static Keyframe ofObject(float f)
    {
    //    0    0:new             #44  <Class Keyframe$ObjectKeyframe>
    //    1    3:dup             
    //    2    4:fload_0         
    //    3    5:aconst_null     
    //    4    6:invokespecial   #47  <Method void Keyframe$ObjectKeyframe(float, Object)>
    //    5    9:areturn         
    }

    public static Keyframe ofObject(float f, Object obj)
    {
    //    0    0:new             #44  <Class Keyframe$ObjectKeyframe>
    //    1    3:dup             
    //    2    4:fload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #47  <Method void Keyframe$ObjectKeyframe(float, Object)>
    //    5    9:areturn         
    }

    public abstract Keyframe clone();

    public volatile Object clone()
        throws CloneNotSupportedException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #55  <Method Keyframe clone()>
    //    2    4:areturn         
    }

    public float getFraction()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field float mFraction>
    //    2    4:freturn         
    }

    public Interpolator getInterpolator()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field Interpolator mInterpolator>
    //    2    4:areturn         
    }

    public Class getType()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field Class mValueType>
    //    2    4:areturn         
    }

    public abstract Object getValue();

    public boolean hasValue()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #22  <Field boolean mHasValue>
    //    2    4:ireturn         
    }

    public void setFraction(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #59  <Field float mFraction>
    //    3    5:return          
    }

    public void setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #20  <Field Interpolator mInterpolator>
    //    3    5:return          
    }

    public abstract void setValue(Object obj);

    float mFraction;
    boolean mHasValue;
    private Interpolator mInterpolator;
    Class mValueType;
}
