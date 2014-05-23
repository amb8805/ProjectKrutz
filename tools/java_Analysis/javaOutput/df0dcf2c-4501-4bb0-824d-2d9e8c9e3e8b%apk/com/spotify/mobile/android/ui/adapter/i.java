package com.spotify.mobile.android.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.service.ConnectDevice;
import java.util.ArrayList;

public final class i extends BaseAdapter
{
  private ArrayList<ConnectDevice> a = new ArrayList(0);

  public i()
  {
  }

  public final void a(ArrayList<ConnectDevice> paramArrayList)
  {
    this.a = paramArrayList;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return ((ConnectDevice)this.a.get(paramInt)).a().hashCode();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (ListItemView localListItemView = h.h(paramViewGroup.getContext(), paramViewGroup); ; localListItemView = (ListItemView)paramView)
    {
      ((ConnectDevice)this.a.get(paramInt)).a(localListItemView.getContext(), localListItemView);
      return localListItemView;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
