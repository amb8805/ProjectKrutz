package it.sephiroth.android.library.widget;

import android.util.Log;

public final class a extends n
{
  public a(AbsHListView paramAbsHListView)
  {
    super(paramAbsHListView);
  }

  public final void onChanged()
  {
    Log.i("AbsListView", "onChanged");
    super.onChanged();
  }

  public final void onInvalidated()
  {
    Log.i("AbsListView", "onInvalidated");
    super.onInvalidated();
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
