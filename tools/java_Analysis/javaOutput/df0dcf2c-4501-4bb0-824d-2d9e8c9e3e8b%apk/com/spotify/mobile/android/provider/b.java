package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class b
  implements BaseColumns
{
  public static Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/artist/" + paramString);
  }

  public static Uri b(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/artist/" + paramString + "/top_tracks");
  }

  public static Uri c(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/artist/" + paramString + "/extended_top_tracks");
  }

  public static Uri d(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/artist/" + paramString + "/albums");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
