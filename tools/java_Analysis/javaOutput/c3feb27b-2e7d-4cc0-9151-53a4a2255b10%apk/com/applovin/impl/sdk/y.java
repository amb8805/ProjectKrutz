package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class y
  implements AppLovinAdLoadListener
{
  private final AppLovinSdkImpl a;
  private final AppLovinLogger b;
  private final String c = "PreloadManager";
  private final Map d;
  private final Object e;

  y(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
    this.e = new Object();
    this.d = new HashMap();
    Iterator localIterator = AppLovinAdType.allTypes().iterator();
    while (localIterator.hasNext())
    {
      AppLovinAdType localAppLovinAdType = (AppLovinAdType)localIterator.next();
      this.d.put(localAppLovinAdType, new HashMap());
    }
  }

  public void a(AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType)
  {
    if ((((Boolean)this.a.a(z.K)).booleanValue()) && (!b(paramAppLovinAdSize, paramAppLovinAdType)))
    {
      this.b.d("PreloadManager", "Preloading ad for size " + paramAppLovinAdSize + "...");
      ai localai = new ai(paramAppLovinAdSize, paramAppLovinAdType, this, this.a);
      localai.a(true);
      this.a.a().a(localai, aq.b, 500L);
    }
  }

  public void adReceived(AppLovinAd paramAppLovinAd)
  {
    AppLovinAdInternal localAppLovinAdInternal = (AppLovinAdInternal)paramAppLovinAd;
    synchronized (this.e)
    {
      ((Map)this.d.get(localAppLovinAdInternal.getType())).put(paramAppLovinAd.getSize(), paramAppLovinAd);
      this.b.d("PreloadManager", "Pulled ad from network and saved to preload cache: " + paramAppLovinAd);
      return;
    }
  }

  public boolean b(AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType)
  {
    while (true)
    {
      synchronized (this.e)
      {
        if (((Map)this.d.get(paramAppLovinAdType)).get(paramAppLovinAdSize) != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }

  public AppLovinAd c(AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType)
  {
    synchronized (this.e)
    {
      AppLovinAd localAppLovinAd = (AppLovinAd)((Map)this.d.get(paramAppLovinAdType)).remove(paramAppLovinAdSize);
      return localAppLovinAd;
    }
  }

  public void failedToReceiveAd(int paramInt)
  {
    this.b.d("PreloadManager", "Failed to pre-load an ad, error code " + paramInt);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
