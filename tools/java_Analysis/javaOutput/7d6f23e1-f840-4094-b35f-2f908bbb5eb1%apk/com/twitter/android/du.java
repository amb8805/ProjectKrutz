package com.twitter.android;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class du
  implements Animation.AnimationListener
{
  final int a;
  final Animation b;
  final Animation c;
  final View d;
  final View e;

  du(TweetListFragment paramTweetListFragment, View paramView1, View paramView2, Animation paramAnimation1, Animation paramAnimation2, int paramInt)
  {
    this.d = paramView1;
    this.e = paramView2;
    this.c = paramAnimation1;
    this.b = paramAnimation2;
    this.a = paramInt;
  }

  final void a()
  {
    this.f.g(3);
    this.e.setVisibility(0);
    this.d.startAnimation(this.c);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.e.setVisibility(4);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.du
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
