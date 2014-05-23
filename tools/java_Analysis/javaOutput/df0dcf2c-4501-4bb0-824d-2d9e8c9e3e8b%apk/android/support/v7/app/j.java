package android.support.v7.app;

import android.support.v7.a.f;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.y;
import android.view.ActionMode;
import android.view.ActionMode.Callback;

final class j extends i
  implements y
{
  final NativeActionModeAwareLayout b;
  private ActionMode c;

  public j(ActionBarActivity paramActionBarActivity, a parama)
  {
    super(paramActionBarActivity, parama);
    this.b = ((NativeActionModeAwareLayout)paramActionBarActivity.findViewById(f.e));
    if (this.b != null)
      this.b.a(this);
  }

  public final ActionMode.Callback a(ActionMode.Callback paramCallback)
  {
    return new k(this, paramCallback);
  }

  final boolean i()
  {
    return (this.c == null) && (super.i());
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
