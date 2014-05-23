package com.twitter.android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class ScrollableImageView extends ImageView
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = 0;
  private int h = 0;
  private boolean i;
  private Rect j;

  public ScrollableImageView(Context paramContext)
  {
    super(paramContext);
  }

  public ScrollableImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ScrollableImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    switch (q.a[getScaleType().ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      this.i = false;
      return;
      int k = getMeasuredWidth();
      int m = getMeasuredHeight();
      Rect localRect = this.j;
      if (localRect != null)
      {
        this.e = ((localRect.width() - k) / 2);
        this.f = ((localRect.height() - m) / 2);
        if ((this.e > 0) || (this.f > 0));
        for (boolean bool = true; ; bool = false)
        {
          this.i = bool;
          return;
        }
      }
      this.e = 0;
      this.f = 0;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.i)
      return super.onTouchEvent(paramMotionEvent);
    int k = 0xFF & paramMotionEvent.getAction();
    int m = (int)paramMotionEvent.getX();
    int n = (int)paramMotionEvent.getY();
    switch (k)
    {
    case 1:
    default:
      return super.onTouchEvent(paramMotionEvent);
    case 0:
      this.a = m;
      this.b = n;
      this.c = -2147483648;
      this.d = -2147483648;
      return true;
    case 2:
    }
    int i6;
    int i3;
    if (this.c != -2147483648)
    {
      int i5 = this.c - m;
      i6 = this.d - n;
      i3 = i5;
    }
    int i2;
    for (int i4 = i6; ; i4 = i2)
    {
      if (Math.abs(i3 + this.g) > this.e)
        i3 = 0;
      if (Math.abs(i4 + this.h) > this.f)
        i4 = 0;
      this.g = (i3 + this.g);
      this.h = (i4 + this.h);
      scrollBy(i3, i4);
      this.c = m;
      this.d = n;
      return true;
      int i1 = this.a - m;
      i2 = this.b - n;
      i3 = i1;
    }
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    if (paramDrawable != null)
    {
      this.j = paramDrawable.copyBounds();
      return;
    }
    this.j = null;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.ScrollableImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
