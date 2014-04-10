// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.doubleclick;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.*;
import com.google.ads.internal.*;
import com.google.ads.n;

public class DfpAdView extends AdView
{

    public DfpAdView(Activity activity, AdSize adsize, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #8   <Method void AdView(Activity, AdSize, String)>
    //    5    7:return          
    }

    public DfpAdView(Activity activity, AdSize aadsize[], String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #11  <Method void AdView(Activity, AdSize[], String)>
    //    5    7:return          
    }

    public DfpAdView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #14  <Method void AdView(Context, AttributeSet)>
    //    4    6:return          
    }

    public DfpAdView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #17  <Method void AdView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public void enableManualImpressions(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #29  <Method n d.i()>
    //    3    7:getfield        #35  <Field com.google.ads.util.i$c n.t>
    //    4   10:iload_1         
    //    5   11:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
    //    6   14:invokevirtual   #46  <Method void com.google.ads.util.i$c.a(Object)>
    //    7   17:return          
    }

    public void recordImpression()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #51  <Method void d.z()>
    //    3    7:return          
    }

    public void resize(AdSize adsize)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field d a>
    //    2    4:invokevirtual   #57  <Method AdWebView d.l()>
    //    3    7:aload_1         
    //    4    8:invokevirtual   #62  <Method void AdWebView.setAdSize(AdSize)>
    //    5   11:aload_0         
    //    6   12:getfield        #23  <Field d a>
    //    7   15:invokevirtual   #29  <Method n d.i()>
    //    8   18:getfield        #66  <Field com.google.ads.util.i$b n.g>
    //    9   21:invokevirtual   #71  <Method Object com.google.ads.util.i$b.a()>
    //   10   24:checkcast       #73  <Class h>
    //   11   27:aload_1         
    //   12   28:invokevirtual   #76  <Method void h.b(AdSize)>
    //   13   31:return          
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #80  <Method void AdView.setAppEventListener(AppEventListener)>
    //    3    5:return          
    }

    public transient void setSupportedAdSizes(AdSize aadsize[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #84  <Method void AdView.setSupportedAdSizes(AdSize[])>
    //    3    5:return          
    }
}
