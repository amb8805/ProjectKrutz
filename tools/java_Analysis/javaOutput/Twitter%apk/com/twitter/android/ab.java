package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

final class ab extends eq
{
  private el b;

  public ab(Context paramContext, j paramj)
  {
    super(paramj, 11);
    this.b = new el(paramContext.getString(2131427533), 0, new Intent(paramContext, SearchQueriesActivity.class).putExtra("q_type", 1));
  }

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    return a(paramView, paramViewGroup, paramViewGroup.getContext().getString(2131427532));
  }

  protected final Object a()
  {
    return this.b.c;
  }

  protected final View b(View paramView, ViewGroup paramViewGroup)
  {
    return ft.a(paramView, paramViewGroup, this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
