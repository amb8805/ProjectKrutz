package com.spotify.mobile.android.util;

import android.content.Context;
import android.os.SystemClock;

public abstract class dt
{
  protected Context a;
  protected ViewUri.Verified b;
  private long c = 0L;

  protected dt(Context paramContext, ViewUri.Verified paramVerified)
  {
    this.a = paramContext;
    this.b = paramVerified;
  }

  public final void a()
  {
    if (this.c < 1L)
      this.c = SystemClock.elapsedRealtime();
  }

  protected abstract void a(long paramLong);

  public final void b()
  {
    long l = SystemClock.elapsedRealtime() - this.c;
    if (this.c > 0L);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "Trying to leave an already left or not entered view.");
      if (l > 20L)
        a(l);
      this.c = 0L;
      return;
    }
  }

  public final ViewUri.Verified c()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
