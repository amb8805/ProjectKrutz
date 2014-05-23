package com.spotify.android.paste.graphics;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class f extends Drawable
  implements Animatable, Runnable
{
  private static final int[] d = { 50, 100, 150, 200, 250 };
  private final Paint a = new Paint();
  private int b;
  private long c;

  public f()
  {
    this(-1);
  }

  public f(int paramInt)
  {
    this.a.setAntiAlias(true);
    this.a.setStyle(Paint.Style.FILL);
    this.b = paramInt;
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i = paramCanvas.save();
    paramCanvas.translate(localRect.centerX(), localRect.centerY());
    float f1 = getLevel() / 10000.0F;
    int j = Math.min(localRect.width(), localRect.height()) / 2;
    int k = 6 * (j * 2) / 64;
    int m = 0;
    if (m < 8)
    {
      paramCanvas.save();
      paramCanvas.translate(0.0F, -(j - k));
      Paint localPaint = this.a;
      float f2 = 12.0F * f1;
      float f3 = -1 + d.length - (f2 - m);
      float f4;
      int i1;
      int i2;
      if ((0.0F < f3) && (f3 < -1 + d.length))
      {
        f4 = f3 - (float)Math.floor(f3);
        i1 = d[(int)f3];
        i2 = d[(int)(f3 + 1.0F)];
      }
      for (int n = Color.argb((int)(i1 + f4 * i2 - i1), 255, 255, 255); ; n = Color.argb(d[0], 255, 255, 255))
      {
        localPaint.setColor(n);
        paramCanvas.drawCircle(0.0F, 0.0F, k, this.a);
        paramCanvas.restore();
        paramCanvas.rotate(45.0F);
        m++;
        break;
      }
    }
    paramCanvas.restoreToCount(i);
  }

  public final int getIntrinsicHeight()
  {
    return this.b;
  }

  public final int getIntrinsicWidth()
  {
    return this.b;
  }

  public final int getOpacity()
  {
    Paint localPaint = this.a;
    if (localPaint.getXfermode() == null)
    {
      int i = localPaint.getAlpha();
      if (i == 0)
        return -2;
      if (i == 255)
        return -1;
    }
    return -3;
  }

  public final boolean isRunning()
  {
    return this.c > 0L;
  }

  protected final boolean onLevelChange(int paramInt)
  {
    return true;
  }

  public final void run()
  {
    long l = SystemClock.uptimeMillis();
    setLevel((int)(10000L * ((l - this.c) % 1500L) / 1500L));
    invalidateSelf();
    scheduleSelf(this, l + 16L);
  }

  public final void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
    invalidateSelf();
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }

  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    if (paramBoolean1)
    {
      if ((bool) || (paramBoolean2))
      {
        this.c = 0L;
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
      this.c = SystemClock.uptimeMillis();
      scheduleSelf(this, this.c);
    }
  }

  public final void stop()
  {
    if (isRunning())
    {
      this.c = 0L;
      unscheduleSelf(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
