package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;

final class k
  implements ActionMode.Callback
{
  private final ActionMode.Callback b;

  k(j paramj, ActionMode.Callback paramCallback)
  {
    this.b = paramCallback;
  }

  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.b.onActionItemClicked(paramActionMode, paramMenuItem);
  }

  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    boolean bool = this.b.onCreateActionMode(paramActionMode, paramMenu);
    if (bool)
    {
      j.a(this.a, paramActionMode);
      this.a.g();
    }
    return bool;
  }

  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.b.onDestroyActionMode(paramActionMode);
    this.a.h();
    j.a(this.a, null);
  }

  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.b.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
