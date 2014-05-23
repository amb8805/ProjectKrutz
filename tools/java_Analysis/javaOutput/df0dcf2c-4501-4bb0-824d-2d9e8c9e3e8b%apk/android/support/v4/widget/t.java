package android.support.v4.widget;

import android.view.View;

final class t extends aa
{
  private t(SlidingPaneLayout paramSlidingPaneLayout)
  {
  }

  public final void a(int paramInt)
  {
    if (SlidingPaneLayout.b(this.a).a() == 0)
    {
      if (SlidingPaneLayout.c(this.a) == 0.0F)
      {
        this.a.a(SlidingPaneLayout.d(this.a));
        SlidingPaneLayout localSlidingPaneLayout2 = this.a;
        SlidingPaneLayout.d(this.a);
        localSlidingPaneLayout2.b();
        SlidingPaneLayout.a(this.a, false);
      }
    }
    else
      return;
    SlidingPaneLayout localSlidingPaneLayout1 = this.a;
    SlidingPaneLayout.d(this.a);
    localSlidingPaneLayout1.a();
    SlidingPaneLayout.a(this.a, true);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    SlidingPaneLayout.b(this.a).a(SlidingPaneLayout.d(this.a), paramInt2);
  }

  public final void a(View paramView, float paramFloat)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i = this.a.getPaddingLeft() + localLayoutParams.leftMargin;
    if ((paramFloat > 0.0F) || ((paramFloat == 0.0F) && (SlidingPaneLayout.c(this.a) > 0.5F)))
      i += SlidingPaneLayout.e(this.a);
    SlidingPaneLayout.b(this.a).a(i, paramView.getTop());
    this.a.invalidate();
  }

  public final void a(View paramView, int paramInt)
  {
    SlidingPaneLayout.a(this.a, paramInt);
    this.a.invalidate();
  }

  public final boolean a(View paramView)
  {
    if (SlidingPaneLayout.a(this.a))
      return false;
    return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).b;
  }

  public final int b(View paramView, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(this.a).getLayoutParams();
    int i = this.a.getPaddingLeft() + localLayoutParams.leftMargin;
    int j = i + SlidingPaneLayout.e(this.a);
    return Math.min(Math.max(paramInt, i), j);
  }

  public final void b(View paramView)
  {
    this.a.c();
  }

  public final int c(View paramView)
  {
    return SlidingPaneLayout.e(this.a);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
