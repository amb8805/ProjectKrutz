package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.b.a;
import android.view.ActionMode;
import android.view.MenuInflater;

public final class b extends a
{
  final MenuInflater a;
  final ActionMode b;

  public b(Context paramContext, ActionMode paramActionMode)
  {
    this.b = paramActionMode;
    this.a = new c(paramContext);
  }

  public final void a()
  {
    this.b.finish();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
