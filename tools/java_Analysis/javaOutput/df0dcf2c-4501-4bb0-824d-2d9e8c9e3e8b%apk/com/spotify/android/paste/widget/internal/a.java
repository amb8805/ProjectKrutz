package com.spotify.android.paste.widget.internal;

import android.view.View;
import android.view.ViewGroup;

public final class a
{
  private ViewGroup a;
  private View b;

  public a(ViewGroup paramViewGroup)
  {
    this.a = paramViewGroup;
  }

  public final void a()
  {
    if (this.b != null);
    for (int i = this.b.getVisibility(); ; i = 8)
    {
      this.a.setVisibility(i);
      return;
    }
  }

  public final void a(View paramView)
  {
    if (this.b == paramView)
      return;
    if (this.b != null)
      this.a.removeView(this.b);
    this.b = paramView;
    if (paramView == null)
    {
      this.a.setVisibility(8);
      return;
    }
    this.a.addView(paramView);
    this.a.setVisibility(0);
  }

  public final View b()
  {
    return this.b;
  }

  public final void c()
  {
    a(null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
