package com.facebook.internal;

import android.content.Context;
import java.net.URI;

public final class o
{
  private Context a;
  private URI b;
  private q c;
  private boolean d;
  private Object e;

  private o(p paramp)
  {
    this.a = p.a(paramp);
    this.b = p.b(paramp);
    this.c = p.c(paramp);
    this.d = p.d(paramp);
    if (p.e(paramp) == null);
    for (Object localObject = new Object(); ; localObject = p.e(paramp))
    {
      this.e = localObject;
      return;
    }
  }

  public final Context a()
  {
    return this.a;
  }

  public final URI b()
  {
    return this.b;
  }

  public final q c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return this.d;
  }

  public final Object e()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
