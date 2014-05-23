package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

final class af extends d
{
  private final Context n;

  af(Context paramContext, Picasso paramPicasso, j paramj, e parame, ag paramag, a parama)
  {
    super(paramPicasso, paramj, parame, paramag, parama);
    this.n = paramContext;
  }

  final Bitmap a(ac paramac)
  {
    Resources localResources = an.a(this.n, paramac);
    int i = an.a(localResources, paramac);
    BitmapFactory.Options localOptions = b(paramac);
    if (paramac.a())
    {
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeResource(localResources, i, localOptions);
      a(paramac.e, paramac.f, localOptions);
    }
    return BitmapFactory.decodeResource(localResources, i, localOptions);
  }

  final Picasso.LoadedFrom a()
  {
    return Picasso.LoadedFrom.b;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
