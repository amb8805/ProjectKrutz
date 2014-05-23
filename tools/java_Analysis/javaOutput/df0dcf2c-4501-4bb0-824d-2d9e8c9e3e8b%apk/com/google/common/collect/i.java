package com.google.common.collect;

import com.google.common.base.b;
import com.google.common.base.e;
import com.google.common.base.j;
import java.util.Iterator;
import java.util.ListIterator;

public final class i
{
  static final ar<Object> a = new i.1();
  private static final Iterator<Object> b = new i.5();

  public static <T> aq<T> a()
  {
    return a;
  }

  public static <T> aq<T> a(T paramT)
  {
    return new i.4(paramT);
  }

  public static <T> aq<T> a(T[] paramArrayOfT)
  {
    com.google.common.base.i.a(paramArrayOfT);
    return new i.2(paramArrayOfT.length, paramArrayOfT);
  }

  static <T> ar<T> a(T[] paramArrayOfT, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 >= 0);
    for (boolean bool = true; ; bool = false)
    {
      com.google.common.base.i.a(bool);
      com.google.common.base.i.a(paramInt1, paramInt1 + paramInt2, paramArrayOfT.length);
      return new i.3(paramInt2, paramInt3, paramArrayOfT, paramInt1);
    }
  }

  public static String a(Iterator<?> paramIterator)
  {
    return ']';
  }

  public static <F, T> Iterator<T> a(Iterator<F> paramIterator, b<? super F, ? extends T> paramb)
  {
    com.google.common.base.i.a(paramb);
    return new i.7(paramIterator, paramb);
  }

  public static <T> boolean a(Iterator<T> paramIterator, j<? super T> paramj)
  {
    com.google.common.base.i.a(paramj);
    boolean bool = false;
    while (paramIterator.hasNext())
      if (paramj.a(paramIterator.next()))
      {
        paramIterator.remove();
        bool = true;
      }
    return bool;
  }

  public static boolean a(Iterator<?> paramIterator, Object paramObject)
  {
    if (paramObject == null)
    {
      do
        if (!paramIterator.hasNext())
          break;
      while (paramIterator.next() != null);
      return true;
    }
    while (paramIterator.hasNext())
      if (paramObject.equals(paramIterator.next()))
        return true;
    return false;
  }

  public static boolean a(Iterator<?> paramIterator1, Iterator<?> paramIterator2)
  {
    if (paramIterator1.hasNext())
      if (paramIterator2.hasNext());
    while (paramIterator2.hasNext())
    {
      return false;
      if (e.a(paramIterator1.next(), paramIterator2.next()))
        break;
      return false;
    }
    return true;
  }

  public static <T> aq<T> b(Iterator<T> paramIterator, j<? super T> paramj)
  {
    com.google.common.base.i.a(paramIterator);
    com.google.common.base.i.a(paramj);
    return new i.6(paramIterator, paramj);
  }

  static <T> ListIterator<T> b(Iterator<T> paramIterator)
  {
    return (ListIterator)paramIterator;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
