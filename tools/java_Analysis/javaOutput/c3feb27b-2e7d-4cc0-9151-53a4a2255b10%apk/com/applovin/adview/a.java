package com.applovin.adview;

import com.applovin.impl.adview.aj;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

class a
  implements AppLovinAdDisplayListener
{
  a(AppLovinInterstitialActivity paramAppLovinInterstitialActivity)
  {
  }

  public void adDisplayed(AppLovinAd paramAppLovinAd)
  {
    AppLovinInterstitialActivity.b(this.a, paramAppLovinAd);
    if (!AppLovinInterstitialActivity.a(this.a))
    {
      AppLovinAdDisplayListener localAppLovinAdDisplayListener = AppLovinInterstitialActivity.b(this.a).c();
      if (localAppLovinAdDisplayListener != null)
        localAppLovinAdDisplayListener.adDisplayed(paramAppLovinAd);
      AppLovinInterstitialActivity.a(this.a, true);
    }
  }

  public void adHidden(AppLovinAd paramAppLovinAd)
  {
    AppLovinInterstitialActivity.a(this.a, paramAppLovinAd);
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
