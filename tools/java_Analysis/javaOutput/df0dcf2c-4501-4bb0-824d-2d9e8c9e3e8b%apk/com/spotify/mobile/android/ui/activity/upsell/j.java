package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.smash.Connection;
import com.spotify.cosmos.smash.Request;
import com.spotify.cosmos.smash.Subscriber;
import com.spotify.cosmos.smash.util.HttpParser;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.ci;
import com.spotify.mobile.android.util.cj;
import com.spotify.mobile.android.util.ck;
import com.spotify.mobile.android.util.cn;
import com.spotify.mobile.android.util.co;
import com.spotify.mobile.android.util.cr;
import com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseRequest;
import com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseRequest.Builder;
import com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseResponse;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

final class j
  implements Subscriber<GoogleIAPProceedPurchaseResponse>, Runnable
{
  private static final ck a = new cn(1L, TimeUnit.SECONDS);
  private static final ck b = new co(10L, 30L, TimeUnit.MINUTES);
  private static final ck c = new co(8L, 14L, TimeUnit.HOURS);
  private final Context d;
  private final k e;
  private final com.squareup.wire.v f;
  private final ci g;
  private final cr h;
  private Connection i;
  private o j;
  private boolean k;
  private boolean l;
  private final HttpParser<GoogleIAPProceedPurchaseResponse> m = new j.1(this);

  public j(Context paramContext, k paramk)
  {
    this.d = paramContext;
    this.e = paramk;
    this.f = new com.squareup.wire.v(new Class[0]);
    this.g = new cj("gpiab-register-purchases", this).a(a).c(b).a(10).d(c).a();
    this.h = new cr(this.d, new l(this));
  }

  private void a(boolean paramBoolean)
  {
    this.e.a(this.j, paramBoolean);
    this.j = null;
    if (paramBoolean)
      d();
    do
    {
      return;
      this.g.f();
    }
    while (!this.g.g());
    this.i.disconnect();
    this.i = null;
  }

  private void d()
  {
    if (this.j == null);
    for (boolean bool = true; ; bool = false)
    {
      cc.a(bool, "field should be null");
      this.l = false;
      this.j = this.e.c();
      if (this.j == null)
        break;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.j.b;
      bp.c("Register purchase (%s)", arrayOfObject);
      Request localRequest = new Request("POST", "hm://payment-iap/googleplay/1/google_proceed_payment/", new HashMap(), new GoogleIAPProceedPurchaseRequest.Builder().response_code(Integer.valueOf(0)).purchase_data(this.j.c).data_signature(this.j.d).build().a());
      if (this.i == null)
        this.i = Cosmos.getConnection(this.d, SpotifyService.class);
      this.i.resolve(localRequest, this.m, this);
      return;
    }
    bp.c("No more purchases to register", new Object[0]);
    this.e.d();
  }

  public final void a()
  {
    this.h.a(com.spotify.mobile.android.provider.v.a, l.b(), null);
    this.g.a();
  }

  public final void b()
  {
    this.g.b();
  }

  public final void c()
  {
    this.h.b();
    this.g.d();
    if (this.i != null)
    {
      this.i.disconnect();
      this.i = null;
    }
  }

  public final void onError(Throwable paramThrowable)
  {
    cc.a(this.j);
    bp.b(paramThrowable, "Failed posting");
    a(false);
  }

  public final void run()
  {
    if (this.k)
    {
      d();
      return;
    }
    bp.c("Not connected. Defer registration", new Object[0]);
    this.l = true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
