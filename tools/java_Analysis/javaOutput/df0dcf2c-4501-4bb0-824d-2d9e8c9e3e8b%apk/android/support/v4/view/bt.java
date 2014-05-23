package android.support.v4.view;

import android.database.DataSetObserver;

final class bt extends DataSetObserver
{
  private bt(ViewPager paramViewPager)
  {
  }

  public final void onChanged()
  {
    this.a.c();
  }

  public final void onInvalidated()
  {
    this.a.c();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.bt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
