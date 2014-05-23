package com.spotify.mobile.android.ui.activity.upsell;

import android.database.Cursor;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cs;

final class t
  implements cs
{
  private static final String[] a = { "country_code" };
  private final r b;

  public t(r paramr)
  {
    this.b = paramr;
  }

  public final void a()
  {
  }

  public final void a(cr paramcr, Cursor paramCursor)
  {
    if (!paramCursor.moveToFirst())
      return;
    String str = paramCursor.getString(0);
    r.a(this.b, str);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
