package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Checkable;
import android.widget.ListAdapter;
import it.sephiroth.android.library.a.b;;
import java.lang.reflect.Field;
import java.util.ArrayList;

@TargetApi(11)
public abstract class AbsHListView extends AdapterView<ListAdapter>
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnTouchModeChangeListener
{
  static final Interpolator T = new LinearInterpolator();
  public static final int[] U = { 0 };
  protected int A;
  int B;
  int C;
  int D;
  int E;
  protected int F = -1;
  int G;
  int H;
  protected i I;
  protected int J = 0;
  protected boolean K;
  boolean L;
  protected int M = -1;
  protected int N;
  protected Runnable O;
  protected final boolean[] P = new boolean[1];
  int Q;
  int R;
  protected boolean S;
  it.sephiroth.android.library.a.b a;
  private c aA;
  private Runnable aB;
  private b aC;
  private h aD;
  private Runnable aE;
  private int aF;
  private int aG;
  private boolean aH;
  private int aI = 0;
  private int aJ;
  private Runnable aK;
  private int aL;
  private int aM;
  private float aN = 1.0F;
  private int aO = -1;
  private s aP;
  private s aQ;
  private int aR;
  private int aS;
  private int aT = 0;
  private boolean aU;
  private int aV;
  private int aW;
  private f aX;
  private int aY;
  private int aZ;
  private VelocityTracker at;
  private e au;
  private g av;
  private boolean aw = true;
  private Rect ax;
  private ContextMenu.ContextMenuInfo ay = null;
  private int az = -1;
  protected int b = 0;
  private int ba;
  private AbsHListView.SavedState bb;
  private float bc;
  public Object c;
  Object d;
  int e;
  protected SparseBooleanArray f;
  android.support.v4.c.e<Integer> g;
  protected int h = 0;
  protected a i;
  protected ListAdapter j;
  boolean k;
  boolean l = false;
  Drawable m;
  int n = -1;
  protected Rect o = new Rect();
  protected final j p = new j(this);
  int q = 0;
  int r = 0;
  int s = 0;
  int t = 0;
  protected Rect u = new Rect();
  protected int v = 0;
  View w;
  View x;
  protected boolean y;
  protected boolean z;

  public AbsHListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, paramContext.getResources().getIdentifier("sephiroth_absHListViewStyle", "attr", paramContext.getPackageName()));
  }

  public AbsHListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setClickable(true);
    setFocusableInTouchMode(true);
    setWillNotDraw(false);
    setAlwaysDrawnWithCacheEnabled(false);
    b(true);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.aJ = localViewConfiguration.getScaledTouchSlop();
    this.aL = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.aM = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.Q = localViewConfiguration.getScaledOverscrollDistance();
    this.R = localViewConfiguration.getScaledOverflingDistance();
    int i1 = Build.VERSION.SDK_INT;
    Object localObject;
    int[] arrayOfInt;
    if (i1 >= 16)
    {
      localObject = new it.sephiroth.android.library.a.c.a(this);
      this.a = ((it.sephiroth.android.library.a.b)localObject);
      arrayOfInt = (int[])a(paramContext, "AbsHListView");
      if (arrayOfInt == null)
        break label625;
    }
    label625: for (TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0); ; localTypedArray = null)
    {
      boolean bool1 = true;
      boolean bool2 = true;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      boolean bool3 = false;
      boolean bool4 = false;
      Drawable localDrawable = null;
      if (localTypedArray != null)
      {
        localDrawable = localTypedArray.getDrawable(0);
        bool4 = localTypedArray.getBoolean(1, false);
        bool3 = localTypedArray.getBoolean(6, false);
        bool1 = localTypedArray.getBoolean(2, true);
        i4 = localTypedArray.getInt(7, 0);
        i3 = localTypedArray.getColor(3, 0);
        bool2 = localTypedArray.getBoolean(5, true);
        i2 = localTypedArray.getInt(4, 0);
        localTypedArray.recycle();
      }
      if (localDrawable != null)
        a(localDrawable);
      this.l = bool4;
      if (this.K != bool3)
      {
        this.K = bool3;
        if (getChildCount() > 0)
        {
          d();
          requestLayout();
          invalidate();
        }
      }
      b(bool1);
      this.aF = i4;
      e(i3);
      this.aw = bool2;
      this.b = i2;
      if ((Build.VERSION.SDK_INT >= 11) && (this.c != null))
      {
        if (Build.VERSION.SDK_INT >= 11)
          ((ActionMode)this.c).finish();
        this.c = null;
      }
      if (this.b != 0)
      {
        if (this.f == null)
          this.f = new SparseBooleanArray();
        if ((this.g == null) && (this.j != null) && (this.j.hasStableIds()))
          this.g = new android.support.v4.c.e();
        if ((Build.VERSION.SDK_INT >= 11) && (this.b == 3))
        {
          b();
          setLongClickable(true);
        }
      }
      return;
      if (i1 >= 14)
      {
        localObject = new it.sephiroth.android.library.a.b.a(this);
        break;
      }
      localObject = new it.sephiroth.android.library.a.c(this);
      break;
    }
  }

  private boolean A()
  {
    int i1 = getChildCount();
    if (i1 == 0);
    do
    {
      return true;
      if (i1 != this.an)
        return false;
    }
    while ((getChildAt(0).getLeft() >= this.u.left) && (getChildAt(i1 - 1).getRight() <= getWidth() - this.u.right));
    return false;
  }

  private boolean B()
  {
    switch (this.F)
    {
    default:
      return false;
    case 1:
    case 2:
    }
    return true;
  }

  private void C()
  {
    if (this.m != null)
    {
      if (h())
        this.m.setState(getDrawableState());
    }
    else
      return;
    this.m.setState(U);
  }

  @TargetApi(11)
  private void D()
  {
    if ((this.a.a()) && ((getParent() instanceof View)))
      ((View)getParent()).invalidate();
  }

  private void E()
  {
    if (this.at == null)
      this.at = VelocityTracker.obtain();
  }

  private void F()
  {
    if (this.at != null)
    {
      this.at.recycle();
      this.at = null;
    }
  }

  private void G()
  {
    if ((this.L) && (!this.y) && (!this.a.a()))
    {
      setChildrenDrawnWithCacheEnabled(true);
      setChildrenDrawingCacheEnabled(true);
      this.z = true;
      this.y = true;
    }
  }

  private void H()
  {
    if (!this.a.a())
    {
      if (this.aK == null)
        this.aK = new AbsHListView.2(this);
      post(this.aK);
    }
  }

  private boolean I()
  {
    int i1 = getChildCount();
    if (i1 <= 0)
      return false;
    int i2 = this.u.left;
    int i3 = getRight() - getLeft() - this.u.right;
    int i4 = this.V;
    int i5 = this.M;
    int i9;
    boolean bool;
    int i10;
    if ((i5 >= i4) && (i5 < i4 + i1))
    {
      View localView2 = getChildAt(i5 - this.V);
      int i26 = localView2.getLeft();
      int i27 = localView2.getRight();
      if (i26 < i2)
        i9 = i2 + getHorizontalFadingEdgeLength();
      for (bool = true; ; bool = true)
      {
        this.M = -1;
        removeCallbacks(this.au);
        if (this.I != null)
          this.I.a();
        this.F = -1;
        H();
        this.W = i9;
        i10 = a(i5, bool);
        if ((i10 < i4) || (i10 > v()))
          break label485;
        this.h = 4;
        C();
        d(i10);
        c();
        label197: a(0);
        if (i10 < 0)
          break;
        return true;
        if (i27 > i3)
          i26 = i3 - localView2.getMeasuredWidth() - getHorizontalFadingEdgeLength();
        i9 = i26;
      }
    }
    int i18;
    int i19;
    label252: int i20;
    int i23;
    int i22;
    if (i5 < i4)
    {
      i18 = 0;
      i19 = 0;
      if (i18 < i1)
      {
        i20 = getChildAt(i18).getLeft();
        if (i18 != 0)
          break label535;
        if ((i4 <= 0) && (i20 >= i2))
          break label525;
        i23 = i2 + getHorizontalFadingEdgeLength();
        i22 = i20;
      }
    }
    while (true)
    {
      if (i20 >= i23)
      {
        int i25 = i4 + i18;
        i9 = i20;
        i5 = i25;
        bool = true;
        break;
      }
      i18++;
      int i24 = i23;
      i19 = i22;
      i2 = i24;
      break label252;
      i5 = i4;
      i9 = i19;
      bool = true;
      break;
      int i6 = this.an;
      int i7 = -1 + (i4 + i1);
      int i8 = i1 - 1;
      i9 = 0;
      label378: if (i8 >= 0)
      {
        View localView1 = getChildAt(i8);
        int i11 = localView1.getLeft();
        int i12 = localView1.getRight();
        int i15;
        int i14;
        if (i8 == i1 - 1)
          if ((i4 + i1 < i6) || (i12 > i3))
          {
            i15 = i3 - getHorizontalFadingEdgeLength();
            i14 = i11;
          }
        while (true)
        {
          if (i12 <= i15)
          {
            int i17 = i4 + i8;
            i9 = i11;
            i5 = i17;
            bool = false;
            break;
          }
          i8--;
          int i16 = i15;
          i9 = i14;
          i3 = i16;
          break label378;
          i10 = -1;
          break label197;
          i15 = i3;
          i14 = i11;
          continue;
          int i13 = i3;
          i14 = i9;
          i15 = i13;
        }
      }
      label485: i5 = i7;
      bool = false;
      break;
      label525: i23 = i2;
      i22 = i20;
      continue;
      label535: int i21 = i2;
      i22 = i19;
      i23 = i21;
    }
  }

  private void J()
  {
    if (this.aP != null)
    {
      this.aP.b();
      this.aQ.b();
    }
  }

  static View a(ArrayList<View> paramArrayList, int paramInt)
  {
    int i1 = paramArrayList.size();
    if (i1 > 0)
    {
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = (View)paramArrayList.get(i2);
        if (((AbsHListView.LayoutParams)localView.getLayoutParams()).d == paramInt)
        {
          paramArrayList.remove(i2);
          return localView;
        }
      }
      return (View)paramArrayList.remove(i1 - 1);
    }
    return null;
  }

  public static final <T> T a(Context paramContext, String paramString)
  {
    try
    {
      Field localField = Class.forName(paramContext.getPackageName() + ".R$styleable").getField(paramString);
      Object localObject1 = null;
      if (localField != null)
      {
        Object localObject2 = localField.get(null);
        localObject1 = localObject2;
      }
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return null;
  }

  private void a(Canvas paramCanvas)
  {
    if (!this.o.isEmpty())
    {
      Drawable localDrawable = this.m;
      localDrawable.setBounds(this.o);
      localDrawable.draw(paramCanvas);
    }
  }

  private void a(Drawable paramDrawable)
  {
    if (this.m != null)
    {
      this.m.setCallback(null);
      unscheduleDrawable(this.m);
    }
    this.m = paramDrawable;
    Rect localRect = new Rect();
    paramDrawable.getPadding(localRect);
    this.q = localRect.left;
    this.r = localRect.top;
    this.s = localRect.right;
    this.t = localRect.bottom;
    paramDrawable.setCallback(this);
    C();
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = (0xFF00 & paramMotionEvent.getAction()) >> 8;
    if (paramMotionEvent.getPointerId(i1) == this.aO)
      if (i1 != 0)
        break label65;
    label65: for (int i2 = 1; ; i2 = 0)
    {
      this.D = (int)paramMotionEvent.getX(i2);
      this.E = (int)paramMotionEvent.getY(i2);
      this.H = 0;
      this.aO = paramMotionEvent.getPointerId(i2);
      return;
    }
  }

  private int b(int paramInt1, int paramInt2)
  {
    Rect localRect = this.ax;
    if (localRect == null)
    {
      this.ax = new Rect();
      localRect = this.ax;
    }
    for (int i1 = -1 + getChildCount(); i1 >= 0; i1--)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        localView.getHitRect(localRect);
        if (localRect.contains(paramInt1, paramInt2))
          return i1 + this.V;
      }
    }
    return -1;
  }

  private void b(boolean paramBoolean)
  {
    if ((this.L) && (!paramBoolean))
      H();
    this.L = paramBoolean;
  }

  private static ContextMenu.ContextMenuInfo c(View paramView, int paramInt, long paramLong)
  {
    return new m(paramView, paramInt, paramLong);
  }

  private boolean j(int paramInt)
  {
    int i1 = paramInt - this.D;
    int i2 = Math.abs(i1);
    int i3;
    boolean bool;
    int i4;
    AbsHListView localAbsHListView;
    if (getScrollX() != 0)
    {
      i3 = 1;
      if (i3 == 0)
      {
        int i5 = this.aJ;
        bool = false;
        if (i2 <= i5);
      }
      else
      {
        G();
        if (i3 == 0)
          break label161;
        this.F = 5;
        i4 = 0;
        localAbsHListView = this;
      }
    }
    while (true)
    {
      localAbsHListView.H = i4;
      Handler localHandler = getHandler();
      if (localHandler != null)
        localHandler.removeCallbacks(this.aA);
      setPressed(false);
      View localView = getChildAt(this.A - this.V);
      if (localView != null)
        localView.setPressed(false);
      a(1);
      ViewParent localViewParent = getParent();
      if (localViewParent != null)
        localViewParent.requestDisallowInterceptTouchEvent(true);
      k(paramInt);
      bool = true;
      return bool;
      i3 = 0;
      break;
      label161: this.F = 3;
      if (i1 > 0)
      {
        i4 = this.aJ;
        localAbsHListView = this;
      }
      else
      {
        i4 = -this.aJ;
        localAbsHListView = this;
      }
    }
  }

  private void k(int paramInt)
  {
    int i1 = paramInt - this.D;
    int i2 = i1 - this.H;
    int i3;
    int i13;
    label96: View localView2;
    if (this.G != -2147483648)
    {
      i3 = paramInt - this.G;
      if (this.F != 3)
        break label381;
      if (paramInt != this.G)
      {
        if (Math.abs(i1) > this.aJ)
        {
          ViewParent localViewParent = getParent();
          if (localViewParent != null)
            localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        if (this.A < 0)
          break label318;
        i13 = this.A - this.V;
        localView2 = getChildAt(i13);
        if (localView2 == null)
          break label784;
      }
    }
    label772: label784: for (int i14 = localView2.getLeft(); ; i14 = 0)
    {
      if (i3 != 0);
      for (boolean bool = a(i2, i3); ; bool = false)
      {
        View localView3 = getChildAt(i13);
        int i16;
        if (localView3 != null)
        {
          int i15 = localView3.getLeft();
          if (bool)
          {
            i16 = -i3 - (i15 - i14);
            overScrollBy(i16, 0, getScrollX(), 0, 0, 0, this.Q, 0, true);
            if ((Math.abs(this.Q) == Math.abs(getScrollX())) && (this.at != null))
              this.at.clear();
            int i17 = getOverScrollMode();
            if ((i17 == 0) || ((i17 == 1) && (!A())))
            {
              this.aT = 0;
              this.F = 5;
              if (i1 <= 0)
                break label329;
              this.aP.a(i16 / getWidth());
              if (!this.aQ.a())
                this.aQ.c();
              invalidate(this.aP.a(false));
            }
          }
          label301: this.D = paramInt;
        }
        else
        {
          this.G = paramInt;
        }
        label318: label329: label381: 
        do
        {
          return;
          i3 = i2;
          break;
          i13 = getChildCount() / 2;
          break label96;
          if (i1 >= 0)
            break label301;
          this.aQ.a(i16 / getWidth());
          if (!this.aP.a())
            this.aP.c();
          invalidate(this.aQ.a(true));
          break label301;
        }
        while ((this.F != 5) || (paramInt == this.G));
        int i4 = getScrollX();
        int i5 = i4 - i3;
        int i6;
        int i7;
        int i8;
        label471: int i9;
        label570: int i10;
        label622: View localView1;
        if (paramInt > this.G)
        {
          i6 = 1;
          if (this.aT == 0)
            this.aT = i6;
          i7 = -i3;
          if (((i5 >= 0) || (i4 < 0)) && ((i5 <= 0) || (i4 > 0)))
            break label687;
          i7 = -i4;
          i8 = i3 + i7;
          if (i7 != 0)
          {
            overScrollBy(i7, 0, getScrollX(), 0, 0, 0, this.Q, 0, true);
            int i12 = getOverScrollMode();
            if ((i12 == 0) || ((i12 == 1) && (!A())))
            {
              if (i1 <= 0)
                break label693;
              this.aP.a(i7 / getWidth());
              if (!this.aQ.a())
                this.aQ.c();
              invalidate(this.aP.a(false));
            }
          }
          if (i8 != 0)
          {
            if (getScrollX() != 0)
            {
              this.a.a(0);
              D();
            }
            a(i8, i8);
            this.F = 3;
            i9 = getChildCount();
            if (i9 != 0)
              break label745;
            i10 = -1;
            this.H = 0;
            localView1 = getChildAt(i10 - this.V);
            if (localView1 == null)
              break label772;
          }
        }
        for (int i11 = localView1.getLeft(); ; i11 = 0)
        {
          this.B = i11;
          this.D = paramInt;
          this.A = i10;
          this.G = paramInt;
          this.aT = i6;
          return;
          i6 = -1;
          break;
          label687: i8 = 0;
          break label471;
          label693: if (i1 >= 0)
            break label570;
          this.aQ.a(i7 / getWidth());
          if (!this.aP.a())
            this.aP.c();
          invalidate(this.aQ.a(true));
          break label570;
          label745: i10 = c(paramInt);
          if (i10 != -1)
            break label622;
          i10 = -1 + (i9 + this.V);
          break label622;
        }
      }
    }
  }

  private void l(int paramInt)
  {
    a(paramInt, 200, false);
  }

  public final int a()
  {
    return this.e;
  }

  @SuppressLint({"NewApi"})
  protected final View a(int paramInt, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    Object localObject = this.p.c(paramInt);
    if (localObject != null)
      return localObject;
    View localView1 = this.p.d(paramInt);
    View localView2;
    label107: ViewGroup.LayoutParams localLayoutParams;
    AbsHListView.LayoutParams localLayoutParams1;
    if (localView1 != null)
    {
      localView2 = this.j.getView(paramInt, localView1, this);
      if ((Build.VERSION.SDK_INT >= 16) && (localView2.getImportantForAccessibility() == 0))
        localView2.setImportantForAccessibility(1);
      if (localView2 != localView1)
      {
        this.p.a(localView1, paramInt);
        if (this.aG == 0)
          break label253;
        localView2.setDrawingCacheBackgroundColor(this.aG);
        localObject = localView2;
        if (this.k)
        {
          localLayoutParams = ((View)localObject).getLayoutParams();
          if (localLayoutParams != null)
            break label259;
          localLayoutParams1 = (AbsHListView.LayoutParams)generateDefaultLayoutParams();
        }
      }
    }
    while (true)
    {
      localLayoutParams1.e = this.j.getItemId(paramInt);
      ((View)localObject).setLayoutParams(localLayoutParams1);
      if ((!this.ap.isEnabled()) || (this.aX != null))
        break;
      this.aX = new f(this);
      return localObject;
      paramArrayOfBoolean[0] = true;
      localView2.onFinishTemporaryDetach();
      localObject = localView2;
      break label107;
      localView2 = this.j.getView(paramInt, null, this);
      if ((Build.VERSION.SDK_INT >= 16) && (localView2.getImportantForAccessibility() == 0))
        localView2.setImportantForAccessibility(1);
      if (this.aG != 0)
        localView2.setDrawingCacheBackgroundColor(this.aG);
      label253: localObject = localView2;
      break label107;
      label259: if (!checkLayoutParams(localLayoutParams))
        localLayoutParams1 = (AbsHListView.LayoutParams)generateLayoutParams(localLayoutParams);
      else
        localLayoutParams1 = (AbsHListView.LayoutParams)localLayoutParams;
    }
  }

  final void a(int paramInt)
  {
    if ((paramInt != this.aI) && (this.av != null))
      this.aI = paramInt;
  }

  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.au == null)
      this.au = new e(this);
    int i1 = this.V;
    int i2 = getChildCount();
    int i3 = i1 + i2;
    int i4 = getPaddingLeft();
    int i5 = getWidth() - getPaddingRight();
    if ((paramInt1 == 0) || (this.an == 0) || (i2 == 0) || ((i1 == 0) && (getChildAt(0).getLeft() == i4) && (paramInt1 < 0)) || ((i3 == this.an) && (getChildAt(i2 - 1).getRight() == i5) && (paramInt1 > 0)))
    {
      this.au.b();
      if (this.I != null)
        this.I.a();
      return;
    }
    a(2);
    this.au.a(paramInt1, paramInt2, paramBoolean);
  }

  protected final void a(int paramInt, View paramView)
  {
    if (paramInt != -1)
      this.n = paramInt;
    Rect localRect = this.o;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    int i1 = localRect.left;
    int i2 = localRect.top;
    int i3 = localRect.right;
    int i4 = localRect.bottom;
    this.o.set(i1 - this.q, i2 - this.r, i3 + this.s, i4 + this.t);
    boolean bool1 = this.aH;
    if (paramView.isEnabled() != bool1)
      if (bool1)
        break label136;
    label136: for (boolean bool2 = true; ; bool2 = false)
    {
      this.aH = bool2;
      if (r() != -1)
        refreshDrawableState();
      return;
    }
  }

  public void a(ListAdapter paramListAdapter)
  {
    if (paramListAdapter != null)
    {
      this.k = this.j.hasStableIds();
      if ((this.b != 0) && (this.k) && (this.g == null))
        this.g = new android.support.v4.c.e();
    }
    if (this.f != null)
      this.f.clear();
    if (this.g != null)
      this.g.b();
  }

  protected abstract void a(boolean paramBoolean);

  final boolean a(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (i1 == 0)
      return true;
    int i2 = getChildAt(0).getLeft();
    int i3 = getChildAt(i1 - 1).getRight();
    Rect localRect = this.u;
    int i4 = 0 - i2;
    int i5 = i3 - (0 + getWidth());
    int i6 = getWidth() - getPaddingRight() - getPaddingLeft();
    int i7;
    int i8;
    label102: int i9;
    label125: int i10;
    label148: label171: int i11;
    if (paramInt1 < 0)
    {
      i7 = Math.max(-(i6 - 1), paramInt1);
      if (paramInt2 >= 0)
        break label235;
      i8 = Math.max(-(i6 - 1), paramInt2);
      i9 = this.V;
      if (i9 != 0)
        break label248;
      this.aR = (i2 - localRect.left);
      if (i9 + i1 != this.an)
        break label262;
      this.aS = (i3 + localRect.right);
      if ((i9 != 0) || (i2 < localRect.left) || (i8 < 0))
        break label276;
      i10 = 1;
      if ((i9 + i1 != this.an) || (i3 > getWidth() - localRect.right) || (i8 > 0))
        break label282;
      i11 = 1;
    }
    while (true)
      if ((i10 != 0) || (i11 != 0))
      {
        if (i8 != 0)
        {
          return true;
          i7 = Math.min(i6 - 1, paramInt1);
          break;
          label235: i8 = Math.min(i6 - 1, paramInt2);
          break label102;
          label248: this.aR = (i8 + this.aR);
          break label125;
          label262: this.aS = (i8 + this.aS);
          break label148;
          label276: i10 = 0;
          break label171;
          label282: i11 = 0;
          continue;
        }
        return false;
      }
    if (i8 < 0);
    boolean bool2;
    int i12;
    int i13;
    int i14;
    for (boolean bool1 = true; ; bool1 = false)
    {
      bool2 = isInTouchMode();
      if (bool2)
        l();
      i12 = j();
      i13 = this.an - k();
      i14 = 0;
      if (!bool1)
        break;
      int i25 = -i8;
      i17 = 0;
      int i26 = 0;
      while (true)
      {
        i14 = 0;
        if (i26 >= i1)
          break;
        View localView2 = getChildAt(i26);
        int i27 = localView2.getRight();
        i14 = 0;
        if (i27 >= i25)
          break;
        int i28 = i17 + 1;
        int i29 = i9 + i26;
        if ((i29 >= i12) && (i29 < i13))
          this.p.a(localView2, i29);
        i26++;
        i17 = i28;
      }
    }
    int i15 = getWidth() - i8;
    int i16 = i1 - 1;
    int i17 = 0;
    int i24;
    for (int i18 = i16; i18 >= 0; i18 = i24)
    {
      View localView1 = getChildAt(i18);
      if (localView1.getLeft() <= i15)
        break;
      int i22 = i17 + 1;
      int i23 = i9 + i18;
      if ((i23 >= i12) && (i23 < i13))
        this.p.a(localView1, i23);
      i24 = i18 - 1;
      i17 = i22;
      i14 = i18;
    }
    this.C = (i7 + this.B);
    this.as = true;
    if (i17 > 0)
    {
      detachViewsFromParent(i14, i17);
      this.p.d();
    }
    if (!awakenScrollBars())
      invalidate();
    b(i8);
    if (bool1)
      this.V = (i17 + this.V);
    int i19 = Math.abs(i8);
    if ((i4 < i19) || (i5 < i19))
      a(bool1);
    if ((!bool2) && (this.al != -1))
    {
      int i21 = this.al - this.V;
      if ((i21 >= 0) && (i21 < getChildCount()))
        a(this.al, getChildAt(i21));
    }
    while (true)
    {
      this.as = false;
      c();
      return false;
      if (this.n != -1)
      {
        int i20 = this.n - this.V;
        if ((i20 >= 0) && (i20 < getChildCount()))
          a(-1, getChildAt(i20));
      }
      else
      {
        this.o.setEmpty();
      }
    }
  }

  public final boolean a(View paramView, int paramInt, long paramLong)
  {
    int i1 = 1;
    int i2 = 0;
    label115: int i6;
    label130: int i7;
    label169: label198: label469: int i3;
    if (this.b != 0)
    {
      int i8;
      View localView;
      int i14;
      if ((this.b == 2) || ((Build.VERSION.SDK_INT >= 11) && (this.b == 3) && (this.c != null)))
        if (!this.f.get(paramInt, false))
        {
          int i4 = i1;
          this.f.put(paramInt, i4);
          if ((this.g != null) && (this.j.hasStableIds()))
          {
            if (i4 == 0)
              break label259;
            this.g.a(this.j.getItemId(paramInt), Integer.valueOf(paramInt));
          }
          if (i4 == 0)
            break label279;
          this.e = (1 + this.e);
          if (this.c == null)
            break label507;
          ((it.sephiroth.android.library.a.a.b)this.d).a((ActionMode)this.c, paramInt, paramLong, i4);
          i6 = 0;
          i7 = i6;
          i8 = i1;
          if (i8 == 0)
            break label469;
          int i10 = this.V;
          int i11 = getChildCount();
          if (Build.VERSION.SDK_INT < 11)
            break label438;
          int i12 = i1;
          if (i2 >= i11)
            break label469;
          localView = getChildAt(i2);
          i14 = i10 + i2;
          if (!(localView instanceof Checkable))
            break label447;
          ((Checkable)localView).setChecked(this.f.get(i14));
        }
      while (true)
      {
        i2++;
        break label198;
        int i5 = 0;
        break;
        label259: this.g.b(this.j.getItemId(paramInt));
        break label115;
        label279: this.e = (-1 + this.e);
        break label130;
        if (this.b != i1)
          break label497;
        if (!this.f.get(paramInt, false))
        {
          int i15 = i1;
          label317: if (i15 == 0)
            break label409;
          this.f.clear();
          this.f.put(paramInt, i1);
          if ((this.g != null) && (this.j.hasStableIds()))
          {
            this.g.b();
            this.g.a(this.j.getItemId(paramInt), Integer.valueOf(paramInt));
          }
        }
        for (this.e = i1; ; this.e = 0)
          label409: 
          do
          {
            i8 = i1;
            i7 = i1;
            break;
            int i16 = 0;
            break label317;
          }
          while ((this.f.size() != 0) && (this.f.valueAt(0)));
        label438: int i13 = 0;
        i2 = 0;
        break label198;
        label447: if (i13 != 0)
          localView.setActivated(this.f.get(i14));
      }
      i3 = i1;
      i1 = i7;
    }
    while (true)
    {
      if (i1 != 0)
        i3 |= super.a(paramView, paramInt, paramLong);
      return bool;
      label497: i7 = i1;
      int i9 = 0;
      break label169;
      label507: i6 = i1;
      break;
      boolean bool = false;
    }
  }

  public void addTouchables(ArrayList<View> paramArrayList)
  {
    int i1 = getChildCount();
    int i2 = this.V;
    ListAdapter localListAdapter = this.j;
    if (localListAdapter == null);
    while (true)
    {
      return;
      for (int i3 = 0; i3 < i1; i3++)
      {
        View localView = getChildAt(i3);
        if (localListAdapter.isEnabled(i2 + i3))
          paramArrayList.add(localView);
        localView.addTouchables(paramArrayList);
      }
    }
  }

  public final void b()
  {
    if (this.f != null)
      this.f.clear();
    if (this.g != null)
      this.g.b();
    this.e = 0;
  }

  public final void b(int paramInt)
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
      getChildAt(i2).offsetLeftAndRight(paramInt);
  }

  final boolean b(View paramView, int paramInt, long paramLong)
  {
    int i1 = 1;
    if ((Build.VERSION.SDK_INT >= 11) && (this.b == 3))
    {
      if (this.c == null)
      {
        ActionMode localActionMode = startActionMode((it.sephiroth.android.library.a.a.b)this.d);
        this.c = localActionMode;
        if (localActionMode != null)
        {
          if (this.b != 0)
          {
            if ((Build.VERSION.SDK_INT >= 11) && (this.b == 3) && (this.c == null))
            {
              if ((this.d == null) || (!((it.sephiroth.android.library.a.a.b)this.d).a()))
                throw new IllegalStateException("AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback.");
              this.c = startActionMode((it.sephiroth.android.library.a.a.b)this.d);
            }
            if ((this.b != 2) && ((Build.VERSION.SDK_INT < 11) || (this.b != 3)))
              break label305;
            boolean bool1 = this.f.get(paramInt);
            this.f.put(paramInt, i1);
            if ((this.g != null) && (this.j.hasStableIds()))
              this.g.a(this.j.getItemId(paramInt), Integer.valueOf(paramInt));
            if (bool1 != i1)
              this.e = (1 + this.e);
            if (this.c != null)
            {
              long l1 = this.j.getItemId(paramInt);
              ((it.sephiroth.android.library.a.a.b)this.d).a((ActionMode)this.c, paramInt, l1, i1);
            }
            if ((!this.ae) && (!this.as))
            {
              this.ai = i1;
              z();
              requestLayout();
            }
          }
          performHapticFeedback(0);
        }
      }
      return i1;
      label305: if ((this.g != null) && (this.j.hasStableIds()));
      for (boolean bool2 = i1; ; bool2 = false)
      {
        this.f.clear();
        if (bool2)
          this.g.b();
        this.f.put(paramInt, i1);
        if (bool2)
          this.g.a(this.j.getItemId(paramInt), Integer.valueOf(paramInt));
        this.e = i1;
        break;
      }
    }
    if (this.ah != null);
    for (i1 = this.ah.a(); ; i1 = 0)
    {
      if (i1 == 0)
      {
        this.ay = c(paramView, paramInt, paramLong);
        i1 = super.showContextMenuForChild(this);
      }
      if (i1 == 0)
        break;
      performHapticFeedback(0);
      return i1;
    }
  }

  protected abstract int c(int paramInt);

  protected final void c()
  {
    if (this.av != null)
      getChildCount();
    onScrollChanged(0, 0, 0, 0);
  }

  public boolean checkInputConnectionProxy(View paramView)
  {
    return false;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof AbsHListView.LayoutParams;
  }

  protected int computeHorizontalScrollExtent()
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      if (this.aw)
      {
        int i2 = i1 * 100;
        View localView1 = getChildAt(0);
        int i3 = localView1.getLeft();
        int i4 = localView1.getWidth();
        if (i4 > 0)
          i2 += i3 * 100 / i4;
        View localView2 = getChildAt(i1 - 1);
        int i5 = localView2.getRight();
        int i6 = localView2.getWidth();
        if (i6 > 0)
          i2 -= 100 * (i5 - getWidth()) / i6;
        return i2;
      }
      return 1;
    }
    return 0;
  }

  protected int computeHorizontalScrollOffset()
  {
    int i1 = this.V;
    int i2 = getChildCount();
    int i3 = 0;
    if (i1 >= 0)
    {
      i3 = 0;
      if (i2 > 0)
      {
        if (!this.aw)
          break label100;
        View localView = getChildAt(0);
        int i6 = localView.getLeft();
        int i7 = localView.getWidth();
        i3 = 0;
        if (i7 > 0)
          i3 = Math.max(i1 * 100 - i6 * 100 / i7 + (int)(100.0F * (getScrollX() / getWidth() * this.an)), 0);
      }
    }
    return i3;
    label100: int i4 = this.an;
    int i5 = 0;
    if (i1 == 0);
    while (true)
    {
      return (int)(i1 + i2 * (i5 / i4));
      if (i1 + i2 == i4)
        i5 = i4;
      else
        i5 = i1 + i2 / 2;
    }
  }

  protected int computeHorizontalScrollRange()
  {
    if (this.aw)
    {
      int i1 = Math.max(100 * this.an, 0);
      if (getScrollX() != 0)
        i1 += Math.abs((int)(100.0F * (getScrollX() / getWidth() * this.an)));
      return i1;
    }
    return this.an;
  }

  protected void d()
  {
    removeAllViewsInLayout();
    this.V = 0;
    this.ai = false;
    this.O = null;
    this.ac = false;
    this.bb = null;
    this.aq = -1;
    this.ar = -9223372036854775808L;
    h(-1);
    i(-1);
    this.J = 0;
    this.n = -1;
    this.o.setEmpty();
    invalidate();
  }

  public abstract void d(int paramInt);

  protected void dispatchDraw(Canvas paramCanvas)
  {
    boolean bool = this.l;
    if (!bool)
      a(paramCanvas);
    super.dispatchDraw(paramCanvas);
    if (bool)
      a(paramCanvas);
  }

  protected void dispatchSetPressed(boolean paramBoolean)
  {
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.aP != null)
    {
      int i1 = getScrollX();
      if (!this.aP.a())
      {
        int i7 = paramCanvas.save();
        int i8 = this.u.top + this.aV;
        int i9 = this.u.bottom + this.aW;
        int i10 = getHeight() - i8 - i9;
        getWidth();
        int i11 = Math.min(0, i1 + this.aR);
        paramCanvas.rotate(-90.0F);
        paramCanvas.translate(i8 + -getHeight(), i11);
        this.aP.a(i10, i10);
        if (this.aP.a(paramCanvas))
        {
          this.aP.b(i11, i8);
          invalidate();
        }
        paramCanvas.restoreToCount(i7);
      }
      if (!this.aQ.a())
      {
        int i2 = paramCanvas.save();
        int i3 = this.u.left + this.aV;
        int i4 = this.u.right + this.aW;
        int i5 = getHeight() - i3 - i4;
        int i6 = Math.max(getWidth(), i1 + this.aS);
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-i3, -i6);
        this.aQ.a(i5, i5);
        if (this.aQ.a(paramCanvas))
          invalidate();
        paramCanvas.restoreToCount(i2);
      }
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    C();
  }

  protected void e()
  {
  }

  public void e(int paramInt)
  {
    if (paramInt != this.aG)
    {
      this.aG = paramInt;
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
        getChildAt(i2).setDrawingCacheBackgroundColor(paramInt);
      this.p.e(paramInt);
    }
  }

  protected final void f()
  {
    int i1 = 1;
    int i5;
    label52: int i6;
    label66: int i3;
    if (this.w != null)
    {
      if (this.V > 0)
      {
        i5 = i1;
        if ((i5 == 0) && (getChildCount() > 0))
        {
          if (getChildAt(0).getLeft() >= this.u.left)
            break label160;
          i5 = i1;
        }
        View localView2 = this.w;
        if (i5 == 0)
          break label166;
        i6 = 0;
        localView2.setVisibility(i6);
      }
    }
    else if (this.x != null)
    {
      int i2 = getChildCount();
      if (i2 + this.V >= this.an)
        break label172;
      i3 = i1;
      label100: if ((i3 != 0) || (i2 <= 0))
        break label188;
      if (getChildAt(i2 - 1).getRight() <= getRight() - this.u.right)
        break label177;
    }
    while (true)
    {
      label133: View localView1 = this.x;
      int i4 = 0;
      if (i1 != 0);
      while (true)
      {
        localView1.setVisibility(i4);
        return;
        i5 = 0;
        break;
        label160: i5 = 0;
        break label52;
        label166: i6 = 4;
        break label66;
        label172: i3 = 0;
        break label100;
        label177: i1 = 0;
        break label133;
        i4 = 4;
      }
      label188: i1 = i3;
    }
  }

  @ViewDebug.ExportedProperty
  public final View g()
  {
    if ((this.an > 0) && (this.al >= 0))
      return getChildAt(this.al - this.V);
    return null;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new AbsHListView.LayoutParams();
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new AbsHListView.LayoutParams(paramLayoutParams);
  }

  protected ContextMenu.ContextMenuInfo getContextMenuInfo()
  {
    return this.ay;
  }

  public void getFocusedRect(Rect paramRect)
  {
    View localView = g();
    if ((localView != null) && (localView.getParent() == this))
    {
      localView.getFocusedRect(paramRect);
      offsetDescendantRectToMyCoords(localView, paramRect);
      return;
    }
    super.getFocusedRect(paramRect);
  }

  protected int getHorizontalScrollbarHeight()
  {
    return super.getHorizontalScrollbarHeight();
  }

  protected float getLeftFadingEdgeStrength()
  {
    int i1 = getChildCount();
    float f1 = super.getLeftFadingEdgeStrength();
    if (i1 == 0);
    int i2;
    float f2;
    do
    {
      return f1;
      if (this.V > 0)
        return 1.0F;
      i2 = getChildAt(0).getLeft();
      f2 = getHorizontalFadingEdgeLength();
    }
    while (i2 >= getPaddingLeft());
    return -(i2 - getPaddingLeft()) / f2;
  }

  protected float getRightFadingEdgeStrength()
  {
    int i1 = getChildCount();
    float f1 = super.getRightFadingEdgeStrength();
    if (i1 == 0);
    int i2;
    int i3;
    float f2;
    do
    {
      return f1;
      if (-1 + (i1 + this.V) < -1 + this.an)
        return 1.0F;
      i2 = getChildAt(i1 - 1).getRight();
      i3 = getWidth();
      f2 = getHorizontalFadingEdgeLength();
    }
    while (i2 <= i3 - getPaddingRight());
    return i2 - i3 + getPaddingRight() / f2;
  }

  public int getSolidColor()
  {
    return this.aG;
  }

  protected final boolean h()
  {
    return ((hasFocus()) && (!isInTouchMode())) || (B());
  }

  protected final void i()
  {
    if ((!isEnabled()) || (!isClickable()));
    while (true)
    {
      return;
      Drawable localDrawable1 = this.m;
      Rect localRect = this.o;
      if ((localDrawable1 != null) && ((isFocused()) || (B())) && (!localRect.isEmpty()))
      {
        View localView = getChildAt(this.al - this.V);
        if (localView != null)
        {
          if (!localView.hasFocusable())
            localView.setPressed(true);
        }
        else
        {
          setPressed(true);
          boolean bool = isLongClickable();
          Drawable localDrawable2 = localDrawable1.getCurrent();
          if ((localDrawable2 != null) && ((localDrawable2 instanceof TransitionDrawable)))
          {
            if (!bool)
              break label179;
            ((TransitionDrawable)localDrawable2).startTransition(ViewConfiguration.getLongPressTimeout());
          }
          while ((bool) && (!this.ai))
          {
            if (this.aC == null)
              this.aC = new b(this, (byte)0);
            this.aC.a();
            postDelayed(this.aC, ViewConfiguration.getLongPressTimeout());
            return;
            label179: ((TransitionDrawable)localDrawable2).resetTransition();
          }
        }
      }
    }
  }

  protected int j()
  {
    return 0;
  }

  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.m != null)
      this.m.jumpToCurrentState();
  }

  protected int k()
  {
    return 0;
  }

  protected final void l()
  {
    if (this.al != -1)
    {
      if (this.h != 4)
        this.M = this.al;
      if ((this.aj >= 0) && (this.aj != this.al))
        this.M = this.aj;
      h(-1);
      i(-1);
      this.J = 0;
    }
  }

  protected final int m()
  {
    int i1 = this.al;
    if (i1 < 0)
      i1 = this.M;
    return Math.min(Math.max(0, i1), -1 + this.an);
  }

  protected final boolean n()
  {
    if ((this.al < 0) && (I()))
    {
      C();
      return true;
    }
    return false;
  }

  protected final void o()
  {
    int i1 = this.an;
    int i2 = this.ba;
    this.ba = this.an;
    if ((Build.VERSION.SDK_INT >= 16) && (this.b != 0) && (this.j != null) && (this.j.hasStableIds()))
    {
      this.f.clear();
      int i11 = 0;
      int i12 = 0;
      if (i12 < this.g.a())
      {
        long l1 = this.g.a(i12);
        int i13 = ((Integer)this.g.b(i12)).intValue();
        int i17;
        label147: int i14;
        if (l1 != this.j.getItemId(i13))
        {
          i17 = Math.max(0, i13 - 20);
          int i18 = Math.min(i13 + 20, this.an);
          int i19 = 0;
          if (i17 < i18)
          {
            if (l1 == this.j.getItemId(i17))
            {
              i19 = 1;
              this.f.put(i17, true);
              this.g.a(i12, Integer.valueOf(i17));
            }
          }
          else
          {
            if (i19 == 0)
            {
              this.g.b(l1);
              int i20 = i12 - 1;
              this.e = (-1 + this.e);
              if ((Build.VERSION.SDK_INT > 11) && (this.c != null) && (this.d != null))
                ((it.sephiroth.android.library.a.a.b)this.d).a((ActionMode)this.c, i13, l1, false);
              i12 = i20;
              i11 = 1;
            }
            i14 = i12;
          }
        }
        for (int i15 = i11; ; i15 = i11)
        {
          int i16 = i14 + 1;
          i11 = i15;
          i12 = i16;
          break;
          i17++;
          break label147;
          this.f.put(i13, true);
          i14 = i12;
        }
      }
      if ((i11 != 0) && (this.c != null))
        ((ActionMode)this.c).invalidate();
    }
    this.p.c();
    if (i1 > 0)
    {
      if (this.ac)
      {
        this.ac = false;
        this.bb = null;
        if (this.aF == 2)
          this.h = 3;
      }
      do
      {
        return;
        if (this.aF == 1)
        {
          if (this.aU)
          {
            this.aU = false;
            this.h = 3;
            return;
          }
          int i8 = getChildCount();
          int i9 = getWidth() - getPaddingRight();
          View localView = getChildAt(i8 - 1);
          if (localView != null);
          for (int i10 = localView.getBottom(); (i8 + this.V >= i2) && (i10 <= i9); i10 = i9)
          {
            this.h = 3;
            return;
          }
          awakenScrollBars();
        }
        switch (this.ad)
        {
        default:
        case 0:
        case 1:
        }
        while (!isInTouchMode())
        {
          int i4 = r();
          if (i4 >= i1)
            i4 = i1 - 1;
          if (i4 < 0)
            i4 = 0;
          int i5 = a(i4, true);
          if (i5 >= 0)
          {
            i(i5);
            return;
            if (isInTouchMode())
            {
              this.h = 5;
              this.Z = Math.min(Math.max(0, this.Z), i1 - 1);
              return;
            }
            int i7 = y();
            if ((i7 >= 0) && (a(i7, true) == i7))
            {
              this.Z = i7;
              if (this.ab == getWidth());
              for (this.h = 5; ; this.h = 2)
              {
                i(i7);
                return;
              }
              this.h = 5;
              this.Z = Math.min(Math.max(0, this.Z), i1 - 1);
            }
          }
          else
          {
            int i6 = a(i4, false);
            if (i6 < 0)
              break label722;
            i(i6);
            return;
          }
        }
      }
      while (this.M >= 0);
    }
    label722: if (this.K);
    for (int i3 = 3; ; i3 = 1)
    {
      this.h = i3;
      this.al = -1;
      this.am = -9223372036854775808L;
      this.aj = -1;
      this.ak = -9223372036854775808L;
      this.ac = false;
      this.bb = null;
      this.n = -1;
      x();
      return;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getViewTreeObserver().addOnTouchModeChangeListener(this);
    if ((this.j != null) && (this.i == null))
    {
      this.i = new a(this);
      this.j.registerDataSetObserver(this.i);
      this.ai = true;
      this.ao = this.an;
      this.an = this.j.getCount();
    }
    this.S = true;
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt;
    if (this.aH)
      arrayOfInt = super.onCreateDrawableState(paramInt);
    label83: 
    while (true)
    {
      return arrayOfInt;
      int i1 = ENABLED_STATE_SET[0];
      arrayOfInt = super.onCreateDrawableState(paramInt + 1);
      int i2 = -1 + arrayOfInt.length;
      if (i2 >= 0)
        if (arrayOfInt[i2] != i1);
      while (true)
      {
        if (i2 < 0)
          break label83;
        System.arraycopy(arrayOfInt, i2 + 1, arrayOfInt, i2, -1 + (arrayOfInt.length - i2));
        return arrayOfInt;
        i2--;
        break;
        i2 = -1;
      }
    }
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return null;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.p.b();
    getViewTreeObserver().removeOnTouchModeChangeListener(this);
    if ((this.j != null) && (this.i != null))
    {
      this.j.unregisterDataSetObserver(this.i);
      this.i = null;
    }
    if (this.au != null)
      removeCallbacks(this.au);
    if (this.I != null)
      this.I.a();
    if (this.aK != null)
      removeCallbacks(this.aK);
    if (this.aD != null)
      removeCallbacks(this.aD);
    if (this.aE != null)
    {
      removeCallbacks(this.aE);
      this.aE = null;
    }
    this.S = false;
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if ((paramBoolean) && (this.al < 0) && (!isInTouchMode()))
    {
      if ((!this.S) && (this.j != null))
      {
        this.ai = true;
        this.ao = this.an;
        this.an = this.j.getCount();
      }
      I();
    }
  }

  @TargetApi(12)
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((0x2 & paramMotionEvent.getSource()) != 0)
      switch (paramMotionEvent.getAction())
      {
      default:
      case 8:
      }
    int i1;
    do
    {
      float f1;
      do
      {
        do
          return super.onGenericMotionEvent(paramMotionEvent);
        while (this.F != -1);
        f1 = paramMotionEvent.getAxisValue(10);
      }
      while (f1 == 0.0F);
      if (this.bc == 0.0F)
      {
        int i2 = getResources().getIdentifier("sephiroth_listPreferredItemWidth", "attr", getContext().getPackageName());
        if (i2 == 0)
          break label170;
        TypedValue localTypedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, localTypedValue, true))
          break;
        this.bc = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
      }
      i1 = (int)(f1 * this.bc);
    }
    while (a(i1, i1));
    return true;
    throw new IllegalStateException("Expected theme to define sephiroth_listPreferredItemWidth.");
    label170: throw new IllegalStateException("Expected theme to define sephiroth_listPreferredItemWidth.");
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(AbsHListView.class.getName());
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(AbsHListView.class.getName());
    if (isEnabled())
    {
      if (u() > 0)
        paramAccessibilityNodeInfo.addAction(8192);
      if (v() < -1 + t())
        paramAccessibilityNodeInfo.addAction(4096);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if (this.I != null)
      this.I.a();
    if (!this.S);
    int i3;
    do
    {
      return false;
      switch (i1 & 0xFF)
      {
      case 4:
      case 5:
      default:
        return false;
      case 0:
        int i4 = this.F;
        if ((i4 == 6) || (i4 == 5))
        {
          this.H = 0;
          return true;
        }
        int i5 = (int)paramMotionEvent.getX();
        int i6 = (int)paramMotionEvent.getY();
        this.aO = paramMotionEvent.getPointerId(0);
        int i7 = c(i5);
        if ((i4 != 4) && (i7 >= 0))
        {
          this.B = getChildAt(i7 - this.V).getLeft();
          this.D = i5;
          this.E = i6;
          this.A = i7;
          this.F = 0;
          H();
        }
        this.G = -2147483648;
        if (this.at == null)
          this.at = VelocityTracker.obtain();
        while (true)
        {
          this.at.addMovement(paramMotionEvent);
          if (i4 != 4)
            break;
          return true;
          this.at.clear();
        }
      case 2:
        switch (this.F)
        {
        default:
          return false;
        case 0:
        }
        int i2 = paramMotionEvent.findPointerIndex(this.aO);
        if (i2 == -1)
        {
          this.aO = paramMotionEvent.getPointerId(0);
          i2 = 0;
        }
        i3 = (int)paramMotionEvent.getX(i2);
        E();
        this.at.addMovement(paramMotionEvent);
      case 1:
      case 3:
      case 6:
      }
    }
    while (!j(i3));
    return true;
    this.F = -1;
    this.aO = -1;
    F();
    a(0);
    return false;
    a(paramMotionEvent);
    return false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default:
    case 23:
    case 66:
    }
    do
    {
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      do
        return bool;
      while (!isEnabled());
    }
    while ((!isClickable()) || (!isPressed()) || (this.al < 0) || (this.j == null) || (this.al >= this.j.getCount()));
    View localView = getChildAt(this.al - this.V);
    if (localView != null)
    {
      a(localView, this.al, this.am);
      localView.setPressed(false);
    }
    setPressed(false);
    return bool;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.ae = true;
    if (paramBoolean)
    {
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
        getChildAt(i2).forceLayout();
      this.p.a();
    }
    e();
    this.ae = false;
    this.N = ((paramInt3 - paramInt1) / 3);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.m == null)
      a(getResources().getDrawable(17301602));
    Rect localRect = this.u;
    localRect.left = (this.q + getPaddingLeft());
    localRect.top = (this.r + getPaddingTop());
    localRect.right = (this.s + getPaddingRight());
    localRect.bottom = (this.t + getPaddingBottom());
    int i2;
    int i3;
    if (this.aF == 1)
    {
      int i1 = getChildCount();
      i2 = getWidth() - getPaddingRight();
      View localView = getChildAt(i1 - 1);
      if (localView == null)
        break label156;
      i3 = localView.getRight();
      if ((i1 + this.V < this.ba) || (i3 > i2))
        break label163;
    }
    label156: label163: for (boolean bool = true; ; bool = false)
    {
      this.aU = bool;
      return;
      i3 = i2;
      break;
    }
  }

  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (getScrollX() != paramInt1)
    {
      onScrollChanged(paramInt1, getScrollY(), getScrollX(), getScrollY());
      this.a.a(paramInt1);
      D();
      awakenScrollBars();
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AbsHListView.SavedState localSavedState = (AbsHListView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.ai = true;
    this.ab = localSavedState.e;
    if (localSavedState.a >= 0L)
    {
      this.ac = true;
      this.bb = localSavedState;
      this.aa = localSavedState.a;
      this.Z = localSavedState.d;
      this.W = localSavedState.c;
      this.ad = 0;
    }
    while (true)
    {
      if (localSavedState.i != null)
        this.f = localSavedState.i;
      if (localSavedState.j != null)
        this.g = localSavedState.j;
      this.e = localSavedState.h;
      if ((Build.VERSION.SDK_INT >= 11) && (localSavedState.g) && (this.b == 3) && (this.d != null))
        this.c = startActionMode((it.sephiroth.android.library.a.a.b)this.d);
      requestLayout();
      return;
      if (localSavedState.b >= 0L)
      {
        h(-1);
        i(-1);
        this.n = -1;
        this.ac = true;
        this.bb = localSavedState;
        this.aa = localSavedState.b;
        this.Z = localSavedState.d;
        this.W = localSavedState.c;
        this.ad = 1;
      }
    }
  }

  public Parcelable onSaveInstanceState()
  {
    boolean bool = true;
    int i1 = 0;
    AbsHListView.SavedState localSavedState = new AbsHListView.SavedState(super.onSaveInstanceState());
    if (this.bb != null)
    {
      localSavedState.a = this.bb.a;
      localSavedState.b = this.bb.b;
      localSavedState.c = this.bb.c;
      localSavedState.d = this.bb.d;
      localSavedState.e = this.bb.e;
      localSavedState.f = this.bb.f;
      localSavedState.g = this.bb.g;
      localSavedState.h = this.bb.h;
      localSavedState.i = this.bb.i;
      localSavedState.j = this.bb.j;
      return localSavedState;
    }
    int i2;
    if ((getChildCount() > 0) && (this.an > 0))
    {
      i2 = bool;
      while (true)
      {
        long l1 = s();
        localSavedState.a = l1;
        localSavedState.e = getWidth();
        if (l1 >= 0L)
        {
          localSavedState.c = this.J;
          localSavedState.d = r();
          localSavedState.b = -1L;
          label202: localSavedState.f = null;
          if ((Build.VERSION.SDK_INT < 11) || (this.b != 3) || (this.c == null))
            break label408;
          localSavedState.g = bool;
          if (this.f != null);
          try
          {
            localSavedState.i = this.f.clone();
            if (this.g != null)
            {
              locale = new android.support.v4.c.e();
              int i3 = this.g.a();
              while (true)
                if (i1 < i3)
                {
                  locale.a(this.g.a(i1), this.g.b(i1));
                  i1++;
                  continue;
                  i2 = 0;
                  break;
                  if ((i2 != 0) && (this.V > 0))
                  {
                    localSavedState.c = getChildAt(0).getLeft();
                    int i4 = this.V;
                    if (i4 >= this.an)
                      i4 = -1 + this.an;
                    localSavedState.d = i4;
                    localSavedState.b = this.j.getItemId(i4);
                    break label202;
                  }
                  localSavedState.c = 0;
                  localSavedState.b = -1L;
                  localSavedState.d = 0;
                  break label202;
                  bool = false;
                }
            }
          }
          catch (NoSuchMethodError localNoSuchMethodError)
          {
            android.support.v4.c.e locale;
            while (true)
            {
              localNoSuchMethodError.printStackTrace();
              localSavedState.i = new SparseBooleanArray();
            }
            localSavedState.j = locale;
            localSavedState.h = this.e;
          }
        }
      }
    }
    label408: return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() > 0)
    {
      this.ai = true;
      z();
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2;
    if (!isEnabled())
      if (!isClickable())
      {
        boolean bool4 = isLongClickable();
        bool2 = false;
        if (!bool4);
      }
      else
      {
        bool2 = true;
      }
    boolean bool1;
    do
    {
      return bool2;
      if (this.I != null)
        this.I.a();
      bool1 = this.S;
      bool2 = false;
    }
    while (!bool1);
    int i1 = paramMotionEvent.getAction();
    E();
    this.at.addMovement(paramMotionEvent);
    int i25;
    int i26;
    int i27;
    int i28;
    switch (i1 & 0xFF)
    {
    case 4:
    default:
      return true;
    case 0:
      switch (this.F)
      {
      default:
        this.aO = paramMotionEvent.getPointerId(0);
        i25 = (int)paramMotionEvent.getX();
        i26 = (int)paramMotionEvent.getY();
        i27 = b(i25, i26);
        if (!this.ai)
          if ((this.F != 4) && (i27 >= 0) && (((ListAdapter)q()).isEnabled(i27)))
          {
            this.F = 0;
            if (this.aB == null)
              this.aB = new d(this);
            postDelayed(this.aB, ViewConfiguration.getTapTimeout());
            i28 = i27;
          }
      case 6:
      }
      break;
    case 2:
    case 1:
    case 3:
    case 6:
    case 5:
    }
    while (true)
    {
      if (i28 >= 0)
        this.B = getChildAt(i28 - this.V).getLeft();
      this.D = i25;
      this.E = i26;
      this.A = i28;
      this.G = -2147483648;
      while (true)
      {
        int i21 = Build.VERSION.SDK_INT;
        int i22 = 0;
        if (i21 >= 14)
        {
          int i23 = 0x2 & paramMotionEvent.getButtonState();
          i22 = 0;
          if (i23 != 0)
          {
            float f2 = paramMotionEvent.getX();
            float f3 = paramMotionEvent.getY();
            paramMotionEvent.getMetaState();
            int i24;
            long l1;
            View localView3;
            do
            {
              do
                i24 = b((int)f2, (int)f3);
              while (i24 == -1);
              l1 = this.j.getItemId(i24);
              localView3 = getChildAt(i24 - this.V);
            }
            while (localView3 == null);
            this.ay = c(localView3, i24, l1);
            boolean bool3 = super.showContextMenuForChild(this);
            i22 = 0;
            if (bool3)
              i22 = 1;
          }
        }
        if ((i22 == 0) || (this.F != 0))
          break;
        removeCallbacks(this.aB);
        break;
        this.au.b();
        if (this.I != null)
          this.I.a();
        this.F = 5;
        this.E = (int)paramMotionEvent.getY();
        int i20 = (int)paramMotionEvent.getX();
        this.G = i20;
        this.D = i20;
        this.H = 0;
        this.aO = paramMotionEvent.getPointerId(0);
        this.aT = 0;
      }
      if (this.F == 4)
      {
        G();
        this.F = 3;
        this.H = 0;
        i28 = c(i25);
        this.au.c();
        continue;
        int i18 = paramMotionEvent.findPointerIndex(this.aO);
        if (i18 == -1)
        {
          this.aO = paramMotionEvent.getPointerId(0);
          i18 = 0;
        }
        int i19 = (int)paramMotionEvent.getX(i18);
        if (this.ai)
          e();
        switch (this.F)
        {
        case 4:
        default:
          break;
        case 0:
        case 1:
        case 2:
          j(i19);
          break;
        case 3:
        case 5:
          k(i19);
          break;
          switch (this.F)
          {
          case 4:
          default:
          case 0:
          case 1:
          case 2:
          case 3:
          case 5:
          }
          while (true)
          {
            setPressed(false);
            if (this.aP != null)
            {
              this.aP.c();
              this.aQ.c();
            }
            invalidate();
            Handler localHandler2 = getHandler();
            if (localHandler2 != null)
              localHandler2.removeCallbacks(this.aA);
            F();
            this.aO = -1;
            break;
            int i16 = this.A;
            View localView2 = getChildAt(i16 - this.V);
            float f1 = paramMotionEvent.getX();
            int i17;
            h localh;
            Object localObject;
            if ((f1 > this.u.left) && (f1 < getWidth() - this.u.right))
            {
              i17 = 1;
              if ((localView2 == null) || (localView2.hasFocusable()) || (i17 == 0))
                break label1173;
              if (this.F != 0)
                localView2.setPressed(false);
              if (this.aD == null)
                this.aD = new h(this, (byte)0);
              localh = this.aD;
              localh.a = i16;
              localh.a();
              this.M = i16;
              if ((this.F != 0) && (this.F != 1))
                break label1147;
              Handler localHandler3 = getHandler();
              if (localHandler3 != null)
              {
                if (this.F != 0)
                  break label1126;
                localObject = this.aB;
                label965: localHandler3.removeCallbacks((Runnable)localObject);
              }
              this.h = 0;
              if ((this.ai) || (!this.j.isEnabled(i16)))
                break label1135;
              this.F = 1;
              h(this.A);
              e();
              localView2.setPressed(true);
              a(this.A, localView2);
              setPressed(true);
              if (this.m != null)
              {
                Drawable localDrawable = this.m.getCurrent();
                if ((localDrawable != null) && ((localDrawable instanceof TransitionDrawable)))
                  ((TransitionDrawable)localDrawable).resetTransition();
              }
              if (this.aE != null)
                removeCallbacks(this.aE);
              this.aE = new AbsHListView.1(this, localView2, localh);
              postDelayed(this.aE, ViewConfiguration.getPressedStateDuration());
            }
            while (true)
            {
              return true;
              i17 = 0;
              break;
              label1126: localObject = this.aA;
              break label965;
              label1135: this.F = -1;
              C();
            }
            label1147: if ((!this.ai) && (this.j.isEnabled(i16)))
              localh.run();
            label1173: this.F = -1;
            C();
            continue;
            int i10 = getChildCount();
            if (i10 > 0)
            {
              int i11 = getChildAt(0).getLeft();
              int i12 = getChildAt(i10 - 1).getRight();
              int i13 = this.u.left;
              int i14 = getWidth() - this.u.right;
              if ((this.V == 0) && (i11 >= i13) && (i10 + this.V < this.an) && (i12 <= getWidth() - i14))
              {
                this.F = -1;
                a(0);
              }
              else
              {
                VelocityTracker localVelocityTracker2 = this.at;
                localVelocityTracker2.computeCurrentVelocity(1000, this.aM);
                int i15 = (int)(localVelocityTracker2.getXVelocity(this.aO) * this.aN);
                if ((Math.abs(i15) > this.aL) && ((this.V != 0) || (i11 != i13 - this.Q)) && ((i10 + this.V != this.an) || (i12 != i14 + this.Q)))
                {
                  if (this.au == null)
                    this.au = new e(this);
                  a(2);
                  this.au.a(-i15);
                }
                else
                {
                  this.F = -1;
                  a(0);
                  if (this.au != null)
                    this.au.b();
                  if (this.I != null)
                    this.I.a();
                }
              }
            }
            else
            {
              this.F = -1;
              a(0);
              continue;
              if (this.au == null)
                this.au = new e(this);
              VelocityTracker localVelocityTracker1 = this.at;
              localVelocityTracker1.computeCurrentVelocity(1000, this.aM);
              int i9 = (int)localVelocityTracker1.getXVelocity(this.aO);
              a(2);
              if (Math.abs(i9) > this.aL)
                this.au.b(-i9);
              else
                this.au.a();
            }
          }
          switch (this.F)
          {
          default:
            this.F = -1;
            setPressed(false);
            View localView1 = getChildAt(this.A - this.V);
            if (localView1 != null)
              localView1.setPressed(false);
            H();
            Handler localHandler1 = getHandler();
            if (localHandler1 != null)
              localHandler1.removeCallbacks(this.aA);
            F();
          case 6:
          case 5:
          }
          while (true)
          {
            if (this.aP != null)
            {
              this.aP.c();
              this.aQ.c();
            }
            this.aO = -1;
            break;
            if (this.au == null)
              this.au = new e(this);
            this.au.a();
          }
          a(paramMotionEvent);
          int i7 = this.D;
          int i8 = b(i7, this.E);
          if (i8 >= 0)
          {
            this.B = getChildAt(i8 - this.V).getLeft();
            this.A = i8;
          }
          this.G = i7;
          break;
          int i2 = paramMotionEvent.getActionIndex();
          int i3 = paramMotionEvent.getPointerId(i2);
          int i4 = (int)paramMotionEvent.getX(i2);
          int i5 = (int)paramMotionEvent.getY(i2);
          this.H = 0;
          this.aO = i3;
          this.D = i4;
          this.E = i5;
          int i6 = b(i4, i5);
          if (i6 >= 0)
          {
            this.B = getChildAt(i6 - this.V).getLeft();
            this.A = i6;
          }
          this.G = i4;
          break;
        }
      }
      i28 = i27;
    }
  }

  public void onTouchModeChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      l();
      if ((getWidth() > 0) && (getChildCount() > 0))
        e();
      C();
    }
    do
    {
      int i1;
      do
      {
        return;
        i1 = this.F;
      }
      while ((i1 != 5) && (i1 != 6));
      if (this.au != null)
        this.au.b();
      if (this.I != null)
        this.I.a();
    }
    while (getScrollX() == 0);
    this.a.a(0);
    J();
    invalidate();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    int i1;
    if (isInTouchMode())
    {
      i1 = 0;
      if (paramBoolean)
        break label107;
      setChildrenDrawingCacheEnabled(false);
      if (this.au != null)
      {
        removeCallbacks(this.au);
        this.au.b();
        if (this.I != null)
          this.I.a();
        if (getScrollX() != 0)
        {
          this.a.a(0);
          J();
          invalidate();
        }
      }
      if (i1 == 1)
        this.M = this.al;
    }
    while (true)
    {
      this.az = i1;
      return;
      i1 = 1;
      break;
      label107: if ((i1 != this.az) && (this.az != -1))
        if (i1 == 1)
        {
          I();
        }
        else
        {
          l();
          this.h = 0;
          e();
        }
    }
  }

  @ViewDebug.ExportedProperty(category="drawing")
  public final int p()
  {
    return this.aG;
  }

  @TargetApi(14)
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    if (super.performAccessibilityAction(paramInt, paramBundle))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      if ((isEnabled()) && (v() < -1 + t()))
      {
        l(getWidth() - this.u.left - this.u.right);
        return true;
      }
      return false;
    case 8192:
    }
    if ((isEnabled()) && (this.V > 0))
    {
      l(-(getWidth() - this.u.left - this.u.right));
      return true;
    }
    return false;
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean)
      F();
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    if ((!this.as) && (!this.ae))
      super.requestLayout();
  }

  public void sendAccessibilityEvent(int paramInt)
  {
    if (paramInt == 4096)
    {
      int i1 = u();
      int i2 = v();
      if ((this.aY == i1) && (this.aZ == i2))
        return;
      this.aY = i1;
      this.aZ = i2;
    }
    super.sendAccessibilityEvent(paramInt);
  }

  public void setOverScrollMode(int paramInt)
  {
    Context localContext;
    if (paramInt != 2)
      if (this.aP == null)
      {
        localContext = getContext();
        this.aP = new s(localContext);
      }
    for (this.aQ = new s(localContext); ; this.aQ = null)
    {
      super.setOverScrollMode(paramInt);
      return;
      this.aP = null;
    }
  }

  public boolean showContextMenuForChild(View paramView)
  {
    int i1 = a(paramView);
    boolean bool = false;
    if (i1 >= 0)
    {
      long l1 = this.j.getItemId(i1);
      p localp = this.ah;
      bool = false;
      if (localp != null)
        bool = this.ah.a();
      if (!bool)
      {
        this.ay = c(getChildAt(i1 - this.V), i1, l1);
        bool = super.showContextMenuForChild(paramView);
      }
    }
    return bool;
  }

  public boolean verifyDrawable(Drawable paramDrawable)
  {
    return (this.m == paramDrawable) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.AbsHListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
