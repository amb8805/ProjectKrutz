package com.spotify.mobile.android.service.flow.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.app.o;
import com.spotify.mobile.android.service.connections.i;
import com.spotify.mobile.android.service.flow.FlowActivity;
import com.spotify.mobile.android.service.flow.login.NewSignUpFragment;
import com.spotify.mobile.android.service.flow.login.NewStartFragment;
import com.spotify.mobile.android.service.flow.login.f;
import com.spotify.mobile.android.service.flow.login.p;
import com.spotify.mobile.android.service.r;
import com.spotify.mobile.android.ui.AnimationDirection;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ca;
import com.spotify.mobile.android.util.cb;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;

public final class c extends a
  implements i, cb
{
  private static final cy i = cy.a("login_with_stored_credentials_on_next_start");
  private BroadcastReceiver Y = new c.1(this);
  private o<Cursor> Z = new c.3(this);
  private b a;
  private com.spotify.mobile.android.service.connections.h b;
  private i c;
  private g d;
  private ca e;
  private boolean f;
  private boolean g;
  private boolean h;

  public c()
  {
    a(com.spotify.mobile.android.service.flow.login.a.class, new c.4(this));
    a(p.class, new c.5(this));
    a(NewStartFragment.class, new c.6(this));
    a(f.class, new c.7(this));
    a(NewSignUpFragment.class, new c.8(this));
    a(d.class, new c.9(this));
  }

  public static c E()
  {
    return new c();
  }

  public static void a(Context paramContext)
  {
    cw.a(paramContext).a().a(i, true).b();
  }

  private void a(i parami)
  {
    if (this.f)
      return;
    this.c = parami;
    this.f = true;
    r localr = this.b.h();
    if (localr == null)
    {
      this.b.a();
      return;
    }
    parami.a(localr);
    this.f = false;
  }

  public final ca F()
  {
    return this.e;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    FlowActivity localFlowActivity = (FlowActivity)i();
    this.a = new b(localFlowActivity, localFlowActivity.e());
    this.d = new g(i());
    int j = 1;
    if (paramBundle == null)
    {
      h localh = this.d.a();
      this.d.a(localh);
      if (!localh.a())
        break label182;
      j = 0;
      b(d.a(this, localh.b(), null), AnimationDirection.a);
    }
    while (true)
    {
      this.b = new com.spotify.mobile.android.service.connections.h(i(), this);
      this.b.a();
      if (j != 0)
        this.e = new ca(this);
      IntentFilter localIntentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.LOGIN_ERROR");
      localIntentFilter.addCategory("android.intent.category.DEFAULT");
      i().registerReceiver(this.Y, localIntentFilter);
      t().a(2131362127, null, this.Z);
      return;
      label182: b(NewStartFragment.a(this), AnimationDirection.a);
    }
  }

  public final void a(r paramr)
  {
    if (this.c != null)
      this.c.a(paramr);
    this.f = false;
  }

  protected final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.h = paramBoolean;
    a(new c.10(this, paramString1, paramString2));
  }

  public final void a(boolean paramBoolean, String paramString)
  {
    com.spotify.mobile.android.service.flow.a locala = b();
    if ((locala instanceof com.spotify.mobile.android.service.flow.login.d))
      ((com.spotify.mobile.android.service.flow.login.d)locala).a(paramBoolean, paramString);
  }

  protected final void b(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.h = paramBoolean;
    a(new c.11(this, paramString1, paramString2));
  }

  public final void c_()
  {
    ((com.spotify.mobile.android.service.flow.login.d)b()).b(SpotifyError.U.a());
    this.f = false;
  }

  public final void y()
  {
    this.b.b();
    i().unregisterReceiver(this.Y);
    if (this.e != null)
    {
      this.e.a();
      this.e = null;
    }
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
