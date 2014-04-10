// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.view.View;
import com.google.ads.AdSize;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.AdWebView;
import com.google.ads.n;

public class IcsUtil
{
    public static class IcsAdWebView extends AdWebView
    {

        public IcsAdWebView(n n1, AdSize adsize)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #8   <Method void AdWebView(n, AdSize)>
        //    4    6:return          
        }

        public boolean canScrollHorizontally(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field n a>
        //    2    4:getfield        #20  <Field i$b n.e>
        //    3    7:invokevirtual   #25  <Method Object i$b.a()>
        //    4   10:ifnull          36
        //    5   13:aload_0         
        //    6   14:getfield        #14  <Field n a>
        //    7   17:getfield        #20  <Field i$b n.e>
        //    8   20:invokevirtual   #25  <Method Object i$b.a()>
        //    9   23:checkcast       #27  <Class ActivationOverlay>
        //   10   26:invokevirtual   #31  <Method boolean ActivationOverlay.b()>
        //   11   29:ifne            34
        //   12   32:iconst_1        
        //   13   33:ireturn         
        //   14   34:iconst_0        
        //   15   35:ireturn         
        //   16   36:aload_0         
        //   17   37:iload_1         
        //   18   38:invokespecial   #33  <Method boolean AdWebView.canScrollHorizontally(int)>
        //   19   41:ireturn         
        }

        public boolean canScrollVertically(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field n a>
        //    2    4:getfield        #20  <Field i$b n.e>
        //    3    7:invokevirtual   #25  <Method Object i$b.a()>
        //    4   10:ifnull          36
        //    5   13:aload_0         
        //    6   14:getfield        #14  <Field n a>
        //    7   17:getfield        #20  <Field i$b n.e>
        //    8   20:invokevirtual   #25  <Method Object i$b.a()>
        //    9   23:checkcast       #27  <Class ActivationOverlay>
        //   10   26:invokevirtual   #31  <Method boolean ActivationOverlay.b()>
        //   11   29:ifne            34
        //   12   32:iconst_1        
        //   13   33:ireturn         
        //   14   34:iconst_0        
        //   15   35:ireturn         
        //   16   36:aload_0         
        //   17   37:iload_1         
        //   18   38:invokespecial   #36  <Method boolean AdWebView.canScrollVertically(int)>
        //   19   41:ireturn         
        }
    }

    public static class a extends g.a
    {

        public a(n n)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #8   <Method void g$a(n)>
        //    3    5:return          
        }

        public void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
        //    0    0:aload_3         
        //    1    1:invokeinterface #16  <Method void android.webkit.WebChromeClient$CustomViewCallback.onCustomViewHidden()>
        //    2    6:return          
        }
    }

}
