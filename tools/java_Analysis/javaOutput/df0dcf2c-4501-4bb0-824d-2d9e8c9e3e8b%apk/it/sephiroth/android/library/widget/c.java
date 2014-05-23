package it.sephiroth.android.library.widget;

import android.view.View;
import android.widget.ListAdapter;

final class c extends l
  implements Runnable
{
  private c(AbsHListView paramAbsHListView)
  {
    super(paramAbsHListView, (byte)0);
  }

  public final void run()
  {
    int i = this.a.A;
    View localView = this.a.getChildAt(i - this.a.V);
    int j;
    long l;
    if (localView != null)
    {
      j = this.a.A;
      l = this.a.j.getItemId(this.a.A);
      if ((!b()) || (this.a.ai))
        break label124;
    }
    label124: for (boolean bool = this.a.b(localView, j, l); ; bool = false)
    {
      if (bool)
      {
        this.a.F = -1;
        this.a.setPressed(false);
        localView.setPressed(false);
        return;
      }
      this.a.F = 2;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
