package com.twitter.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;

public abstract class eq extends BaseAdapter
{
  protected final ListAdapter a;
  private final int b;
  private final int c;
  private boolean d;

  protected eq(ListAdapter paramListAdapter, int paramInt)
  {
    this.a = paramListAdapter;
    this.b = paramListAdapter.getViewTypeCount();
    this.c = paramInt;
    this.d = e();
    paramListAdapter.registerDataSetObserver(new cd(this, null));
  }

  public static View a(View paramView, ViewGroup paramViewGroup, String paramString)
  {
    View localView1;
    TextView localTextView1;
    if (paramView == null)
    {
      View localView2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903051, paramViewGroup, false);
      TextView localTextView2 = (TextView)localView2.findViewById(2131165215);
      localView2.setTag(localTextView2);
      localView1 = localView2;
      localTextView1 = localTextView2;
    }
    while (true)
    {
      localTextView1.setText(paramString);
      return localView1;
      localTextView1 = (TextView)paramView.getTag();
      localView1 = paramView;
    }
  }

  private boolean b(int paramInt)
  {
    return (d()) && (paramInt == 0);
  }

  private boolean c(int paramInt)
  {
    return (b()) && (paramInt == getCount() - 1);
  }

  private boolean d()
  {
    return (0x1 & this.c) != 0;
  }

  private boolean d(int paramInt)
  {
    return (e()) && (this.d) && (paramInt == getCount() - 1);
  }

  private int e(int paramInt)
  {
    if (d())
      return paramInt - 1;
    return paramInt;
  }

  private boolean e()
  {
    return (0x4 & this.c) != 0;
  }

  protected abstract View a(View paramView, ViewGroup paramViewGroup);

  protected abstract Object a();

  protected Object a(int paramInt)
  {
    return this.a.getItem(paramInt);
  }

  public final void a(boolean paramBoolean)
  {
    if (this.d)
    {
      this.d = false;
      notifyDataSetChanged();
    }
  }

  protected abstract View b(View paramView, ViewGroup paramViewGroup);

  protected boolean b()
  {
    return (0x2 & this.c) != 0;
  }

  public final ListAdapter c()
  {
    return this.a;
  }

  public int getCount()
  {
    int i;
    if ((e()) && (this.d))
    {
      i = 0 + 1;
      if (d())
        i++;
    }
    do
    {
      do
      {
        return i;
        i = this.a.getCount();
      }
      while (i == 0);
      if (d())
        i++;
    }
    while (!b());
    return i + 1;
  }

  public Object getItem(int paramInt)
  {
    if (b(paramInt))
      return null;
    if (d(paramInt))
      return null;
    if (c(paramInt))
      return a();
    return a(e(paramInt));
  }

  public long getItemId(int paramInt)
  {
    if ((b(paramInt)) || (d(paramInt)) || (c(paramInt)))
      return 0L;
    return this.a.getItemId(e(paramInt));
  }

  public int getItemViewType(int paramInt)
  {
    if (b(paramInt))
      return 1 + (this.b - 1);
    if (d(paramInt))
      return 3 + (this.b - 1);
    if (c(paramInt))
      return 2 + (this.b - 1);
    return this.a.getItemViewType(e(paramInt));
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (b(paramInt))
      localView = a(paramView, paramViewGroup);
    while (true)
    {
      if ((0x8 & this.c) != 0)
        ((CardRowView)localView).a(paramInt, getCount());
      return localView;
      if (d(paramInt))
      {
        if (paramView == null)
          localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903076, paramViewGroup, false);
      }
      else if (c(paramInt))
      {
        localView = b(paramView, paramViewGroup);
      }
      else
      {
        localView = this.a.getView(e(paramInt), paramView, paramViewGroup);
        continue;
        localView = paramView;
      }
    }
  }

  public int getViewTypeCount()
  {
    return 3 + this.b;
  }

  public boolean isEnabled(int paramInt)
  {
    if (b(paramInt))
      return false;
    if (d(paramInt))
      return false;
    if (c(paramInt))
      return a() != null;
    return this.a.isEnabled(e(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.eq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
