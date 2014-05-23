package com.google.common.collect;

import com.google.common.base.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public abstract class am<T>
  implements Comparator<T>
{
  protected am()
  {
  }

  public static <T> am<T> a(Comparator<T> paramComparator)
  {
    if ((paramComparator instanceof am))
      return (am)paramComparator;
    return new ComparatorOrdering(paramComparator);
  }

  public static <C extends Comparable> am<C> b()
  {
    return NaturalOrdering.a;
  }

  public <S extends T> am<S> a()
  {
    return new ReverseOrdering(this);
  }

  public final <F> am<F> a(b<F, ? extends T> paramb)
  {
    return new ByFunctionOrdering(paramb, this);
  }

  public <E extends T> List<E> a(Iterable<E> paramIterable)
  {
    if ((paramIterable instanceof Collection));
    for (Object localObject = (Collection)paramIterable; ; localObject = Lists.a(paramIterable.iterator()))
    {
      Object[] arrayOfObject = (Object[])((Collection)localObject).toArray();
      Arrays.sort(arrayOfObject, this);
      return Lists.a(Arrays.asList(arrayOfObject));
    }
  }

  public abstract int compare(T paramT1, T paramT2);
}

/* Location:
 * Qualified Name:     com.google.common.collect.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
