package com.mixpanel.android.mpmetrics;

import java.util.concurrent.locks.ReentrantLock;

final class m
{
  private final ReentrantLock a = new ReentrantLock();
  private boolean b;
  private long c;
  private final long d = 10000L;

  private m()
  {
  }

  public final boolean a()
  {
    if (this.a.tryLock())
      try
      {
        if ((this.c > 0L) && (System.currentTimeMillis() - this.c > this.d))
          b();
        if (!this.b)
        {
          this.c = System.currentTimeMillis();
          this.b = true;
          return true;
        }
        return false;
      }
      finally
      {
        this.a.unlock();
      }
    return false;
  }

  public final void b()
  {
    if (this.a.tryLock())
      try
      {
        this.b = false;
        this.c = 0L;
        return;
      }
      finally
      {
        this.a.unlock();
      }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
