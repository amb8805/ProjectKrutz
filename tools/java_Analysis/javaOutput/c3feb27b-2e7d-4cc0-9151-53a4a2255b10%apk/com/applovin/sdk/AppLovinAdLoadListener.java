package com.applovin.sdk;

public abstract interface AppLovinAdLoadListener
{
  public static final int EC_UNABLE_TO_RENDER_AD = -6;
  public static final int EC_UNKNOWN_ERROR = -1;

  public abstract void adReceived(AppLovinAd paramAppLovinAd);

  public abstract void failedToReceiveAd(int paramInt);
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinAdLoadListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
