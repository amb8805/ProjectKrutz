package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinLogger;

class h
  implements Runnable
{
  private final AppLovinAd b;

  public h(AdViewControllerImpl paramAdViewControllerImpl, AppLovinAd paramAppLovinAd)
  {
    this.b = paramAppLovinAd;
  }

  public void run()
  {
    AppLovinAdClickListener localAppLovinAdClickListener = AdViewControllerImpl.i(this.a);
    if ((localAppLovinAdClickListener != null) && (this.b != null));
    try
    {
      localAppLovinAdClickListener.adClicked(this.b);
      if (AdViewControllerImpl.a(this.a) != null)
        AdViewControllerImpl.a(this.a).destroyVideoOverlay();
      return;
    }
    catch (Throwable localThrowable)
    {
      AdViewControllerImpl.c(this.a).userError("AppLovinAdView", "Exception while notifying ad click listener", localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
