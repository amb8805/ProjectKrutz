package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;

public abstract class ImmutableCollection<E>
  implements Serializable, Collection<E>
{
  static final ImmutableCollection<Object> b = new ImmutableCollection.EmptyImmutableCollection((byte)0);
  private transient ImmutableList<E> a;

  ImmutableCollection()
  {
  }

  abstract boolean a();

  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }

  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public abstract aq<E> b();

  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }

  public boolean contains(Object paramObject)
  {
    return (paramObject != null) && (i.a(b(), paramObject));
  }

  public boolean containsAll(Collection<?> paramCollection)
  {
    return d.a(this, paramCollection);
  }

  public ImmutableList<E> e()
  {
    ImmutableList localImmutableList = this.a;
    if (localImmutableList == null)
    {
      localImmutableList = f();
      this.a = localImmutableList;
    }
    return localImmutableList;
  }

  ImmutableList<E> f()
  {
    switch (size())
    {
    default:
      return new RegularImmutableAsList(this, toArray());
    case 0:
      return ImmutableList.g();
    case 1:
    }
    return ImmutableList.a(b().next());
  }

  public boolean isEmpty()
  {
    return size() == 0;
  }

  @Deprecated
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public Object[] toArray()
  {
    return al.a(this);
  }

  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return al.a(this, paramArrayOfT);
  }

  public String toString()
  {
    return d.a(this);
  }

  Object writeReplace()
  {
    return new ImmutableCollection.SerializedForm(toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ImmutableCollection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
