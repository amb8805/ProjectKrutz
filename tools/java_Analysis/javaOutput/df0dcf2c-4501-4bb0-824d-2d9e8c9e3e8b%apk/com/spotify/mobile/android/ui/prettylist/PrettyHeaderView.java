package com.spotify.mobile.android.ui.prettylist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.android.paste.widget.HeaderView;

public class PrettyHeaderView extends ViewGroup
{
  private a a = a.a;
  private final ImageView b;
  private final HeaderView c;
  private String d;
  private boolean e = true;
  private View f;
  private int g;
  private int h;
  private int i;
  private int j = 0;

  public PrettyHeaderView(Context paramContext)
  {
    this(paramContext, null);
  }

  public PrettyHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PrettyHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = new ImageView(paramContext);
    this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.b.setColorFilter(paramContext.getResources().getColor(2131296307));
    this.b.setBackgroundResource(2130837620);
    this.c = new HeaderView(paramContext);
    addView(this.b);
    addView(this.c);
  }

  private int a(float paramFloat)
  {
    return -(int)((1.0F - paramFloat) * this.b.getMeasuredHeight() - getMeasuredHeight());
  }

  private int d()
  {
    int k = this.g + this.h;
    if (this.e)
      k += this.c.getMeasuredHeight();
    View localView = this.f;
    int m = 0;
    if (localView != null)
      m = this.f.getMeasuredHeight();
    return k + m / 2;
  }

  public final ImageView a()
  {
    return this.b;
  }

  public final void a(int paramInt)
  {
    this.g = paramInt;
  }

  public final void a(int paramInt, float paramFloat)
  {
    this.j = paramInt;
    if (this.e)
    {
      int k = Math.max(paramInt - this.g, 0);
      this.c.offsetTopAndBottom(k + this.i - this.c.getTop());
      invalidate();
    }
    if (this.e)
    {
      float f2 = Math.max(0.0F, Math.min(9.5F - 10.0F * paramFloat, 1.0F));
      com.d.c.a.a(this.c, f2);
    }
    float f1 = paramInt / getHeight();
    this.b.offsetTopAndBottom(a(f1) - this.b.getTop());
    at.b(this.b);
    post(new PrettyHeaderView.1(this, paramFloat));
  }

  public final void a(View paramView)
  {
    if (this.f != null)
      removeView(this.f);
    this.f = paramView;
    if (paramView != null)
      addView(paramView);
    requestLayout();
  }

  public final void a(a parama)
  {
    this.a = parama;
  }

  public final void a(String paramString)
  {
    this.d = paramString;
    this.c.a(paramString);
    this.a.a(paramString);
  }

  public final HeaderView b()
  {
    return this.c;
  }

  public final void b(int paramInt)
  {
    this.h = paramInt;
  }

  public final int c()
  {
    return this.g;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    if ((paramView == this.b) || (paramView == this.c))
    {
      paramCanvas.save();
      paramCanvas.clipRect(0, 0, getWidth(), d());
      boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restore();
      return bool;
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = paramInt3 - paramInt1;
    int m = a(this.j / getHeight());
    this.b.layout(0, m, k, m + this.b.getMeasuredHeight());
    int n = this.g + this.h;
    this.i = n;
    if (this.e)
    {
      int i2 = n + Math.max(this.j - this.g, 0);
      int i3 = this.c.getMeasuredHeight();
      this.c.layout(0, i2, k, i2 + i3);
      n += i3;
    }
    if (this.f != null)
    {
      int i1 = (k - this.f.getMeasuredWidth()) / 2;
      this.f.layout(i1, n, i1 + this.f.getMeasuredWidth(), n + this.f.getMeasuredHeight());
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 0)
      paramInt1 = View.MeasureSpec.makeMeasureSpec(200, 1073741824);
    int k = View.MeasureSpec.getSize(paramInt1);
    if (this.f != null)
      this.f.measure(View.MeasureSpec.makeMeasureSpec(k, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
    for (int m = this.f.getMeasuredHeight(); ; m = 0)
    {
      boolean bool = this.e;
      int n = 0;
      if (bool)
      {
        int i3 = View.MeasureSpec.getMode(paramInt2);
        if ((i3 == 1073741824) || (i3 == -2147483648))
          paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2) - m - this.h - this.g, 1073741824);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), paramInt2);
        n = this.c.getMeasuredHeight();
      }
      int i1 = m + (n + (this.g + this.h));
      int i2 = (int)(1.4F * d());
      this.b.measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
      setMeasuredDimension(k, i1);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.PrettyHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
