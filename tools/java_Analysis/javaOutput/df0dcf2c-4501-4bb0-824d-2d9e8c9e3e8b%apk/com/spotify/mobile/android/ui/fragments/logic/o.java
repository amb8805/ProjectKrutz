package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.cc;

public abstract class o extends Fragment
{
  protected DialogPresenter c;

  public o()
  {
  }

  protected abstract void C();

  public abstract void D();

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    if (this.c != null)
      this.c.a(paramInt1, paramInt2, paramIntent);
  }

  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      String str = paramBundle.getString("presenter_tag");
      if (str != null)
        this.c = ((DialogPresenter)m_().a(str));
    }
  }

  public void a(DialogPresenter paramDialogPresenter)
  {
    cc.a(paramDialogPresenter);
    this.c = paramDialogPresenter;
    C();
  }

  public void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (this.c != null)
    {
      String str = this.c.k_();
      if (str != null)
        paramBundle.putString("presenter_tag", str);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
