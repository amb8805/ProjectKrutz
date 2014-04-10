// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o, ae, n

public class u
    implements o
{

    public u()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d1, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #14  <String "u">
    //    2    3:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #22  <Class String>
    //    4    9:astore          4
    //    5   11:aload           4
    //    6   13:invokestatic    #28  <Method boolean TextUtils.isEmpty(CharSequence)>
    //    7   16:ifeq            25
    //    8   19:ldc1            #30  <String "Could not get URL from track gmsg.">
    //    9   21:invokestatic    #36  <Method void b.e(String)>
    //   10   24:return          
    //   11   25:new             #38  <Class Thread>
    //   12   28:dup             
    //   13   29:new             #40  <Class ae>
    //   14   32:dup             
    //   15   33:aload           4
    //   16   35:aload_1         
    //   17   36:invokevirtual   #46  <Method n d.i()>
    //   18   39:getfield        #52  <Field com.google.ads.util.i$b n.f>
    //   19   42:invokevirtual   #57  <Method Object com.google.ads.util.i$b.a()>
    //   20   45:checkcast       #59  <Class Context>
    //   21   48:invokespecial   #62  <Method void ae(String, Context)>
    //   22   51:invokespecial   #65  <Method void Thread(Runnable)>
    //   23   54:invokevirtual   #68  <Method void Thread.start()>
    //   24   57:return          
    }
}
