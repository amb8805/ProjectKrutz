package com.squareup.wire;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class p
{
  Map<Integer, List<q>> a;

  p()
  {
  }

  p(p paramp)
  {
    if (paramp.a != null)
      a().putAll(paramp.a);
  }

  private Map<Integer, List<q>> a()
  {
    if (this.a == null)
      this.a = new TreeMap();
    return this.a;
  }

  private static <T> void a(Map<Integer, List<q>> paramMap, int paramInt, T paramT, WireType paramWireType)
  {
    List localList = (List)paramMap.get(Integer.valueOf(paramInt));
    ArrayList localArrayList;
    if (localList == null)
    {
      localArrayList = new ArrayList();
      paramMap.put(Integer.valueOf(paramInt), localArrayList);
    }
    for (Object localObject1 = localArrayList; ; localObject1 = localList)
    {
      Object localObject2;
      switch (p.1.a[paramWireType.ordinal()])
      {
      default:
        throw new IllegalArgumentException("Unsupported wireType = " + paramWireType);
      case 1:
        localObject2 = new u(paramInt, (Long)paramT);
      case 2:
      case 3:
      case 4:
      }
      while ((((List)localObject1).size() > 0) && (((q)((List)localObject1).get(0)).b() != ((q)localObject2).b()))
      {
        throw new IllegalStateException("Wire type differs from previous type for tag");
        localObject2 = new r(paramInt, (Integer)paramT);
        continue;
        localObject2 = new s(paramInt, (Long)paramT);
        continue;
        localObject2 = new t(paramInt, (b)paramT);
      }
      ((List)localObject1).add(localObject2);
      return;
    }
  }

  final void a(int paramInt, b paramb)
  {
    a(a(), paramInt, paramb, WireType.c);
  }

  final void a(int paramInt, Integer paramInteger)
  {
    a(a(), paramInt, paramInteger, WireType.f);
  }

  final void a(int paramInt, Long paramLong)
  {
    a(a(), paramInt, paramLong, WireType.a);
  }

  final void b(int paramInt, Long paramLong)
  {
    a(a(), paramInt, paramLong, WireType.b);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
