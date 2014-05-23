package com.google.common.collect;

import com.google.common.base.i;
import java.util.Iterator;

abstract class ao<F, T>
  implements Iterator<T>
{
  final Iterator<? extends F> b;

  ao(Iterator<? extends F> paramIterator)
  {
    this.b = ((Iterator)i.a(paramIterator));
  }

  abstract T a(F paramF);

  public final boolean hasNext()
  {
    return this.b.hasNext();
  }

  public final T next()
  {
    return a(this.b.next());
  }

  public final void remove()
  {
    this.b.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
