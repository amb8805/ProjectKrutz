package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class o extends AbstractSet<Map.Entry<K, V>>
{
  o(MapMakerInternalMap paramMapMakerInternalMap)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    Map.Entry localEntry;
    Object localObject2;
    do
    {
      Object localObject1;
      do
      {
        return false;
        localEntry = (Map.Entry)paramObject;
        localObject1 = localEntry.getKey();
      }
      while (localObject1 == null);
      localObject2 = this.a.get(localObject1);
    }
    while ((localObject2 == null) || (!this.a.valueEquivalence.a(localEntry.getValue(), localObject2)));
    return true;
  }

  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new n(this.a);
  }

  public final boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    Map.Entry localEntry;
    Object localObject;
    do
    {
      return false;
      localEntry = (Map.Entry)paramObject;
      localObject = localEntry.getKey();
    }
    while ((localObject == null) || (!this.a.remove(localObject, localEntry.getValue())));
    return true;
  }

  public final int size()
  {
    return this.a.size();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
