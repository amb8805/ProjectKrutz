package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.fragments.logic.m;
import com.spotify.mobile.android.ui.fragments.logic.n;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;

public class MainLayout extends ViewGroup
  implements n
{
  private boolean a;
  private int b;
  private PremiumUpsellBanner c;
  private View d;
  private View e;
  private View f;
  private View g;
  private int h;
  private k i;

  public MainLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = f.a(paramContext);
  }

  private static int b(View paramView)
  {
    int j = paramView.getId();
    if ((j < 0) && ((paramView instanceof ViewGroup)))
    {
      View localView = ((ViewGroup)paramView).getChildAt(0);
      if (localView != null)
        j = localView.getId();
    }
    return j;
  }

  private int c()
  {
    return (int)(((l)this.e.getLayoutParams()).b * this.e.getMeasuredHeight());
  }

  private int d()
  {
    int j = this.h;
    return this.f.getMeasuredHeight() - j + (int)(((l)this.f.getLayoutParams()).b * j);
  }

  public final void F()
  {
    this.c.a();
  }

  public final void a(k paramk)
  {
    this.i = paramk;
  }

  public final void a(boolean paramBoolean)
  {
    View localView = this.g;
    if (paramBoolean);
    for (int j = 0; ; j = 8)
    {
      localView.setVisibility(j);
      return;
    }
  }

  public final boolean a()
  {
    return this.g.getVisibility() == 0;
  }

  public final View b()
  {
    return this.g;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    m.a(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    m.b(this);
  }

  protected void onFinishInflate()
  {
    this.c = ((PremiumUpsellBanner)findViewById(2131362511));
    this.d = findViewById(2131362262);
    this.e = findViewById(2131362512);
    this.f = findViewById(2131362513);
    this.g = findViewById(2131362514);
    this.c.a(1);
    this.c.a(ViewUri.b, ViewUri.SubView.h);
    F();
    this.e.setLayoutParams(new l(this.e.getLayoutParams()));
    this.f.setLayoutParams(new l(this.f.getLayoutParams()));
    View localView = this.d;
    if (this.a);
    for (int j = 0; ; j = 8)
    {
      localView.setVisibility(j);
      this.b = ActionBarManager.b(getContext());
      return;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = this.b;
    int k;
    if (this.c.getVisibility() == 0)
    {
      k = j + this.c.getMeasuredHeight();
      this.c.layout(0, j, getWidth(), k);
    }
    while (true)
    {
      if (this.a)
      {
        int i4 = k + this.d.getMeasuredHeight();
        this.d.layout(0, k, getWidth(), i4);
      }
      int m = getHeight() - d();
      int n = m + this.f.getMeasuredHeight();
      this.f.layout(0, m, getWidth(), n);
      int i1 = this.f.getTop();
      int i2 = i1 - c();
      this.e.layout(0, i2, getWidth(), i1);
      Object localObject = null;
      int i3 = 0;
      if (i3 < getChildCount())
      {
        View localView = getChildAt(i3);
        switch (b(localView))
        {
        default:
          if ((this.i != null) && (this.i.a(localView)))
            localView.layout(0, 0, getWidth(), this.e.getTop());
        case 2131362262:
        case 2131362511:
        case 2131362512:
        case 2131362513:
        case 2131362514:
        case 2131362607:
        }
        while (true)
        {
          i3++;
          break;
          localView.layout(0, 0, getWidth(), getHeight());
          localObject = localView;
          continue;
          localView.layout(0, k, getWidth(), this.e.getTop());
        }
      }
      if (this.a)
        this.d.bringToFront();
      if (localObject != null)
        localObject.bringToFront();
      this.g.layout(0, 0, getWidth(), getHeight());
      this.g.bringToFront();
      return;
      k = j;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int k = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    if (this.c.getVisibility() == 0)
      this.c.measure(j, View.MeasureSpec.makeMeasureSpec(0, 0));
    if (this.a)
      this.d.measure(j, View.MeasureSpec.makeMeasureSpec(this.d.getLayoutParams().height, 1073741824));
    this.e.measure(j, View.MeasureSpec.makeMeasureSpec(0, 0));
    this.f.measure(j, View.MeasureSpec.makeMeasureSpec(0, 0));
    this.h = s.a(this.f);
    this.g.measure(j, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    int m = getMeasuredHeight();
    if (this.c.getVisibility() == 0)
      m -= this.c.getMeasuredHeight();
    int n = m - c() - d();
    int i1 = View.MeasureSpec.makeMeasureSpec(n - this.b, 1073741824);
    int i2 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
    int i3 = 0;
    boolean bool = false;
    if (i3 < getChildCount())
    {
      View localView = getChildAt(i3);
      switch (b(localView))
      {
      default:
        if ((this.i != null) && (this.i.a(localView)))
        {
          localView.measure(j, i2);
          bool = true;
        }
      case 2131362262:
      case 2131362511:
      case 2131362512:
      case 2131362513:
      case 2131362514:
      case 2131362607:
      }
      while (true)
      {
        i3++;
        break;
        localView.measure(j, k);
        continue;
        localView.measure(j, i1);
        bool = false;
      }
    }
    if (this.i != null)
      this.i.a(bool);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.MainLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
