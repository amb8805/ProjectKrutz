package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

public class c
{
  private final String a;

  private c(c paramc)
  {
    this.a = paramc.a;
  }

  private c(String paramString)
  {
    this.a = ((String)i.a(paramString));
  }

  public static c a(String paramString)
  {
    return new c(paramString);
  }

  CharSequence a(Object paramObject)
  {
    i.a(paramObject);
    if ((paramObject instanceof CharSequence))
      return (CharSequence)paramObject;
    return paramObject.toString();
  }

  public final String a(Iterable<?> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    return a(new StringBuilder(), localIterator).toString();
  }

  public final StringBuilder a(StringBuilder paramStringBuilder, Iterator<?> paramIterator)
  {
    try
    {
      i.a(paramStringBuilder);
      if (paramIterator.hasNext())
      {
        paramStringBuilder.append(a(paramIterator.next()));
        while (paramIterator.hasNext())
        {
          paramStringBuilder.append(this.a);
          paramStringBuilder.append(a(paramIterator.next()));
        }
      }
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
    return paramStringBuilder;
  }

  public c b(String paramString)
  {
    i.a(paramString);
    return new c.1(this, this, paramString);
  }

  public final d c(String paramString)
  {
    return new d(this, paramString, (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.google.common.base.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
