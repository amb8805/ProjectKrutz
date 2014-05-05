package com.twitter.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

final class es extends BaseAdapter
{
  private final ArrayList a = new ArrayList();

  public es(SignUpActivity paramSignUpActivity)
  {
  }

  public final void a(ArrayList paramArrayList)
  {
    this.a.clear();
    this.a.addAll(paramArrayList);
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
    View localView1;
    fu localfu1;
    if (paramView == null)
    {
      View localView2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903060, null);
      fu localfu2 = new fu(localView2);
      localfu2.a.setVisibility(8);
      localView2.setTag(localfu2);
      localView1 = localView2;
      localfu1 = localfu2;
    }
    while (true)
    {
      localfu1.b.setText((CharSequence)this.a.get(paramInt));
      return localView1;
      localfu1 = (fu)paramView.getTag();
      localView1 = paramView;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.es
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
