// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.doubleclick;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.AdSize;
import com.google.ads.SwipeableAdListener;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.d;
import com.google.ads.n;

// Referenced classes of package com.google.ads.doubleclick:
//            DfpAdView

public class SwipeableDfpAdView extends DfpAdView
{

    public SwipeableDfpAdView(Activity activity, AdSize adsize, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #8   <Method void DfpAdView(Activity, AdSize, String)>
    //    5    7:return          
    }

    public SwipeableDfpAdView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #11  <Method void DfpAdView(Context, AttributeSet)>
    //    4    6:return          
    }

    public SwipeableDfpAdView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #14  <Method void DfpAdView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public void resize(AdSize adsize)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #18  <Method void DfpAdView.resize(AdSize)>
    //    3    5:aload_0         
    //    4    6:getfield        #22  <Field d a>
    //    5    9:invokevirtual   #28  <Method n d.i()>
    //    6   12:getfield        #34  <Field com.google.ads.util.i$b n.e>
    //    7   15:invokevirtual   #39  <Method Object com.google.ads.util.i$b.a()>
    //    8   18:checkcast       #41  <Class ActivationOverlay>
    //    9   21:invokevirtual   #45  <Method boolean ActivationOverlay.b()>
    //   10   24:ifeq            44
    //   11   27:aload_0         
    //   12   28:getfield        #22  <Field d a>
    //   13   31:iconst_m1       
    //   14   32:iconst_m1       
    //   15   33:aload_1         
    //   16   34:invokevirtual   #51  <Method int AdSize.getWidth()>
    //   17   37:aload_1         
    //   18   38:invokevirtual   #54  <Method int AdSize.getHeight()>
    //   19   41:invokevirtual   #57  <Method void d.a(int, int, int, int)>
    //   20   44:return          
    }

    public void setSwipeableEventListener(SwipeableAdListener swipeableadlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #61  <Method void DfpAdView.setSwipeableEventListener(SwipeableAdListener)>
    //    3    5:return          
    }
}
