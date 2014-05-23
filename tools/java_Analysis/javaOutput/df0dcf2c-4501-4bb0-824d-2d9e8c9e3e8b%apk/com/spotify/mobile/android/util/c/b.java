package com.spotify.mobile.android.util.c;

import android.os.Bundle;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class b
{
  private final String a;
  private final int b;
  private final int c;
  private final int d;
  private final SpotifyIcon e;
  private final int f;
  private final c g;

  public b(String paramString, int paramInt1, int paramInt2, int paramInt3, SpotifyIcon paramSpotifyIcon, int paramInt4, c paramc)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.f = paramInt4;
    this.g = paramc;
    this.e = paramSpotifyIcon;
  }

  public final String a()
  {
    return this.a;
  }

  public final boolean b()
  {
    return this.g.a();
  }

  public final Bundle c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("showcase-id", this.a);
    localBundle.putInt("showcase-title", this.b);
    localBundle.putInt("showcase-descr", this.c);
    localBundle.putInt("showcase-icon", this.d);
    if (this.e != null)
      localBundle.putString("showcase-spoticon", this.e.name());
    localBundle.putInt("showcase-image", this.f);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
