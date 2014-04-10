// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public class CustomEventExtras
    implements NetworkExtras
{

    public CustomEventExtras()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #13  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #15  <Class HashMap>
    //    4    8:dup             
    //    5    9:invokespecial   #16  <Method void HashMap()>
    //    6   12:putfield        #18  <Field HashMap a>
    //    7   15:return          
    }

    public CustomEventExtras addExtra(String s, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap a>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
    //    5    9:pop             
    //    6   10:aload_0         
    //    7   11:areturn         
    }

    public CustomEventExtras clearExtras()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap a>
    //    2    4:invokevirtual   #29  <Method void HashMap.clear()>
    //    3    7:aload_0         
    //    4    8:areturn         
    }

    public Object getExtra(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap a>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #35  <Method Object HashMap.get(Object)>
    //    4    8:areturn         
    }

    public Object removeExtra(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field HashMap a>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #39  <Method Object HashMap.remove(Object)>
    //    4    8:areturn         
    }

    private final HashMap a;
}
