package com.spotify.mobile.android.provider;

import android.net.Uri;

public final class c
{
  public static final Uri a = Uri.parse(SpotifyProvider.a + "/collection");

  public static Uri a()
  {
    return a("", false);
  }

  public static Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/collection/artist/" + paramString);
  }

  public static Uri a(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(SpotifyProvider.a).append("/collection/tracks");
    if (paramBoolean);
    for (String str = "/offline"; ; str = "")
      return Uri.parse(str + "?filter=" + Uri.encode(paramString));
  }

  public static Uri b(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/collection/artist/" + paramString + "/tracks");
  }

  public static Uri b(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(SpotifyProvider.a).append("/collection/artists");
    if (paramBoolean);
    for (String str = "/offline"; ; str = "")
      return Uri.parse(str + "?filter=" + Uri.encode(paramString));
  }

  public static Uri c(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/collection/album/" + paramString);
  }

  public static Uri c(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(SpotifyProvider.a).append("/collection/albums");
    if (paramBoolean);
    for (String str = "/offline"; ; str = "")
      return Uri.parse(str + "?filter=" + Uri.encode(paramString));
  }

  public static Uri d(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/collection/album/" + paramString + "/tracks");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
