package it.sephiroth.android.library.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public final class s
{
  private final int A;
  private final int B;
  private final int C;
  private final int D;
  private final int a;
  private final Drawable b;
  private final Drawable c;
  private int d;
  private int e;
  private int f;
  private int g;
  private final int h;
  private float i;
  private float j;
  private float k;
  private float l;
  private float m;
  private float n;
  private float o;
  private float p;
  private float q;
  private float r;
  private float s;
  private float t;
  private long u;
  private float v;
  private final Interpolator w;
  private int x = 0;
  private float y;
  private final Rect z = new Rect();

  public s(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i1 = localResources.getIdentifier("hlv_overscroll_edge", "drawable", paramContext.getPackageName());
    if (i1 > 0)
    {
      this.b = localResources.getDrawable(i1);
      int i2 = localResources.getIdentifier("hlv_overscroll_glow", "drawable", paramContext.getPackageName());
      if (i2 > 0)
      {
        this.c = localResources.getDrawable(i2);
        this.a = 1;
        this.A = this.b.getIntrinsicHeight();
        this.B = this.c.getIntrinsicHeight();
        this.C = this.c.getIntrinsicWidth();
        this.D = (int)(0.5F + Math.min(0.6F * (4.0F * this.B * this.B / this.C), 4.0F * this.B));
        this.h = (int)(0.5F + 300.0F * localResources.getDisplayMetrics().density);
        this.w = new DecelerateInterpolator();
      }
    }
    else
    {
      throw new IllegalStateException("Cannot find resource 'hlv_overscroll_edge'");
    }
    throw new IllegalStateException("Cannot find resource 'hlv_overscroll_glow'");
  }

  public final Rect a(boolean paramBoolean)
  {
    this.z.set(0, 0, this.d, this.D);
    Rect localRect = this.z;
    int i1 = this.f;
    int i2 = this.g;
    int i3 = 0;
    if (paramBoolean)
      i3 = this.D;
    localRect.offset(i1, i2 - i3);
    return this.z;
  }

  public final void a(float paramFloat)
  {
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    if ((this.x == 4) && ((float)(l1 - this.u) < this.v))
      return;
    if (this.x != 1)
      this.l = 1.0F;
    this.x = 1;
    this.u = l1;
    this.v = 167.0F;
    this.y = (paramFloat + this.y);
    float f1 = Math.abs(this.y);
    float f2 = Math.max(0.6F, Math.min(f1, 1.0F));
    this.m = f2;
    this.i = f2;
    float f3 = Math.max(0.5F, Math.min(f1 * 7.0F, 1.0F));
    this.o = f3;
    this.j = f3;
    float f4 = Math.min(1.0F, this.k + 1.1F * Math.abs(paramFloat));
    this.q = f4;
    this.k = f4;
    float f5 = Math.abs(paramFloat);
    if ((paramFloat > 0.0F) && (this.y < 0.0F))
      f5 = -f5;
    if (this.y == 0.0F)
      this.l = 0.0F;
    float f6 = Math.min(4.0F, Math.max(0.0F, this.l + f5 * 7.0F));
    this.s = f6;
    this.l = f6;
    this.n = this.i;
    this.p = this.j;
    this.r = this.k;
    this.t = this.l;
  }

  public final void a(int paramInt)
  {
    this.x = 2;
    int i1 = Math.max(100, Math.abs(paramInt));
    this.u = AnimationUtils.currentAnimationTimeMillis();
    this.v = (0.1F + 0.03F * i1);
    this.m = 0.0F;
    this.o = 0.0F;
    this.j = 0.0F;
    this.q = 0.5F;
    this.s = 0.0F;
    this.n = Math.max(0, Math.min(i1 * 8, 1));
    this.p = Math.max(0.5F, Math.min(i1 * 8, 1.0F));
    this.t = Math.min(0.025F + 0.00015F * i1 * (i1 / 100), 1.75F);
    this.r = Math.max(this.q, Math.min(1.0E-05F * i1 * 16, 1.0F));
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.e = paramInt2;
  }

  public final boolean a()
  {
    return this.x == 0;
  }

  public final boolean a(Canvas paramCanvas)
  {
    float f1 = Math.min((float)(AnimationUtils.currentAnimationTimeMillis() - this.u) / this.v, 1.0F);
    float f2 = this.w.getInterpolation(f1);
    this.i = (this.m + f2 * (this.n - this.m));
    this.j = (this.o + f2 * (this.p - this.o));
    this.k = (this.q + f2 * (this.r - this.q));
    this.l = (this.s + f2 * (this.t - this.s));
    if (f1 >= 0.999F)
      switch (this.x)
      {
      default:
      case 2:
      case 1:
      case 4:
      case 3:
      }
    while (true)
    {
      this.c.setAlpha((int)(255.0F * Math.max(0.0F, Math.min(this.k, 1.0F))));
      int i1 = (int)Math.min(0.6F * (this.B * this.l * this.B / this.C), 4.0F * this.B);
      this.c.setBounds(0, 0, this.d, i1);
      this.c.draw(paramCanvas);
      this.b.setAlpha((int)(255.0F * Math.max(0.0F, Math.min(this.i, 1.0F))));
      int i2 = (int)(this.A * this.j);
      this.b.setBounds(0, 0, this.d, i2);
      this.b.draw(paramCanvas);
      if ((this.x == 3) && (i1 == 0) && (i2 == 0))
        this.x = 0;
      if (this.x == 0)
        break;
      return true;
      this.x = 3;
      this.u = AnimationUtils.currentAnimationTimeMillis();
      this.v = 1000.0F;
      this.m = this.i;
      this.o = this.j;
      this.q = this.k;
      this.s = this.l;
      this.n = 0.0F;
      this.p = 0.0F;
      this.r = 0.0F;
      this.t = 0.0F;
      continue;
      this.x = 4;
      this.u = AnimationUtils.currentAnimationTimeMillis();
      this.v = 1000.0F;
      this.m = this.i;
      this.o = this.j;
      this.q = this.k;
      this.s = this.l;
      this.n = 0.0F;
      this.p = 0.0F;
      this.r = 0.0F;
      this.t = 0.0F;
      continue;
      if (this.t != 0.0F);
      for (float f3 = 1.0F / (this.t * this.t); ; f3 = 3.4028235E+38F)
      {
        this.j = (this.o + f3 * (f2 * (this.p - this.o)));
        this.x = 3;
        break;
      }
      this.x = 0;
    }
    return false;
  }

  public final void b()
  {
    this.x = 0;
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramInt2;
  }

  public final void c()
  {
    this.y = 0.0F;
    if ((this.x != 1) && (this.x != 4))
      return;
    this.x = 3;
    this.m = this.i;
    this.o = this.j;
    this.q = this.k;
    this.s = this.l;
    this.n = 0.0F;
    this.p = 0.0F;
    this.r = 0.0F;
    this.t = 0.0F;
    this.u = AnimationUtils.currentAnimationTimeMillis();
    this.v = 1000.0F;
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
