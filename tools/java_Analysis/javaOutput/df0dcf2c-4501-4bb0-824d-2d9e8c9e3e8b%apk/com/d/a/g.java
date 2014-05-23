package com.d.a;

import android.view.animation.Interpolator;

public abstract class g
  implements Cloneable
{
  float a;
  Class b;
  boolean c = false;
  private Interpolator d = null;

  public g()
  {
  }

  public static g a(float paramFloat1, float paramFloat2)
  {
    return new h(paramFloat1, paramFloat2);
  }

  public abstract Object a();

  public final void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }

  public abstract void a(Object paramObject);

  public final Interpolator b()
  {
    return this.d;
  }

  public abstract g c();
}

/* Location:
 * Qualified Name:     com.d.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
