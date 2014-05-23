package com.spotify.mobile.android.ui.activity.upsell;

import android.database.Cursor;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cs;

final class l
  implements cs
{
  private static final String[] a = { "connected" };
  private final j b;

  l(j paramj)
  {
    this.b = paramj;
  }

  public final void a()
  {
  }

  public final void a(cr paramcr, Cursor paramCursor)
  {
    if (!paramCursor.moveToFirst())
      return;
    j.a(this.b, am.a(paramCursor, 0));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
