package com.spotify.mobile.android.model;

import android.content.Context;
import android.database.Cursor;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.am;

public final class f
  implements j
{
  public static final String[] a = { "_id", "name", "item_count", "uri", "owner_name", "is_own", "is_subscribed", "is_collaborative", "offline_state", "sync_progress", "subscriber_count", "is_published", "is_starred", "is_toptracks", "is_available", "is_loaded", "is_loadable", "is_folder", "folder_count", "is_radio_available", "is_playing", "is_paused", "image_small_uri" };
  private long b;
  private String c;
  private String d;
  private String e;
  private String f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;

  public f()
  {
  }

  public final String a()
  {
    return this.e;
  }

  public final String a(Context paramContext)
  {
    if (this.k)
      return paramContext.getString(2131690156);
    if (this.l)
      return paramContext.getString(2131690157);
    Assertion.b(this.k, "Call getDisplayName instead");
    Assertion.b(this.l, "Call getDisplayName instead");
    return this.c;
  }

  public final void a(Cursor paramCursor, String paramString)
  {
    this.b = paramCursor.getInt(0);
    this.c = am.a(paramCursor, 1, paramString);
    this.d = paramCursor.getString(3);
    this.e = am.a(paramCursor, 4, "");
    this.f = paramCursor.getString(22);
    this.g = am.a(paramCursor, 5);
    this.h = am.a(paramCursor, 6);
    this.i = am.a(paramCursor, 7);
    this.j = am.a(paramCursor, 11);
    this.k = am.a(paramCursor, 12);
    this.l = am.a(paramCursor, 13);
    this.m = am.a(paramCursor, 14);
    this.n = am.a(paramCursor, 19);
    this.o = am.a(paramCursor, 17);
    this.p = am.a(paramCursor, 20);
    this.q = am.a(paramCursor, 21);
    this.r = am.a(paramCursor, 15);
    this.s = am.a(paramCursor, 16);
    this.t = paramCursor.getInt(2);
    this.u = paramCursor.getInt(10);
    this.v = paramCursor.getInt(18);
    this.w = paramCursor.getInt(8);
    this.x = paramCursor.getInt(9);
  }

  public final String c()
  {
    return this.f;
  }

  public final int d()
  {
    return this.t;
  }

  public final int e()
  {
    return this.v;
  }

  public final int f()
  {
    return this.w;
  }

  public final int g()
  {
    return this.x;
  }

  public final long h()
  {
    return this.b;
  }

  public final boolean i()
  {
    return this.p;
  }

  public final boolean j()
  {
    return this.h;
  }

  public final boolean k()
  {
    return this.o;
  }

  public final boolean m()
  {
    return this.k;
  }

  public final boolean n()
  {
    return this.l;
  }

  public final boolean o()
  {
    return ((this.g) || (this.h)) && (!this.o);
  }

  public final boolean p()
  {
    return this.n;
  }

  public final boolean q()
  {
    return this.i;
  }

  public final boolean r()
  {
    return this.j;
  }

  public final boolean r_()
  {
    return this.g;
  }

  public final boolean s()
  {
    return this.s;
  }

  public final String s_()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
