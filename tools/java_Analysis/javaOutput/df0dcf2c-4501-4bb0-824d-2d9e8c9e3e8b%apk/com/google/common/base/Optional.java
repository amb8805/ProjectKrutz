package com.google.common.base;

import java.io.Serializable;

public abstract class Optional<T>
  implements Serializable
{
  private static final long serialVersionUID;

  Optional()
  {
  }

  public static <T> Optional<T> b(T paramT)
  {
    return new Present(i.a(paramT));
  }

  public static <T> Optional<T> c(T paramT)
  {
    if (paramT == null)
      return Absent.a;
    return new Present(paramT);
  }

  public static <T> Optional<T> d()
  {
    return Absent.a;
  }

  public abstract T a(T paramT);

  public abstract boolean a();

  public abstract T b();

  public abstract T c();
}

/* Location:
 * Qualified Name:     com.google.common.base.Optional
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
