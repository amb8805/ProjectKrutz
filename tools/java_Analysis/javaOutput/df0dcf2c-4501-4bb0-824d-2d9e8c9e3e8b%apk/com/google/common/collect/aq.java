package com.google.common.collect;

import java.util.Iterator;

public abstract class aq<E>
  implements Iterator<E>
{
  protected aq()
  {
  }

  @Deprecated
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.aq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
