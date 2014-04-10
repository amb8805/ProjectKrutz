// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;


// Referenced classes of package com.applovin.sdk:
//            AppLovinAd

public interface AppLovinAdVideoPlaybackListener
{

    public abstract void videoPlaybackBegan(AppLovinAd applovinad);

    public abstract void videoPlaybackEnded(AppLovinAd applovinad, double d, boolean flag);
}
