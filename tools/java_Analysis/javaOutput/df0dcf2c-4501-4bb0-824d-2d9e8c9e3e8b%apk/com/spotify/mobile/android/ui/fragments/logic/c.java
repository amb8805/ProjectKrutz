package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.service.connections.b;
import com.spotify.mobile.android.service.connections.g;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.cw;
import java.util.ArrayList;

public final class c extends o
  implements g
{
  private b a;
  private boolean b = false;
  private boolean d = false;
  private int e = -1;
  private Intent f;
  private ArrayList<ConnectDevice> g;
  private cw h;

  public c()
  {
  }

  protected final void C()
  {
    this.e = this.c.c(this);
  }

  public final void D()
  {
    a(this.f, this.e);
  }

  public final void a()
  {
    this.b = true;
    this.a.a();
    this.a.a(new c.1(this));
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.h = cw.a(i());
    if (paramBundle != null)
    {
      this.d = paramBundle.getBoolean("dialog_queued", false);
      this.e = paramBundle.getInt("dialog_request_code", -1);
    }
  }

  public final void b()
  {
    this.b = false;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putBoolean("dialog_queued", this.d);
    paramBundle.putInt("dialog_request_code", this.e);
  }

  public final void p_()
  {
    super.p_();
    this.a = new b(i());
    this.a.a(this);
    this.a.e();
  }

  public final void q_()
  {
    super.q_();
    if (this.b)
    {
      this.a.a();
      this.a.f();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
