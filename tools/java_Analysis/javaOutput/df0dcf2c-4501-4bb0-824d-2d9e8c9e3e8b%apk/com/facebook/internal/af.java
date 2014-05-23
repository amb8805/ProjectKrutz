package com.facebook.internal;

import java.util.Collection;
import java.util.Iterator;

public final class af
{
  public static void a(Object paramObject, String paramString)
  {
    if (paramObject == null)
      throw new NullPointerException("Argument '" + paramString + "' cannot be null");
  }

  public static void a(String paramString1, String paramString2)
  {
    if (ad.a(paramString1))
      throw new IllegalArgumentException("Argument '" + paramString2 + "' cannot be null or empty");
  }

  public static <T> void a(Collection<T> paramCollection, String paramString)
  {
    a(paramCollection, paramString);
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (localIterator.next() == null)
        throw new NullPointerException("Container '" + paramString + "' cannot contain null values");
    if (paramCollection.isEmpty())
      throw new IllegalArgumentException("Container '" + paramString + "' cannot be empty");
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
