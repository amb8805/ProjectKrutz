package com.applovin.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

public abstract interface AppLovinInterstitialAdDialog
{
  public abstract void dismiss();

  public abstract boolean isShowing();

  public abstract void setAdClickListener(AppLovinAdClickListener paramAppLovinAdClickListener);

  public abstract void setAdDisplayListener(AppLovinAdDisplayListener paramAppLovinAdDisplayListener);

  public abstract void setAdLoadListener(AppLovinAdLoadListener paramAppLovinAdLoadListener);

  public abstract void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener);

  public abstract void show();

  public abstract void showAndRender(AppLovinAd paramAppLovinAd);
}

/* Location:
 * Qualified Name:     com.applovin.adview.AppLovinInterstitialAdDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
