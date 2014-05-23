package com.google.common.collect;

import java.util.Iterator;

public abstract class f<E>
{
  f()
  {
  }

  public f<E> a(Iterable<? extends E> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
      a(localIterator.next());
    return this;
  }

  public abstract f<E> a(E paramE);
}

/* Location:
 * Qualified Name:     com.google.common.collect.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
