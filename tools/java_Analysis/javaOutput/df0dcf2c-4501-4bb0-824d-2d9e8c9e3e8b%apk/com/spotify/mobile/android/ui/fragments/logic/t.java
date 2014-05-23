package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class t extends o
{
  private static final String[] a = { "unaccepted_licenses" };
  private int b = 0;
  private boolean d = false;
  private Intent e;
  private android.support.v4.app.o<Cursor> f = new t.1(this);

  public t()
  {
  }

  protected final void C()
  {
    this.b = this.c.c(this);
  }

  public final void D()
  {
    Assertion.b(Integer.valueOf(this.b), Integer.valueOf(0));
    if (this.d)
    {
      a(this.e, this.b);
      return;
    }
    Assertion.a("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Assertion.b(Integer.valueOf(this.b), Integer.valueOf(0));
    if (paramInt1 == this.b)
      this.d = false;
    super.a(paramInt1, paramInt2, paramIntent);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.b = paramBundle.getInt("license_request_code");
    t().a(2131362129, null, this.f);
  }

  public final void a(DialogPresenter paramDialogPresenter)
  {
    super.a(paramDialogPresenter);
    if (this.d)
      this.c.b(this);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putInt("license_request_code", this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
