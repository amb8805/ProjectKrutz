package com.spotify.mobile.android.service.gcm;

import android.database.Cursor;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cs;

final class b
  implements cs
{
  private static final String[] a = { "ab_test_push_notifications" };
  private final a b;

  b(a parama)
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
    a.a(this.b, am.a(paramCursor, 0));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
