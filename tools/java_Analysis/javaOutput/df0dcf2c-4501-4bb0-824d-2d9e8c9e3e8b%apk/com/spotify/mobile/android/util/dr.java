package com.spotify.mobile.android.util;

import android.os.SystemClock;

public final class dr
{
  private long a = SystemClock.uptimeMillis();

  public dr()
  {
  }

  public final long a()
  {
    long l1 = SystemClock.uptimeMillis();
    long l2 = l1 - this.a;
    this.a = l1;
    return l2;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
