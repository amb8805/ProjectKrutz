package android.support.v7.internal.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

final class w
  implements View.OnTouchListener
{
  private w(ListPopupWindow paramListPopupWindow)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (ListPopupWindow.b(this.a) != null) && (ListPopupWindow.b(this.a).isShowing()) && (j >= 0) && (j < ListPopupWindow.b(this.a).getWidth()) && (k >= 0) && (k < ListPopupWindow.b(this.a).getHeight()))
      ListPopupWindow.d(this.a).postDelayed(ListPopupWindow.c(this.a), 250L);
    while (true)
    {
      return false;
      if (i == 1)
        ListPopupWindow.d(this.a).removeCallbacks(ListPopupWindow.c(this.a));
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
