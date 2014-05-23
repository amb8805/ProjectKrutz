package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class az extends ay
{
  az()
  {
  }

  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public final void b(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public final int c(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }

  public final void d(View paramView)
  {
    paramView.setImportantForAccessibility(1);
  }

  public final ViewParent g(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.az
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
