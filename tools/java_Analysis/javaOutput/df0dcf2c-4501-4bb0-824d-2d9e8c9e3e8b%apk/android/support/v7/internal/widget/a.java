package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.a.c;
import android.support.v7.a.d;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a extends ViewGroup
{
  protected ActionMenuView a;
  protected ActionMenuPresenter b;
  protected ActionBarContainer c;
  protected boolean d;
  protected boolean e;
  protected int f;

  a(Context paramContext)
  {
    super(paramContext);
  }

  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected static int a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, 0 + (paramInt1 - paramView.getMeasuredWidth()));
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1, k, paramInt1 + i, j + k);
    return i;
  }

  protected static int b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1 - i, k, paramInt1, j + k);
    return i;
  }

  public int a()
  {
    return getVisibility();
  }

  public void a(int paramInt)
  {
    this.f = paramInt;
    requestLayout();
  }

  public void a(ActionBarContainer paramActionBarContainer)
  {
    this.c = paramActionBarContainer;
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public boolean b()
  {
    if (this.b != null)
      return this.b.c();
    return false;
  }

  public void c()
  {
    post(new a.1(this));
  }

  public boolean d()
  {
    if (this.b != null)
      return this.b.d();
    return false;
  }

  public boolean e()
  {
    if (this.b != null)
      return this.b.g();
    return false;
  }

  public boolean f()
  {
    return (this.b != null) && (this.b.h());
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(null, k.a, c.b, 0);
    a(localTypedArray.getLayoutDimension(0, 0));
    localTypedArray.recycle();
    if (this.e)
      a(getContext().getResources().getBoolean(d.e));
    if (this.b != null)
      this.b.a();
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
      super.setVisibility(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
