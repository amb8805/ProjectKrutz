package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdInternal;
import com.applovin.impl.sdk.AppLovinAdInternal.AdTarget;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class aj
  implements AppLovinInterstitialAdDialog
{
  public static volatile boolean a = false;
  public static volatile boolean b = false;
  private static final Map c = Collections.synchronizedMap(new HashMap());
  private final String d;
  private final AppLovinSdk e;
  private final Activity f;
  private volatile AppLovinAdLoadListener g;
  private volatile AppLovinAdDisplayListener h;
  private volatile AppLovinAdVideoPlaybackListener i;
  private volatile AppLovinAdClickListener j;
  private volatile AppLovinAd k;
  private volatile boolean l;
  private volatile AppLovinAdInternal.AdTarget m;
  private volatile ac n;

  aj(AppLovinSdk paramAppLovinSdk, Activity paramActivity)
  {
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("No sdk specified");
    if (paramActivity == null)
      throw new IllegalArgumentException("No activity specified");
    this.e = paramAppLovinSdk;
    this.d = UUID.randomUUID().toString();
    a = true;
    b = false;
    this.f = paramActivity;
    c.put(this.d, this);
  }

  public static aj a(String paramString)
  {
    return (aj)c.get(paramString);
  }

  private void a(int paramInt)
  {
    this.f.runOnUiThread(new an(this, paramInt));
  }

  private void a(AppLovinAd paramAppLovinAd)
  {
    this.f.runOnUiThread(new am(this, paramAppLovinAd));
  }

  private void h()
  {
    ad localad = new ad(this.e, this.f);
    localad.a(this);
    this.n = localad;
    localad.a(this.k);
  }

  private void i()
  {
    Intent localIntent = new Intent(this.f, AppLovinInterstitialActivity.class);
    localIntent.putExtra("com.applovin.interstitial.wrapper_id", this.d);
    AppLovinInterstitialActivity.lastKnownWrapper = this;
    this.f.startActivity(localIntent);
    a(true);
  }

  public AppLovinAd a()
  {
    return this.k;
  }

  public void a(ac paramac)
  {
    this.n = paramac;
  }

  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public AppLovinAdVideoPlaybackListener b()
  {
    return this.i;
  }

  public AppLovinAdDisplayListener c()
  {
    return this.h;
  }

  public AppLovinAdClickListener d()
  {
    return this.j;
  }

  public void dismiss()
  {
    if (this.n != null)
      this.f.runOnUiThread(new ao(this));
  }

  public AppLovinAdInternal.AdTarget e()
  {
    return this.m;
  }

  public void f()
  {
    a = false;
    b = true;
    c.remove(this.d);
  }

  public boolean g()
  {
    return new com.applovin.impl.sdk.ad(this.e).a().booleanValue();
  }

  public boolean isShowing()
  {
    return this.l;
  }

  public void setAdClickListener(AppLovinAdClickListener paramAppLovinAdClickListener)
  {
    this.j = paramAppLovinAdClickListener;
  }

  public void setAdDisplayListener(AppLovinAdDisplayListener paramAppLovinAdDisplayListener)
  {
    this.h = paramAppLovinAdDisplayListener;
  }

  public void setAdLoadListener(AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    this.g = paramAppLovinAdLoadListener;
  }

  public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    this.i = paramAppLovinAdVideoPlaybackListener;
  }

  public void show()
  {
    this.e.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, new ak(this));
  }

  public void showAndRender(AppLovinAd paramAppLovinAd)
  {
    this.k = paramAppLovinAd;
    AppLovinAdInternal.AdTarget localAdTarget;
    boolean bool1;
    if ((paramAppLovinAd instanceof AppLovinAdInternal))
    {
      localAdTarget = ((AppLovinAdInternal)paramAppLovinAd).getTarget();
      this.m = localAdTarget;
      bool1 = j.a(AppLovinInterstitialActivity.class, this.f);
      if ((this.m != AppLovinAdInternal.AdTarget.ACTIVITY_LANDSCAPE) && (this.m != AppLovinAdInternal.AdTarget.ACTIVITY_PORTRAIT))
        break label84;
    }
    label84: for (boolean bool2 = true; ; bool2 = false)
    {
      this.f.runOnUiThread(new al(this, bool1, bool2));
      return;
      localAdTarget = AppLovinAdInternal.AdTarget.DEFAULT;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
