package com.google.common.collect;

import java.io.Serializable;

final class ReverseNaturalOrdering extends am<Comparable>
  implements Serializable
{
  static final ReverseNaturalOrdering a = new ReverseNaturalOrdering();

  private ReverseNaturalOrdering()
  {
  }

  public final <S extends Comparable> am<S> a()
  {
    return NaturalOrdering.a;
  }

  public final String toString()
  {
    return "Ordering.natural().reverse()";
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ReverseNaturalOrdering
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
