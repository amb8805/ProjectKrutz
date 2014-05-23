package com.spotify.mobile.android.service;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.aj;
import java.util.concurrent.atomic.AtomicBoolean;

final class ap
  implements aj
{
  private Uri b;

  private ap(ao paramao)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    synchronized (ao.a(this.a))
    {
      if (this.b.equals(ao.b(this.a)))
        ao.a(this.a, paramBitmap);
      do
      {
        ao.e(this.a);
        return;
        ao.a(this.a, null);
      }
      while (!ao.c(this.a).get());
      ao.d(this.a).sendEmptyMessage(1001);
    }
  }

  public final void a(Drawable paramDrawable)
  {
    synchronized (ao.a(this.a))
    {
      ao.e(this.a);
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
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    ap localap = (ap)paramObject;
    return this.b.equals(localap.b);
  }

  public final int hashCode()
  {
    return this.b.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
