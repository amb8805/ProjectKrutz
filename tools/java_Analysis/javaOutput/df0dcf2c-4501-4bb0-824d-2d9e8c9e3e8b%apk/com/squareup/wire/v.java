package com.squareup.wire;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class v
{
  final g a = new g();
  private final Map<Class<? extends Message>, i<? extends Message>> b = new LinkedHashMap();
  private final Map<Class<? extends h>, a<? extends h>> c = new LinkedHashMap();
  private final Map<Class<? extends Enum>, c<? extends Enum>> d = new LinkedHashMap();

  private v(List<Class<?>> paramList)
  {
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Field[] arrayOfField = ((Class)localIterator.next()).getDeclaredFields();
      int i = arrayOfField.length;
      int j = 0;
      while (j < i)
      {
        Field localField = arrayOfField[j];
        if (localField.getType().equals(e.class));
        try
        {
          e locale = (e)localField.get(null);
          this.a.a(locale);
          j++;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new AssertionError(localIllegalAccessException);
        }
      }
    }
  }

  public v(Class<?>[] paramArrayOfClass)
  {
    this(Arrays.asList(paramArrayOfClass));
  }

  public final <M extends Message> M a(byte[] paramArrayOfByte, Class<M> paramClass)
  {
    w localw = w.a(paramArrayOfByte);
    return a(paramClass).a(localw);
  }

  final <M extends Message> i<M> a(Class<M> paramClass)
  {
    try
    {
      i locali = (i)this.b.get(paramClass);
      if (locali == null)
      {
        locali = new i(this, paramClass);
        this.b.put(paramClass, locali);
      }
      return locali;
    }
    finally
    {
    }
  }

  final <B extends h> a<B> b(Class<B> paramClass)
  {
    try
    {
      a locala = (a)this.c.get(paramClass);
      if (locala == null)
      {
        locala = new a(paramClass);
        this.c.put(paramClass, locala);
      }
      return locala;
    }
    finally
    {
    }
  }

  final <E extends Enum> c<E> c(Class<E> paramClass)
  {
    try
    {
      c localc = (c)this.d.get(paramClass);
      if (localc == null)
      {
        localc = new c(paramClass);
        this.d.put(paramClass, localc);
      }
      return localc;
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
