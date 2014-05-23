package com.spotify.mobile.android.util;

import android.view.View;

public final class ProgressAndErrorViewManager
{
  private final View a;
  private final View b;
  private final View c;
  private ProgressAndErrorViewManager.State d;
  private ProgressAndErrorViewManager.State e;
  private ProgressAndErrorViewManager.State f;
  private Runnable g = new ProgressAndErrorViewManager.1(this);

  public ProgressAndErrorViewManager(View paramView1, View paramView2, View paramView3)
  {
    this.b = paramView1;
    this.c = paramView2;
    this.a = paramView3;
    this.b.setVisibility(8);
    this.c.setVisibility(8);
    this.a.setVisibility(8);
  }

  private void d()
  {
    this.d = ProgressAndErrorViewManager.State.d;
    this.e = ProgressAndErrorViewManager.State.c;
    Runnable localRunnable = this.g;
    View localView = this.c;
    View[] arrayOfView = new View[2];
    arrayOfView[0] = this.a;
    arrayOfView[1] = this.b;
    dy.a(localRunnable, localView, arrayOfView);
  }

  private void e()
  {
    this.d = ProgressAndErrorViewManager.State.d;
    this.e = ProgressAndErrorViewManager.State.a;
    Runnable localRunnable = this.g;
    View localView = this.b;
    View[] arrayOfView = new View[2];
    arrayOfView[0] = this.c;
    arrayOfView[1] = this.a;
    dy.a(localRunnable, localView, arrayOfView);
  }

  private void f()
  {
    this.d = ProgressAndErrorViewManager.State.d;
    this.e = ProgressAndErrorViewManager.State.b;
    Runnable localRunnable = this.g;
    View localView = this.a;
    View[] arrayOfView = new View[2];
    arrayOfView[0] = this.c;
    arrayOfView[1] = this.b;
    dy.a(localRunnable, localView, arrayOfView);
  }

  public final void a()
  {
    if (this.d == ProgressAndErrorViewManager.State.d)
    {
      this.f = ProgressAndErrorViewManager.State.c;
      return;
    }
    d();
  }

  public final void b()
  {
    if (this.d == ProgressAndErrorViewManager.State.d)
    {
      this.f = ProgressAndErrorViewManager.State.a;
      return;
    }
    e();
  }

  public final void c()
  {
    if (this.d == ProgressAndErrorViewManager.State.d)
    {
      this.f = ProgressAndErrorViewManager.State.b;
      return;
    }
    f();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ProgressAndErrorViewManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
