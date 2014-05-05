package com.twitter.android.widget;

import android.widget.Scroller;

final class g
  implements Runnable
{
  private int a;

  private g(RefreshableListView paramRefreshableListView)
  {
  }

  final void a(int paramInt)
  {
    this.a = 0;
    this.b.b(8);
    this.b.a.abortAnimation();
    this.b.a.startScroll(0, 0, 0, paramInt, 450);
    this.b.post(this);
  }

  public final void run()
  {
    Scroller localScroller = this.b.a;
    int i;
    if ((localScroller.timePassed() < 450) && (localScroller.computeScrollOffset()))
    {
      i = 1;
      if (i == 0)
        break label91;
    }
    label91: for (int j = localScroller.getCurrY(); ; j = localScroller.getFinalY())
    {
      int k = this.a - j;
      this.a = j;
      this.b.a(k);
      this.b.invalidate();
      this.b.d();
      if (i == 0)
        break label99;
      this.b.post(this);
      return;
      i = 0;
      break;
    }
    label99: this.b.c(8);
    if (this.b.d(32))
    {
      this.b.setSelectionFromTop(0, j);
      return;
    }
    this.b.c();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
