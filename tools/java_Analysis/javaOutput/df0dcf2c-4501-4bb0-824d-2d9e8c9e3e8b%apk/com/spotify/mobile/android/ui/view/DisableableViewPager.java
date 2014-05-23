package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class DisableableViewPager extends ViewPager
{
  private boolean a = true;
  private boolean b = false;

  public DisableableViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public DisableableViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a)
      return super.onInterceptTouchEvent(paramMotionEvent);
    this.b = true;
    return true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.b)
    {
      if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
        this.b = false;
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.a = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.DisableableViewPager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
