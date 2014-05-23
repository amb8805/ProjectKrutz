package com.spotify.mobile.android.provider;

import android.net.Uri;
import com.spotify.mobile.android.util.cc;

public final class z
{
  public static final Uri a(String paramString)
  {
    cc.a(paramString, "You must specify a test name when fetching the test group.");
    cc.a(paramString, "You must specify a non-empty test name when fetchin the test group");
    return Uri.parse(SpotifyProvider.a + "/test_group/" + paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.provider.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
