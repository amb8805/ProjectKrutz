package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

final class p<K, V> extends AbstractQueue<u<K, V>>
{
  final u<K, V> a = new p.1(this);

  p()
  {
  }

  private u<K, V> a()
  {
    u localu = this.a.h();
    if (localu == this.a)
      localu = null;
    return localu;
  }

  public final void clear()
  {
    u localu;
    for (Object localObject = this.a.h(); localObject != this.a; localObject = localu)
    {
      localu = ((u)localObject).h();
      MapMakerInternalMap.c((u)localObject);
    }
    this.a.c(this.a);
    this.a.d(this.a);
  }

  public final boolean contains(Object paramObject)
  {
    return ((u)paramObject).h() != MapMakerInternalMap.NullEntry.a;
  }

  public final boolean isEmpty()
  {
    return this.a.h() == this.a;
  }

  public final Iterator<u<K, V>> iterator()
  {
    return new p.2(this, a());
  }

  public final boolean remove(Object paramObject)
  {
    u localu1 = (u)paramObject;
    u localu2 = localu1.i();
    u localu3 = localu1.h();
    MapMakerInternalMap.b(localu2, localu3);
    MapMakerInternalMap.c(localu1);
    return localu3 != MapMakerInternalMap.NullEntry.a;
  }

  public final int size()
  {
    int i = 0;
    for (u localu = this.a.h(); localu != this.a; localu = localu.h())
      i++;
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
