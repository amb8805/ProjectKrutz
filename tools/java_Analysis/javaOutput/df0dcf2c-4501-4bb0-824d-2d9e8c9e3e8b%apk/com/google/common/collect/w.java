package com.google.common.collect;

class w<K, V>
  implements u<K, V>
{
  final K a;
  final int b;
  final u<K, V> c;
  volatile ac<K, V> d = MapMakerInternalMap.f();

  w(K paramK, int paramInt, u<K, V> paramu)
  {
    this.a = paramK;
    this.b = paramInt;
    this.c = paramu;
  }

  public final ac<K, V> a()
  {
    return this.d;
  }

  public void a(long paramLong)
  {
    throw new UnsupportedOperationException();
  }

  public final void a(ac<K, V> paramac)
  {
    ac localac = this.d;
    this.d = paramac;
    localac.b();
  }

  public void a(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public final u<K, V> b()
  {
    return this.c;
  }

  public void b(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public final int c()
  {
    return this.b;
  }

  public void c(u<K, V> paramu)
  {
    throw new UnsupportedOperationException();
  }

  public final K d()
  {
    return this.a;
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
 * Qualified Name:     com.google.common.collect.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
