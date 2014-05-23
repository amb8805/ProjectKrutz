package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap;;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

abstract class d
  implements Runnable
{
  private static final Object n = new Object();
  final Picasso a;
  final j b;
  final e c;
  final ag d;
  final String e;
  final ac f;
  final List<a> g;
  final boolean h;
  Bitmap i;
  Future<?> j;
  Picasso.LoadedFrom k;
  Exception l;
  int m;

  d(Picasso paramPicasso, j paramj, e parame, ag paramag, a parama)
  {
    this.a = paramPicasso;
    this.b = paramj;
    this.c = parame;
    this.d = paramag;
    this.e = parama.h;
    this.f = parama.b;
    this.h = parama.d;
    this.g = new ArrayList(4);
    a(parama);
  }

  private static Bitmap a(List<al> paramList, Bitmap paramBitmap)
  {
    int i1 = paramList.size();
    int i2 = 0;
    Bitmap localBitmap;
    for (Object localObject = paramBitmap; i2 < i1; localObject = localBitmap)
    {
      al localal = (al)paramList.get(i2);
      localBitmap = localal.a((Bitmap)localObject);
      if (localBitmap == null)
      {
        StringBuilder localStringBuilder = new StringBuilder("Transformation ").append(localal.a()).append(" returned null after ").append(i2).append(" previous transformation(s).\n\nTransformation list:\n");
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
          localStringBuilder.append(((al)localIterator.next()).a()).append((char)'\n');
        Picasso.a.post(new d.1(localStringBuilder));
        return null;
      }
      if ((localBitmap == localObject) && (((Bitmap)localObject).isRecycled()))
      {
        Picasso.a.post(new d.2(localal));
        return null;
      }
      if ((localBitmap != localObject) && (!((Bitmap)localObject).isRecycled()))
      {
        Picasso.a.post(new d.3(localal));
        return null;
      }
      i2++;
    }
    return localObject;
  }

  static d a(Context paramContext, Picasso paramPicasso, j paramj, e parame, ag paramag, a parama, Downloader paramDownloader)
  {
    if (parama.b.b != 0)
      return new af(paramContext, paramPicasso, paramj, parame, paramag, parama);
    Uri localUri = parama.b.a;
    String str = localUri.getScheme();
    if ("content".equals(str))
    {
      if ((ContactsContract.Contacts.CONTENT_URI.getHost().equals(localUri.getHost())) && (!localUri.getPathSegments().contains("photo")))
        return new g(paramContext, paramPicasso, paramj, parame, paramag, parama);
      if ("media".equals(localUri.getAuthority()))
        return new MediaStoreBitmapHunter(paramContext, paramPicasso, paramj, parame, paramag, parama);
      return new h(paramContext, paramPicasso, paramj, parame, paramag, parama);
    }
    if ("file".equals(str))
    {
      if ((!localUri.getPathSegments().isEmpty()) && ("android_asset".equals(localUri.getPathSegments().get(0))))
        return new c(paramContext, paramPicasso, paramj, parame, paramag, parama);
      return new q(paramContext, paramPicasso, paramj, parame, paramag, parama);
    }
    if ("android.resource".equals(str))
      return new af(paramContext, paramPicasso, paramj, parame, paramag, parama);
    return new u(paramPicasso, paramj, parame, paramag, parama, paramDownloader);
  }

  static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, BitmapFactory.Options paramOptions)
  {
    int i1 = 1;
    int i2;
    if ((paramInt4 > paramInt2) || (paramInt3 > paramInt1))
    {
      i1 = Math.round(paramInt4 / paramInt2);
      i2 = Math.round(paramInt3 / paramInt1);
      if (i1 >= i2)
        break label54;
    }
    while (true)
    {
      paramOptions.inSampleSize = i1;
      paramOptions.inJustDecodeBounds = false;
      return;
      label54: i1 = i2;
    }
  }

  static void a(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
  {
    a(paramInt1, paramInt2, paramOptions.outWidth, paramOptions.outHeight, paramOptions);
  }

  static BitmapFactory.Options b(ac paramac)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    if (paramac.m != null)
      localOptions.inPreferredConfig = paramac.m;
    return localOptions;
  }

  private Bitmap c()
  {
    int i1 = 1;
    Object localObject1;
    if (!this.h)
    {
      localObject1 = this.c.a(this.e);
      if (localObject1 != null)
      {
        this.d.a();
        this.k = Picasso.LoadedFrom.a;
      }
    }
    ac localac1;
    do
    {
      do
      {
        return localObject1;
        localObject1 = a(this.f);
      }
      while (localObject1 == null);
      this.d.a((Bitmap)localObject1);
      localac1 = this.f;
    }
    while (((localac1.b()) || (localac1.c())) && ((i1 == 0) && (this.m == 0)));
    int i3;
    int i4;
    Matrix localMatrix;
    int i7;
    int i8;
    int i5;
    int i6;
    label399: label438: float f2;
    float f3;
    while (true)
    {
      ac localac2;
      float f4;
      float f5;
      synchronized (n)
      {
        float f1;
        if ((this.f.b()) || (this.m != 0))
        {
          localac2 = this.f;
          int i2 = this.m;
          i3 = ((Bitmap)localObject1).getWidth();
          i4 = ((Bitmap)localObject1).getHeight();
          localMatrix = new Matrix();
          if (!localac2.b())
            break label511;
          i7 = localac2.e;
          i8 = localac2.f;
          f1 = localac2.i;
          if (f1 != 0.0F)
          {
            if (!localac2.l)
              continue;
            localMatrix.setRotate(f1, localac2.j, localac2.k);
          }
          if (!localac2.g)
            break label438;
          f4 = i7 / i3;
          f5 = i8 / i4;
          if (f4 <= f5)
            break label399;
          int i9 = (int)Math.ceil(i4 * (f5 / f4));
          int i10 = (i4 - i9) / 2;
          i5 = 0;
          i6 = i10;
          i4 = i9;
          f5 = f4;
          localMatrix.preScale(f5, f5);
          if (i2 != 0)
            localMatrix.preRotate(i2);
          Bitmap localBitmap = Bitmap.createBitmap((Bitmap)localObject1, i5, i6, i3, i4, localMatrix, true);
          if (localBitmap != localObject1)
          {
            ((Bitmap)localObject1).recycle();
            localObject1 = localBitmap;
          }
        }
        if (this.f.c())
          localObject1 = a(this.f.c, (Bitmap)localObject1);
        this.d.b((Bitmap)localObject1);
        return localObject1;
        i1 = 0;
        break;
        localMatrix.setRotate(f1);
      }
      double d1 = i3 * (f4 / f5);
      int i11 = (int)Math.ceil(d1);
      i5 = (i3 - i11) / 2;
      i3 = i11;
      i6 = 0;
      continue;
      if (!localac2.h)
        break label527;
      f2 = i7 / i3;
      f3 = i8 / i4;
      if (f2 >= f3)
        break label520;
      label472: localMatrix.preScale(f2, f2);
      i5 = 0;
      i6 = 0;
    }
    label520: label527: 
    while (true)
    {
      label491: localMatrix.preScale(i7 / i3, i8 / i4);
      label511: 
      do
      {
        do
        {
          i5 = 0;
          i6 = 0;
          break;
          f2 = f3;
          break label472;
        }
        while ((i7 == 0) || (i8 == 0));
        if (i7 != i3)
          break label491;
      }
      while (i8 == i4);
    }
  }

  abstract Bitmap a(ac paramac);

  Picasso.LoadedFrom a()
  {
    return this.k;
  }

  final void a(a parama)
  {
    this.g.add(parama);
  }

  boolean a(NetworkInfo paramNetworkInfo)
  {
    return false;
  }

  final boolean b()
  {
    return (this.j != null) && (this.j.isCancelled());
  }

  public void run()
  {
    try
    {
      Thread localThread = Thread.currentThread();
      StringBuilder localStringBuilder = new StringBuilder("Picasso-");
      ac localac = this.f;
      String str;
      if (localac.a != null)
      {
        str = localac.a.getPath();
        localThread.setName(str);
        this.i = c();
        if (this.i != null)
          break label102;
        this.b.a(this);
      }
      while (true)
      {
        return;
        str = Integer.toHexString(localac.b);
        break;
        j localj2 = this.b;
        localj2.f.sendMessage(localj2.f.obtainMessage(4, this));
      }
    }
    catch (Downloader.ResponseException localResponseException)
    {
      this.l = localResponseException;
      this.b.a(this);
      return;
    }
    catch (IOException localIOException)
    {
      this.l = localIOException;
      j localj1 = this.b;
      localj1.f.sendMessageDelayed(localj1.f.obtainMessage(5, this), 500L);
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      StringWriter localStringWriter = new StringWriter();
      ai localai = this.d.b();
      PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
      localPrintWriter.println("===============BEGIN PICASSO STATS ===============");
      localPrintWriter.println("Memory Cache Stats");
      localPrintWriter.print("  Max Cache Size: ");
      localPrintWriter.println(localai.a);
      localPrintWriter.print("  Cache Size: ");
      localPrintWriter.println(localai.b);
      localPrintWriter.print("  Cache % Full: ");
      localPrintWriter.println((int)Math.ceil(100.0F * (localai.b / localai.a)));
      localPrintWriter.print("  Cache Hits: ");
      localPrintWriter.println(localai.c);
      localPrintWriter.print("  Cache Misses: ");
      localPrintWriter.println(localai.d);
      localPrintWriter.println("Bitmap Stats");
      localPrintWriter.print("  Total Bitmaps Decoded: ");
      localPrintWriter.println(localai.i);
      localPrintWriter.print("  Total Bitmap Size: ");
      localPrintWriter.println(localai.e);
      localPrintWriter.print("  Total Transformed Bitmaps: ");
      localPrintWriter.println(localai.j);
      localPrintWriter.print("  Total Transformed Bitmap Size: ");
      localPrintWriter.println(localai.f);
      localPrintWriter.print("  Average Bitmap Size: ");
      localPrintWriter.println(localai.g);
      localPrintWriter.print("  Average Transformed Bitmap Size: ");
      localPrintWriter.println(localai.h);
      localPrintWriter.println("===============END PICASSO STATS ===============");
      localPrintWriter.flush();
      this.l = new RuntimeException(localStringWriter.toString(), localOutOfMemoryError);
      this.b.a(this);
      return;
    }
    catch (Exception localException)
    {
      this.l = localException;
      this.b.a(this);
      return;
    }
    finally
    {
      Thread.currentThread().setName("Picasso-Idle");
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
