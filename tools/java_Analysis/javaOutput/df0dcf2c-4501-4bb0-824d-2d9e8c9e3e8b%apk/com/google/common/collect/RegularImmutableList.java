package com.google.common.collect;

import java.util.Iterator;
import java.util.List;

class RegularImmutableList<E> extends ImmutableList<E>
{
  private final transient int a;
  private final transient int c;
  private final transient Object[] d;

  RegularImmutableList(Object[] paramArrayOfObject)
  {
    this(paramArrayOfObject, 0, paramArrayOfObject.length);
  }

  private RegularImmutableList(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    this.d = paramArrayOfObject;
  }

  public final ar<E> a(int paramInt)
  {
    return i.a(this.d, this.a, this.c, paramInt);
  }

  final boolean a()
  {
    return (this.a != 0) || (this.c != this.d.length);
  }

  final ImmutableList<E> b(int paramInt1, int paramInt2)
  {
    return new RegularImmutableList(this.d, paramInt1 + this.a, paramInt2 - paramInt1);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof List))
      return false;
    List localList = (List)paramObject;
    if (size() != localList.size())
      return false;
    int i = this.a;
    if ((paramObject instanceof RegularImmutableList))
    {
      RegularImmutableList localRegularImmutableList = (RegularImmutableList)paramObject;
      int k = localRegularImmutableList.a;
      while (k < localRegularImmutableList.a + localRegularImmutableList.c)
      {
        Object[] arrayOfObject2 = this.d;
        int m = i + 1;
        if (!arrayOfObject2[i].equals(localRegularImmutableList.d[k]))
          return false;
        k++;
        i = m;
      }
    }
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      Object[] arrayOfObject1 = this.d;
      int j = i + 1;
      if (!arrayOfObject1[i].equals(localObject))
        return false;
      i = j;
    }
    return true;
  }

  public E get(int paramInt)
  {
    com.google.common.base.i.a(paramInt, this.c);
    return this.d[(paramInt + this.a)];
  }

  public boolean isEmpty()
  {
    return false;
  }

  public int size()
  {
    return this.c;
  }

  public Object[] toArray()
  {
    Object[] arrayOfObject = new Object[size()];
    System.arraycopy(this.d, this.a, arrayOfObject, 0, this.c);
    return arrayOfObject;
  }

  public <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length < this.c)
      paramArrayOfT = al.a(paramArrayOfT, this.c);
    while (true)
    {
      System.arraycopy(this.d, this.a, paramArrayOfT, 0, this.c);
      return paramArrayOfT;
      if (paramArrayOfT.length > this.c)
        paramArrayOfT[this.c] = null;
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = d.a(size()).append((char)'[').append(this.d[this.a]);
    for (int i = 1 + this.a; i < this.a + this.c; i++)
      localStringBuilder.append(", ").append(this.d[i]);
    return ']';
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.RegularImmutableList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
