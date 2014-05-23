package android.support.v7.internal.view.menu;

import android.support.v7.b.b;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class u extends FrameLayout
  implements CollapsibleActionView
{
  final b a;

  u(View paramView)
  {
    super(paramView.getContext());
    this.a = ((b)paramView);
    addView(paramView);
  }

  public final void onActionViewCollapsed()
  {
    this.a.b();
  }

  public final void onActionViewExpanded()
  {
    this.a.a();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
