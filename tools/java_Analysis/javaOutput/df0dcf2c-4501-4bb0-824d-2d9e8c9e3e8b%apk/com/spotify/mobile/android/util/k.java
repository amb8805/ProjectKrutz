package com.spotify.mobile.android.util;

import android.os.Handler;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.EnumSet;;

public final class k<E extends Enum<E>>
{
  private Handler a = new Handler();
  private Class<E> b;
  private EnumSet<E> c;
  private EnumSet<E> d;
  private ArrayList<l<E>> e = new ArrayList();
  private Runnable f = new k.1(this);

  public k(Class<E> paramClass)
  {
    this.b = paramClass;
    this.c = EnumSet.noneOf(paramClass);
  }

  private void a(EnumSet<E> paramEnumSet)
  {
    if (this.d == null)
    {
      this.d = paramEnumSet;
      this.a.post(this.f);
      return;
    }
    if (paramEnumSet.equals(this.c))
    {
      this.d = null;
      this.a.removeCallbacks(this.f);
      return;
    }
    this.d = paramEnumSet;
  }

  public final void a()
  {
    synchronized (this.f)
    {
      if (this.d != null)
      {
        localObject2 = EnumSet.copyOf(this.d);
        if (!((EnumSet)localObject2).isEmpty())
        {
          ((EnumSet)localObject2).clear();
          a((EnumSet)localObject2);
        }
        return;
      }
      EnumSet localEnumSet = EnumSet.copyOf(this.c);
      Object localObject2 = localEnumSet;
    }
  }

  public final void a(l<E> paraml)
  {
    this.e.add(paraml);
  }

  public final void a(E paramE, boolean paramBoolean)
  {
    synchronized (this.f)
    {
      if (this.d != null);
      for (EnumSet localEnumSet = EnumSet.copyOf(this.d); paramBoolean; localEnumSet = EnumSet.copyOf(this.c))
      {
        bool1 = localEnumSet.add(paramE);
        if (bool1)
          a(localEnumSet);
        return;
      }
      boolean bool2 = localEnumSet.remove(paramE);
      boolean bool1 = bool2;
    }
  }

  public final boolean a(E paramE)
  {
    return this.c.contains(paramE);
  }

  public final void b()
  {
    if (this.d != null)
    {
      this.a.removeCallbacks(this.f);
      this.f.run();
    }
  }

  public final void b(l<E> paraml)
  {
    this.e.remove(paraml);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
