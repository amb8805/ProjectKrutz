package com.google.common.collect;

final class z<K, V> extends w<K, V>
  implements u<K, V>
{
  volatile long e = 9223372036854775807L;
  u<K, V> f = MapMakerInternalMap.g();
  u<K, V> g = MapMakerInternalMap.g();
  u<K, V> h = MapMakerInternalMap.g();
  u<K, V> i = MapMakerInternalMap.g();

  z(K paramK, int paramInt, u<K, V> paramu)
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

  public final void c(u<K, V> paramu)
  {
    this.h = paramu;
  }

  public final void d(u<K, V> paramu)
  {
    this.i = paramu;
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

  public final u<K, V> h()
  {
    return this.h;
  }

  public final u<K, V> i()
  {
    return this.i;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
