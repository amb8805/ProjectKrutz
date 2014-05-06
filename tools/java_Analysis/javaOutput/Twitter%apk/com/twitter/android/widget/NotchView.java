package com.twitter.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.twitter.android.fq;

public class NotchView extends View
{
  private Drawable a;
  private Drawable b;
  private int c;

  public NotchView(Context paramContext)
  {
    this(paramContext, null);
  }

  public NotchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771982);
  }

  public NotchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.NotchView, paramInt, 0);
    this.a = localTypedArray.getDrawable(1);
    this.b = localTypedArray.getDrawable(0);
    this.c = localTypedArray.getDimensionPixelOffset(2, this.a.getIntrinsicWidth());
    localTypedArray.recycle();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.b.isStateful())
      this.b.setState(arrayOfInt);
    if (this.a.isStateful())
      this.a.setState(arrayOfInt);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Drawable localDrawable1 = this.b;
    Drawable localDrawable2 = this.a;
    int i = getMeasuredHeight();
    int j = localDrawable1.getIntrinsicWidth();
    int k = getScrollY();
    int m = getScrollX();
    int n = this.c;
    localDrawable2.setBounds(m, k, m + n, i);
    localDrawable2.draw(paramCanvas);
    int i1 = n + m;
    localDrawable1.setBounds(i1, k, i1 + j, i);
    localDrawable1.draw(paramCanvas);
    localDrawable2.setBounds(i1 + j, k, m + getMeasuredWidth(), i);
    localDrawable2.draw(paramCanvas);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.a.getIntrinsicWidth();
    int j = Math.max(getSuggestedMinimumWidth(), i + (i + this.b.getIntrinsicWidth()));
    int k = Math.max(getSuggestedMinimumHeight(), this.b.getIntrinsicHeight());
    setMeasuredDimension(getDefaultSize(j, paramInt1), getDefaultSize(k, paramInt2));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.NotchView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
