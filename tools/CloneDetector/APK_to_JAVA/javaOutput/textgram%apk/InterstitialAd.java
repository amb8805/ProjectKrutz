// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.app.Activity;
import com.google.ads.internal.d;

// Referenced classes of package com.google.ads:
//            Ad, n, AdRequest, AdListener, 
//            AppEventListener

public class InterstitialAd
    implements Ad
{

    public InterstitialAd(Activity activity, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #13  <Method void InterstitialAd(Activity, String, boolean)>
    //    5    7:return          
    }

    public InterstitialAd(Activity activity, String s, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #18  <Class d>
    //    4    8:dup             
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:aconst_null     
    //    8   12:aload_2         
    //    9   13:aconst_null     
    //   10   14:iload_3         
    //   11   15:invokespecial   #21  <Method void d(Ad, Activity, AdSize, String, android.view.ViewGroup, boolean)>
    //   12   18:putfield        #23  <Field d a>
    //   13   21:return          
    }

    public boolean isReady()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #28  <Method boolean d.s()>
    //    3    7:ireturn         
    }

    public void loadAd(AdRequest adrequest)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #32  <Method void d.a(AdRequest)>
    //    4    8:return          
    }

    public void setAdListener(AdListener adlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #38  <Method n d.i()>
    //    3    7:getfield        #44  <Field com.google.ads.util.i$c n.o>
    //    4   10:aload_1         
    //    5   11:invokevirtual   #49  <Method void com.google.ads.util.i$c.a(Object)>
    //    6   14:return          
    }

    protected void setAppEventListener(AppEventListener appeventlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #38  <Method n d.i()>
    //    3    7:getfield        #54  <Field com.google.ads.util.i$c n.p>
    //    4   10:aload_1         
    //    5   11:invokevirtual   #49  <Method void com.google.ads.util.i$c.a(Object)>
    //    6   14:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #58  <Method void d.B()>
    //    3    7:return          
    }

    public void stopLoading()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #62  <Method void d.C()>
    //    3    7:return          
    }

    private d a;
}
