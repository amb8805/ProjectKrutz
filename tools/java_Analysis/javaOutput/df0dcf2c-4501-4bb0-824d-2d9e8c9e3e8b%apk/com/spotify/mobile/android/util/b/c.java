package com.spotify.mobile.android.util.b;

import android.content.Context;
import com.spotify.mobile.android.provider.v;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cr;

public final class c
{
  private static final String[] a = { "country_code", "product_type" };

  public static void a(Context paramContext, SpotifyLink paramSpotifyLink)
  {
    cc.a(paramSpotifyLink.g(), "Only use with tracked links");
    new cr(paramContext, new c.1(paramContext, paramSpotifyLink)).a(v.a, a, null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
