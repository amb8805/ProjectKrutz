package com.spotify.mobile.android.util;

import android.os.SystemClock;
import com.spotify.mobile.android.c.a;
import net.hockeyapp.android.d;

public class cu
  implements a
{
  private long a = -9223372036854775808L;

  static
  {
    com.spotify.mobile.android.c.c.a(cu.class, al.class, new al());
  }

  public cu()
  {
  }

  public final void a(Throwable paramThrowable)
  {
    long l = SystemClock.elapsedRealtime();
    if (l > 30000L + this.a)
    {
      d.a(paramThrowable, (net.hockeyapp.android.c)com.spotify.mobile.android.c.c.a(da.class));
      this.a = l;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
