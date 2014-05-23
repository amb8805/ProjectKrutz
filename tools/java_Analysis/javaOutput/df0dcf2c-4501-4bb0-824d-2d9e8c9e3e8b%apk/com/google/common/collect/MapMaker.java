package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.a;
import com.google.common.base.e;
import com.google.common.base.f;
import com.google.common.base.i;
import com.google.common.base.k;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class MapMaker extends GenericMapMaker<Object, Object>
{
  boolean b;
  int c = -1;
  int d = -1;
  int e = -1;
  MapMakerInternalMap.Strength f;
  MapMakerInternalMap.Strength g;
  long h = -1L;
  long i = -1L;
  MapMaker.RemovalCause j;
  Equivalence<Object> k;
  k l;

  public MapMaker()
  {
  }

  final int b()
  {
    if (this.c == -1)
      return 16;
    return this.c;
  }

  final int c()
  {
    if (this.d == -1)
      return 4;
    return this.d;
  }

  final MapMakerInternalMap.Strength d()
  {
    return (MapMakerInternalMap.Strength)e.b(this.f, MapMakerInternalMap.Strength.a);
  }

  public final MapMaker e()
  {
    MapMakerInternalMap.Strength localStrength = MapMakerInternalMap.Strength.c;
    if (this.g == null);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.g;
      i.b(bool, "Value strength was already set to %s", arrayOfObject);
      this.g = ((MapMakerInternalMap.Strength)i.a(localStrength));
      if (localStrength != MapMakerInternalMap.Strength.a)
        this.b = true;
      return this;
    }
  }

  public final <K, V> ConcurrentMap<K, V> f()
  {
    if (!this.b)
      return new ConcurrentHashMap(b(), 0.75F, c());
    if (this.j == null);
    for (Object localObject = new MapMakerInternalMap(this); ; localObject = new MapMaker.NullConcurrentMap(this))
      return (ConcurrentMap)localObject;
  }

  public final String toString()
  {
    f localf = e.a(this);
    if (this.c != -1)
      localf.a("initialCapacity", this.c);
    if (this.d != -1)
      localf.a("concurrencyLevel", this.d);
    if (this.e != -1)
      localf.a("maximumSize", this.e);
    if (this.h != -1L)
      localf.a("expireAfterWrite", this.h + "ns");
    if (this.i != -1L)
      localf.a("expireAfterAccess", this.i + "ns");
    if (this.f != null)
      localf.a("keyStrength", a.a(this.f.toString()));
    if (this.g != null)
      localf.a("valueStrength", a.a(this.g.toString()));
    if (this.k != null)
      localf.a("keyEquivalence");
    if (this.a != null)
      localf.a("removalListener");
    return localf.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.MapMaker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
