package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

class f
  implements AppLovinAdVideoPlaybackListener
{
  f(AdViewControllerImpl paramAdViewControllerImpl)
  {
  }

  public void videoPlaybackBegan(AppLovinAd paramAppLovinAd)
  {
    if (AdViewControllerImpl.j(this.a) != null)
      AdViewControllerImpl.j(this.a).videoPlaybackBegan(paramAppLovinAd);
  }

  public void videoPlaybackEnded(AppLovinAd paramAppLovinAd, double paramDouble, boolean paramBoolean)
  {
    if (AdViewControllerImpl.j(this.a) != null)
      AdViewControllerImpl.j(this.a).videoPlaybackEnded(paramAppLovinAd, paramDouble, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
