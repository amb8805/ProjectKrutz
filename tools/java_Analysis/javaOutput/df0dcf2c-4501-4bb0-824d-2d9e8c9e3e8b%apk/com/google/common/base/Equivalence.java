package com.google.common.base;

public abstract class Equivalence<T>
{
  protected Equivalence()
  {
  }

  public static Equivalence<Object> a()
  {
    return Equivalence.Equals.a;
  }

  public static Equivalence<Object> b()
  {
    return Equivalence.Identity.a;
  }

  public final int a(T paramT)
  {
    if (paramT == null)
      return 0;
    return b(paramT);
  }

  public final boolean a(T paramT1, T paramT2)
  {
    if (paramT1 == paramT2)
      return true;
    if ((paramT1 == null) || (paramT2 == null))
      return false;
    return b(paramT1, paramT2);
  }

  protected abstract int b(T paramT);

  protected abstract boolean b(T paramT1, T paramT2);
}

/* Location:
 * Qualified Name:     com.google.common.base.Equivalence
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
