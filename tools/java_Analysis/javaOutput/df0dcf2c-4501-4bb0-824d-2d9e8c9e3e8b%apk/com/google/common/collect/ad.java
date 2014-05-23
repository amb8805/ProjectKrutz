package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

final class ad extends AbstractCollection<V>
{
  ad(MapMakerInternalMap paramMapMakerInternalMap)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.containsValue(paramObject);
  }

  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }

  public final Iterator<V> iterator()
  {
    return new ab(this.a);
  }

  public final int size()
  {
    return this.a.size();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
