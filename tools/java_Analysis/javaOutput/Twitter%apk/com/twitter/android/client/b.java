package com.twitter.android.client;

import android.content.Context;
import com.twitter.android.provider.ak;
import com.twitter.android.provider.q;

final class b
  implements Runnable
{
  b(g paramg, Context paramContext, String paramString, long paramLong)
  {
  }

  public final void run()
  {
    if (g.a(this.a).b(this.b).b() == e.a)
    {
      this.a.deleteDatabase(ak.f(this.c));
      q localq = q.a(this.a);
      localq.d(this.b);
      localq.c(this.b);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
