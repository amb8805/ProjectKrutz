package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.spotify.mobile.android.ui.m;
import com.spotify.mobile.android.util.bp;

public class AspectRatioFrameLayout extends FrameLayout
{
  private float a = 1.0F;
  private boolean b = false;
  private boolean c = false;

  public AspectRatioFrameLayout(Context paramContext)
  {
    super(paramContext);
  }

  public AspectRatioFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.j);
    int j = localTypedArray.getIndexCount();
    if (i < j)
    {
      int k = localTypedArray.getIndex(i);
      switch (k)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        i++;
        break;
        this.a = localTypedArray.getFloat(k, this.a);
        continue;
        this.b = localTypedArray.getBoolean(k, this.b);
        continue;
        this.c = localTypedArray.getBoolean(k, this.c);
      }
    }
    localTypedArray.recycle();
  }

  public final void a(float paramFloat)
  {
    this.a = paramFloat;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int j = getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
    if ((i == 0) && (j == 0))
    {
      bp.d("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    if (i == 0)
      i = Math.round(j * this.a);
    while (true)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
      return;
      if (j == 0)
        j = Math.round(i / this.a);
      else if (this.a > i / j)
      {
        if (!this.c)
          j = Math.round(i / this.a);
      }
      else if (!this.b)
        i = Math.round(j * this.a);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.AspectRatioFrameLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
