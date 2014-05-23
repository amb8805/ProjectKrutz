package com.google.common.collect;

final class x<K, V> extends w<K, V>
  implements u<K, V>
{
  u<K, V> e = MapMakerInternalMap.g();
  u<K, V> f = MapMakerInternalMap.g();

  x(K paramK, int paramInt, u<K, V> paramu)
  {
    super(paramK, paramInt, paramu);
  }

  public final void c(u<K, V> paramu)
  {
    this.e = paramu;
  }

  public final void d(u<K, V> paramu)
  {
    this.f = paramu;
  }

  public final u<K, V> h()
  {
    return this.e;
  }

  public final u<K, V> i()
  {
    return this.f;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
