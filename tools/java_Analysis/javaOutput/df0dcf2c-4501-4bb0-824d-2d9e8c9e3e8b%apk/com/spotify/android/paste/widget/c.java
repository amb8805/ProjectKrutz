package com.spotify.android.paste.widget;

import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class c
  implements b
{
  private c(CardView paramCardView)
  {
  }

  public final void a(int paramInt1, int paramInt2)
  {
    int i = this.a.a();
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = Math.max(j - i, 0);
    int n = Math.min(k, m);
    int i1 = CardView.b(k);
    int i2 = CardView.b(m);
    int i3 = CardView.b(n);
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    default:
      i1 = 0;
      i2 = 0;
    case 1073741824:
    case -2147483648:
    case 0:
    }
    while (true)
    {
      int i5 = this.a.getPaddingLeft() + this.a.getPaddingRight();
      int i6 = this.a.getPaddingTop() + this.a.getPaddingBottom();
      CardView.a(this.a).measure(CardView.a(i2, i5), CardView.a(i1, i6));
      int i7 = CardView.a(this.a).getMeasuredWidth();
      int i8 = CardView.a(this.a).getMeasuredHeight();
      if (CardView.b(this.a) != null)
        CardView.b(this.a).measure(View.MeasureSpec.makeMeasureSpec(i7, -2147483648), View.MeasureSpec.makeMeasureSpec(i8, -2147483648));
      int i9 = View.MeasureSpec.makeMeasureSpec(i7 - 2 * CardView.c(this.a), 1073741824);
      CardView.d(this.a).measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
      CardView.e(this.a).measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
      CardView.f(this.a).measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
      int i10 = i7 + i5;
      int i11 = i6 + (i8 + i);
      CardView.a(this.a, i10, i11);
      return;
      switch (View.MeasureSpec.getMode(paramInt2))
      {
      default:
        break;
      case -2147483648:
        i2 = i1;
        i1 = i3;
        break;
      case 1073741824:
        int i12 = i2;
        i2 = i1;
        i1 = i12;
        break;
      case 0:
        i2 = i1;
        continue;
        switch (View.MeasureSpec.getMode(paramInt2))
        {
        default:
          break;
        case -2147483648:
          i1 = i3;
          i2 = i3;
          break;
        case 1073741824:
          i1 = i2;
          i2 = i3;
          break;
        case 0:
          i2 = i1;
          continue;
          switch (View.MeasureSpec.getMode(paramInt2))
          {
          default:
            break;
          case -2147483648:
            i1 = i2;
            break;
          case 1073741824:
            i1 = i2;
            break;
          case 0:
            int i4 = i2;
            i2 = i1;
            i1 = i4;
          }
          break;
        }
        break;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.a.getPaddingLeft();
    int j = this.a.getPaddingTop();
    int k = paramInt3 - paramInt1 - this.a.getPaddingRight();
    int m = paramInt4 - paramInt2 - this.a.getPaddingBottom();
    CardView.a(this.a).layout(i, j, k, j + CardView.a(this.a).getMeasuredHeight());
    int n = j + CardView.a(this.a).getMeasuredHeight();
    if (CardView.b(this.a) != null)
      CardView.b(this.a).layout(k - CardView.b(this.a).getMeasuredWidth() - CardView.g(this.a), n - CardView.b(this.a).getMeasuredHeight() - CardView.g(this.a), k - CardView.g(this.a), n - CardView.g(this.a));
    int i1 = i + CardView.c(this.a);
    int i2 = n + CardView.c(this.a);
    int i3 = k - CardView.c(this.a);
    int i4 = m - CardView.c(this.a);
    CardView.d(this.a).layout(i1, i2, i3, i2 + CardView.d(this.a).getMeasuredHeight());
    int i5 = i2 + CardView.d(this.a).getMeasuredHeight();
    CardView.e(this.a).layout(i1, i5, i3, i5 + CardView.e(this.a).getMeasuredHeight());
    CardView.f(this.a).layout(i1, i4 - CardView.f(this.a).getMeasuredHeight(), i3, i4);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
