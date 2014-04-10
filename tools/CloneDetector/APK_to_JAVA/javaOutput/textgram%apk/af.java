// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.lang.ref.WeakReference;

public class af
    implements Runnable
{

    public af(d d1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #16  <Class WeakReference>
    //    4    8:dup             
    //    5    9:aload_1         
    //    6   10:invokespecial   #19  <Method void WeakReference(Object)>
    //    7   13:putfield        #21  <Field WeakReference a>
    //    8   16:return          
    }

    public void run()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field WeakReference a>
    //    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
    //    3    7:checkcast       #28  <Class d>
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:ifnonnull       21
    //    7   15:ldc1            #30  <String "The ad must be gone, so cancelling the refresh timer.">
    //    8   17:invokestatic    #35  <Method void b.a(String)>
    //    9   20:return          
    //   10   21:aload_1         
    //   11   22:invokevirtual   #38  <Method void d.A()>
    //   12   25:return          
    }

    private WeakReference a;
}
