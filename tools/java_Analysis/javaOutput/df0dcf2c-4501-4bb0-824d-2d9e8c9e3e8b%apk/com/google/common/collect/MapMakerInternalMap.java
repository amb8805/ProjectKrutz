package com.google.common.collect;

import com.google.common.a.a;
import com.google.common.base.Equivalence;
import com.google.common.base.e;
import com.google.common.base.i;
import com.google.common.base.k;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Queue;;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

class MapMakerInternalMap<K, V> extends AbstractMap<K, V>
  implements Serializable, ConcurrentMap<K, V>
{
  static final ac<Object, Object> e = new MapMakerInternalMap.1();
  static final Queue<? extends Object> f = new MapMakerInternalMap.2();
  private static final Logger j = Logger.getLogger(MapMakerInternalMap.class.getName());
  final transient int a;
  final transient int b;
  final transient MapMakerInternalMap.Segment<K, V>[] c;
  final int concurrencyLevel;
  final transient MapMakerInternalMap.EntryFactory d;
  final long expireAfterAccessNanos;
  final long expireAfterWriteNanos;
  transient Set<K> g;
  transient Collection<V> h;
  transient Set<Map.Entry<K, V>> i;
  final Equivalence<Object> keyEquivalence;
  final MapMakerInternalMap.Strength keyStrength;
  final int maximumSize;
  final l<K, V> removalListener;
  final Queue<MapMaker.RemovalNotification<K, V>> removalNotificationQueue;
  final k ticker;
  final Equivalence<Object> valueEquivalence;
  final MapMakerInternalMap.Strength valueStrength;

  MapMakerInternalMap(MapMaker paramMapMaker)
  {
    this.concurrencyLevel = Math.min(paramMapMaker.c(), 65536);
    this.keyStrength = paramMapMaker.d();
    this.valueStrength = ((MapMakerInternalMap.Strength)e.b(paramMapMaker.g, MapMakerInternalMap.Strength.a));
    this.keyEquivalence = ((Equivalence)e.b(paramMapMaker.k, paramMapMaker.d().a()));
    this.valueEquivalence = this.valueStrength.a();
    this.maximumSize = paramMapMaker.e;
    long l2;
    if (paramMapMaker.i == -1L)
    {
      l2 = l1;
      this.expireAfterAccessNanos = l2;
      if (paramMapMaker.h != -1L)
        break label272;
      label118: this.expireAfterWriteNanos = l1;
      this.d = MapMakerInternalMap.EntryFactory.a(this.keyStrength, b(), a());
      this.ticker = ((k)e.b(paramMapMaker.l, k.b()));
      this.removalListener = paramMapMaker.a();
      if (this.removalListener != GenericMapMaker.NullListener.a)
        break label280;
    }
    int m;
    int n;
    int i1;
    label272: label280: for (Object localObject = f; ; localObject = new ConcurrentLinkedQueue())
    {
      this.removalNotificationQueue = ((Queue)localObject);
      m = Math.min(paramMapMaker.b(), 1073741824);
      if (a())
        m = Math.min(m, this.maximumSize);
      n = k;
      i1 = 0;
      while ((n < this.concurrencyLevel) && ((!a()) || (n * 2 <= this.maximumSize)))
      {
        i1++;
        n <<= 1;
      }
      l2 = paramMapMaker.i;
      break;
      l1 = paramMapMaker.h;
      break label118;
    }
    this.b = (32 - i1);
    this.a = (n - 1);
    this.c = new MapMakerInternalMap.Segment[n];
    int i2 = m / n;
    int i3;
    if (i2 * n < m)
      i3 = i2 + 1;
    while (true)
      if (k < i3)
      {
        k <<= 1;
      }
      else
      {
        boolean bool = a();
        int i4 = 0;
        if (bool)
        {
          int i5 = 1 + this.maximumSize / n;
          int i6 = this.maximumSize % n;
          while (i4 < this.c.length)
          {
            if (i4 == i6)
              i5--;
            this.c[i4] = a(k, i5);
            i4++;
          }
        }
        while (i4 < this.c.length)
        {
          this.c[i4] = a(k, -1);
          i4++;
        }
        return;
        i3 = i2;
      }
  }

  private int a(Object paramObject)
  {
    int k = this.keyEquivalence.a(paramObject);
    int m = k + (0xFFFFCD7D ^ k << 15);
    int n = m ^ m >>> 10;
    int i1 = n + (n << 3);
    int i2 = i1 ^ i1 >>> 6;
    int i3 = i2 + ((i2 << 2) + (i2 << 14));
    return i3 ^ i3 >>> 16;
  }

  private MapMakerInternalMap.Segment<K, V> a(int paramInt1, int paramInt2)
  {
    return new MapMakerInternalMap.Segment(this, paramInt1, paramInt2);
  }

  static <K, V> void a(u<K, V> paramu1, u<K, V> paramu2)
  {
    paramu1.a(paramu2);
    paramu2.b(paramu1);
  }

  static boolean a(u<K, V> paramu, long paramLong)
  {
    return paramLong - paramu.e() > 0L;
  }

  static <K, V> void b(u<K, V> paramu)
  {
    MapMakerInternalMap.NullEntry localNullEntry = MapMakerInternalMap.NullEntry.a;
    paramu.a(localNullEntry);
    paramu.b(localNullEntry);
  }

  static <K, V> void b(u<K, V> paramu1, u<K, V> paramu2)
  {
    paramu1.c(paramu2);
    paramu2.d(paramu1);
  }

  static <K, V> void c(u<K, V> paramu)
  {
    MapMakerInternalMap.NullEntry localNullEntry = MapMakerInternalMap.NullEntry.a;
    paramu.c(localNullEntry);
    paramu.d(localNullEntry);
  }

  static <K, V> ac<K, V> f()
  {
    return e;
  }

  static <K, V> u<K, V> g()
  {
    return MapMakerInternalMap.NullEntry.a;
  }

  static <E> Queue<E> h()
  {
    return f;
  }

  final MapMakerInternalMap.Segment<K, V> a(int paramInt)
  {
    return this.c[(paramInt >>> this.b & this.a)];
  }

  final boolean a()
  {
    return this.maximumSize != -1;
  }

  final boolean a(u<K, V> paramu)
  {
    return a(paramu, this.ticker.a());
  }

  final boolean b()
  {
    if (this.expireAfterWriteNanos > 0L);
    for (int k = 1; ; k = 0)
    {
      boolean bool1;
      if (k == 0)
      {
        boolean bool2 = c();
        bool1 = false;
        if (!bool2);
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
  }

  final boolean c()
  {
    return this.expireAfterAccessNanos > 0L;
  }

  public void clear()
  {
    MapMakerInternalMap.Segment[] arrayOfSegment = this.c;
    int k = arrayOfSegment.length;
    int m = 0;
    MapMakerInternalMap.Segment localSegment;
    while (true)
      if (m < k)
      {
        localSegment = arrayOfSegment[m];
        if (localSegment.count != 0)
        {
          localSegment.lock();
          try
          {
            AtomicReferenceArray localAtomicReferenceArray = localSegment.table;
            if (localSegment.map.removalNotificationQueue != f)
            {
              n = 0;
              if (n < localAtomicReferenceArray.length())
              {
                localu = (u)localAtomicReferenceArray.get(n);
                while (true)
                  if (localu != null)
                  {
                    localu.a();
                    localSegment.a(localu, MapMaker.RemovalCause.a);
                    localu = localu.b();
                    continue;
                    while (i1 < localAtomicReferenceArray.length())
                    {
                      localAtomicReferenceArray.set(i1, null);
                      i1++;
                    }
                    while ((localSegment.map.d()) && (localSegment.keyReferenceQueue.poll() != null));
                    while ((localSegment.map.e()) && (localSegment.valueReferenceQueue.poll() != null));
                    localSegment.evictionQueue.clear();
                    localSegment.expirationQueue.clear();
                    localSegment.readCount.set(0);
                    localSegment.modCount = (1 + localSegment.modCount);
                    localSegment.count = 0;
                    localSegment.unlock();
                    localSegment.d();
                    m++;
                    break;
                  }
              }
            }
          }
          finally
          {
            localSegment.unlock();
            localSegment.d();
          }
        }
      }
    while (true)
    {
      int n;
      u localu;
      return;
      n++;
      continue;
      int i1 = 0;
    }
  }

  public boolean containsKey(Object paramObject)
  {
    if (paramObject == null)
      return false;
    int k = a(paramObject);
    return a(k).b(paramObject, k);
  }

  public boolean containsValue(Object paramObject)
  {
    if (paramObject == null)
      return false;
    MapMakerInternalMap.Segment[] arrayOfSegment = this.c;
    int k = 0;
    long l2;
    for (long l1 = -1L; k < 3; l1 = l2)
    {
      int m = arrayOfSegment.length;
      int n = 0;
      long l3;
      for (l2 = 0L; n < m; l2 = l3)
      {
        MapMakerInternalMap.Segment localSegment = arrayOfSegment[n];
        AtomicReferenceArray localAtomicReferenceArray = localSegment.table;
        for (int i1 = 0; i1 < localAtomicReferenceArray.length(); i1++)
          for (u localu = (u)localAtomicReferenceArray.get(i1); localu != null; localu = localu.b())
          {
            Object localObject;
            if (localu.d() == null)
            {
              localSegment.a();
              localObject = null;
            }
            while ((localObject != null) && (this.valueEquivalence.a(paramObject, localObject)))
            {
              return true;
              localObject = localu.a().get();
              if (localObject == null)
              {
                localSegment.a();
                localObject = null;
              }
              else if ((localSegment.map.b()) && (localSegment.map.a(localu)))
              {
                localSegment.b();
                localObject = null;
              }
            }
          }
        l3 = l2 + localSegment.modCount;
        n++;
      }
      if (l2 == l1)
        break;
      k++;
    }
    return false;
  }

  final boolean d()
  {
    return this.keyStrength != MapMakerInternalMap.Strength.a;
  }

  final boolean e()
  {
    return this.valueStrength != MapMakerInternalMap.Strength.a;
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    Set localSet = this.i;
    if (localSet != null)
      return localSet;
    o localo = new o(this);
    this.i = localo;
    return localo;
  }

  public V get(Object paramObject)
  {
    if (paramObject == null)
      return null;
    int k = a(paramObject);
    return a(k).a(paramObject, k);
  }

  final void i()
  {
    while ((MapMaker.RemovalNotification)this.removalNotificationQueue.poll() != null)
      try
      {
      }
      catch (Exception localException)
      {
        j.log(Level.WARNING, "Exception thrown by removal listener", localException);
      }
  }

  public boolean isEmpty()
  {
    MapMakerInternalMap.Segment[] arrayOfSegment = this.c;
    int k = 0;
    long l = 0L;
    if (k < arrayOfSegment.length)
      if (arrayOfSegment[k].count == 0);
    label85: 
    do
    {
      return false;
      l += arrayOfSegment[k].modCount;
      k++;
      break;
      if (l == 0L)
        break label91;
      for (int m = 0; ; m++)
      {
        if (m >= arrayOfSegment.length)
          break label85;
        if (arrayOfSegment[m].count != 0)
          break;
        l -= arrayOfSegment[m].modCount;
      }
    }
    while (l != 0L);
    label91: return true;
  }

  public Set<K> keySet()
  {
    Set localSet = this.g;
    if (localSet != null)
      return localSet;
    t localt = new t(this);
    this.g = localt;
    return localt;
  }

  public V put(K paramK, V paramV)
  {
    i.a(paramK);
    i.a(paramV);
    int k = a(paramK);
    return a(k).a(paramK, k, paramV, false);
  }

  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public V putIfAbsent(K paramK, V paramV)
  {
    i.a(paramK);
    i.a(paramV);
    int k = a(paramK);
    return a(k).a(paramK, k, paramV, true);
  }

  public V remove(Object paramObject)
  {
    if (paramObject == null)
      return null;
    int k = a(paramObject);
    return a(k).c(paramObject, k);
  }

  public boolean remove(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null))
      return false;
    int k = a(paramObject1);
    return a(k).b(paramObject1, k, paramObject2);
  }

  public V replace(K paramK, V paramV)
  {
    i.a(paramK);
    i.a(paramV);
    int k = a(paramK);
    return a(k).a(paramK, k, paramV);
  }

  public boolean replace(K paramK, V paramV1, V paramV2)
  {
    i.a(paramK);
    i.a(paramV2);
    if (paramV1 == null)
      return false;
    int k = a(paramK);
    return a(k).a(paramK, k, paramV1, paramV2);
  }

  public int size()
  {
    MapMakerInternalMap.Segment[] arrayOfSegment = this.c;
    long l = 0L;
    for (int k = 0; k < arrayOfSegment.length; k++)
      l += arrayOfSegment[k].count;
    return a.a(l);
  }

  public Collection<V> values()
  {
    Collection localCollection = this.h;
    if (localCollection != null)
      return localCollection;
    ad localad = new ad(this);
    this.h = localad;
    return localad;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.MapMakerInternalMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
