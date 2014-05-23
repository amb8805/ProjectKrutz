package com.spotify.mobile.android.ui.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class c extends Drawable
  implements Animatable, Runnable
{
  private long a;
  private Drawable b;
  private Drawable c;
  private ColorFilter d;

  public c()
  {
  }

  private void a(Canvas paramCanvas, Drawable paramDrawable)
  {
    Rect localRect = getBounds();
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    int k = paramCanvas.save();
    if ((i < 0) || (j < 0))
    {
      paramDrawable.draw(paramCanvas);
      return;
    }
    if (i / j < localRect.width() / localRect.height());
    for (float f = localRect.width() / i; ; f = localRect.height() / j)
    {
      paramCanvas.translate(localRect.centerX(), localRect.centerY());
      paramCanvas.scale(f, f);
      paramCanvas.translate(-i / 2.0F, -j / 2.0F);
      paramDrawable.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
      return;
    }
  }

  public final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    stop();
    this.b = this.c;
    this.c = paramDrawable;
    if (this.b != null)
      this.b.setAlpha(255);
    if (this.c != null)
    {
      this.c.setBounds(0, 0, this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
      this.c.setColorFilter(this.d);
    }
    if (paramBoolean)
    {
      start();
      return;
    }
    setLevel(255);
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = paramCanvas.save();
    int j = getLevel();
    if ((isRunning()) && (this.b != null))
    {
      if (this.c == null)
        this.b.setAlpha(255 - j);
      a(paramCanvas, this.b);
    }
    if (this.c != null)
    {
      this.c.setAlpha(j);
      a(paramCanvas, this.c);
    }
    paramCanvas.restoreToCount(i);
    if (j == 255)
      stop();
  }

  public final int getOpacity()
  {
    int i = -2;
    if (this.b != null);
    for (int j = this.b.getOpacity(); ; j = i)
    {
      if (this.c != null)
        i = this.c.getOpacity();
      return resolveOpacity(j, i);
    }
  }

  public final boolean isRunning()
  {
    return this.a > 0L;
  }

  protected final boolean onLevelChange(int paramInt)
  {
    return true;
  }

  public final void run()
  {
    long l = SystemClock.uptimeMillis();
    setLevel((int)(255L * Math.min(l - this.a, 500L) / 500L));
    invalidateSelf();
    scheduleSelf(this, l + 16L);
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.d = paramColorFilter;
    if (this.b != null)
      this.b.setColorFilter(paramColorFilter);
    if (this.c != null)
      this.c.setColorFilter(paramColorFilter);
  }

  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (paramBoolean1)
    {
      if ((bool) || (paramBoolean2))
      {
        this.a = 0L;
        scheduleSelf(this, SystemClock.uptimeMillis());
      }
      return bool;
    }
    unscheduleSelf(this);
    return bool;
  }

  public final void start()
  {
    if (!isRunning())
    {
      this.a = SystemClock.uptimeMillis();
      if (this.b != null)
        this.b.setAlpha(255);
      scheduleSelf(this, this.a);
    }
  }

  public final void stop()
  {
    if (isRunning())
    {
      this.a = 0L;
      unscheduleSelf(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
