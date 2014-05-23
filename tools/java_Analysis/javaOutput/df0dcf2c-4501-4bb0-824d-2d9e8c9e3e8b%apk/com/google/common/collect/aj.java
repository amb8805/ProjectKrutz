package com.google.common.collect;

import java.util.Map.Entry;

final class aj extends b<K, V>
{
  final K a;
  V b;

  aj(K paramK, V paramV)
  {
    this.a = paramV;
    Object localObject;
    this.b = localObject;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    if (bool1)
    {
      Map.Entry localEntry = (Map.Entry)paramObject;
      boolean bool3 = this.a.equals(localEntry.getKey());
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.b.equals(localEntry.getValue());
        bool2 = false;
        if (bool4)
          bool2 = true;
      }
    }
    return bool2;
  }

  public final K getKey()
  {
    return this.a;
  }

  public final V getValue()
  {
    return this.b;
  }

  public final int hashCode()
  {
    return this.a.hashCode() ^ this.b.hashCode();
  }

  public final V setValue(V paramV)
  {
    Object localObject = this.c.put(this.a, paramV);
    this.b = paramV;
    return localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
