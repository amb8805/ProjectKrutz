package com.spotify.mobile.android.ui.view;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class g extends Animation
{
  private View a;
  private ViewGroup.MarginLayoutParams b;
  private int c;
  private int d;

  public g(View paramView, int paramInt, boolean paramBoolean)
  {
    this.a = paramView;
    this.b = ((ViewGroup.MarginLayoutParams)paramView.getLayoutParams());
    if (paramBoolean);
    for (int i = 0; ; i = -paramInt)
    {
      this.c = i;
      int j = 0;
      if (paramBoolean)
        j = -paramInt;
      this.d = j;
      setDuration(400L);
      this.b.topMargin = this.c;
      return;
    }
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    this.b.topMargin = (this.c + (int)(paramFloat * this.d - this.c));
    this.a.requestLayout();
  }

  public final boolean getTransformation(long paramLong, Transformation paramTransformation)
  {
    boolean bool = super.getTransformation(paramLong, paramTransformation);
    if ((!bool) && (hasEnded()))
      this.b.topMargin = 0;
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
