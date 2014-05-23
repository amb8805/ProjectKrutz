package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

class ag
  implements AppLovinAdVideoPlaybackListener
{
  ag(ad paramad, aj paramaj)
  {
  }

  public void videoPlaybackBegan(AppLovinAd paramAppLovinAd)
  {
    AppLovinAdVideoPlaybackListener localAppLovinAdVideoPlaybackListener = this.a.b();
    if (localAppLovinAdVideoPlaybackListener != null)
      localAppLovinAdVideoPlaybackListener.videoPlaybackBegan(paramAppLovinAd);
  }

  public void videoPlaybackEnded(AppLovinAd paramAppLovinAd, double paramDouble, boolean paramBoolean)
  {
    AppLovinAdVideoPlaybackListener localAppLovinAdVideoPlaybackListener = this.a.b();
    if (localAppLovinAdVideoPlaybackListener != null)
      localAppLovinAdVideoPlaybackListener.videoPlaybackEnded(paramAppLovinAd, paramDouble, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
