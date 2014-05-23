package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

public final class j
{
  private static Handler a;
  private static ag b = new ag(8);
  private static ag c = new ag(2);
  private static final Map<n, m> d = new HashMap();

  private static Handler a()
  {
    try
    {
      if (a == null)
        a = new Handler(Looper.getMainLooper());
      Handler localHandler = a;
      return localHandler;
    }
    finally
    {
    }
  }

  private static m a(n paramn)
  {
    synchronized (d)
    {
      m localm = (m)d.remove(paramn);
      return localm;
    }
  }

  public static void a(Context paramContext)
  {
    s.a(paramContext);
    ac.a(paramContext);
  }

  private static void a(n paramn, Exception paramException, Bitmap paramBitmap, boolean paramBoolean)
  {
    m localm = a(paramn);
    if ((localm != null) && (!localm.c))
    {
      o localo = localm.b;
      q localq = localo.c();
      if (localq != null)
        a().post(new j.1(localo, paramException, paramBoolean, paramBitmap, localq));
    }
  }

  public static void a(o paramo)
  {
    if (paramo == null)
      return;
    n localn = new n(paramo.b(), paramo.e());
    while (true)
    {
      synchronized (d)
      {
        m localm = (m)d.get(localn);
        if (localm != null)
        {
          localm.b = paramo;
          localm.c = false;
          localm.a.b();
          return;
        }
      }
      a(paramo, localn, paramo.d());
    }
  }

  private static void a(o paramo, n paramn, ag paramag, Runnable paramRunnable)
  {
    synchronized (d)
    {
      m localm = new m((byte)0);
      localm.b = paramo;
      d.put(paramn, localm);
      localm.a = paramag.a(paramRunnable);
      return;
    }
  }

  private static void a(o paramo, n paramn, boolean paramBoolean)
  {
    a(paramo, paramn, c, new k(paramo.a(), paramn, paramBoolean));
  }

  public static boolean b(o paramo)
  {
    n localn = new n(paramo.b(), paramo.e());
    while (true)
    {
      synchronized (d)
      {
        m localm = (m)d.get(localn);
        if (localm != null)
        {
          if (localm.a.a())
          {
            d.remove(localn);
            bool = true;
            return bool;
          }
          localm.c = true;
          bool = true;
        }
      }
      boolean bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
