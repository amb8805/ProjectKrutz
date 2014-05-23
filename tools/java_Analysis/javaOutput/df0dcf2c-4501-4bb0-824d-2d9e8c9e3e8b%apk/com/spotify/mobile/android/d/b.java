package com.spotify.mobile.android.d;

import android.os.Handler;

public final class b extends d
{
  private boolean a;
  private Handler b = new Handler();
  private Runnable c = new b.1(this);

  public b(h paramh)
  {
    super("Idle");
    b.2 local2 = new b.2(this, paramh);
    b.3 local3 = new b.3(this, paramh);
    b.4 local4 = new b.4(this, paramh);
    b.5 local5 = new b.5(this, paramh);
    paramh.a().a(local2);
    paramh.b().a(local3);
    paramh.c().a(local4);
    paramh.h().a(local5);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
