package com.spotify.mobile.android.util;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;

public final class cr
{
  private static Looper a;
  private AsyncQueryHandler b;
  private cs c;
  private Uri d;
  private String[] e;
  private String f;
  private String[] g;
  private String h;
  private final Object i = new Object();
  private Cursor j;
  private boolean k = false;
  private ContentObserver l = new cr.1(this);

  public cr(Context paramContext, cs paramcs)
  {
    this.b = new cr.2(this, paramContext.getContentResolver());
    this.c = ((cs)cc.a(paramcs, "You must provide a non-null callback object!"));
  }

  public final void a()
  {
    this.k = false;
    this.b.startQuery(0, null, this.d, this.e, this.f, this.g, this.h);
  }

  public final void a(Uri paramUri, String[] paramArrayOfString, String paramString)
  {
    this.d = paramUri;
    if (paramArrayOfString != null);
    for (String[] arrayOfString = (String[])paramArrayOfString.clone(); ; arrayOfString = null)
    {
      this.e = arrayOfString;
      this.f = paramString;
      this.g = null;
      this.h = null;
      a();
      return;
    }
  }

  public final void b()
  {
    this.b.cancelOperation(0);
    this.c.a();
    synchronized (this.i)
    {
      if (this.j != null)
      {
        this.j.unregisterContentObserver(this.l);
        this.j.close();
        this.j = null;
      }
      this.k = true;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
