package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinLogger;

class c
  implements Runnable
{
  c(AdViewControllerImpl paramAdViewControllerImpl, int paramInt)
  {
  }

  public void run()
  {
    try
    {
      if (AdViewControllerImpl.b(this.b) != null)
        AdViewControllerImpl.b(this.b).failedToReceiveAd(this.a);
      return;
    }
    catch (Throwable localThrowable)
    {
      AdViewControllerImpl.c(this.b).userError("AppLovinAdView", "Exception while running app load  callback", localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
