package com.applovin.adview;

import android.app.Activity;
import com.applovin.sdk.AppLovinSdk;

public abstract interface InterstitialAdDialogCreator
{
  public abstract AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk paramAppLovinSdk, Activity paramActivity);
}

/* Location:
 * Qualified Name:     com.applovin.adview.InterstitialAdDialogCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
