package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinLogger;

public class AppLovinEventServiceImpl
  implements AppLovinEventService
{
  public static final String KEY_LAST_SESSION_TS = "ALEventServicePauseTS";
  public static final String TAG = "EventServiceImpl";
  private AppLovinSdkImpl a;
  private AppLovinLogger b;
  private Object c = new Object();
  private s d;

  AppLovinEventServiceImpl(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
    this.d = paramAppLovinSdkImpl.getEventManager();
  }

  private void a()
  {
    this.b.d("EventServiceImpl", "Starting new user session...");
    this.d.e();
    long l = System.currentTimeMillis();
    b(l);
    this.d.a(AppLovinEvent.a("start", l));
  }

  private void a(long paramLong)
  {
    synchronized (this.c)
    {
      this.b.d("EventServiceImpl", "Closing old session from ts: " + paramLong);
      this.d.a(AppLovinEvent.a("end", paramLong));
      b(-1L);
      return;
    }
  }

  private SharedPreferences b()
  {
    return this.a.getSettingsManager().a();
  }

  private void b(long paramLong)
  {
    SharedPreferences.Editor localEditor = b().edit();
    localEditor.putLong("ALEventServicePauseTS", paramLong);
    localEditor.commit();
  }

  public void trackRevenueEvent(String paramString1, double paramDouble, String paramString2)
  {
    this.d.a(AppLovinEvent.a(paramString1, paramDouble, paramString2));
  }

  public void trackSessionEnd()
  {
    a(System.currentTimeMillis());
  }

  public void trackSessionPause()
  {
    this.b.d("EventServiceImpl", "Pausing current session.");
    b(System.currentTimeMillis());
  }

  public void trackSessionStart()
  {
    while (true)
    {
      synchronized (this.c)
      {
        long l1 = b().getLong("ALEventServicePauseTS", -1L);
        long l2 = l1 + 1000L * ((Long)this.a.a(z.Q)).longValue();
        if (System.currentTimeMillis() > l2)
        {
          i = 1;
          if (i != 0)
          {
            if (l1 > 0L)
              a(l1);
            a();
            return;
          }
          this.b.d("EventServiceImpl", "Resuming old session from ts: " + l1);
          b(System.currentTimeMillis());
        }
      }
      int i = 0;
    }
  }

  public void uploadEvents()
  {
    this.d.c();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.AppLovinEventServiceImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
