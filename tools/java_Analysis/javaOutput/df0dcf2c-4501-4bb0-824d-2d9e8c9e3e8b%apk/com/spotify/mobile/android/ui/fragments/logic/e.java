package com.spotify.mobile.android.ui.fragments.logic;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class e extends o
{
  private int a = 0;
  private Intent b = null;
  private boolean d = false;
  private final BroadcastReceiver e = new e.1(this);

  public e()
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
    super.a(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == this.a)
      this.d = false;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.d = paramBundle.getBoolean("queued", false);
      this.a = paramBundle.getInt("request_code");
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putBoolean("queued", this.d);
    paramBundle.putInt("request_code", this.a);
  }

  public final void w()
  {
    super.w();
    FragmentActivity localFragmentActivity = i();
    BroadcastReceiver localBroadcastReceiver = this.e;
    IntentFilter localIntentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.FEATURE_ERROR");
    localIntentFilter.addCategory("android.intent.category.DEFAULT");
    localFragmentActivity.registerReceiver(localBroadcastReceiver, localIntentFilter);
  }

  public final void x()
  {
    i().unregisterReceiver(this.e);
    super.x();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
