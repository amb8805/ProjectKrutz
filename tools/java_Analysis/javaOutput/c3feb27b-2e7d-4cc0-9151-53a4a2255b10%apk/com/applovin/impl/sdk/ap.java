package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ap
{
  protected final AppLovinSdkImpl a;
  protected final AppLovinLogger b;
  private final ScheduledExecutorService c;
  private final ScheduledExecutorService d;

  ap(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.c = a("main");
    this.d = a("back");
    this.b = paramAppLovinSdkImpl.getLogger();
  }

  private static void a(Runnable paramRunnable, long paramLong, ScheduledExecutorService paramScheduledExecutorService)
  {
    if (paramLong > 0L)
    {
      paramScheduledExecutorService.schedule(paramRunnable, paramLong, TimeUnit.MILLISECONDS);
      return;
    }
    paramScheduledExecutorService.submit(paramRunnable);
  }

  protected ScheduledExecutorService a(String paramString)
  {
    return Executors.newScheduledThreadPool(1, new as(this, paramString));
  }

  void a(ao paramao, long paramLong)
  {
    if (paramao == null)
      throw new IllegalArgumentException("No task specified");
    a(paramao, paramLong, this.c);
  }

  void a(ar paramar, aq paramaq)
  {
    a(paramar, paramaq, 0L);
  }

  void a(ar paramar, aq paramaq, long paramLong)
  {
    if (paramar == null)
      throw new IllegalArgumentException("No task specified");
    if (paramLong < 0L)
      throw new IllegalArgumentException("Invalid delay specified: " + paramLong);
    this.b.d(paramar.d, "Scheduling " + paramar.d + " on " + paramaq + " queue in " + paramLong + "ms.");
    au localau = new au(this, paramar, paramaq);
    if (paramaq == aq.a)
    {
      a(localau, paramLong, this.c);
      return;
    }
    a(localau, paramLong, this.d);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
