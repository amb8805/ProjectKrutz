package com.google.common.collect;

import java.util.ListIterator;

abstract class ap<F, T> extends ao<F, T>
  implements ListIterator<T>
{
  ap(ListIterator<? extends F> paramListIterator)
  {
    super(paramListIterator);
  }

  public void add(T paramT)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean hasPrevious()
  {
    return i.b(this.b).hasPrevious();
  }

  public final int nextIndex()
  {
    return i.b(this.b).nextIndex();
  }

  public final T previous()
  {
    return a(i.b(this.b).previous());
  }

  public final int previousIndex()
  {
    return i.b(this.b).previousIndex();
  }

  public void set(T paramT)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
