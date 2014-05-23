package com.google.common.collect;

import com.google.common.base.i;
import java.io.Serializable;

final class ReverseOrdering<T> extends am<T>
  implements Serializable
{
  final am<? super T> forwardOrder;

  ReverseOrdering(am<? super T> paramam)
  {
    this.forwardOrder = ((am)i.a(paramam));
  }

  public final <S extends T> am<S> a()
  {
    return this.forwardOrder;
  }

  public final int compare(T paramT1, T paramT2)
  {
    return this.forwardOrder.compare(paramT2, paramT1);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof ReverseOrdering))
    {
      ReverseOrdering localReverseOrdering = (ReverseOrdering)paramObject;
      return this.forwardOrder.equals(localReverseOrdering.forwardOrder);
    }
    return false;
  }

  public final int hashCode()
  {
    return -this.forwardOrder.hashCode();
  }

  public final String toString()
  {
    return this.forwardOrder + ".reverse()";
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ReverseOrdering
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
