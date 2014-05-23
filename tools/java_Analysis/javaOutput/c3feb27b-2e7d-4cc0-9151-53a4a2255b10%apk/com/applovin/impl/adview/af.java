package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

class af
  implements AppLovinAdClickListener
{
  af(ad paramad, aj paramaj)
  {
  }

  public void adClicked(AppLovinAd paramAppLovinAd)
  {
    AppLovinAdClickListener localAppLovinAdClickListener = this.a.d();
    if (localAppLovinAdClickListener != null)
      localAppLovinAdClickListener.adClicked(paramAppLovinAd);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
