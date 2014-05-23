package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.os.AsyncTask;

public final class b
  implements n
{
  private final Context a;
  private final o b;
  private c c;
  private m d;
  private AsyncTask<Void, Void, Boolean> e;

  public b(Context paramContext, o paramo)
  {
    this.a = paramContext;
    this.b = paramo;
  }

  public final void a()
  {
    this.d = new m(this.a);
    this.d.a(this);
    if ((!this.d.a()) && (this.c != null))
    {
      c localc = this.c;
      localc.a(this);
    }
  }

  public final void a(c paramc)
  {
    this.c = paramc;
  }

  public final void b()
  {
    this.d.b();
    this.d = null;
    if (this.e != null)
    {
      this.e.cancel(false);
      this.e = null;
    }
  }

  public final void c()
  {
    this.e = new b.1(this);
    this.e.execute(new Void[0]);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
