package com.google.common.collect;

import com.google.common.base.b;
import com.google.common.base.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class Lists
{
  public static <E> ArrayList<E> a(Iterable<? extends E> paramIterable)
  {
    i.a(paramIterable);
    if ((paramIterable instanceof Collection))
      return new ArrayList(d.a(paramIterable));
    return a(paramIterable.iterator());
  }

  public static <E> ArrayList<E> a(Iterator<? extends E> paramIterator)
  {
    i.a(paramIterator);
    ArrayList localArrayList = new ArrayList();
    while (paramIterator.hasNext())
      localArrayList.add(paramIterator.next());
    return localArrayList;
  }

  public static <T> List<List<T>> a(List<T> paramList, int paramInt)
  {
    i.a(paramList);
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      i.a(bool);
      if (!(paramList instanceof RandomAccess))
        break;
      return new k(paramList, paramInt);
    }
    return new j(paramList, paramInt);
  }

  public static <F, T> List<T> a(List<F> paramList, b<? super F, ? extends T> paramb)
  {
    if ((paramList instanceof RandomAccess))
      return new Lists.TransformingRandomAccessList(paramList, paramb);
    return new Lists.TransformingSequentialList(paramList, paramb);
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.Lists
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
