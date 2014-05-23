package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable;;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.images.a;
import java.lang.ref.WeakReference;

public final class ci
{
  public final cj a;
  public int b;
  private int c;
  private int d;
  private WeakReference<a> e;
  private WeakReference<ImageView> f;
  private WeakReference<TextView> g;
  private int h;
  private boolean i;

  private static ck a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
      if (!(paramDrawable1 instanceof ck));
    for (paramDrawable1 = ((ck)paramDrawable1).a(); ; paramDrawable1 = null)
      return new ck(paramDrawable1, paramDrawable2);
  }

  private void a(Drawable paramDrawable, boolean paramBoolean)
  {
    int j = 1;
    ImageView localImageView;
    label76: boolean bool2;
    switch (this.b)
    {
    default:
    case 1:
    case 2:
      int n;
      do
      {
        do
        {
          do
            return;
          while ((a)this.e.get() == null);
          return;
          localImageView = (ImageView)this.f.get();
        }
        while (localImageView == null);
        if (paramBoolean)
          break label209;
        if ((j == 0) || (!(localImageView instanceof cp)))
          break;
        n = ((cp)localImageView).a();
      }
      while ((this.c != 0) && (n == this.c));
      bool2 = a();
      if (!bool2);
    case 3:
    }
    for (Object localObject6 = a(localImageView.getDrawable(), paramDrawable); ; localObject6 = paramDrawable)
    {
      localImageView.setImageDrawable((Drawable)localObject6);
      cp localcp;
      Uri localUri;
      if ((localImageView instanceof cp))
      {
        localcp = (cp)localImageView;
        if (!paramBoolean)
          break label214;
        localUri = this.a.a;
        label171: localcp.a(localUri);
        if (j == 0)
          break label220;
      }
      label209: label214: label220: for (int m = this.c; ; m = 0)
      {
        localcp.a(m);
        if (!bool2)
          break;
        ((ck)localObject6).b();
        return;
        j = 0;
        break label76;
        localUri = null;
        break label171;
      }
      TextView localTextView = (TextView)this.g.get();
      if (localTextView == null)
        break;
      int k = this.h;
      boolean bool1 = a();
      Drawable[] arrayOfDrawable;
      Drawable localDrawable;
      if (aa.b())
      {
        arrayOfDrawable = localTextView.getCompoundDrawablesRelative();
        localDrawable = arrayOfDrawable[k];
        if (!bool1)
          break label422;
      }
      label388: label397: label406: label420: label422: for (Object localObject1 = a(localDrawable, paramDrawable); ; localObject1 = paramDrawable)
      {
        Object localObject2;
        label297: Object localObject3;
        label307: Object localObject4;
        label317: Object localObject5;
        if (k == 0)
        {
          localObject2 = localObject1;
          if (k != j)
            break label379;
          localObject3 = localObject1;
          if (k != 2)
            break label388;
          localObject4 = localObject1;
          if (k != 3)
            break label397;
          localObject5 = localObject1;
          label327: if (!aa.b())
            break label406;
          localTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
        }
        while (true)
        {
          if (!bool1)
            break label420;
          ((ck)localObject1).b();
          return;
          arrayOfDrawable = localTextView.getCompoundDrawables();
          break;
          localObject2 = arrayOfDrawable[0];
          break label297;
          label379: localObject3 = arrayOfDrawable[j];
          break label307;
          localObject4 = arrayOfDrawable[2];
          break label317;
          localObject5 = arrayOfDrawable[3];
          break label327;
          localTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
        }
        break;
      }
    }
  }

  private boolean a()
  {
    return this.i;
  }

  public final void a(Context paramContext)
  {
    int j = this.c;
    Drawable localDrawable = null;
    if (j != 0)
      localDrawable = paramContext.getResources().getDrawable(this.c);
    a(localDrawable, false);
  }

  public final void a(Context paramContext, Bitmap paramBitmap)
  {
    cq.a(paramBitmap);
    a(new BitmapDrawable(paramContext.getResources(), paramBitmap), true);
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ci));
    do
    {
      return false;
      if (this == paramObject)
        return true;
    }
    while (((ci)paramObject).hashCode() != hashCode());
    return true;
  }

  public final int hashCode()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ci
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
