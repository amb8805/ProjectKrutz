package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

final class k extends Handler
{
  private final j a;

  public k(Looper paramLooper, j paramj)
  {
    super(paramLooper);
    this.a = paramj;
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = 1;
    switch (paramMessage.what)
    {
    case 3:
    case 8:
    default:
      Picasso.a.post(new k.1(this, paramMessage));
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    case 9:
      NetworkInfo localNetworkInfo;
      j localj2;
      do
      {
        while (true)
        {
          return;
          a locala2 = (a)paramMessage.obj;
          j localj5 = this.a;
          d locald5 = (d)localj5.e.get(locala2.h);
          if (locald5 != null)
          {
            locald5.a(locala2);
            return;
          }
          if (!localj5.c.isShutdown())
          {
            d locald6 = d.a(localj5.b, locala2.a, localj5, localj5.h, localj5.i, locala2, localj5.d);
            locald6.j = localj5.c.submit(locald6);
            localj5.e.put(locala2.h, locald6);
            return;
            a locala1 = (a)paramMessage.obj;
            j localj4 = this.a;
            String str = locala1.h;
            d locald4 = (d)localj4.e.get(str);
            if (locald4 != null)
            {
              locald4.g.remove(locala1);
              if ((locald4.g.isEmpty()) && (locald4.j != null) && (locald4.j.cancel(false)));
              while (i != 0)
              {
                localj4.e.remove(str);
                return;
                i = 0;
              }
            }
          }
        }
        d locald3 = (d)paramMessage.obj;
        this.a.c(locald3);
        return;
        d locald2 = (d)paramMessage.obj;
        this.a.b(locald2);
        return;
        d locald1 = (d)paramMessage.obj;
        this.a.d(locald1);
        return;
        j localj3 = this.a;
        ArrayList localArrayList = new ArrayList(localj3.j);
        localj3.j.clear();
        localj3.g.sendMessage(localj3.g.obtainMessage(8, localArrayList));
        return;
        localNetworkInfo = (NetworkInfo)paramMessage.obj;
        localj2 = this.a;
        localj2.l = localNetworkInfo;
      }
      while (!(localj2.c instanceof ab));
      ((ab)localj2.c).a(localNetworkInfo);
      return;
    case 10:
    }
    j localj1 = this.a;
    if (paramMessage.arg1 == i);
    for (int j = i; ; j = 0)
    {
      localj1.m = j;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
