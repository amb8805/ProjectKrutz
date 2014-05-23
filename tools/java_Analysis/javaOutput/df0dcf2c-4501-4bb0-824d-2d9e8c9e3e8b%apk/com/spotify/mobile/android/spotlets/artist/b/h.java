package com.spotify.mobile.android.spotlets.artist.b;

import com.google.common.base.i;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h
{
  public static a a(String paramString)
  {
    return new a(a(paramString, a.a));
  }

  private static String a(String paramString, Pattern paramPattern)
  {
    Matcher localMatcher = paramPattern.matcher(paramString);
    i.a(localMatcher.matches());
    return localMatcher.group(1);
  }

  public static b b(String paramString)
  {
    if (a.a.matcher(paramString).matches())
      return a(paramString);
    if (c.a.matcher(paramString).matches())
      return new c(a(paramString, c.a));
    if (e.a.matcher(paramString).matches())
      return new e(a(paramString, e.a));
    if (d.a.matcher(paramString).matches())
      return new d(a(paramString, d.a));
    if (f.a.matcher(paramString).matches())
      return new f(a(paramString, f.a));
    if (g.a.matcher(paramString).matches())
    {
      Matcher localMatcher = g.a.matcher(paramString);
      i.a(localMatcher.matches());
      return new g(localMatcher.group(1), ArtistModel.ReleaseType.valueOf(localMatcher.group(2).toUpperCase(Locale.US)));
    }
    throw new RuntimeException("Unknown URI: " + paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
