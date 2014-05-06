package com.twitter.android.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

final class k extends HeaderViewListAdapter
{
  private DataSetObservable a = new DataSetObservable();

  public k(RefreshableListView paramRefreshableListView, ArrayList paramArrayList1, ArrayList paramArrayList2, ListAdapter paramListAdapter)
  {
    super(paramArrayList1, paramArrayList2, paramListAdapter);
  }

  public final void a()
  {
    this.a.notifyChanged();
  }

  public final int getCount()
  {
    if (this.b.d(34))
      return 1 + super.getCount();
    return super.getCount();
  }

  public final Object getItem(int paramInt)
  {
    if (this.b.d(34))
    {
      if (paramInt == 0)
        return null;
      return super.getItem(paramInt - 1);
    }
    return super.getItem(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    if (this.b.d(34))
    {
      if (paramInt == 0)
        return 0L;
      return super.getItemId(paramInt - 1);
    }
    return super.getItemId(paramInt);
  }

  public final int getItemViewType(int paramInt)
  {
    if (this.b.d(34))
    {
      if (paramInt == 0)
        return -1;
      return super.getItemViewType(paramInt - 1);
    }
    return super.getItemViewType(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.b.d(34))
    {
      if (paramInt == 0)
        return this.b.b;
      return super.getView(paramInt - 1, paramView, paramViewGroup);
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }

  public final boolean isEnabled(int paramInt)
  {
    if (this.b.d(34))
      return (paramInt > 0) && (super.isEnabled(paramInt - 1));
    return super.isEnabled(paramInt);
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.registerDataSetObserver(paramDataSetObserver);
    this.a.registerObserver(paramDataSetObserver);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    super.unregisterDataSetObserver(paramDataSetObserver);
    this.a.unregisterObserver(paramDataSetObserver);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
