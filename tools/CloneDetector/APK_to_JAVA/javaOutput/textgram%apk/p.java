// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o

public class p
    implements o
{

    public p()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d1, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #14  <String "name">
    //    2    3:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #22  <Class String>
    //    4    9:astore          4
    //    5   11:aload           4
    //    6   13:ifnonnull       22
    //    7   16:ldc1            #24  <String "Error: App event with no name parameter.">
    //    8   18:invokestatic    #30  <Method void b.b(String)>
    //    9   21:return          
    //   10   22:aload_1         
    //   11   23:aload           4
    //   12   25:aload_2         
    //   13   26:ldc1            #32  <String "info">
    //   14   28:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //   15   31:checkcast       #22  <Class String>
    //   16   34:invokevirtual   #37  <Method void d.a(String, String)>
    //   17   37:return          
    }
}
