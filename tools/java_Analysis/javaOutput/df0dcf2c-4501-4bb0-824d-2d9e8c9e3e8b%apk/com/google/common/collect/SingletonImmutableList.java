package com.google.common.collect;

import java.util.List;

final class SingletonImmutableList<E> extends ImmutableList<E>
{
  final transient E a;

  SingletonImmutableList(E paramE)
  {
    this.a = com.google.common.base.i.a(paramE);
  }

  public final ImmutableList<E> a(int paramInt1, int paramInt2)
  {
    com.google.common.base.i.a(paramInt1, paramInt2, 1);
    if (paramInt1 == paramInt2)
      this = EmptyImmutableList.a;
    return this;
  }

  final boolean a()
  {
    return false;
  }

  public final aq<E> b()
  {
    return i.a(this.a);
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.equals(paramObject);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    List localList;
    do
    {
      return true;
      if (!(paramObject instanceof List))
        break;
      localList = (List)paramObject;
    }
    while ((localList.size() == 1) && (this.a.equals(localList.get(0))));
    return false;
    return false;
  }

  public final E get(int paramInt)
  {
    com.google.common.base.i.a(paramInt, 1);
    return this.a;
  }

  public final int hashCode()
  {
    return 31 + this.a.hashCode();
  }

  public final int indexOf(Object paramObject)
  {
    if (this.a.equals(paramObject))
      return 0;
    return -1;
  }

  public final boolean isEmpty()
  {
    return false;
  }

  public final int lastIndexOf(Object paramObject)
  {
    return indexOf(paramObject);
  }

  public final int size()
  {
    return 1;
  }

  public final Object[] toArray()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return arrayOfObject;
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length == 0)
      paramArrayOfT = al.a(paramArrayOfT, 1);
    while (true)
    {
      paramArrayOfT[0] = this.a;
      return paramArrayOfT;
      if (paramArrayOfT.length > 1)
        paramArrayOfT[1] = null;
    }
  }

  public final String toString()
  {
    String str = this.a.toString();
    return 2 + str.length() + '[' + str + ']';
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.SingletonImmutableList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
