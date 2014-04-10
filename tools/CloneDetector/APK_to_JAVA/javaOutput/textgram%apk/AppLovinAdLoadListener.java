// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;


// Referenced classes of package com.applovin.sdk:
//            AppLovinAd

public interface AppLovinAdLoadListener
{

    public abstract void adReceived(AppLovinAd applovinad);

    public abstract void failedToReceiveAd(int i);

    public static final int EC_UNABLE_TO_RENDER_AD = -6;
    public static final int EC_UNKNOWN_ERROR = -1;
}
