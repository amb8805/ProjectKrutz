package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.common.base.i;
import com.spotify.android.paste.widget.SectionHeaderView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public abstract class j extends BaseAdapter
{
  private DataSetObserver a = new j.1(this);
  private Context b;
  private ArrayList<String> c = new ArrayList();
  private ListAdapter d;
  private int[] e;
  private int[] f;
  private int g;

  public j(Context paramContext, ListAdapter paramListAdapter)
  {
    this.b = paramContext;
    this.d = paramListAdapter;
    paramListAdapter.registerDataSetObserver(this.a);
  }

  private void a()
  {
    if ((this.d == null) || (this.c.size() == 0));
    while (true)
    {
      return;
      int[] arrayOfInt = new int[this.c.size()];
      for (int i = 0; i < arrayOfInt.length; i++)
        arrayOfInt[i] = 0;
      for (int j = 0; j < this.d.getCount(); j++)
      {
        int i7 = a(j);
        arrayOfInt[i7] = (1 + arrayOfInt[i7]);
      }
      this.g = 0;
      for (int k = 0; k < arrayOfInt.length; k++)
        if (arrayOfInt[k] > 0)
        {
          arrayOfInt[k] = (1 + arrayOfInt[k]);
          this.g = (1 + this.g);
        }
      int m = 0;
      int n = 0;
      while (m < arrayOfInt.length)
      {
        int i6 = arrayOfInt[m];
        arrayOfInt[m] = n;
        n += i6;
        m++;
      }
      this.e = ((int[])arrayOfInt.clone());
      this.f = new int[n + 1];
      int i3;
      for (int i1 = 0; ; i1++)
      {
        int i2 = arrayOfInt.length;
        i3 = 0;
        if (i1 >= i2)
          break;
        int i5 = -1 * (i1 + 1);
        this.f[arrayOfInt[i1]] = i5;
        arrayOfInt[i1] = (1 + arrayOfInt[i1]);
      }
      while (i3 < this.d.getCount())
      {
        int i4 = a(i3);
        this.f[arrayOfInt[i4]] = i3;
        arrayOfInt[i4] = (1 + arrayOfInt[i4]);
        i3++;
      }
    }
  }

  public abstract int a(int paramInt);

  public final void a(String[] paramArrayOfString)
  {
    Collections.addAll(this.c, paramArrayOfString);
    a();
    notifyDataSetChanged();
  }

  public boolean areAllItemsEnabled()
  {
    return (this.g == 0) && (this.d.areAllItemsEnabled());
  }

  public int getCount()
  {
    return this.d.getCount() + this.g;
  }

  public Object getItem(int paramInt)
  {
    int i = this.f[paramInt];
    if (i < 0)
    {
      int j = -1 + i * -1;
      return this.c.get(j);
    }
    return this.d.getItem(this.f[paramInt]);
  }

  public long getItemId(int paramInt)
  {
    if (paramInt < 0);
    int i;
    do
    {
      return -1L;
      i = this.f[paramInt];
    }
    while (i < 0);
    return this.d.getItemId(i);
  }

  public int getItemViewType(int paramInt)
  {
    if (paramInt > this.f.length)
      return -1;
    int i = this.f[paramInt];
    if (i < 0)
      return 0;
    return 1 + this.d.getItemViewType(i);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    i.a(paramInt, this.f.length);
    int i = this.f[paramInt];
    if (i < 0)
    {
      int j = -1 + i * -1;
      SectionHeaderView localSectionHeaderView = new SectionHeaderView(this.b);
      ((TextView)localSectionHeaderView.findViewById(2131362227)).setText(((String)this.c.get(j)).toUpperCase(Locale.getDefault()));
      return localSectionHeaderView;
    }
    return this.d.getView(i, paramView, paramViewGroup);
  }

  public int getViewTypeCount()
  {
    return 1 + this.d.getViewTypeCount();
  }

  public boolean hasStableIds()
  {
    return false;
  }

  public boolean isEmpty()
  {
    return getCount() == 0;
  }

  public boolean isEnabled(int paramInt)
  {
    if (paramInt > this.f.length);
    int i;
    do
    {
      return false;
      i = this.f[paramInt];
    }
    while (i < 0);
    return this.d.isEnabled(i);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
