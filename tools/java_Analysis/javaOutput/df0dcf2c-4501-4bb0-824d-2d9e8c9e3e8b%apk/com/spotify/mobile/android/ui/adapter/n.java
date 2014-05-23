package com.spotify.mobile.android.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.mobile.android.ui.page.j;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;

public abstract class n extends BaseAdapter
{
  private ArrayList<Integer> a = new ArrayList();
  private boolean b = true;

  public n()
  {
    registerDataSetObserver(new n.1(this));
  }

  private int a(int paramInt)
  {
    b();
    return ((Integer)this.a.get(paramInt)).intValue();
  }

  private void b()
  {
    if (this.b)
    {
      this.a.clear();
      for (int i = 0; i < a(); i++)
        this.a.add(Integer.valueOf(i));
      this.b = false;
    }
  }

  public abstract int a();

  public abstract j a(int paramInt, ViewGroup paramViewGroup);

  public int getCount()
  {
    b();
    return this.a.size();
  }

  public Object getItem(int paramInt)
  {
    return a(a(paramInt), null);
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    return -1;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return ((j)cc.a(a(a(paramInt), paramViewGroup))).e();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
