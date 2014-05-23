package com.google.common.collect;

import java.util.AbstractList;
import java.util.List;

class j<T> extends AbstractList<List<T>>
{
  final List<T> a;
  final int b;

  j(List<T> paramList, int paramInt)
  {
    this.a = paramList;
    this.b = paramInt;
  }

  public boolean isEmpty()
  {
    return this.a.isEmpty();
  }

  public int size()
  {
    int i = this.a.size() / this.b;
    if (i * this.b != this.a.size())
      i++;
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
