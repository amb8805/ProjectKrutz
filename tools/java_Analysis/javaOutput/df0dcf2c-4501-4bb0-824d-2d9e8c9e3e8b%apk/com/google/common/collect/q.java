package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

final class q<K, V> extends AbstractQueue<u<K, V>>
{
  final u<K, V> a = new q.1(this);

  q()
  {
  }

  private u<K, V> a()
  {
    u localu = this.a.f();
    if (localu == this.a)
      localu = null;
    return localu;
  }

  public final void clear()
  {
    u localu;
    for (Object localObject = this.a.f(); localObject != this.a; localObject = localu)
    {
      localu = ((u)localObject).f();
      MapMakerInternalMap.b((u)localObject);
    }
    this.a.a(this.a);
    this.a.b(this.a);
  }

  public final boolean contains(Object paramObject)
  {
    return ((u)paramObject).f() != MapMakerInternalMap.NullEntry.a;
  }

  public final boolean isEmpty()
  {
    return this.a.f() == this.a;
  }

  public final Iterator<u<K, V>> iterator()
  {
    return new q.2(this, a());
  }

  public final boolean remove(Object paramObject)
  {
    u localu1 = (u)paramObject;
    u localu2 = localu1.g();
    u localu3 = localu1.f();
    MapMakerInternalMap.a(localu2, localu3);
    MapMakerInternalMap.b(localu1);
    return localu3 != MapMakerInternalMap.NullEntry.a;
  }

  public final int size()
  {
    int i = 0;
    for (u localu = this.a.f(); localu != this.a; localu = localu.f())
      i++;
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
