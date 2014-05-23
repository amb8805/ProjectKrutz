package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.ViewGroup;
import android.widget.Button;

public final class m extends j
{
  private Button b;
  private boolean c;
  private o<Cursor> d = new m.2(this);

  public m(Context paramContext, ViewGroup paramViewGroup, n paramn)
  {
    super(paramContext, paramViewGroup);
    b(2130903228);
    this.b = ((Button)c(2131362594));
    this.b.setOnClickListener(new m.1(this));
    paramn.a(2131362166, null, this.d);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
