package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;

public class StickyHeaderView extends LinearLayout
{
  private ListView a;
  private ViewGroup b;
  private ViewGroup c;
  private View d;
  private FrameLayout e;
  private FrameLayout.LayoutParams f;
  private int g = -1;
  private boolean h;
  private boolean i;
  private boolean j;
  private AbsListView.OnScrollListener k;
  private Runnable l = new StickyHeaderView.2(this);
  private Runnable m = new StickyHeaderView.3(this);
  private AbsListView.OnScrollListener n = new StickyHeaderView.4(this);

  public StickyHeaderView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public StickyHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    this.b = new StickyHeaderView.1(this, paramContext);
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, -2);
    this.b.setLayoutParams(localLayoutParams);
    this.e = new FrameLayout(paramContext);
    this.f = new FrameLayout.LayoutParams(0, 0);
    this.e.setLayoutParams(this.f);
  }

  private void b(boolean paramBoolean)
  {
    if (this.j != paramBoolean)
    {
      this.j = paramBoolean;
      if (!paramBoolean)
        break label59;
      this.b.removeView(this);
      this.b.addView(this.e);
      this.c.addView(this);
    }
    while (true)
    {
      a(paramBoolean);
      post(this.m);
      return;
      label59: this.b.removeView(this.e);
      this.c.removeView(this);
      this.b.addView(this);
    }
  }

  public final void a(ListView paramListView, ViewGroup paramViewGroup)
  {
    this.a = paramListView;
    this.c = paramViewGroup;
    this.b.addView(this);
    this.h = true;
  }

  protected void a(boolean paramBoolean)
  {
  }

  public final ViewGroup c()
  {
    return this.b;
  }

  public final void c(boolean paramBoolean)
  {
    if (!this.h)
      return;
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      if (!paramBoolean)
        b(false);
    }
    ListView localListView = this.a;
    if (paramBoolean);
    for (AbsListView.OnScrollListener localOnScrollListener = this.n; ; localOnScrollListener = this.k)
    {
      localListView.setOnScrollListener(localOnScrollListener);
      return;
    }
  }

  public final boolean d()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = findViewById(2131362447);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    post(this.l);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.StickyHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
