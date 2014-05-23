package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

final class q
  implements Application.ActivityLifecycleCallbacks
{
  private final l a;
  private boolean b = false;
  private Integer c;
  private final long d = 2000L;

  public q(l paraml)
  {
    this.a = paraml;
  }

  private void a(Activity paramActivity)
  {
    if (paramActivity == null);
    while (!i.a(paramActivity.getApplicationContext()))
      return;
    long l = System.currentTimeMillis();
    this.b = true;
    this.a.b().a(new q.1(this, l, paramActivity), paramActivity);
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    Configuration localConfiguration = paramActivity.getResources().getConfiguration();
    if ((this.c != null) && (localConfiguration.orientation != this.c.intValue()));
    for (int i = 1; ; i = 0)
    {
      if ((i == 0) && (paramActivity.isTaskRoot()))
        a(paramActivity);
      this.c = Integer.valueOf(localConfiguration.orientation);
      return;
    }
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
  }

  public final void onActivityPaused(Activity paramActivity)
  {
  }

  public final void onActivityResumed(Activity paramActivity)
  {
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
    if ((!this.b) && (paramActivity.isTaskRoot()))
    {
      this.c = Integer.valueOf(paramActivity.getResources().getConfiguration().orientation);
      a(paramActivity);
    }
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
