package com.spotify.mobile.android.spotlets.artist.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;

public final class h<V extends View> extends Drawable
{
  private final V a;

  private h(V paramV)
  {
    this.a = paramV;
  }

  public static <V extends View> h<V> a(V paramV)
  {
    return new h(paramV);
  }

  public final V a()
  {
    return this.a;
  }

  public final void draw(Canvas paramCanvas)
  {
    this.a.draw(paramCanvas);
  }

  public final int getOpacity()
  {
    return -1;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 - paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt4 - paramInt2, 1073741824));
    this.a.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
