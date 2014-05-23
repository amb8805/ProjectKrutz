package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.ImageView;

final class aa extends Drawable
{
  private static final Paint f = new Paint();
  final Drawable a;
  Drawable b;
  long c;
  boolean d;
  int e = 255;
  private final boolean g;
  private final float h;
  private final Picasso.LoadedFrom i;

  private aa(Context paramContext, Drawable paramDrawable, Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom, boolean paramBoolean1, boolean paramBoolean2, o paramo)
  {
    Resources localResources = paramContext.getResources();
    this.g = paramBoolean2;
    this.h = localResources.getDisplayMetrics().density;
    this.i = paramLoadedFrom;
    if (paramo != null)
    {
      this.a = paramo.a(paramBitmap);
      if ((paramLoadedFrom == Picasso.LoadedFrom.a) || (paramBoolean1))
        break label114;
    }
    label114: for (int j = 1; ; j = 0)
    {
      if (j != 0)
      {
        this.b = paramDrawable;
        this.d = true;
        this.c = SystemClock.uptimeMillis();
      }
      return;
      this.a = new BitmapDrawable(localResources, paramBitmap);
      break;
    }
  }

  private static Path a(Point paramPoint, int paramInt)
  {
    Point localPoint1 = new Point(paramInt + paramPoint.x, paramPoint.y);
    Point localPoint2 = new Point(paramPoint.x, paramInt + paramPoint.y);
    Path localPath = new Path();
    localPath.moveTo(paramPoint.x, paramPoint.y);
    localPath.lineTo(localPoint1.x, localPoint1.y);
    localPath.lineTo(localPoint2.x, localPoint2.y);
    return localPath;
  }

  static void a(ImageView paramImageView, int paramInt, Drawable paramDrawable)
  {
    if (paramInt != 0)
      paramImageView.setImageResource(paramInt);
    while (true)
    {
      if ((paramImageView.getDrawable() instanceof AnimationDrawable))
        ((AnimationDrawable)paramImageView.getDrawable()).start();
      return;
      paramImageView.setImageDrawable(paramDrawable);
    }
  }

  static void a(ImageView paramImageView, Context paramContext, Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom, boolean paramBoolean1, boolean paramBoolean2, o paramo)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    if ((localDrawable instanceof AnimationDrawable))
      ((AnimationDrawable)localDrawable).stop();
    paramImageView.setImageDrawable(new aa(paramContext, localDrawable, paramBitmap, paramLoadedFrom, paramBoolean1, paramBoolean2, paramo));
  }

  public final void draw(Canvas paramCanvas)
  {
    if (!this.d)
      this.a.draw(paramCanvas);
    while (true)
    {
      if (this.g)
      {
        f.setColor(-1);
        paramCanvas.drawPath(a(new Point(0, 0), (int)(16.0F * this.h)), f);
        f.setColor(this.i.debugColor);
        paramCanvas.drawPath(a(new Point(0, 0), (int)(15.0F * this.h)), f);
      }
      return;
      float f1 = (float)(SystemClock.uptimeMillis() - this.c) / 200.0F;
      if (f1 >= 1.0F)
      {
        this.d = false;
        this.b = null;
        this.a.draw(paramCanvas);
      }
      else
      {
        if (this.b != null)
          this.b.draw(paramCanvas);
        int j = (int)(f1 * this.e);
        this.a.setAlpha(j);
        this.a.draw(paramCanvas);
        this.a.setAlpha(this.e);
        invalidateSelf();
      }
    }
  }

  public final int getIntrinsicHeight()
  {
    return this.a.getIntrinsicHeight();
  }

  public final int getIntrinsicWidth()
  {
    return this.a.getIntrinsicWidth();
  }

  public final int getOpacity()
  {
    return this.a.getOpacity();
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.a.setBounds(paramRect);
    if (this.b != null)
      this.b.setBounds(paramRect);
  }

  public final void setAlpha(int paramInt)
  {
    this.e = paramInt;
    if (this.b != null)
      this.b.setAlpha(paramInt);
    this.a.setAlpha(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.b != null)
      this.b.setColorFilter(paramColorFilter);
    this.a.setColorFilter(paramColorFilter);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
