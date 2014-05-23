package com.google.common.collect;

class RegularImmutableAsList<E> extends ImmutableAsList<E>
{
  private final ImmutableCollection<E> delegate;
  private final ImmutableList<? extends E> delegateList;

  private RegularImmutableAsList(ImmutableCollection<E> paramImmutableCollection, ImmutableList<? extends E> paramImmutableList)
  {
    this.delegate = paramImmutableCollection;
    this.delegateList = paramImmutableList;
  }

  RegularImmutableAsList(ImmutableCollection<E> paramImmutableCollection, Object[] paramArrayOfObject)
  {
    this(paramImmutableCollection, ImmutableList.b(paramArrayOfObject));
  }

  public final ar<E> a(int paramInt)
  {
    return this.delegateList.a(paramInt);
  }

  final ImmutableCollection<E> d()
  {
    return this.delegate;
  }

  public boolean equals(Object paramObject)
  {
    return this.delegateList.equals(paramObject);
  }

  public E get(int paramInt)
  {
    return this.delegateList.get(paramInt);
  }

  public int hashCode()
  {
    return this.delegateList.hashCode();
  }

  public int indexOf(Object paramObject)
  {
    return this.delegateList.indexOf(paramObject);
  }

  public int lastIndexOf(Object paramObject)
  {
    return this.delegateList.lastIndexOf(paramObject);
  }

  public Object[] toArray()
  {
    return this.delegateList.toArray();
  }

  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.delegateList.toArray(paramArrayOfT);
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.RegularImmutableAsList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
