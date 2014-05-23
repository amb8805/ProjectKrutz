package com.twitter.android;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class x
  implements Animation.AnimationListener
{
  x(StartActivity paramStartActivity)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.h.setImageResource(this.a.a());
    this.a.h.startAnimation(this.a.f);
    this.a.g.startAnimation(this.a.e);
    this.a.c = System.currentTimeMillis();
    this.a.a.postDelayed(this.a.b, 9000L);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
