package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;

final class t extends AbstractSet<K>
{
  t(MapMakerInternalMap paramMapMakerInternalMap)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }

  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }

  public final Iterator<K> iterator()
  {
    return new s(this.a);
  }

  public final boolean remove(Object paramObject)
  {
    return this.a.remove(paramObject) != null;
  }

  public final int size()
  {
    return this.a.size();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
