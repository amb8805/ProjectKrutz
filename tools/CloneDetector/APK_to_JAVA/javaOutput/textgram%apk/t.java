// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o

public class t
    implements o
{

    public t()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_3         
    //    1    1:instanceof      #14  <Class AdWebView>
    //    2    4:ifeq            26
    //    3    7:aload_3         
    //    4    8:checkcast       #14  <Class AdWebView>
    //    5   11:ldc1            #16  <String "1">
    //    6   13:aload_2         
    //    7   14:ldc1            #18  <String "custom_close">
    //    8   16:invokevirtual   #24  <Method Object HashMap.get(Object)>
    //    9   19:invokevirtual   #30  <Method boolean String.equals(Object)>
    //   10   22:invokevirtual   #34  <Method void AdWebView.setCustomClose(boolean)>
    //   11   25:return          
    //   12   26:ldc1            #36  <String "Trying to set a custom close icon on a WebView that isn't an AdWebView">
    //   13   28:invokestatic    #42  <Method void b.b(String)>
    //   14   31:return          
    }
}
