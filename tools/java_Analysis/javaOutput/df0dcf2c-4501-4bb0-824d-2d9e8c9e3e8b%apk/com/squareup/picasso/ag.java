package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;

final class ag
{
  final HandlerThread a;
  final e b;
  final Handler c;
  long d;
  long e;
  long f;
  long g;
  long h;
  long i;
  int j;
  int k;

  ag(e parame)
  {
    this.b = parame;
    this.a = new HandlerThread("Picasso-Stats", 10);
    this.a.start();
    this.c = new ah(this.a.getLooper(), this);
  }

  private void a(Bitmap paramBitmap, int paramInt)
  {
    int m = an.a(paramBitmap);
    this.c.sendMessage(this.c.obtainMessage(paramInt, m, 0));
  }

  final void a()
  {
    this.c.sendEmptyMessage(0);
  }

  final void a(Bitmap paramBitmap)
  {
    a(paramBitmap, 2);
  }

  final ai b()
  {
    try
    {
      ai localai = new ai(this.b.b(), this.b.a(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, System.currentTimeMillis());
      return localai;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void b(Bitmap paramBitmap)
  {
    a(paramBitmap, 3);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
