package com.spotify.mobile.android.spotlets.artist;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.squareup.picasso.al;

final class f
  implements al
{
  private final int a;
  private final int b;

  public f(int paramInt)
  {
    this.a = paramInt;
    this.b = 0;
  }

  public final Bitmap a(Bitmap paramBitmap)
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setShader(new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    new Canvas(localBitmap).drawRoundRect(new RectF(this.b, this.b, paramBitmap.getWidth() - this.b, paramBitmap.getHeight() - this.b), this.a, this.a, localPaint);
    if (paramBitmap != localBitmap)
      paramBitmap.recycle();
    return localBitmap;
  }

  public final String a()
  {
    return "rounded";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
