package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ah;
import android.support.v4.view.br;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.android.paste.b;
import com.spotify.android.paste.e;
import com.spotify.android.paste.graphics.d;

public class ViewPagerIndicator extends View
  implements br
{
  private int a;
  private int b;
  private float c;
  private Paint d;
  private Paint e;
  private ViewPager f;
  private br g;

  public ViewPagerIndicator(Context paramContext)
  {
    this(paramContext, null);
  }

  public ViewPagerIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.v);
  }

  public ViewPagerIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(ViewPagerIndicator.class, this);
    int i = d.b(10.0F, paramContext.getResources());
    int j = d.a(6.0F, paramContext.getResources());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.z, paramInt, 0);
    this.a = localTypedArray.getDimensionPixelSize(0, i);
    this.b = localTypedArray.getDimensionPixelOffset(1, j);
    int k = localTypedArray.getColor(2, -7829368);
    int m = localTypedArray.getColor(3, -1);
    localTypedArray.recycle();
    this.d = new Paint();
    this.d.setAntiAlias(true);
    this.d.setStyle(Paint.Style.FILL);
    this.d.setColor(k);
    this.e = new Paint();
    this.e.setAntiAlias(true);
    this.e.setStyle(Paint.Style.FILL);
    this.e.setColor(m);
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
    postInvalidate();
    if (this.g != null)
      this.g.a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    this.c = (paramFloat + paramInt1);
    postInvalidate();
    if (this.g != null)
      this.g.a(paramInt1, paramFloat, paramInt2);
  }

  public final void a(ViewPager paramViewPager)
  {
    this.f = paramViewPager;
    this.f.a(this);
    this.c = this.f.b();
    invalidate();
  }

  public final void b(int paramInt)
  {
    if (this.g != null)
      this.g.b(paramInt);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    if (this.f != null);
    for (int j = this.f.a().b(); j <= 1; j = 0)
      return;
    int k = paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    float f1 = this.a / 2;
    while (i < j)
    {
      paramCanvas.drawCircle(f1 + i * (this.a + this.b), f1, f1, this.d);
      i++;
    }
    paramCanvas.drawCircle(f1 + this.c * this.a + this.b, f1, f1, this.e);
    paramCanvas.restoreToCount(k);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.f != null);
    for (int i = this.f.a().b(); i <= 1; i = 0)
    {
      setVisibility(8);
      setMeasuredDimension(0, 0);
      return;
    }
    int j = i * this.a + (i - 1) * this.b;
    int k = this.a;
    setMeasuredDimension(j + (getPaddingLeft() + getPaddingRight()), k + (getPaddingTop() + getPaddingBottom()));
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.ViewPagerIndicator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
