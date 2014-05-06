package com.twitter.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;

final class er extends BaseAdapter
{
  private final el[] a;
  private final int b;

  er(el[] paramArrayOfel)
  {
    this(paramArrayOfel, 0);
  }

  er(el[] paramArrayOfel, int paramInt)
  {
    this.a = paramArrayOfel;
    this.b = paramInt;
  }

  public final int getCount()
  {
    return this.a.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.a[paramInt].c;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    ft localft;
    if (paramView == null)
    {
      localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903096, paramViewGroup, false);
      localft = new ft(localView);
      localView.setTag(localft);
      el localel = this.a[paramInt];
      localft.a.setText(localel.a);
      if (localel.b == 0)
        break label125;
      localft.c.setImageResource(localel.b);
      localft.c.setVisibility(0);
    }
    while (true)
    {
      if ((0x1 & this.b) == 0)
        break label138;
      ((CardRowView)localView).a(1);
      return localView;
      localft = (ft)paramView.getTag();
      localView = paramView;
      break;
      label125: localft.c.setVisibility(8);
    }
    label138: ((CardRowView)localView).a(paramInt, getCount());
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.er
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
