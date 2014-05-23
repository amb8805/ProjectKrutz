package com.google.common.collect;

import com.google.common.base.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class r<E>
  implements Iterator<E>
{
  int b;
  int c;
  MapMakerInternalMap.Segment<K, V> d;
  AtomicReferenceArray<u<K, V>> e;
  u<K, V> f;
  MapMakerInternalMap<K, V>.aj g;
  MapMakerInternalMap<K, V>.aj h;

  r(MapMakerInternalMap paramMapMakerInternalMap)
  {
    this.b = (-1 + paramMapMakerInternalMap.c.length);
    this.c = -1;
    b();
  }

  private boolean a(u<K, V> paramu)
  {
    try
    {
      Object localObject2 = paramu.d();
      MapMakerInternalMap localMapMakerInternalMap = this.i;
      Object localObject3 = paramu.d();
      Object localObject4 = null;
      if (localObject3 == null);
      while (localObject4 != null)
      {
        this.g = new aj(this.i, localObject2, localObject4);
        return true;
        Object localObject5 = paramu.a().get();
        localObject4 = null;
        if (localObject5 != null)
          if (localMapMakerInternalMap.b())
          {
            boolean bool = localMapMakerInternalMap.a(paramu);
            localObject4 = null;
            if (bool);
          }
          else
          {
            localObject4 = localObject5;
          }
      }
      return false;
    }
    finally
    {
      this.d.c();
    }
  }

  private void b()
  {
    this.g = null;
    if (c());
    do
    {
      do
      {
        do
        {
          return;
          continue;
          while (d());
        }
        while (this.b < 0);
        MapMakerInternalMap.Segment[] arrayOfSegment = this.i.c;
        int j = this.b;
        this.b = (j - 1);
        this.d = arrayOfSegment[j];
      }
      while (this.d.count == 0);
      this.e = this.d.table;
      this.c = (-1 + this.e.length());
    }
    while (!d());
  }

  private boolean c()
  {
    if (this.f != null)
      for (this.f = this.f.b(); this.f != null; this.f = this.f.b())
        if (a(this.f))
          return true;
    return false;
  }

  private boolean d()
  {
    while (this.c >= 0)
    {
      AtomicReferenceArray localAtomicReferenceArray = this.e;
      int j = this.c;
      this.c = (j - 1);
      u localu = (u)localAtomicReferenceArray.get(j);
      this.f = localu;
      if ((localu != null) && ((a(this.f)) || (c())))
        return true;
    }
    return false;
  }

  final MapMakerInternalMap<K, V>.aj a()
  {
    if (this.g == null)
      throw new NoSuchElementException();
    this.h = this.g;
    b();
    return this.h;
  }

  public boolean hasNext()
  {
    return this.g != null;
  }

  public void remove()
  {
    if (this.h != null);
    for (boolean bool = true; ; bool = false)
    {
      i.b(bool);
      this.i.remove(this.h.getKey());
      this.h = null;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
