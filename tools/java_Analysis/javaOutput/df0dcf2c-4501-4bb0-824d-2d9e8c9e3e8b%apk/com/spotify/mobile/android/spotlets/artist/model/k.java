package com.spotify.mobile.android.spotlets.artist.model;

import android.database.Cursor;
import com.google.common.base.Optional;
import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.util.am;

public final class k
  implements m
{
  public static final String[] a = { "_id", "uri", "name", "album_name", "album_uri", "artist_name", "artist_uri", "is_starred", "is_queued", "offline_state", "is_artist_browsable", "is_album_browsable", "is_in_collection", "is_available", "album_collection_uri", "artist_collection_uri" };
  private final boolean b;
  private final int c;
  private final String d;
  private final boolean e;
  private final int f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  private final String k;
  private final String l;
  private final String m;
  private final boolean n;
  private final boolean o;
  private final boolean p;
  private final boolean q;
  private Optional<Boolean> r = Optional.d();

  private k(boolean paramBoolean1, int paramInt1, String paramString1, boolean paramBoolean2, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, String paramString7, String paramString8, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.b = paramBoolean1;
    this.c = paramInt1;
    this.d = paramString1;
    this.e = paramBoolean2;
    this.f = paramInt2;
    this.g = paramString2;
    this.h = paramString3;
    this.i = paramString4;
    this.j = paramString5;
    this.k = paramString6;
    this.n = paramBoolean3;
    this.o = paramBoolean4;
    this.l = paramString7;
    this.m = paramString8;
    this.p = paramBoolean5;
    this.q = paramBoolean6;
  }

  public static k a(Cursor paramCursor)
  {
    if (!paramCursor.moveToFirst())
      throw new RuntimeException("Some cursor problems over here!");
    int i1 = paramCursor.getInt(0);
    String str1 = am.a(paramCursor, 1, "");
    String str2 = am.a(paramCursor, 2, "");
    String str3 = am.a(paramCursor, 3, "");
    String str4 = am.a(paramCursor, 5, "");
    String str5 = paramCursor.getString(4);
    String str6 = paramCursor.getString(6);
    String str7 = paramCursor.getString(14);
    String str8 = paramCursor.getString(15);
    boolean bool1 = am.a(paramCursor, 7);
    boolean bool2 = am.a(paramCursor, 10);
    boolean bool3 = am.a(paramCursor, 11);
    boolean bool4 = am.a(paramCursor, 8);
    boolean bool5 = am.a(paramCursor, 12);
    boolean bool6 = am.a(paramCursor, 13);
    return new k(bool4, i1, str1, bool5, paramCursor.getInt(9), str6, str4, str5, str3, str2, bool2, bool3, str7, str8, bool1, bool6);
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
    return this.q;
  }

  public final boolean d()
  {
    return this.o;
  }

  public final boolean e()
  {
    return this.b;
  }

  public final long f()
  {
    return this.c;
  }

  public final boolean g()
  {
    return this.e;
  }

  public final String h()
  {
    return this.d;
  }

  public final int i()
  {
    return this.f;
  }

  public final boolean j()
  {
    return true;
  }

  public final boolean k()
  {
    return true;
  }

  public final String l()
  {
    return this.g;
  }

  public final String m()
  {
    return this.h;
  }

  public final String n()
  {
    return this.i;
  }

  public final String o()
  {
    return this.j;
  }

  public final String p()
  {
    return this.k;
  }

  public final boolean q()
  {
    return false;
  }

  public final String r()
  {
    return this.l;
  }

  public final boolean s()
  {
    return this.n;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
