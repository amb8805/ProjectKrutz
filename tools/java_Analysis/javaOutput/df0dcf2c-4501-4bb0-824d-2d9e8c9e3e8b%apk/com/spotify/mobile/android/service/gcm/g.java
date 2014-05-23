package com.spotify.mobile.android.service.gcm;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.google.android.gms.a.a;
import com.spotify.mobile.android.util.ci;
import com.spotify.mobile.android.util.cj;
import com.spotify.mobile.android.util.cn;
import com.spotify.mobile.android.util.co;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cy;
import java.util.concurrent.TimeUnit;

final class g
  implements Runnable
{
  private static final long a = TimeUnit.SECONDS.toMillis(10L);
  private static final long b = TimeUnit.HOURS.toMillis(20L);
  private static final long c = TimeUnit.HOURS.toMillis(28L);
  private static final cy d = cy.a("gcm_reg_id");
  private static final cy e = cy.a("gcm_app_version");
  private static final cy f = cy.a("gcm_valid_until");
  private static final cy g = cy.a("gcm_user");
  private final Context h;
  private final h i;
  private final a j;
  private final cw k;
  private final ci l;
  private AsyncTask<Void, Void, Pair<String, Long>> m;
  private boolean n;
  private final String o;

  g(Context paramContext, h paramh, a parama, String paramString)
  {
    this.h = paramContext;
    this.i = paramh;
    this.j = parama;
    this.n = true;
    this.o = paramString;
    this.k = cw.a(paramContext);
    this.l = new cj("gcm-registration", this).a(new cn(a, TimeUnit.MILLISECONDS)).b(new co(b, c, TimeUnit.MILLISECONDS)).c(new cn(2L, TimeUnit.MINUTES)).a(100).d(new co(b, c, TimeUnit.MILLISECONDS)).a();
  }

  public final void a()
  {
    this.l.a();
  }

  public final void b()
  {
    this.l.d();
    if (this.m != null)
    {
      this.m.cancel(false);
      this.m = null;
    }
  }

  public final void run()
  {
    this.m = new g.1(this);
    this.m.execute(new Void[0]);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.gcm.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
