package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.Map;

public final class ae
{
  private final Picasso a;
  private final ad b;
  private boolean c;
  private boolean d;
  private boolean e;
  private int f;
  private Drawable g;
  private int h;
  private Drawable i;

  ae()
  {
    this.a = null;
    this.b = new ad(null, 0);
  }

  ae(Picasso paramPicasso, Uri paramUri, int paramInt)
  {
    if (paramPicasso.k)
      throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    this.a = paramPicasso;
    this.b = new ad(paramUri, paramInt);
  }

  final ae a()
  {
    this.e = false;
    return this;
  }

  public final ae a(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Placeholder image resource invalid.");
    if (this.g != null)
      throw new IllegalStateException("Placeholder image already set.");
    this.f = paramInt;
    return this;
  }

  public final ae a(int paramInt1, int paramInt2)
  {
    Resources localResources = this.a.c.getResources();
    return b(localResources.getDimensionPixelSize(paramInt1), localResources.getDimensionPixelSize(paramInt2));
  }

  public final ae a(Drawable paramDrawable)
  {
    if (this.f != 0)
      throw new IllegalStateException("Placeholder image already set.");
    this.g = paramDrawable;
    return this;
  }

  public final ae a(al paramal)
  {
    this.b.a(paramal);
    return this;
  }

  public final ae a(o paramo)
  {
    this.b.a(paramo);
    return this;
  }

  public final void a(ImageView paramImageView)
  {
    a(paramImageView, null);
  }

  public final void a(ImageView paramImageView, f paramf)
  {
    if (paramImageView == null)
      throw new IllegalArgumentException("Target must not be null.");
    if (!this.b.a())
    {
      this.a.a(paramImageView);
      aa.a(paramImageView, this.f, this.g);
    }
    ac localac;
    String str;
    do
    {
      return;
      if (this.e)
      {
        if (this.b.b())
          throw new IllegalStateException("Fit cannot be used with resize.");
        int j = paramImageView.getMeasuredWidth();
        int k = paramImageView.getMeasuredHeight();
        if ((j == 0) || (k == 0))
        {
          aa.a(paramImageView, this.f, this.g);
          Picasso localPicasso = this.a;
          i locali = new i(this, paramImageView, paramf);
          localPicasso.h.put(paramImageView, locali);
          return;
        }
        this.b.a(j, k);
      }
      localac = this.a.a(this.b.d());
      str = an.a(localac);
      if (this.c)
        break;
      Bitmap localBitmap = this.a.b(str);
      if (localBitmap == null)
        break;
      this.a.a(paramImageView);
      aa.a(paramImageView, this.a.c, localBitmap, Picasso.LoadedFrom.a, this.d, this.a.j, localac.d);
    }
    while (paramf == null);
    paramf.a();
    return;
    aa.a(paramImageView, this.f, this.g);
    r localr = new r(this.a, paramImageView, localac, this.c, this.d, this.h, this.i, str, paramf);
    this.a.a(localr);
  }

  public final void a(aj paramaj)
  {
    if (paramaj == null)
      throw new IllegalArgumentException("Target must not be null.");
    if (this.e)
      throw new IllegalStateException("Fit cannot be used with a Target.");
    if (this.f != 0);
    for (Drawable localDrawable = this.a.c.getResources().getDrawable(this.f); !this.b.a(); localDrawable = this.g)
    {
      this.a.a(paramaj);
      paramaj.b(localDrawable);
      return;
    }
    ac localac = this.a.a(this.b.d());
    String str = an.a(localac);
    if (!this.c)
    {
      Bitmap localBitmap = this.a.b(str);
      if (localBitmap != null)
      {
        this.a.a(paramaj);
        paramaj.a(localBitmap);
        return;
      }
    }
    paramaj.b(localDrawable);
    ak localak = new ak(this.a, paramaj, localac, this.c, str);
    this.a.a(localak);
  }

  public final ae b()
  {
    this.b.c();
    return this;
  }

  public final ae b(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Error image resource invalid.");
    if (this.i != null)
      throw new IllegalStateException("Error image already set.");
    this.h = paramInt;
    return this;
  }

  public final ae b(int paramInt1, int paramInt2)
  {
    this.b.a(paramInt1, paramInt2);
    return this;
  }

  public final ae b(Drawable paramDrawable)
  {
    if (paramDrawable == null)
      throw new IllegalArgumentException("Error image may not be null.");
    if (this.h != 0)
      throw new IllegalStateException("Error image already set.");
    this.i = paramDrawable;
    return this;
  }

  public final void c()
  {
    if (this.e)
      throw new IllegalStateException("Fit cannot be used with fetch.");
    if (this.b.a())
    {
      ac localac = this.a.a(this.b.d());
      String str = an.a(localac);
      p localp = new p(this.a, localac, this.c, str);
      this.a.a(localp);
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
