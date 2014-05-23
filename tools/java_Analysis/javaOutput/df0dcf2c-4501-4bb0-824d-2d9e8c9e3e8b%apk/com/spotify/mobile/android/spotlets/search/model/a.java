package com.spotify.mobile.android.spotlets.search.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Collection;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.i;

public final class a extends e<SearchResults.Album>
  implements com.spotify.mobile.android.model.a
{
  public static final String[] a = { "uri", "is_radio_available", "is_queueable", "is_artist_browsable", "is_radio_available", "tracks_in_collection_count", "tracks_count", "is_playing" };
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final Collection.State e;

  public a(SearchResults.Album paramAlbum, Cursor paramCursor)
  {
    super(paramAlbum, paramCursor, "uri");
    this.b = am.a(paramCursor, "is_radio_available");
    if ((am.a(paramCursor, "is_artist_browsable")) && (paramAlbum.mainArtist() != null) && (!TextUtils.isEmpty(i())) && (!i.a(g())));
    for (boolean bool = true; ; bool = false)
    {
      this.c = bool;
      this.d = am.a(paramCursor, "is_queueable");
      int i = am.b(paramCursor, "tracks_in_collection_count");
      this.e = Collection.a(am.b(paramCursor, "tracks_count"), i);
      return;
    }
  }

  public final Collection.State a()
  {
    return this.e;
  }

  public final int c()
  {
    return 0;
  }

  public final boolean d()
  {
    return false;
  }

  public final String e()
  {
    return null;
  }

  public final int f()
  {
    return 0;
  }

  public final String g()
  {
    SearchResults.Artist localArtist = ((SearchResults.Album)t()).mainArtist();
    if (localArtist != null)
      return localArtist.getName();
    return null;
  }

  public final boolean h()
  {
    return this.c;
  }

  public final String i()
  {
    SearchResults.Artist localArtist = ((SearchResults.Album)t()).mainArtist();
    if (localArtist != null)
      return localArtist.getUri();
    return null;
  }

  public final boolean j()
  {
    return this.b;
  }

  public final boolean k()
  {
    return this.d;
  }

  public final boolean m()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
