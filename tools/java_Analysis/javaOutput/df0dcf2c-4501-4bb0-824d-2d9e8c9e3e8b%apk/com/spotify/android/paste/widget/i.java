package com.spotify.android.paste.widget;

import android.support.v4.view.br;
import android.view.View;

final class i
  implements br
{
  private int b;

  private i(SlidingTabLayout paramSlidingTabLayout)
  {
  }

  public final void a(int paramInt)
  {
    if (this.b == 0)
    {
      SlidingTabLayout.a(this.a).a(paramInt, 0.0F);
      SlidingTabLayout.a(this.a, paramInt, 0);
    }
    if (SlidingTabLayout.b(this.a) != null)
      SlidingTabLayout.b(this.a).a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = SlidingTabLayout.a(this.a).getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i))
      return;
    SlidingTabLayout.a(this.a).a(paramInt1, paramFloat);
    View localView = SlidingTabLayout.a(this.a).getChildAt(paramInt1);
    if (localView != null);
    for (int j = (int)(paramFloat * localView.getWidth()); ; j = 0)
    {
      SlidingTabLayout.a(this.a, paramInt1, j);
      if (SlidingTabLayout.b(this.a) == null)
        break;
      SlidingTabLayout.b(this.a).a(paramInt1, paramFloat, paramInt2);
      return;
    }
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
    if (SlidingTabLayout.b(this.a) != null)
      SlidingTabLayout.b(this.a).b(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
