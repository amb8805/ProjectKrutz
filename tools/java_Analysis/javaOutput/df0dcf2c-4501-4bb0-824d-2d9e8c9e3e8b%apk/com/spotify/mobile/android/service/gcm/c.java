package com.spotify.mobile.android.service.gcm;

import android.database.Cursor;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cs;

final class c
  implements cs
{
  private static final String[] a = { "current_user" };
  private final a b;

  c(a parama)
  {
    this.b = parama;
  }

  public final void a()
  {
  }

  public final void a(cr paramcr, Cursor paramCursor)
  {
    if (!paramCursor.moveToFirst())
      return;
    a.a(this.b, paramCursor.getString(0));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
