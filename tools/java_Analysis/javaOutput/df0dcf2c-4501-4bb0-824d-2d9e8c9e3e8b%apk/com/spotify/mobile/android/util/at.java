package com.spotify.mobile.android.util;

import android.os.SystemClock;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.HashSet;
import java.util.Set;

public final class at
  implements AbsListView.OnScrollListener
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = false;
  private int d = 0;
  private float e = 0.0F;
  private int f = 0;
  private long g = 0L;
  private Integer h = null;
  private double i = 0.0D;
  private int j = 0;
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private Set<Integer> n = new HashSet();
  private au o;

  public at()
  {
  }

  public final void a()
  {
    Assertion.a(true, "Cannot set a negative speed threshold");
    this.e = 8.0F;
    if (this.i < this.e);
    for (int i1 = 1; ; i1 = 2)
    {
      this.l = i1;
      this.b = true;
      return;
    }
  }

  public final void b()
  {
    Assertion.a(true, "Cannot set a negative distance threshold");
    this.d = 10;
    if (this.j < this.d);
    for (int i1 = 1; ; i1 = 2)
    {
      this.m = i1;
      this.c = true;
      return;
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    if ((this.o != null) && (paramAbsListView.getChildCount() > 0))
    {
      this.o.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
      HashSet localHashSet = new HashSet();
      for (int i2 = paramInt1; i2 < paramInt1 + paramInt2; i2++)
        localHashSet.add(Integer.valueOf(i2));
      if (this.n.size() > 0)
      {
        Set localSet = this.n;
        localSet.removeAll(localHashSet);
        if (localSet.size() <= 0);
      }
      this.n = localHashSet;
      int i3 = this.k;
      if (paramInt1 <= this.f)
        break label342;
      this.k = i1;
      this.h = null;
      if (i3 == this.k)
        break label430;
      this.j = 0;
      this.m = i1;
      label174: if (this.f != paramInt1)
      {
        long l1 = SystemClock.elapsedRealtime();
        int i5 = Math.abs(this.f - paramInt1);
        long l2 = l1 - this.g;
        this.i = (1000.0D * (i5 / l2));
        this.f = paramInt1;
        this.g = l1;
      }
      if (this.b)
      {
        if (this.i <= this.e)
          break label502;
        if (this.l != 2)
          this.l = 2;
      }
      label286: if ((this.c) && (this.b))
        if ((this.m != 2) || (this.l != 2))
          break label540;
    }
    while (true)
    {
      if (this.a != i1)
      {
        this.a = i1;
        if (i1 == 0)
          break label546;
      }
      return;
      label342: if (paramInt1 < this.f)
      {
        this.k = 2;
        this.h = null;
        break;
      }
      int i4 = paramAbsListView.getChildAt(0).getTop();
      if (this.h != null)
      {
        if (i4 >= this.h.intValue())
          break label410;
        this.k = i1;
      }
      while (true)
      {
        this.h = Integer.valueOf(i4);
        break;
        label410: if (i4 > this.h.intValue())
          this.k = 2;
      }
      label430: this.j += Math.abs(this.f - paramInt1);
      if ((!this.c) || (this.j <= this.d) || (this.m == 2))
        break label174;
      this.m = 2;
      break label174;
      label502: if (this.l == i1)
        break label286;
      this.l = i1;
      break label286;
      label540: i1 = 0;
    }
    label546:
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.o != null)
      this.o.onScrollStateChanged(paramAbsListView, paramInt);
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    this.k = 0;
    this.j = 0;
    this.m = 1;
    this.i = 0.0D;
    this.l = 1;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
