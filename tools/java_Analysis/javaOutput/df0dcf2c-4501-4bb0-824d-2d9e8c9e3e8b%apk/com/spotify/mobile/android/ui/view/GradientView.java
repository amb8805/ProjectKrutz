package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.mobile.android.ui.m;

public class GradientView extends View
{
  private GradientDrawable a;
  private int[] b;
  private GradientDrawable.Orientation c;

  public GradientView(Context paramContext)
  {
    super(paramContext);
    this.c = GradientDrawable.Orientation.LEFT_RIGHT;
    this.b = new int[] { -16777216, -1 };
    setBackgroundDrawable(null);
  }

  public GradientView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i;
    if (!isInEditMode())
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.q);
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = localTypedArray.getColor(0, -16777216);
      arrayOfInt[1] = localTypedArray.getColor(1, -1);
      this.b = arrayOfInt;
      i = (int)localTypedArray.getFloat(2, 0.0F);
      localTypedArray.recycle();
    }
    while (true)
    {
      a(i);
      setBackgroundDrawable(null);
      return;
      this.b = new int[] { -16777216, -1 };
      i = 0;
    }
  }

  public final void a(int paramInt)
  {
    this.c = GradientDrawable.Orientation.LEFT_RIGHT;
    switch (paramInt / 90)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.a = null;
      return;
      this.c = GradientDrawable.Orientation.LEFT_RIGHT;
      continue;
      this.c = GradientDrawable.Orientation.BOTTOM_TOP;
      continue;
      this.c = GradientDrawable.Orientation.RIGHT_LEFT;
      continue;
      this.c = GradientDrawable.Orientation.TOP_BOTTOM;
    }
  }

  public final void b(int paramInt)
  {
    this.b[0] = paramInt;
    this.a = null;
  }

  public final void c(int paramInt)
  {
    this.b[1] = paramInt;
    this.a = null;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a == null)
      this.a = new GradientDrawable(this.c, this.b);
    this.a.draw(paramCanvas);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a == null)
      this.a = new GradientDrawable(this.c, this.b);
    this.a.setBounds(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.GradientView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
