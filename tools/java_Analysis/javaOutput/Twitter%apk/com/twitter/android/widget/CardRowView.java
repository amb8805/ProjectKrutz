package com.twitter.android.widget;

import ab;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.twitter.android.fq;

public class CardRowView extends ViewGroup
{
  private static final Paint a = new Paint(1);
  private static final Paint b = new Paint(3);
  private final float c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private final int h;
  private int i;
  private RectShape j;
  private RectShape k;
  private RectF l;
  private RectF m;

  static
  {
    a.setStyle(Paint.Style.FILL);
  }

  public CardRowView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CardRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771979);
  }

  public CardRowView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.CardRowView, paramInt, 0);
    this.i = localTypedArray.getInt(10, 0);
    this.c = localTypedArray.getFloat(9, 0.0F);
    this.h = localTypedArray.getDimensionPixelSize(11, 0);
    int n = localTypedArray.getColor(12, -3355444);
    Paint localPaint = a;
    float f1 = localTypedArray.getDimension(0, 0.0F);
    if (f1 > 0.0F)
      localPaint.setShadowLayer(f1, localTypedArray.getDimension(1, 0.0F), localTypedArray.getDimension(2, 0.0F), localTypedArray.getColor(3, -12303292));
    localPaint.setColor(n);
    int i1 = localTypedArray.getDimensionPixelOffset(4, 0);
    this.d = localTypedArray.getDimensionPixelOffset(5, i1);
    this.e = localTypedArray.getDimensionPixelOffset(6, i1);
    this.f = localTypedArray.getDimensionPixelOffset(7, i1);
    this.g = localTypedArray.getDimensionPixelOffset(8, i1);
    if (getBackground() == null)
      setBackgroundColor(17170445);
    super.setPadding(0, 0, 0, 0);
    localTypedArray.recycle();
  }

  private void a(float[] paramArrayOfFloat, RectF paramRectF)
  {
    if (paramArrayOfFloat != null)
    {
      RoundRectShape localRoundRectShape = new RoundRectShape(paramArrayOfFloat, null, null);
      localRoundRectShape.resize(paramRectF.width(), paramRectF.height());
      this.k = localRoundRectShape;
    }
  }

  public final void a(int paramInt)
  {
    if (paramInt != this.i)
    {
      this.i = paramInt;
      requestLayout();
      return;
    }
    invalidate();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 1)
    {
      if (paramInt1 == 0)
      {
        a(2);
        return;
      }
      if (paramInt1 == paramInt2 - 1)
      {
        a(4);
        return;
      }
      a(3);
      return;
    }
    a(1);
  }

  public void addView(View paramView)
  {
    addView(paramView, getChildCount());
  }

  public void addView(View paramView, int paramInt)
  {
    addView(paramView, paramInt, null);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("CardRowView can only hold a single child view.");
    super.addView(paramView, paramInt, paramLayoutParams);
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    addView(paramView, getChildCount(), paramLayoutParams);
  }

  public void draw(Canvas paramCanvas)
  {
    if ((this.i == 0) || (this.m == null))
    {
      super.draw(paramCanvas);
      return;
    }
    RectF localRectF = this.m;
    Paint localPaint = b;
    int n = paramCanvas.save(1);
    paramCanvas.translate(this.l.left, this.l.top);
    this.j.draw(paramCanvas, a);
    paramCanvas.restoreToCount(n);
    if ((this.i != 3) && (this.k != null))
    {
      int i1 = paramCanvas.saveLayer(localRectF, localPaint, 31);
      paramCanvas.save(1);
      paramCanvas.translate(localRectF.left, localRectF.top);
      this.k.draw(paramCanvas, localPaint);
      paramCanvas.restore();
      localPaint.setXfermode(ab.a);
      int i2 = paramCanvas.saveLayer(localRectF, localPaint, 31);
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(i2);
      paramCanvas.restoreToCount(i1);
      localPaint.setXfermode(null);
      return;
    }
    super.draw(paramCanvas);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      RectF localRectF8 = this.m;
      localView.layout((int)localRectF8.left, (int)localRectF8.top, (int)localRectF8.right, (int)localRectF8.bottom);
    }
    int n = this.i;
    if (n == 0)
      return;
    float f1 = this.c;
    switch (n)
    {
    default:
      return;
    case 1:
      RectF localRectF6 = this.m;
      float[] arrayOfFloat3 = { f1, f1, f1, f1, f1, f1, f1, f1 };
      RectF localRectF7 = this.l;
      RoundRectShape localRoundRectShape3 = new RoundRectShape(arrayOfFloat3, null, null);
      localRoundRectShape3.resize(localRectF7.width(), localRectF7.height());
      this.j = localRoundRectShape3;
      a(arrayOfFloat3, localRectF6);
      return;
    case 2:
      RectF localRectF4 = this.m;
      float[] arrayOfFloat2 = { f1, f1, f1, f1, 0.0F, 0.0F, 0.0F, 0.0F };
      RectF localRectF5 = this.l;
      RoundRectShape localRoundRectShape2 = new RoundRectShape(arrayOfFloat2, null, null);
      localRoundRectShape2.resize(localRectF5.width(), localRectF5.height());
      localRectF4.set(localRectF4.left, localRectF4.top, localRectF4.right, localRectF4.bottom);
      this.j = localRoundRectShape2;
      a(arrayOfFloat2, localRectF4);
      return;
    case 3:
      RectF localRectF3 = this.l;
      RectShape localRectShape = new RectShape();
      localRectShape.resize(localRectF3.width(), localRectF3.height());
      this.j = localRectShape;
      return;
    case 4:
    }
    RectF localRectF1 = this.m;
    float[] arrayOfFloat1 = { 0.0F, 0.0F, 0.0F, 0.0F, f1, f1, f1, f1 };
    RectF localRectF2 = this.l;
    RoundRectShape localRoundRectShape1 = new RoundRectShape(arrayOfFloat1, null, null);
    localRoundRectShape1.resize(localRectF2.width(), localRectF2.height());
    localRectF1.set(localRectF1.left, localRectF1.top, localRectF1.right, localRectF1.bottom);
    this.j = localRoundRectShape1;
    a(arrayOfFloat1, localRectF1);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    View localView = getChildAt(0);
    int n = this.i;
    if (n == 0)
    {
      measureChild(localView, paramInt1, paramInt2);
      int i14 = localView.getMeasuredWidth();
      int i15 = localView.getMeasuredHeight();
      this.m = new RectF(0.0F, 0.0F, i14, i15);
      setMeasuredDimension(i14, i15);
      return;
    }
    int i1 = this.d;
    int i2 = this.e;
    int i3 = this.f;
    int i4 = this.g;
    int i5 = this.h;
    int i6 = i1 + i3;
    int i7 = View.MeasureSpec.getMode(paramInt1);
    int i8 = View.MeasureSpec.getSize(paramInt1);
    int i10;
    if (i7 == 1073741824)
      i10 = i8;
    while (true)
    {
      measureChild(localView, getChildMeasureSpec(paramInt1, i6, localView.getLayoutParams().width), paramInt2);
      int i11 = localView.getMeasuredHeight();
      int i12 = i10 - i3;
      switch (n)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      int i9;
      while (true)
      {
        setMeasuredDimension(i10, i11);
        return;
        i9 = getSuggestedMinimumWidth();
        if (i7 != -2147483648)
          break label518;
        i10 = Math.min(i9, i8);
        break;
        i11 += i2 + i4;
        RectF localRectF4 = new RectF(i1, i2, i12, i11 - i4);
        this.l = new RectF(localRectF4);
        this.m = localRectF4;
        continue;
        int i13 = i11 + i2;
        RectF localRectF3 = new RectF(i1, i2, i12, i13);
        this.l = new RectF(localRectF3.left, localRectF3.top, localRectF3.right, 8.0F + localRectF3.bottom);
        this.m = localRectF3;
        i11 = i13 + i5;
        continue;
        RectF localRectF2 = new RectF(i1, 0.0F, i12, i11);
        this.l = new RectF(localRectF2.left, localRectF2.top - 8.0F, localRectF2.right, 8.0F + localRectF2.bottom);
        this.m = localRectF2;
        i11 += i5;
        continue;
        RectF localRectF1 = new RectF(i1, 0.0F, i12, i11);
        this.l = new RectF(localRectF1.left, localRectF1.top - 8.0F, localRectF1.right, localRectF1.bottom);
        this.m = localRectF1;
        i11 += i4;
      }
      label518: i10 = i9;
    }
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.CardRowView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
