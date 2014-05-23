package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

final class ComparatorOrdering<T> extends am<T>
  implements Serializable
{
  final Comparator<T> comparator;

  ComparatorOrdering(Comparator<T> paramComparator)
  {
    this.comparator = ((Comparator)i.a(paramComparator));
  }

  public final <E extends T> List<E> a(Iterable<E> paramIterable)
  {
    ArrayList localArrayList = Lists.a(paramIterable);
    Collections.sort(localArrayList, this.comparator);
    return localArrayList;
  }

  public final int compare(T paramT1, T paramT2)
  {
    return this.comparator.compare(paramT1, paramT2);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof ComparatorOrdering))
    {
      ComparatorOrdering localComparatorOrdering = (ComparatorOrdering)paramObject;
      return this.comparator.equals(localComparatorOrdering.comparator);
    }
    return false;
  }

  public final int hashCode()
  {
    return this.comparator.hashCode();
  }

  public final String toString()
  {
    return this.comparator.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ComparatorOrdering
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
