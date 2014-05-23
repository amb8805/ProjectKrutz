package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinLogger;

class i
  implements Runnable
{
  private final AppLovinAd b;

  public i(AdViewControllerImpl paramAdViewControllerImpl, AppLovinAd paramAppLovinAd)
  {
    this.b = paramAppLovinAd;
  }

  public void run()
  {
    AppLovinAdDisplayListener localAppLovinAdDisplayListener = AdViewControllerImpl.h(this.a);
    if ((localAppLovinAdDisplayListener != null) && (this.b != null));
    try
    {
      localAppLovinAdDisplayListener.adHidden(this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      AdViewControllerImpl.c(this.a).userError("AppLovinAdView", "Exception while notifying ad display listener", localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
