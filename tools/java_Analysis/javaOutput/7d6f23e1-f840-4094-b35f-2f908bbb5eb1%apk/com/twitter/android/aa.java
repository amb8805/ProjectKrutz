package com.twitter.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.twitter.android.widget.CardRowView;
import dh;
import java.util.ArrayList;

final class aa extends BaseAdapter
{
  private final ArrayList a = new ArrayList();

  private aa()
  {
  }

  public final void a(Context paramContext, dh paramdh)
  {
    this.a.clear();
    if ((paramdh.a != null) && (!"0".equals(paramdh.a)))
      this.a.add(new fb(paramContext.getString(2131427368), paramdh.a, paramdh.c, 11));
    if ((paramdh.b != null) && (!"0".equals(paramdh.b)))
      this.a.add(new fb(paramContext.getString(2131427383), paramdh.b, paramdh.d, 12));
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView2;
    fj localfj1;
    if (paramView == null)
    {
      localView2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903095, paramViewGroup, false);
      fj localfj2 = new fj(localView2);
      localView2.setTag(localfj2);
      localfj1 = localfj2;
    }
    for (View localView1 = localView2; ; localView1 = paramView)
    {
      fb localfb = (fb)this.a.get(paramInt);
      localfj1.b.setText(localfb.a);
      localfj1.a.setText(localfb.b);
      ((CardRowView)localView1).a(paramInt, this.a.size());
      return localView1;
      localfj1 = (fj)paramView.getTag();
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
