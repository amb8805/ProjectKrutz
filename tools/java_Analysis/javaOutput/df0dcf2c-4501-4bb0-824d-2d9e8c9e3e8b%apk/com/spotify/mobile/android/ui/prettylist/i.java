package com.spotify.mobile.android.ui.prettylist;

import android.support.v4.view.at;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class i
  implements AbsListView.OnScrollListener, Runnable
{
  private AbsListView.OnScrollListener b;
  private int c;
  private boolean d;

  private i(StickyListView paramStickyListView)
  {
  }

  private void a()
  {
    if (this.a.c() != StickyListView.c(this.a))
      this.a.requestLayout();
  }

  public final void a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.b = paramOnScrollListener;
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (StickyListView.a(this.a));
    do
    {
      return;
      a();
      StickyListView.b(this.a);
    }
    while (this.b == null);
    this.b.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (StickyListView.a(this.a))
      return;
    this.c = paramInt;
    boolean bool1 = this.d;
    if (this.c != 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.d = bool2;
      a();
      StickyListView.b(this.a);
      if (this.b != null)
        this.b.onScrollStateChanged(paramAbsListView, paramInt);
      if ((bool1) || (!this.d))
        break;
      at.a(this.a, this);
      return;
    }
  }

  public final void run()
  {
    if (StickyListView.a(this.a));
    do
    {
      return;
      a();
      StickyListView.b(this.a);
    }
    while ((!this.d) || (this.a.getWindowToken() == null));
    at.a(this.a, this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
