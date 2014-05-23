package com.spotify.mobile.android.provider;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;

public final class p
{
  public static Uri a()
  {
    return a(Metadata.PlaylistFilter.a, "");
  }

  public static Uri a(Metadata.PlaylistFilter paramPlaylistFilter)
  {
    return a(paramPlaylistFilter, "");
  }

  public static Uri a(Metadata.PlaylistFilter paramPlaylistFilter, String paramString)
  {
    String str = Uri.encode(paramString);
    switch (Metadata.1.a[paramPlaylistFilter.ordinal()])
    {
    default:
      Assertion.a("unkown playlist filter type: " + paramPlaylistFilter);
      return Uri.EMPTY;
    case 1:
      return Uri.parse(SpotifyProvider.a + "/playlists?filter=" + str);
    case 2:
      return Uri.parse(SpotifyProvider.a + "/playlists/offline?filter=" + str);
    case 3:
      return Uri.parse(SpotifyProvider.a + "/playlists/writable?filter=" + str);
    case 4:
    }
    return Uri.parse(SpotifyProvider.a + "/playlists/not_offline?filter=" + str);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
