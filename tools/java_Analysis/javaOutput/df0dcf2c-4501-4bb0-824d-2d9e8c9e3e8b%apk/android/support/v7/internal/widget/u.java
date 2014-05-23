package android.support.v7.internal.widget;

import android.database.DataSetObserver;

final class u extends DataSetObserver
{
  private u(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onChanged()
  {
    if (this.a.i())
      this.a.e();
  }

  public final void onInvalidated()
  {
    this.a.f();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
