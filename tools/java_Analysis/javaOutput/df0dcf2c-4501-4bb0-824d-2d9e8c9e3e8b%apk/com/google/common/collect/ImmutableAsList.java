package com.google.common.collect;

abstract class ImmutableAsList<E> extends ImmutableList<E>
{
  ImmutableAsList()
  {
  }

  final boolean a()
  {
    return d().a();
  }

  public boolean contains(Object paramObject)
  {
    return d().contains(paramObject);
  }

  abstract ImmutableCollection<E> d();

  public boolean isEmpty()
  {
    return d().isEmpty();
  }

  public int size()
  {
    return d().size();
  }

  Object writeReplace()
  {
    return new ImmutableAsList.SerializedForm(d());
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ImmutableAsList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
