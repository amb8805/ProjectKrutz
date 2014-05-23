package com.google.common.collect;

import com.google.common.base.e;

public abstract class GenericMapMaker<K0, V0>
{
  l<K0, V0> a;

  GenericMapMaker()
  {
  }

  final <K extends K0, V extends V0> l<K, V> a()
  {
    return (l)e.b(this.a, GenericMapMaker.NullListener.a);
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.GenericMapMaker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
