package com.d.a;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

final class p extends Handler
{
  private p()
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    ArrayList localArrayList1 = (ArrayList)o.l().get();
    ArrayList localArrayList2 = (ArrayList)o.m().get();
    ArrayList localArrayList5;
    int i;
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      localArrayList5 = (ArrayList)o.n().get();
      if ((localArrayList1.size() > 0) || (localArrayList2.size() > 0))
        i = 0;
    case 1:
    }
    while (true)
      if (localArrayList5.size() > 0)
      {
        ArrayList localArrayList6 = (ArrayList)localArrayList5.clone();
        localArrayList5.clear();
        int i4 = localArrayList6.size();
        int i5 = 0;
        if (i5 < i4)
        {
          o localo4 = (o)localArrayList6.get(i5);
          if (o.a(localo4) == 0L)
            o.b(localo4);
          while (true)
          {
            i5++;
            break;
            localArrayList2.add(localo4);
          }
          i = 1;
        }
      }
      else
      {
        long l = AnimationUtils.currentAnimationTimeMillis();
        ArrayList localArrayList3 = (ArrayList)o.o().get();
        ArrayList localArrayList4 = (ArrayList)o.p().get();
        int j = localArrayList2.size();
        for (int k = 0; k < j; k++)
        {
          o localo3 = (o)localArrayList2.get(k);
          if (o.a(localo3, l))
            localArrayList3.add(localo3);
        }
        int m = localArrayList3.size();
        if (m > 0)
        {
          for (int i3 = 0; i3 < m; i3++)
          {
            o localo2 = (o)localArrayList3.get(i3);
            o.b(localo2);
            o.c(localo2);
            localArrayList2.remove(localo2);
          }
          localArrayList3.clear();
        }
        int n = localArrayList1.size();
        int i1 = 0;
        while (i1 < n)
        {
          o localo1 = (o)localArrayList1.get(i1);
          if (localo1.c(l))
            localArrayList4.add(localo1);
          if (localArrayList1.size() == n)
          {
            i1++;
          }
          else
          {
            n--;
            localArrayList4.remove(localo1);
          }
        }
        if (localArrayList4.size() > 0)
        {
          for (int i2 = 0; i2 < localArrayList4.size(); i2++)
            o.d((o)localArrayList4.get(i2));
          localArrayList4.clear();
        }
        if ((i == 0) || ((localArrayList1.isEmpty()) && (localArrayList2.isEmpty())))
          break;
        sendEmptyMessageDelayed(1, Math.max(0L, o.q() - (AnimationUtils.currentAnimationTimeMillis() - l)));
        return;
        i = 1;
      }
  }
}

/* Location:
 * Qualified Name:     com.d.a.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
