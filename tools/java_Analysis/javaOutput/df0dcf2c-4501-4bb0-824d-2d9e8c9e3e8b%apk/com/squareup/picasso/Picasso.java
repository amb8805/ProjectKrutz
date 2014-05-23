package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class Picasso
{
  static final Handler a = new Picasso.1(Looper.getMainLooper());
  static Picasso b = null;
  final Context c;
  final j d;
  final e e;
  final ag f;
  final Map<Object, a> g;
  final Map<ImageView, i> h;
  final ReferenceQueue<Object> i;
  boolean j;
  boolean k;
  private final y l;
  private final z m;
  private final x n;

  Picasso(Context paramContext, j paramj, e parame, y paramy, z paramz, ag paramag, boolean paramBoolean)
  {
    this.c = paramContext;
    this.d = paramj;
    this.e = parame;
    this.l = paramy;
    this.m = paramz;
    this.f = paramag;
    this.g = new WeakHashMap();
    this.h = new WeakHashMap();
    this.j = paramBoolean;
    this.i = new ReferenceQueue();
    this.n = new x(this.i, a);
    this.n.start();
  }

  public static Picasso a(Context paramContext)
  {
    if (b == null)
      b = new w(paramContext).a();
    return b;
  }

  private void a(Object paramObject)
  {
    a locala = (a)this.g.remove(paramObject);
    if (locala != null)
    {
      locala.b();
      j localj = this.d;
      localj.f.sendMessage(localj.f.obtainMessage(2, locala));
    }
    if ((paramObject instanceof ImageView))
    {
      ImageView localImageView1 = (ImageView)paramObject;
      i locali = (i)this.h.remove(localImageView1);
      if (locali != null)
      {
        locali.c = null;
        ImageView localImageView2 = (ImageView)locali.b.get();
        if (localImageView2 != null)
        {
          ViewTreeObserver localViewTreeObserver = localImageView2.getViewTreeObserver();
          if (localViewTreeObserver.isAlive())
            localViewTreeObserver.removeOnPreDrawListener(locali);
        }
      }
    }
  }

  final ac a(ac paramac)
  {
    ac localac = this.m.a(paramac);
    if (localac == null)
      throw new IllegalStateException("Request transformer " + this.m.getClass().getCanonicalName() + " returned null for " + paramac);
    return localac;
  }

  public final ae a(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Resource ID must not be zero.");
    return new ae(this, null, paramInt);
  }

  public final ae a(Uri paramUri)
  {
    return new ae(this, paramUri, 0);
  }

  public final ae a(String paramString)
  {
    if (paramString == null)
      return new ae(this, null, 0);
    if (paramString.trim().length() == 0)
      throw new IllegalArgumentException("Path must not be empty.");
    return a(Uri.parse(paramString));
  }

  public final void a(ImageView paramImageView)
  {
    a(paramImageView);
  }

  final void a(a parama)
  {
    Object localObject = parama.c.get();
    if (localObject != null)
    {
      a(localObject);
      this.g.put(localObject, parama);
    }
    j localj = this.d;
    localj.f.sendMessage(localj.f.obtainMessage(1, parama));
  }

  public final void a(aj paramaj)
  {
    a(paramaj);
  }

  final void a(d paramd)
  {
    List localList = paramd.g;
    if (localList.isEmpty());
    Exception localException;
    do
    {
      return;
      localException = paramd.l;
      Bitmap localBitmap = paramd.i;
      Picasso.LoadedFrom localLoadedFrom = paramd.a();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (!locala.i)
        {
          this.g.remove(locala.c.get());
          if (localBitmap != null)
          {
            if (localLoadedFrom == null)
              throw new AssertionError("LoadedFrom cannot be null.");
            locala.a(localBitmap, localLoadedFrom);
          }
          else
          {
            locala.a();
          }
        }
      }
    }
    while ((this.l == null) || (localException == null));
  }

  final Bitmap b(String paramString)
  {
    Bitmap localBitmap = this.e.a(paramString);
    if (localBitmap != null)
    {
      this.f.a();
      return localBitmap;
    }
    this.f.c.sendEmptyMessage(1);
    return localBitmap;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.Picasso
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
