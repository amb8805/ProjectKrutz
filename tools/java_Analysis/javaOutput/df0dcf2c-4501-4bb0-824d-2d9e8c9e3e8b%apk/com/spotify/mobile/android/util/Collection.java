package com.spotify.mobile.android.util;

public final class Collection
{
  public static Collection.State a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
      return Collection.State.c;
    if ((paramInt2 > 0) && (paramInt2 < paramInt1))
      return Collection.State.b;
    return Collection.State.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.Collection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
