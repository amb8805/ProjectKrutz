package com.twitter.android;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;

final class cb
  implements Animation.AnimationListener
{
  private Animation a;
  private Animation b;
  private View c;
  private do d;
  private Account e;

  public cb(Context paramContext, View paramView, do paramdo)
  {
    this.a = AnimationUtils.loadAnimation(paramContext, 2130968586);
    this.b = AnimationUtils.loadAnimation(paramContext, 2130968587);
    this.b.setAnimationListener(this);
    this.c = paramView;
    this.d = paramdo;
  }

  public final void a(Account paramAccount)
  {
    this.e = paramAccount;
    this.c.startAnimation(this.b);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.d != null)
      this.d.a_(this.e.name);
    this.c.startAnimation(this.a);
    this.e = null;
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
