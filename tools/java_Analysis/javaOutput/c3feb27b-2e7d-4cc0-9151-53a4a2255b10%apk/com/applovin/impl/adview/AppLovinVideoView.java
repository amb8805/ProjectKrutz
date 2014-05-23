package com.applovin.impl.adview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.VideoView;

public class AppLovinVideoView extends VideoView
{
  private int a = 0;
  private int b = 0;

  public AppLovinVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public AppLovinVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AppLovinVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.a <= 0) || (this.b <= 0))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    float f1 = this.b / getHeight();
    float f2 = this.a / getWidth();
    int i;
    if (f1 > f2)
      i = (int)Math.ceil(this.b / f1);
    for (int j = (int)Math.ceil(this.a / f1); ; j = (int)Math.ceil(this.a / f2))
    {
      setMeasuredDimension(j, i);
      return;
      i = (int)Math.ceil(this.b / f2);
    }
  }

  public void setVideoSize(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    getHolder().setFixedSize(paramInt1, paramInt2);
    try
    {
      requestLayout();
      invalidate();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AppLovinVideoView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
