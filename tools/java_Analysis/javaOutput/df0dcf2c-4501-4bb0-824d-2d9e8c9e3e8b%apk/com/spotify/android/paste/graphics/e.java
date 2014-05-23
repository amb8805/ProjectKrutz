package com.spotify.android.paste.graphics;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

public final class e extends Drawable
{
  private SpotifyIcon a;
  private float b;
  private boolean c;
  private int d = -1;
  private int e = 255;
  private Paint f;
  private Path g;
  private Paint h;
  private boolean i;
  private ColorStateList j;
  private Rect k = new Rect();
  private float[] l = new float[1];
  private float m;
  private float n;

  public e(Context paramContext, SpotifyIcon paramSpotifyIcon)
  {
    this(paramContext, paramSpotifyIcon, d.b(paramSpotifyIcon.a(), paramContext.getResources()));
  }

  public e(Context paramContext, SpotifyIcon paramSpotifyIcon, float paramFloat)
  {
    this.a = paramSpotifyIcon;
    this.b = paramFloat;
    Typeface localTypeface = g.a(paramContext, "spoticon.ttf");
    this.f = new Paint();
    this.f.setColor(this.d);
    this.f.setTypeface(localTypeface);
    this.f.setTextSize(paramFloat);
    this.f.setTextAlign(Paint.Align.LEFT);
    this.f.setAntiAlias(true);
    b();
  }

  private void b()
  {
    this.f.getTextBounds(this.a.toString(), 0, 1, this.k);
    this.f.getTextWidths(this.a.toString(), 0, 1, this.l);
    this.n = this.f.getFontMetrics().top;
    this.m = (this.f.getFontMetrics().bottom - this.n);
    if (this.c)
    {
      this.g.reset();
      this.f.getTextPath(this.a.toString(), 0, 1, 0.0F, 0.0F, this.g);
      this.g.close();
    }
  }

  private void c()
  {
    this.f.setAlpha(Color.alpha(this.d) * this.e / 255);
  }

  public final void a()
  {
    if (!this.c)
      this.g = new Path();
    this.c = true;
    b();
    invalidateSelf();
  }

  public final void a(float paramFloat)
  {
    this.b = paramFloat;
    this.f.setTextSize(paramFloat);
    b();
    invalidateSelf();
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    this.f.setShadowLayer(paramFloat1, paramFloat2, paramFloat3, paramInt);
    invalidateSelf();
  }

  public final void a(int paramInt)
  {
    this.j = null;
    this.d = paramInt;
    this.f.setColor(paramInt);
    c();
    invalidateSelf();
  }

  public final void a(ColorStateList paramColorStateList)
  {
    this.j = paramColorStateList;
    onStateChange(getState());
    invalidateSelf();
  }

  public final void a(SpotifyIcon paramSpotifyIcon)
  {
    this.a = paramSpotifyIcon;
    b();
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    int i1 = paramCanvas.save();
    Rect localRect = getBounds();
    if (this.i)
    {
      this.h.setColor(-16776961);
      paramCanvas.drawRect(localRect, this.h);
    }
    paramCanvas.translate(localRect.centerX(), localRect.centerY());
    paramCanvas.translate(0.0F, -this.n);
    float f1 = this.l[0];
    float f2 = this.m;
    float f3;
    if (f1 / f2 > localRect.width() / localRect.height())
    {
      f3 = f1 / localRect.width();
      paramCanvas.scale(f3, f3);
      paramCanvas.translate(-f1 / 2.0F, -f2 / 2.0F);
      if (this.i)
      {
        this.h.setColor(-65536);
        paramCanvas.drawRect(this.k, this.h);
      }
      if (!this.c)
        break label191;
      paramCanvas.drawPath(this.g, this.f);
    }
    while (true)
    {
      paramCanvas.restoreToCount(i1);
      return;
      f3 = f2 / localRect.height();
      break;
      label191: paramCanvas.drawText(this.a.toString(), 0, 1, 0.0F, 0.0F, this.f);
    }
  }

  public final int getIntrinsicHeight()
  {
    return (int)this.m;
  }

  public final int getIntrinsicWidth()
  {
    return (int)this.l[0];
  }

  public final int getOpacity()
  {
    Paint localPaint = this.f;
    if (localPaint.getXfermode() == null)
    {
      int i1 = localPaint.getAlpha();
      if (i1 == 0)
        return -2;
      if (i1 == 255)
        return -1;
    }
    return -3;
  }

  public final boolean isStateful()
  {
    return this.j != null;
  }

  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.j == null)
      return false;
    int i1 = this.d;
    int i2 = this.j.getColorForState(paramArrayOfInt, i1);
    this.d = i2;
    this.f.setColor(i2);
    c();
    invalidateSelf();
    return true;
  }

  public final void setAlpha(int paramInt)
  {
    this.e = paramInt;
    c();
    invalidateSelf();
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.f.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
