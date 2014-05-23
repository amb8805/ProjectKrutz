package com.spotify.android.paste.widget;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

final class j
  implements View.OnClickListener
{
  private j(SlidingTabLayout paramSlidingTabLayout)
  {
  }

  public final void onClick(View paramView)
  {
    for (int i = 0; ; i++)
      if (i < SlidingTabLayout.a(this.a).getChildCount())
      {
        if (paramView == SlidingTabLayout.a(this.a).getChildAt(i))
          SlidingTabLayout.c(this.a).a(i);
      }
      else
        return;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
