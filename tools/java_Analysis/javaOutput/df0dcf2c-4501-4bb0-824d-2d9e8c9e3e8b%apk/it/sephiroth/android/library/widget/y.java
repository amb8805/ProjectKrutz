package it.sephiroth.android.library.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

final class y
{
  private static float p;
  private static final float[] q;
  private static final float[] r;
  private int a;
  private int b;
  private int c;
  private int d;
  private float e;
  private float f;
  private long g;
  private int h;
  private int i;
  private int j;
  private boolean k = true;
  private int l;
  private float m = ViewConfiguration.getScrollFriction();
  private int n = 0;
  private float o;

  static
  {
    float f1 = 0.0F;
    p = (float)(Math.log(0.78D) / Math.log(0.9D));
    q = new float[101];
    r = new float[101];
    int i1 = 0;
    float f5;
    for (float f2 = 0.0F; i1 < 100; f2 = f5)
    {
      float f3 = i1 / 100.0F;
      float f4 = 1.0F;
      f5 = f2;
      float f6;
      float f7;
      while (true)
      {
        f6 = f5 + (f4 - f5) / 2.0F;
        f7 = 3.0F * f6 * (1.0F - f6);
        float f8 = f7 * (0.175F * (1.0F - f6) + 0.35F * f6) + f6 * (f6 * f6);
        if (Math.abs(f8 - f3) < 1.E-05D)
          break;
        if (f8 > f3)
          f4 = f6;
        else
          f5 = f6;
      }
      q[i1] = (f7 * (f6 + 0.5F * (1.0F - f6)) + f6 * (f6 * f6));
      float f9 = 1.0F;
      float f10;
      float f11;
      while (true)
      {
        f10 = f1 + (f9 - f1) / 2.0F;
        f11 = 3.0F * f10 * (1.0F - f10);
        float f12 = f11 * (f10 + 0.5F * (1.0F - f10)) + f10 * (f10 * f10);
        if (Math.abs(f12 - f3) < 1.E-05D)
          break;
        if (f12 > f3)
          f9 = f10;
        else
          f1 = f10;
      }
      r[i1] = (f11 * (0.175F * (1.0F - f10) + 0.35F * f10) + f10 * (f10 * f10));
      i1++;
    }
    float[] arrayOfFloat = q;
    r[100] = 1.0F;
    arrayOfFloat[100] = 1.0F;
  }

  y(Context paramContext)
  {
    this.o = (0.84F * (386.0878F * (160.0F * paramContext.getResources().getDisplayMetrics().density)));
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = true;
    if ((paramInt1 > paramInt2) && (paramInt1 < paramInt3))
    {
      Log.e("OverScroller", "startAfterEdge called from a valid position");
      this.k = bool;
      return;
    }
    int i1;
    int i2;
    label45: int i3;
    if (paramInt1 > paramInt3)
    {
      i1 = bool;
      if (i1 == 0)
        break label189;
      i2 = paramInt3;
      i3 = paramInt1 - i2;
      if (i3 * paramInt4 < 0)
        break label195;
      label59: if (!bool)
        break label208;
      if (paramInt4 != 0)
        break label201;
    }
    label189: label195: label201: for (int i6 = paramInt1 - i2; ; i6 = paramInt4)
    {
      this.f = b(i6);
      float f1 = -paramInt4 / this.f;
      float f2 = (float)Math.sqrt(2.0D * paramInt4 * paramInt4 / 2.0F / Math.abs(this.f) + Math.abs(i2 - paramInt1) / Math.abs(this.f));
      this.g -= (int)(1000.0F * (f2 - f1));
      this.a = i2;
      this.d = (int)(f2 * -this.f);
      d();
      return;
      i1 = 0;
      break;
      i2 = paramInt2;
      break label45;
      bool = false;
      break label59;
    }
    label208: if (d(paramInt4) > Math.abs(i3))
    {
      int i4;
      if (i1 != 0)
      {
        i4 = paramInt2;
        if (i1 == 0)
          break label262;
      }
      for (int i5 = paramInt1; ; i5 = paramInt3)
      {
        a(paramInt1, paramInt4, i4, i5, this.l);
        return;
        i4 = paramInt1;
        break;
      }
    }
    label262: b(paramInt1, i2);
  }

  private static float b(int paramInt)
  {
    if (paramInt > 0)
      return -2000.0F;
    return 2000.0F;
  }

