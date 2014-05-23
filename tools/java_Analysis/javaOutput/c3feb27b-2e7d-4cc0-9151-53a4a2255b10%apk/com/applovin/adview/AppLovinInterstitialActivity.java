package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.applovin.impl.adview.AdViewControllerJsInterface;
import com.applovin.impl.adview.AppLovinAdViewInternal;
import com.applovin.impl.adview.ac;
import com.applovin.impl.adview.aj;
import com.applovin.impl.sdk.AppLovinAdInternal;
import com.applovin.impl.sdk.AppLovinAdInternal.AdTarget;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.ArrayList;

public class AppLovinInterstitialActivity extends Activity
  implements ac
{
  public static final String KEY_WRAPPER_ID = "com.applovin.interstitial.wrapper_id";
  public static volatile aj lastKnownWrapper = null;
  private AppLovinAdViewInternal a;
  private aj b;
  private volatile boolean c = false;
  private volatile AppLovinAd d = a();
  private volatile boolean e = false;
  private volatile boolean f = false;
  private volatile boolean g = false;

  public AppLovinInterstitialActivity()
  {
  }

  private static AppLovinAdInternal a()
  {
    return new AppLovinAdInternal("", AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR, new ArrayList(), "", AppLovinAdInternal.AdTarget.DEFAULT, "-1");
  }

  private void a(AppLovinAd paramAppLovinAd)
  {
    if (!this.f)
    {
      this.f = true;
      AppLovinAdDisplayListener localAppLovinAdDisplayListener = this.b.c();
      if (localAppLovinAdDisplayListener != null)
        localAppLovinAdDisplayListener.adHidden(paramAppLovinAd);
      this.b.a(false);
      this.b.f();
      finish();
    }
  }

  private void a(AppLovinAd paramAppLovinAd, double paramDouble, boolean paramBoolean)
  {
    if (!this.g)
    {
      this.g = true;
      AppLovinAdVideoPlaybackListener localAppLovinAdVideoPlaybackListener = this.b.b();
      if (localAppLovinAdVideoPlaybackListener != null)
        localAppLovinAdVideoPlaybackListener.videoPlaybackEnded(paramAppLovinAd, paramDouble, paramBoolean);
    }
  }

  public void dismiss()
  {
    finish();
  }

  public void exitWithError(String paramString)
  {
    String str = "Initialized = " + aj.a + "; CleanedUp = " + aj.b;
    Log.e("AppLovinInterstitialActivity", "Failed to properly render an Interstitial Activity, due to error: " + paramString, new Throwable(str));
    finish();
  }

  public void onBackPressed()
  {
    if (this.b != null)
    {
      if (this.b.g())
        super.onBackPressed();
      return;
    }
    super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    try
    {
      getWindow().setFlags(1024, 1024);
      label24: setTheme(16973841);
      String str = getIntent().getStringExtra("com.applovin.interstitial.wrapper_id");
      int i;
      if ((str != null) && (!str.isEmpty()))
      {
        this.b = aj.a(str);
        if ((this.b == null) && (lastKnownWrapper != null))
          this.b = lastKnownWrapper;
        if (this.b != null)
          if (this.b.a() != null)
          {
            i = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.b.e() == AppLovinAdInternal.AdTarget.ACTIVITY_PORTRAIT)
            {
              if (i != 0)
                this.c = true;
              setRequestedOrientation(1);
              this.a = new AppLovinAdViewInternal(AppLovinAdSize.INTERSTITIAL, this);
              this.a.setAutoDestroy(false);
              this.b.a(this);
              RelativeLayout localRelativeLayout = new RelativeLayout(this);
              localRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
              localRelativeLayout.setBackgroundColor(-1157627904);
              localRelativeLayout.addView(this.a);
              setContentView(localRelativeLayout);
            }
          }
      }
      while (true)
      {
        renderDialog();
        return;
        if ((i != 1) && (i != 3))
          this.c = true;
        setRequestedOrientation(0);
        break;
        exitWithError("No current ad found.");
        continue;
        exitWithError("Wrapper is null; initialized state: " + Boolean.toString(aj.a));
        continue;
        exitWithError("Wrapper ID is null");
      }
    }
    catch (Throwable localThrowable)
    {
      break label24;
    }
  }

  protected void onDestroy()
  {
    if (this.a != null)
      this.a.destroy();
    super.onDestroy();
  }

  protected void onPause()
  {
    AppLovinAd localAppLovinAd;
    double d1;
    if (!this.c)
    {
      AdViewControllerJsInterface localAdViewControllerJsInterface = this.a.getAdViewControllerJsInterface();
      localAppLovinAd = this.d;
      d1 = localAdViewControllerJsInterface.getPercentViewed();
      if (localAdViewControllerJsInterface.getPercentViewed() < 97)
        break label59;
    }
    label59: for (boolean bool = true; ; bool = false)
    {
      a(localAppLovinAd, d1, bool);
      a(this.d);
      super.onPause();
      return;
    }
  }

  protected void renderDialog()
  {
    if (!this.c)
    {
      if (this.a != null)
      {
        this.a.setAdDisplayListener(new a(this));
        this.a.setAdClickListener(new b(this));
        this.a.setAdVideoPlaybackListener(new c(this));
        this.a.renderAd(this.b.a());
        this.b.a(true);
      }
    }
    else
      return;
    exitWithError("AdView was null");
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.AppLovinInterstitialActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
