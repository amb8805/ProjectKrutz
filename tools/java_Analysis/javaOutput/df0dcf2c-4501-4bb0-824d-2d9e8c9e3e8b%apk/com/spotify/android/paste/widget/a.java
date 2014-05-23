package com.spotify.android.paste.widget;

import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class a
  implements b
{
  private a(CardView paramCardView)
  {
  }

  public final void a(int paramInt1, int paramInt2)
  {
    int i = CardView.a(paramInt1, this.a.getPaddingLeft() + this.a.getPaddingRight());
    int j = CardView.a(paramInt2, this.a.getPaddingTop() + this.a.getPaddingBottom());
    if ((View.MeasureSpec.getMode(i) == 0) || (View.MeasureSpec.getMode(j) == 0))
      throw new IllegalArgumentException("Horizontal CardView does not support UNSPECIFIED dimensions");
    int k = View.MeasureSpec.getSize(i);
    int m = View.MeasureSpec.getSize(j);
    int n = CardView.b(m);
    int i1 = CardView.b(m);
    CardView.a(this.a).measure(n, i1);
    if (CardView.b(this.a) != null)
      CardView.b(this.a).measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), View.MeasureSpec.makeMeasureSpec(m, -2147483648));
    int i2;
    if (CardView.h(this.a) > 0.0F)
      i2 = (int)(CardView.h(this.a) * m - m);
    for (int i3 = m + i2 + this.a.getPaddingLeft() + this.a.getPaddingRight(); ; i3 = View.MeasureSpec.getSize(paramInt1))
    {
      int i4 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
      CardView.d(this.a).measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
      CardView.e(this.a).measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
      CardView.f(this.a).measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
      CardView.b(this.a, i3, View.MeasureSpec.getSize(paramInt2));
      return;
      i2 = k - 2 * CardView.c(this.a);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.a.getPaddingLeft();
    int j = this.a.getPaddingTop();
    int k = paramInt3 - paramInt1 - this.a.getPaddingRight();
    int m = paramInt4 - paramInt2 - this.a.getPaddingBottom();
    CardView.a(this.a).layout(i, j, i + CardView.a(this.a).getMeasuredWidth(), j + CardView.a(this.a).getMeasuredHeight());
    int n = i + CardView.a(this.a).getMeasuredWidth();
    if (CardView.b(this.a) != null)
      CardView.b(this.a).layout(n - CardView.b(this.a).getMeasuredWidth() - CardView.g(this.a), m - CardView.b(this.a).getMeasuredHeight() - CardView.g(this.a), n - CardView.g(this.a), m - CardView.g(this.a));
    int i1 = n + CardView.c(this.a);
    int i2 = j + CardView.c(this.a);
    int i3 = k - CardView.c(this.a);
    int i4 = m - CardView.c(this.a);
    CardView.d(this.a).layout(i1, i2, i3, i2 + CardView.d(this.a).getMeasuredHeight());
    int i5 = i2 + CardView.d(this.a).getMeasuredHeight();
    CardView.e(this.a).layout(i1, i5, i3, i5 + CardView.e(this.a).getMeasuredHeight());
    CardView.f(this.a).layout(i1, i4 - CardView.f(this.a).getMeasuredHeight(), i3, i4);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
