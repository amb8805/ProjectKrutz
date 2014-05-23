package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;

final class q extends h
{
  q(Context paramContext, Picasso paramPicasso, j paramj, e parame, ag paramag, a parama)
  {
    super(paramContext, paramPicasso, paramj, parame, paramag, parama);
  }

  final Bitmap a(ac paramac)
  {
    int i;
    switch (new ExifInterface(paramac.a.getPath()).getAttributeInt("Orientation", 1))
    {
    case 4:
    case 5:
    case 7:
    default:
      i = 0;
    case 6:
    case 3:
    case 8:
    }
    while (true)
    {
      this.m = i;
      return super.a(paramac);
      i = 90;
      continue;
      i = 180;
      continue;
      i = 270;
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
