package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

final class af<K, V> extends ae<K, V>
  implements u<K, V>
{
  u<K, V> d = MapMakerInternalMap.g();
  u<K, V> e = MapMakerInternalMap.g();

  af(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, u<K, V> paramu)
  {
    super(paramReferenceQueue, paramK, paramInt, paramu);
  }

  public final void c(u<K, V> paramu)
  {
    this.d = paramu;
  }

  public final void d(u<K, V> paramu)
  {
    this.e = paramu;
  }

  public final u<K, V> h()
  {
    return this.d;
  }

  public final u<K, V> i()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
