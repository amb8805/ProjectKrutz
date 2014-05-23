package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class y
  implements BaseColumns
{
  public static Uri a(int paramInt1, int paramInt2)
  {
    return Uri.parse(SpotifyProvider.a + "/stories/skip/" + paramInt1 + "/take/" + paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
