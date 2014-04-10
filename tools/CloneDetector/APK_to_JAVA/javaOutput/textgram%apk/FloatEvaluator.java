// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            TypeEvaluator

public class FloatEvaluator
    implements TypeEvaluator
{

    public FloatEvaluator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Object()>
    //    2    4:return          
    }

    public Float evaluate(float f, Number number, Number number1)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #19  <Method float Number.floatValue()>
    //    2    4:fstore          4
    //    3    6:fload           4
    //    4    8:fload_1         
    //    5    9:aload_3         
    //    6   10:invokevirtual   #19  <Method float Number.floatValue()>
    //    7   13:fload           4
    //    8   15:fsub            
    //    9   16:fmul            
    //   10   17:fadd            
    //   11   18:invokestatic    #25  <Method Float Float.valueOf(float)>
    //   12   21:areturn         
    }

    public volatile Object evaluate(float f, Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:aload_2         
    //    3    3:checkcast       #15  <Class Number>
    //    4    6:aload_3         
    //    5    7:checkcast       #15  <Class Number>
    //    6   10:invokevirtual   #28  <Method Float evaluate(float, Number, Number)>
    //    7   13:areturn         
    }
}
