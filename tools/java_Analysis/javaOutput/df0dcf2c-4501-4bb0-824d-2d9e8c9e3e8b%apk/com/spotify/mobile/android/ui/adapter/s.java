package com.spotify.mobile.android.ui.adapter;

import android.view.View;
import android.widget.ListAdapter;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.cc;

final class s
{
  public final ListAdapter a;
  public String b;
  public final int c;
  public int d;
  public final t e;
  public boolean f;
  public int g;
  public int h;
  public int i = -1;
  public View j;
  public View k;
  public boolean l;
  public boolean m;

  private s(ListAdapter paramListAdapter, String paramString, int paramInt, t paramt, View paramView)
  {
    cc.a(paramListAdapter);
    this.a = paramListAdapter;
    this.b = paramString;
    this.c = paramInt;
    this.e = paramt;
    this.f = true;
    this.j = null;
    this.k = paramView;
    this.l = true;
    this.m = true;
  }

  public final boolean a()
  {
    return this.b != null;
  }

  public final boolean a(int paramInt)
  {
    return paramInt < b();
  }

  public final int b()
  {
    if (a())
      return 1;
    return 0;
  }

  public final boolean b(int paramInt)
  {
    return (paramInt < b() + c()) && (paramInt >= b());
  }

  public final int c()
  {
    if ((this.j != null) && (this.m));
    for (int n = 1; n != 0; n = 0)
      return 1;
    return 0;
  }

  public final boolean c(int paramInt)
  {
    return (paramInt < b() + c() + this.a.getCount() + d()) && (paramInt >= b() + c() + this.a.getCount());
  }

  public final int d()
  {
    if ((this.k != null) && (this.l));
    for (int n = 1; n != 0; n = 0)
      return 1;
    return 0;
  }

  public final int d(int paramInt)
  {
    int n = paramInt - this.g;
    if ((n >= 0) && (n < this.a.getCount() + b() + c() + d()));
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "global position out of bounds: " + paramInt);
      return n;
    }
  }

  public final int e(int paramInt)
  {
    int n = d(paramInt);
    if (a(n))
      throw new AssertionError("Should not find title at " + paramInt);
    if (b(n))
      throw new AssertionError("Should not find header at " + paramInt);
    if (c(n))
      throw new AssertionError("Should not find footer at " + paramInt);
    return n - b() - c();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
