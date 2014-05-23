package com.facebook;

import android.content.Context;

public final class v
{
  private final Context a;
  private String b;
  private ac c;

  public v(Context paramContext)
  {
    this.a = paramContext;
  }

  public final Session a()
  {
    return new Session(this.a, this.b, this.c);
  }

  public final v a(String paramString)
  {
    this.b = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
