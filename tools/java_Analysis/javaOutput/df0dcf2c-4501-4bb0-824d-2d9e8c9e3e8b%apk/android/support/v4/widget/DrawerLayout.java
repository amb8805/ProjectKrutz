package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.ad;
import android.support.v4.view.at;
import android.support.v4.view.bh;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private int b;
  private int c = -1728053248;
  private float d;
  private Paint e = new Paint();
  private final z f;
  private final z g;
  private final g h;
  private final g i;
  private int j;
  private boolean k;
  private boolean l = true;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private f q;
  private float r;
  private float s;
  private Drawable t;
  private Drawable u;

  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f1 = getResources().getDisplayMetrics().density;
    this.b = (int)(0.5F + 64.0F * f1);
    float f2 = f1 * 400.0F;
    this.h = new g(this, 3);
    this.i = new g(this, 5);
    this.f = z.a(this, 1.0F, this.h);
    this.f.a(1);
    this.f.a(f2);
    this.h.a(this.f);
    this.g = z.a(this, 1.0F, this.i);
    this.g.a(2);
    this.g.a(f2);
    this.i.a(this.g);
    setFocusableInTouchMode(true);
    at.a(this, new e(this));
    bh.a(this);
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = o.a(paramInt2, at.f(this));
    z localz;
    if (i1 == 3)
    {
      this.m = paramInt1;
      if (paramInt1 != 0)
      {
        if (i1 != 3)
          break label78;
        localz = this.f;
        label34: localz.e();
      }
      switch (paramInt1)
      {
      default:
      case 2:
      case 1:
      }
    }
    label78: View localView1;
    do
    {
      View localView2;
      do
      {
        return;
        if (i1 != 5)
          break;
        this.n = paramInt1;
        break;
        localz = this.g;
        break label34;
        localView2 = a(i1);
      }
      while (localView2 == null);
      g(localView2);
      return;
      localView1 = a(i1);
    }
    while (localView1 == null);
    d(localView1);
  }

  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool = false;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      if ((c(localView)) && ((!paramBoolean) || (localLayoutParams.c)))
      {
        int i3 = localView.getWidth();
        if (!a(localView, 3))
          break label103;
        bool |= this.f.a(localView, -i3, localView.getTop());
      }
      while (true)
      {
        localLayoutParams.c = false;
        i2++;
        break;
        label103: bool |= this.g.a(localView, getWidth(), localView.getTop());
      }
    }
    this.h.a();
    this.i.a();
    if (bool)
      invalidate();
  }

  static float b(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).b;
  }

  private static String b(int paramInt)
  {
    if ((paramInt & 0x3) == 3)
      return "LEFT";
    if ((paramInt & 0x5) == 5)
      return "RIGHT";
    return Integer.toHexString(paramInt);
  }

  static boolean c(View paramView)
  {
    return (0x7 & o.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, at.f(paramView))) != 0;
  }

  private int e(View paramView)
  {
    return o.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, at.f(this));
  }

  private static boolean f(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a == 0;
  }

  private View g()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (c(localView))
      {
        if (!c(localView))
          throw new IllegalArgumentException("View " + localView + " is not a drawer");
        if (((DrawerLayout.LayoutParams)localView.getLayoutParams()).b > 0.0F);
        for (int i3 = 1; i3 != 0; i3 = 0)
          return localView;
      }
    }
    return null;
  }

  private void g(View paramView)
  {
    if (!c(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.l)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 1.0F;
      localLayoutParams.d = true;
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
        this.f.a(paramView, 0, paramView.getTop());
      else
        this.g.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
    }
  }

  public final int a(View paramView)
  {
    int i1 = e(paramView);
    if (i1 == 3)
      return this.m;
    if (i1 == 5)
      return this.n;
    return 0;
  }

  final View a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (((DrawerLayout.LayoutParams)localView.getLayoutParams()).d)
        return localView;
    }
    return null;
  }

  final View a(int paramInt)
  {
    int i1 = 0x7 & o.a(paramInt, at.f(this));
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      View localView = getChildAt(i3);
      if ((0x7 & e(localView)) == i1)
        return localView;
    }
    return null;
  }

  final void a(int paramInt, View paramView)
  {
    int i1 = this.f.a();
    int i2 = this.g.a();
    int i3;
    DrawerLayout.LayoutParams localLayoutParams1;
    if ((i1 == 1) || (i2 == 1))
    {
      i3 = 1;
      if ((paramView != null) && (paramInt == 0))
      {
        localLayoutParams1 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams1.b != 0.0F)
          break label154;
        DrawerLayout.LayoutParams localLayoutParams3 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams3.d)
        {
          localLayoutParams3.d = false;
          if (this.q != null)
            this.q.b();
          sendAccessibilityEvent(32);
        }
      }
    }
    while (true)
    {
      if (i3 != this.j)
      {
        this.j = i3;
        if (this.q == null);
      }
      return;
      if ((i1 == 2) || (i2 == 2))
      {
        i3 = 2;
        break;
      }
      i3 = 0;
      break;
      label154: if (localLayoutParams1.b == 1.0F)
      {
        DrawerLayout.LayoutParams localLayoutParams2 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (!localLayoutParams2.d)
        {
          localLayoutParams2.d = true;
          if (this.q != null)
            this.q.a();
          paramView.sendAccessibilityEvent(32);
        }
      }
    }
  }

  public final void a(f paramf)
  {
    this.q = paramf;
  }

  final void a(View paramView, float paramFloat)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    if (paramFloat == localLayoutParams.b);
    do
    {
      return;
      localLayoutParams.b = paramFloat;
    }
    while (this.q == null);
    this.q.a(paramFloat);
  }

  final boolean a(View paramView, int paramInt)
  {
    return (paramInt & e(paramView)) == paramInt;
  }

  public final void b()
  {
    View localView = a(3);
    if (localView == null)
      throw new IllegalArgumentException("No drawer view found with gravity " + b(3));
    g(localView);
  }

  public final void c()
  {
    View localView = a(3);
    if (localView == null)
      throw new IllegalArgumentException("No drawer view found with gravity " + b(3));
    d(localView);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof DrawerLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++)
      f1 = Math.max(f1, ((DrawerLayout.LayoutParams)getChildAt(i2).getLayoutParams()).b);
    this.d = f1;
    if ((this.f.g() | this.g.g()))
      at.b(this);
  }

  public final void d(View paramView)
  {
    if (!c(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.l)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 0.0F;
      localLayoutParams.d = false;
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
        this.f.a(paramView, -paramView.getWidth(), paramView.getTop());
      else
        this.g.a(paramView, getWidth(), paramView.getTop());
    }
  }

  public final boolean d()
  {
    View localView = a(3);
    if (localView != null)
    {
      if (!c(localView))
        throw new IllegalArgumentException("View " + localView + " is not a drawer");
      return ((DrawerLayout.LayoutParams)localView.getLayoutParams()).d;
    }
    return false;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = f(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    int i15;
    View localView;
    int i17;
    label94: int i18;
    if (bool1)
    {
      int i14 = getChildCount();
      i15 = 0;
      if (i15 < i14)
      {
        localView = getChildAt(i15);
        if ((localView != paramView) && (localView.getVisibility() == 0))
        {
          Drawable localDrawable = localView.getBackground();
          if (localDrawable != null)
            if (localDrawable.getOpacity() == -1)
            {
              i17 = 1;
              if ((i17 == 0) || (!c(localView)) || (localView.getHeight() < i1))
                break label185;
              if (!a(localView, 3))
                break label171;
              i18 = localView.getRight();
              if (i18 <= i4)
                break label520;
            }
        }
      }
    }
    while (true)
    {
      i4 = i18;
      int i16 = i2;
      while (true)
      {
        i15++;
        i2 = i16;
        break;
        i17 = 0;
        break label94;
        i17 = 0;
        break label94;
        label171: i16 = localView.getLeft();
        if (i16 >= i2)
          label185: i16 = i2;
      }
      paramCanvas.clipRect(i4, 0, i2, getHeight());
      int i5 = i2;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.d > 0.0F) && (bool1))
      {
        int i13 = (int)((0xFF000000 & this.c) >>> 24 * this.d) << 24 | 0xFFFFFF & this.c;
        this.e.setColor(i13);
        paramCanvas.drawRect(i4, 0.0F, i5, getHeight(), this.e);
      }
      do
      {
        return bool2;
        if ((this.t != null) && (a(paramView, 3)))
        {
          int i10 = this.t.getIntrinsicWidth();
          int i11 = paramView.getRight();
          int i12 = this.f.b();
          float f2 = Math.max(0.0F, Math.min(i11 / i12, 1.0F));
          this.t.setBounds(i11, paramView.getTop(), i10 + i11, paramView.getBottom());
          this.t.setAlpha((int)(255.0F * f2));
          this.t.draw(paramCanvas);
          return bool2;
        }
      }
      while ((this.u == null) || (!a(paramView, 5)));
      int i6 = this.u.getIntrinsicWidth();
      int i7 = paramView.getLeft();
      int i8 = getWidth() - i7;
      int i9 = this.g.b();
      float f1 = Math.max(0.0F, Math.min(i8 / i9, 1.0F));
      this.u.setBounds(i7 - i6, paramView.getTop(), i7, paramView.getBottom());
      this.u.setAlpha((int)(255.0F * f1));
      this.u.draw(paramCanvas);
      return bool2;
      label520: i18 = i4;
    }
  }

  final void e()
  {
    int i1 = 0;
    if (!this.p)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i2 = getChildCount();
      while (i1 < i2)
      {
        getChildAt(i1).dispatchTouchEvent(localMotionEvent);
        i1++;
      }
      localMotionEvent.recycle();
      this.p = true;
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new DrawerLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new DrawerLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof DrawerLayout.LayoutParams))
      return new DrawerLayout.LayoutParams((DrawerLayout.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new DrawerLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new DrawerLayout.LayoutParams(paramLayoutParams);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.l = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.l = true;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ad.a(paramMotionEvent);
    boolean bool1 = this.f.a(paramMotionEvent) | this.g.a(paramMotionEvent);
    label59: int i4;
    label77: int i5;
    switch (i1)
    {
    default:
      i2 = 0;
      if ((!bool1) && (i2 == 0))
      {
        int i3 = getChildCount();
        i4 = 0;
        if (i4 >= i3)
          break label252;
        if (!((DrawerLayout.LayoutParams)getChildAt(i4).getLayoutParams()).c)
          break;
        i5 = 1;
        if (i5 == 0)
        {
          boolean bool3 = this.p;
          bool2 = false;
          if (!bool3)
            break label127;
        }
      }
      boolean bool2 = true;
      return bool2;
    case 0:
      label105: label127: float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.r = f1;
      this.s = f2;
      if ((this.d <= 0.0F) || (!f(this.f.b((int)f1, (int)f2))));
    case 2:
    case 1:
    case 3:
    }
    for (int i2 = 1; ; i2 = 0)
    {
      this.o = false;
      this.p = false;
      break label59;
      if (!this.f.h())
        break;
      this.h.a();
      this.i.a();
      i2 = 0;
      break label59;
      a(true);
      this.o = false;
      this.p = false;
      break;
      i4++;
      break label77;
      label252: i5 = 0;
      break label105;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (g() != null);
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        s.c(paramKeyEvent);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      View localView = g();
      if ((localView != null) && (a(localView) == 0))
        a(false);
      boolean bool = false;
      if (localView != null)
        bool = true;
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.k = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    while (i3 < i2)
    {
      View localView = getChildAt(i3);
      DrawerLayout.LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if (f(localView))
          localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
      }
      else
      {
        i3++;
        continue;
      }
      int i4 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      int i6;
      float f1;
      label158: int i7;
      if (a(localView, 3))
      {
        i6 = -i4 + (int)(i4 * localLayoutParams.b);
        f1 = i4 + i6 / i4;
        if (f1 == localLayoutParams.b)
          break label309;
        i7 = 1;
        label172: switch (0x70 & localLayoutParams.a)
        {
        default:
          localView.layout(i6, localLayoutParams.topMargin, i4 + i6, i5 + localLayoutParams.topMargin);
          label233: if (i7 != 0)
            a(localView, f1);
          if (localLayoutParams.b <= 0.0F);
        case 80:
        case 16:
        }
      }
      for (int i10 = 0; localView.getVisibility() != i10; i10 = 4)
      {
        localView.setVisibility(i10);
        break;
        i6 = i1 - (int)(i4 * localLayoutParams.b);
        f1 = i1 - i6 / i4;
        break label158;
        label309: i7 = 0;
        break label172;
        int i11 = paramInt4 - paramInt2;
        localView.layout(i6, i11 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), i4 + i6, i11 - localLayoutParams.bottomMargin);
        break label233;
        int i8 = paramInt4 - paramInt2;
        int i9 = (i8 - i5) / 2;
        if (i9 < localLayoutParams.topMargin)
          i9 = localLayoutParams.topMargin;
        while (true)
        {
          localView.layout(i6, i9, i4 + i6, i5 + i9);
          break;
          if (i9 + i5 > i8 - localLayoutParams.bottomMargin)
            i9 = i8 - localLayoutParams.bottomMargin - i5;
        }
      }
    }
    this.k = false;
    this.l = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 300;
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt1);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    if ((i2 != 1073741824) || (i3 != 1073741824))
      if (isInEditMode())
      {
        if ((i2 != -2147483648) && (i2 == 0))
          i4 = i1;
        if ((i3 == -2147483648) || (i3 != 0))
          break label358;
      }
    while (true)
    {
      setMeasuredDimension(i4, i1);
      int i6 = getChildCount();
      int i7 = 0;
      if (i7 < i6)
      {
        View localView = getChildAt(i7);
        DrawerLayout.LayoutParams localLayoutParams;
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if (!f(localView))
            break label200;
          localView.measure(View.MeasureSpec.makeMeasureSpec(i4 - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
        }
        while (true)
        {
          i7++;
          break;
          throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
          label200: if (!c(localView))
            break label314;
          int i8 = 0x7 & e(localView);
          if ((i8 & 0x0) != 0)
            throw new IllegalStateException("Child drawer has absolute gravity " + b(i8) + " but this DrawerLayout already has a drawer view along that edge");
          localView.measure(getChildMeasureSpec(paramInt1, this.b + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
        }
        label314: throw new IllegalStateException("Child " + localView + " at index " + i7 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      }
      return;
      label358: i1 = i5;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    DrawerLayout.SavedState localSavedState = (DrawerLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a != 0)
    {
      View localView = a(localSavedState.a);
      if (localView != null)
        g(localView);
    }
    a(localSavedState.b, 3);
    a(localSavedState.c, 5);
  }

  protected Parcelable onSaveInstanceState()
  {
    DrawerLayout.SavedState localSavedState = new DrawerLayout.SavedState(super.onSaveInstanceState());
    int i1 = getChildCount();
    for (int i2 = 0; ; i2++)
      if (i2 < i1)
      {
        View localView = getChildAt(i2);
        if (c(localView))
        {
          DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if (localLayoutParams.d)
            localSavedState.a = localLayoutParams.a;
        }
      }
      else
      {
        localSavedState.b = this.m;
        localSavedState.c = this.n;
        return localSavedState;
      }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.f.b(paramMotionEvent);
    this.g.b(paramMotionEvent);
    boolean bool;
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 2:
    default:
      return true;
    case 0:
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.r = f5;
      this.s = f6;
      this.o = false;
      this.p = false;
      return true;
    case 1:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      View localView1 = this.f.b((int)f1, (int)f2);
      if ((localView1 != null) && (f(localView1)))
      {
        float f3 = f1 - this.r;
        float f4 = f2 - this.s;
        int i1 = this.f.d();
        if (f3 * f3 + f4 * f4 < i1 * i1)
        {
          View localView2 = a();
          if (localView2 != null)
            if (a(localView2) == 2)
              bool = true;
        }
      }
    case 3:
    }
    while (true)
    {
      a(bool);
      this.o = false;
      return true;
      bool = false;
      continue;
      a(true);
      this.o = false;
      this.p = false;
      return true;
      bool = true;
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.o = paramBoolean;
    if (paramBoolean)
      a(true);
  }

  public void requestLayout()
  {
    if (!this.k)
      super.requestLayout();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.DrawerLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
