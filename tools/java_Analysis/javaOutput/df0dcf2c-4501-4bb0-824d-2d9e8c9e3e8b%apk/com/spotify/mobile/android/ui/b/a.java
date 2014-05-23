package com.spotify.mobile.android.ui.b;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.o;

public final class a extends Drawable
{
  private static o e = new a.1();
  private final Bitmap a;
  private final Paint b;
  private final BitmapShader c;
  private final Matrix d = new Matrix();

  public a(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
      throw new NullPointerException("Bitmap cannot be null.");
    this.a = paramBitmap;
    this.b = new Paint(1);
    this.b.setStyle(Paint.Style.FILL);
    this.c = new BitmapShader(this.a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.b.setShader(this.c);
  }

  public static o a()
  {
    return e;
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    float f1 = localRect.exactCenterX();
    float f2 = localRect.exactCenterY();
    float f3 = Math.min(localRect.width(), localRect.height()) / 2.0F;
    this.d.reset();
    this.d.postTranslate(-f1, -f2);
    this.c.setLocalMatrix(this.d);
    paramCanvas.save();
    paramCanvas.translate(f1, f2);
    paramCanvas.drawCircle(0.0F, 0.0F, f3, this.b);
    paramCanvas.restore();
  }

  public final int getIntrinsicHeight()
  {
    return this.a.getHeight();
  }

  public final int getIntrinsicWidth()
  {
    return this.a.getWidth();
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
 * Qualified Name:     com.spotify.mobile.android.ui.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
