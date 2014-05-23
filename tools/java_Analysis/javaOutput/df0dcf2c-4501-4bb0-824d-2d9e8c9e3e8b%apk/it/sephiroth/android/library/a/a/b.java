package it.sephiroth.android.library.a.a;

import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import it.sephiroth.android.library.widget.AbsHListView;

public final class b
  implements a
{
  private a a;
  private AbsHListView b;

  @TargetApi(11)
  public final void a(ActionMode paramActionMode, int paramInt, long paramLong, boolean paramBoolean)
  {
    this.a.a(paramActionMode, paramInt, paramLong, paramBoolean);
    if (this.b.a() == 0)
      paramActionMode.finish();
  }

  public final boolean a()
  {
    return this.a != null;
  }

  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.a.onActionItemClicked(paramActionMode, paramMenuItem);
  }

  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    boolean bool1 = this.a.onCreateActionMode(paramActionMode, paramMenu);
    boolean bool2 = false;
    if (bool1)
    {
      this.b.setLongClickable(false);
      bool2 = true;
    }
    return bool2;
  }

  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.a.onDestroyActionMode(paramActionMode);
    this.b.c = null;
    this.b.b();
    this.b.ai = true;
    this.b.z();
    this.b.requestLayout();
    this.b.setLongClickable(true);
  }

  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.a.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
