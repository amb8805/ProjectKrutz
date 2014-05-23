package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public final class w
  implements Filterable, WrapperListAdapter
{
  static final ArrayList<u> c = new ArrayList();
  ArrayList<u> a;
  ArrayList<u> b;
  boolean d;
  private final ListAdapter e;
  private final boolean f;

  public w(ArrayList<u> paramArrayList1, ArrayList<u> paramArrayList2, ListAdapter paramListAdapter)
  {
    this.e = paramListAdapter;
    this.f = (paramListAdapter instanceof WrapperListAdapter);
    if (paramArrayList1 == null)
    {
      this.a = c;
      if (paramArrayList2 != null)
        break label77;
      this.b = c;
      label39: if ((!a(this.a)) || (!a(this.b)))
        break label85;
    }
    label77: label85: for (boolean bool = true; ; bool = false)
    {
      this.d = bool;
      return;
      this.a = paramArrayList1;
      break;
      this.b = paramArrayList2;
      break label39;
    }
  }

  private static boolean a(ArrayList<u> paramArrayList)
  {
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
        if (!((u)localIterator.next()).c)
          return false;
    }
    return true;
  }

  public final boolean areAllItemsEnabled()
  {
    return (this.e == null) || ((this.d) && (this.e.areAllItemsEnabled()));
  }

  public final int getCount()
  {
    if (this.e != null)
      return this.b.size() + this.a.size() + this.e.getCount();
    return this.b.size() + this.a.size();
  }

  public final Filter getFilter()
  {
    if (this.f)
      return ((WrapperListAdapter)this.e).getFilter();
    return null;
  }

  public final Object getItem(int paramInt)
  {
    int i = this.a.size();
    if (paramInt < i)
      return ((u)this.a.get(paramInt)).b;
    int j = paramInt - i;
    ListAdapter localListAdapter = this.e;
    int k = 0;
    if (localListAdapter != null)
    {
      k = this.e.getCount();
      if (j < k)
        return this.e.getItem(j);
    }
    return ((u)this.b.get(j - k)).b;
  }

  public final long getItemId(int paramInt)
  {
    int i = this.a.size();
    if ((this.e != null) && (paramInt >= i))
    {
      int j = paramInt - i;
      if (j < this.e.getCount())
        return this.e.getItemId(j);
    }
    return -1L;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = this.a.size();
    if ((this.e != null) && (paramInt >= i))
    {
      int j = paramInt - i;
      if (j < this.e.getCount())
        return this.e.getItemViewType(j);
    }
    return -2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = this.a.size();
    if (paramInt < i)
      return ((u)this.a.get(paramInt)).a;
    int j = paramInt - i;
    ListAdapter localListAdapter = this.e;
    int k = 0;
    if (localListAdapter != null)
    {
      k = this.e.getCount();
      if (j < k)
        return this.e.getView(j, paramView, paramViewGroup);
    }
    return ((u)this.b.get(j - k)).a;
  }

  public final int getViewTypeCount()
  {
    if (this.e != null)
      return this.e.getViewTypeCount();
    return 1;
  }

  public final ListAdapter getWrappedAdapter()
  {
    return this.e;
  }

  public final boolean hasStableIds()
  {
    if (this.e != null)
      return this.e.hasStableIds();
    return false;
  }

  public final boolean isEmpty()
  {
    return (this.e == null) || (this.e.isEmpty());
  }

  public final boolean isEnabled(int paramInt)
  {
    int i = this.a.size();
    if (paramInt < i)
      return ((u)this.a.get(paramInt)).c;
    int j = paramInt - i;
    ListAdapter localListAdapter = this.e;
    int k = 0;
    if (localListAdapter != null)
    {
      k = this.e.getCount();
      if (j < k)
        return this.e.isEnabled(j);
    }
    return ((u)this.b.get(j - k)).c;
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.e != null)
      this.e.registerDataSetObserver(paramDataSetObserver);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.e != null)
      this.e.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
