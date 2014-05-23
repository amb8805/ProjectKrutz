package com.d.b;

public abstract class c<T, V>
{
  private final String a;
  private final Class<V> b;

  public c(Class<V> paramClass, String paramString)
  {
    this.a = paramString;
    this.b = paramClass;
  }

  public abstract V a(T paramT);

  public final String a()
  {
    return this.a;
  }

  public void a(T paramT, V paramV)
  {
    throw new UnsupportedOperationException("Property " + this.a + " is read-only");
  }
}

/* Location:
 * Qualified Name:     com.d.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
