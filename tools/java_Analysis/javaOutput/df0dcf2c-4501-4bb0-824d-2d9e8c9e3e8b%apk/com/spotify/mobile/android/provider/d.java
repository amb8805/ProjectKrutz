package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class d
  implements BaseColumns
{
  public static final Uri a = Uri.parse(SpotifyProvider.a + "/devices");

  public static Uri a(String paramString)
  {
    return Uri.withAppendedPath(a, Uri.encode(paramString));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
