package com.spotify.mobile.android.spotlets.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

final class c
  implements e
{
  private View.OnClickListener b;

  public c(b paramb)
  {
    this.b = new c.1(this, paramb);
  }

  public final View.OnClickListener a()
  {
    return this.b;
  }

  public final void a(View paramView)
  {
    paramView.setVisibility(4);
    this.a.a(paramView);
  }

  public final void a(ListView paramListView)
  {
    b.a(this.a, paramListView);
  }

  public final String b()
  {
    return b.a(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
