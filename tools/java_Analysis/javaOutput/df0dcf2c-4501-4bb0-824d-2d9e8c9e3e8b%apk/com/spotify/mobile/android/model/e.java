package com.spotify.mobile.android.model;

import android.database.Cursor;
import com.spotify.mobile.android.util.am;

public final class e
  implements b
{
  public static final String[] a = { "_id", "name", "uri", "collection_uri", "collection_all_tracks_uri", "image_small_uri", "is_available", "is_radio_available", "albums_in_collection_count", "tracks_in_collection_count", "is_playing", "is_paused", "offline_state", "sync_progress", "sort_name", "is_followed", "image_uri", "tracks_offlined_count" };
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private String n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;

  public e()
  {
  }

  public final int a()
  {
    return this.c;
  }

  public final void a(Cursor paramCursor)
  {
    this.b = paramCursor.getInt(0);
    this.c = paramCursor.getInt(12);
    this.d = paramCursor.getInt(13);
    this.e = paramCursor.getInt(8);
    this.f = paramCursor.getInt(9);
    this.g = paramCursor.getInt(17);
    this.h = am.a(paramCursor, 1, "");
    this.i = paramCursor.getString(2);
    this.j = paramCursor.getString(3);
    this.k = paramCursor.getString(4);
    this.l = paramCursor.getString(16);
    this.m = paramCursor.getString(5);
    this.n = am.a(paramCursor, 14, "");
    this.o = am.a(paramCursor, 6);
    this.p = am.a(paramCursor, 7);
    this.q = am.a(paramCursor, 10);
    this.r = am.a(paramCursor, 11);
    this.s = am.a(paramCursor, 15);
  }

  public final int c()
  {
    return this.d;
  }

  public final String d()
  {
    return this.j;
  }

  public final boolean e()
  {
    return this.p;
  }

  public final String f()
  {
    return this.l;
  }

  public final int g()
  {
    return this.f;
  }

  public final int h()
  {
    return this.g;
  }

  public final boolean i()
  {
    return this.q;
  }

  public final boolean j()
  {
    return this.s;
  }

  public final String s_()
  {
    return this.i;
  }

  public final String t_()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
