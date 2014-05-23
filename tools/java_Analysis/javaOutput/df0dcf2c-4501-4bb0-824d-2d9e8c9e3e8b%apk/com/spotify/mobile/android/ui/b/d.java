package com.spotify.mobile.android.ui.b;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class d extends Drawable
{
  private final Drawable a;
  private final float b;

  public d(Drawable paramDrawable, float paramFloat)
  {
    this.a = paramDrawable;
    this.b = paramFloat;
    if ((paramDrawable.getIntrinsicWidth() < 0) || (paramDrawable.getIntrinsicHeight() < 0))
      throw new IllegalArgumentException("drawable must have an intrinsic size");
    this.a.setBounds(0, 0, this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight());
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    float f1 = this.a.getIntrinsicWidth();
    float f2 = this.a.getIntrinsicHeight();
    int i = paramCanvas.save();
    paramCanvas.translate(localRect.exactCenterX(), localRect.exactCenterY());
    float f3 = Math.min(localRect.width(), localRect.height());
    float f4 = Math.max(f1, f2);
    paramCanvas.scale(f3 / f4, f3 / f4);
    paramCanvas.scale(this.b, this.b);
    paramCanvas.translate(-f1 / 2.0F, -f2 / 2.0F);
    this.a.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }

  public final int getIntrinsicHeight()
  {
    return (int)(this.a.getIntrinsicHeight() / this.b);
  }

  public final int getIntrinsicWidth()
  {
    return (int)(this.a.getIntrinsicWidth() / this.b);
  }

  public final int getMinimumHeight()
  {
    return (int)(this.a.getMinimumHeight() / this.b);
  }

  public final int getMinimumWidth()
  {
    return (int)(this.a.getMinimumWidth() / this.b);
  }

  public final int getOpacity()
  {
    return this.a.getOpacity();
  }

  public final int[] getState()
  {
    return this.a.getState();
  }

  public final boolean isStateful()
  {
    return this.a.isStateful();
  }

  @TargetApi(11)
  public final void jumpToCurrentState()
  {
    this.a.jumpToCurrentState();
  }

  protected final boolean onLevelChange(int paramInt)
  {
    return this.a.setLevel(paramInt);
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    return this.a.setState(paramArrayOfInt);
  }

  public final void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }

  public final boolean setState(int[] paramArrayOfInt)
  {
    return this.a.setState(paramArrayOfInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
