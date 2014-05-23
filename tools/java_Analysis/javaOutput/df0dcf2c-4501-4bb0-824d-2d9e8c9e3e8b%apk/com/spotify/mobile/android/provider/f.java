package com.spotify.mobile.android.provider;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;

public final class f
{
  public static final Uri a(String paramString)
  {
    return Uri.parse(SpotifyProvider.a + "/folder/" + Uri.encode(paramString));
  }

  public static final Uri a(String paramString, Metadata.PlaylistFilter paramPlaylistFilter)
  {
    return a(paramString, paramPlaylistFilter, "");
  }

  private static Uri a(String paramString1, Metadata.PlaylistFilter paramPlaylistFilter, String paramString2)
  {
    switch (Metadata.1.a[paramPlaylistFilter.ordinal()])
    {
    case 2:
    default:
      Assertion.a("unkown playlist filter type: " + paramPlaylistFilter);
      return Uri.EMPTY;
    case 1:
      return Uri.parse(SpotifyProvider.a + "/folder/" + paramString1 + "/playlists?filter=" + Uri.encode(paramString2));
    case 3:
    }
    return Uri.parse(SpotifyProvider.a + "/folder/" + paramString1 + "/playlists/writable?filter=" + Uri.encode(paramString2));
  }

  public static final Uri a(String paramString1, String paramString2)
  {
    return a(paramString1, Metadata.PlaylistFilter.a, paramString2);
  }

  public static final Uri b(String paramString)
  {
    return a(paramString, Metadata.PlaylistFilter.a, "");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
