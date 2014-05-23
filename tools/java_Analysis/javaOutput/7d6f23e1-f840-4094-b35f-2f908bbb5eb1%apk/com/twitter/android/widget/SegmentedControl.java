package com.twitter.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.android.fq;

public class SegmentedControl extends View
{
  private static final TextPaint a;
  private static final int[] b = { 16842919 };
  private e c;
  private StateListDrawable d;
  private Drawable e;
  private CharSequence[] f;
  private float g;
  private float h;
  private float i;
  private int j;
  private int k;
  private s l;
  private float m;
  private float n;
  private float o;
  private int p;
  private int q;
  private int[] r;
  private int s;
  private Rect t;

  static
  {
    TextPaint localTextPaint = new TextPaint(1);
    a = localTextPaint;
    localTextPaint.setTextAlign(Paint.Align.CENTER);
  }

  public SegmentedControl(Context paramContext)
  {
    this(paramContext, null);
  }

  public SegmentedControl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771983);
  }

  public SegmentedControl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.SegmentedControl, paramInt, 0);
    int i1 = localTypedArray.getIndexCount();
    int i2 = 0;
    if (i2 < i1)
    {
      int i3 = localTypedArray.getIndex(i2);
      switch (i3)
      {
      default:
      case 6:
      case 7:
      case 8:
      case 4:
      case 5:
      case 9:
      case 3:
      case 2:
      case 1:
      case 0:
      }
      while (true)
      {
        i2++;
        break;
        this.d = ((StateListDrawable)localTypedArray.getDrawable(i3));
        continue;
        this.e = localTypedArray.getDrawable(i3);
        continue;
        this.f = localTypedArray.getTextArray(i3);
        this.r = new int[this.f.length];
        continue;
        this.i = localTypedArray.getDimension(i3, 14.0F);
        continue;
        this.j = localTypedArray.getColor(i3, -1);
        continue;
        this.k = (2 * localTypedArray.getDimensionPixelSize(i3, 0));
        continue;
        this.p = localTypedArray.getColor(i3, -16777216);
        continue;
        this.n = localTypedArray.getDimension(i3, 0.0F);
        continue;
        this.m = localTypedArray.getDimension(i3, 0.0F);
        continue;
        this.o = localTypedArray.getDimension(i3, 0.0F);
      }
    }
    localTypedArray.recycle();
    this.t = new Rect();
  }

  private int a(float paramFloat)
  {
    if (paramFloat < this.h)
      return 0;
    return 1;
  }

  public final void a()
  {
    if (this.c != null)
      this.c.a(this.q);
  }

  public final void a(int paramInt)
  {
    int[] arrayOfInt1 = this.r;
    int i1 = this.q;
    arrayOfInt1[i1] = (0xFFFFFFFD & arrayOfInt1[i1]);
    int[] arrayOfInt2 = this.r;
    arrayOfInt2[paramInt] = (0x2 | arrayOfInt2[paramInt]);
    this.q = paramInt;
    invalidate();
  }

  public final void a(e parame)
  {
    this.c = parame;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    StateListDrawable localStateListDrawable = this.d;
    Drawable localDrawable = this.e;
    float f1 = this.g;
    CharSequence[] arrayOfCharSequence = this.f;
    TextPaint localTextPaint = a;
    localTextPaint.setTextSize(this.i);
    localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
    localTextPaint.setColor(this.j);
    if (this.o > 0.0F)
      localTextPaint.setShadowLayer(this.o, this.m, this.n, this.p);
    localStateListDrawable.setState(View.EMPTY_STATE_SET);
    localStateListDrawable.draw(paramCanvas);
    float f2 = this.h;
    float f3 = getMeasuredHeight();
    float f4 = getMeasuredWidth() / 2;
    int i1 = arrayOfCharSequence.length;
    int i2 = 0;
    if (i2 < i1)
    {
      int i3 = this.r[i2];
      int i4;
      if (i3 != 0)
      {
        i4 = paramCanvas.save(2);
        paramCanvas.clipRect(f4 * i2, 0.0F, f4 * i2 + 1, f3);
        if ((i3 & 0x3) != 3)
          break label251;
        localStateListDrawable.setState(View.PRESSED_SELECTED_STATE_SET);
      }
      while (true)
      {
        localStateListDrawable.draw(paramCanvas);
        paramCanvas.restoreToCount(i4);
        paramCanvas.drawText(arrayOfCharSequence[i2], 0, arrayOfCharSequence[i2].length(), f2 / 2.0F * 1 + i2 * 2, f1, localTextPaint);
        i2++;
        break;
        label251: if ((i3 & 0x1) == 1)
          localStateListDrawable.setState(b);
        else if ((i3 & 0x2) == 2)
          localStateListDrawable.setState(View.SELECTED_STATE_SET);
      }
    }
    localDrawable.draw(paramCanvas);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    StateListDrawable localStateListDrawable = this.d;
    Drawable localDrawable = this.e;
    int i1 = localStateListDrawable.getIntrinsicHeight();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    int i4 = getPaddingTop();
    int i5 = i4 + i1;
    int i6 = getDefaultSize(i3 + (i2 + getSuggestedMinimumWidth()), paramInt1);
    int i7 = i1 + i4 + getPaddingBottom();
    int i8 = localDrawable.getIntrinsicWidth();
    int i9 = (i6 - i8) / 2;
    this.h = (i6 - i2 - i3) / this.f.length;
    this.t.set(i2, i4, i6 - i3, i5);
    localStateListDrawable.setBounds(this.t);
    localDrawable.setBounds(i9, i4, i9 + i8, i5);
    TextPaint localTextPaint = a;
    localTextPaint.setTextSize(this.i);
    localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
    this.g = ((i7 + localTextPaint.descent() - localTextPaint.ascent()) / 2.0F - this.k);
    setMeasuredDimension(i6, i7);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i1)
    {
    default:
    case 0:
      do
        return super.onTouchEvent(paramMotionEvent);
      while (!this.t.contains((int)f1, (int)f2));
      int i9 = a(f1);
      int[] arrayOfInt5 = this.r;
      arrayOfInt5[i9] = (0x1 | arrayOfInt5[i9]);
      this.s = i9;
      invalidate();
      return true;
    case 1:
      int[] arrayOfInt4 = this.r;
      int i6 = this.s;
      arrayOfInt4[i6] = (0xFFFFFFFE & arrayOfInt4[i6]);
      if (this.t.contains((int)f1, (int)f2))
      {
        int i7 = a(f1);
        int i8 = this.r[i7];
        if ((i7 == this.s) && ((i8 & 0x2) == 0))
        {
          a(i7);
          if (this.l == null)
            this.l = new s(this);
          if (!post(this.l))
            a();
        }
      }
      invalidate();
      return true;
    case 2:
      if (this.t.contains((int)f1, (int)f2))
      {
        int i4 = a(f1);
        if (this.s != i4)
        {
          int[] arrayOfInt3 = this.r;
          int i5 = this.s;
          arrayOfInt3[i5] = (0xFFFFFFFE & arrayOfInt3[i5]);
        }
      }
      while (true)
      {
        invalidate();
        return true;
        int[] arrayOfInt2 = this.r;
        int i3 = this.s;
        arrayOfInt2[i3] = (0xFFFFFFFE & arrayOfInt2[i3]);
      }
    case 3:
    }
    int[] arrayOfInt1 = this.r;
    int i2 = this.s;
    arrayOfInt1[i2] = (0xFFFFFFFE & arrayOfInt1[i2]);
    invalidate();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.SegmentedControl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
