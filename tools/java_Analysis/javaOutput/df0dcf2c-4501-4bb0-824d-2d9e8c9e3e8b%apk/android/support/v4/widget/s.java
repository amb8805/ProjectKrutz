package android.support.v4.widget;

import android.support.v4.view.at;
import android.view.View;
import java.util.ArrayList;

final class s
  implements Runnable
{
  final View a;

  s(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }

  public final void run()
  {
    if (this.a.getParent() == this.b)
    {
      at.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.f(this.b).remove(this);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
