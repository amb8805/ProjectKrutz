package com.google.common.collect;

final class y<K, V> extends w<K, V>
  implements u<K, V>
{
  volatile long e = 9223372036854775807L;
  u<K, V> f = MapMakerInternalMap.g();
  u<K, V> g = MapMakerInternalMap.g();

  y(K paramK, int paramInt, u<K, V> paramu)
  {
    super(paramK, paramInt, paramu);
  }

  public final void a(long paramLong)
  {
    this.e = paramLong;
  }

  public final void a(u<K, V> paramu)
  {
    this.f = paramu;
  }

  public final void b(u<K, V> paramu)
  {
    this.g = paramu;
  }

  public final long e()
  {
    return this.e;
  }

  public final u<K, V> f()
  {
    return this.f;
  }

  public final u<K, V> g()
  {
    return this.g;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
