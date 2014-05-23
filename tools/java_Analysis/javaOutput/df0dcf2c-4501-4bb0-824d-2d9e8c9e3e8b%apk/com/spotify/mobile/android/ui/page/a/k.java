package com.spotify.mobile.android.ui.page.a;

final class k
{
  private f a;
  private int b;

  public k(f paramf, int paramInt)
  {
    this.a = paramf;
    this.b = paramInt;
  }

  final f a()
  {
    return this.a;
  }

  final int b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    k localk;
    do
    {
      return true;
      if ((paramObject == null) || (paramObject.getClass() != getClass()))
        return false;
      localk = (k)paramObject;
      if (this.a != null)
        break;
    }
    while (localk.a == null);
    return false;
    return this.a.equals(localk.a);
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
