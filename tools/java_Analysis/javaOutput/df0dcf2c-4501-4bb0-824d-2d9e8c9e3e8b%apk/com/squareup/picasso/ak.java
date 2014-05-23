package com.squareup.picasso;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

final class ak extends a<aj>
{
  ak(Picasso paramPicasso, aj paramaj, ac paramac, boolean paramBoolean, String paramString)
  {
    super(paramPicasso, paramaj, paramac, paramBoolean, false, 0, null, paramString);
  }

  final void a()
  {
    aj localaj = (aj)this.c.get();
    if (localaj != null)
      localaj.a(this.g);
  }

  final void a(Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom)
  {
    if (paramBitmap == null)
      throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] { this }));
    aj localaj = (aj)this.c.get();
    if (localaj != null)
    {
      localaj.a(paramBitmap);
      if (paramBitmap.isRecycled())
        throw new IllegalStateException("Target callback must not recycle bitmap!");
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
