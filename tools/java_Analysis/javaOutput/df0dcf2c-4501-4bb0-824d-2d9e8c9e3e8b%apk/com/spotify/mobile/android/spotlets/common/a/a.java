package com.spotify.mobile.android.spotlets.common.a;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.spotify.mobile.android.util.bp;

public abstract class a
  implements AbsListView.OnScrollListener
{
  private int a;
  private int b = 0;
  private int c;
  private boolean d = false;

  public a()
  {
  }

  protected void a(int paramInt)
  {
  }

  protected void a(int paramInt1, int paramInt2)
  {
  }

  protected abstract boolean a();

  protected void b()
  {
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 != this.a)
    {
      a(paramInt2);
      this.a = paramInt2;
    }
    if (paramInt3 != this.c)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.c);
      arrayOfObject[1] = Integer.valueOf(paramInt3);
      bp.a("OnScrollListenerAdapter: item count: %d -> %d", arrayOfObject);
      this.c = paramInt3;
      this.d = false;
    }
    if (a())
    {
      if (this.d)
        bp.a("OnScrollListenerAdapter: threshold reached, waiting", new Object[0]);
      int i;
      int j;
      do
      {
        return;
        if (paramInt2 == 0)
        {
          bp.a("OnScrollListenerAdapter: empty list", new Object[0]);
          return;
        }
        i = -1 + (paramInt1 + paramInt2);
        j = -1 + this.c;
      }
      while (i + 2 < j);
      bp.a("OnScrollListenerAdapter: the end is nigh!", new Object[0]);
      a(i, paramInt3);
      this.d = true;
      return;
    }
    this.d = false;
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((this.b != paramInt) && (paramInt == 1))
      b();
    this.b = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
