package com.twitter.android;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ListView;

final class bm extends GestureDetector.SimpleOnGestureListener
{
  bm(TweetListFragment paramTweetListFragment, int paramInt1, int paramInt2, ListView paramListView, int paramInt3, Animation paramAnimation1, Animation paramAnimation2, Animation paramAnimation3, Animation paramAnimation4)
  {
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null))
      return false;
    int j = (int)paramMotionEvent1.getY();
    if ((Math.abs(j - (int)paramMotionEvent2.getY()) < this.a) && (Math.abs(paramFloat1) > this.b))
    {
      int k = (int)paramMotionEvent1.getX();
      int m = (int)paramMotionEvent2.getX();
      int n = this.c.pointToPosition(k, j);
      int i1 = n - this.c.getFirstVisiblePosition();
      View localView = this.c.getChildAt(i1);
      if ((localView != null) && ((localView.getTag() instanceof ct)))
      {
        ct localct = (ct)localView.getTag();
        if (localct != null)
        {
          if (k - m > this.d)
            return this.i.a(localct, this.e, this.f, n, paramMotionEvent1);
          if (m - k > this.d)
            return this.i.a(localct, this.g, this.h, n, paramMotionEvent1);
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
