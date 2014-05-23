package com.spotify.mobile.android.service.managers;

import android.database.Cursor;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cs;

final class a
  implements cs
{
  private a(ConnectManager paramConnectManager)
  {
  }

  public final void a()
  {
  }

  public final void a(cr paramcr, Cursor paramCursor)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramCursor.getCount());
    bp.b("Received device list update (Device count: %d)", arrayOfObject);
    ConnectManager.a(this.a, paramCursor);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.managers.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
