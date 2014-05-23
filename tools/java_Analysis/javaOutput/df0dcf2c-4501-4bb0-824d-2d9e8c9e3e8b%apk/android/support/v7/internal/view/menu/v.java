package android.support.v7.internal.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class v extends k<MenuItem.OnMenuItemClickListener>
  implements MenuItem.OnMenuItemClickListener
{
  v(s params, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnMenuItemClickListener)this.a).onMenuItemClick(this.b.a(paramMenuItem));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
