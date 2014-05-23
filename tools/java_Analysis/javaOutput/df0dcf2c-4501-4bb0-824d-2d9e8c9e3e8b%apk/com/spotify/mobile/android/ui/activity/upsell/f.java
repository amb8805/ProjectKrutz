package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.os.AsyncTask;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ci;
import com.spotify.mobile.android.util.cj;
import com.spotify.mobile.android.util.ck;
import com.spotify.mobile.android.util.cn;
import com.spotify.mobile.android.util.co;
import java.util.concurrent.TimeUnit;

final class f
  implements n, Runnable
{
  private static final ck a = new cn(10L, TimeUnit.SECONDS);
  private static final ck b = new co(10L, 30L, TimeUnit.MINUTES);
  private static final ck c = new co(8L, 14L, TimeUnit.HOURS);
  private final Context d;
  private final ci e;
  private m f;
  private g g;
  private AsyncTask<Void, Void, h> h;

  public f(Context paramContext)
  {
    this.d = paramContext;
    this.e = new cj("gpiab-fetch-purchases", this).a(a).c(b).a(10).d(c).a();
  }

  public final void a()
  {
    this.e.a();
  }

  public final void a(g paramg)
  {
    this.g = paramg;
  }

  public final void b()
  {
    this.e.d();
    if (this.h != null)
    {
      this.h.cancel(false);
      this.h = null;
    }
    if (this.f != null)
    {
      this.f.b();
      this.f = null;
    }
    this.g = null;
  }

  public final void c()
  {
    bp.a("Got connection to Google Play, start fetching purchases", new Object[0]);
    this.h = new f.1(this).execute(new Void[0]);
  }

  public final void d()
  {
    this.e.b();
  }

  public final void run()
  {
    this.f = new m(this.d);
    this.f.a(this);
    this.f.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
