package com.squareup.wire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class f<T extends ExtendableMessage<?>>
{
  private final Map<e<T, ?>, Object> a = new TreeMap();

  public f()
  {
  }

  public final <E> E a(e<T, E> parame)
  {
    return this.a.get(parame);
  }

  public final List<e<T, ?>> a()
  {
    return Collections.unmodifiableList(new ArrayList(this.a.keySet()));
  }

  public final <E> void a(e<T, E> parame, E paramE)
  {
    this.a.put(parame, paramE);
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof f)) && (this.a.equals(((f)paramObject).a));
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{");
    Iterator localIterator = this.a.entrySet().iterator();
    for (String str = ""; localIterator.hasNext(); str = ", ")
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(str);
      localStringBuilder.append(((e)localEntry.getKey()).e());
      localStringBuilder.append("=");
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
