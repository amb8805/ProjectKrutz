package com.spotify.mobile.android.model;

import android.database.Cursor;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.cc;

public final class i
  implements n
{
  public static final String[] a = { "_id", "name", "username", "uri", "icon_uri", "is_relation_spotify", "is_friend", "is_available" };
  private String b;
  private String c;
  private String d;
  private boolean e;
  private boolean f;
  private boolean g;
  private String h;

  public i()
  {
  }

  public static i a(Cursor paramCursor, String paramString)
  {
    cc.a(paramCursor, "Cursor must not be null to build a user track!");
    i locali = new i();
    locali.b(paramCursor, paramString);
    return locali;
  }

  public final String a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final void b(Cursor paramCursor, String paramString)
  {
    this.b = am.a(paramCursor, 1, paramString);
    this.c = am.a(paramCursor, 2, paramString);
    this.d = paramCursor.getString(3);
    this.h = paramCursor.getString(4);
    this.e = am.a(paramCursor, 5);
    this.f = am.a(paramCursor, 6);
    this.g = am.a(paramCursor, 7);
  }

  public final boolean c()
  {
    return this.g;
  }

  public final String d()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
