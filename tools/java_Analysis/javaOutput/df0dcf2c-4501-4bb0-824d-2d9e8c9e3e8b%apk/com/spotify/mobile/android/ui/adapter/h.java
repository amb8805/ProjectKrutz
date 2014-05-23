package com.spotify.mobile.android.ui.adapter;

import android.view.ViewGroup;
import com.spotify.mobile.android.ui.page.j;
import com.spotify.mobile.android.util.Assertion;

public abstract class h
{
  private j a;

  public h()
  {
  }

  protected abstract j a(ViewGroup paramViewGroup);

  public final j b(ViewGroup paramViewGroup)
  {
    if (this.a == null)
      this.a = a(paramViewGroup);
    Assertion.a(this.a);
    return this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
