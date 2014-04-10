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

public class s
    implements o
{

    public s()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:return          
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_3         
    //    1    1:instanceof      #14  <Class AdWebView>
    //    2    4:ifeq            15
    //    3    7:aload_3         
    //    4    8:checkcast       #14  <Class AdWebView>
    //    5   11:invokevirtual   #17  <Method void AdWebView.f()>
    //    6   14:return          
    //    7   15:ldc1            #19  <String "Trying to close WebView that isn't an AdWebView">
    //    8   17:invokestatic    #25  <Method void b.b(String)>
    //    9   20:return          
    }
}
