package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.HeaderView;

public class ListHeaderView extends ViewGroup
{
  private final ImageView a;
  private final HeaderView b;
  private View c;

  public ListHeaderView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ListHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new ImageView(paramContext);
    this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.a.setColorFilter(-805306368);
    this.b = new HeaderView(paramContext);
    addView(this.a);
    addView(this.b);
  }

  public final ImageView a()
  {
    return this.a;
  }

  public final void a(View paramView)
  {
    if (this.c != null)
      removeView(this.c);
    this.c = paramView;
    if (paramView != null)
      addView(paramView);
    requestLayout();
  }

  public final HeaderView b()
  {
    return this.b;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    this.a.layout(0, 0, i, this.a.getMeasuredHeight());
    int j = this.b.getMeasuredHeight();
    this.b.layout(0, 0, i, j);
    if (this.c != null)
    {
      int k = (i - this.c.getMeasuredWidth()) / 2;
      this.c.layout(k, j, k + this.c.getMeasuredWidth(), j + this.c.getMeasuredHeight());
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 0)
      throw new RuntimeException("ListHeaderView doesn't support unspecified width.");
    int i = View.MeasureSpec.getSize(paramInt1);
    this.b.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    int j = this.b.getMeasuredHeight();
    int m;
    int k;
    if (this.c != null)
    {
      this.c.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
      m = this.c.getMeasuredHeight();
      k = d.a(16.0F, getResources());
    }
    while (true)
    {
      this.a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(k + (j + m), 1073741824));
      setMeasuredDimension(i, k + (m + j));
      return;
      k = 0;
      m = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.ListHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
