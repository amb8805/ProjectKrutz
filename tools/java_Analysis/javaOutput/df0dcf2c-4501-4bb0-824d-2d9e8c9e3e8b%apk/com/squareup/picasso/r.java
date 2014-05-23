package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class r extends a<ImageView>
{
  f j;

  r(Picasso paramPicasso, ImageView paramImageView, ac paramac, boolean paramBoolean1, boolean paramBoolean2, int paramInt, Drawable paramDrawable, String paramString, f paramf)
  {
    super(paramPicasso, paramImageView, paramac, paramBoolean1, paramBoolean2, paramInt, paramDrawable, paramString);
    this.j = paramf;
  }

  public final void a()
  {
    ImageView localImageView = (ImageView)this.c.get();
    if (localImageView == null);
    while (true)
    {
      return;
      if (this.f != 0)
        localImageView.setImageResource(this.f);
      while (this.j != null)
      {
        this.j.b();
        return;
        if (this.g != null)
          localImageView.setImageDrawable(this.g);
      }
    }
  }

  public final void a(Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom)
  {
    if (paramBitmap == null)
      throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] { this }));
    ImageView localImageView = (ImageView)this.c.get();
    if (localImageView == null)
      return;
    Context localContext = this.a.c;
    boolean bool = this.a.j;
    if (this.b == null);
    for (o localo = null; ; localo = this.b.d)
    {
      aa.a(localImageView, localContext, paramBitmap, paramLoadedFrom, this.e, bool, localo);
      if (this.j == null)
        break;
      this.j.a();
      return;
    }
  }

  final void b()
  {
    super.b();
    if (this.j != null)
      this.j = null;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
