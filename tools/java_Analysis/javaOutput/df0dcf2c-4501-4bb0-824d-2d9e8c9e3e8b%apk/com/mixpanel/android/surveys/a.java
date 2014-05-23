package com.mixpanel.android.surveys;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.mixpanel.android.b;
import com.mixpanel.android.c;
import java.util.List;

final class a
  implements ListAdapter
{
  private final List<String> a;
  private final LayoutInflater b;

  public a(List<String> paramList, LayoutInflater paramLayoutInflater)
  {
    this.a = paramList;
    this.b = paramLayoutInflater;
  }

  public final String a(int paramInt)
  {
    return (String)this.a.get(paramInt);
  }

  public final boolean areAllItemsEnabled()
  {
    return true;
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt == 0)
      return 0;
    if (paramInt == -1 + this.a.size())
      return 1;
    return 2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = -1;
    if (paramView == null)
      switch (getItemViewType(paramInt))
      {
      default:
      case 0:
      case 1:
      case 2:
      }
    while (true)
    {
      paramView = this.b.inflate(i, paramViewGroup, false);
      ((TextView)paramView.findViewById(b.d)).setText((String)this.a.get(paramInt));
      return paramView;
      i = c.b;
      continue;
      i = c.c;
      continue;
      i = c.d;
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final boolean hasStableIds()
  {
    return true;
  }

  public final boolean isEmpty()
  {
    return this.a.isEmpty();
  }

  public final boolean isEnabled(int paramInt)
  {
    return true;
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
