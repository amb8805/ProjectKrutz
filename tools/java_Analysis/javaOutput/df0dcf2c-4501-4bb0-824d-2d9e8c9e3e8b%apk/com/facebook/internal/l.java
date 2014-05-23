package com.facebook.internal;

import android.content.Context;

final class l
  implements Runnable
{
  private Context a;
  private n b;

  l(Context paramContext, n paramn)
  {
    this.a = paramContext;
    this.b = paramn;
  }

  public final void run()
  {
    j.a(this.b, this.a);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
