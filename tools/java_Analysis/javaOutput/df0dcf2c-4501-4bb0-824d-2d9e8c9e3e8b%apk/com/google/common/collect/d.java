package com.google.common.collect;

import com.google.common.base.c;
import com.google.common.base.i;
import java.util.Collection;
import java.util.Iterator;

public final class d
{
  static final c a = c.a(", ").b("null");

  static String a(Collection<?> paramCollection)
  {
    StringBuilder localStringBuilder = a(paramCollection.size()).append((char)'[');
    c localc = a;
    d.1 local1 = new d.1(paramCollection);
    i.a(paramCollection);
    i.a(local1);
    localc.a(localStringBuilder, new h.2(paramCollection, local1).iterator());
    return ']';
  }

  static StringBuilder a(int paramInt)
  {
    if (paramInt >= 0);
    for (boolean bool = true; ; bool = false)
    {
      i.a(bool, "size must be non-negative");
      return new StringBuilder((int)Math.min(8L * paramInt, 1073741824L));
    }
  }

  static <T> Collection<T> a(Iterable<T> paramIterable)
  {
    return (Collection)paramIterable;
  }

  static boolean a(Collection<?> paramCollection1, Collection<?> paramCollection2)
  {
    i.a(paramCollection1);
    Iterator localIterator = paramCollection2.iterator();
    while (localIterator.hasNext())
      if (!paramCollection1.contains(localIterator.next()))
        return false;
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
