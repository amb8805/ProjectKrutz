package com.spotify.android.paste.widget;

import android.view.animation.DecelerateInterpolator;

final class n extends DecelerateInterpolator
{
  private boolean a;

  private n()
  {
  }

  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public final float getInterpolation(float paramFloat)
  {
    float f = super.getInterpolation(paramFloat);
    if (this.a)
      f = 1.0F - f;
    return f;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
