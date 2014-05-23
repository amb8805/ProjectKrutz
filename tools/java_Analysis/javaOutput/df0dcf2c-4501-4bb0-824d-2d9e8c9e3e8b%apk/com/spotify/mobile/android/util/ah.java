package com.spotify.mobile.android.util;

import java.util.concurrent.atomic.AtomicInteger;

public final class ah
{
  private final AtomicInteger a;
  private final Runnable b;
  private final int c;

  public ah(Runnable paramRunnable)
  {
    cc.a(true, "Countdown must be initialized with positive value.");
    this.c = 32;
    this.a = new AtomicInteger(32);
    this.b = paramRunnable;
  }

  public final void a()
  {
    if (this.a.get() <= 0);
    while (this.a.getAndDecrement() != 1)
      return;
    this.b.run();
  }

  public final void b()
  {
    this.a.set(this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
