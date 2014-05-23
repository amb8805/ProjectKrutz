package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.spotify.mobile.android.ui.m;

public class BoundedRelativeLayout extends RelativeLayout
{
  private final int a;
  private final int b;

  public BoundedRelativeLayout(Context paramContext)
  {
    super(paramContext);
    this.b = 0;
    this.a = 0;
  }

  public BoundedRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.k);
    this.a = localTypedArray.getDimensionPixelSize(0, 0);
    this.b = localTypedArray.getDimensionPixelSize(1, 0);
    localTypedArray.recycle();
  }

  public BoundedRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    if ((this.a > 0) && (i > this.a))
    {
      int m = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.a, m);
    }
    int j = View.MeasureSpec.getSize(paramInt2);
    if ((this.b > 0) && (j > this.b))
    {
      int k = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(this.b, k);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.BoundedRelativeLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
