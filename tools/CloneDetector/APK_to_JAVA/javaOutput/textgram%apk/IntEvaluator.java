// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            TypeEvaluator

public class IntEvaluator
    implements TypeEvaluator
{

    public IntEvaluator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Object()>
    //    2    4:return          
    }

    public Integer evaluate(float f, Integer integer, Integer integer1)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #19  <Method int Integer.intValue()>
    //    2    4:istore          4
    //    3    6:iload           4
    //    4    8:i2f             
    //    5    9:fload_1         
    //    6   10:aload_3         
    //    7   11:invokevirtual   #19  <Method int Integer.intValue()>
    //    8   14:iload           4
    //    9   16:isub            
    //   10   17:i2f             
    //   11   18:fmul            
    //   12   19:fadd            
    //   13   20:f2i             
    //   14   21:invokestatic    #23  <Method Integer Integer.valueOf(int)>
    //   15   24:areturn         
    }

    public volatile Object evaluate(float f, Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:aload_2         
    //    3    3:checkcast       #15  <Class Integer>
    //    4    6:aload_3         
    //    5    7:checkcast       #15  <Class Integer>
    //    6   10:invokevirtual   #26  <Method Integer evaluate(float, Integer, Integer)>
    //    7   13:areturn         
    }
}
