package com.google.common.collect;

import java.util.Collection;
import java.util.List;

final class EmptyImmutableList extends ImmutableList<Object>
{
  static final EmptyImmutableList a = new EmptyImmutableList();

  private EmptyImmutableList()
  {
  }

  public final ImmutableList<Object> a(int paramInt1, int paramInt2)
  {
    com.google.common.base.i.a(paramInt1, paramInt2, 0);
    return this;
  }

  public final ar<Object> a(int paramInt)
  {
    com.google.common.base.i.b(paramInt, 0);
    return i.a;
  }

  final boolean a()
  {
    return false;
  }

  public final aq<Object> b()
  {
    return i.a;
  }

  public final ar<Object> c()
  {
    return i.a;
  }

  public final boolean contains(Object paramObject)
  {
    return false;
  }

  public final boolean containsAll(Collection<?> paramCollection)
  {
    return paramCollection.isEmpty();
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof List))
      return ((List)paramObject).isEmpty();
    return false;
  }

  public final Object get(int paramInt)
  {
    com.google.common.base.i.a(paramInt, 0);
    throw new AssertionError("unreachable");
  }

  public final int hashCode()
  {
    return 1;
  }

  public final int indexOf(Object paramObject)
  {
    return -1;
  }

  public final boolean isEmpty()
  {
    return true;
  }

  public final int lastIndexOf(Object paramObject)
  {
    return -1;
  }

  public final int size()
  {
    return 0;
  }

  public final Object[] toArray()
  {
    return al.a;
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length > 0)
      paramArrayOfT[0] = null;
    return paramArrayOfT;
  }

  public final String toString()
  {
    return "[]";
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.EmptyImmutableList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
