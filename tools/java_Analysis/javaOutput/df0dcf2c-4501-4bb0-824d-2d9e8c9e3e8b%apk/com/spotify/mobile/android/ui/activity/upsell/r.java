package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.widget.Toast;
import com.spotify.cosmos.smash.Connection;
import com.spotify.cosmos.smash.Subscriber;
import com.spotify.cosmos.smash.Subscription;
import com.spotify.cosmos.smash.util.HttpParser;
import com.spotify.mobile.android.provider.v;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.ci;
import com.spotify.mobile.android.util.cj;
import com.spotify.mobile.android.util.cl;
import com.spotify.mobile.android.util.cn;
import com.spotify.mobile.android.util.cr;
import java.util.concurrent.TimeUnit;

public final class r
{
  private final Context a;
  private final s b;
  private final Connection c;
  private final ci d;
  private cr e;
  private Subscription<Boolean> f;
  private String g;
  private final Runnable h = new r.1(this);
  private final HttpParser<Boolean> i = new r.2(this);
  private Subscriber<Boolean> j = new r.3(this);

  public r(Context paramContext, Connection paramConnection, s params)
  {
    this.a = paramContext;
    this.b = params;
    this.c = ((Connection)cc.a(paramConnection));
    this.e = new cr(paramContext, new t(this));
    this.d = new cj("start-optin-trial", this.h).a(new cn(0L, TimeUnit.MILLISECONDS)).c(new cl(200L, TimeUnit.MILLISECONDS)).a(5).a();
  }

  public final void a()
  {
    bp.c("Starting", new Object[0]);
    this.e.a(v.a, t.b(), null);
    Toast.makeText(this.a, 2131690319, 1).show();
  }

  public final void b()
  {
    bp.c("Stopping", new Object[0]);
    if (this.f != null)
    {
      this.f.cancel();
      this.f = null;
    }
    if (this.e != null)
    {
      this.e.b();
      this.e = null;
    }
    if (this.d.c())
      this.d.d();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
