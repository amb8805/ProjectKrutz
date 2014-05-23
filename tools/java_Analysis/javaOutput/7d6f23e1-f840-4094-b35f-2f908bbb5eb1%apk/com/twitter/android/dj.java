package com.twitter.android;

import com.twitter.android.client.g;
import cr;

final class dj
  implements Runnable
{
  private dj(DiscoverFragment paramDiscoverFragment)
  {
  }

  public final void run()
  {
    long[] arrayOfLong = cr.b(this.a.b);
    if (arrayOfLong != null)
      this.a.j.b(arrayOfLong);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
