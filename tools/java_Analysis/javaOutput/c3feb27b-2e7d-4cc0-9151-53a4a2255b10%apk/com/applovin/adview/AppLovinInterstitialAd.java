package com.applovin.adview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.applovin.impl.adview.InterstitialAdDialogCreatorImpl;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinInterstitialAd extends View
{
  private AppLovinInterstitialAdDialog a = null;

  public AppLovinInterstitialAd(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AppLovinInterstitialAd(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if ((paramContext instanceof Activity))
    {
      AppLovinSdk localAppLovinSdk = AppLovinSdk.getInstance(paramContext);
      if ((localAppLovinSdk != null) && (!localAppLovinSdk.hasCriticalErrors()))
        this.a = new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(localAppLovinSdk, (Activity)paramContext);
    }
    while (true)
    {
      setVisibility(8);
      return;
      Log.e("AppLovinSdk", "Unable to create AppLovin interstitial dialog. The view was not created from an activity.");
    }
  }

  public static AppLovinInterstitialAdDialog create(AppLovinSdk paramAppLovinSdk, Activity paramActivity)
  {
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("No sdk specified");
    if (paramActivity == null)
      throw new IllegalArgumentException("No activity specified");
    return new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(paramAppLovinSdk, paramActivity);
  }

  public static void show(Activity paramActivity)
  {
    if (paramActivity == null)
      throw new IllegalArgumentException("No activity specified");
    AppLovinSdk localAppLovinSdk = AppLovinSdk.getInstance(paramActivity);
    if ((localAppLovinSdk != null) && (!localAppLovinSdk.hasCriticalErrors()))
      show(localAppLovinSdk, paramActivity);
  }

  public static void show(AppLovinSdk paramAppLovinSdk, Activity paramActivity)
  {
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("No sdk specified");
    if (paramActivity == null)
      throw new IllegalArgumentException("No activity specified");
    paramActivity.runOnUiThread(new d(paramAppLovinSdk, paramActivity));
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null)
      this.a.show();
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.AppLovinInterstitialAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
