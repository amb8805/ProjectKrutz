package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAdViewInternal extends AppLovinAdView
{
  public AppLovinAdViewInternal(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppLovinAdViewInternal(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public AppLovinAdViewInternal(AppLovinAdSize paramAppLovinAdSize, Activity paramActivity)
  {
    super(paramAppLovinAdSize, paramActivity);
  }

  public AppLovinAdViewInternal(AppLovinSdk paramAppLovinSdk, AppLovinAdSize paramAppLovinAdSize, Activity paramActivity)
  {
    super(paramAppLovinSdk, paramAppLovinAdSize, paramActivity);
  }

  public AdViewControllerJsInterface getAdViewControllerJsInterface()
  {
    return ((AdViewControllerImpl)this.controller).a();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AppLovinAdViewInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
