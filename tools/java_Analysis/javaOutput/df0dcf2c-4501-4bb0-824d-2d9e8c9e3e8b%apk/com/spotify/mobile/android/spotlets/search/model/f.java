package com.spotify.mobile.android.spotlets.search.model;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.provider.aa;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.cc;

public final class f extends e<SearchResults.Track>
  implements m
{
  public static final String[] a = { "_id", "uri", "is_starred", "is_queued", "is_queueable", "offline_state", "is_radio_available", "is_artist_browsable", "is_album_browsable", "is_in_collection", "is_available", "is_playing", "album_image_uri" };
  private final long b;
  private final boolean c;
  private final boolean d;
  private final boolean e;
  private final boolean f;
  private final boolean g;
  private final boolean h;
  private final int i;
  private boolean j;

  public f(SearchResults.Track paramTrack, Cursor paramCursor)
  {
    super(paramTrack, paramCursor, "uri");
    this.b = ((Cursor)cc.a(paramCursor)).getLong(paramCursor.getColumnIndexOrThrow((String)cc.a("_id")));
    this.f = am.a(paramCursor, "is_queued");
    this.g = am.a(paramCursor, "is_queueable");
    boolean bool2;
    if ((am.a(paramCursor, "is_artist_browsable")) && (paramTrack.mainArtist() != null) && (!TextUtils.isEmpty(paramTrack.mainArtist().uri)))
    {
      bool2 = bool1;
      this.d = bool2;
      if ((!am.a(paramCursor, "is_album_browsable")) || (paramTrack.album == null) || (TextUtils.isEmpty(paramTrack.album.uri)))
        break label179;
    }
    while (true)
    {
      this.e = bool1;
      this.j = am.a(paramCursor, "is_starred");
      this.h = am.a(paramCursor, "is_in_collection");
      this.c = am.a(paramCursor, "is_radio_available");
      this.i = am.b(paramCursor, "offline_state");
      return;
      bool2 = false;
      break;
      label179: bool1 = false;
    }
  }

  public static Uri a(SearchResults.Track paramTrack)
  {
    return aa.a(paramTrack.uri);
  }

  public final boolean a()
  {
    return false;
  }

  public final String b()
  {
    return null;
  }

  public final boolean c()
  {
    return false;
  }

  public final boolean d()
  {
    return this.e;
  }

  public final boolean e()
  {
    return this.f;
  }

  public final long f()
  {
    return this.b;
  }

  public final boolean g()
  {
    return this.h;
  }

  public final String h()
  {
    return ((SearchResults.Track)t()).uri;
  }

  public final int i()
  {
    return this.i;
  }

  public final boolean j()
  {
    return this.c;
  }

  public final boolean k()
  {
    return this.g;
  }

  public final String l()
  {
    SearchResults.Artist localArtist = ((SearchResults.Track)t()).mainArtist();
    if (localArtist != null)
      return localArtist.getUri();
    return null;
  }

  public final String m()
  {
    SearchResults.Artist localArtist = ((SearchResults.Track)t()).mainArtist();
    if (localArtist != null)
      return localArtist.getName();
    return null;
  }

  public final String n()
  {
    if (((SearchResults.Track)t()).album != null)
      return ((SearchResults.Track)t()).album.uri;
    return null;
  }

  public final String o()
  {
    if (((SearchResults.Track)t()).album != null)
      return ((SearchResults.Track)t()).album.name;
    return null;
  }

  public final String p()
  {
    return ((SearchResults.Track)t()).name;
  }

  public final boolean q()
  {
    return false;
  }

  public final String r()
  {
    return null;
  }

  public final boolean s()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
