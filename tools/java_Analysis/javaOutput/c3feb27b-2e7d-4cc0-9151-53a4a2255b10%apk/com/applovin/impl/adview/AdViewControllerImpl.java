package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.LayoutParams;;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import android.widget.RelativeLayout.LayoutParams;
import com.applovin.adview.AdViewController;
import com.applovin.impl.sdk.AppLovinAdInternal;
import com.applovin.impl.sdk.AppLovinAdInternal.AdTarget;
import com.applovin.impl.sdk.AppLovinAdInternal.ApiCompatibilityLevel;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class AdViewControllerImpl
  implements AdViewController
{
  private Activity a;
  private AppLovinSdk b;
  private AppLovinAdService c;
  private AppLovinLogger d;
  private AppLovinAdSize e;
  private y f;
  private m g;
  private v h;
  private AdViewControllerJsInterface i;
  private AppLovinAd j;
  private Runnable k;
  private Runnable l;
  private Runnable m;
  private volatile AppLovinAd n = null;
  private final AtomicReference o = new AtomicReference();
  private volatile boolean p = false;
  private volatile boolean q = true;
  private volatile boolean r = false;
  private volatile boolean s = false;
  private volatile AppLovinAdLoadListener t;
  private volatile AppLovinAdDisplayListener u;
  private volatile AppLovinAdVideoPlaybackListener v;
  private volatile AppLovinAdClickListener w;

  public AdViewControllerImpl()
  {
  }

  private void a(ViewGroup paramViewGroup, AppLovinSdk paramAppLovinSdk, AppLovinAdSize paramAppLovinAdSize, String paramString, Context paramContext)
  {
    if (paramViewGroup == null)
      throw new IllegalArgumentException("No parent view specified");
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("No sdk specified");
    if (paramAppLovinAdSize == null)
      throw new IllegalArgumentException("No ad size specified");
    if (!(paramContext instanceof Activity))
      throw new IllegalArgumentException("Specified context is not an activity");
    this.b = paramAppLovinSdk;
    this.c = paramAppLovinSdk.getAdService();
    this.d = paramAppLovinSdk.getLogger();
    this.e = paramAppLovinAdSize;
    this.a = ((Activity)paramContext);
    this.j = new AppLovinAdInternal("", AppLovinAdSize.BANNER, AppLovinAdType.REGULAR, new ArrayList(), "", AppLovinAdInternal.AdTarget.DEFAULT, "-1");
    this.f = new y(this, paramAppLovinSdk);
    this.m = new g(this);
    this.k = new l(this);
    this.l = new j(this);
    this.g = new m(this, paramAppLovinSdk);
    if (a(paramContext))
    {
      this.h = b();
      this.i = new AdViewControllerJsInterface(paramAppLovinSdk, this.h, this.a, paramViewGroup, this.n, this.v);
      paramViewGroup.setBackgroundColor(0);
      paramViewGroup.addView(this.h);
      b(this.h, paramAppLovinAdSize);
      this.h.setVisibility(8);
      a(new k(this));
      this.p = true;
      return;
    }
    this.d.userError("AppLovinAdView", "Web view database is corrupt, AdView not loaded");
  }

  private void a(Runnable paramRunnable)
  {
    this.a.runOnUiThread(paramRunnable);
  }

  private static boolean a(Context paramContext)
  {
    try
    {
      if (Build.VERSION.SDK_INT < 11)
      {
        WebViewDatabase localWebViewDatabase = WebViewDatabase.getInstance(paramContext);
        Method localMethod = WebViewDatabase.class.getDeclaredMethod("getCacheTotalSize", new Class[0]);
        localMethod.setAccessible(true);
        localMethod.invoke(localWebViewDatabase, new Object[0]);
      }
      return true;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.e("AppLovinAdView", "Error invoking getCacheTotalSize()", localNoSuchMethodException);
      return true;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Log.e("AppLovinAdView", "Error invoking getCacheTotalSize()", localIllegalArgumentException);
      return true;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.e("AppLovinAdView", "Error invoking getCacheTotalSize()", localIllegalAccessException);
      return true;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.e("AppLovinAdView", "getCacheTotalSize() reported exception", localInvocationTargetException);
      return false;
    }
    catch (Throwable localThrowable)
    {
      Log.e("AppLovinAdView", "Unexpected error while checking DB state", localThrowable);
    }
    return false;
  }

  private v b()
  {
    v localv = new v(this.e, this.f, this.b, this.a);
    localv.setBackgroundColor(0);
    localv.setWillNotCacheDrawing(false);
    return localv;
  }

  private static void b(View paramView, AppLovinAdSize paramAppLovinAdSize)
  {
    DisplayMetrics localDisplayMetrics = paramView.getResources().getDisplayMetrics();
    int i1;
    int i2;
    if (paramAppLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()))
    {
      i1 = -1;
      if (!paramAppLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()))
        break label149;
      i2 = -1;
    }
    while (true)
    {
      Object localObject = paramView.getLayoutParams();
      if (localObject == null)
        localObject = new RelativeLayout.LayoutParams(-2, -2);
      ((ViewGroup.LayoutParams)localObject).width = i1;
      ((ViewGroup.LayoutParams)localObject).height = i2;
      if ((localObject instanceof RelativeLayout.LayoutParams))
      {
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localObject;
        localLayoutParams.addRule(10);
        localLayoutParams.addRule(9);
      }
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      return;
      if (paramAppLovinAdSize.getWidth() == -1)
      {
        i1 = localDisplayMetrics.widthPixels;
        break;
      }
      i1 = (int)TypedValue.applyDimension(1, paramAppLovinAdSize.getWidth(), localDisplayMetrics);
      break;
      label149: if (paramAppLovinAdSize.getHeight() == -1)
        i2 = localDisplayMetrics.heightPixels;
      else
        i2 = (int)TypedValue.applyDimension(1, paramAppLovinAdSize.getHeight(), localDisplayMetrics);
    }
  }

  AdViewControllerJsInterface a()
  {
    return this.i;
  }

  void a(WebView paramWebView)
  {
    a(this.m);
    a(new i(this, this.n));
    this.i.destroyVideoOverlay();
    this.n = null;
  }

  void a(AppLovinAd paramAppLovinAd)
  {
    if (((AppLovinAdInternal)paramAppLovinAd).getCompatibilityLevel() == AppLovinAdInternal.ApiCompatibilityLevel.AdServerApi10)
      this.b.getAdService().trackAdClick(paramAppLovinAd);
    a(new h(this, paramAppLovinAd));
  }

  public void destroy()
  {
    if (this.c != null)
      this.c.removeAdUpdateListener(this.g, getSize());
    if (this.h != null)
      this.h.destroy();
    this.r = true;
  }

  public AppLovinAdSize getSize()
  {
    return this.e;
  }

  public void handleCommandInvocation(String paramString, Map paramMap)
  {
    a(new a(this, paramString, paramMap));
  }

  public void initializeAdView(ViewGroup paramViewGroup, Context paramContext, AppLovinAdSize paramAppLovinAdSize, AppLovinSdk paramAppLovinSdk, AttributeSet paramAttributeSet)
  {
    if (paramViewGroup == null)
      throw new IllegalArgumentException("No parent view specified");
    if (paramContext == null)
    {
      Log.e("AppLovinSdk", "Unable to create AppLovinAdView: no context provided. Please use a different constructor for this view.");
      return;
    }
    if (paramAppLovinAdSize == null)
    {
      localAppLovinAdSize = t.a(paramAttributeSet);
      if (localAppLovinAdSize != null);
    }
    for (AppLovinAdSize localAppLovinAdSize = AppLovinAdSize.BANNER; ; localAppLovinAdSize = paramAppLovinAdSize)
    {
      String str = t.a(paramAttributeSet, paramContext);
      if (paramAppLovinSdk == null);
      for (AppLovinSdk localAppLovinSdk = AppLovinSdk.getInstance(paramContext); ; localAppLovinSdk = paramAppLovinSdk)
      {
        if ((localAppLovinSdk == null) || (localAppLovinSdk.hasCriticalErrors()))
          break label112;
        a(paramViewGroup, localAppLovinSdk, localAppLovinAdSize, str, paramContext);
        if (!t.b(paramAttributeSet))
          break;
        loadNextAd();
        return;
      }
      label112: break;
    }
  }

  public boolean isAutoDestroy()
  {
    return this.q;
  }

  public void loadNextAd()
  {
    if ((this.b != null) && (this.g != null) && (this.a != null) && (this.p))
    {
      this.c.loadNextAd(this.e, this.g);
      return;
    }
    Log.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
  }

  public void onAdHtmlLoaded(WebView paramWebView)
  {
    if (this.n != null)
      paramWebView.setVisibility(0);
    try
    {
      if (this.u != null)
        this.u.adDisplayed(this.n);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.d.userError("AppLovinAdView", "Exception while notifying ad display listener", localThrowable);
    }
  }

  protected void onAdReceived(AppLovinAd paramAppLovinAd)
  {
    if (paramAppLovinAd != null)
    {
      this.s = true;
      if (!this.r)
      {
        this.c.addAdUpdateListener(this.g, this.e);
        renderAd(paramAppLovinAd);
      }
      while (true)
      {
        a(new b(this, paramAppLovinAd));
        return;
        this.o.set(paramAppLovinAd);
        this.d.d("AppLovinAdView", "Ad view has paused when an ad was recieved, ad saved for later");
      }
    }
    this.d.e("AppLovinAdView", "No provided when to the view controller");
    onFailedToReceiveAd(-1);
  }

  public void onDetachedFromWindow()
  {
    if (!this.p);
    do
    {
      return;
      a(new i(this, this.n));
    }
    while (!this.q);
    destroy();
  }

  protected void onFailedToReceiveAd(int paramInt)
  {
    if (!this.r)
    {
      this.c.addAdUpdateListener(this.g, this.e);
      a(this.m);
    }
    a(new c(this, paramInt));
  }

  public void onVisibilityChanged(int paramInt)
  {
    if (!this.p);
    do
    {
      do
        return;
      while (!this.q);
      if ((paramInt == 8) || (paramInt == 4))
      {
        pause();
        return;
      }
    }
    while (paramInt != 0);
    resume();
  }

  public void pause()
  {
    if (!this.p)
      return;
    this.c.removeAdUpdateListener(this.g, getSize());
    AppLovinAd localAppLovinAd = this.n;
    renderAd(this.j);
    if (localAppLovinAd != null)
      this.o.set(localAppLovinAd);
    this.r = true;
  }

  public void renderAd(AppLovinAd paramAppLovinAd)
  {
    if (paramAppLovinAd == null)
      throw new IllegalArgumentException("No ad specified");
    if (this.p)
    {
      if (paramAppLovinAd != this.n)
      {
        this.d.d("AppLovinAdView", "Rendering " + paramAppLovinAd.getSize() + " ad for \"" + paramAppLovinAd.getDestinationUrls() + "\"...");
        a(new i(this, this.n));
        this.o.set(null);
        this.i.destroyVideoOverlay();
        this.i.setVideoFilename(paramAppLovinAd.getVideoFilename());
        this.n = paramAppLovinAd;
        if (paramAppLovinAd.getSize() == this.e)
          a(this.k);
        while (paramAppLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL)
          return;
        a(this.m);
        a(this.l);
        return;
      }
      this.d.w("AppLovinAdView", "Ad for \"" + paramAppLovinAd.getDestinationUrls() + "\" is already showing, ignoring");
      return;
    }
    Log.i("AppLovinSdk", "Unable to render ad: AppLovinAdView is not initialized.");
  }

  public void resume()
  {
    if (!this.p)
      return;
    if (this.s)
      this.c.addAdUpdateListener(this.g, this.e);
    AppLovinAd localAppLovinAd = (AppLovinAd)this.o.getAndSet(null);
    if (localAppLovinAd != null)
      renderAd(localAppLovinAd);
    this.r = false;
  }

  public void setAdClickListener(AppLovinAdClickListener paramAppLovinAdClickListener)
  {
    this.w = paramAppLovinAdClickListener;
  }

  public void setAdDisplayListener(AppLovinAdDisplayListener paramAppLovinAdDisplayListener)
  {
    this.u = paramAppLovinAdDisplayListener;
  }

  public void setAdLoadListener(AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    this.t = paramAppLovinAdLoadListener;
  }

  public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener paramAppLovinAdVideoPlaybackListener)
  {
    this.v = paramAppLovinAdVideoPlaybackListener;
    if (this.i != null)
      this.i.setAdVideoPlaybackListener(paramAppLovinAdVideoPlaybackListener);
  }

  public void setAutoDestroy(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AdViewControllerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
