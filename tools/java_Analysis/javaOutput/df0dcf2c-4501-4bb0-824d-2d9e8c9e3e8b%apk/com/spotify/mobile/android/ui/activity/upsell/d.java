package com.spotify.mobile.android.ui.activity.upsell;

import android.os.AsyncTask;
import com.spotify.mobile.android.util.ci;
import com.spotify.mobile.android.util.cj;
import com.spotify.mobile.android.util.ck;
import com.spotify.mobile.android.util.cn;
import java.util.concurrent.TimeUnit;

public final class d
  implements Runnable
{
  private static final ck a = new cn(0L, TimeUnit.MILLISECONDS);
  private static final ck b = new cn(200L, TimeUnit.MILLISECONDS);
  private final m c;
  private final e d;
  private final ci e;
  private AsyncTask<Void, Void, String> f;
  private Long g;

  public d(m paramm, e parame)
  {
    this.c = paramm;
    this.d = parame;
    this.e = new cj("gpiab-detectcountry", this).a(a).c(b).a();
  }

  public final void a()
  {
    this.e.a();
  }

  public final void b()
  {
    this.e.d();
    if (this.f != null)
    {
      this.f.cancel(true);
      this.f = null;
    }
  }

  public final void c()
  {
    this.g = Long.valueOf(System.currentTimeMillis());
  }

  public final void run()
  {
    this.f = new d.1(this);
    this.f.execute(new Void[0]);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