  private void b(int paramInt1, int paramInt2)
  {
    this.k = false;
    this.n = 1;
    this.a = paramInt1;
    this.c = paramInt2;
    int i1 = paramInt1 - paramInt2;
    this.f = b(i1);
    this.d = (-i1);
    this.l = Math.abs(i1);
    this.h = (int)(1000.0D * Math.sqrt(-2.0D * i1 / this.f));
  }

  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt2 - paramInt1;
    float f1 = Math.abs(paramInt3 - paramInt1 / i1);
    int i2 = (int)(100.0F * f1);
    if (i2 < 100)
    {
      float f2 = i2 / 100.0F;
      float f3 = i2 + 1 / 100.0F;
      float f4 = r[i2];
      float f5 = r[(i2 + 1)];
      this.h = (int)((f4 + (f1 - f2) / (f3 - f2) * (f5 - f4)) * this.h);
    }
  }

  private double c(int paramInt)
  {
    return Math.log(0.35F * Math.abs(paramInt) / (this.m * this.o));
  }

  private double d(int paramInt)
  {
    double d1 = c(paramInt);
    double d2 = p - 1.0D;
    return this.m * this.o * Math.exp(d1 * (p / d2));
  }

  private void d()
  {
    float f1 = this.d * this.d / (2.0F * Math.abs(this.f));
    float f2 = Math.signum(this.d);
    if (f1 > this.l)
    {
      this.f = (-f2 * this.d * this.d / (2.0F * this.l));
      f1 = this.l;
    }
    this.l = (int)f1;
    this.n = 2;
    int i1 = this.a;
    if (this.d > 0);
    while (true)
    {
      this.c = (i1 + (int)f1);
      this.h = (-(int)(1000.0F * this.d / this.f));
      return;
      f1 = -f1;
    }
  }

  final void a()
  {
    this.b = this.c;
    this.k = true;
  }

  final void a(float paramFloat)
  {
    this.b = (this.a + Math.round(paramFloat * this.c - this.a));
  }

  final void a(int paramInt1, int paramInt2)
  {
    if (this.n == 0)
    {
      this.l = paramInt2;
      this.g = AnimationUtils.currentAnimationTimeMillis();
      a(paramInt1, 0, 0, (int)this.e);
    }
  }

  final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.k = false;
    this.a = paramInt1;
    this.c = (paramInt1 + paramInt2);
    this.g = AnimationUtils.currentAnimationTimeMillis();
    this.h = paramInt3;
    this.f = 0.0F;
    this.d = 0;
  }

  final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.l = paramInt5;
    this.k = false;
    this.d = paramInt2;
    this.e = paramInt2;
    this.i = 0;
    this.h = 0;
    this.g = AnimationUtils.currentAnimationTimeMillis();
    this.a = paramInt1;
    this.b = paramInt1;
    if ((paramInt1 > paramInt4) || (paramInt1 < paramInt3))
      a(paramInt1, paramInt3, paramInt4, paramInt2);
    do
    {
      return;
      this.n = 0;
      double d1 = 0.0D;
      if (paramInt2 != 0)
      {
        int i1 = (int)(1000.0D * Math.exp(c(paramInt2) / (p - 1.0D)));
        this.i = i1;
        this.h = i1;
        d1 = d(paramInt2);
      }
      this.j = (int)(d1 * Math.signum(paramInt2));
      this.c = (paramInt1 + this.j);
      if (this.c < paramInt3)
      {
        b(this.a, this.c, paramInt3);
        this.c = paramInt3;
      }
    }
    while (this.c <= paramInt4);
    b(this.a, this.c, paramInt4);
    this.c = paramInt4;
  }

  final boolean a(int paramInt)
  {
    this.k = true;
    this.c = paramInt;
    this.a = paramInt;
    this.d = 0;
    this.g = AnimationUtils.currentAnimationTimeMillis();
    this.h = 0;
    if (paramInt < 0)
      b(paramInt, 0);
    while (!this.k)
    {
      return true;
      if (paramInt > 0)
        b(paramInt, 0);
    }
    return false;
  }

  final boolean b()
  {
    int i1 = this.n;
    boolean bool = false;
    switch (i1)
    {
    default:
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      c();
      bool = true;
      int i2;
      int i3;
      do
      {
        return bool;
        i2 = this.h;
        i3 = this.i;
        bool = false;
      }
      while (i2 >= i3);
      this.a = this.c;
      this.d = (int)this.e;
      this.f = b(this.d);
      this.g += this.h;
      d();
      continue;
      this.g += this.h;
      b(this.c, this.a);
    }
  }

  final boolean c()
  {
    long l1 = AnimationUtils.currentAnimationTimeMillis() - this.g;
    if (l1 > this.h)
      return false;
    double d1 = 0.0D;
    switch (this.n)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      this.b = (this.a + (int)Math.round(d1));
      return true;
      float f5 = (float)l1 / this.i;
      int i1 = (int)(100.0F * f5);
      float f6 = 1.0F;
      float f7 = 0.0F;
      if (i1 < 100)
      {
        float f8 = i1 / 100.0F;
        float f9 = i1 + 1 / 100.0F;
        float f10 = q[i1];
        f7 = (q[(i1 + 1)] - f10) / (f9 - f8);
        f6 = f10 + f7 * (f5 - f8);
      }
      double d2 = f6 * this.j;
      this.e = (1000.0F * (f7 * this.j / this.i));
      d1 = d2;
      continue;
      float f4 = (float)l1 / 1000.0F;
      this.e = (this.d + f4 * this.f);
      d1 = f4 * this.d + f4 * (f4 * this.f) / 2.0F;
      continue;
      float f1 = (float)l1 / this.h;
      float f2 = f1 * f1;
      float f3 = Math.signum(this.d);
      d1 = f3 * this.l * (3.0F * f2 - f2 * (2.0F * f1));
      this.e = (6.0F * (f3 * this.l) * (f2 + -f1));
    }
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
