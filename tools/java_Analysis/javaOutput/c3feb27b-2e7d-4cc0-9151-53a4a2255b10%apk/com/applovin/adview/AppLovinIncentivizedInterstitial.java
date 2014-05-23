package com.applovin.adview;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinIncentivizedInterstitial
{
  private t a;

  public AppLovinIncentivizedInterstitial(Context paramContext)
  {
    this(AppLovinSdk.getInstance(paramContext));
  }

  public AppLovinIncentivizedInterstitial(AppLovinSdk paramAppLovinSdk)
  {
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("SDK cannot be null");
    this.a = new t(paramAppLovinSdk);
  }

  public static AppLovinIncentivizedInterstitial create(Context paramContext)
  {
    return create(AppLovinSdk.getInstance(paramContext));
  }

  public static AppLovinIncentivizedInterstitial create(AppLovinSdk paramAppLovinSdk)
  {
    return new AppLovinIncentivizedInterstitial(paramAppLovinSdk);
  }

  public void preload(AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    if (paramAppLovinAdLoadListener == null)
      throw new IllegalArgumentException("AppLovinAdLoadListener must not be null when preloading incentivized interstitials.");
    this.a.a(paramAppLovinAdLoadListener);
  }

  public void show(Activity paramActivity, AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    show(paramActivity, paramAppLovinAdVideoPlaybackListener, null);
  }

  public void show(Activity paramActivity, AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener paramAppLovinAdDisplayListener)
  {
    show(paramActivity, paramAppLovinAdVideoPlaybackListener, paramAppLovinAdDisplayListener, null);
  }

  public void show(Activity paramActivity, AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener paramAppLovinAdDisplayListener, AppLovinAdClickListener paramAppLovinAdClickListener)
  {
    if (paramAppLovinAdVideoPlaybackListener == null)
      throw new IllegalArgumentException("AppLovinAdVideoPlaybackLister must not be null when showing an AppLovinIncentivizedInterstitial.");
    this.a.a(paramActivity, paramAppLovinAdVideoPlaybackListener, paramAppLovinAdDisplayListener, paramAppLovinAdClickListener);
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.AppLovinIncentivizedInterstitial
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
