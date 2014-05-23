package com.spotify.mobile.android.spotlets.search.model;

import android.database.Cursor;
import android.net.Uri;
import com.spotify.mobile.android.util.am;

public final class b extends e<SearchResults.Artist>
  implements com.spotify.mobile.android.model.b
{
  public static final String[] a = { "uri", "is_radio_available" };
  private final boolean b;

  public b(SearchResults.Artist paramArtist, Cursor paramCursor)
  {
    super(paramArtist, paramCursor, "uri");
    this.b = am.a(paramCursor, "is_radio_available");
  }

  public static Uri a(SearchResults.Artist paramArtist)
  {
    return com.spotify.mobile.android.provider.b.a(paramArtist.uri);
  }

  public final int a()
  {
    return 0;
  }

  public final int c()
  {
    return 0;
  }

  public final String d()
  {
    return null;
  }

  public final boolean e()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
