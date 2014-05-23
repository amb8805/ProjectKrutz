package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.util.Base64;

public final class i
{
  public static Uri a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return Uri.EMPTY;
    return Uri.parse(SpotifyProvider.a + "/image/" + paramString);
  }

  public static Uri b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return Uri.EMPTY;
    return Uri.parse(SpotifyProvider.a + "/image/" + Base64.encodeToString(paramString.getBytes(), 0));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
