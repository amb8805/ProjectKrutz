package com.spotify.mobile.android.e;

import com.spotify.mobile.android.util.cc;

final class c<T> extends a<T>
{
  private final T a;

  c(T paramT)
  {
    this.a = cc.a(paramT);
  }

  public final T b()
  {
    return this.a;
  }

  public final T c(T paramT)
  {
    return this.a;
  }

  public final boolean c()
  {
    return true;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    c localc = (c)paramObject;
    return this.a.equals(localc.a);
  }

  public final int hashCode()
  {
    return 48553596 + this.a.hashCode();
  }

  public final String toString()
  {
    return "Some{" + this.a + '}';
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
