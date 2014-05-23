package com.spotify.mobile.android.ui.fragments.logic;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.n;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.AppRaterActivity;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;

public final class a extends o
{
  private static final cy a = cy.a("key_rater_shown");
  private static final cy b = cy.a("key_date_first_launch");
  private cw d;
  private long e = 0L;
  private boolean f = false;
  private ClientInfo g = (ClientInfo)c.a(ClientInfo.class);
  private Handler h = new Handler();
  private android.support.v4.app.o<Cursor> i = new a.1(this);

  public a()
  {
  }

  protected final void C()
  {
    this.c.c(this);
  }

  public final void D()
  {
    if (this.d == null)
      this.d = cw.a(i());
    if (this.d.a(a, false))
      return;
    this.d.a().a(a, true).a();
    a(AppRaterActivity.a(i()));
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.f = paramBundle.getBoolean("extra_queued", false);
    this.d = cw.a(i());
    if ((this.d.a(a, false)) || (this.g.e() == null))
      return;
    this.e = this.d.a(b, 0L);
    if (this.e == 0L)
    {
      this.e = System.currentTimeMillis();
      this.d.a().a(b, this.e).a();
    }
    t().a(2131362134, null, this.i);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putBoolean("extra_queued", this.f);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
