package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.ad;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  static final v a = new w();
  private int b = -858993460;
  private int c;
  private Drawable d;
  private final int e;
  private boolean f;
  private View g;
  private float h;
  private float i;
  private int j;
  private boolean k;
  private int l;
  private float m;
  private float n;
  private u o;
  private final z p;
  private boolean q;
  private boolean r = true;
  private final Rect s = new Rect();
  private final ArrayList<s> t = new ArrayList();

  static
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 17)
    {
      a = new y();
      return;
    }
    if (i1 >= 16)
    {
      a = new x();
      return;
    }
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.e = (int)(0.5F + 32.0F * f1);
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    at.a(this, new r(this));
    at.d(this);
    this.p = z.a(this, 0.5F, new t(this, (byte)0));
    this.p.a(1);
    this.p.a(f1 * 400.0F);
  }

  private void a(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i1 = (int)(paramFloat * (0xFF000000 & paramInt) >>> 24) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.d == null)
        localLayoutParams.d = new Paint();
      localLayoutParams.d.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_OVER));
      if (at.e(paramView) != 2)
        at.a(paramView, 2, localLayoutParams.d);
      c(paramView);
    }
    while (at.e(paramView) == 0)
    {
      int i1;
      return;
    }
    if (localLayoutParams.d != null)
      localLayoutParams.d.setColorFilter(null);
    s locals = new s(this, paramView);
    this.t.add(locals);
    at.a(this, locals);
  }

  private boolean a(float paramFloat)
  {
    if (!this.f)
      return false;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    int i1 = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.j);
    if (this.p.a(this.g, i1, this.g.getTop()))
    {
      c();
      at.b(this);
      return true;
    }
    return false;
  }

  private void b(float paramFloat)
  {
    int i1 = 0;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    if ((localLayoutParams.c) && (localLayoutParams.leftMargin <= 0));
    for (int i2 = 1; ; i2 = 0)
    {
      int i3 = getChildCount();
      while (i1 < i3)
      {
        View localView = getChildAt(i1);
        if (localView != this.g)
        {
          int i4 = (int)((1.0F - this.i) * this.l);
          this.i = paramFloat;
          localView.offsetLeftAndRight(i4 - (int)((1.0F - paramFloat) * this.l));
          if (i2 != 0)
            a(localView, 1.0F - this.i, this.c);
        }
        i1++;
      }
    }
  }

  private void c(View paramView)
  {
    a.a(this, paramView);
  }

  private boolean d()
  {
    boolean bool1;
    if (!this.r)
    {
      boolean bool2 = a(0.0F);
      bool1 = false;
      if (!bool2);
    }
    else
    {
      this.q = false;
      bool1 = true;
    }
    return bool1;
  }

  final void a()
  {
    if (this.o != null);
    sendAccessibilityEvent(32);
  }

  final void a(View paramView)
  {
    int i1 = getPaddingLeft();
    int i2 = getWidth() - getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = getHeight() - getPaddingBottom();
    int i16;
    int i8;
    int i7;
    int i6;
    int i5;
    label75: int i10;
    label84: View localView;
    if (paramView != null)
      if (at.h(paramView))
      {
        i16 = 1;
        if (i16 == 0)
          break label241;
        i8 = paramView.getLeft();
        i7 = paramView.getRight();
        i6 = paramView.getTop();
        i5 = paramView.getBottom();
        int i9 = getChildCount();
        i10 = 0;
        if (i10 >= i9)
          return;
        localView = getChildAt(i10);
        if (localView == paramView)
          return;
        int i11 = Math.max(i1, localView.getLeft());
        int i12 = Math.max(i3, localView.getTop());
        int i13 = Math.min(i2, localView.getRight());
        int i14 = Math.min(i4, localView.getBottom());
        if ((i11 < i8) || (i12 < i6) || (i13 > i7) || (i14 > i5))
          break label256;
      }
    label256: for (int i15 = 4; ; i15 = 0)
    {
      localView.setVisibility(i15);
      i10++;
      break label84;
      if (Build.VERSION.SDK_INT < 18)
      {
        Drawable localDrawable = paramView.getBackground();
        if (localDrawable != null)
        {
          if (localDrawable.getOpacity() == -1)
          {
            i16 = 1;
            break;
          }
          i16 = 0;
          break;
        }
      }
      i16 = 0;
      break;
      label241: i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
      break label75;
    }
  }

  final void b()
  {
    if (this.o != null);
    sendAccessibilityEvent(32);
  }

  final boolean b(View paramView)
  {
    if (paramView == null)
      return false;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    return (this.f) && (localLayoutParams.c) && (this.h > 0.0F);
  }

  final void c()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 4)
        localView.setVisibility(0);
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if (this.p.g())
    {
      if (!this.f)
        this.p.f();
    }
    else
      return;
    at.b(this);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (getChildCount() > 1);
    for (View localView = getChildAt(1); (localView == null) || (this.d == null); localView = null)
      return;
    int i1 = this.d.getIntrinsicWidth();
    int i2 = localView.getLeft();
    int i3 = localView.getTop();
    int i4 = localView.getBottom();
    int i5 = i2 - i1;
    this.d.setBounds(i5, i3, i2, i4);
    this.d.draw(paramCanvas);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i1 = paramCanvas.save(2);
    if ((this.f) && (!localLayoutParams.b) && (this.g != null))
    {
      paramCanvas.getClipBounds(this.s);
      this.s.right = Math.min(this.s.right, this.g.getLeft());
      paramCanvas.clipRect(this.s);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT < 11)
    {
      if ((!localLayoutParams.c) || (this.h <= 0.0F))
        break label203;
      if (!paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(true);
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap != null)
      {
        paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.d);
        bool = false;
        paramCanvas.restoreToCount(i1);
        return bool;
      }
      Log.e("SlidingPaneLayout", "drawChild: child view " + paramView + " returned null drawing cache");
    }
    while (true)
    {
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      break;
      label203: if (paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(false);
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.r = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.r = true;
    int i1 = this.t.size();
    for (int i2 = 0; i2 < i1; i2++)
      ((s)this.t.get(i2)).run();
    this.t.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ad.a(paramMotionEvent);
    if ((!this.f) && (i1 == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
        if (z.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label101;
    }
    boolean bool1;
    label101: for (boolean bool2 = true; ; bool2 = false)
    {
      this.q = bool2;
      if ((this.f) && ((!this.k) || (i1 == 0)))
        break;
      this.p.e();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i1 == 3) || (i1 == 1))
    {
      this.p.e();
      return false;
    }
    switch (i1)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    label152: float f3;
    float f4;
    do
    {
      for (int i2 = 0; ; i2 = 1)
      {
        if (!this.p.a(paramMotionEvent))
        {
          bool1 = false;
          if (i2 == 0)
            break;
        }
        return true;
        this.k = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.m = f5;
        this.n = f6;
        if ((!z.b(this.g, (int)f5, (int)f6)) || (!b(this.g)))
          break label152;
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.m);
      f4 = Math.abs(f2 - this.n);
    }
    while ((f3 <= this.p.d()) || (f4 <= f3));
    this.p.e();
    this.k = true;
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt3 - paramInt1;
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    int i4 = getPaddingTop();
    int i5 = getChildCount();
    float f1;
    int i6;
    int i7;
    label67: int i11;
    boolean bool;
    label189: int i9;
    if (this.r)
    {
      if ((this.f) && (this.q))
      {
        f1 = 1.0F;
        this.h = f1;
      }
    }
    else
    {
      i6 = 0;
      i7 = i2;
      if (i6 >= i5)
        break label317;
      View localView = getChildAt(i6);
      if (localView.getVisibility() == 8)
        break label429;
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
      int i10 = localView.getMeasuredWidth();
      i11 = 0;
      if (!localLayoutParams.b)
        break label277;
      int i14 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i15 = Math.min(i2, i1 - i3 - this.e) - i7 - i14;
      this.j = i15;
      if (i15 + (i7 + localLayoutParams.leftMargin) + i10 / 2 <= i1 - i3)
        break label271;
      bool = true;
      localLayoutParams.c = bool;
      i9 = i7 + ((int)(i15 * this.h) + localLayoutParams.leftMargin);
      int i13 = i9 - i11;
      localView.layout(i13, i4, i13 + i10, i4 + localView.getMeasuredHeight());
      i2 += localView.getWidth();
    }
    while (true)
    {
      i6++;
      i7 = i9;
      break label67;
      f1 = 0.0F;
      break;
      label271: bool = false;
      break label189;
      label277: if ((this.f) && (this.l != 0));
      for (int i12 = (int)((1.0F - this.h) * this.l); ; i12 = 0)
      {
        i11 = i12;
        i9 = i2;
        break;
        label317: if (this.r)
        {
          if (!this.f)
            break label392;
          if (this.l != 0)
            b(this.h);
          if (((SlidingPaneLayout.LayoutParams)this.g.getLayoutParams()).c)
            a(this.g, this.h, this.b);
        }
        while (true)
        {
          a(this.g);
          this.r = false;
          return;
          label392: for (int i8 = 0; i8 < i5; i8++)
            a(getChildAt(i8), 0.0F, this.b);
        }
      }
      label429: i9 = i7;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    int i7;
    if (i1 != 1073741824)
      if (isInEditMode())
      {
        if ((i1 == -2147483648) || (i1 != 0))
          break label1097;
        i5 = i3;
        i6 = 300;
        i7 = i4;
      }
    while (true)
    {
      int i9;
      int i8;
      label94: boolean bool1;
      int i10;
      int i11;
      int i12;
      int i13;
      float f1;
      label148: View localView2;
      SlidingPaneLayout.LayoutParams localLayoutParams2;
      int i29;
      float f3;
      int i30;
      boolean bool4;
      switch (i5)
      {
      default:
        i9 = 0;
        i8 = -1;
        bool1 = false;
        i10 = i6 - getPaddingLeft() - getPaddingRight();
        i11 = getChildCount();
        if (i11 > 2)
          Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        this.g = null;
        i12 = 0;
        i13 = i9;
        f1 = 0.0F;
        if (i12 < i11)
        {
          localView2 = getChildAt(i12);
          localLayoutParams2 = (SlidingPaneLayout.LayoutParams)localView2.getLayoutParams();
          if (localView2.getVisibility() == 8)
          {
            localLayoutParams2.c = false;
            i29 = i10;
            f3 = f1;
            i30 = i13;
            bool4 = bool1;
          }
        }
      case 1073741824:
      case -2147483648:
      }
      while (true)
      {
        i12++;
        bool1 = bool4;
        i13 = i30;
        f1 = f3;
        i10 = i29;
        break label148;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i3 != 0)
          break label1097;
        if (isInEditMode())
        {
          if (i3 != 0)
            break label1097;
          i5 = -2147483648;
          i6 = i2;
          i7 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i9 = i7 - getPaddingTop() - getPaddingBottom();
        i8 = i9;
        break label94;
        i8 = i7 - getPaddingTop() - getPaddingBottom();
        i9 = 0;
        break label94;
        if (localLayoutParams2.a > 0.0F)
        {
          f1 += localLayoutParams2.a;
          if (localLayoutParams2.width == 0);
        }
        else
        {
          int i23 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
          int i24;
          label388: int i25;
          label408: int i28;
          if (localLayoutParams2.width == -2)
          {
            i24 = View.MeasureSpec.makeMeasureSpec(i6 - i23, -2147483648);
            if (localLayoutParams2.height != -2)
              break label562;
            i25 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
            localView2.measure(i24, i25);
            int i26 = localView2.getMeasuredWidth();
            int i27 = localView2.getMeasuredHeight();
            if ((i5 == -2147483648) && (i27 > i13))
              i13 = Math.min(i27, i8);
            i28 = i10 - i26;
            if (i28 >= 0)
              break label600;
          }
          label562: label600: for (boolean bool2 = true; ; bool2 = false)
          {
            localLayoutParams2.b = bool2;
            boolean bool3 = bool2 | bool1;
            if (localLayoutParams2.b)
              this.g = localView2;
            i29 = i28;
            i30 = i13;
            float f2 = f1;
            bool4 = bool3;
            f3 = f2;
            break;
            if (localLayoutParams2.width == -1)
            {
              i24 = View.MeasureSpec.makeMeasureSpec(i6 - i23, 1073741824);
              break label388;
            }
            i24 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label388;
            if (localLayoutParams2.height == -1)
            {
              i25 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
              break label408;
            }
            i25 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
            break label408;
          }
          if ((bool1) || (f1 > 0.0F))
          {
            int i14 = i6 - this.e;
            int i15 = 0;
            if (i15 < i11)
            {
              View localView1 = getChildAt(i15);
              SlidingPaneLayout.LayoutParams localLayoutParams1;
              int i16;
              label696: int i17;
              label704: int i22;
              if (localView1.getVisibility() != 8)
              {
                localLayoutParams1 = (SlidingPaneLayout.LayoutParams)localView1.getLayoutParams();
                if (localView1.getVisibility() != 8)
                {
                  if ((localLayoutParams1.width != 0) || (localLayoutParams1.a <= 0.0F))
                    break label789;
                  i16 = 1;
                  if (i16 == 0)
                    break label795;
                  i17 = 0;
                  if ((!bool1) || (localView1 == this.g))
                    break label859;
                  if ((localLayoutParams1.width < 0) && ((i17 > i14) || (localLayoutParams1.a > 0.0F)))
                  {
                    if (i16 == 0)
                      break label843;
                    if (localLayoutParams1.height != -2)
                      break label805;
                    i22 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                    label768: localView1.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i22);
                  }
                }
              }
              while (true)
              {
                i15++;
                break;
                label789: i16 = 0;
                break label696;
                label795: i17 = localView1.getMeasuredWidth();
                break label704;
                label805: if (localLayoutParams1.height == -1)
                {
                  i22 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                  break label768;
                }
                i22 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                break label768;
                label843: i22 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                break label768;
                label859: if (localLayoutParams1.a > 0.0F)
                {
                  int i18;
                  if (localLayoutParams1.width == 0)
                    if (localLayoutParams1.height == -2)
                      i18 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                  while (true)
                  {
                    if (!bool1)
                      break label1001;
                    int i20 = i6 - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                    int i21 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    if (i17 == i20)
                      break;
                    localView1.measure(i21, i18);
                    break;
                    if (localLayoutParams1.height == -1)
                    {
                      i18 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    else
                    {
                      i18 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                      continue;
                      i18 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                    }
                  }
                  label1001: int i19 = Math.max(0, i10);
                  localView1.measure(View.MeasureSpec.makeMeasureSpec(i17 + (int)(localLayoutParams1.a * i19 / f1), 1073741824), i18);
                }
              }
            }
          }
          setMeasuredDimension(i6, i13);
          this.f = bool1;
          if ((this.p.a() != 0) && (!bool1))
            this.p.f();
          return;
        }
        i29 = i10;
        f3 = f1;
        i30 = i13;
        bool4 = bool1;
      }
      label1097: i5 = i3;
      i6 = i2;
      i7 = i4;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a)
      if ((this.r) || (a(1.0F)))
        this.q = true;
    while (true)
    {
      this.q = localSavedState.a;
      return;
      d();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.f)
      if ((!this.f) || (this.h == 1.0F))
        bool = true;
    while (true)
    {
      localSavedState.a = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.q;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.r = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.f)
      return super.onTouchEvent(paramMotionEvent);
    this.p.b(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return true;
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.m = f5;
      this.n = f6;
      continue;
      if (b(this.g))
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        float f3 = f1 - this.m;
        float f4 = f2 - this.n;
        int i1 = this.p.d();
        if ((f3 * f3 + f4 * f4 < i1 * i1) && (z.b(this.g, (int)f1, (int)f2)))
          d();
      }
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.f))
      if (paramView1 != this.g)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.q = bool;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
