package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class ad
  implements BaseColumns
{
  public static final Uri a = Uri.parse(SpotifyProvider.a + "/user/top_tracks");
  public static final Uri b = Uri.parse(SpotifyProvider.a + "/user/top_artists");
  public static final Uri c = Uri.parse(SpotifyProvider.a + "/user/top_albums");

  public static final Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/user/" + Uri.encode(paramString));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
