package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ad;
import android.support.v4.view.ap;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class z
{
  private static final Interpolator v = new z.1();
  private int a;
  private int b;
  private int c = -1;
  private float[] d;
  private float[] e;
  private float[] f;
  private float[] g;
  private int[] h;
  private int[] i;
  private int[] j;
  private int k;
  private VelocityTracker l;
  private float m;
  private float n;
  private int o;
  private int p;
  private m q;
  private final aa r;
  private View s;
  private boolean t;
  private final ViewGroup u;
  private final Runnable w = new z.2(this);

  private z(Context paramContext, ViewGroup paramViewGroup, aa paramaa)
  {
    if (paramViewGroup == null)
      throw new IllegalArgumentException("Parent view may not be null");
    if (paramaa == null)
      throw new IllegalArgumentException("Callback may not be null");
    this.u = paramViewGroup;
    this.r = paramaa;
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.o = (int)(0.5F + 20.0F * paramContext.getResources().getDisplayMetrics().density);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.m = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.n = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.q = m.a(paramContext, v);
  }

  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = Math.abs(paramFloat1);
    if (f1 < paramFloat2)
      paramFloat3 = 0.0F;
    do
    {
      return paramFloat3;
      if (f1 <= paramFloat3)
        break;
    }
    while (paramFloat1 > 0.0F);
    return -paramFloat3;
    return paramFloat1;
  }

  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0)
      return 0;
    int i1 = this.u.getWidth();
    int i2 = i1 / 2;
    float f1 = Math.min(1.0F, Math.abs(paramInt1) / i1);
    float f2 = i2 + i2 * (float)Math.sin((float)(0.47123891676382D * f1 - 0.5F));
    int i3 = Math.abs(paramInt2);
    if (i3 > 0);
    for (int i4 = 4 * Math.round(1000.0F * Math.abs(f2 / i3)); ; i4 = (int)(256.0F * (1.0F + Math.abs(paramInt1) / paramInt3)))
      return Math.min(i4, 600);
  }

  public static z a(ViewGroup paramViewGroup, float paramFloat, aa paramaa)
  {
    z localz = new z(paramViewGroup.getContext(), paramViewGroup, paramaa);
    localz.b = (int)(localz.b * (1.0F / paramFloat));
    return localz;
  }

  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    if ((this.d == null) || (this.d.length <= paramInt))
    {
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      float[] arrayOfFloat4 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.d != null)
      {
        System.arraycopy(this.d, 0, arrayOfFloat1, 0, this.d.length);
        System.arraycopy(this.e, 0, arrayOfFloat2, 0, this.e.length);
        System.arraycopy(this.f, 0, arrayOfFloat3, 0, this.f.length);
        System.arraycopy(this.g, 0, arrayOfFloat4, 0, this.g.length);
        System.arraycopy(this.h, 0, arrayOfInt1, 0, this.h.length);
        System.arraycopy(this.i, 0, arrayOfInt2, 0, this.i.length);
        System.arraycopy(this.j, 0, arrayOfInt3, 0, this.j.length);
      }
      this.d = arrayOfFloat1;
      this.e = arrayOfFloat2;
      this.f = arrayOfFloat3;
      this.g = arrayOfFloat4;
      this.h = arrayOfInt1;
      this.i = arrayOfInt2;
      this.j = arrayOfInt3;
    }
    float[] arrayOfFloat5 = this.d;
    this.f[paramInt] = paramFloat1;
    arrayOfFloat5[paramInt] = paramFloat1;
    float[] arrayOfFloat6 = this.e;
    this.g[paramInt] = paramFloat2;
    arrayOfFloat6[paramInt] = paramFloat2;
    int[] arrayOfInt4 = this.h;
    int i1 = (int)paramFloat1;
    int i2 = (int)paramFloat2;
    int i3 = this.u.getLeft() + this.o;
    int i4 = 0;
    if (i1 < i3)
      i4 = 1;
    if (i2 < this.u.getTop() + this.o)
      i4 |= 4;
    if (i1 > this.u.getRight() - this.o)
      i4 |= 2;
    if (i2 > this.u.getBottom() - this.o)
      i4 |= 8;
    arrayOfInt4[paramInt] = i4;
    this.k |= 1 << paramInt;
  }

  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    float f1 = Math.abs(paramFloat1);
    float f2 = Math.abs(paramFloat2);
    if (((paramInt2 & this.h[paramInt1]) != paramInt2) || ((paramInt2 & this.p) == 0) || ((paramInt2 & this.j[paramInt1]) == paramInt2) || ((paramInt2 & this.i[paramInt1]) == paramInt2) || ((f1 <= this.b) && (f2 <= this.b)));
    while ((f1 < f2 * 0.5F) && (((paramInt2 & this.i[paramInt1]) != 0) || (f1 <= this.b)))
      return false;
    return true;
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.s.getLeft();
    int i2 = this.s.getTop();
    int i3 = paramInt1 - i1;
    int i4 = paramInt2 - i2;
    if ((i3 == 0) && (i4 == 0))
    {
      this.q.c();
      b(0);
      return false;
    }
    View localView = this.s;
    int i5 = b(paramInt3, (int)this.n, (int)this.m);
    int i6 = b(paramInt4, (int)this.n, (int)this.m);
    int i7 = Math.abs(i3);
    int i8 = Math.abs(i4);
    int i9 = Math.abs(i5);
    int i10 = Math.abs(i6);
    int i11 = i9 + i10;
    int i12 = i7 + i8;
    float f1;
    if (i5 != 0)
    {
      f1 = i9 / i11;
      if (i6 == 0)
        break label262;
    }
    label262: for (float f2 = i10 / i11; ; f2 = i8 / i12)
    {
      int i13 = a(i3, i5, this.r.c(localView));
      int i14 = a(i4, i6, 0);
      int i15 = (int)(f1 * i13 + f2 * i14);
      m localm = this.q;
      m.b.a(localm.a, i1, i2, i3, i4, i15);
      b(2);
      return true;
      f1 = i7 / i12;
      break;
    }
  }

  private boolean a(View paramView, float paramFloat)
  {
    if (paramView == null);
    while (true)
    {
      return false;
      if (this.r.c(paramView) > 0);
      for (int i1 = 1; (i1 != 0) && (Math.abs(paramFloat) > this.b); i1 = 0)
        return true;
    }
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = Math.abs(paramInt1);
    if (i1 < paramInt2)
      paramInt3 = 0;
    do
    {
      return paramInt3;
      if (i1 <= paramInt3)
        break;
    }
    while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }

  private void b(float paramFloat)
  {
    this.t = true;
    this.r.a(this.s, paramFloat);
    this.t = false;
    if (this.a == 1)
      b(0);
  }

  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i1 = 1;
    if (a(paramFloat1, paramFloat2, paramInt, i1));
    while (true)
    {
      if (a(paramFloat2, paramFloat1, paramInt, 4))
        i1 |= 4;
      if (a(paramFloat1, paramFloat2, paramInt, 2))
        i1 |= 2;
      if (a(paramFloat2, paramFloat1, paramInt, 8))
        i1 |= 8;
      if (i1 != 0)
      {
        int[] arrayOfInt = this.i;
        arrayOfInt[paramInt] = (i1 | arrayOfInt[paramInt]);
        this.r.a(i1, paramInt);
      }
      return;
      i1 = 0;
    }
  }

  private boolean b(View paramView, int paramInt)
  {
    if ((paramView == this.s) && (this.c == paramInt))
      return true;
    if ((paramView != null) && (this.r.a(paramView)))
    {
      this.c = paramInt;
      a(paramView, paramInt);
      return true;
    }
    return false;
  }

  public static boolean b(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == null);
    while ((paramInt1 < paramView.getLeft()) || (paramInt1 >= paramView.getRight()) || (paramInt2 < paramView.getTop()) || (paramInt2 >= paramView.getBottom()))
      return false;
    return true;
  }

  private void c(int paramInt)
  {
    if (this.d == null)
      return;
    this.d[paramInt] = 0.0F;
    this.e[paramInt] = 0.0F;
    this.f[paramInt] = 0.0F;
    this.g[paramInt] = 0.0F;
    this.h[paramInt] = 0;
    this.i[paramInt] = 0;
    this.j[paramInt] = 0;
    this.k &= (0xFFFFFFFF ^ 1 << paramInt);
  }

  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = ad.c(paramMotionEvent);
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = ad.b(paramMotionEvent, i2);
      float f1 = ad.c(paramMotionEvent, i2);
      float f2 = ad.d(paramMotionEvent, i2);
      this.f[i3] = f1;
      this.g[i3] = f2;
    }
  }

  private void i()
  {
    this.l.computeCurrentVelocity(1000, this.m);
    float f1 = a(ap.a(this.l, this.c), this.n, this.m);
    a(ap.b(this.l, this.c), this.n, this.m);
    b(f1);
  }

  public final int a()
  {
    return this.a;
  }

  public final void a(float paramFloat)
  {
    this.n = paramFloat;
  }

  public final void a(int paramInt)
  {
    this.p = paramInt;
  }

  public final void a(View paramView, int paramInt)
  {
    if (paramView.getParent() != this.u)
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    this.s = paramView;
    this.c = paramInt;
    this.r.b(paramView);
    b(1);
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    if (!this.t)
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    return a(paramInt1, paramInt2, (int)ap.a(this.l, this.c), (int)ap.b(this.l, this.c));
  }

  public final boolean a(MotionEvent paramMotionEvent)
  {
    int i1 = ad.a(paramMotionEvent);
    int i2 = ad.b(paramMotionEvent);
    if (i1 == 0)
      e();
    if (this.l == null)
      this.l = VelocityTracker.obtain();
    this.l.addMovement(paramMotionEvent);
    switch (i1)
    {
    case 4:
    default:
    case 0:
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    while (this.a == 1)
    {
      return true;
      float f6 = paramMotionEvent.getX();
      float f7 = paramMotionEvent.getY();
      int i7 = ad.b(paramMotionEvent, 0);
      a(f6, f7, i7);
      View localView3 = b((int)f6, (int)f7);
      if ((localView3 == this.s) && (this.a == 2))
        b(localView3, i7);
      if ((this.h[i7] & this.p) != 0)
      {
        aa localaa2 = this.r;
        localaa2.b();
        continue;
        int i6 = ad.b(paramMotionEvent, i2);
        float f4 = ad.c(paramMotionEvent, i2);
        float f5 = ad.d(paramMotionEvent, i2);
        a(f4, f5, i6);
        if (this.a == 0)
        {
          if ((this.h[i6] & this.p) != 0)
          {
            aa localaa1 = this.r;
            localaa1.b();
          }
        }
        else if (this.a == 2)
        {
          View localView2 = b((int)f4, (int)f5);
          if (localView2 == this.s)
          {
            b(localView2, i6);
            continue;
            int i3 = ad.c(paramMotionEvent);
            for (int i4 = 0; i4 < i3; i4++)
            {
              int i5 = ad.b(paramMotionEvent, i4);
              float f1 = ad.c(paramMotionEvent, i4);
              float f2 = ad.d(paramMotionEvent, i4);
              float f3 = f1 - this.d[i5];
              b(f3, f2 - this.e[i5], i5);
              if (this.a == 1)
                break;
              View localView1 = b((int)f1, (int)f2);
              if ((localView1 != null) && (a(localView1, f3)) && (b(localView1, i5)))
                break;
            }
            c(paramMotionEvent);
            continue;
            c(ad.b(paramMotionEvent, i2));
            continue;
            e();
          }
        }
      }
    }
    return false;
  }

  public final boolean a(View paramView, int paramInt1, int paramInt2)
  {
    this.s = paramView;
    this.c = -1;
    return a(paramInt1, paramInt2, 0, 0);
  }

  public final int b()
  {
    return this.o;
  }

  public final View b(int paramInt1, int paramInt2)
  {
    for (int i1 = -1 + this.u.getChildCount(); i1 >= 0; i1--)
    {
      ViewGroup localViewGroup = this.u;
      View localView = localViewGroup.getChildAt(i1);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom()))
        return localView;
    }
    return null;
  }

  final void b(int paramInt)
  {
    if (this.a != paramInt)
    {
      this.a = paramInt;
      this.r.a(paramInt);
      if (paramInt == 0)
        this.s = null;
    }
  }

  public final void b(MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    int i2 = ad.a(paramMotionEvent);
    int i3 = ad.b(paramMotionEvent);
    if (i2 == 0)
      e();
    if (this.l == null)
      this.l = VelocityTracker.obtain();
    this.l.addMovement(paramMotionEvent);
    int i4;
    switch (i2)
    {
    case 4:
    default:
    case 0:
    case 5:
      int i17;
      int i18;
      int i19;
      do
      {
        float f8;
        float f9;
        do
        {
          int i20;
          do
          {
            return;
            float f10 = paramMotionEvent.getX();
            float f11 = paramMotionEvent.getY();
            i20 = ad.b(paramMotionEvent, 0);
            View localView2 = b((int)f10, (int)f11);
            a(f10, f11, i20);
            b(localView2, i20);
          }
          while ((this.h[i20] & this.p) == 0);
          aa localaa2 = this.r;
          localaa2.b();
          return;
          i17 = ad.b(paramMotionEvent, i3);
          f8 = ad.c(paramMotionEvent, i3);
          f9 = ad.d(paramMotionEvent, i3);
          a(f8, f9, i17);
          if (this.a != 0)
            break;
          b(b((int)f8, (int)f9), i17);
        }
        while ((this.h[i17] & this.p) == 0);
        aa localaa1 = this.r;
        localaa1.b();
        return;
        i18 = (int)f8;
        i19 = (int)f9;
      }
      while (!b(this.s, i18, i19));
      b(this.s, i17);
      return;
    case 2:
      if (this.a == 1)
      {
        int i10 = ad.a(paramMotionEvent, this.c);
        float f6 = ad.c(paramMotionEvent, i10);
        float f7 = ad.d(paramMotionEvent, i10);
        int i11 = (int)(f6 - this.f[this.c]);
        int i12 = (int)(f7 - this.g[this.c]);
        int i13 = i11 + this.s.getLeft();
        this.s.getTop();
        int i14 = this.s.getLeft();
        int i15 = this.s.getTop();
        if (i11 != 0)
        {
          i13 = this.r.b(this.s, i13);
          this.s.offsetLeftAndRight(i13 - i14);
        }
        if (i12 != 0)
        {
          int i16 = this.r.d(this.s);
          this.s.offsetTopAndBottom(i16 - i15);
        }
        if ((i11 != 0) || (i12 != 0))
          this.r.a(this.s, i13);
        c(paramMotionEvent);
        return;
      }
      int i8 = ad.c(paramMotionEvent);
      while (i1 < i8)
      {
        int i9 = ad.b(paramMotionEvent, i1);
        float f3 = ad.c(paramMotionEvent, i1);
        float f4 = ad.d(paramMotionEvent, i1);
        float f5 = f3 - this.d[i9];
        b(f5, f4 - this.e[i9], i9);
        if (this.a == 1)
          break;
        View localView1 = b((int)f3, (int)f4);
        if ((a(localView1, f5)) && (b(localView1, i9)))
          break;
        i1++;
      }
      c(paramMotionEvent);
      return;
    case 6:
      i4 = ad.b(paramMotionEvent, i3);
      if ((this.a == 1) && (i4 == this.c))
      {
        int i5 = ad.c(paramMotionEvent);
        if (i1 >= i5)
          break label768;
        int i7 = ad.b(paramMotionEvent, i1);
        if (i7 == this.c)
          break label727;
        float f1 = ad.c(paramMotionEvent, i1);
        float f2 = ad.d(paramMotionEvent, i1);
        if ((b((int)f1, (int)f2) != this.s) || (!b(this.s, i7)))
          break label727;
      }
    case 1:
    case 3:
    }
    label768: for (int i6 = this.c; ; i6 = -1)
    {
      if (i6 == -1)
        i();
      c(i4);
      return;
      label727: i1++;
      break;
      if (this.a == 1)
        i();
      e();
      return;
      if (this.a == 1)
        b(0.0F);
      e();
      return;
    }
  }

  public final View c()
  {
    return this.s;
  }

  public final int d()
  {
    return this.b;
  }

  public final void e()
  {
    this.c = -1;
    if (this.d != null)
    {
      Arrays.fill(this.d, 0.0F);
      Arrays.fill(this.e, 0.0F);
      Arrays.fill(this.f, 0.0F);
      Arrays.fill(this.g, 0.0F);
      Arrays.fill(this.h, 0);
      Arrays.fill(this.i, 0);
      Arrays.fill(this.j, 0);
      this.k = 0;
    }
    if (this.l != null)
    {
      this.l.recycle();
      this.l = null;
    }
  }

  public final void f()
  {
    e();
    if (this.a == 2)
    {
      this.q.a();
      this.q.b();
      this.q.c();
      int i1 = this.q.a();
      this.q.b();
      this.r.a(this.s, i1);
    }
    b(0);
  }

  public final boolean g()
  {
    if (this.a == 2)
    {
      m localm1 = this.q;
      boolean bool = m.b.d(localm1.a);
      int i1 = this.q.a();
      int i2 = this.q.b();
      int i3 = i1 - this.s.getLeft();
      int i4 = i2 - this.s.getTop();
      if (i3 != 0)
        this.s.offsetLeftAndRight(i3);
      if (i4 != 0)
        this.s.offsetTopAndBottom(i4);
      if ((i3 != 0) || (i4 != 0))
        this.r.a(this.s, i1);
      if (bool)
      {
        m localm2 = this.q;
        if (i1 == m.b.f(localm2.a))
        {
          m localm3 = this.q;
          if (i2 == m.b.g(localm3.a))
          {
            this.q.c();
            m localm4 = this.q;
            bool = m.b.a(localm4.a);
          }
        }
      }
      if (!bool)
        this.u.post(this.w);
    }
    return this.a == 2;
  }

  public final boolean h()
  {
    int i1 = this.d.length;
    label100: label106: label112: for (int i2 = 0; i2 < i1; i2++)
    {
      int i3;
      int i4;
      if ((this.k & 1 << i2) != 0)
      {
        i3 = 1;
        if (i3 == 0)
          break label106;
        float f1 = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        if (f1 * f1 + f2 * f2 <= this.b * this.b)
          break label100;
        i4 = 1;
      }
      while (true)
      {
        if (i4 == 0)
          break label112;
        return true;
        i3 = 0;
        break;
        i4 = 0;
        continue;
        i4 = 0;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
