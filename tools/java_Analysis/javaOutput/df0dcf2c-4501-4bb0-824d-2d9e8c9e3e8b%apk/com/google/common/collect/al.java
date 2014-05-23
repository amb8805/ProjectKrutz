package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class al
{
  static final Object[] a = new Object[0];

  static Object a(Object paramObject, int paramInt)
  {
    if (paramObject == null)
      throw new NullPointerException("at index " + paramInt);
    return paramObject;
  }

  private static Object[] a(Iterable<?> paramIterable, Object[] paramArrayOfObject)
  {
    int i = 0;
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      int j = i + 1;
      paramArrayOfObject[i] = localObject;
      i = j;
    }
    return paramArrayOfObject;
  }

  static Object[] a(Collection<?> paramCollection)
  {
    return a(paramCollection, new Object[paramCollection.size()]);
  }

  static <T> T[] a(Collection<?> paramCollection, T[] paramArrayOfT)
  {
    int i = paramCollection.size();
    if (paramArrayOfT.length < i)
      paramArrayOfT = a(paramArrayOfT, i);
    a(paramCollection, paramArrayOfT);
    if (paramArrayOfT.length > i)
      paramArrayOfT[i] = null;
    return paramArrayOfT;
  }

  public static <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    return (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), paramInt);
  }

  static <T> T[] b(T[] paramArrayOfT, int paramInt)
  {
    Object[] arrayOfObject = a(paramArrayOfT, paramInt);
    System.arraycopy(paramArrayOfT, 0, arrayOfObject, 0, Math.min(paramArrayOfT.length, paramInt));
    return arrayOfObject;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
