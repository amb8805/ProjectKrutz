package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.c;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;

public class ActionBarContextView extends a
{
  private View g;
  private View h;
  private LinearLayout i;
  private int j;
  private int k;
  private Drawable l;
  private boolean m;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, c.f);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.f, paramInt, 0);
    setBackgroundDrawable(localTypedArray.getDrawable(3));
    this.j = localTypedArray.getResourceId(1, 0);
    this.k = localTypedArray.getResourceId(2, 0);
    this.f = localTypedArray.getLayoutDimension(0, 0);
    this.l = localTypedArray.getDrawable(4);
    localTypedArray.recycle();
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  public final void a(boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams;
    if (this.d != paramBoolean)
      if (this.b != null)
      {
        localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
        if (paramBoolean)
          break label94;
        this.a = ((ActionMenuView)this.b.a(this));
        this.a.setBackgroundDrawable(null);
        ViewGroup localViewGroup2 = (ViewGroup)this.a.getParent();
        if (localViewGroup2 != null)
          localViewGroup2.removeView(this.a);
        addView(this.a, localLayoutParams);
      }
    while (true)
    {
      super.a(paramBoolean);
      return;
      label94: this.b.a(getContext().getResources().getDisplayMetrics().widthPixels);
      this.b.b();
      localLayoutParams.width = -1;
      localLayoutParams.height = this.f;
      this.a = ((ActionMenuView)this.b.a(this));
      this.a.setBackgroundDrawable(this.l);
      ViewGroup localViewGroup1 = (ViewGroup)this.a.getParent();
      if (localViewGroup1 != null)
        localViewGroup1.removeView(this.a);
      this.c.addView(this.a, localLayoutParams);
    }
  }

  public final boolean b()
  {
    if (this.b != null)
      return this.b.c();
    return false;
  }

  public final boolean d()
  {
    if (this.b != null)
      return this.b.d();
    return false;
  }

  public final boolean e()
  {
    if (this.b != null)
      return this.b.g();
    return false;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b != null)
    {
      this.b.d();
      this.b.f();
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int n = getPaddingLeft();
    int i1 = getPaddingTop();
    int i2 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i5;
    if ((this.g != null) && (this.g.getVisibility() != 8))
    {
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.g.getLayoutParams();
      i5 = n + localMarginLayoutParams.leftMargin;
    }
    for (int i3 = i5 + a(this.g, i5, i1, i2) + localMarginLayoutParams.rightMargin; ; i3 = n)
    {
      if ((this.i != null) && (this.h == null) && (this.i.getVisibility() != 8))
        i3 += a(this.i, i3, i1, i2);
      if (this.h != null)
        a(this.h, i3, i1, i2);
      int i4 = paramInt3 - paramInt1 - getPaddingRight();
      if (this.a != null)
        b(this.a, i4, i1, i2);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = 1073741824;
    int i1 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != n)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"FILL_PARENT\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3;
    int i5;
    int i6;
    int i7;
    int i15;
    label286: int i16;
    label312: label319: int i11;
    label348: label378: int i12;
    label398: int i9;
    label434: int i10;
    if (this.f > 0)
    {
      i3 = this.f;
      int i4 = getPaddingTop() + getPaddingBottom();
      i5 = i2 - getPaddingLeft() - getPaddingRight();
      i6 = i3 - i4;
      i7 = View.MeasureSpec.makeMeasureSpec(i6, -2147483648);
      if (this.g != null)
      {
        int i17 = a(this.g, i5, i7);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.g.getLayoutParams();
        i5 = i17 - (localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin);
      }
      if ((this.a != null) && (this.a.getParent() == this))
        i5 = a(this.a, i5, i7);
      if ((this.i != null) && (this.h == null))
      {
        if (!this.m)
          break label494;
        int i13 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(i13, i7);
        int i14 = this.i.getMeasuredWidth();
        if (i14 > i5)
          break label481;
        i15 = 1;
        if (i15 != 0)
          i5 -= i14;
        LinearLayout localLinearLayout = this.i;
        if (i15 == 0)
          break label487;
        i16 = 0;
        localLinearLayout.setVisibility(i16);
      }
      if (this.h != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.h.getLayoutParams();
        if (localLayoutParams.width == -2)
          break label510;
        i11 = n;
        if (localLayoutParams.width >= 0)
          i5 = Math.min(localLayoutParams.width, i5);
        if (localLayoutParams.height == -2)
          break label518;
        if (localLayoutParams.height < 0)
          break label525;
        i12 = Math.min(localLayoutParams.height, i6);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i5, i11), View.MeasureSpec.makeMeasureSpec(i12, n));
      }
      if (this.f > 0)
        break label541;
      int i8 = getChildCount();
      i9 = 0;
      if (i1 >= i8)
        break label532;
      i10 = i4 + getChildAt(i1).getMeasuredHeight();
      if (i10 <= i9)
        break label550;
    }
    while (true)
    {
      i1++;
      i9 = i10;
      break label434;
      i3 = View.MeasureSpec.getSize(paramInt2);
      break;
      label481: i15 = 0;
      break label286;
      label487: i16 = 8;
      break label312;
      label494: i5 = a(this.i, i5, i7);
      break label319;
      label510: i11 = -2147483648;
      break label348;
      label518: n = -2147483648;
      break label378;
      label525: i12 = i6;
      break label398;
      label532: setMeasuredDimension(i2, i9);
      return;
      label541: setMeasuredDimension(i2, i3);
      return;
      label550: i10 = i9;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
