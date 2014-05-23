package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

final class j
  implements k
{
  j()
  {
  }

  public final Object a(Context paramContext)
  {
    return new EdgeEffect(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2)
  {
    ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
  }

  public final boolean a(Object paramObject)
  {
    return ((EdgeEffect)paramObject).isFinished();
  }

  public final boolean a(Object paramObject, float paramFloat)
  {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }

  public final boolean a(Object paramObject, Canvas paramCanvas)
  {
    return ((EdgeEffect)paramObject).draw(paramCanvas);
  }

  public final void b(Object paramObject)
  {
    ((EdgeEffect)paramObject).finish();
  }

  public final boolean c(Object paramObject)
  {
    EdgeEffect localEdgeEffect = (EdgeEffect)paramObject;
    localEdgeEffect.onRelease();
    return localEdgeEffect.isFinished();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
