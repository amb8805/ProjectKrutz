package com.spotify.mobile.android.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.util.am;

public final class h
  implements m
{
  public static final String[] a = { "_id", "name", "uri", "album_name", "album_uri", "album_image_small_uri", "album_image_uri", "artist_name", "artist_uri", "is_starred", "is_playing", "is_available", "is_queued", "offline_state", "is_artist_browsable", "is_album_browsable", "is_radio_available", "is_queueable", "album_collection_uri", "artist_collection_uri", "is_in_collection", "length" };
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public String j;
  public int k;
  public int l;
  public int m;
  public boolean n;
  public boolean o;
  public boolean p;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;

  public h()
  {
  }

  public final void a(Cursor paramCursor, String paramString)
  {
    this.k = paramCursor.getInt(0);
    if (!TextUtils.isEmpty(paramString));
    while (true)
    {
      this.b = am.a(paramCursor, 1, paramString);
      this.c = am.a(paramCursor, 3, paramString);
      this.d = am.a(paramCursor, 7, paramString);
      this.e = paramCursor.getString(2);
      this.f = paramCursor.getString(4);
      this.h = paramCursor.getString(8);
      this.i = paramCursor.getString(18);
      this.j = paramCursor.getString(19);
      this.g = paramCursor.getString(5);
      this.n = am.a(paramCursor, 9);
      this.p = am.a(paramCursor, 10);
      this.q = am.a(paramCursor, 11);
      this.s = am.a(paramCursor, 14);
      this.r = am.a(paramCursor, 15);
      this.t = am.a(paramCursor, 16);
      this.u = am.a(paramCursor, 12);
      this.v = am.a(paramCursor, 17);
      this.o = am.a(paramCursor, 20);
      this.l = paramCursor.getInt(13);
      this.m = paramCursor.getInt(21);
      return;
      paramString = "";
    }
  }

  public final boolean a()
  {
    return this.p;
  }

  public final String b()
  {
    return this.g;
  }

  public final boolean c()
  {
    return this.q;
  }

  public final boolean d()
  {
    return (this.r) && (this.f != null) && (this.f.length() > 0);
  }

  public final boolean e()
  {
    return this.u;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    h localh;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localh = (h)paramObject;
    }
    while (this.k == localh.k);
    return false;
  }

  public final long f()
  {
    return this.k;
  }

  public final boolean g()
  {
    return this.o;
  }

  public final String h()
  {
    return this.e;
  }

  public final int hashCode()
  {
    return this.k;
  }

  public final int i()
  {
    return this.l;
  }

  public final boolean j()
  {
    return this.t;
  }

  public final boolean k()
  {
    return this.v;
  }

  public final String l()
  {
    return this.h;
  }

  public final String m()
  {
    return this.d;
  }

  public final String n()
  {
    return this.f;
  }

  public final String o()
  {
    return this.c;
  }

  public final String p()
  {
    return this.b;
  }

  public final boolean q()
  {
    return this.w;
  }

  public final String r()
  {
    return this.i;
  }

  public final boolean s()
  {
    return (this.s) && (this.h != null) && (this.h.length() > 0);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
