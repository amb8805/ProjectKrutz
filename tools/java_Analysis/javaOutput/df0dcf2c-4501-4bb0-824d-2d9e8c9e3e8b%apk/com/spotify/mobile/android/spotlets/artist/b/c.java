package com.spotify.mobile.android.spotlets.artist.b;

import java.util.regex.Pattern;

public final class c extends b
{
  static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+):biography");

  c(String paramString)
  {
    super(paramString);
  }

  public final String a()
  {
    return "biography";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
