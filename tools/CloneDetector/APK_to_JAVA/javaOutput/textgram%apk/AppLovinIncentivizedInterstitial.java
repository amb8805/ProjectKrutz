// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.adview;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.*;

public class AppLovinIncentivizedInterstitial
{

    public AppLovinIncentivizedInterstitial(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #14  <Method AppLovinSdk AppLovinSdk.getInstance(Context)>
    //    3    5:invokespecial   #17  <Method void AppLovinIncentivizedInterstitial(AppLovinSdk)>
    //    4    8:return          
    }

    public AppLovinIncentivizedInterstitial(AppLovinSdk applovinsdk)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void Object()>
    //    2    4:aload_1         
    //    3    5:ifnonnull       18
    //    4    8:new             #22  <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:ldc1            #24  <String "SDK cannot be null">
    //    7   14:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //    8   17:athrow          
    //    9   18:aload_0         
    //   10   19:new             #29  <Class t>
    //   11   22:dup             
    //   12   23:aload_1         
    //   13   24:invokespecial   #30  <Method void t(AppLovinSdk)>
    //   14   27:putfield        #32  <Field t a>
    //   15   30:return          
    }

    public static AppLovinIncentivizedInterstitial create(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #14  <Method AppLovinSdk AppLovinSdk.getInstance(Context)>
    //    2    4:invokestatic    #37  <Method AppLovinIncentivizedInterstitial create(AppLovinSdk)>
    //    3    7:areturn         
    }

    public static AppLovinIncentivizedInterstitial create(AppLovinSdk applovinsdk)
    {
    //    0    0:new             #2   <Class AppLovinIncentivizedInterstitial>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #17  <Method void AppLovinIncentivizedInterstitial(AppLovinSdk)>
    //    4    8:areturn         
    }

    public void preload(AppLovinAdLoadListener applovinadloadlistener)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #22  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #41  <String "AppLovinAdLoadListener must not be null when preloading incentivized interstitials.">
    //    5   10:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:getfield        #32  <Field t a>
    //    9   18:aload_1         
    //   10   19:invokevirtual   #43  <Method void t.a(AppLovinAdLoadListener)>
    //   11   22:return          
    }

    public void show(Activity activity, AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aconst_null     
    //    4    4:invokevirtual   #48  <Method void show(Activity, AppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener)>
    //    5    7:return          
    }

    public void show(Activity activity, AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener, AppLovinAdDisplayListener applovinaddisplaylistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:aconst_null     
    //    5    5:invokevirtual   #51  <Method void show(Activity, AppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener, AppLovinAdClickListener)>
    //    6    8:return          
    }

    public void show(Activity activity, AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener, AppLovinAdDisplayListener applovinaddisplaylistener, AppLovinAdClickListener applovinadclicklistener)
    {
    //    0    0:aload_2         
    //    1    1:ifnonnull       14
    //    2    4:new             #22  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #53  <String "AppLovinAdVideoPlaybackLister must not be null when showing an AppLovinIncentivizedInterstitial.">
    //    5   10:invokespecial   #27  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:getfield        #32  <Field t a>
    //    9   18:aload_1         
    //   10   19:aload_2         
    //   11   20:aload_3         
    //   12   21:aload           4
    //   13   23:invokevirtual   #55  <Method void t.a(Activity, AppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener, AppLovinAdClickListener)>
    //   14   26:return          
    }

    private t a;
}
