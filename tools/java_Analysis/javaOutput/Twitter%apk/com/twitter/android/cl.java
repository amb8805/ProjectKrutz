package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

final class cl extends eq
{
  private el b;

  public cl(Context paramContext, cj paramcj)
  {
    super(paramcj, 11);
    this.b = new el(paramContext.getString(2131427559), 0, new Intent(paramContext, UsersActivity.class).putExtra("type", 9).setAction("com.twitter.android.intent.action.FOLLOW"));
  }

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    return a(paramView, paramViewGroup, paramViewGroup.getContext().getString(2131427558));
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
 * Qualified Name:     com.twitter.android.cl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
