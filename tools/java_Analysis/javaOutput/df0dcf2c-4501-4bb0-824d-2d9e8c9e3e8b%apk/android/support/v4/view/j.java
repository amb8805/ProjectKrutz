package android.support.v4.view;

import android.database.DataSetObserver;
import android.view.View;

final class j extends DataSetObserver
  implements bq, br
{
  private int b;

  private j(ActionBarTabStrip paramActionBarTabStrip)
  {
  }

  public final void a(int paramInt)
  {
    ActionBarTabStrip.a(this.a, paramInt);
    for (int i = 0; i < this.a.getChildCount(); i++)
      this.a.getChildAt(i).refreshDrawableState();
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void a(ah paramah1, ah paramah2)
  {
    this.a.a(paramah1, paramah2);
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
  }

  public final void onChanged()
  {
    ActionBarTabStrip.d(this.a);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
