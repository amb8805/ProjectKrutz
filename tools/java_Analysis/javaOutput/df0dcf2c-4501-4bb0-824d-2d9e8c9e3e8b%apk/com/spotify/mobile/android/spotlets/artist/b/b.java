package com.spotify.mobile.android.spotlets.artist.b;

import android.text.TextUtils;

public abstract class b
{
  private final String a;

  b(String paramString)
  {
    this.a = paramString;
  }

  protected abstract String a();

  public final String e()
  {
    return this.a;
  }

  public final String f()
  {
    if (TextUtils.isEmpty(a()));
    for (String str = ""; ; str = ":" + a())
      return "spotify:artist:" + this.a + str;
  }

  public String g()
  {
    return "hm://artist/v1/" + this.a + "/android?format=json";
  }

  public String toString()
  {
    return f();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
