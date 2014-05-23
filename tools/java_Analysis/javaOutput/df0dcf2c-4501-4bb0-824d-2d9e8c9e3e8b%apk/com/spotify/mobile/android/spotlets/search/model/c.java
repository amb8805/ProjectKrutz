package com.spotify.mobile.android.spotlets.search.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.provider.o;
import com.spotify.mobile.android.util.am;

public final class c extends e<SearchResults.Playlist>
  implements j
{
  public static final String[] a = { "uri", "is_radio_available", "offline_state", "is_own", "sync_progress", "is_collaborative", "is_published", "is_subscribed" };
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final boolean e;
  private final boolean f;
  private final int g;
  private final int h;

  public c(SearchResults.Playlist paramPlaylist, Cursor paramCursor)
  {
    super(paramPlaylist, paramCursor, "uri");
    this.b = am.a(paramCursor, "is_radio_available");
    this.c = am.a(paramCursor, "is_subscribed");
    this.e = am.a(paramCursor, "is_own");
    this.f = am.a(paramCursor, "is_published");
    this.h = am.b(paramCursor, "sync_progress");
    this.g = am.b(paramCursor, "offline_state");
    this.d = am.a(paramCursor, "is_collaborative");
  }

  public static Uri a(SearchResults.Playlist paramPlaylist)
  {
    return o.a(paramPlaylist.uri);
  }

  public final String a()
  {
    return ((SearchResults.Playlist)t()).author;
  }

  public final String a(Context paramContext)
  {
    return t_();
  }

  public final int d()
  {
    return 0;
  }

  public final int e()
  {
    return 0;
  }

  public final int f()
  {
    return this.g;
  }

  public final int g()
  {
    return this.h;
  }

  public final long h()
  {
    return 0L;
  }

  public final boolean j()
  {
    return this.c;
  }

  public final boolean k()
  {
    return false;
  }

  public final boolean m()
  {
    return false;
  }

  public final boolean n()
  {
    return false;
  }

  public final boolean o()
  {
    return (this.e) || (this.c);
  }

  public final boolean p()
  {
    return this.b;
  }

  public final boolean q()
  {
    return this.d;
  }

  public final boolean r()
  {
    return this.f;
  }

  public final boolean r_()
  {
    return this.e;
  }

  public final boolean s()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
