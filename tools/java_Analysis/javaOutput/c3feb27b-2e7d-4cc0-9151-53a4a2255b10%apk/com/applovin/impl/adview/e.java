package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

class e
  implements AppLovinAdDisplayListener
{
  e(AdViewControllerImpl paramAdViewControllerImpl)
  {
  }

  public void adDisplayed(AppLovinAd paramAppLovinAd)
  {
  }

  public void adHidden(AppLovinAd paramAppLovinAd)
  {
    if (AdViewControllerImpl.h(this.a) != null)
      AdViewControllerImpl.h(this.a).adHidden(paramAppLovinAd);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
