package com.spotify.mobile.android.d;

import android.os.Handler;

public final class a extends d
{
  private Handler a = new Handler();
  private Runnable b = new a.1(this);

  public a()
  {
    super("Foreground");
  }

  public final void a()
  {
    this.a.removeCallbacks(this.b);
    super.a();
  }

  public final void b()
  {
    this.a.removeCallbacks(this.b);
    this.a.postDelayed(this.b, 1000L);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
