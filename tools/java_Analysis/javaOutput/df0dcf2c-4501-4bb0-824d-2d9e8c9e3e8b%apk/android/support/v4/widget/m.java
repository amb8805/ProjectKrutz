package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class m
{
  static final n b = new o();
  Object a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      b = new q();
      return;
    }
    if (i >= 9)
    {
      b = new p();
      return;
    }
  }

  private m(Context paramContext, Interpolator paramInterpolator)
  {
    this.a = b.a(paramContext, paramInterpolator);
  }

  public static m a(Context paramContext, Interpolator paramInterpolator)
  {
    return new m(paramContext, paramInterpolator);
  }

  public final int a()
  {
    return b.b(this.a);
  }

  public final int b()
  {
    return b.c(this.a);
  }

  public final void c()
  {
    b.e(this.a);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
