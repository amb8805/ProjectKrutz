package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.View;

public class AmbilWarnaPrefWidgetView extends View
{
  Paint paint;
  float rectSize;
  float strokeWidth;

  public AmbilWarnaPrefWidgetView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.rectSize = FloatMath.floor(0.5F + 24.0F * f);
    this.strokeWidth = FloatMath.floor(0.5F + 1.0F * f);
    this.paint = new Paint();
    this.paint.setColor(-1);
    this.paint.setStyle(Paint.Style.STROKE);
    this.paint.setStrokeWidth(this.strokeWidth);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(this.strokeWidth, this.strokeWidth, this.rectSize - this.strokeWidth, this.rectSize - this.strokeWidth, this.paint);
  }
}

/* Location:
 * Qualified Name:     yuku.ambilwarna.widget.AmbilWarnaPrefWidgetView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
