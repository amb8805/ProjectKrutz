package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

final class o
  implements n
{
  o()
  {
  }

  public final Object a(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
      return new Scroller(paramContext, paramInterpolator);
    return new Scroller(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((Scroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final boolean a(Object paramObject)
  {
    return ((Scroller)paramObject).isFinished();
  }

  public final int b(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrX();
  }

  public final int c(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrY();
  }

  public final boolean d(Object paramObject)
  {
    return ((Scroller)paramObject).computeScrollOffset();
  }

  public final void e(Object paramObject)
  {
    ((Scroller)paramObject).abortAnimation();
  }

  public final int f(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalX();
  }

  public final int g(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalY();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
