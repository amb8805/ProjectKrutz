package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

final class f extends eq
{
  private el b;

  public f(Context paramContext, cz paramcz)
  {
    super(paramcz, 2);
    this.b = new el(paramContext.getString(2131427677), 0, new Intent(paramContext, StoriesActivity.class));
  }

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    return null;
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
 * Qualified Name:     com.twitter.android.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
