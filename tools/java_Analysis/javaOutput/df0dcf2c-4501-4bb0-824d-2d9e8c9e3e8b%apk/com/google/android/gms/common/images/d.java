package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.cj;
import com.google.android.gms.internal.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class d
  implements Runnable
{
  private final Uri b;
  private final Bitmap c;
  private final CountDownLatch d;
  private boolean e;

  public d(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.b = paramUri;
    this.c = paramBitmap;
    this.e = paramBoolean;
    this.d = paramCountDownLatch;
  }

  private void a(ImageManager.c paramc, boolean paramBoolean)
  {
    paramc.a = true;
    ArrayList localArrayList = ImageManager.c.a(paramc);
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      ci localci = (ci)localArrayList.get(j);
      if (paramBoolean)
        localci.a(ImageManager.a(this.a), this.c);
      while (true)
      {
        if (localci.b != 1)
          ImageManager.c(this.a).remove(localci);
        j++;
        break;
        localci.a(ImageManager.a(this.a));
      }
    }
    paramc.a = false;
  }

  public final void run()
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
      throw new IllegalStateException("OnBitmapLoadedRunnable must be executed in the main thread");
    }
    boolean bool;
    if (this.c != null)
      bool = true;
    while (ImageManager.f(this.a) != null)
      if (this.e)
      {
        ImageManager.f(this.a).a(-1);
        System.gc();
        this.e = false;
        ImageManager.e(this.a).post(this);
        return;
        bool = false;
      }
      else if (bool)
      {
        ImageManager.f(this.a).a(new cj(this.b), this.c);
      }
    ImageManager.c localc = (ImageManager.c)ImageManager.b(this.a).remove(this.b);
    if (localc != null)
      a(localc, bool);
    this.d.countDown();
    synchronized (ImageManager.a())
    {
      ImageManager.b().remove(this.b);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
