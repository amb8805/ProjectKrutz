package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;

public final class bj extends BaseAdapter
{
  private final Context a;
  private final int[] b;
  private boolean[] c;
  private final Intent[] d;

  public bj(Context paramContext, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean, Intent[] paramArrayOfIntent)
  {
    this.a = paramContext;
    this.b = paramArrayOfInt;
    this.c = paramArrayOfBoolean;
    this.d = paramArrayOfIntent;
  }

  public final int getCount()
  {
    return this.b.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.d[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView1;
    ft localft1;
    ImageView localImageView;
    if (paramView == null)
    {
      View localView2 = LayoutInflater.from(this.a).inflate(2130903071, paramViewGroup, false);
      ft localft2 = new ft(localView2);
      localView2.setTag(localft2);
      localView1 = localView2;
      localft1 = localft2;
      localft1.a.setText(this.b[paramInt]);
      localImageView = localft1.c;
      if (this.c[paramInt] == 0)
        break label117;
    }
    label117: for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      ((CardRowView)localView1).a(paramInt, getCount());
      return localView1;
      localft1 = (ft)paramView.getTag();
      localView1 = paramView;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
