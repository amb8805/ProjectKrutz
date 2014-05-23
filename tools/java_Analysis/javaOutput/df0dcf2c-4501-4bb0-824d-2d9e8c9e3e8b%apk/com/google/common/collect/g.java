package com.google.common.collect;

import com.google.common.base.i;
import java.util.Collection;

public final class g<E> extends f<E>
{
  private Object[] a = new Object[4];
  private int b = 0;

  public g()
  {
    this((byte)0);
  }

  private g(byte paramByte)
  {
  }

  private g<E> a(int paramInt)
  {
    if (this.a.length < paramInt)
    {
      Object[] arrayOfObject = this.a;
      int i = this.a.length;
      if (paramInt < 0)
        throw new AssertionError("cannot store more than MAX_VALUE elements");
      int j = 1 + (i + (i >> 1));
      if (j < paramInt)
        j = Integer.highestOneBit(paramInt - 1) << 1;
      if (j < 0)
        j = 2147483647;
      this.a = al.b(arrayOfObject, j);
    }
    return this;
  }

  public final ImmutableList<E> a()
  {
    switch (this.b)
    {
    default:
      if (this.b == this.a.length)
        return new RegularImmutableList(this.a);
    case 0:
      return ImmutableList.g();
    case 1:
      return ImmutableList.a(this.a[0]);
    }
    return new RegularImmutableList(al.b(this.a, this.b));
  }

  public final g<E> b(Iterable<? extends E> paramIterable)
  {
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      a(this.b + localCollection.size());
    }
    super.a(paramIterable);
    return this;
  }

  public final g<E> b(E paramE)
  {
    i.a(paramE);
    a(1 + this.b);
    Object[] arrayOfObject = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfObject[i] = paramE;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
