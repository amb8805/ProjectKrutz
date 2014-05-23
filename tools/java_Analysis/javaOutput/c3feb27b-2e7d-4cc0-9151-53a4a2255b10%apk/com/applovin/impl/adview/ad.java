package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;

class ad extends Dialog
  implements ac
{
  private final Activity a;
  private final AppLovinLogger b;
  private AppLovinAdView c;
  private Runnable d;
  private aj e = null;
  private volatile boolean f = false;

  ad(AppLovinSdk paramAppLovinSdk, Activity paramActivity)
  {
    super(paramActivity, 16973840);
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("No sdk specified");
    if (paramActivity == null)
      throw new IllegalArgumentException("No activity specified");
    this.b = paramAppLovinSdk.getLogger();
    this.a = paramActivity;
    this.d = new ai(this);
    this.c = new AppLovinAdViewInternal(paramAppLovinSdk, AppLovinAdSize.INTERSTITIAL, paramActivity);
    this.c.setAutoDestroy(false);
    requestWindowFeature(1);
    try
    {
      getWindow().setFlags(paramActivity.getWindow().getAttributes().flags, paramActivity.getWindow().getAttributes().flags);
      return;
    }
    catch (Exception localException)
    {
      this.b.e("InterstitialAdDialog", "Set window flags failed.", localException);
    }
  }

  private void a()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(13);
    this.c.setLayoutParams(localLayoutParams);
    RelativeLayout localRelativeLayout = new RelativeLayout(this.a);
    localRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    localRelativeLayout.setBackgroundColor(-1157627904);
    localRelativeLayout.addView(this.c);
    setContentView(localRelativeLayout);
  }

  public void a(aj paramaj)
  {
    this.c.setAdDisplayListener(new ae(this, paramaj));
    this.c.setAdClickListener(new af(this, paramaj));
    this.c.setAdVideoPlaybackListener(new ag(this, paramaj));
    this.e = paramaj;
    paramaj.a(true);
  }

  public void a(AppLovinAd paramAppLovinAd)
  {
    this.a.runOnUiThread(new ah(this, paramAppLovinAd));
  }

  public void dismiss()
  {
    if (this.e != null)
      this.e.f();
    if (this.c != null)
      this.c.destroy();
    this.e = null;
    this.c = null;
    super.dismiss();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
