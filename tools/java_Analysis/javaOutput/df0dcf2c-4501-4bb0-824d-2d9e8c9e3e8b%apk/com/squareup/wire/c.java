package com.squareup.wire;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

final class c<E extends Enum>
{
  private final Map<Integer, E> a = new LinkedHashMap();
  private final Map<E, Integer> b = new LinkedHashMap();

  c(Class<E> paramClass)
  {
    Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
    int i = arrayOfEnum.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        Enum localEnum = arrayOfEnum[j];
        try
        {
          Field localField = paramClass.getField(localEnum.name());
          if (localField.isAnnotationPresent(l.class))
          {
            int k = ((l)localField.getAnnotation(l.class)).a();
            this.a.put(Integer.valueOf(k), localEnum);
            this.b.put(localEnum, Integer.valueOf(k));
          }
          j++;
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          throw new RuntimeException(localNoSuchFieldException);
        }
      }
  }

  public final int a(E paramE)
  {
    return ((Integer)this.b.get(paramE)).intValue();
  }

  public final E a(int paramInt)
  {
    return (Enum)this.a.get(Integer.valueOf(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
