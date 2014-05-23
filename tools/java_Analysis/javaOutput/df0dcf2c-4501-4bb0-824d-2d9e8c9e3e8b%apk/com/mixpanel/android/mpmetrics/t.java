package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class t
{
  private final Executor a = Executors.newSingleThreadExecutor();

  public t()
  {
  }

  public final Future<SharedPreferences> a(Context paramContext, String paramString, v paramv)
  {
    FutureTask localFutureTask = new FutureTask(new u(paramContext, paramString, paramv));
    this.a.execute(localFutureTask);
    return localFutureTask;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
