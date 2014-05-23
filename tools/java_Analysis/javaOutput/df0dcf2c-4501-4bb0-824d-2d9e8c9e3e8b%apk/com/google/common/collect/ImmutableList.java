package com.google.common.collect;

import com.google.common.base.e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E>
  implements List<E>, RandomAccess
{
  ImmutableList()
  {
  }

  public static <E> ImmutableList<E> a(E paramE)
  {
    return new SingletonImmutableList(paramE);
  }

  public static <E> ImmutableList<E> a(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof ImmutableCollection))
    {
      ImmutableList localImmutableList = ((ImmutableCollection)paramCollection).e();
      if (localImmutableList.a())
        localImmutableList = b(localImmutableList);
      return localImmutableList;
    }
    return b(paramCollection);
  }

  public static <E> ImmutableList<E> a(E[] paramArrayOfE)
  {
    switch (paramArrayOfE.length)
    {
    default:
      return c((Object[])paramArrayOfE.clone());
    case 0:
      return EmptyImmutableList.a;
    case 1:
    }
    return new SingletonImmutableList(paramArrayOfE[0]);
  }

  private static <E> ImmutableList<E> b(Collection<? extends E> paramCollection)
  {
    return b(paramCollection.toArray());
  }

  static <E> ImmutableList<E> b(Object[] paramArrayOfObject)
  {
    switch (paramArrayOfObject.length)
    {
    default:
      return c(paramArrayOfObject);
    case 0:
      return EmptyImmutableList.a;
    case 1:
    }
    return new SingletonImmutableList(paramArrayOfObject[0]);
  }

  private static <E> ImmutableList<E> c(Object[] paramArrayOfObject)
  {
    for (int i = 0; i < paramArrayOfObject.length; i++)
      al.a(paramArrayOfObject[i], i);
    return new RegularImmutableList(paramArrayOfObject);
  }

  public static <E> ImmutableList<E> g()
  {
    return EmptyImmutableList.a;
  }

  public static <E> g<E> h()
  {
    return new g();
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }

  public ImmutableList<E> a(int paramInt1, int paramInt2)
  {
    com.google.common.base.i.a(paramInt1, paramInt2, size());
    switch (paramInt2 - paramInt1)
    {
    default:
      return b(paramInt1, paramInt2);
    case 0:
      return EmptyImmutableList.a;
    case 1:
    }
    return a(get(paramInt1));
  }

  public ar<E> a(int paramInt)
  {
    return new ImmutableList.1(this, size(), paramInt);
  }

  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }

  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  ImmutableList<E> b(int paramInt1, int paramInt2)
  {
    return new ImmutableList.SubList(this, paramInt1, paramInt2 - paramInt1);
  }

  public aq<E> b()
  {
    return c();
  }

  public ar<E> c()
  {
    return a(0);
  }

  public boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }

  public final ImmutableList<E> e()
  {
    return this;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == com.google.common.base.i.a(this));
    List localList;
    do
    {
      return true;
      if (!(paramObject instanceof List))
        break;
      localList = (List)paramObject;
    }
    while ((size() == localList.size()) && (i.a(iterator(), localList.iterator())));
    return false;
  }

  public int hashCode()
  {
    int i = 1;
    Iterator localIterator = iterator();
    if (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      int j = i * 31;
      if (localObject == null);
      for (int k = 0; ; k = localObject.hashCode())
      {
        i = 0xFFFFFFFF ^ (0xFFFFFFFF ^ k + j);
        break;
      }
    }
    return i;
  }

  public int indexOf(Object paramObject)
  {
    if (paramObject != null)
    {
      ListIterator localListIterator = listIterator();
      while (localListIterator.hasNext())
        if (e.a(paramObject, localListIterator.next()))
          return localListIterator.previousIndex();
    }
    return -1;
  }

  public int lastIndexOf(Object paramObject)
  {
    if (paramObject != null)
    {
      ListIterator localListIterator = listIterator(size());
      while (localListIterator.hasPrevious())
        if (e.a(paramObject, localListIterator.previous()))
          return localListIterator.nextIndex();
    }
    return -1;
  }

  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }

  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }

  Object writeReplace()
  {
    return new ImmutableList.SerializedForm(toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ImmutableList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
