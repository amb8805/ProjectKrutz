package com.spotify.mobile.android.service.a;

import com.spotify.mobile.android.e.a;

public final class d
{
  private final String a;

  public d(f paramf)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramf.b);
    if (paramf.d.c())
      localStringBuilder.append(" — ").append((String)paramf.d.b());
    this.a = localStringBuilder.toString();
  }

  public final String a()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
