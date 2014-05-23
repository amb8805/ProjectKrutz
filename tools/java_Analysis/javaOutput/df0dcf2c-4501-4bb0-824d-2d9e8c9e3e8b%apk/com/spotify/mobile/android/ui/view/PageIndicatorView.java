package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.br;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.spotify.mobile.android.ui.m;

public class PageIndicatorView extends ViewGroup
  implements br
{
  private GradientView a;
  private GradientView b;
  private TextView[] c = new TextView[3];
  private int d = 0;
  private int e = 0;
  private View f;
  private View g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private boolean o = false;
  private float p;

  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new GradientView(paramContext);
    this.b = new GradientView(paramContext);
    this.f = new View(paramContext);
    this.g = new View(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.A);
    this.a.a(180);
    this.a.b(localTypedArray.getColor(1, 0));
    this.a.c(localTypedArray.getColor(0, 0));
    this.b.a(0);
    this.b.b(localTypedArray.getColor(1, 0));
    this.b.c(localTypedArray.getColor(0, 0));
    int i2 = localTypedArray.getColor(5, 0);
    this.f.setBackgroundColor(i2);
    this.g.setBackgroundColor(i2);
    int i3 = localTypedArray.getResourceId(2, 0);
    this.m = localTypedArray.getColor(7, -1);
    this.n = localTypedArray.getColor(6, -1);
    while (i1 < this.c.length)
    {
      this.c[i1] = new TextView(paramContext);
      if (i3 != 0)
        this.c[i1].setTextAppearance(paramContext, i3);
      this.c[i1].setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      this.c[i1].setTextColor(this.m);
      this.c[i1].setTextSize(1, 11.0F);
      this.c[i1].setSingleLine();
      addView(this.c[i1]);
      i1++;
    }
    localTypedArray.recycle();
    addView(this.a);
    addView(this.b);
    addView(this.f);
    addView(this.g);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.h = (int)(16.0F * f1);
    this.i = (int)(2.0F * f1);
    this.j = (int)(4.0F * f1);
    this.k = (int)(12.0F * f1);
    this.l = (int)(f1 * 30.0F);
  }

  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    return paramInt1 + (int)(paramFloat * paramInt2 - paramInt1);
  }

  private int a(int paramInt1, TextView paramTextView, int paramInt2, float paramFloat)
  {
    if (paramInt1 == paramInt2)
      return a(a(paramTextView), 0, paramFloat);
    if (paramInt1 == paramInt2 - 1)
      return a(0, -500, paramFloat);
    if (paramInt1 == paramInt2 + 1)
      return a(b(paramTextView), a(paramTextView), paramFloat);
    return a(500 + getWidth(), b(paramTextView), paramFloat);
  }

  private int a(View paramView)
  {
    return (getWidth() - paramView.getMeasuredWidth()) / 2;
  }

  private int b(View paramView)
  {
    return getWidth() - paramView.getMeasuredWidth();
  }

  public final void a(int paramInt)
  {
    this.c[paramInt].setTextColor(this.n);
    this.c[this.e].setTextColor(this.m);
    this.e = paramInt;
    requestLayout();
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.d != paramInt1)
      this.d = paramInt1;
    this.p = paramFloat;
    for (int i1 = 0; i1 < this.c.length; i1++)
    {
      int i4 = a(i1, this.c[i1], paramInt1, paramFloat);
      int i5 = this.c[i1].getLeft();
      this.c[i1].offsetLeftAndRight(i4 - i5);
    }
    int i2 = this.g.getLeft();
    int i3 = this.c[this.e].getLeft() - this.k;
    this.g.offsetLeftAndRight(i3 - i2);
    invalidate();
  }

  public final void b(int paramInt)
  {
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    if ((paramBoolean) || (this.o))
    {
      this.o = false;
      int i2 = (getBottom() - this.c[0].getMeasuredHeight()) / 2;
      int i3 = i2 + this.c[0].getMeasuredHeight();
      TextView[] arrayOfTextView = this.c;
      int i4 = arrayOfTextView.length;
      int i5 = 0;
      while (i1 < i4)
      {
        TextView localTextView = arrayOfTextView[i1];
        int i9 = a(i5, localTextView, this.e, this.p);
        localTextView.layout(i9, i2, i9 + localTextView.getMeasuredWidth(), i3);
        i5++;
        i1++;
      }
      this.a.layout(paramInt1, paramInt2, this.l, paramInt4);
      this.b.layout(paramInt3 - this.l, paramInt2, paramInt3, paramInt4);
      this.f.layout(paramInt1, paramInt4 - this.i, paramInt3, paramInt4);
    }
    int i6 = getBottom() - this.i - this.j;
    int i7 = this.c[this.e].getLeft() - this.k;
    int i8 = this.c[this.e].getRight() + this.k;
    this.g.layout(i7, i6, i8, getBottom());
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = View.MeasureSpec.makeMeasureSpec((i1 - this.h) / 3, -2147483648);
    int i4 = View.MeasureSpec.makeMeasureSpec(i2, -2147483648);
    TextView[] arrayOfTextView = this.c;
    int i5 = arrayOfTextView.length;
    for (int i6 = 0; i6 < i5; i6++)
      arrayOfTextView[i6].measure(i3, i4);
    this.a.measure(i3, i4);
    this.b.measure(i3, i4);
    this.f.measure(paramInt1, paramInt2);
    this.g.measure(paramInt1, paramInt2);
    setMeasuredDimension(i1, i2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.PageIndicatorView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
