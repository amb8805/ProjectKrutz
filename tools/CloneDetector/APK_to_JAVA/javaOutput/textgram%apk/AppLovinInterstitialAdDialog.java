// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.adview;

import com.applovin.sdk.*;

public interface AppLovinInterstitialAdDialog
{

    public abstract void dismiss();

    public abstract boolean isShowing();

    public abstract void setAdClickListener(AppLovinAdClickListener applovinadclicklistener);

    public abstract void setAdDisplayListener(AppLovinAdDisplayListener applovinaddisplaylistener);

    public abstract void setAdLoadListener(AppLovinAdLoadListener applovinadloadlistener);

    public abstract void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener);

    public abstract void show();

    public abstract void showAndRender(AppLovinAd applovinad);
}
