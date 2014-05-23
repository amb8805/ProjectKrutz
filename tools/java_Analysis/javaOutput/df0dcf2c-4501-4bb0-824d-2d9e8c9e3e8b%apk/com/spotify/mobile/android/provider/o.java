package com.spotify.mobile.android.provider;

import android.net.Uri;

public final class o extends ab
{
  public static final Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/playlist/" + Uri.encode(paramString));
  }

  public static Uri a(String paramString, int paramInt)
  {
    return Uri.parse(SpotifyProvider.a + "/playlist/" + Uri.encode(paramString) + "/suggested_tracks/" + paramInt);
  }

  public static final Uri a(String paramString1, String paramString2)
  {
    if (paramString2 == null)
      paramString2 = "";
    return Uri.parse(SpotifyProvider.a + "/playlist/" + Uri.encode(paramString1) + "/tracks?filter=" + Uri.encode(paramString2));
  }

  public static final Uri b(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/playlist/" + Uri.encode(paramString) + "/tracks");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
