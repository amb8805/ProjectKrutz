package com.spotify.mobile.android.util.c;

import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.cc;

public final class d
{
  private String a;
  private int b;
  private int c;
  private int d;
  private SpotifyIcon e;
  private int f;
  private c g;

  public d()
  {
  }

  public final b a()
  {
    boolean bool1 = true;
    cc.a(this.a, "Showcase's id not set");
    boolean bool2;
    boolean bool3;
    label37: boolean bool4;
    if (this.b > 0)
    {
      bool2 = bool1;
      cc.a(bool2, "Showcase's title resource not set");
      if (this.c <= 0)
        break label132;
      bool3 = bool1;
      cc.a(bool3, "Showcase's description resource not set");
      if ((this.d <= 0) && (this.e == null))
        break label138;
      bool4 = bool1;
      label61: cc.a(bool4, "Showcase's icon not set");
      if (this.f <= 0)
        break label144;
    }
    while (true)
    {
      cc.a(bool1, "Showcase's image resource not set");
      cc.a(this.g, "Showcase's availability checker not set");
      return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      bool2 = false;
      break;
      label132: bool3 = false;
      break label37;
      label138: bool4 = false;
      break label61;
      label144: bool1 = false;
    }
  }

  public final d a(int paramInt)
  {
    this.b = paramInt;
    return this;
  }

  public final d a(SpotifyIcon paramSpotifyIcon)
  {
    this.e = paramSpotifyIcon;
    return this;
  }

  public final d a(c paramc)
  {
    this.g = paramc;
    return this;
  }

  public final d a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final d b(int paramInt)
  {
    this.c = paramInt;
    return this;
  }

  public final d c(int paramInt)
  {
    this.f = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
