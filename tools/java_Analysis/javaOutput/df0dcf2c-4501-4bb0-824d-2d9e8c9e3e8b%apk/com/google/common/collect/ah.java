package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

final class ah<K, V> extends ae<K, V>
  implements u<K, V>
{
  volatile long d = 9223372036854775807L;
  u<K, V> e = MapMakerInternalMap.g();
  u<K, V> f = MapMakerInternalMap.g();
  u<K, V> g = MapMakerInternalMap.g();
  u<K, V> h = MapMakerInternalMap.g();

  ah(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, u<K, V> paramu)
  {
    super(paramReferenceQueue, paramK, paramInt, paramu);
  }

  public final void a(long paramLong)
  {
    this.d = paramLong;
  }

  public final void a(u<K, V> paramu)
  {
    this.e = paramu;
  }

  public final void b(u<K, V> paramu)
  {
    this.f = paramu;
  }

  public final void c(u<K, V> paramu)
  {
    this.g = paramu;
  }

  public final void d(u<K, V> paramu)
  {
    this.h = paramu;
  }

  public final long e()
  {
    return this.d;
  }

  public final u<K, V> f()
  {
    return this.e;
  }

  public final u<K, V> g()
  {
    return this.f;
  }

  public final u<K, V> h()
  {
    return this.g;
  }

  public final u<K, V> i()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
