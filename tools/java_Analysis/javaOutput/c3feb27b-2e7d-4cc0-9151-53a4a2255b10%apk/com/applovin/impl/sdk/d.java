package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdUpdateListener;
import com.applovin.sdk.AppLovinLogger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

class d
  implements AppLovinAdLoadListener
{
  private final e b;

  private d(b paramb, e parame)
  {
    this.b = parame;
  }

  public void adReceived(AppLovinAd paramAppLovinAd)
  {
    HashSet localHashSet2;
    while (true)
    {
      synchronized (this.b.b)
      {
        if (b.a(this.a, this.b.a))
        {
          long l = b.b(this.a, this.b.a);
          if (l > 0L)
          {
            this.b.d = (System.currentTimeMillis() + l * 1000L);
            this.b.c = paramAppLovinAd;
            HashSet localHashSet1 = new HashSet(e.a(this.b));
            e.a(this.b).clear();
            localHashSet2 = new HashSet(e.b(this.b));
            this.b.e = false;
            b.c(this.a, this.b.a);
            Iterator localIterator1 = localHashSet1.iterator();
            if (!localIterator1.hasNext())
              break;
            AppLovinAdLoadListener localAppLovinAdLoadListener = (AppLovinAdLoadListener)localIterator1.next();
            try
            {
              localAppLovinAdLoadListener.adReceived(paramAppLovinAd);
            }
            catch (Throwable localThrowable2)
            {
              b.a(this.a).e("AppLovinAdService", "Unable to notify listener about a newly loaded ad", localThrowable2);
            }
            continue;
          }
          if (l != 0L)
            continue;
          this.b.d = 9223372036854775807L;
        }
      }
      this.b.c = null;
      this.b.d = 0L;
    }
    Iterator localIterator2 = localHashSet2.iterator();
    while (localIterator2.hasNext())
    {
      AppLovinAdUpdateListener localAppLovinAdUpdateListener = (AppLovinAdUpdateListener)localIterator2.next();
      try
      {
        localAppLovinAdUpdateListener.adUpdated(paramAppLovinAd);
      }
      catch (Throwable localThrowable1)
      {
        b.a(this.a).e("AppLovinAdService", "Unable to notify listener about an updated loaded ad", localThrowable1);
      }
    }
  }

  public void failedToReceiveAd(int paramInt)
  {
    synchronized (this.b.b)
    {
      HashSet localHashSet = new HashSet(e.a(this.b));
      e.a(this.b).clear();
      this.b.e = false;
      Iterator localIterator = localHashSet.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          AppLovinAdLoadListener localAppLovinAdLoadListener = (AppLovinAdLoadListener)localIterator.next();
          try
          {
            localAppLovinAdLoadListener.failedToReceiveAd(paramInt);
          }
          catch (Throwable localThrowable)
          {
            b.a(this.a).e("AppLovinAdService", "Unable to notify listener about ad load failure", localThrowable);
          }
        }
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
