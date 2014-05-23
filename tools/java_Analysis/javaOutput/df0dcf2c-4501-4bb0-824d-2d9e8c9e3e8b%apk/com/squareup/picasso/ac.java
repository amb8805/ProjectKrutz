package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class ac
{
  public final Uri a;
  public final int b;
  public final List<al> c;
  public final o d;
  public final int e;
  public final int f;
  public final boolean g;
  public final boolean h;
  public final float i;
  public final float j;
  public final float k;
  public final boolean l;
  public final Bitmap.Config m;

  private ac(Uri paramUri, int paramInt1, List<al> paramList, o paramo, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean3, Bitmap.Config paramConfig)
  {
    this.a = paramUri;
    this.b = paramInt1;
    if (paramList == null);
    for (this.c = null; ; this.c = Collections.unmodifiableList(paramList))
    {
      this.d = paramo;
      this.e = paramInt2;
      this.f = paramInt3;
      this.g = paramBoolean1;
      this.h = paramBoolean2;
      this.i = paramFloat1;
      this.j = paramFloat2;
      this.k = paramFloat3;
      this.l = paramBoolean3;
      this.m = paramConfig;
      return;
    }
  }

  public final boolean a()
  {
    return this.e != 0;
  }

  final boolean b()
  {
    return (this.e != 0) || (this.i != 0.0F);
  }

  final boolean c()
  {
    return this.c != null;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
