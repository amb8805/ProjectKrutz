package com.spotify.mobile.android.provider;

import android.net.Uri;

public final class g
{
  public static final Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/folder-union/" + Uri.encode(paramString) + "/tracks");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
