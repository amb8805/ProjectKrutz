package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;

public class t
{
  private AppLovinSdkImpl a;
  private b b;
  private AppLovinAd c;
  private final String d = "IncentivizedAdController";

  public t(AppLovinSdk paramAppLovinSdk)
  {
    this.a = ((AppLovinSdkImpl)paramAppLovinSdk);
    this.b = ((b)paramAppLovinSdk.getAdService());
  }

  public void a(Activity paramActivity, AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener paramAppLovinAdDisplayListener, AppLovinAdClickListener paramAppLovinAdClickListener)
  {
    if (this.c != null)
    {
      AppLovinAdInternal localAppLovinAdInternal = (AppLovinAdInternal)this.c;
      if (localAppLovinAdInternal.getType().equals(AppLovinAdType.INCENTIVIZED))
      {
        AppLovinInterstitialAdDialog localAppLovinInterstitialAdDialog = AppLovinInterstitialAd.create(this.a, paramActivity);
        localAppLovinInterstitialAdDialog.setAdDisplayListener(paramAppLovinAdDisplayListener);
        localAppLovinInterstitialAdDialog.setAdVideoPlaybackListener(new w(this, paramAppLovinAdVideoPlaybackListener, null));
        localAppLovinInterstitialAdDialog.setAdClickListener(paramAppLovinAdClickListener);
        localAppLovinInterstitialAdDialog.showAndRender(localAppLovinAdInternal);
        return;
      }
      this.a.getLogger().e("IncentivizedAdController", "Attempted to render an ad of type " + this.c.getType() + " in an Incentivized Ad interstitial.");
      paramAppLovinAdVideoPlaybackListener.videoPlaybackEnded(this.c, 0.0D, false);
      return;
    }
    this.a.getLogger().e("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
  }

  public void a(AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    this.b.a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, new v(this, paramAppLovinAdLoadListener));
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
