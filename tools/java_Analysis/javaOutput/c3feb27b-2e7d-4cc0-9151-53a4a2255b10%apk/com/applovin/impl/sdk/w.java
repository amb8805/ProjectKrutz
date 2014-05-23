package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

class w
  implements AppLovinAdVideoPlaybackListener
{
  private AppLovinAdVideoPlaybackListener b;

  private w(t paramt, AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    this.b = paramAppLovinAdVideoPlaybackListener;
  }

  public void videoPlaybackBegan(AppLovinAd paramAppLovinAd)
  {
    if (this.b != null)
      this.b.videoPlaybackBegan(paramAppLovinAd);
  }

  public void videoPlaybackEnded(AppLovinAd paramAppLovinAd, double paramDouble, boolean paramBoolean)
  {
    if (this.b != null)
      this.b.videoPlaybackEnded(paramAppLovinAd, paramDouble, paramBoolean);
    t.a(this.a, null);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
