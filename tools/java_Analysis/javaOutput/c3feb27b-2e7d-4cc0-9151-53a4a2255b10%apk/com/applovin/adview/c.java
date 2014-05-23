package com.applovin.adview;

import com.applovin.impl.adview.aj;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

class c
  implements AppLovinAdVideoPlaybackListener
{
  c(AppLovinInterstitialActivity paramAppLovinInterstitialActivity)
  {
  }

  public void videoPlaybackBegan(AppLovinAd paramAppLovinAd)
  {
    AppLovinAdVideoPlaybackListener localAppLovinAdVideoPlaybackListener = AppLovinInterstitialActivity.b(this.a).b();
    if (localAppLovinAdVideoPlaybackListener != null)
      localAppLovinAdVideoPlaybackListener.videoPlaybackBegan(paramAppLovinAd);
  }

  public void videoPlaybackEnded(AppLovinAd paramAppLovinAd, double paramDouble, boolean paramBoolean)
  {
    AppLovinInterstitialActivity.a(this.a, paramAppLovinAd, paramDouble, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
