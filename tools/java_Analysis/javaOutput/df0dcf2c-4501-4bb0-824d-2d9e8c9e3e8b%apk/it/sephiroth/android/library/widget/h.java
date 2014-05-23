package it.sephiroth.android.library.widget;

import android.view.View;
import android.widget.ListAdapter;

final class h extends l
  implements Runnable
{
  int a;

  private h(AbsHListView paramAbsHListView)
  {
    super(paramAbsHListView, (byte)0);
  }

  public final void run()
  {
    if (this.b.ai);
    ListAdapter localListAdapter;
    int i;
    View localView;
    do
    {
      do
      {
        return;
        localListAdapter = this.b.j;
        i = this.a;
      }
      while ((localListAdapter == null) || (this.b.an <= 0) || (i == -1) || (i >= localListAdapter.getCount()) || (!b()));
      localView = this.b.getChildAt(i - this.b.V);
    }
    while (localView == null);
    this.b.a(localView, i, localListAdapter.getItemId(i));
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
