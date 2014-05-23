package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public final class ad
{
  private Uri a;
  private int b;
  private int c;
  private int d;
  private boolean e;
  private boolean f;
  private float g;
  private float h;
  private float i;
  private boolean j;
  private List<al> k;
  private Bitmap.Config l;
  private o m;

  ad(Uri paramUri, int paramInt)
  {
    this.a = paramUri;
    this.b = paramInt;
  }

  public final ad a(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0)
      throw new IllegalArgumentException("Width must be positive number.");
    if (paramInt2 <= 0)
      throw new IllegalArgumentException("Height must be positive number.");
    this.c = paramInt1;
    this.d = paramInt2;
    return this;
  }

  public final ad a(al paramal)
  {
    if (paramal == null)
      throw new IllegalArgumentException("Transformation must not be null.");
    if (this.k == null)
      this.k = new ArrayList(2);
    this.k.add(paramal);
    return this;
  }

  public final ad a(o paramo)
  {
    if (paramo == null)
      throw new IllegalArgumentException("DrawableFactory must not be null.");
    this.m = paramo;
    return this;
  }

  final boolean a()
  {
    return (this.a != null) || (this.b != 0);
  }

  final boolean b()
  {
    return this.c != 0;
  }

  public final ad c()
  {
    if (this.f)
      throw new IllegalStateException("Center crop can not be used after calling centerInside");
    this.e = true;
    return this;
  }

  public final ac d()
  {
    if ((this.f) && (this.e))
      throw new IllegalStateException("Center crop and center inside can not be used together.");
    if ((this.e) && (this.c == 0))
      throw new IllegalStateException("Center crop requires calling resize.");
    if ((this.f) && (this.c == 0))
      throw new IllegalStateException("Center inside requires calling resize.");
    return new ac(this.a, this.b, this.k, this.m, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.l, (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
