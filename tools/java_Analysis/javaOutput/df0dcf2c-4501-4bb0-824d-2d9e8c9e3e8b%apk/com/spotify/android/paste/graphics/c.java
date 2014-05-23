package com.spotify.android.paste.graphics;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class c extends Drawable
{
  private final Drawable a;
  private float b;
  private final Paint c = new Paint(1);
  private final Paint d = new Paint(1);
  private ColorStateList e;
  private ColorStateList f;
  private int g = 255;
  private int h;
  private int i;

  public c(Drawable paramDrawable, float paramFloat)
  {
    if ((paramDrawable.getIntrinsicWidth() < 0) || (paramDrawable.getIntrinsicHeight() < 0))
      throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
    this.a = paramDrawable;
    this.b = paramFloat;
    this.d.setStyle(Paint.Style.FILL);
    this.c.setStyle(Paint.Style.STROKE);
    this.c.setStrokeWidth(0.0F);
  }

  private void a()
  {
    this.c.setAlpha(Color.alpha(this.h) * this.g / 255);
    this.d.setAlpha(Color.alpha(this.i) * this.g / 255);
  }

  private int b()
  {
    return (int)(Math.max(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight()) / this.b);
  }

  public final void a(float paramFloat)
  {
    if (paramFloat < 0.0F)
      throw new IllegalArgumentException("Negative strokeWidth is not supported.");
    this.c.setStrokeWidth(paramFloat);
    invalidateSelf();
  }

  public final void a(int paramInt)
  {
    this.f = ColorStateList.valueOf(paramInt);
    this.d.setColor(paramInt);
    this.i = paramInt;
    a();
    invalidateSelf();
  }

  public final void a(ColorStateList paramColorStateList)
  {
    this.e = paramColorStateList;
    onStateChange(getState());
    invalidateSelf();
  }

  public final void b(int paramInt)
  {
    this.e = ColorStateList.valueOf(paramInt);
    this.c.setColor(paramInt);
    this.h = paramInt;
    a();
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int j = paramCanvas.save();
    paramCanvas.translate(localRect.exactCenterX(), localRect.exactCenterY());
    float f1 = Math.min(localRect.width(), localRect.height());
    float f2 = f1 / 2.0F - this.c.getStrokeWidth() / 2.0F;
    paramCanvas.drawCircle(0.0F, 0.0F, f2, this.d);
    if (this.c.getStrokeWidth() > 0.0F)
      paramCanvas.drawCircle(0.0F, 0.0F, f2, this.c);
    int k = this.a.getIntrinsicWidth();
    int m = this.a.getIntrinsicHeight();
    float f3 = Math.max(k, m);
    paramCanvas.scale(f1 / f3, f1 / f3);
    paramCanvas.scale(this.b, this.b);
    paramCanvas.translate(-k / 2.0F, -m / 2.0F);
    this.a.draw(paramCanvas);
    paramCanvas.restoreToCount(j);
  }

  public final int getIntrinsicHeight()
  {
    return b();
  }

  public final int getIntrinsicWidth()
  {
    return b();
  }

  public final int getOpacity()
  {
    int j = this.d.getAlpha();
    int k;
    if (j == 0)
      k = -2;
    while (k == -1)
    {
      return -1;
      if (j == 255)
        k = -1;
      else
        k = -3;
    }
    if (k == -3)
      return -3;
    return this.a.getOpacity();
  }

  public final boolean isStateful()
  {
    return ((this.f != null) && (this.f.isStateful())) || ((this.e != null) && (this.e.isStateful())) || (this.a.isStateful());
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.a.setBounds(0, 0, this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight());
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.a.isStateful());
    for (boolean bool1 = false | this.a.setState(paramArrayOfInt); ; bool1 = false)
    {
      if (this.f != null)
      {
        int m = this.d.getColor();
        int n = this.f.getColorForState(paramArrayOfInt, m);
        this.d.setColor(n);
        this.i = n;
        if (n != m)
          bool1 = true;
      }
      else if (this.e != null)
      {
        int j = this.c.getColor();
        int k = this.e.getColorForState(paramArrayOfInt, j);
        this.c.setColor(k);
        this.h = k;
        if (k == j)
          break label147;
      }
      label147: for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 |= bool2;
        a();
        if (!bool1)
          break label153;
        invalidateSelf();
        return true;
        bool1 = false;
        break;
      }
      label153: return false;
    }
  }

  public final void setAlpha(int paramInt)
  {
    this.g = paramInt;
    a();
    this.a.setAlpha(paramInt);
    invalidateSelf();
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.d.setColorFilter(paramColorFilter);
    this.c.setColorFilter(paramColorFilter);
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
