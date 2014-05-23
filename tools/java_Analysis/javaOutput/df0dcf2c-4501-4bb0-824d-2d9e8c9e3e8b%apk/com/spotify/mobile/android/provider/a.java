package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class a
  implements BaseColumns
{
  public static Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/album/" + paramString);
  }

  public static Uri a(String paramString1, String paramString2)
  {
    return Uri.parse(SpotifyProvider.a + "/album/" + paramString1 + "?source_uri=" + Uri.encode(paramString2));
  }

  public static Uri b(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/album/" + paramString + "/tracks");
  }

  public static Uri c(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/album/" + Uri.encode(paramString) + "/suggested_tracks");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
