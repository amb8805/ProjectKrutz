package com.twitter.android;

import ad;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

final class ck extends BaseAdapter
{
  private final Context a;
  private ad b;
  private TextView c;
  private TextView d;

  public ck(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a(ad paramad)
  {
    if ((this.b != null) && (this.b.equals(paramad)))
      return;
    this.b = paramad;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    if (this.b == null)
      return 0;
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView2;
    if (paramView == null)
    {
      localView2 = LayoutInflater.from(this.a).inflate(2130903117, paramViewGroup, false);
      this.c = ((TextView)localView2.findViewById(2131165363));
      TextView localTextView2 = (TextView)localView2.findViewById(2131165364);
      localTextView2.setOnClickListener(new bd(this, this.a, localTextView2));
      this.d = localTextView2;
    }
    for (View localView1 = localView2; ; localView1 = paramView)
    {
      TextView localTextView1 = this.c;
      Context localContext = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.b.b;
      localTextView1.setText(localContext.getString(2131427410, arrayOfObject));
      this.d.setHint('@' + this.b.g);
      return localView1;
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ck
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
