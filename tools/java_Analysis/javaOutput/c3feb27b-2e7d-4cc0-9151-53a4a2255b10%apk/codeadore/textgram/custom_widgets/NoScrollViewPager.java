package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import codeadore.textgram.StylingActivity;
import codeadore.textgram.SuperSurface;

public class NoScrollViewPager extends ViewPager3D
{
  int childId;
  private boolean scrollDisable = true;

  public NoScrollViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void disableScroll()
  {
    this.scrollDisable = true;
  }

  public void enableScroll()
  {
    this.scrollDisable = false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      if (StylingActivity.superSurface != null)
        StylingActivity.superSurface.clearSelection();
      if (this.scrollDisable)
        return false;
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.custom_widgets.NoScrollViewPager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
