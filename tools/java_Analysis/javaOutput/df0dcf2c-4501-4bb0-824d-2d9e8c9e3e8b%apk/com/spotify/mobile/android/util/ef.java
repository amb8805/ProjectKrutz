package com.spotify.mobile.android.util;

import android.app.Service;
import android.database.Cursor;

final class ef extends ed
  implements cs
{
  private cr a = new cr(paramService, this);

  private ef(Service paramService)
  {
    super((byte)0);
  }

  public final void a()
  {
  }

  public final void a(cr paramcr, Cursor paramCursor)
  {
    a(paramCursor);
  }

  public final void a(String paramString, eg parameg)
  {
    super.a(paramString, parameg);
    this.a.a(c(), ed.d(), null);
  }

  public final void b()
  {
    super.b();
    if (this.a != null)
    {
      this.a.b();
      this.a = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
