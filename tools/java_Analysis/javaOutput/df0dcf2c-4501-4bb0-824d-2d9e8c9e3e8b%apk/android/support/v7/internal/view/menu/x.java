package android.support.v7.internal.view.menu;

import android.support.v4.view.l;
import android.support.v4.view.n;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class x extends t
  implements n
{
  ActionProvider.VisibilityListener c;

  public x(w paramw, l paraml)
  {
    super(paramw, paraml);
  }

  public final boolean isVisible()
  {
    return true;
  }

  public final View onCreateActionView(MenuItem paramMenuItem)
  {
    return this.a.b();
  }

  public final boolean overridesItemVisibility()
  {
    return false;
  }

  public final void refreshVisibility()
  {
    this.a.c();
  }

  public final void setVisibilityListener(ActionProvider.VisibilityListener paramVisibilityListener)
  {
    this.c = paramVisibilityListener;
    l locall = this.a;
    if (paramVisibilityListener != null);
    while (true)
    {
      locall.a(this);
      return;
      this = null;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
