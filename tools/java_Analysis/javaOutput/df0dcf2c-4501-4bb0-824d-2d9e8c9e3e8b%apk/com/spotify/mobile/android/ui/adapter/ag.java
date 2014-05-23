package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.h;
import java.util.Arrays;
import java.util.List;

public abstract class ag<T> extends BaseAdapter
{
  protected Context a;
  private List<T> b;
  private boolean c;

  public ag(Context paramContext, boolean paramBoolean)
  {
    this.a = paramContext;
    this.c = paramBoolean;
  }

  protected abstract void a(ListItemView paramListItemView, T paramT);

  public final void a(T[] paramArrayOfT)
  {
    this.b = Arrays.asList(paramArrayOfT);
    notifyDataSetChanged();
  }

  public int getCount()
  {
    List localList = this.b;
    int i = 0;
    if (localList != null)
      i = this.b.size();
    if (this.c)
      i++;
    return i;
  }

  public T getItem(int paramInt)
  {
    if (paramInt < this.b.size())
      return this.b.get(paramInt);
    return null;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    if ((this.b != null) && (paramInt < this.b.size()))
      return 0;
    return 1;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (getItemViewType(paramInt) == 0)
    {
      if (paramView != null);
      for (ListItemView localListItemView2 = (ListItemView)paramView; ; localListItemView2 = new ListItemView(this.a))
      {
        a(localListItemView2, getItem(paramInt));
        return localListItemView2;
      }
    }
    ListItemView localListItemView1 = h.j(this.a, paramViewGroup);
    localListItemView1.a(this.a.getString(2131690174));
    return localListItemView1;
  }

  public int getViewTypeCount()
  {
    if (this.c)
      return 2;
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
