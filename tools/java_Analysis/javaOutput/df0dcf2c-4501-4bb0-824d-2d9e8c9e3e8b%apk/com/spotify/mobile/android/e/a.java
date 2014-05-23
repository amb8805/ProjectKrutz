package com.spotify.mobile.android.e;

public abstract class a<T>
{
  public a()
  {
  }

  public static <T> a<T> a()
  {
    return b.a;
  }

  public static <T> a<T> a(T paramT)
  {
    return new c(paramT);
  }

  public static <T> a<T> b(T paramT)
  {
    if (paramT == null)
      return b.a;
    return a(paramT);
  }

  public abstract T b();

  public T c(T paramT)
  {
    if (c())
      paramT = b();
    return paramT;
  }

  public abstract boolean c();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
