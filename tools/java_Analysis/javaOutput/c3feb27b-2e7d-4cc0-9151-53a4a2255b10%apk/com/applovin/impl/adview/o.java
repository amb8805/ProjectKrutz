package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

class o
  implements AppLovinVideoCallback
{
  o(AdViewControllerJsInterface paramAdViewControllerJsInterface)
  {
  }

  public void onPlaybackStateChanged(AppLovinVideoPlaybackState paramAppLovinVideoPlaybackState)
  {
    this.a.notifyJavaScriptOfNewState(paramAppLovinVideoPlaybackState);
    if (paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.PLAYING)
      if (AdViewControllerJsInterface.access$100(this.a) != null)
        AdViewControllerJsInterface.access$100(this.a).videoPlaybackBegan(AdViewControllerJsInterface.access$200(this.a));
    do
    {
      do
      {
        return;
        if (paramAppLovinVideoPlaybackState != AppLovinVideoPlaybackState.PAUSED)
          break;
      }
      while (AdViewControllerJsInterface.access$100(this.a) == null);
      AdViewControllerJsInterface.access$100(this.a).videoPlaybackEnded(AdViewControllerJsInterface.access$200(this.a), AdViewControllerJsInterface.access$300(this.a).getPercentViewed(), false);
      return;
      if (paramAppLovinVideoPlaybackState == AppLovinVideoPlaybackState.STOPPED)
      {
        double d = AdViewControllerJsInterface.access$300(this.a).getPercentViewed();
        if (d < 98.0D)
          d = 100.0D;
        if (AdViewControllerJsInterface.access$100(this.a) != null)
          AdViewControllerJsInterface.access$100(this.a).videoPlaybackEnded(AdViewControllerJsInterface.access$200(this.a), d, true);
        this.a.destroyVideoOverlay();
        return;
      }
    }
    while (paramAppLovinVideoPlaybackState != AppLovinVideoPlaybackState.FAILED);
    if (AdViewControllerJsInterface.access$100(this.a) != null)
      AdViewControllerJsInterface.access$100(this.a).videoPlaybackEnded(AdViewControllerJsInterface.access$200(this.a), 0.0D, false);
    AdViewControllerJsInterface.access$300(this.a).stopUnderlyingMediaPlayer();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
