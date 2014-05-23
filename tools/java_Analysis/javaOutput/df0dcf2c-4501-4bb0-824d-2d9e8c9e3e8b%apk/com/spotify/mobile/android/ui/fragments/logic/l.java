package com.spotify.mobile.android.ui.fragments.logic;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.r;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.ViewUri.Verified;

public final class l extends o
{
  private int a = 0;
  private Intent b = null;
  private a d = (a)c.a(a.class);
  private d e = (d)c.a(d.class);
  private BroadcastReceiver f = new l.1(this);

  public l()
  {
  }

  protected final void C()
  {
    this.a = this.c.c(this);
  }

  public final void D()
  {
    Assertion.b(Integer.valueOf(this.a), Integer.valueOf(0));
    a(this.b, this.a);
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Assertion.b(Integer.valueOf(this.a), Integer.valueOf(0));
    if ((paramInt1 == this.a) && (paramInt2 == -1))
    {
      String str = paramIntent.getStringExtra("radio_uri");
      ViewUri.Verified localVerified = (ViewUri.Verified)paramIntent.getParcelableExtra("view_uri");
      Assertion.a(localVerified, "view_uri must be set to a Verified");
      if (str != null)
        d.a(i(), localVerified, r.a(str), true);
    }
    super.a(paramInt1, paramInt2, paramIntent);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.a = paramBundle.getInt("request_code");
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putInt("request_code", this.a);
  }

  public final void p_()
  {
    super.p_();
    FragmentActivity localFragmentActivity = i();
    BroadcastReceiver localBroadcastReceiver = this.f;
    IntentFilter localIntentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
    localIntentFilter.addCategory("android.intent.category.DEFAULT");
    localFragmentActivity.registerReceiver(localBroadcastReceiver, localIntentFilter);
  }

  public final void q_()
  {
    super.q_();
    i().unregisterReceiver(this.f);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
