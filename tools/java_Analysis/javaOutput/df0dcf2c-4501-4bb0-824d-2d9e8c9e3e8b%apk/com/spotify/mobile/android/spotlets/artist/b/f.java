package com.spotify.mobile.android.spotlets.artist.b;

import java.util.regex.Pattern;

public final class f extends b
{
  static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+):related");

  f(String paramString)
  {
    super(paramString);
  }

  public final String a()
  {
    return "related";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
