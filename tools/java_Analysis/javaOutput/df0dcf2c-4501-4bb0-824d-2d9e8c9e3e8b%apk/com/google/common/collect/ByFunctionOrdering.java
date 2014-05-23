package com.google.common.collect;

import com.google.common.base.b;
import com.google.common.base.i;
import java.io.Serializable;
import java.util.Arrays;

final class ByFunctionOrdering<F, T> extends am<F>
  implements Serializable
{
  final b<F, ? extends T> function;
  final am<T> ordering;

  ByFunctionOrdering(b<F, ? extends T> paramb, am<T> paramam)
  {
    this.function = ((b)i.a(paramb));
    this.ordering = ((am)i.a(paramam));
  }

  public final int compare(F paramF1, F paramF2)
  {
    return this.ordering.compare(this.function.a(paramF1), this.function.a(paramF2));
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ByFunctionOrdering localByFunctionOrdering;
    do
    {
      return true;
      if (!(paramObject instanceof ByFunctionOrdering))
        break;
      localByFunctionOrdering = (ByFunctionOrdering)paramObject;
    }
    while ((this.function.equals(localByFunctionOrdering.function)) && (this.ordering.equals(localByFunctionOrdering.ordering)));
    return false;
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.function;
    arrayOfObject[1] = this.ordering;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    return this.ordering + ".onResultOf(" + this.function + ")";
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ByFunctionOrdering
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
