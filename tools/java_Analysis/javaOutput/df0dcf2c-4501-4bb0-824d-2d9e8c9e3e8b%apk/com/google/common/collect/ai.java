package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class ai<K, V> extends WeakReference<V>
  implements ac<K, V>
{
  final u<K, V> a;

  ai(ReferenceQueue<V> paramReferenceQueue, V paramV, u<K, V> paramu)
  {
    super(paramV, paramReferenceQueue);
    this.a = paramu;
  }

  public final ac<K, V> a(ReferenceQueue<V> paramReferenceQueue, V paramV, u<K, V> paramu)
  {
    return new ai(paramReferenceQueue, paramV, paramu);
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
 * Qualified Name:     com.google.common.collect.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
