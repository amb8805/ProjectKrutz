package com.spotify.mobile.android.util;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;

public final class bq extends Animation
  implements Animation.AnimationListener
{
  private View a;
  private ViewGroup.MarginLayoutParams b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;

  public bq(View paramView)
  {
    setDuration(200L);
    this.a = paramView;
    this.b = ((ViewGroup.MarginLayoutParams)paramView.getLayoutParams());
    int k = this.b.leftMargin;
    this.g = k;
    this.c = k;
    int m = this.b.topMargin;
    this.h = m;
    this.d = m;
    int n = this.b.rightMargin;
    this.i = n;
    this.e = n;
    int i1 = this.b.bottomMargin;
    this.j = i1;
    this.f = i1;
    setAnimationListener(this);
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    super.applyTransformation(paramFloat, paramTransformation);
    int k = this.c + (int)(paramFloat * this.g - this.c);
    int m = this.d + (int)(paramFloat * this.h - this.d);
    int n = this.e + (int)(paramFloat * this.i - this.e);
    int i1 = this.f + (int)(paramFloat * this.j - this.f);
    this.b.leftMargin = k;
    this.b.topMargin = m;
    this.b.rightMargin = n;
    this.b.bottomMargin = i1;
    this.a.requestLayout();
  }

  public final void b(int paramInt)
  {
    this.j = paramInt;
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.b.leftMargin = this.g;
    this.b.topMargin = this.h;
    this.b.rightMargin = this.i;
    this.b.bottomMargin = this.j;
    this.a.requestLayout();
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }

  public final boolean willChangeBounds()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
