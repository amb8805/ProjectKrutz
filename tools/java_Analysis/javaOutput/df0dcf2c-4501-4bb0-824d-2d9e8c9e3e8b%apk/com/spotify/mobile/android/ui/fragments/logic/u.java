package com.spotify.mobile.android.ui.fragments.logic;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class u extends o
{
  private static final String[] a = { "permissions" };
  private Intent b = null;
  private int d = 0;
  private boolean e;
  private android.support.v4.app.o<Cursor> f = new u.1(this);
  private BroadcastReceiver g = new u.2(this);

  public u()
  {
  }

  private void E()
  {
    if (this.e);
    do
    {
      return;
      this.e = true;
    }
    while (this.c == null);
    this.c.b(this);
  }

  protected final void C()
  {
    this.d = this.c.c(this);
  }

  public final void D()
  {
    Assertion.b(Integer.valueOf(this.d), Integer.valueOf(0));
    this.e = false;
    a(this.b, this.d);
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 != -1) && (paramInt2 != 2))
      E();
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.d = paramBundle.getInt("request_code");
  }

  public final void a(DialogPresenter paramDialogPresenter)
  {
    super.a(paramDialogPresenter);
    if (this.e)
      this.c.b(this);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putInt("request_code", this.d);
  }

  public final void w()
  {
    super.w();
    FragmentActivity localFragmentActivity = i();
    BroadcastReceiver localBroadcastReceiver = this.g;
    IntentFilter localIntentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.SOCIAL_ERROR");
    localIntentFilter.addCategory("android.intent.category.DEFAULT");
    localFragmentActivity.registerReceiver(localBroadcastReceiver, localIntentFilter);
  }

  public final void x()
  {
    i().unregisterReceiver(this.g);
    super.x();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
