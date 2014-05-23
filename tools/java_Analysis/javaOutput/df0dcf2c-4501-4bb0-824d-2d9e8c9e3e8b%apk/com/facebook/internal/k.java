package com.facebook.internal;

import android.content.Context;

final class k
  implements Runnable
{
  private Context a;
  private n b;
  private boolean c;

  k(Context paramContext, n paramn, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramn;
    this.c = paramBoolean;
  }

  public final void run()
  {
    j.a(this.b, this.a, this.c);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
