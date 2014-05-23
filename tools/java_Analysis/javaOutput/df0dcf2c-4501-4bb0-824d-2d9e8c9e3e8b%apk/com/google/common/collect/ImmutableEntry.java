package com.google.common.collect;

import java.io.Serializable;

class ImmutableEntry<K, V> extends b<K, V>
  implements Serializable
{
  private final K key;
  private final V value;

  ImmutableEntry(K paramK, V paramV)
  {
    this.key = paramK;
    this.value = paramV;
  }

  public K getKey()
  {
    return this.key;
  }

  public V getValue()
  {
    return this.value;
  }

  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ImmutableEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
