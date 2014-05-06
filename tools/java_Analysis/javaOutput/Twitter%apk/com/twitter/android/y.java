package com.twitter.android;

import android.widget.ImageView;

final class y
  implements Runnable
{
  y(StartActivity paramStartActivity)
  {
  }

  public final void run()
  {
    if (this.a.g.getVisibility() == 4)
      this.a.g.setVisibility(0);
    this.a.g.startAnimation(this.a.d);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
