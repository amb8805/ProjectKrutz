package it.sephiroth.android.library.widget;

import android.graphics.Rect;
import android.view.View;
import it.sephiroth.android.library.a.b;

public final class i
  implements Runnable
{
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private final int g;
  private int h;

  public final void a()
  {
    this.a.removeCallbacks(this);
  }

  public final void run()
  {
    int i = this.a.getWidth();
    int j = this.a.V;
    switch (this.b)
    {
    default:
    case 1:
    case 3:
    case 2:
    case 4:
      int i14;
      int i15;
      do
      {
        int i8;
        do
        {
          View localView2;
          do
          {
            int i21;
            int i22;
            do
            {
              int i18;
              do
              {
                int i23;
                int i24;
                do
                {
                  return;
                  i23 = -1 + this.a.getChildCount();
                  i24 = j + i23;
                }
                while (i23 < 0);
                if (i24 == this.e)
                {
                  this.a.a.a(this);
                  return;
                }
                View localView4 = this.a.getChildAt(i23);
                int i25 = localView4.getWidth();
                int i26 = i - localView4.getLeft();
                if (i24 < -1 + this.a.an);
                for (int i27 = Math.max(this.a.u.right, this.g); ; i27 = this.a.u.right)
                {
                  int i28 = i27 + (i25 - i26);
                  this.a.a(i28, this.f, true);
                  this.e = i24;
                  if (i24 >= this.c)
                    break;
                  this.a.a.a(this);
                  return;
                }
                i18 = this.a.getChildCount();
              }
              while ((j == this.d) || (i18 <= 1) || (i18 + j >= this.a.an));
              int i19 = j + 1;
              if (i19 == this.e)
              {
                this.a.a.a(this);
                return;
              }
              View localView3 = this.a.getChildAt(1);
              int i20 = localView3.getWidth();
              i21 = localView3.getLeft();
              i22 = Math.max(this.a.u.right, this.g);
              if (i19 < this.d)
              {
                this.a.a(Math.max(0, i21 + i20 - i22), this.f, true);
                this.e = i19;
                this.a.a.a(this);
                return;
              }
            }
            while (i21 <= i22);
            this.a.a(i21 - i22, this.f, true);
            return;
            if (j == this.e)
            {
              this.a.a.a(this);
              return;
            }
            localView2 = this.a.getChildAt(0);
          }
          while (localView2 == null);
          int i16 = localView2.getLeft();
          if (j > 0);
          for (int i17 = Math.max(this.g, this.a.u.left); ; i17 = this.a.u.left)
          {
            this.a.a(i16 - i17, this.f, true);
            this.e = j;
            if (j <= this.c)
              break;
            this.a.a.a(this);
            return;
          }
          i8 = -2 + this.a.getChildCount();
        }
        while (i8 < 0);
        int i9 = j + i8;
        if (i9 == this.e)
        {
          this.a.a.a(this);
          return;
        }
        View localView1 = this.a.getChildAt(i8);
        int i10 = localView1.getWidth();
        int i11 = localView1.getLeft();
        int i12 = i - i11;
        int i13 = Math.max(this.a.u.left, this.g);
        this.e = i9;
        if (i9 > this.d)
        {
          this.a.a(-(i12 - i13), this.f, true);
          this.a.a.a(this);
          return;
        }
        i14 = i - i13;
        i15 = i11 + i10;
      }
      while (i14 <= i15);
      this.a.a(-(i14 - i15), this.f, true);
      return;
    case 5:
    }
    if (this.e == j)
    {
      this.a.a.a(this);
      return;
    }
    this.e = j;
    int k = this.a.getChildCount();
    int m = this.c;
    int n = -1 + (j + k);
    int i1;
    if (m < j)
      i1 = 1 + (j - m);
    float f1;
    while (true)
    {
      f1 = Math.min(Math.abs(i1 / k), 1.0F);
      if (m >= j)
        break;
      int i6 = (int)(f1 * -this.a.getWidth());
      int i7 = (int)(f1 * this.f);
      this.a.a(i6, i7, true);
      this.a.a.a(this);
      return;
      i1 = 0;
      if (m > n)
        i1 = m - n;
    }
    if (m > n)
    {
      int i4 = (int)(f1 * this.a.getWidth());
      int i5 = (int)(f1 * this.f);
      this.a.a(i4, i5, true);
      this.a.a.a(this);
      return;
    }
    int i2 = this.a.getChildAt(m - j).getLeft() - this.h;
    int i3 = (int)(this.f * (Math.abs(i2) / this.a.getWidth()));
    this.a.a(i2, i3, true);
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
