package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import java.io.InputStream;

final class u extends d
{
  int n;
  private final Downloader o;

  public u(Picasso paramPicasso, j paramj, e parame, ag paramag, a parama, Downloader paramDownloader)
  {
    super(paramPicasso, paramj, parame, paramag, parama);
    this.o = paramDownloader;
    this.n = 2;
  }

  final Bitmap a(ac paramac)
  {
    boolean bool1 = true;
    n localn;
    if (this.n == 0)
    {
      localn = this.o.a(paramac.a, bool1);
      if (!localn.c)
        break label61;
    }
    label61: for (Picasso.LoadedFrom localLoadedFrom = Picasso.LoadedFrom.b; ; localLoadedFrom = Picasso.LoadedFrom.c)
    {
      this.k = localLoadedFrom;
      Bitmap localBitmap1 = localn.b;
      if (localBitmap1 == null)
        break label69;
      return localBitmap1;
      bool1 = false;
      break;
    }
    label69: localInputStream = localn.a;
    if (localInputStream == null)
      localObject2 = null;
    while (true)
    {
      an.a(localInputStream);
      return localObject2;
      try
      {
        t localt = new t(localInputStream);
        long l = localt.a(65536);
        boolean bool2 = an.c(localt);
        localt.a(l);
        if (bool2)
        {
          byte[] arrayOfByte = an.b(localt);
          BitmapFactory.Options localOptions1 = b(paramac);
          if (paramac.a())
          {
            localOptions1.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions1);
            a(paramac.e, paramac.f, localOptions1);
          }
          localObject2 = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions1);
          continue;
        }
        BitmapFactory.Options localOptions2 = b(paramac);
        if (paramac.a())
        {
          localOptions2.inJustDecodeBounds = true;
          BitmapFactory.decodeStream(localt, null, localOptions2);
          a(paramac.e, paramac.f, localOptions2);
          localt.a(l);
        }
        Bitmap localBitmap2 = BitmapFactory.decodeStream(localt, null, localOptions2);
        localObject2 = localBitmap2;
      }
      finally
      {
        an.a(localInputStream);
      }
    }
  }

  final boolean a(NetworkInfo paramNetworkInfo)
  {
    int i;
    if (this.n > 0)
    {
      i = 1;
      if (i != 0)
        break label20;
    }
    label20: 
    do
    {
      return false;
      i = 0;
      break;
      this.n = (-1 + this.n);
    }
    while ((paramNetworkInfo != null) && (!paramNetworkInfo.isConnectedOrConnecting()));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
