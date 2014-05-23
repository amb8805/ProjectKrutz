package com.spotify.mobile.android.spotlets.artist.model;

import android.database.Cursor;
import com.spotify.mobile.android.model.a;
import com.spotify.mobile.android.util.Collection;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.am;

public final class j
  implements a
{
  public static final String[] a = { "_id", "name", "uri", "collection_uri", "artist_name", "artist_uri", "image_small_uri", "year", "type", "is_available", "is_artist_browsable", "is_radio_available", "is_queueable", "is_in_collection", "tracks_count", "tracks_in_collection_count", "is_playing", "is_paused", "offline_state", "sync_progress", "can_undownload" };
  private final int b;
  private final String c;
  private final String d;
  private final boolean e;
  private final String f;
  private final String g;
  private final String h;
  private final int i;
  private final boolean j;
  private final boolean k;
  private final int l;
  private final int m;
  private final boolean n;

  private j(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, String paramString5, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, int paramInt3, int paramInt4, boolean paramBoolean4)
  {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramBoolean1;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramInt2;
    this.j = paramBoolean2;
    this.k = paramBoolean3;
    this.l = paramInt3;
    this.m = paramInt4;
    this.n = paramBoolean4;
  }

  public static j a(Cursor paramCursor)
  {
    if (!paramCursor.moveToFirst())
      throw new RuntimeException("Some cursor problems over here!");
    int i1 = paramCursor.getInt(0);
    String str1 = am.a(paramCursor, 1, "");
    String str2 = paramCursor.getString(2);
    String str3 = paramCursor.getString(3);
    boolean bool1 = am.a(paramCursor, 9);
    boolean bool2 = am.a(paramCursor, 10);
    boolean bool3 = am.a(paramCursor, 12);
    int i2 = paramCursor.getInt(14);
    int i3 = paramCursor.getInt(15);
    boolean bool4 = am.a(paramCursor, 11);
    return new j(paramCursor.getInt(18), str3, am.a(paramCursor, 4, ""), bool2, paramCursor.getString(5), str1, str2, i1, bool3, bool1, i2, i3, bool4);
  }

  public final Collection.State a()
  {
    return Collection.a(this.l, this.m);
  }

  public final int c()
  {
    return this.b;
  }

  public final boolean d()
  {
    return false;
  }

  public final String e()
  {
    return this.c;
  }

  public final int f()
  {
    return 0;
  }

  public final String g()
  {
    return this.d;
  }

  public final boolean h()
  {
    return this.e;
  }

  public final String i()
  {
    return this.f;
  }

  public final boolean j()
  {
    return this.n;
  }

  public final boolean k()
  {
    return this.j;
  }

  public final boolean m()
  {
    return this.k;
  }

  public final String s_()
  {
    return this.h;
  }

  public final String t_()
  {
    return this.g;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
