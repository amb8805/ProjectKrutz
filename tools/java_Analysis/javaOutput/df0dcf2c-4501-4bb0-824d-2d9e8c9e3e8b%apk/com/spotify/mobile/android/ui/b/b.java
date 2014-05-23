package com.spotify.mobile.android.ui.b;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.o;

public final class b extends Drawable
{
  private static o f = new b.1();
  private final Bitmap a;
  private final Paint b;
  private final BitmapShader c;
  private final ColorFilter d;
  private final Matrix e = new Matrix();

  public b(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
      throw new NullPointerException("Bitmap cannot be null.");
    this.a = paramBitmap;
    this.b = new Paint(1);
    this.b.setStyle(Paint.Style.FILL);
    this.c = new BitmapShader(this.a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.d = new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_ATOP);
  }

  public static Drawable a(Drawable paramDrawable)
  {
    return new d(paramDrawable, 0.9F);
  }

  public static o a()
  {
    return f;
  }

  private int b()
  {
    return Math.min(this.a.getWidth(), this.a.getHeight());
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    float f1 = localRect.exactCenterX();
    float f2 = localRect.exactCenterY();
    int i = Math.min(localRect.width(), localRect.height());
    float f3 = i / 2.0F;
    this.e.reset();
    this.e.postTranslate(-f1, -f2);
    this.c.setLocalMatrix(this.e);
    paramCanvas.save();
    this.b.setShader(null);
    this.b.setColorFilter(this.d);
    paramCanvas.clipRect(0, 0, i, i);
    paramCanvas.translate(f1, f2);
    paramCanvas.scale(1.3F, 1.3F);
    paramCanvas.translate(-this.a.getWidth() / 2.0F, -this.a.getHeight() / 2.0F);
    paramCanvas.drawBitmap(this.a, 0.0F, 0.0F, this.b);
    paramCanvas.restore();
    paramCanvas.save();
    this.b.setShader(this.c);
    this.b.setColorFilter(null);
    paramCanvas.translate(f1, f2);
    paramCanvas.scale(0.9F, 0.9F);
    paramCanvas.drawCircle(0.0F, 0.0F, f3, this.b);
    paramCanvas.restore();
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
    Paint localPaint = this.b;
    if (localPaint.getXfermode() == null)
    {
      int i = localPaint.getAlpha();
      if (i == 0)
        return -2;
      if ((i == 255) && (!this.a.hasAlpha()))
        return -1;
    }
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
    this.b.setAlpha(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    throw new UnsupportedOperationException("Custom ColorFilters not supported");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
