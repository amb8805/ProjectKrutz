package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class NaturalOrdering extends am<Comparable>
  implements Serializable
{
  static final NaturalOrdering a = new NaturalOrdering();

  private NaturalOrdering()
  {
  }

  public final <S extends Comparable> am<S> a()
  {
    return ReverseNaturalOrdering.a;
  }

  public final <E extends Comparable> List<E> a(Iterable<E> paramIterable)
  {
    ArrayList localArrayList = Lists.a(paramIterable);
    Collections.sort(localArrayList);
    return localArrayList;
  }

  public final String toString()
  {
    return "Ordering.natural()";
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.NaturalOrdering
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
