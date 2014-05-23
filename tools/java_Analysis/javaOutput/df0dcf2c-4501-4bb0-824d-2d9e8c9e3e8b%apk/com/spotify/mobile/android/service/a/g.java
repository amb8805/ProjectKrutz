package com.spotify.mobile.android.service.a;

import com.spotify.mobile.android.e.a;

public final class g
{
  private final String a;
  private final String b;

  public g(f paramf)
  {
    this.a = paramf.b;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramf.d.c())
    {
      localStringBuilder.append((String)paramf.d.b());
      if (paramf.c.c())
        localStringBuilder.append(" — ");
    }
    if (paramf.c.c())
      localStringBuilder.append((String)paramf.c.b());
    this.b = localStringBuilder.toString();
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
