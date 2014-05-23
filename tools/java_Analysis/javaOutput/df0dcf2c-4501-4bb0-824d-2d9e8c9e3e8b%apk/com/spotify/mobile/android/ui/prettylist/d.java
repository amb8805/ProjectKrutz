package com.spotify.mobile.android.ui.prettylist;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListView;
import com.d.a.j;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.activity.MainActivity;

public class d extends ViewGroup
  implements c
{
  private static final com.d.b.c<d, Float> k = new d.1(Float.class, "filterModeLevel");
  private final StickyListView a;
  private final PrettyHeaderView b;
  private int c;
  private int d;
  private View e;
  private View f;
  private float g;
  private boolean h;
  private boolean i;
  private com.d.a.a j;
  private final com.d.a.c l = new d.2(this);
  private final h m = new d.3(this);

  d(Context paramContext)
  {
    super(paramContext);
    this.c = ActionBarManager.b(paramContext);
    this.a = new StickyListView(paramContext);
    this.a.a(this.m);
    this.b = new PrettyHeaderView(paramContext);
    this.b.b(this.c);
    this.a.a(this.b);
    this.a.b(this.c);
    addView(this.a);
    k();
  }

  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    return paramFloat4 + (paramFloat1 - paramFloat2) * (paramFloat5 - paramFloat4) / (paramFloat3 - paramFloat2);
  }

  @Deprecated
  public static d a(MainActivity paramMainActivity)
  {
    return (d)e.a(paramMainActivity);
  }

  private void a(float paramFloat)
  {
    if (this.j != null)
    {
      this.j.b();
      this.j = null;
    }
    this.i = true;
    float f1 = Math.abs(paramFloat - this.g);
    com.d.b.c localc = k;
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = this.g;
    arrayOfFloat[1] = paramFloat;
    this.j = j.a(this, localc, arrayOfFloat);
    this.j.a(()(f1 * 400.0F));
    this.j.a(this.l);
    this.j.a();
  }

  private static float b(float paramFloat)
  {
    return Math.max(0.0F, Math.min(paramFloat, 1.0F));
  }

  private boolean l()
  {
    return (this.i) && (this.h);
  }

  private boolean m()
  {
    return (this.i) && (!this.h);
  }

  private int n()
  {
    if (this.e == null)
      return 0;
    int n = this.e.getMeasuredHeight();
    float f1 = this.d / n;
    if (l())
      f1 = 0.0F;
    if (f1 <= 1.0F);
    int i1;
    for (float f2 = a(a(b(f1), 0.0F, 1.0F, 1.0F, 0.4F), 0.0F, 1.0F, 0.0F, this.c); ; f2 = this.b.getMeasuredHeight() - i1 / 2 - this.d - n)
    {
      return (int)f2;
      View localView = this.f;
      i1 = 0;
      if (localView != null)
        i1 = this.f.getMeasuredHeight();
    }
  }

  private void o()
  {
    if (this.e == null)
      return;
    this.e.offsetTopAndBottom(n() - this.e.getTop());
  }

  private void p()
  {
    if (this.e == null)
      return;
    float f3;
    if (l())
    {
      f3 = 1.0F;
      if ((f3 >= 0.01F) || (this.h))
        break label188;
      this.e.setVisibility(4);
    }
    while (true)
    {
      com.d.c.a.a(this.e, f3);
      return;
      float f1;
      label60: float f2;
      if (this.e == null)
      {
        f1 = 0.0F;
        View localView = this.e;
        f2 = 0.0F;
        if (localView != null)
          break label115;
      }
      while (true)
      {
        f3 = Math.max(f1, f2);
        break;
        int n = this.e.getMeasuredHeight();
        f1 = b(a(this.d / n, 0.75F, 0.1F, 0.0F, 1.0F));
        break label60;
        label115: if (!this.h)
        {
          boolean bool = m();
          f2 = 0.0F;
          if (!bool);
        }
        else
        {
          int i1 = this.e.getMeasuredHeight();
          f2 = b(a(Math.max(0, this.a.b() - this.d) / i1, 1.5F, 0.5F, 0.0F, 1.0F)) * this.g;
        }
      }
      label188: this.e.setVisibility(0);
    }
  }

  private void q()
  {
    if (this.f == null)
      return;
    View localView = this.f;
    float f1;
    if (this.e == null)
      f1 = 1.0F;
    while (true)
    {
      com.d.c.a.a(localView, f1);
      return;
      if ((!this.h) && (!m()))
      {
        f1 = 1.0F;
      }
      else
      {
        int n = this.e.getMeasuredHeight();
        f1 = b(a(Math.max(0, this.a.b() - this.d) / n, 2.0F, 1.0F, 1.0F, 0.0F));
        if (this.i)
          f1 = Math.max(f1, 1.0F - this.g);
      }
    }
  }

  public final StickyListView a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  public final void a(ah paramah)
  {
    this.b.b().a(paramah);
  }

  public final void a(View paramView)
  {
    this.b.b().a(paramView);
  }

  public final void a(a parama)
  {
    this.b.a(parama);
  }

  public final void a(String paramString)
  {
    this.b.a(paramString);
  }

  @TargetApi(11)
  public final void a(boolean paramBoolean)
  {
    ListView localListView = this.a.a();
    int n = this.a.b();
    if ((paramBoolean) && (Build.VERSION.SDK_INT >= 11))
    {
      localListView.smoothScrollToPositionFromTop(0, -n);
      return;
    }
    localListView.setSelectionFromTop(0, -n);
  }

  public final PrettyHeaderView b()
  {
    return this.b;
  }

  public final void b(View paramView)
  {
    this.f = paramView;
    this.b.a(paramView);
    this.a.b(paramView);
    if (paramView != null)
      q();
  }

  public final ListView c()
  {
    return this.a.a();
  }

  public final void c(View paramView)
  {
    if (this.e != null)
      removeView(this.e);
    this.e = paramView;
    if (paramView != null)
    {
      addView(paramView);
      o();
      p();
    }
    requestLayout();
  }

  public final ImageView d()
  {
    return this.b.a();
  }

  public final ImageView e()
  {
    return this.b.b().a();
  }

  public final HeaderView f()
  {
    return this.b.b();
  }

  public final void g()
  {
    if (this.e == null);
    do
    {
      return;
      if (!this.h)
        break;
    }
    while (this.a.c());
    a(true);
    return;
    this.h = true;
    if (this.e != null);
    for (int n = this.e.getMeasuredHeight(); ; n = 0)
    {
      View localView = this.f;
      int i1 = 0;
      if (localView != null)
        i1 = this.f.getMeasuredHeight();
      this.a.b(n + this.c - i1 / 2);
      a(1.0F);
      this.e.offsetTopAndBottom(n() - this.e.getTop());
      a(true);
      return;
    }
  }

  public final void h()
  {
    if ((this.e == null) || (!this.h))
      return;
    this.h = false;
    this.e.clearFocus();
    ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    this.a.b(this.c);
    a(0.0F);
  }

  public final View i()
  {
    return this;
  }

  @TargetApi(11)
  public final void j()
  {
    this.a.a().setSelectionFromTop(0, -this.b.c());
  }

  public final void k()
  {
    this.a.a(true);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int n = paramInt3 - paramInt1;
    int i1 = paramInt4 - paramInt2;
    this.a.layout(0, 0, n, i1);
    if (this.e != null)
    {
      int i2 = n();
      this.e.layout(0, i2, n, i2 + this.e.getMeasuredHeight());
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 0)
      throw new RuntimeException(d.class.getSimpleName() + " doesn't support unspecified width.");
    int n = View.MeasureSpec.getSize(paramInt1);
    View localView = this.e;
    int i1 = 0;
    if (localView != null)
    {
      this.e.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      i1 = this.e.getMeasuredHeight();
    }
    this.b.a(i1);
    this.a.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), paramInt2);
    setMeasuredDimension(n, this.a.getMeasuredHeight());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
