package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

public class StatefulImageView extends ImageView
{
  private Paint a = new Paint();
  private int b;
  private int c;

  public StatefulImageView(Context paramContext)
  {
    super(paramContext);
    this.a.setColor(Color.argb(getResources().getInteger(2131558419), 127, 127, 127));
  }

  public StatefulImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a.setColor(Color.argb(getResources().getInteger(2131558419), 127, 127, 127));
  }

  public StatefulImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.setColor(Color.argb(getResources().getInteger(2131558419), 127, 127, 127));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!isEnabled())
      paramCanvas.drawRect(0.0F, 0.0F, this.c, this.b, this.a);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = getMeasuredWidth();
    this.b = getMeasuredHeight();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.StatefulImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
