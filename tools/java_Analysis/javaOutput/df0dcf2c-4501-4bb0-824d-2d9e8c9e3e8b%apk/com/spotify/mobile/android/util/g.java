package com.spotify.mobile.android.util;

import android.view.View;
import android.view.animation.Animation;
import java.util.LinkedList;

public final class g
{
  LinkedList<e> a = new LinkedList();

  public g()
  {
  }

  private void a()
  {
    e locale = (e)this.a.element();
    locale.a.setVisibility(0);
    locale.a.startAnimation(locale.b);
    locale.b.setAnimationListener(new g.1(this, locale));
  }

  public final void a(View paramView, Animation paramAnimation, boolean paramBoolean)
  {
    this.a.add(new e(paramView, paramAnimation, paramBoolean));
    if (this.a.size() == 1)
      a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
