package it.sephiroth.android.library.widget;

import android.view.View;
import android.view.animation.Interpolator;
import it.sephiroth.android.library.a.b;

final class e
  implements Runnable
{
  private final x b;
  private int c;
  private final Runnable d = new e.1(this);

  e(AbsHListView paramAbsHListView)
  {
    this.b = new x(paramAbsHListView.getContext());
  }

  final void a()
  {
    if (this.b.a(this.a.getScrollX()))
    {
      this.a.F = 6;
      this.a.invalidate();
      this.a.a.a(this);
      return;
    }
    this.a.F = -1;
    this.a.a(0);
  }

  final void a(int paramInt)
  {
    if (paramInt < 0);
    for (int i = 2147483647; ; i = 0)
    {
      this.c = i;
      this.b.a(null);
      this.b.a(i, paramInt, 0, 0, 2147483647, 0);
      this.a.F = 4;
      this.a.a.a(this);
      return;
    }
  }

  final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    x localx;
    if (paramInt1 < 0)
    {
      i = 2147483647;
      this.c = i;
      localx = this.b;
      if (!paramBoolean)
        break label73;
    }
    label73: for (Interpolator localInterpolator = AbsHListView.T; ; localInterpolator = null)
    {
      localx.a(localInterpolator);
      this.b.a(i, paramInt1, paramInt2);
      this.a.F = 4;
      this.a.a.a(this);
      return;
      i = 0;
      break;
    }
  }

  final void b()
  {
    this.a.F = -1;
    this.a.removeCallbacks(this);
    this.a.removeCallbacks(this.d);
    this.a.a(0);
    AbsHListView.k(this.a);
    this.b.e();
    AbsHListView.l(this.a);
  }

  final void b(int paramInt)
  {
    this.b.a(null);
    this.b.a(this.a.getScrollX(), paramInt, 0, -2147483648, 0, this.a.getWidth());
    this.a.F = 6;
    this.a.invalidate();
    this.a.a.a(this);
  }

  final void c()
  {
    this.a.postDelayed(this.d, 40L);
  }

  public final void run()
  {
    boolean bool1;
    int i2;
    int i3;
    int i5;
    View localView2;
    switch (this.a.F)
    {
    case 5:
    default:
      b();
    case 3:
      do
        return;
      while (this.b.a());
    case 4:
      if (this.a.ai)
        this.a.e();
      if ((this.a.an == 0) || (this.a.getChildCount() == 0))
      {
        b();
        return;
      }
      x localx2 = this.b;
      bool1 = localx2.d();
      i2 = localx2.b();
      i3 = this.c - i2;
      if (i3 > 0)
      {
        this.a.A = this.a.V;
        View localView3 = this.a.getChildAt(0);
        this.a.B = localView3.getLeft();
        i5 = Math.min(-1 + (this.a.getWidth() - this.a.getPaddingRight() - this.a.getPaddingLeft()), i3);
        localView2 = this.a.getChildAt(this.a.A - this.a.V);
        if (localView2 == null)
          break label751;
      }
    case 6:
    }
    label751: for (int i6 = localView2.getLeft(); ; i6 = 0)
    {
      boolean bool2 = this.a.a(i5, i5);
      int i7 = 0;
      if (bool2)
      {
        i7 = 0;
        if (i5 != 0)
          i7 = 1;
      }
      if (i7 != 0)
      {
        if (localView2 != null)
        {
          int i10 = -(i5 - (localView2.getLeft() - i6));
          AbsHListView.a(this.a, i10, this.a.getScrollX(), this.a.R);
        }
        if (!bool1)
          break;
        this.b.a(this.a.getScrollX(), this.a.R);
        int i8 = this.a.getOverScrollMode();
        int i9;
        if ((i8 == 0) || ((i8 == 1) && (!AbsHListView.h(this.a))))
        {
          this.a.F = 6;
          i9 = (int)this.b.c();
          if (i5 > 0)
            AbsHListView.i(this.a).a(i9);
        }
        while (true)
        {
          this.a.invalidate();
          this.a.a.a(this);
          return;
          int i4 = -1 + this.a.getChildCount();
          this.a.A = (i4 + this.a.V);
          View localView1 = this.a.getChildAt(i4);
          this.a.B = localView1.getLeft();
          i5 = Math.max(-(-1 + (this.a.getWidth() - this.a.getPaddingRight() - this.a.getPaddingLeft())), i3);
          break;
          AbsHListView.j(this.a).a(i9);
          continue;
          this.a.F = -1;
          if (this.a.I != null)
            this.a.I.a();
        }
      }
      if ((bool1) && (i7 == 0))
      {
        if (bool2)
          this.a.invalidate();
        this.c = i2;
        this.a.a.a(this);
        return;
      }
      b();
      return;
      x localx1 = this.b;
      if (localx1.d())
      {
        int i = this.a.getScrollX();
        int j = localx1.b();
        int k = j - i;
        if (AbsHListView.b(this.a, k, i, this.a.R))
        {
          if ((i <= 0) && (j > 0));
          for (int m = 1; ; m = 0)
          {
            int n = 0;
            if (i >= 0)
            {
              n = 0;
              if (j < 0)
                n = 1;
            }
            if ((m == 0) && (n == 0))
              break;
            int i1 = (int)localx1.c();
            if (n != 0)
              i1 = -i1;
            localx1.e();
            a(i1);
            return;
          }
          a();
          return;
        }
        this.a.invalidate();
        this.a.a.a(this);
        return;
      }
      b();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
