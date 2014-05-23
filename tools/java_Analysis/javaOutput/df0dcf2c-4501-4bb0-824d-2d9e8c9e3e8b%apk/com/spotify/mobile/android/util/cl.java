package com.spotify.mobile.android.util;

import java.util.concurrent.TimeUnit;

public final class cl
  implements ck
{
  private final long a;

  public cl(long paramLong, TimeUnit paramTimeUnit)
  {
    this.a = paramTimeUnit.toMillis(paramLong);
  }

  public final long a(int paramInt)
  {
    long l1 = this.a << paramInt;
    long l2 = ()(0.3333333333333333D * l1 * Math.random());
    if (l2 % 2L == 0L)
      l2 = -l2;
    return l2 + l1;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
