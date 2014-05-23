package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

final class b
{
  private final SparseArray<View> b = new SparseArray();

  b(AbsSpinnerICS paramAbsSpinnerICS)
  {
  }

  final View a(int paramInt)
  {
    View localView = (View)this.b.get(paramInt);
    if (localView != null)
      this.b.delete(paramInt);
    return localView;
  }

  final void a()
  {
    SparseArray localSparseArray = this.b;
    int i = localSparseArray.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)localSparseArray.valueAt(j);
      if (localView != null)
        AbsSpinnerICS.a(this.a, localView);
    }
    localSparseArray.clear();
  }

  public final void a(int paramInt, View paramView)
  {
    this.b.put(paramInt, paramView);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
