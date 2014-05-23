package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

public class LoadingView extends FrameLayout
{
  public static final j a = new LoadingView.1();
  private ProgressBar b;
  private j c = a;
  private int d = getResources().getInteger(2131558411);
  private int e = getResources().getInteger(2131558414);
  private int f = getResources().getInteger(2131558415);
  private int g = getResources().getInteger(2131558413);
  private int h;
  private View i;
  private Animation j;
  private Animation k;
  private LoadingView.State l = LoadingView.State.a;
  private Runnable m = new LoadingView.2(this);
  private Runnable n = new LoadingView.3(this);
  private Runnable o = new LoadingView.4(this);
  private Animation.AnimationListener p = new LoadingView.5(this);

  public LoadingView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public LoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static LoadingView a(LayoutInflater paramLayoutInflater)
  {
    return (LoadingView)paramLayoutInflater.inflate(2130903187, null);
  }

  public static LoadingView a(LayoutInflater paramLayoutInflater, Context paramContext, View paramView)
  {
    LoadingView localLoadingView = (LoadingView)paramLayoutInflater.inflate(2130903187, null);
    localLoadingView.i = paramView;
    localLoadingView.c = new d(paramContext, paramView);
    return localLoadingView;
  }

  public final void a()
  {
    if (this.l == LoadingView.State.a)
    {
      this.l = LoadingView.State.b;
      postDelayed(this.m, this.d);
    }
  }

  public final void a(View paramView)
  {
    this.i = paramView;
  }

  public final void a(j paramj)
  {
    this.c = paramj;
  }

  public final void b()
  {
    post(this.o);
  }

  public final void c()
  {
    removeCallbacks(this.m);
    removeCallbacks(this.n);
    removeCallbacks(this.o);
    setAnimation(null);
    this.b.setAnimation(null);
    if (this.i != null)
      this.i.setAnimation(null);
    setVisibility(8);
    this.b.setVisibility(4);
    this.l = LoadingView.State.a;
  }

  public final boolean d()
  {
    return (this.l == LoadingView.State.b) || (this.l == LoadingView.State.c) || (this.l == LoadingView.State.d);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((ProgressBar)findViewById(2131362406));
  }

  protected boolean onSetAlpha(int paramInt)
  {
    this.h = paramInt;
    return super.onSetAlpha(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.LoadingView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
