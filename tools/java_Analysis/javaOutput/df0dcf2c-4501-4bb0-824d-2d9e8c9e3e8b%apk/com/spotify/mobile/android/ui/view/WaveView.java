package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;

public class WaveView extends View
{
  private static final int[] f = { 0, -1, -1, 0 };
  private static final float[] g = { 0.15F, 0.3F, 0.7F, 0.85F };
  private float a = 0.0F;
  private Path b = new Path();
  private Matrix c = new Matrix();
  private Matrix d = new Matrix();
  private Paint e = new Paint();
  private final LinearGradient h = new LinearGradient(0.0F, 0.0F, 1.0F, 0.0F, f, g, Shader.TileMode.CLAMP);
  private int i;
  private int j;
  private Animation k = new WaveView.1(this);

  public WaveView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e.setStrokeWidth(5.0F);
    this.e.setAntiAlias(true);
    this.e.setStyle(Paint.Style.STROKE);
    this.e.setShader(this.h);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (getAnimation() == null)
      startAnimation(this.k);
    this.c.reset();
    this.c.postTranslate(-this.i * this.a, 0.0F);
    this.b.transform(this.c);
    paramCanvas.drawPath(this.b, this.e);
    super.onDraw(paramCanvas);
    this.c.reset();
    this.c.postTranslate(this.i * this.a, 0.0F);
    this.b.transform(this.c);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.i = (getWidth() - getPaddingLeft() - getPaddingRight());
    this.j = (getHeight() - getPaddingTop() - getPaddingBottom());
    int m = this.j;
    int n = this.i;
    this.b.rewind();
    float f1 = m / 2.0F;
    this.b.moveTo(0.0F, f1);
    for (int i1 = 0; i1 < 8; i1++)
    {
      this.b.rQuadTo(n / 16.0F, -f1, n / 8.0F, 0.0F);
      this.b.rQuadTo(n / 16.0F, f1, n / 8.0F, 0.0F);
    }
    if (paramBoolean)
    {
      this.d.setScale(this.i, 1.0F);
      this.h.setLocalMatrix(this.d);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.WaveView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
