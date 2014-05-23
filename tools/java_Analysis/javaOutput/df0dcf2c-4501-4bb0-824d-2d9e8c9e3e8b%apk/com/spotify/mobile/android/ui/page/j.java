package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class j
{
  k a = new k();
  private Context b;
  private ViewGroup c;
  private View d;
  private int e;
  private boolean f;

  public j(Context paramContext, ViewGroup paramViewGroup)
  {
    this.b = paramContext;
    this.c = paramViewGroup;
    this.f = false;
  }

  public void a()
  {
    this.f = true;
  }

  public final void a(int paramInt)
  {
    this.e = paramInt;
  }

  public final void a(View paramView)
  {
    this.d = paramView;
    this.e = this.d.getId();
  }

  public void b()
  {
    this.f = false;
  }

  public final void b(int paramInt)
  {
    a(f().inflate(paramInt, this.c, false));
  }

  public final View c(int paramInt)
  {
    if (this.d != null)
      return this.d.findViewById(paramInt);
    return null;
  }

  public final Context d()
  {
    return this.b;
  }

  public final View e()
  {
    return this.d;
  }

  public final LayoutInflater f()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
