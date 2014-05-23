package com.spotify.mobile.android.util;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.spotify.mobile.android.orbit.OrbitSessionInterface;

public final class h
{
  private final Context a;
  private final Handler b = new Handler();
  private final OrbitSessionInterface c;

  public h(Context paramContext, OrbitSessionInterface paramOrbitSessionInterface)
  {
    this.a = paramContext;
    this.c = paramOrbitSessionInterface;
  }

  public final void a()
  {
    Toast.makeText(this.a, 2131690329, 1).show();
    this.b.postDelayed(new h.1(this), 3000L);
    this.b.postDelayed(new h.2(this), 6000L);
    this.b.postDelayed(new h.3(this), 9000L);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
