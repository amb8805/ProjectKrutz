package com.spotify.mobile.android.ui.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public class w
  implements ListAdapter
{
  protected View a;
  private boolean b;

  public w(View paramView)
  {
    this.a = paramView;
    this.b = false;
  }

  public w(View paramView, byte paramByte)
  {
    this.a = paramView;
    this.b = false;
  }

  public boolean areAllItemsEnabled()
  {
    return this.b;
  }

  public int getCount()
  {
    return 1;
  }

  public Object getItem(int paramInt)
  {
    return null;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.a;
  }

  public int getViewTypeCount()
  {
    return 1;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public boolean isEmpty()
  {
    return false;
  }

  public boolean isEnabled(int paramInt)
  {
    return this.b;
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
