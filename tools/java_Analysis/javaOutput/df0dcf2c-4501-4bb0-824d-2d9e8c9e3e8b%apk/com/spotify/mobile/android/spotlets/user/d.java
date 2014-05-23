package com.spotify.mobile.android.spotlets.user;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{
  private static final Pattern a = Pattern.compile("user:([^:]+)");

  public static String a(String paramString)
  {
    return "spotify:user:" + Uri.encode(paramString) + ":followers";
  }

  public static String b(String paramString)
  {
    return "spotify:user:" + Uri.encode(paramString) + ":following";
  }

  public static String c(String paramString)
  {
    Matcher localMatcher = a.matcher(paramString);
    if (localMatcher.find())
      return localMatcher.group(1);
    return null;
  }

  public static String d(String paramString)
  {
    return e("spotify:user:" + Uri.encode(paramString));
  }

  public static String e(String paramString)
  {
    return paramString + ":playlists";
  }

  public static String f(String paramString)
  {
    return paramString + ":artists";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
