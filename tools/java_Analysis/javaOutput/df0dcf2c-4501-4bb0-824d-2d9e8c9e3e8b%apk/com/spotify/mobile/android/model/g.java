package com.spotify.mobile.android.model;

import android.database.Cursor;
import com.spotify.mobile.android.util.am;

public final class g
  implements k
{
  public static final String[] a = { "_id", "station_id", "title", "title_uri", "subtitle", "subtitle_uri", "image_uri", "seed" };
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;

  public g(Cursor paramCursor)
  {
    this.b = am.a(paramCursor, 1, "");
    this.c = am.b(paramCursor, 2, "");
    this.d = paramCursor.getString(3);
    this.e = am.b(paramCursor, 4, "");
    this.f = paramCursor.getString(5);
    this.g = paramCursor.getString(6);
    this.h = am.a(paramCursor, 7, "");
  }

  public final String a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.e;
  }

  public final String d()
  {
    return this.g;
  }

  public final String e()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
