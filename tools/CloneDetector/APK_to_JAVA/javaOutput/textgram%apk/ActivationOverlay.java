// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.internal;

import android.os.Handler;
import com.google.ads.*;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;

// Referenced classes of package com.google.ads.internal:
//            AdWebView, d, a, i

public class ActivationOverlay extends AdWebView
{

    public ActivationOverlay(n n1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #17  <Method void AdWebView(n, com.google.ads.AdSize)>
    //    4    6:aload_0         
    //    5    7:iconst_1        
    //    6    8:putfield        #19  <Field boolean b>
    //    7   11:aload_0         
    //    8   12:iconst_1        
    //    9   13:putfield        #21  <Field boolean c>
    //   10   16:aload_0         
    //   11   17:iconst_0        
    //   12   18:putfield        #23  <Field int d>
    //   13   21:aload_0         
    //   14   22:iconst_0        
    //   15   23:putfield        #25  <Field int e>
    //   16   26:aload_1         
    //   17   27:getfield        #30  <Field com.google.ads.util.i$b n.d>
    //   18   30:invokevirtual   #36  <Method Object com.google.ads.util.i$b.a()>
    //   19   33:checkcast       #38  <Class m>
    //   20   36:getfield        #40  <Field com.google.ads.util.i$b m.b>
    //   21   39:invokevirtual   #36  <Method Object com.google.ads.util.i$b.a()>
    //   22   42:checkcast       #42  <Class com.google.ads.m$a>
    //   23   45:astore_2        
    //   24   46:getstatic       #46  <Field int AdUtil.a>
    //   25   49:aload_2         
    //   26   50:getfield        #49  <Field com.google.ads.util.i$c com.google.ads.m$a.c>
    //   27   53:invokevirtual   #52  <Method Object com.google.ads.util.i$c.a()>
    //   28   56:checkcast       #54  <Class Integer>
    //   29   59:invokevirtual   #58  <Method int Integer.intValue()>
    //   30   62:icmpge          74
    //   31   65:ldc1            #60  <String "Disabling hardware acceleration for an activation overlay.">
    //   32   67:invokestatic    #65  <Method void b.a(String)>
    //   33   70:aload_0         
    //   34   71:invokevirtual   #69  <Method void g()>
    //   35   74:aload_0         
    //   36   75:aload_1         
    //   37   76:getfield        #70  <Field com.google.ads.util.i$b n.b>
    //   38   79:invokevirtual   #36  <Method Object com.google.ads.util.i$b.a()>
    //   39   82:checkcast       #72  <Class d>
    //   40   85:getstatic       #77  <Field java.util.Map a.c>
    //   41   88:iconst_1        
    //   42   89:iconst_1        
    //   43   90:invokestatic    #82  <Method i i.a(d, java.util.Map, boolean, boolean)>
    //   44   93:putfield        #84  <Field i f>
    //   45   96:aload_0         
    //   46   97:aload_0         
    //   47   98:getfield        #84  <Field i f>
    //   48  101:invokevirtual   #88  <Method void setWebViewClient(android.webkit.WebViewClient)>
    //   49  104:return          
    }

    public boolean a()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #19  <Field boolean b>
    //    2    4:ireturn         
    }

    public boolean b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field boolean c>
    //    2    4:ireturn         
    }

    public int c()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field int e>
    //    2    4:ireturn         
    }

    public boolean canScrollHorizontally(int j)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean canScrollVertically(int j)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public int d()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field int d>
    //    2    4:ireturn         
    }

    public i e()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #84  <Field i f>
    //    2    4:areturn         
    }

    public void setOverlayActivated(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #21  <Field boolean c>
    //    3    5:return          
    }

    public void setOverlayEnabled(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifne            29
    //    2    4:invokestatic    #99  <Method m m.a()>
    //    3    7:getfield        #101 <Field com.google.ads.util.i$b m.c>
    //    4   10:invokevirtual   #36  <Method Object com.google.ads.util.i$b.a()>
    //    5   13:checkcast       #103 <Class Handler>
    //    6   16:new             #105 <Class ActivationOverlay$1>
    //    7   19:dup             
    //    8   20:aload_0         
    //    9   21:aload_0         
    //   10   22:invokespecial   #108 <Method void ActivationOverlay$1(ActivationOverlay, ActivationOverlay)>
    //   11   25:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:iload_1         
    //   15   31:putfield        #19  <Field boolean b>
    //   16   34:return          
    }

    public void setXPosition(int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #23  <Field int d>
    //    3    5:return          
    }

    public void setYPosition(int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #25  <Field int e>
    //    3    5:return          
    }

    private volatile boolean b;
    private boolean c;
    private int d;
    private int e;
    private final i f;

    // Unreferenced inner class com/google/ads/internal/ActivationOverlay$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1(ActivationOverlay activationoverlay, ActivationOverlay activationoverlay1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field ActivationOverlay b>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field ActivationOverlay a>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field ActivationOverlay b>
        //    2    4:getfield        #27  <Field n ActivationOverlay.a>
        //    3    7:getfield        #33  <Field com.google.ads.util.i$b n.j>
        //    4   10:invokevirtual   #38  <Method Object com.google.ads.util.i$b.a()>
        //    5   13:checkcast       #40  <Class AdView>
        //    6   16:aload_0         
        //    7   17:getfield        #20  <Field ActivationOverlay a>
        //    8   20:invokevirtual   #44  <Method void AdView.removeView(android.view.View)>
        //    9   23:return          
        }

        final ActivationOverlay a;
        final ActivationOverlay b;
    }

}
