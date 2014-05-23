package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public final class cp
{
  private static final float w = (float)(Math.log(0.75D) / Math.log(0.9D));
  private static final float[] x = { 0.0F, 0.02F, 0.05F, 0.07F, 0.1F, 0.12F, 0.15F, 0.17F, 0.19F, 0.22F, 0.24F, 0.26F, 0.28F, 0.31F, 0.33F, 0.35F, 0.37F, 0.39F, 0.41F, 0.43F, 0.45F, 0.47F, 0.49F, 0.51F, 0.53F, 0.55F, 0.56F, 0.58F, 0.6F, 0.61F, 0.63F, 0.65F, 0.66F, 0.68F, 0.69F, 0.71F, 0.72F, 0.73F, 0.75F, 0.76F, 0.77F, 0.78F, 0.8F, 0.81F, 0.82F, 0.83F, 0.84F, 0.85F, 0.86F, 0.87F, 0.88F, 0.88F, 0.89F, 0.9F, 0.91F, 0.91F, 0.92F, 0.92F, 0.93F, 0.94F, 0.94F, 0.95F, 0.95F, 0.95F, 0.96F, 0.96F, 0.97F, 0.97F, 0.97F, 0.97F, 0.98F, 0.98F, 0.98F, 0.98F, 0.99F, 0.99F, 0.99F, 0.99F, 0.99F, 0.99F, 0.99F, 0.99F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F };
  private static float y = 8.0F;
  private static float z = 1.0F / a(1.0F);
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private long l;
  private int m;
  private float n;
  private float o;
  private float p;
  private boolean q = true;
  private Interpolator r = null;
  private boolean s;
  private float t;
  private float u;
  private final float v;

  public cp(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private cp(Context paramContext, byte paramByte)
  {
  }

  private cp(Context paramContext, boolean paramBoolean)
  {
    this.v = (160.0F * paramContext.getResources().getDisplayMetrics().density);
    this.u = (ViewConfiguration.getScrollFriction() * (386.0878F * this.v));
    this.s = paramBoolean;
  }

  private static float a(float paramFloat)
  {
    float f1 = paramFloat * y;
    if (f1 < 1.0F);
    for (float f2 = f1 - (1.0F - (float)Math.exp(-f1)); ; f2 = 0.3678795F + 0.6321206F * (1.0F - (float)Math.exp(1.0F - f1)))
      return f2 * z;
  }

  private int f()
  {
    return (int)(AnimationUtils.currentAnimationTimeMillis() - this.l);
  }

  public final void a(int paramInt)
  {
    this.m = (paramInt + f());
    this.n = (1.0F / this.m);
    this.q = false;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.s) && (!this.q))
    {
      float f4 = this.t - this.u * f() / 2000.0F;
      float f5 = this.d - this.b;
      float f6 = this.e - this.c;
      float f7 = (float)Math.sqrt(f5 * f5 + f6 * f6);
      float f8 = f5 / f7;
      float f9 = f6 / f7;
      float f10 = f8 * f4;
      float f11 = f4 * f9;
      if ((Math.signum(0.0F) == Math.signum(f10)) && (Math.signum(0.0F) == Math.signum(f11)))
      {
        paramInt2 = (int)(f10 + 0.0F);
        paramInt3 = (int)(f11 + 0.0F);
      }
    }
    this.a = 1;
    this.q = false;
    float f1 = (float)Math.sqrt(paramInt2 * paramInt2 + paramInt3 * paramInt3);
    this.t = f1;
    double d1 = Math.log(0.4F * f1 / 800.0F);
    this.m = (int)(1000.0D * Math.exp(d1 / (w - 1.0D)));
    this.l = AnimationUtils.currentAnimationTimeMillis();
    this.b = paramInt1;
    this.c = 0;
    float f2;
    if (f1 == 0.0F)
    {
      f2 = 1.0F;
      if (f1 != 0.0F)
        break label390;
    }
    label390: for (float f3 = 1.0F; ; f3 = paramInt3 / f1)
    {
      int i1 = (int)(800.0D * Math.exp(d1 * (w / (w - 1.0D))));
      this.f = 0;
      this.g = paramInt4;
      this.h = 0;
      this.i = 0;
      this.d = (paramInt1 + Math.round(f2 * i1));
      this.d = Math.min(this.d, this.g);
      this.d = Math.max(this.d, this.f);
      this.e = (0 + Math.round(f3 * i1));
      this.e = Math.min(this.e, this.i);
      this.e = Math.max(this.e, this.h);
      return;
      f2 = paramInt2 / f1;
      break;
    }
  }

  public final boolean a()
  {
    return this.q;
  }

  public final void b()
  {
    this.q = true;
  }

  public final void b(int paramInt)
  {
    this.d = paramInt;
    this.o = this.d - this.b;
    this.q = false;
  }

  public final int c()
  {
    return this.j;
  }

  public final boolean d()
  {
    if (this.q)
      return false;
    int i1 = (int)(AnimationUtils.currentAnimationTimeMillis() - this.l);
    if (i1 < this.m)
      switch (this.a)
      {
      default:
      case 0:
      case 1:
      }
    while (true)
    {
      return true;
      float f7 = i1 * this.n;
      if (this.r == null);
      for (float f8 = a(f7); ; f8 = this.r.getInterpolation(f7))
      {
        this.j = (this.b + Math.round(f8 * this.o));
        this.k = (this.c + Math.round(f8 * this.p));
        break;
      }
      float f1 = i1 / this.m;
      int i2 = (int)(100.0F * f1);
      float f2 = i2 / 100.0F;
      float f3 = i2 + 1 / 100.0F;
      float f4 = x[i2];
      float f5 = x[(i2 + 1)];
      float f6 = f4 + (f1 - f2) / (f3 - f2) * (f5 - f4);
      this.j = (this.b + Math.round(f6 * this.d - this.b));
      this.j = Math.min(this.j, this.g);
      this.j = Math.max(this.j, this.f);
      this.k = (this.c + Math.round(f6 * this.e - this.c));
      this.k = Math.min(this.k, this.i);
      this.k = Math.max(this.k, this.h);
      if ((this.j == this.d) && (this.k == this.e))
      {
        this.q = true;
        continue;
        this.j = this.d;
        this.k = this.e;
        this.q = true;
      }
    }
  }

  public final void e()
  {
    this.j = this.d;
    this.k = this.e;
    this.q = true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
