package com.spotify.mobile.android.util;

import java.util.EnumSet;

public abstract class l<E extends Enum<E>>
{
  private EnumSet<E> a;

  public l()
  {
    this.a = null;
  }

  public l(EnumSet<E> paramEnumSet)
  {
    this.a = paramEnumSet;
  }

  public final EnumSet<E> a()
  {
    return this.a;
  }

  public abstract void a(EnumSet<E> paramEnumSet1, EnumSet<E> paramEnumSet2);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
