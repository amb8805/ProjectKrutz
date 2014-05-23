package com.spotify.android.paste.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.android.paste.graphics.d;

public class ThrobberView extends View
{
  private com.spotify.android.paste.graphics.f a;

  public ThrobberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ThrobberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(ThrobberView.class, this);
    this.a = new com.spotify.android.paste.graphics.f(d.b(64.0F, paramContext.getResources()));
    this.a.setCallback(this);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.a.start();
  }

  protected void onDetachedFromWindow()
  {
    this.a.stop();
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    this.a.draw(paramCanvas);
    paramCanvas.restore();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.a.getIntrinsicWidth();
    int j = this.a.getIntrinsicHeight();
    setMeasuredDimension(getDefaultSize(i, paramInt1), getDefaultSize(j, paramInt2));
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 - (getPaddingLeft() + getPaddingRight());
    int j = paramInt2 - (getPaddingTop() + getPaddingBottom());
    this.a.setBounds(0, 0, i, j);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return paramDrawable == this.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.ThrobberView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
