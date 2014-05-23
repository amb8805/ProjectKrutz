package com.spotify.mobile.android.util.a;

import android.graphics.Bitmap;
import android.util.SparseArray;

public final class h
{
  private boolean b = true;
  private SparseArray<Bitmap> c = new SparseArray();
  private SparseArray<Long> d = new SparseArray();
  private SparseArray<String> e = new SparseArray();

  h(g paramg)
  {
  }

  public final void a()
  {
    this.a.a(this, this.b);
  }

  public final void a(int paramInt, String paramString)
  {
    this.e.put(paramInt, paramString);
  }

  public final void a(long paramLong)
  {
    this.d.put(9, Long.valueOf(paramLong));
  }

  public final void a(Bitmap paramBitmap)
  {
    this.c.put(100, paramBitmap);
  }

  final SparseArray<Bitmap> b()
  {
    return this.c;
  }

  final SparseArray<Long> c()
  {
    return this.d;
  }

  final SparseArray<String> d()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
