package com.google.common.collect;

import com.google.common.base.j;
import java.util.List;
import java.util.RandomAccess;

public final class h
{
  public static <T> boolean a(Iterable<T> paramIterable, j<? super T> paramj)
  {
    if (((paramIterable instanceof RandomAccess)) && ((paramIterable instanceof List)))
      return a((List)paramIterable, (j)com.google.common.base.i.a(paramj));
    return i.a(paramIterable.iterator(), paramj);
  }

  private static <T> boolean a(List<T> paramList, j<? super T> paramj)
  {
    int i = 0;
    int j = 0;
    while (true)
      if (j < paramList.size())
      {
        Object localObject = paramList.get(j);
        if (!paramj.a(localObject))
        {
          if (j > i);
          try
          {
            paramList.set(i, localObject);
            i++;
            j++;
          }
          catch (UnsupportedOperationException localUnsupportedOperationException)
          {
            for (k = -1 + paramList.size(); k > j; k--)
              if (paramj.a(paramList.get(k)))
                paramList.remove(k);
            for (m = j - 1; m >= i; m--)
              paramList.remove(m);
            bool = true;
          }
        }
      }
    do
    {
      int k;
      int m;
      return bool;
      paramList.subList(i, paramList.size()).clear();
      boolean bool = false;
    }
    while (j == i);
    return true;
  }

  public static <T> Iterable<T> b(Iterable<T> paramIterable, j<? super T> paramj)
  {
    com.google.common.base.i.a(paramIterable);
    com.google.common.base.i.a(paramj);
    return new h.1(paramIterable, paramj);
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
