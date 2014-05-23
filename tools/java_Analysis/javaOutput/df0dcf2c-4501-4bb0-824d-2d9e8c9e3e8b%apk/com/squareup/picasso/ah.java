package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class ah extends Handler
{
  private final ag a;

  public ah(Looper paramLooper, ag paramag)
  {
    super(paramLooper);
    this.a = paramag;
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      Picasso.a.post(new ah.1(this, paramMessage));
      return;
    case 0:
      ag localag4 = this.a;
      localag4.d = (1L + localag4.d);
      return;
    case 1:
      ag localag3 = this.a;
      localag3.e = (1L + localag3.e);
      return;
    case 2:
      ag localag2 = this.a;
      long l2 = paramMessage.arg1;
      localag2.j = (1 + localag2.j);
      localag2.f = (l2 + localag2.f);
      int j = localag2.j;
      localag2.h = (localag2.f / j);
      return;
    case 3:
    }
    ag localag1 = this.a;
    long l1 = paramMessage.arg1;
    localag1.k = (1 + localag1.k);
    localag1.g = (l1 + localag1.g);
    int i = localag1.j;
    localag1.i = (localag1.g / i);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
