package com.twitter.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public final class bv extends BaseAdapter
{
  boolean a = true;
  private final BaseAdapter[] b;
  private final int[] c = null;
  private final int d;

  private bv(int[] paramArrayOfInt, BaseAdapter[] paramArrayOfBaseAdapter, int paramInt)
  {
    this.b = paramArrayOfBaseAdapter;
    this.d = 2130903093;
    gg localgg = new gg(this);
    int i = paramArrayOfBaseAdapter.length;
    for (int j = 0; j < i; j++)
      paramArrayOfBaseAdapter[j].registerDataSetObserver(localgg);
  }

  public bv(BaseAdapter[] paramArrayOfBaseAdapter)
  {
    this(null, paramArrayOfBaseAdapter, 2130903093);
  }

  private boolean c(int paramInt)
  {
    return (this.c != null) && (this.c[paramInt] > 0);
  }

  public final int a(int paramInt)
  {
    int i = 0;
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int j = arrayOfBaseAdapter.length;
    int k = 0;
    int m = 0;
    while (i < j)
    {
      k += arrayOfBaseAdapter[i].getCount();
      if (c(m))
        k++;
      if (paramInt < k)
        return m;
      m++;
      i++;
    }
    return m;
  }

  public final boolean areAllItemsEnabled()
  {
    int i = this.b.length;
    int j = 0;
    if (j < i)
      if (!c(j));
    for (int k = 1; ; k = 0)
    {
      if ((k == 0) && (super.areAllItemsEnabled()))
      {
        return true;
        j++;
        break;
      }
      return false;
    }
  }

  public final int b(int paramInt)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      j += this.b[i].getCount();
      i++;
    }
    return j;
  }

  public final int getCount()
  {
    int i = 0;
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int j = arrayOfBaseAdapter.length;
    int k = 0;
    int m = 0;
    while (i < j)
    {
      int n = arrayOfBaseAdapter[i].getCount();
      if (n > 0)
      {
        m += n;
        if (c(k))
          m++;
      }
      k++;
      i++;
    }
    return m;
  }

  public final Object getItem(int paramInt)
  {
    int i = 0;
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int j = arrayOfBaseAdapter.length;
    int k = 0;
    int m = paramInt;
    while (i < j)
    {
      BaseAdapter localBaseAdapter = arrayOfBaseAdapter[i];
      int n = localBaseAdapter.getCount();
      if (n > 0)
      {
        if (c(k))
        {
          n++;
          if (m == 0)
            return null;
          if (m < n)
            return localBaseAdapter.getItem(m - 1);
        }
        else if (m < n)
        {
          return localBaseAdapter.getItem(m);
        }
        m -= n;
      }
      k++;
      i++;
    }
    return null;
  }

  public final long getItemId(int paramInt)
  {
    int i = 0;
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int j = arrayOfBaseAdapter.length;
    int k = 0;
    int m = paramInt;
    while (i < j)
    {
      BaseAdapter localBaseAdapter = arrayOfBaseAdapter[i];
      int n = localBaseAdapter.getCount();
      if (n > 0)
      {
        if (c(k))
        {
          n++;
          if (m == 0)
            return 0L;
          if (m < n)
            return localBaseAdapter.getItemId(m - 1);
        }
        else if (m < n)
        {
          return localBaseAdapter.getItemId(m);
        }
        m -= n;
      }
      k++;
      i++;
    }
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int i = arrayOfBaseAdapter.length;
    int j = 0;
    int k = 0;
    int m = 1;
    int n = paramInt;
    while (j < i)
    {
      BaseAdapter localBaseAdapter = arrayOfBaseAdapter[j];
      int i1 = localBaseAdapter.getCount();
      if (i1 > 0)
      {
        if (c(k))
        {
          i1++;
          if (n == 0)
            return 0;
          if (n < i1)
            return m + localBaseAdapter.getItemViewType(n - 1);
        }
        else if (n < i1)
        {
          return m + localBaseAdapter.getItemViewType(n);
        }
        n -= i1;
      }
      m += localBaseAdapter.getViewTypeCount();
      k++;
      j++;
    }
    return super.getItemViewType(n);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramViewGroup.getContext());
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int i = arrayOfBaseAdapter.length;
    int j = 0;
    int k = 0;
    int m = paramInt;
    BaseAdapter localBaseAdapter;
    int n;
    View localView;
    if (j < i)
    {
      localBaseAdapter = arrayOfBaseAdapter[j];
      n = localBaseAdapter.getCount();
      if (n > 0)
        if (c(k))
        {
          n++;
          if (m == 0)
          {
            if (paramView != null)
              break label208;
            localView = localLayoutInflater.inflate(this.d, paramViewGroup, false);
            localView.setTag(localView.findViewById(2131165303));
          }
        }
    }
    while (true)
    {
      int[] arrayOfInt = this.c;
      int i1 = arrayOfInt[(k % arrayOfInt.length)];
      if (i1 == 0)
      {
        ((TextView)localView.getTag()).setText(null);
        return localView;
      }
      ((TextView)localView.getTag()).setText(i1);
      return localView;
      if (m < n)
      {
        return localBaseAdapter.getView(m - 1, paramView, paramViewGroup);
        if (m < n)
          return localBaseAdapter.getView(m, paramView, paramViewGroup);
      }
      m -= n;
      k++;
      j++;
      break;
      return paramView;
      label208: localView = paramView;
    }
  }

  public final int getViewTypeCount()
  {
    int i = 0;
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int j = arrayOfBaseAdapter.length;
    int k = 0;
    while (i < j)
    {
      k += arrayOfBaseAdapter[i].getViewTypeCount();
      i++;
    }
    return k + 1;
  }

  public final boolean isEnabled(int paramInt)
  {
    BaseAdapter[] arrayOfBaseAdapter = this.b;
    int i = arrayOfBaseAdapter.length;
    int j = 0;
    int k = 0;
    int m = paramInt;
    while (j < i)
    {
      BaseAdapter localBaseAdapter = arrayOfBaseAdapter[j];
      int n = localBaseAdapter.getCount();
      if (n > 0)
      {
        if (c(k))
        {
          n++;
          if (m == 0)
            return false;
          if (m < n)
            return localBaseAdapter.isEnabled(m - 1);
        }
        else if (m < n)
        {
          return localBaseAdapter.isEnabled(m);
        }
        m -= n;
      }
      k++;
      j++;
    }
    return super.isEnabled(m);
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    this.a = true;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
