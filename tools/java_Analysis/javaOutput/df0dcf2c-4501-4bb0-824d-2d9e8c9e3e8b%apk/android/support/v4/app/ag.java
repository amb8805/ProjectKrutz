package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

final class ag
  implements ac
{
  ag()
  {
  }

  public final Notification a(aa paramaa)
  {
    ai localai = new ai(paramaa.a, paramaa.r, paramaa.b, paramaa.c, paramaa.h, paramaa.f, paramaa.i, paramaa.d, paramaa.e, paramaa.g, paramaa.n, paramaa.o, paramaa.p, paramaa.k, paramaa.j, paramaa.m);
    Iterator localIterator = paramaa.q.iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      localai.a(localx.a, localx.b, localx.c);
    }
    if (paramaa.l != null)
    {
      if (!(paramaa.l instanceof z))
        break label177;
      z localz = (z)paramaa.l;
      localai.a(localz.e, localz.g, localz.f, localz.a);
    }
    while (true)
    {
      return localai.a();
      label177: if ((paramaa.l instanceof ab))
      {
        ab localab = (ab)paramaa.l;
        localai.a(localab.e, localab.g, localab.f, localab.a);
      }
      else if ((paramaa.l instanceof y))
      {
        y localy = (y)paramaa.l;
        localai.a(localy.e, localy.g, localy.f, localy.a, localy.b, localy.c);
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
