package com.applovin.impl.sdk;

import android.content.Context;
import android.os.PowerManager;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdUpdateListener;
import com.applovin.sdk.AppLovinLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class b
  implements AppLovinAdService
{
  private final AppLovinSdkImpl a;
  private final AppLovinLogger b;
  private final y c;
  private final Map d;

  b(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
    this.c = new y(paramAppLovinSdkImpl);
    this.d = new HashMap(2);
    Iterator localIterator = AppLovinAdType.allTypes().iterator();
    while (localIterator.hasNext())
    {
      AppLovinAdType localAppLovinAdType = (AppLovinAdType)localIterator.next();
      this.d.put(localAppLovinAdType, new HashMap());
    }
    ((Map)this.d.get(AppLovinAdType.REGULAR)).put(AppLovinAdSize.BANNER, new e(AppLovinAdSize.BANNER, null));
    ((Map)this.d.get(AppLovinAdType.REGULAR)).put(AppLovinAdSize.MREC, new e(AppLovinAdSize.MREC, null));
    ((Map)this.d.get(AppLovinAdType.REGULAR)).put(AppLovinAdSize.INTERSTITIAL, new e(AppLovinAdSize.INTERSTITIAL, null));
    ((Map)this.d.get(AppLovinAdType.REGULAR)).put(AppLovinAdSize.LEADER, new e(AppLovinAdSize.LEADER, null));
    ((Map)this.d.get(AppLovinAdType.INCENTIVIZED)).put(AppLovinAdSize.INTERSTITIAL, new e(AppLovinAdSize.INTERSTITIAL, null));
  }

  private void a(AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType)
  {
    d locald = new d(this, (e)((Map)this.d.get(paramAppLovinAdType)).get(paramAppLovinAdSize), null);
    AppLovinAd localAppLovinAd = this.c.c(paramAppLovinAdSize, paramAppLovinAdType);
    if (localAppLovinAd != null)
    {
      this.b.d("AppLovinAdService", "Using pre-loaded ad: " + localAppLovinAd + " for size " + paramAppLovinAdSize + " and type " + paramAppLovinAdType);
      locald.adReceived(localAppLovinAd);
    }
    while (true)
    {
      if (paramAppLovinAdType.equals(AppLovinAdType.REGULAR))
        this.c.a(paramAppLovinAdSize, paramAppLovinAdType);
      return;
      ai localai = new ai(paramAppLovinAdSize, paramAppLovinAdType, locald, this.a);
      this.a.a().a(localai, aq.a);
    }
  }

  private boolean a()
  {
    return ((PowerManager)this.a.getApplicationContext().getSystemService("power")).isScreenOn();
  }

  private boolean a(AppLovinAdSize paramAppLovinAdSize)
  {
    if (paramAppLovinAdSize == AppLovinAdSize.BANNER)
      return ((Boolean)this.a.a(z.D)).booleanValue();
    if (paramAppLovinAdSize == AppLovinAdSize.MREC)
      return ((Boolean)this.a.a(z.F)).booleanValue();
    if (paramAppLovinAdSize == AppLovinAdSize.LEADER)
      return ((Boolean)this.a.a(z.H)).booleanValue();
    return false;
  }

  private long b(AppLovinAdSize paramAppLovinAdSize)
  {
    if (paramAppLovinAdSize == AppLovinAdSize.BANNER)
      return ((Long)this.a.a(z.E)).longValue();
    if (paramAppLovinAdSize == AppLovinAdSize.MREC)
      return ((Long)this.a.a(z.G)).longValue();
    if (paramAppLovinAdSize == AppLovinAdSize.LEADER)
      return ((Long)this.a.a(z.I)).longValue();
    return 0L;
  }

  private void c(AppLovinAdSize paramAppLovinAdSize)
  {
    long l = b(paramAppLovinAdSize);
    if (l > 0L)
    {
      f localf = new f(this, paramAppLovinAdSize);
      this.a.a().a(localf, aq.a, 1000L * (l + 2L));
    }
  }

  public void a(AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType, AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    int i = 1;
    if (paramAppLovinAdSize == null)
      throw new IllegalArgumentException("No ad size specified");
    if (paramAppLovinAdLoadListener == null)
      throw new IllegalArgumentException("No callback specified");
    if (paramAppLovinAdType == null)
      throw new IllegalArgumentException("No ad type specificed");
    e locale = (e)((Map)this.d.get(paramAppLovinAdType)).get(paramAppLovinAdSize);
    while (true)
    {
      synchronized (locale.b)
      {
        if (System.currentTimeMillis() > locale.d)
        {
          if ((locale.c != null) && (i == 0))
          {
            localAppLovinAd = locale.c;
            if (localAppLovinAd != null)
              paramAppLovinAdLoadListener.adReceived(localAppLovinAd);
          }
        }
        else
        {
          i = 0;
          continue;
        }
        this.b.d("AppLovinAdService", "Loading next ad...");
        e.a(locale).add(paramAppLovinAdLoadListener);
        if (!locale.e)
        {
          locale.e = true;
          a(paramAppLovinAdSize, paramAppLovinAdType);
        }
      }
      AppLovinAd localAppLovinAd = null;
    }
  }

  public void addAdUpdateListener(AppLovinAdUpdateListener paramAppLovinAdUpdateListener)
  {
    addAdUpdateListener(paramAppLovinAdUpdateListener, AppLovinAdSize.BANNER);
  }

  public void addAdUpdateListener(AppLovinAdUpdateListener paramAppLovinAdUpdateListener, AppLovinAdSize paramAppLovinAdSize)
  {
    if (paramAppLovinAdUpdateListener == null)
      throw new IllegalArgumentException("No ad listener specified");
    e locale = (e)((Map)this.d.get(AppLovinAdType.REGULAR)).get(paramAppLovinAdSize);
    while (true)
    {
      synchronized (locale.b)
      {
        if (!e.b(locale).contains(paramAppLovinAdUpdateListener))
        {
          e.b(locale).add(paramAppLovinAdUpdateListener);
          i = 1;
          this.b.d("AppLovinAdService", "Added update listener: " + paramAppLovinAdUpdateListener);
          if (i != 0)
          {
            f localf = new f(this, paramAppLovinAdSize);
            this.a.a().a(localf, aq.a);
          }
          return;
        }
      }
      int i = 0;
    }
  }

  public boolean hasPreloadedAd(AppLovinAdSize paramAppLovinAdSize)
  {
    return this.c.b(paramAppLovinAdSize, AppLovinAdType.REGULAR);
  }

  public void loadNextAd(AppLovinAdSize paramAppLovinAdSize, AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    a(paramAppLovinAdSize, AppLovinAdType.REGULAR, paramAppLovinAdLoadListener);
  }

  public void loadNextAd(String paramString, AppLovinAdLoadListener paramAppLovinAdLoadListener)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No ad ID specified");
    if (paramAppLovinAdLoadListener == null)
      throw new IllegalArgumentException("No callback specified");
    ah localah = new ah(paramString, paramAppLovinAdLoadListener, this.a);
    this.a.a().a(localah, aq.a);
  }

  public void preloadAd(AppLovinAdSize paramAppLovinAdSize)
  {
    this.c.a(paramAppLovinAdSize, AppLovinAdType.REGULAR);
  }

  public void removeAdUpdateListener(AppLovinAdUpdateListener paramAppLovinAdUpdateListener, AppLovinAdSize paramAppLovinAdSize)
  {
    if (paramAppLovinAdUpdateListener == null)
      return;
    e locale = (e)((Map)this.d.get(AppLovinAdType.REGULAR)).get(paramAppLovinAdSize);
    synchronized (locale.b)
    {
      e.b(locale).remove(paramAppLovinAdUpdateListener);
      this.b.d("AppLovinAdService", "Removed update listener: " + paramAppLovinAdUpdateListener);
      return;
    }
  }

  public void trackAdClick(AppLovinAd paramAppLovinAd)
  {
    if (paramAppLovinAd == null)
      throw new IllegalArgumentException("No ad specified");
    AppLovinAdInternal localAppLovinAdInternal = (AppLovinAdInternal)paramAppLovinAd;
    ay localay = new ay(paramAppLovinAd, this.a);
    this.a.a().a(localay, aq.a, 500L);
    e locale = (e)((Map)this.d.get(localAppLovinAdInternal.getType())).get(localAppLovinAdInternal.getSize());
    synchronized (locale.b)
    {
      locale.c = null;
      locale.d = 0L;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
