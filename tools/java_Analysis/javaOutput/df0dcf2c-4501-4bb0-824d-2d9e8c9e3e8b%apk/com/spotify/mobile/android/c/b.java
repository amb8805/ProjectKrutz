package com.spotify.mobile.android.c;

import java.util.IdentityHashMap;
import java.util.Map;

final class b
{
  private Map<Class<?>, Map<Class<? extends a>, a>> a = new IdentityHashMap();

  b()
  {
  }

  public final <T extends a> T a(Class<?> paramClass, Class<T> paramClass1)
  {
    Map localMap = (Map)this.a.get(paramClass);
    if (localMap == null)
      throw new IllegalStateException("Could not find any local injections for " + paramClass.getName());
    a locala = (a)localMap.get(paramClass1);
    if (locala == null)
      throw new IllegalStateException("Could not find any injection for " + paramClass1.getName());
    return locala;
  }

  public final <T extends a> void a(Class<?> paramClass, Class<T> paramClass1, T paramT)
  {
    Object localObject = (Map)this.a.get(paramClass);
    if (localObject == null)
    {
      localObject = new IdentityHashMap();
      this.a.put(paramClass, localObject);
    }
    ((Map)localObject).put(paramClass1, paramT);
  }

  public final <T extends a> T b(Class<?> paramClass, Class<T> paramClass1)
  {
    Map localMap = (Map)this.a.get(paramClass);
    if (localMap == null)
      return null;
    return (a)localMap.get(paramClass1);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
