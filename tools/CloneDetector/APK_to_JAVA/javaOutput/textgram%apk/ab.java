// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o, n, ak

public class ab
    implements o
{

    public ab()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d1, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #20  <Method n d.i()>
    //    2    4:getfield        #26  <Field com.google.ads.util.i$d n.c>
    //    3    7:invokevirtual   #31  <Method Object com.google.ads.util.i$d.a()>
    //    4   10:checkcast       #33  <Class Activity>
    //    5   13:ifnonnull       22
    //    6   16:ldc1            #35  <String "Activity was null while responding to touch gmsg.">
    //    7   18:invokestatic    #41  <Method void b.e(String)>
    //    8   21:return          
    //    9   22:aload_2         
    //   10   23:ldc1            #43  <String "tx">
    //   11   25:invokevirtual   #49  <Method Object HashMap.get(Object)>
    //   12   28:checkcast       #51  <Class String>
    //   13   31:astore          4
    //   14   33:aload_2         
    //   15   34:ldc1            #53  <String "ty">
    //   16   36:invokevirtual   #49  <Method Object HashMap.get(Object)>
    //   17   39:checkcast       #51  <Class String>
    //   18   42:astore          5
    //   19   44:aload_2         
    //   20   45:ldc1            #55  <String "td">
    //   21   47:invokevirtual   #49  <Method Object HashMap.get(Object)>
    //   22   50:checkcast       #51  <Class String>
    //   23   53:astore          6
    // try 55 91 handler(s) 108
    //   24   55:aload           4
    //   25   57:invokestatic    #61  <Method int Integer.parseInt(String)>
    //   26   60:istore          8
    //   27   62:aload           5
    //   28   64:invokestatic    #61  <Method int Integer.parseInt(String)>
    //   29   67:istore          9
    //   30   69:aload           6
    //   31   71:invokestatic    #61  <Method int Integer.parseInt(String)>
    //   32   74:istore          10
    //   33   76:aload_1         
    //   34   77:invokevirtual   #20  <Method n d.i()>
    //   35   80:getfield        #65  <Field com.google.ads.util.i$c n.r>
    //   36   83:invokevirtual   #68  <Method Object com.google.ads.util.i$c.a()>
    //   37   86:checkcast       #70  <Class ak>
    //   38   89:astore          11
    //   39   91:aload           11
    //   40   93:ifnull          21
    // try 96 107 handler(s) 108
    //   41   96:aload           11
    //   42   98:iload           8
    //   43  100:iload           9
    //   44  102:iload           10
    //   45  104:invokevirtual   #73  <Method void ak.a(int, int, int)>
    //   46  107:return          
    // catch NumberFormatException NumberFormatException
    //   47  108:astore          7
    //   48  110:ldc1            #75  <String "Could not parse touch parameters from gmsg.">
    //   49  112:invokestatic    #41  <Method void b.e(String)>
    //   50  115:return          
    }
}
