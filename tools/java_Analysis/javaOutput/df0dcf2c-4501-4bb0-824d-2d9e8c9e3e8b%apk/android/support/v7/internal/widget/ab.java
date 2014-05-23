package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.a.k;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

final class ab extends AbsSpinnerICS
  implements DialogInterface.OnClickListener
{
  int E;
  private af F;
  private ad G;
  private int H;
  private Rect I = new Rect();

  ab(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, (byte)0);
  }

  private ab(Context paramContext, int paramInt, byte paramByte)
  {
    super(paramContext, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, k.n, paramInt, 0);
    switch (localTypedArray.getInt(7, 0))
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      this.H = localTypedArray.getInt(0, 17);
      this.F.a(localTypedArray.getString(6));
      localTypedArray.recycle();
      if (this.G != null)
      {
        this.F.a(this.G);
        this.G = null;
      }
      return;
      this.F = new ac(this, (byte)0);
      continue;
      ae localae = new ae(this, paramContext, paramInt);
      this.E = localTypedArray.getLayoutDimension(3, -2);
      localae.a(localTypedArray.getDrawable(2));
      int i = localTypedArray.getDimensionPixelOffset(5, 0);
      if (i != 0)
        localae.b(i);
      int j = localTypedArray.getDimensionPixelOffset(4, 0);
      if (j != 0)
        localae.a(j);
      this.F = localae;
    }
  }

  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = generateDefaultLayoutParams();
    addViewInLayout(paramView, 0, localLayoutParams);
    paramView.setSelected(hasFocus());
    int i = ViewGroup.getChildMeasureSpec(this.b, this.i.top + this.i.bottom, localLayoutParams.height);
    paramView.measure(ViewGroup.getChildMeasureSpec(this.c, this.i.left + this.i.right, localLayoutParams.width), i);
    int j = this.i.top + (getMeasuredHeight() - this.i.bottom - this.i.top - paramView.getMeasuredHeight()) / 2;
    int k = j + paramView.getMeasuredHeight();
    paramView.layout(0, j, 0 + paramView.getMeasuredWidth(), k);
  }

  private View d(int paramInt)
  {
    if (!this.u)
    {
      View localView2 = this.j.a(paramInt);
      if (localView2 != null)
      {
        a(localView2);
        return localView2;
      }
    }
    View localView1 = this.a.getView(paramInt, null, this);
    a(localView1);
    return localView1;
  }

  final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null)
      return 0;
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = Math.max(0, this.v);
    int m = Math.min(paramSpinnerAdapter.getCount(), k + 15);
    int n = Math.max(0, k - (15 - (m - k)));
    View localView1 = null;
    int i1 = 0;
    int i2 = 0;
    int i3;
    if (n < m)
    {
      i3 = paramSpinnerAdapter.getItemViewType(n);
      if (i3 == i2)
        break label200;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      localView1 = paramSpinnerAdapter.getView(n, localView2, this);
      if (localView1.getLayoutParams() == null)
        localView1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localView1.measure(i, j);
      i1 = Math.max(i1, localView1.getMeasuredWidth());
      n++;
      i2 = i3;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.I);
        return i1 + (this.I.left + this.I.right);
      }
      return i1;
      label200: i3 = i2;
    }
  }

  public final void a(n paramn)
  {
    throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
  }

  public final void a(SpinnerAdapter paramSpinnerAdapter)
  {
    super.a(paramSpinnerAdapter);
    if (this.F != null)
    {
      this.F.a(new ad(paramSpinnerAdapter));
      return;
    }
    this.G = new ad(paramSpinnerAdapter);
  }

  final void b(n paramn)
  {
    super.a(paramn);
  }

  public final int getBaseline()
  {
    int i = -1;
    View localView;
    if (getChildCount() > 0)
      localView = getChildAt(0);
    while (true)
    {
      if (localView != null)
      {
        int k = localView.getBaseline();
        if (k >= 0)
          i = k + localView.getTop();
      }
      return i;
      SpinnerAdapter localSpinnerAdapter = this.a;
      localView = null;
      if (localSpinnerAdapter != null)
      {
        int j = this.a.getCount();
        localView = null;
        if (j > 0)
        {
          localView = d(0);
          this.j.a(0, localView);
          removeAllViewsInLayout();
        }
      }
    }
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a(paramInt);
    paramDialogInterface.dismiss();
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.F != null) && (this.F.i()))
      this.F.f();
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.r = true;
    int i = this.i.left;
    int j = getRight() - getLeft() - this.i.left - this.i.right;
    if (this.u)
      e();
    if (this.z == 0)
    {
      a();
      this.r = false;
      return;
    }
    if (this.v >= 0)
      b(this.v);
    int k = getChildCount();
    b localb = this.j;
    int m = this.k;
    for (int n = 0; n < k; n++)
    {
      View localView2 = getChildAt(n);
      localb.a(m + n, localView2);
    }
    removeAllViewsInLayout();
    this.k = this.x;
    View localView1 = d(this.x);
    int i1 = localView1.getMeasuredWidth();
    switch (0x7 & this.H)
    {
    default:
    case 1:
    case 5:
    }
    while (true)
    {
      localView1.offsetLeftAndRight(i);
      this.j.a();
      invalidate();
      f();
      this.u = false;
      this.p = false;
      c(this.x);
      break;
      i = i + j / 2 - i1 / 2;
      continue;
      i = i + j - i1;
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.F != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(this.a, getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
  }

  public final boolean performClick()
  {
    boolean bool = super.performClick();
    if (!bool)
    {
      bool = true;
      if (!this.F.i())
        this.F.e();
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
