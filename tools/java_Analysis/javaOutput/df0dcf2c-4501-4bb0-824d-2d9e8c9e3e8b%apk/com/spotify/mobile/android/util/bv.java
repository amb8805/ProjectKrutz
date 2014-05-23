package com.spotify.mobile.android.util;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class bv
{
  private ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
  private Handler b = new Handler();
  private Map<Runnable, ScheduledFuture<?>> c = new HashMap();

  public bv()
  {
  }

  public final void a(Runnable paramRunnable)
  {
    ScheduledFuture localScheduledFuture = (ScheduledFuture)this.c.get(paramRunnable);
    if (localScheduledFuture == null)
      return;
    this.c.remove(paramRunnable);
    localScheduledFuture.cancel(false);
  }

  public final void a(Runnable paramRunnable, int paramInt)
  {
    bw localbw = new bw(this, paramRunnable);
    ScheduledFuture localScheduledFuture = this.a.scheduleAtFixedRate(localbw, paramInt, 1000L, TimeUnit.MILLISECONDS);
    this.c.put(paramRunnable, localScheduledFuture);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
