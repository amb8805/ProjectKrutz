package com.spotify.mobile.android.util;

import android.content.Context;
import com.spotify.mobile.android.provider.aa;

public final class af
{
  private static final String[] a = { "album_uri" };
  private final SpotifyLink b;
  private ag c;
  private cr d;

  public af(Context paramContext, SpotifyLink paramSpotifyLink, ag paramag)
  {
    this.b = paramSpotifyLink;
    this.c = paramag;
    this.d = new cr(paramContext, new af.1(this));
  }

  public final void a()
  {
    this.d.a(aa.a(this.b.d()), a, null);
  }

  public final void b()
  {
    if (this.d != null)
    {
      this.d.b();
      this.d = null;
    }
    this.c.a();
    this.c = null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
