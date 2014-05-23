package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;

public abstract class AdapterView<T extends Adapter> extends ViewGroup
{

  @ViewDebug.ExportedProperty(category="scrolling")
  protected int V = 0;
  protected int W;
  protected int Z;
  private int a;
  protected long aa = -9223372036854775808L;
  protected long ab;
  protected boolean ac = false;
  int ad;
  protected boolean ae = false;
  q af;
  o ag;
  p ah;
  public boolean ai;

  @ViewDebug.ExportedProperty(category="list")
  protected int aj = -1;
  protected long ak = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  protected int al = -1;
  protected long am = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  protected int an;
  protected int ao;
  AccessibilityManager ap;
  protected int aq = -1;
  protected long ar = -9223372036854775808L;
  protected boolean as = false;
  private View b;
  private boolean c;
  private boolean d;
  private AdapterView<T>.r e;

  public AdapterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AdapterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if ((Build.VERSION.SDK_INT >= 16) && (getImportantForAccessibility() == 0))
      setImportantForAccessibility(1);
    this.ap = ((AccessibilityManager)getContext().getSystemService("accessibility"));
  }

  private void a()
  {
    if (this.af == null)
      return;
    int i = this.aj;
    if (i >= 0)
    {
      g();
      q().getItemId(i);
      return;
    }
  }

  private void b()
  {
    if (!this.ap.isEnabled());
    while (this.aj < 0)
      return;
    sendAccessibilityEvent(4);
  }

  private boolean c()
  {
    Adapter localAdapter = q();
    boolean bool = false;
    if (localAdapter != null)
    {
      int i = localAdapter.getCount();
      bool = false;
      if (i > 0)
        if (this.V <= 0)
        {
          int j = v();
          int k = i - 1;
          bool = false;
          if (j >= k);
        }
        else
        {
          bool = true;
        }
    }
    return bool;
  }

  protected int a(int paramInt, boolean paramBoolean)
  {
    return paramInt;
  }

  public final int a(View paramView)
  {
    try
    {
      while (true)
      {
        View localView = (View)paramView.getParent();
        boolean bool = localView.equals(this);
        if (bool)
          break;
        paramView = localView;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      return -1;
    }
    int i = getChildCount();
    for (int j = 0; j < i; j++)
      if (getChildAt(j).equals(paramView))
        return j + this.V;
    return -1;
  }

  public boolean a(View paramView, int paramInt, long paramLong)
  {
    if (this.ag != null)
    {
      playSoundEffect(0);
      if (paramView != null)
        paramView.sendAccessibilityEvent(1);
      return true;
    }
    return false;
  }

  public void addView(View paramView)
  {
    throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
  }

  protected boolean canAnimate()
  {
    return (super.canAnimate()) && (this.an > 0);
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = g();
    return (localView != null) && (localView.getVisibility() == 0) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent));
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  public abstract void f(int paramInt);

  public final long g(int paramInt)
  {
    Adapter localAdapter = q();
    if ((localAdapter == null) || (paramInt < 0))
      return -9223372036854775808L;
    return localAdapter.getItemId(paramInt);
  }

  public abstract View g();

  protected final void h(int paramInt)
  {
    this.al = paramInt;
    this.am = g(paramInt);
  }

  protected final void i(int paramInt)
  {
    this.aj = paramInt;
    this.ak = g(paramInt);
    if ((this.ac) && (this.ad == 0) && (paramInt >= 0))
    {
      this.Z = paramInt;
      this.aa = this.ak;
    }
  }

  void o()
  {
    int i = this.an;
    int k;
    int n;
    int i1;
    label104: int j;
    if (i > 0)
      if (this.ac)
      {
        this.ac = false;
        int i2 = y();
        if ((i2 >= 0) && (a(i2, true) == i2))
        {
          i(i2);
          k = 1;
          if (k == 0)
          {
            int m = this.aj;
            if (m >= i)
              m = i - 1;
            if (m < 0)
              m = 0;
            n = a(m, true);
            if (n >= 0)
              break label164;
            i1 = a(m, false);
            if (i1 >= 0)
            {
              i(i1);
              x();
              j = 1;
            }
          }
        }
      }
    while (true)
    {
      if (j == 0)
      {
        this.al = -1;
        this.am = -9223372036854775808L;
        this.aj = -1;
        this.ak = -9223372036854775808L;
        this.ac = false;
        x();
      }
      return;
      j = k;
      continue;
      label164: i1 = n;
      break label104;
      k = 0;
      break;
      j = 0;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.e);
  }

  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(AdapterView.class.getName());
    paramAccessibilityEvent.setScrollable(c());
    View localView = g();
    if (localView != null)
      paramAccessibilityEvent.setEnabled(localView.isEnabled());
    paramAccessibilityEvent.setCurrentItemIndex(this.aj);
    paramAccessibilityEvent.setFromIndex(this.V);
    paramAccessibilityEvent.setToIndex(v());
    paramAccessibilityEvent.setItemCount(this.an);
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(AdapterView.class.getName());
    paramAccessibilityNodeInfo.setScrollable(c());
    View localView = g();
    if (localView != null)
      paramAccessibilityNodeInfo.setEnabled(localView.isEnabled());
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = getWidth();
  }

  @TargetApi(14)
  public boolean onRequestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (super.onRequestSendAccessibilityEvent(paramView, paramAccessibilityEvent))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      onInitializeAccessibilityEvent(localAccessibilityEvent);
      paramView.dispatchPopulateAccessibilityEvent(localAccessibilityEvent);
      paramAccessibilityEvent.appendRecord(localAccessibilityEvent);
      return true;
    }
    return false;
  }

  public abstract T q();

  @ViewDebug.CapturedViewProperty
  public final int r()
  {
    return this.aj;
  }

  public void removeAllViews()
  {
    throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
  }

  public void removeView(View paramView)
  {
    throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
  }

  public void removeViewAt(int paramInt)
  {
    throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
  }

  @ViewDebug.CapturedViewProperty
  public final long s()
  {
    return this.ak;
  }

  public void setFocusable(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = q();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.c = paramBoolean;
      if (!paramBoolean)
        this.d = false;
      if ((!paramBoolean) || (bool2))
        break label58;
    }
    while (true)
    {
      super.setFocusable(bool1);
      return;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = q();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.d = paramBoolean;
      if (paramBoolean)
        this.c = bool1;
      if ((!paramBoolean) || (bool2))
        break label58;
    }
    while (true)
    {
      super.setFocusableInTouchMode(bool1);
      return;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
  }

  @ViewDebug.CapturedViewProperty
  public final int t()
  {
    return this.an;
  }

  public final int u()
  {
    return this.V;
  }

  public final int v()
  {
    return -1 + (this.V + getChildCount());
  }

  protected final void w()
  {
    boolean bool1 = true;
    Adapter localAdapter = q();
    int i;
    int j;
    label29: boolean bool2;
    label44: boolean bool3;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i = bool1;
      if (i != 0)
        break label150;
      j = bool1;
      if ((j == 0) || (!this.d))
        break label156;
      bool2 = bool1;
      super.setFocusableInTouchMode(bool2);
      if ((j == 0) || (!this.c))
        break label162;
      bool3 = bool1;
      label65: super.setFocusable(bool3);
      if (this.b != null)
      {
        if ((localAdapter != null) && (!localAdapter.isEmpty()))
          break label168;
        label91: if (!bool1)
          break label181;
        if (this.b == null)
          break label173;
        this.b.setVisibility(0);
        setVisibility(8);
      }
    }
    while (true)
    {
      if (this.ai)
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
      return;
      i = 0;
      break;
      label150: j = 0;
      break label29;
      label156: bool2 = false;
      break label44;
      label162: bool3 = false;
      break label65;
      label168: bool1 = false;
      break label91;
      label173: setVisibility(0);
    }
    label181: if (this.b != null)
      this.b.setVisibility(8);
    setVisibility(0);
  }

  protected final void x()
  {
    if ((this.al != this.aq) || (this.am != this.ar))
      if ((this.af != null) || (this.ap.isEnabled()))
      {
        if ((!this.ae) && (!this.as))
          break label100;
        if (this.e == null)
          this.e = new r(this, (byte)0);
        post(this.e);
      }
    while (true)
    {
      this.aq = this.al;
      this.ar = this.am;
      return;
      label100: a();
      b();
    }
  }

  final int y()
  {
    int i = this.an;
    if (i == 0)
      return -1;
    long l1 = this.aa;
    int j = this.Z;
    if (l1 == -9223372036854775808L)
      return -1;
    int k = Math.max(0, j);
    int m = Math.min(i - 1, k);
    long l2 = 100L + SystemClock.uptimeMillis();
    Adapter localAdapter = q();
    int n;
    int i4;
    label83: int i1;
    int i5;
    label91: int i3;
    int i2;
    if (localAdapter == null)
    {
      return -1;
      if (n == i - 1)
      {
        i4 = 1;
        if (i1 != 0)
          break label165;
        i5 = 1;
        if ((i4 != 0) && (i5 != 0))
          break label206;
        if ((i5 == 0) && ((i3 == 0) || (i4 != 0)))
          break label171;
        int i6 = n + 1;
        n = i6;
        i2 = i6;
        i3 = 0;
      }
    }
    while (true)
    {
      if (SystemClock.uptimeMillis() <= l2)
      {
        if (localAdapter.getItemId(i2) != l1)
          break;
        return i2;
        i4 = 0;
        break label83;
        label165: i5 = 0;
        break label91;
        label171: if ((i4 == 0) && ((i3 != 0) || (i5 != 0)))
          continue;
        int i7 = i1 - 1;
        i1 = i7;
        i2 = i7;
        i3 = 1;
        continue;
      }
      label206: return -1;
      n = m;
      i1 = m;
      i2 = m;
      i3 = 0;
    }
  }

  public final void z()
  {
    if (getChildCount() > 0)
    {
      this.ac = true;
      this.ab = this.a;
      if (this.al >= 0)
      {
        View localView2 = getChildAt(this.al - this.V);
        this.aa = this.ak;
        this.Z = this.aj;
        if (localView2 != null)
          this.W = localView2.getLeft();
        this.ad = 0;
      }
    }
    else
    {
      return;
    }
    View localView1 = getChildAt(0);
    Adapter localAdapter = q();
    if ((this.V >= 0) && (this.V < localAdapter.getCount()));
    for (this.aa = localAdapter.getItemId(this.V); ; this.aa = -1L)
    {
      this.Z = this.V;
      if (localView1 != null)
        this.W = localView1.getLeft();
      this.ad = 1;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.AdapterView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
