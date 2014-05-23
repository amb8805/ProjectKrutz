package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

abstract class a<T>
{
  final Picasso a;
  final ac b;
  final WeakReference<T> c;
  final boolean d;
  final boolean e;
  final int f;
  final Drawable g;
  final String h;
  boolean i;

  a(Picasso paramPicasso, T paramT, ac paramac, boolean paramBoolean1, boolean paramBoolean2, int paramInt, Drawable paramDrawable, String paramString)
  {
    this.a = paramPicasso;
    this.b = paramac;
    this.c = new b(this, paramT, paramPicasso.i);
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramInt;
    this.g = paramDrawable;
    this.h = paramString;
  }

  abstract void a();

  abstract void a(Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom);

  void b()
  {
    this.i = true;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
