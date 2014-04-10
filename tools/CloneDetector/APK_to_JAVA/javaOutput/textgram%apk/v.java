// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.c;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o

public class v
    implements o
{

    public v()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d1, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #14  <String "type">
    //    2    3:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #22  <Class String>
    //    4    9:astore          4
    //    5   11:aload_2         
    //    6   12:ldc1            #24  <String "errors">
    //    7   14:invokevirtual   #20  <Method Object HashMap.get(Object)>
    //    8   17:checkcast       #22  <Class String>
    //    9   20:astore          5
    //   10   22:new             #26  <Class StringBuilder>
    //   11   25:dup             
    //   12   26:invokespecial   #27  <Method void StringBuilder()>
    //   13   29:ldc1            #29  <String "Invalid ">
    //   14   31:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   15   34:aload           4
    //   16   36:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   17   39:ldc1            #35  <String " request error: ">
    //   18   41:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   19   44:aload           5
    //   20   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
    //   21   49:invokevirtual   #39  <Method String StringBuilder.toString()>
    //   22   52:invokestatic    #45  <Method void b.e(String)>
    //   23   55:aload_1         
    //   24   56:invokevirtual   #51  <Method c d.k()>
    //   25   59:astore          6
    //   26   61:aload           6
    //   27   63:ifnull          74
    //   28   66:aload           6
    //   29   68:getstatic       #57  <Field AdRequest$ErrorCode AdRequest$ErrorCode.INVALID_REQUEST>
    //   30   71:invokevirtual   #62  <Method void c.a(AdRequest$ErrorCode)>
    //   31   74:return          
    }
}
