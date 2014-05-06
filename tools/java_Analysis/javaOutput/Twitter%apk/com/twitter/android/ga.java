package com.twitter.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;
import java.util.ArrayList;

public final class ga extends ArrayAdapter
{
  public ga(Context paramContext)
  {
    super(paramContext, 0, new ArrayList());
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    el localel = (el)getItem(paramInt);
    View localView2;
    if (paramView == null)
    {
      localView2 = LayoutInflater.from(getContext()).inflate(2130903096, null);
      localView2.setTag(new ft(localView2));
    }
    for (View localView1 = localView2; ; localView1 = paramView)
    {
      ((ft)localView1.getTag()).a.setText(localel.a);
      ((CardRowView)localView1).a(paramInt, getCount());
      return localView1;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ga
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
