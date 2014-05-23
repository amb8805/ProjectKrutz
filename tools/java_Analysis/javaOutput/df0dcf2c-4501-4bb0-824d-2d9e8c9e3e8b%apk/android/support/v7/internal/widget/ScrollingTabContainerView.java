package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.support.v7.a.c;
import android.support.v7.internal.view.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public final class ScrollingTabContainerView extends HorizontalScrollView
  implements n
{
  Runnable a;
  int b;
  int c;
  private LinearLayout d;
  private ab e;
  private boolean f;
  private final LayoutInflater g;
  private int h;
  private int i;

  private void a(int paramInt)
  {
    this.i = paramInt;
    int j = this.d.getChildCount();
    int k = 0;
    if (k < j)
    {
      View localView1 = this.d.getChildAt(k);
      if (k == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView1.setSelected(bool);
        if (bool)
        {
          View localView2 = this.d.getChildAt(paramInt);
          if (this.a != null)
            removeCallbacks(this.a);
          this.a = new ScrollingTabContainerView.1(this, localView2);
          post(this.a);
        }
        k++;
        break;
      }
    }
  }

  private boolean a()
  {
    return (this.e != null) && (this.e.getParent() == this);
  }

  private boolean b()
  {
    if (!a())
      return false;
    removeView(this.e);
    addView(this.d, new ViewGroup.LayoutParams(-2, -1));
    a(this.e.v);
    return false;
  }

  public final void a(View paramView, int paramInt)
  {
    ((ScrollingTabContainerView.TabView)paramView).a();
  }

  public final void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a);
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    a locala = a.a(getContext());
    this.h = locala.d();
    requestLayout();
    this.c = locala.f();
  }

  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a);
  }

  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 1;
    int k = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label72: label87: int n;
    if (k == 1073741824)
    {
      bool = j;
      setFillViewport(bool);
      int m = this.d.getChildCount();
      if ((m <= j) || ((k != 1073741824) && (k != -2147483648)))
        break label338;
      if (m <= 2)
        break label325;
      this.b = (int)(0.4F * View.MeasureSpec.getSize(paramInt1));
      this.b = Math.min(this.b, this.c);
      n = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
      if ((bool) || (!this.f))
        break label346;
      label110: if (j == 0)
        break label359;
      this.d.measure(0, n);
      if (this.d.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label351;
      if (!a())
      {
        if (this.e == null)
        {
          ab localab = new ab(getContext(), c.e);
          localab.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
          localab.b(this);
          this.e = localab;
        }
        removeView(this.d);
        addView(this.e, new ViewGroup.LayoutParams(-2, -1));
        if (this.e.a == null)
          this.e.a(new aa(this, (byte)0));
        if (this.a != null)
        {
          removeCallbacks(this.a);
          this.a = null;
        }
        this.e.a(this.i);
      }
    }
    while (true)
    {
      int i1 = getMeasuredWidth();
      super.onMeasure(paramInt1, n);
      int i2 = getMeasuredWidth();
      if ((bool) && (i1 != i2))
        a(this.i);
      return;
      bool = false;
      break;
      label325: this.b = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label72;
      label338: this.b = -1;
      break label87;
      label346: j = 0;
      break label110;
      label351: b();
      continue;
      label359: b();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
