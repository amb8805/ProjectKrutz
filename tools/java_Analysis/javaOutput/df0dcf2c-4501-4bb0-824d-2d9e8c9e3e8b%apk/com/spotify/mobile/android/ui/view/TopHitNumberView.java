package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.spotify.mobile.android.util.dj;

public class TopHitNumberView extends TextView
{
  private Rect a = new Rect();
  private int b = 0;
  private boolean c;

  public TopHitNumberView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TopHitNumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772405);
  }

  public TopHitNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    this.b = 2;
  }

  public final void a(int paramInt)
  {
    if (this.c);
    for (String str = "%02d"; ; str = "%d")
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      setText(String.format(str, arrayOfObject));
      return;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    String str = getText().toString();
    int i = dj.a(getPaint());
    TextPaint localTextPaint = getPaint();
    localTextPaint.setColor(getCurrentTextColor());
    localTextPaint.drawableState = getDrawableState();
    paramCanvas.save();
    paramCanvas.translate(0.0F, -getPaint().getFontMetrics().top);
    for (int j = 0; j < str.length(); j++)
    {
      localTextPaint.getTextBounds(str, j, j + 1, this.a);
      paramCanvas.drawText(str, j, j + 1, i - this.a.width() / 2.0F, 0.0F, localTextPaint);
      paramCanvas.translate(i, 0.0F);
    }
    paramCanvas.restore();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
    int i = this.b;
    if (getText() == null);
    for (int j = 0; ; j = getText().length())
    {
      setMeasuredDimension(Math.max(i, j) * dj.a(getPaint()), (int)(localFontMetrics.bottom - localFontMetrics.top));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.TopHitNumberView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
