package it.sephiroth.android.library.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewConfiguration;

final class d
  implements Runnable
{
  d(AbsHListView paramAbsHListView)
  {
  }

  public final void run()
  {
    int i;
    boolean bool;
    Drawable localDrawable;
    if (this.a.F == 0)
    {
      this.a.F = 1;
      View localView = this.a.getChildAt(this.a.A - this.a.V);
      if ((localView != null) && (!localView.hasFocusable()))
      {
        this.a.h = 0;
        if (this.a.ai)
          break label254;
        localView.setPressed(true);
        this.a.setPressed(true);
        this.a.e();
        this.a.a(this.a.A, localView);
        this.a.refreshDrawableState();
        i = ViewConfiguration.getLongPressTimeout();
        bool = this.a.isLongClickable();
        if (this.a.m != null)
        {
          localDrawable = this.a.m.getCurrent();
          if ((localDrawable != null) && ((localDrawable instanceof TransitionDrawable)))
          {
            if (!bool)
              break label234;
            ((TransitionDrawable)localDrawable).startTransition(i);
          }
        }
      }
    }
    while (bool)
    {
      if (AbsHListView.c(this.a) == null)
        AbsHListView.a(this.a, new c(this.a, (byte)0));
      AbsHListView.c(this.a).a();
      this.a.postDelayed(AbsHListView.c(this.a), i);
      return;
      label234: ((TransitionDrawable)localDrawable).resetTransition();
    }
    this.a.F = 2;
    return;
    label254: this.a.F = 2;
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
