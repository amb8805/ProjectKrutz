package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class p
  implements n
{
  p()
  {
  }

  public final Object a(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
      return new OverScroller(paramContext, paramInterpolator);
    return new OverScroller(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((OverScroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final boolean a(Object paramObject)
  {
    return ((OverScroller)paramObject).isFinished();
  }

  public final int b(Object paramObject)
  {
    return ((OverScroller)paramObject).getCurrX();
  }

  public final int c(Object paramObject)
  {
    return ((OverScroller)paramObject).getCurrY();
  }

  public final boolean d(Object paramObject)
  {
    return ((OverScroller)paramObject).computeScrollOffset();
  }

  public final void e(Object paramObject)
  {
    ((OverScroller)paramObject).abortAnimation();
  }

  public final int f(Object paramObject)
  {
    return ((OverScroller)paramObject).getFinalX();
  }

  public final int g(Object paramObject)
  {
    return ((OverScroller)paramObject).getFinalY();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
