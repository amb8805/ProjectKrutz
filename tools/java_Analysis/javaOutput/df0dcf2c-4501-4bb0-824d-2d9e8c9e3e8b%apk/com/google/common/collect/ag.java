package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

final class ag<K, V> extends ae<K, V>
  implements u<K, V>
{
  volatile long d = 9223372036854775807L;
  u<K, V> e = MapMakerInternalMap.g();
  u<K, V> f = MapMakerInternalMap.g();

  ag(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, u<K, V> paramu)
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
}

/* Location:
 * Qualified Name:     com.google.common.collect.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
