package com.applovin.adview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAdView extends RelativeLayout
{
  public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";
  protected AdViewController controller;

  public AppLovinAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AppLovinAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(null, null, paramContext, paramAttributeSet);
  }

  public AppLovinAdView(AppLovinAdSize paramAppLovinAdSize, Activity paramActivity)
  {
    super(paramActivity);
    Log.d("AppLovinSdk", "Created new AdView");
    a(paramAppLovinAdSize, null, paramActivity, null);
  }

  public AppLovinAdView(AppLovinSdk paramAppLovinSdk, AppLovinAdSize paramAppLovinAdSize, Activity paramActivity)
  {
    super(paramActivity);
    a(paramAppLovinAdSize, paramAppLovinSdk, paramActivity, null);
  }

  private void a(AttributeSet paramAttributeSet, Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    int i = localDisplayMetrics.widthPixels;
    int j = (int)TypedValue.applyDimension(1, 50.0F, localDisplayMetrics);
    TextView localTextView = new TextView(paramContext);
    localTextView.setBackgroundColor(Color.rgb(220, 220, 220));
    localTextView.setTextColor(-16777216);
    localTextView.setText("AppLovin Ad");
    localTextView.setGravity(17);
    addView(localTextView, i, j);
  }

  private void a(AppLovinAdSize paramAppLovinAdSize, AppLovinSdk paramAppLovinSdk, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!isInEditMode())
    {
      AdViewControllerImpl localAdViewControllerImpl = new AdViewControllerImpl();
      localAdViewControllerImpl.initializeAdView(this, paramContext, paramAppLovinAdSize, paramAppLovinSdk, paramAttributeSet);
      this.controller = localAdViewControllerImpl;
      return;
    }
    a(paramAttributeSet, paramContext);
  }

  public void destroy()
  {
    if (this.controller != null)
      this.controller.destroy();
  }

  public AppLovinAdSize getSize()
  {
    if (this.controller != null)
      return this.controller.getSize();
    return null;
  }

  public void loadNextAd()
  {
    if (this.controller != null)
    {
      this.controller.loadNextAd();
      return;
    }
    Log.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
  }

  protected void onDetachedFromWindow()
  {
    if (this.controller != null)
      this.controller.onDetachedFromWindow();
    super.onDetachedFromWindow();
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.controller != null)
      this.controller.onVisibilityChanged(paramInt);
  }

  public void pause()
  {
    if (this.controller != null)
      this.controller.pause();
  }

  public void renderAd(AppLovinAd paramAppLovinAd)
  {
    if (this.controller != null)
      this.controller.renderAd(paramAppLovinAd);
  }

  public void resume()
  {
    if (this.controller != null)
      this.controller.resume();
  }

  public void setAdClickListener(AppLovinAdClickListener paramAppLovinAdClickListener)
  {
    if (this.controller != null)
      this.controller.setAdClickListener(paramAppLovinAdClickListener);
  }

  public void setAdDisplayListener(AppLovinAdDisplayListener paramAppLovinAdDisplayListener)
  {
    if (this.controller != null)
      this.controller.setAdDisplayListener(paramAppLovinAdDisplayListener);
  }

  public void setAdLoadListener(AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    if (this.controller != null)
      this.controller.setAdLoadListener(paramAppLovinAdLoadListener);
  }

  public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    if (this.controller != null)
      this.controller.setAdVideoPlaybackListener(paramAppLovinAdVideoPlaybackListener);
  }

  public void setAutoDestroy(boolean paramBoolean)
  {
    if (this.controller != null)
      this.controller.setAutoDestroy(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.AppLovinAdView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
