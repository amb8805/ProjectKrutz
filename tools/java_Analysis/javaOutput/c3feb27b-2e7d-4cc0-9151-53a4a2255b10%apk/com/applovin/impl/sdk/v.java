package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;

class v
  implements AppLovinAdLoadListener
{
  private AppLovinAdLoadListener b;

  v(t paramt, AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    this.b = paramAppLovinAdLoadListener;
  }

  public void adReceived(AppLovinAd paramAppLovinAd)
  {
    t.a(this.a, paramAppLovinAd);
    if (this.b != null)
      this.b.adReceived(paramAppLovinAd);
  }

  public void failedToReceiveAd(int paramInt)
  {
    if (this.b != null)
      this.b.failedToReceiveAd(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
