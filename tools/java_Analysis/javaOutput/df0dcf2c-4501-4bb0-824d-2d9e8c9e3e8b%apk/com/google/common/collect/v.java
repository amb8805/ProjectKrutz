package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

final class v<K, V> extends SoftReference<V>
  implements ac<K, V>
{
  final u<K, V> a;

  v(ReferenceQueue<V> paramReferenceQueue, V paramV, u<K, V> paramu)
  {
    super(paramV, paramReferenceQueue);
    this.a = paramu;
  }

  public final ac<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, u<K, V> paramu)
  {
    return new v(paramReferenceQueue, paramV, paramu);
  }

  public final u<K, V> a()
  {
    return this.a;
  }

  public final void b()
  {
    clear();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
