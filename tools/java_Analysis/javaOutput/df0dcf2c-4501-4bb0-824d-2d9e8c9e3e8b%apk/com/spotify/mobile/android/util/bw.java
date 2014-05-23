package com.spotify.mobile.android.util;

import android.os.Handler;

final class bw
  implements Runnable
{
  private Runnable b;

  public bw(bv parambv, Runnable paramRunnable)
  {
    this.b = paramRunnable;
  }

  public final void run()
  {
    bv.a(this.a).post(this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
