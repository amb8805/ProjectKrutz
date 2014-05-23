package com.spotify.mobile.android.ui.fragments.logic;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.n;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class d extends o
{
  private int a = 0;
  private Intent b = null;
  private boolean d = false;
  private final BroadcastReceiver e = new d.1(this);

  public d()
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
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.spotify.mobile.android.broadcast.settings_low.error");
    localIntentFilter.addAction("com.spotify.mobile.android.broadcast.cache_low.error");
    localIntentFilter.addCategory("android.intent.category.DEFAULT");
    n.a(i()).a(this.e, localIntentFilter);
  }

  public final void x()
  {
    n.a(i()).a(this.e);
    super.x();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
