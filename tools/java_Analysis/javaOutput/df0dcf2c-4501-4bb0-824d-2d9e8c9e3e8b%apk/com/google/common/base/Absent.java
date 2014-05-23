package com.google.common.base;

final class Absent extends Optional<Object>
{
  static final Absent a = new Absent();

  private Absent()
  {
  }

  public final Object a(Object paramObject)
  {
    return i.a(paramObject, "use Optional.orNull() instead of Optional.or(null)");
  }

  public final boolean a()
  {
    return false;
  }

  public final Object b()
  {
    throw new IllegalStateException("Optional.get() cannot be called on an absent value");
  }

  public final Object c()
  {
    return null;
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }

  public final int hashCode()
  {
    return 1502476572;
  }

  public final String toString()
  {
    return "Optional.absent()";
  }
}

/* Location:
 * Qualified Name:     com.google.common.base.Absent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
