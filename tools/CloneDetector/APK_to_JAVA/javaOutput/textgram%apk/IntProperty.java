// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.util;


// Referenced classes of package com.nineoldandroids.util:
//            Property

public abstract class IntProperty extends Property
{

    public IntProperty(String s)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #9   <Class Integer>
    //    2    3:aload_1         
    //    3    4:invokespecial   #12  <Method void Property(Class, String)>
    //    4    7:return          
    }

    public final void set(Object obj, Integer integer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #18  <Method int Integer.intValue()>
    //    4    6:invokestatic    #22  <Method Integer Integer.valueOf(int)>
    //    5    9:invokevirtual   #24  <Method void set(Object, Integer)>
    //    6   12:return          
    }

    public volatile void set(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:checkcast       #27  <Class Object>
    //    3    5:aload_2         
    //    4    6:checkcast       #9   <Class Integer>
    //    5    9:invokevirtual   #24  <Method void set(Object, Integer)>
    //    6   12:return          
    }

    public abstract void setValue(Object obj, int i);
}
