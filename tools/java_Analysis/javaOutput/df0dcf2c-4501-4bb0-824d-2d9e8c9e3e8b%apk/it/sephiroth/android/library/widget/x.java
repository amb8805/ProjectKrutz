package it.sephiroth.android.library.widget;

import android.content.Context;
import android.util.FloatMath;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public final class x
{
  private static float f = 8.0F;
  private static float g = 1.0F / b(1.0F);
  private int a;
  private final y b;
  private final y c;
  private Interpolator d = null;
  private final boolean e = true;

  public x(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private x(Context paramContext, byte paramByte)
  {
    this(paramContext, (char)'\000');
  }

  private x(Context paramContext, char paramChar)
  {
    this.b = new y(paramContext);
    this.c = new y(paramContext);
  }

  private static float b(float paramFloat)
  {
    float f1 = paramFloat * f;
    if (f1 < 1.0F);
    for (float f2 = f1 - (1.0F - (float)Math.exp(-f1)); ; f2 = 0.3678795F + 0.6321206F * (1.0F - (float)Math.exp(1.0F - f1)))
      return f2 * g;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.b.a(paramInt1, paramInt2);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = 0;
    this.b.a(paramInt1, paramInt2, paramInt3);
    this.c.a(0, 0, paramInt3);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int j;
    if ((this.e) && (!a()))
    {
      float f1 = y.c(this.b);
      float f2 = y.c(this.c);
      if ((Math.signum(paramInt2) == Math.signum(f1)) && (Math.signum(0.0F) == Math.signum(f2)))
      {
        j = (int)(f1 + paramInt2);
        paramInt3 = (int)(0.0F + f2);
      }
    }
    for (int i = j; ; i = paramInt2)
    {
      this.a = 1;
      this.b.a(paramInt1, i, paramInt4, 2147483647, paramInt6);
      this.c.a(0, paramInt3, 0, paramInt5, 0);
      return;
    }
  }

  final void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }

  public final boolean a()
  {
    return (y.a(this.b)) && (y.a(this.c));
  }

  public final boolean a(float paramFloat)
  {
    int i = y.e(this.b) - y.d(this.b);
    int j = y.e(this.c) - y.d(this.c);
    return (!a()) && (Math.signum(paramFloat) == Math.signum(i)) && (Math.signum(0.0F) == Math.signum(j));
  }

  public final boolean a(int paramInt)
  {
    this.a = 1;
    boolean bool1 = this.b.a(paramInt);
    boolean bool2 = this.c.a(0);
    boolean bool3;
    if (!bool1)
    {
      bool3 = false;
      if (!bool2);
    }
    else
    {
      bool3 = true;
    }
    return bool3;
  }

  public final int b()
  {
    return y.b(this.b);
  }

  public final float c()
  {
    return FloatMath.sqrt(y.c(this.b) * y.c(this.b) + y.c(this.c) * y.c(this.c));
  }

  public final boolean d()
  {
    if (a())
      return false;
    switch (this.a)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return true;
      long l = AnimationUtils.currentAnimationTimeMillis() - y.g(this.b);
      int i = y.f(this.b);
      if (l < i)
      {
        float f1 = (float)l / i;
        if (this.d == null);
        for (float f2 = b(f1); ; f2 = this.d.getInterpolation(f1))
        {
          this.b.a(f2);
          this.c.a(f2);
          break;
        }
      }
      e();
      continue;
      if ((!y.a(this.b)) && (!this.b.c()) && (!this.b.b()))
        this.b.a();
      if ((!y.a(this.c)) && (!this.c.c()) && (!this.c.b()))
        this.c.a();
    }
  }

  public final void e()
  {
    this.b.a();
    this.c.a();
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
