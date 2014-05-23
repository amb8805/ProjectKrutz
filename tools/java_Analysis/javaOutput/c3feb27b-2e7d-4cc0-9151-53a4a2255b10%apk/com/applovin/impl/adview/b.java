package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinLogger;

class b
  implements Runnable
{
  b(AdViewControllerImpl paramAdViewControllerImpl, AppLovinAd paramAppLovinAd)
  {
  }

  public void run()
  {
    try
    {
      if (AdViewControllerImpl.b(this.b) != null)
        AdViewControllerImpl.b(this.b).adReceived(this.a);
      return;
    }
    catch (Throwable localThrowable)
    {
      AdViewControllerImpl.c(this.b).userError("AppLovinSdk", "Exception while running app load callback: " + localThrowable.getMessage());
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
