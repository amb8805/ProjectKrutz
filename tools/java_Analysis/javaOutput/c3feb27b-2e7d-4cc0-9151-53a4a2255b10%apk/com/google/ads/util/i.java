package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class i
{
  private static final Object a = new Object();
  private static int b = 0;
  private static HashMap<Class<?>, Integer> c = new HashMap();
  private final ArrayList<i.a<?>> d = new ArrayList();
  public final int u;

  public i()
  {
    synchronized (a)
    {
      int i = b;
      b = i + 1;
      this.u = i;
      Integer localInteger = (Integer)c.get(getClass());
      if (localInteger == null)
      {
        c.put(getClass(), Integer.valueOf(1));
        b.d("State created: " + toString());
        return;
      }
      c.put(getClass(), Integer.valueOf(1 + localInteger.intValue()));
    }
  }

  private void a(i.a<?> parama)
  {
    this.d.add(parama);
  }

  protected void finalize()
    throws Throwable
  {
    synchronized (a)
    {
      c.put(getClass(), Integer.valueOf(-1 + ((Integer)c.get(getClass())).intValue()));
      super.finalize();
      return;
    }
  }

  public String toString()
  {
    return getClass().getSimpleName() + "[" + this.u + "]";
  }
}

/* Location:
 * Qualified Name:     com.google.ads.util.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
