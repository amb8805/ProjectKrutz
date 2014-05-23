package com.applovin.impl.adview;

import android.app.Activity;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

class ae
  implements AppLovinAdDisplayListener
{
  ae(ad paramad, aj paramaj)
  {
  }

  public void adDisplayed(AppLovinAd paramAppLovinAd)
  {
    ad.c(this.b);
    if (!ad.d(this.b))
    {
      AppLovinAdDisplayListener localAppLovinAdDisplayListener = this.a.c();
      if (localAppLovinAdDisplayListener != null)
        localAppLovinAdDisplayListener.adDisplayed(paramAppLovinAd);
      ad.a(this.b, true);
    }
  }

  public void adHidden(AppLovinAd paramAppLovinAd)
  {
    ad.b(this.b).runOnUiThread(ad.a(this.b));
    AppLovinAdDisplayListener localAppLovinAdDisplayListener = this.a.c();
    if (localAppLovinAdDisplayListener != null)
      localAppLovinAdDisplayListener.adHidden(paramAppLovinAd);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
