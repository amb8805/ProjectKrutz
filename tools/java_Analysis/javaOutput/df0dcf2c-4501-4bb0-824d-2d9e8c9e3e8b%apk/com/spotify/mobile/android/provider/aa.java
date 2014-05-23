package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class aa
  implements BaseColumns
{
  public static Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/track/" + paramString);
  }

  public static Uri a(String paramString1, String paramString2)
  {
    return Uri.parse(SpotifyProvider.a + "/track/" + paramString1 + "?source_uri=" + Uri.encode(paramString2));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
