// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.util;


// Referenced classes of package com.nineoldandroids.util:
//            ReflectiveProperty

public abstract class Property
{

    public Property(Class class1, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_2         
    //    4    6:putfield        #17  <Field String mName>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #19  <Field Class mType>
    //    8   14:return          
    }

    public static Property of(Class class1, Class class2, String s)
    {
    //    0    0:new             #23  <Class ReflectiveProperty>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:aload_2         
    //    5    7:invokespecial   #26  <Method void ReflectiveProperty(Class, Class, String)>
    //    6   10:areturn         
    }

    public abstract Object get(Object obj);

    public String getName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field String mName>
    //    2    4:areturn         
    }

    public Class getType()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field Class mType>
    //    2    4:areturn         
    }

    public boolean isReadOnly()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void set(Object obj, Object obj1)
    {
    //    0    0:new             #38  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:new             #40  <Class StringBuilder>
    //    3    7:dup             
    //    4    8:ldc1            #42  <String "Property ">
    //    5   10:invokespecial   #45  <Method void StringBuilder(String)>
    //    6   13:aload_0         
    //    7   14:invokevirtual   #47  <Method String getName()>
    //    8   17:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
    //    9   20:ldc1            #53  <String " is read-only">
    //   10   22:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
    //   11   25:invokevirtual   #56  <Method String StringBuilder.toString()>
    //   12   28:invokespecial   #57  <Method void UnsupportedOperationException(String)>
    //   13   31:athrow          
    }

    private final String mName;
    private final Class mType;
}
