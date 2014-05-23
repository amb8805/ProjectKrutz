package yuku.ambilwarna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;

public class AmbilWarnaKotak extends View
{
  final float[] color = { 1.0F, 1.0F, 1.0F };
  Shader luar;
  Paint paint;

  public AmbilWarnaKotak(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AmbilWarnaKotak(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.paint == null)
    {
      this.paint = new Paint();
      this.luar = new LinearGradient(0.0F, 0.0F, 0.0F, getMeasuredHeight(), -1, -16777216, Shader.TileMode.CLAMP);
    }
    int i = Color.HSVToColor(this.color);
    LinearGradient localLinearGradient = new LinearGradient(0.0F, 0.0F, getMeasuredWidth(), 0.0F, -1, i, Shader.TileMode.CLAMP);
    ComposeShader localComposeShader = new ComposeShader(this.luar, localLinearGradient, PorterDuff.Mode.MULTIPLY);
    this.paint.setShader(localComposeShader);
    paramCanvas.drawRect(0.0F, 0.0F, getMeasuredWidth(), getMeasuredHeight(), this.paint);
  }

  void setHue(float paramFloat)
  {
    this.color[0] = paramFloat;
    invalidate();
  }
}

/* Location:
 * Qualified Name:     yuku.ambilwarna.AmbilWarnaKotak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
