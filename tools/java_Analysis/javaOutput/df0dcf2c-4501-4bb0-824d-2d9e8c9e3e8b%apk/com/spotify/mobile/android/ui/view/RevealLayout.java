package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.spotify.mobile.android.util.ac;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cp;

public class RevealLayout extends ViewGroup
{
  private s a;
  private t b;
  private MainLayout c;
  private GradientView d;
  private int e;
  private float f = 0.0F;
  private boolean g;
  private float h;
  private float i;
  private boolean j;
  private float k;
  private float l;
  private float m;
  private boolean n;
  private float o = getResources().getDisplayMetrics().density;
  private cp p;
  private float q = (0.0F / 0.0F);

  public RevealLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.p = new cp(paramContext);
    this.k = (10.0F * this.o);
    this.e = getResources().getDimensionPixelSize(2131427447);
    this.i = getResources().getFraction(2131492866, 1, 1);
  }

  private void c()
  {
    if (this.c == null)
    {
      this.d = ((GradientView)cc.a(findViewById(2131362518), "No view with @id/content_shadow in RevealLayout"));
      this.c = ((MainLayout)cc.a(findViewById(2131362447), "No view with @id/content in RevealLayout"));
    }
  }

  public final void a(s params)
  {
    this.a = params;
  }

  public final void a(t paramt)
  {
    this.b = paramt;
  }

  public final void a(boolean paramBoolean)
  {
    c();
    boolean bool = this.g;
    this.g = false;
    this.c.a(false);
    if (paramBoolean)
    {
      if (this.p.a())
        this.p.a((int)(this.e * this.f), 0, 0, this.e);
      this.p.b(0);
      this.p.a(getResources().getInteger(2131558422));
    }
    while (true)
    {
      at.b(this);
      if ((bool) && (this.a != null))
        this.a.E();
      return;
      this.p.b();
      this.f = 0.0F;
    }
  }

  public final boolean a()
  {
    return this.g;
  }

  public final void b()
  {
    c();
    boolean bool = this.g;
    this.g = true;
    this.c.a(true);
    if (this.p.a())
      this.p.a((int)(this.e * this.f), 0, 0, this.e);
    this.p.b(this.e);
    this.p.a(getResources().getInteger(2131558422));
    at.b(this);
    if ((!bool) && (this.a != null))
      this.a.D();
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    int i1 = 0;
    int i5;
    if (this.p.d())
    {
      this.f = (this.p.c() / this.e);
      if (!this.p.a())
        at.b(this);
      if (this.p.a())
        break label163;
      i5 = 1;
      if (!ac.a)
        if (i5 == 0)
          break label169;
    }
    label163: label169: for (int i6 = 2; ; i6 = 0)
    {
      getChildAt(0).setLayerType(i6, null);
      this.c.setLayerType(i6, null);
      if (Float.compare(this.f, this.q) == 0)
        break label239;
      int i2 = (int)(-this.e * (1.0D - this.f) * this.i);
      while (i1 < -1 + getChildCount())
      {
        View localView = getChildAt(i1);
        localView.offsetLeftAndRight(i2 - localView.getLeft());
        i1++;
      }
      i5 = 0;
      break;
    }
    int i3 = (int)(this.e * this.f);
    this.c.offsetLeftAndRight(i3 - this.c.getLeft());
    int i4 = this.c.getLeft() - this.d.getMeasuredWidth();
    this.d.offsetLeftAndRight(i4 - this.d.getLeft());
    label239: if (this.b != null)
      this.b.a(this.f);
    this.q = this.f;
    super.dispatchDraw(paramCanvas);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    paramCanvas.save();
    if (paramView != this.c)
      paramCanvas.clipRect(0.0F, 0.0F, this.e * this.f, paramCanvas.getHeight());
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restore();
    return bool;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.p.a())
      return false;
    if (paramMotionEvent.getAction() == 0)
    {
      this.p.e();
      this.j = true;
      this.l = paramMotionEvent.getRawX();
      this.m = paramMotionEvent.getRawY();
      if ((!this.g) && (paramMotionEvent.getX() <= 10.0F * this.o))
      {
        this.n = true;
        this.h = 0.2F;
        return true;
      }
      if (this.c.a())
      {
        float f1 = paramMotionEvent.getRawX();
        float f2 = paramMotionEvent.getRawY();
        int[] arrayOfInt = new int[2];
        Rect localRect = new Rect();
        View localView = this.c.b();
        localView.getLocationOnScreen(arrayOfInt);
        localView.getDrawingRect(localRect);
        localRect.offsetTo(arrayOfInt[0], arrayOfInt[1]);
        if (localRect.contains((int)f1, (int)f2))
        {
          this.n = true;
          this.h = 0.8F;
          return true;
        }
      }
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (int i1 = 0; i1 < -1 + getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      localView.layout(localView.getLeft(), 0, localView.getLeft() + localView.getMeasuredWidth(), localView.getMeasuredHeight());
    }
    this.c.layout(this.c.getLeft(), 0, this.c.getLeft() + this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
    int i2 = this.c.getLeft();
    int i3 = i2 - this.d.getMeasuredWidth();
    this.d.layout(i3, 0, i2, getHeight());
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    c();
    while (i1 < -1 + getChildCount())
    {
      getChildAt(i1).measure(View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      i1++;
    }
    this.d.measure(View.MeasureSpec.makeMeasureSpec(this.d.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    this.c.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.n)
      return super.onTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 2:
      while (true)
      {
        return true;
        if (this.j)
        {
          float f1 = paramMotionEvent.getRawX() - this.l;
          float f2 = paramMotionEvent.getRawY() - this.m;
          boolean bool1 = f1 * f1 + f2 * f2 < this.k * this.k;
          boolean bool2 = false;
          if (bool1)
            bool2 = true;
          this.j = bool2;
        }
        this.f = Math.max(0.0F, Math.min(paramMotionEvent.getX() / this.e, 1.0F));
        at.b(this);
      }
    case 3:
      this.n = false;
      this.j = false;
      return false;
    case 1:
    }
    this.n = false;
    if (this.j)
    {
      a(true);
      return false;
    }
    if (this.f <= this.h)
    {
      a(true);
      return false;
    }
    b();
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.RevealLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
