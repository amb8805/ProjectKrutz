package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

class d
  implements AppLovinAdClickListener
{
  d(AdViewControllerImpl paramAdViewControllerImpl)
  {
  }

  public void adClicked(AppLovinAd paramAppLovinAd)
  {
    if (AdViewControllerImpl.i(this.a) != null)
      AdViewControllerImpl.i(this.a).adClicked(paramAppLovinAd);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
