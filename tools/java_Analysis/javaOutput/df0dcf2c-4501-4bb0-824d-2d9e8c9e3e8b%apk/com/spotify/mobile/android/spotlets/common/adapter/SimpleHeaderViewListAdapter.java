package com.spotify.mobile.android.spotlets.common.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView.FixedViewInfo;
import com.google.common.base.i;
import java.util.ArrayList;

public final class SimpleHeaderViewListAdapter extends HeaderViewListAdapter
{
  private final View.OnClickListener a = new SimpleHeaderViewListAdapter.1(this);
  private final Object b = new Object();
  private final ArrayList<ListView.FixedViewInfo> c;
  private final ArrayList<ListView.FixedViewInfo> d;
  private final ListView.FixedViewInfo e;
  private final ListView.FixedViewInfo f;
  private h g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;

  protected SimpleHeaderViewListAdapter(ListView.FixedViewInfo paramFixedViewInfo1, ListView.FixedViewInfo paramFixedViewInfo2, ListAdapter paramListAdapter, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(a(paramFixedViewInfo1), a(paramFixedViewInfo2), paramListAdapter, paramBoolean1, paramBoolean2);
  }

  private SimpleHeaderViewListAdapter(ArrayList<ListView.FixedViewInfo> paramArrayList1, ArrayList<ListView.FixedViewInfo> paramArrayList2, ListAdapter paramListAdapter, boolean paramBoolean1, boolean paramBoolean2)
  {
    super((ArrayList)i.a(paramArrayList1), (ArrayList)i.a(paramArrayList2), paramListAdapter);
    this.c = paramArrayList1;
    this.d = paramArrayList2;
    this.e = ((ListView.FixedViewInfo)a(paramArrayList1));
    boolean bool2;
    if (this.e != null)
    {
      bool2 = bool1;
      this.h = bool2;
      this.f = ((ListView.FixedViewInfo)a(paramArrayList2));
      if (this.f == null)
        break label220;
      label101: this.i = bool1;
      this.j = paramBoolean1;
      this.k = paramBoolean2;
      if (getWrappedAdapter() == null)
        break label226;
    }
    label220: label226: for (int m = getWrappedAdapter().getCount(); ; m = 0)
    {
      if (m == 0)
      {
        if ((paramBoolean1) && (this.h))
          a(this.e, this.c, false, false);
        if ((paramBoolean2) && (this.i))
          a(this.f, this.d, false, false);
      }
      paramListAdapter.registerDataSetObserver(new SimpleHeaderViewListAdapter.2(this, paramListAdapter, paramListAdapter instanceof BaseAdapter));
      return;
      bool2 = false;
      break;
      bool1 = false;
      break label101;
    }
  }

  private static <T> T a(ArrayList<T> paramArrayList)
  {
    if (paramArrayList.isEmpty())
      return null;
    return paramArrayList.get(0);
  }

  private static <T> ArrayList<T> a(T paramT)
  {
    if (paramT != null);
    for (int m = 1; ; m = 0)
    {
      ArrayList localArrayList = new ArrayList(m);
      if (paramT != null)
        localArrayList.add(paramT);
      return localArrayList;
    }
  }

  private void a(ListView.FixedViewInfo paramFixedViewInfo, ArrayList<ListView.FixedViewInfo> paramArrayList, boolean paramBoolean1, boolean paramBoolean2)
  {
    i.a(paramFixedViewInfo, "view does not exist");
    Object localObject1;
    if (paramBoolean1 == paramArrayList.isEmpty())
    {
      localObject1 = this.b;
      if (paramBoolean1)
        try
        {
          paramArrayList.add(paramFixedViewInfo);
          while (true)
          {
            if ((paramBoolean2) && ((getWrappedAdapter() instanceof BaseAdapter)))
              ((BaseAdapter)getWrappedAdapter()).notifyDataSetChanged();
            return;
            paramArrayList.remove(paramFixedViewInfo);
          }
        }
        finally
        {
        }
    }
  }

  public final void a(h paramh)
  {
    this.g = paramh;
    if (this.e != null)
      this.e.view.setOnClickListener(this.a);
    if (this.f != null)
      this.f.view.setOnClickListener(this.a);
  }

  public final void a(boolean paramBoolean)
  {
    ListView.FixedViewInfo localFixedViewInfo = this.e;
    ArrayList localArrayList = this.c;
    this.h = paramBoolean;
    a(localFixedViewInfo, localArrayList, paramBoolean, true);
  }

  public final boolean a()
  {
    return !this.c.isEmpty();
  }

  public final void b(boolean paramBoolean)
  {
    ListView.FixedViewInfo localFixedViewInfo = this.f;
    ArrayList localArrayList = this.d;
    this.i = paramBoolean;
    a(localFixedViewInfo, localArrayList, paramBoolean, true);
  }

  public final boolean b()
  {
    return !this.d.isEmpty();
  }

  public final boolean isEnabled(int paramInt)
  {
    if (((paramInt == 0) && (this.c.size() == 1)) || ((paramInt == -1 + getCount()) && (this.d.size() == 1)));
    for (int m = 1; ((m == 0) || (this.g == null)) && (super.isEnabled(paramInt)); m = 0)
      return true;
    return false;
  }

  public final boolean removeFooter(View paramView)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean removeHeader(View paramView)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.SimpleHeaderViewListAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
