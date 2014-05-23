package com.applovin.adview;

import com.applovin.impl.adview.aj;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

class b
  implements AppLovinAdClickListener
{
  b(AppLovinInterstitialActivity paramAppLovinInterstitialActivity)
  {
  }

  public void adClicked(AppLovinAd paramAppLovinAd)
  {
    AppLovinAdClickListener localAppLovinAdClickListener = AppLovinInterstitialActivity.b(this.a).d();
    if (localAppLovinAdClickListener != null)
      localAppLovinAdClickListener.adClicked(paramAppLovinAd);
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
