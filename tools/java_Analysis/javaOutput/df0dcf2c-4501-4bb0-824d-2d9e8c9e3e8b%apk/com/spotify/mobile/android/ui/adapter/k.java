package com.spotify.mobile.android.ui.adapter;

import android.widget.ListAdapter;
import com.devsmart.android.ui.HorizontalListView;

public final class k extends w
{
  public k(HorizontalListView paramHorizontalListView)
  {
    super(paramHorizontalListView);
  }

  public final int getCount()
  {
    if (((HorizontalListView)this.a).a().getCount() > 0)
      return 1;
    return 0;
  }

  public final boolean isEmpty()
  {
    return getCount() > 0;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
