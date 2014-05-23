package com.spotify.mobile.android.service;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.aj;
import java.util.concurrent.atomic.AtomicBoolean;

final class ah
  implements aj
{
  private Uri b;

  private ah(ag paramag)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    synchronized (ag.a(this.a))
    {
      if ((this.b != null) && (this.b.equals(ag.b(this.a))))
        ag.a(this.a, ag.a(paramBitmap));
      do
      {
        ag.e(this.a);
        return;
        ag.a(this.a, null);
      }
      while (!ag.c(this.a).get());
      ag.d(this.a).sendEmptyMessage(1001);
    }
  }

  public final void a(Drawable paramDrawable)
  {
    synchronized (ag.a(this.a))
    {
      ag.e(this.a);
      return;
    }
  }

  public final void a(Uri paramUri)
  {
    this.b = paramUri;
  }

  public final void b(Drawable paramDrawable)
  {
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    ah localah;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localah = (ah)paramObject;
      if (this.b == null)
        break;
    }
    while (this.b.equals(localah.b));
    while (localah.b != null)
      return false;
    return true;
  }

  public final int hashCode()
  {
    if (this.b != null)
      return this.b.hashCode();
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
