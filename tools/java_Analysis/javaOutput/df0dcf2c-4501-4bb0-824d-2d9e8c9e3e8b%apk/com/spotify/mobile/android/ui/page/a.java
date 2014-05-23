package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public final class a extends j
{
  private EditText b;
  private o<Cursor> c = new a.2(this);

  public a(Context paramContext, ViewGroup paramViewGroup, n paramn)
  {
    super(paramContext, paramViewGroup);
    b(2130903212);
    this.b = ((EditText)c(2131362561));
    ((Button)c(2131362562)).setOnClickListener(new a.1(this));
    paramn.a(2131362166, null, this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
