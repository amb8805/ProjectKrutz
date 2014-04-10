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

public class y
    implements o
{

    public y()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #14  <String "string">
    //    2    3:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #22  <Class String>
    //    4    9:astore          4
    //    5   11:aload_2         
    //    6   12:ldc1            #24  <String "afma_notify_dt">
    //    7   14:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    8   17:checkcast       #22  <Class String>
    //    9   20:astore          5
    //   10   22:new             #26  <Class StringBuilder>
    //   11   25:dup             
    //   12   26:invokespecial   #27  <Method void StringBuilder()>
    //   13   29:ldc1            #29  <String "Received log message: <\"string\": \"">
    //   14   31:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   15   34:aload           4
    //   16   36:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   17   39:ldc1            #35  <String "\", \"afmaNotifyDt\": \"">
    //   18   41:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   19   44:aload           5
    //   20   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   21   49:ldc1            #37  <String "\">">
    //   22   51:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   23   54:invokevirtual   #41  <Method String StringBuilder.toString()>
    //   24   57:invokestatic    #47  <Method void b.c(String)>
    //   25   60:return          
    }
}
