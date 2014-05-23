package com.google.common.base;

final class Present<T> extends Optional<T>
{
  private final T reference;

  Present(T paramT)
  {
    this.reference = paramT;
  }

  public final T a(T paramT)
  {
    i.a(paramT, "use Optional.orNull() instead of Optional.or(null)");
    return this.reference;
  }

  public final boolean a()
  {
    return true;
  }

  public final T b()
  {
    return this.reference;
  }

  public final T c()
  {
    return this.reference;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Present))
    {
      Present localPresent = (Present)paramObject;
      return this.reference.equals(localPresent.reference);
    }
    return false;
  }

  public final int hashCode()
  {
    return 1502476572 + this.reference.hashCode();
  }

  public final String toString()
  {
    return "Optional.of(" + this.reference + ")";
  }
}

/* Location:
 * Qualified Name:     com.google.common.base.Present
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
