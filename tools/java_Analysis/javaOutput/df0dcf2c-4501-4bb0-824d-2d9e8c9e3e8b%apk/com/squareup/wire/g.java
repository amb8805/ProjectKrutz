package com.squareup.wire;

import java.util.LinkedHashMap;
import java.util.Map;

final class g
{
  private final Map<Class<? extends ExtendableMessage>, Map<Integer, e<?, ?>>> a = new LinkedHashMap();
  private final Map<Class<? extends ExtendableMessage>, Map<String, e<?, ?>>> b = new LinkedHashMap();

  g()
  {
  }

  public final <T extends ExtendableMessage<?>, E> e<T, E> a(Class<T> paramClass, int paramInt)
  {
    Map localMap = (Map)this.a.get(paramClass);
    if (localMap == null)
      return null;
    return (e)localMap.get(Integer.valueOf(paramInt));
  }

  public final <T extends ExtendableMessage<?>, E> void a(e<T, E> parame)
  {
    Class localClass = parame.a();
    Object localObject1 = (Map)this.a.get(localClass);
    Object localObject2 = (Map)this.b.get(localClass);
    if (localObject1 == null)
    {
      localObject1 = new LinkedHashMap();
      localObject2 = new LinkedHashMap();
      this.a.put(localClass, localObject1);
      this.b.put(localClass, localObject2);
    }
    ((Map)localObject1).put(Integer.valueOf(parame.e()), parame);
    ((Map)localObject2).put(parame.d(), parame);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
