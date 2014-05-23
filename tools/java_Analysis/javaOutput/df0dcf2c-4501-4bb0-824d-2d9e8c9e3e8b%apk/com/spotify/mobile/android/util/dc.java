package com.spotify.mobile.android.util;

import android.net.Uri;
import com.spotify.mobile.android.provider.a;
import com.spotify.mobile.android.provider.aa;
import com.spotify.mobile.android.provider.b;
import com.spotify.mobile.android.provider.c;
import com.spotify.mobile.android.provider.o;

public final class dc
{
  public static Uri a(SpotifyLink paramSpotifyLink)
  {
    switch (dc.1.a[paramSpotifyLink.a().ordinal()])
    {
    default:
      Assertion.a("Missing support to get content uri for this type. Type: " + paramSpotifyLink.a());
      return null;
    case 1:
      return b.c(paramSpotifyLink.d());
    case 2:
      return c.b(paramSpotifyLink.d());
    case 3:
    case 4:
    case 5:
      return o.b(paramSpotifyLink.d());
    case 6:
      return a.b(paramSpotifyLink.d());
    case 7:
      return c.d(paramSpotifyLink.d());
    case 8:
    }
    return aa.a(paramSpotifyLink.d());
  }

  public static String a(String paramString)
  {
    return paramString.replace("radio:", "");
  }

  public static Boolean b(SpotifyLink paramSpotifyLink)
  {
    String str = paramSpotifyLink.d();
    if ((str == null) || (str.indexOf(":") == -1))
      return Boolean.valueOf(false);
    String[] arrayOfString = str.split(":");
    if (("radio".equalsIgnoreCase(arrayOfString[1])) && ("genre".equalsIgnoreCase(arrayOfString[2])))
      return Boolean.valueOf(true);
    return Boolean.valueOf(false);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
