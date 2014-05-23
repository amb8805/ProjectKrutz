package com.spotify.mobile.android.spotlets.artist.model;

import android.database.Cursor;

public final class i
{
  public static final String[] c = { "name", "uri" };
  public final String a;
  public final String b;

  private i(String paramString1, String paramString2)
  {
    this.a = ((String)com.google.common.base.i.a(paramString1));
    this.b = ((String)com.google.common.base.i.a(paramString2));
  }

  public static i a(Cursor paramCursor)
  {
    return new i(paramCursor.getString(1), paramCursor.getString(0));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
