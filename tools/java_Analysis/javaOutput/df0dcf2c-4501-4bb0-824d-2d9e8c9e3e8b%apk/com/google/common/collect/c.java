package com.google.common.collect;

import java.util.NoSuchElementException;

public abstract class c<T> extends aq<T>
{
  private T a;

  protected c(T paramT)
  {
    this.a = paramT;
  }

  protected abstract T a(T paramT);

  public final boolean hasNext()
  {
    return this.a != null;
  }

  public final T next()
  {
    if (!hasNext())
      throw new NoSuchElementException();
    try
    {
      Object localObject2 = this.a;
      return localObject2;
    }
    finally
    {
      this.a = a(this.a);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.common.collect.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
