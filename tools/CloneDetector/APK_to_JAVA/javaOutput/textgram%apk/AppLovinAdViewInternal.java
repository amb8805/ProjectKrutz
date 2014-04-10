// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

// Referenced classes of package com.applovin.impl.adview:
//            AdViewControllerImpl, AdViewControllerJsInterface

public class AppLovinAdViewInternal extends AppLovinAdView
{

    public AppLovinAdViewInternal(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #8   <Method void AppLovinAdView(Context, AttributeSet)>
    //    4    6:return          
    }

    public AppLovinAdViewInternal(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #11  <Method void AppLovinAdView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public AppLovinAdViewInternal(AppLovinAdSize applovinadsize, Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #14  <Method void AppLovinAdView(AppLovinAdSize, Activity)>
    //    4    6:return          
    }

    public AppLovinAdViewInternal(AppLovinSdk applovinsdk, AppLovinAdSize applovinadsize, Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #17  <Method void AppLovinAdView(AppLovinSdk, AppLovinAdSize, Activity)>
    //    5    7:return          
    }

    public AdViewControllerJsInterface getAdViewControllerJsInterface()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field com.applovin.adview.AdViewController controller>
    //    2    4:checkcast       #25  <Class AdViewControllerImpl>
    //    3    7:invokevirtual   #28  <Method AdViewControllerJsInterface AdViewControllerImpl.a()>
    //    4   10:areturn         
    }
}
