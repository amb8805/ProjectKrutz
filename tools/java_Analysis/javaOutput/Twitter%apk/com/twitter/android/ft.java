package com.twitter.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class ft
{
  public final TextView a;
  public final TextView b;
  public final ImageView c;

  public ft(View paramView)
  {
    this.a = ((TextView)paramView.findViewById(2131165215));
    this.b = ((TextView)paramView.findViewById(2131165236));
    this.c = ((ImageView)paramView.findViewById(2131165267));
  }

  public static View a(View paramView, ViewGroup paramViewGroup, el paramel)
  {
    View localView1;
    ft localft1;
    if (paramView == null)
    {
      View localView2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903096, paramViewGroup, false);
      ft localft2 = new ft(localView2);
      localView2.setTag(localft2);
      localView1 = localView2;
      localft1 = localft2;
    }
    while (true)
    {
      localft1.a.setText(paramel.a);
      if (paramel.b == 0)
        break;
      localft1.c.setImageResource(paramel.b);
      localft1.c.setVisibility(0);
      return localView1;
      localft1 = (ft)paramView.getTag();
      localView1 = paramView;
    }
    localft1.c.setVisibility(8);
    return localView1;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ft
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
