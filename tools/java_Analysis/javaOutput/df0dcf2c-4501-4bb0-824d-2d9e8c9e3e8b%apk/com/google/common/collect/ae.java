package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class ae<K, V> extends WeakReference<K>
  implements u<K, V>
{
  final int a;
  final u<K, V> b;
  volatile ac<K, V> c = MapMakerInternalMap.f();

  ae(ReferenceQueue<K> paramReferenceQueue, K paramK, int paramInt, u<K, V> paramu)
  {
    super(paramK, paramReferenceQueue);
    this.a = paramInt;
    this.b = paramu;
  }

  public final ac<K, V> a()
  {
    return this.c;
  }

  public void a(long paramLong)
  {
    throw new UnsupportedOperationException();
  }

  public final void a(ac<K, V> paramac)
  {
    ac localac = this.c;
    this.c = paramac;
    localac.b();
  }

  public void a(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public final u<K, V> b()
  {
    return this.b;
  }

  public void b(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public final int c()
  {
    return this.a;
  }

  public void c(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public final K d()
  {
    return get();
  }

  public void d(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public long e()
  {
    throw new UnsupportedOperationException();
  }

  public u<K, V> f()
  {
    throw new UnsupportedOperationException();
  }

  public u<K, V> g()
  {
    throw new UnsupportedOperationException();
  }

  public u<K, V> h()
  {
    throw new UnsupportedOperationException();
  }

  public u<K, V> i()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
