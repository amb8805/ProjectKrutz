package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.view.l;
import android.support.v4.view.m;
import android.support.v7.a.h;
import android.support.v7.internal.view.a;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public final class ActionMenuPresenter extends i
  implements m
{
  final g a = new g(this, (byte)0);
  int b;
  private View i;
  private boolean j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private int s;
  private final SparseBooleanArray t = new SparseBooleanArray();
  private View u;
  private f v;
  private c w;
  private d x;

  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, h.g, h.f);
  }

  public final ac a(ViewGroup paramViewGroup)
  {
    ac localac = super.a(paramViewGroup);
    ((ActionMenuView)localac).a(this);
    return localac;
  }

  public final View a(r paramr, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramr.getActionView();
    if ((localView == null) || (paramr.m()))
    {
      if (!(paramView instanceof ActionMenuItemView))
        paramView = null;
      localView = super.a(paramr, paramView, paramViewGroup);
    }
    if (paramr.isActionViewExpanded());
    for (int i1 = 8; ; i1 = 0)
    {
      localView.setVisibility(i1);
      ActionMenuView localActionMenuView = (ActionMenuView)paramViewGroup;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (!localActionMenuView.checkLayoutParams(localLayoutParams))
        localView.setLayoutParams(ActionMenuView.a(localLayoutParams));
      return localView;
    }
  }

  public final void a()
  {
    if (!this.o)
      this.n = this.d.getResources().getInteger(android.support.v7.a.g.a);
    if (this.e != null)
      this.e.b(true);
  }

  public final void a(int paramInt)
  {
    this.l = paramInt;
    this.p = true;
    this.q = true;
  }

  public final void a(Context paramContext, n paramn)
  {
    super.a(paramContext, paramn);
    Resources localResources = paramContext.getResources();
    a locala = a.a(paramContext);
    boolean bool;
    int i1;
    if (!this.k)
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        bool = true;
        this.j = bool;
      }
    }
    else
    {
      if (!this.q)
        this.l = locala.b();
      if (!this.o)
        this.n = locala.a();
      i1 = this.l;
      if (!this.j)
        break label172;
      if (this.i == null)
      {
        this.i = new e(this, this.c);
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(i2, i2);
      }
      i1 -= this.i.getMeasuredWidth();
    }
    while (true)
    {
      this.m = i1;
      this.s = (int)(56.0F * localResources.getDisplayMetrics().density);
      this.u = null;
      return;
      bool = false;
      break;
      label172: this.i = null;
    }
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    e();
    super.a(paramn, paramBoolean);
  }

  public final void a(r paramr, ad paramad)
  {
    paramad.a(paramr);
    ActionMenuView localActionMenuView = (ActionMenuView)this.h;
    ((ActionMenuItemView)paramad).a(localActionMenuView);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.e.a(false);
  }

  public final boolean a(ag paramag)
  {
    if (!paramag.hasVisibleItems())
      return false;
    for (ag localag = paramag; localag.q() != this.e; localag = (ag)localag.q());
    MenuItem localMenuItem = localag.getItem();
    ViewGroup localViewGroup = (ViewGroup)this.h;
    int i2;
    View localView;
    if (localViewGroup != null)
    {
      int i1 = localViewGroup.getChildCount();
      i2 = 0;
      if (i2 < i1)
      {
        localView = localViewGroup.getChildAt(i2);
        if ((!(localView instanceof ad)) || (((ad)localView).a() != localMenuItem));
      }
    }
    while (true)
    {
      if (localView != null)
        break label131;
      if (this.i != null)
        break label126;
      return false;
      i2++;
      break;
      localView = null;
    }
    label126: this.b = paramag.getItem().getItemId();
    label131: this.w = new c(this, paramag);
    this.w.a();
    super.a(paramag);
    return true;
  }

  public final boolean a(r paramr)
  {
    return paramr.h();
  }

  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.i)
      return false;
    return super.a(paramViewGroup, paramInt);
  }

  public final void b()
  {
    this.n = 2147483647;
    this.o = true;
  }

  public final void b(boolean paramBoolean)
  {
    this.r = paramBoolean;
  }

  public final void c(boolean paramBoolean)
  {
    int i1 = 1;
    super.c(paramBoolean);
    if (this.h == null)
      return;
    if (this.e != null)
    {
      ArrayList localArrayList2 = this.e.l();
      int i5 = localArrayList2.size();
      for (int i6 = 0; i6 < i5; i6++)
      {
        l locall = ((r)localArrayList2.get(i6)).l();
        if (locall != null)
          locall.a(this);
      }
    }
    ArrayList localArrayList1;
    int i2;
    int i3;
    int i4;
    if (this.e != null)
    {
      localArrayList1 = this.e.m();
      boolean bool = this.j;
      i2 = 0;
      if (bool)
      {
        i2 = 0;
        if (localArrayList1 != null)
        {
          i3 = localArrayList1.size();
          if (i3 != i1)
            break label255;
          if (((r)localArrayList1.get(0)).isActionViewExpanded())
            break label249;
          i4 = i1;
          label145: i2 = i4;
        }
      }
      if (i2 == 0)
        break label271;
      if (this.i == null)
        this.i = new e(this, this.c);
      ViewGroup localViewGroup = (ViewGroup)this.i.getParent();
      if (localViewGroup != this.h)
      {
        if (localViewGroup != null)
          localViewGroup.removeView(this.i);
        ((ActionMenuView)this.h).addView(this.i, ActionMenuView.a());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.h).a(this.j);
      return;
      localArrayList1 = null;
      break;
      label249: i4 = 0;
      break label145;
      label255: if (i3 > 0);
      while (true)
      {
        i2 = i1;
        break;
        i1 = 0;
      }
      label271: if ((this.i != null) && (this.i.getParent() == this.h))
        ((ViewGroup)this.h).removeView(this.i);
    }
  }

  public final boolean c()
  {
    if ((this.j) && (!g()) && (this.e != null) && (this.h != null) && (this.x == null))
    {
      this.x = new d(this, new f(this, this.d, this.e, this.i));
      ((View)this.h).post(this.x);
      super.a(null);
      return true;
    }
    return false;
  }

  public final boolean d()
  {
    if ((this.x != null) && (this.h != null))
    {
      ((View)this.h).removeCallbacks(this.x);
      this.x = null;
      return true;
    }
    f localf = this.v;
    if (localf != null)
    {
      localf.b();
      return true;
    }
    return false;
  }

  public final boolean e()
  {
    return d() | f();
  }

  public final boolean f()
  {
    if (this.w != null)
    {
      this.w.b();
      return true;
    }
    return false;
  }

  public final boolean g()
  {
    return (this.v != null) && (this.v.c());
  }

  public final boolean h()
  {
    return this.j;
  }

  public final boolean i()
  {
    ArrayList localArrayList = this.e.j();
    int i1 = localArrayList.size();
    int i2 = this.n;
    int i3 = this.m;
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.h;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    r localr3;
    if (i8 < i1)
    {
      localr3 = (r)localArrayList.get(i8);
      if (localr3.j())
      {
        i5++;
        label80: if ((!this.r) || (!localr3.isActionViewExpanded()))
          break label824;
      }
    }
    label291: label428: label824: for (int i36 = 0; ; i36 = i2)
    {
      i8++;
      i2 = i36;
      break;
      if (localr3.i())
      {
        i6++;
        break label80;
      }
      i7 = 1;
      break label80;
      if ((this.j) && ((i7 != 0) || (i5 + i6 > i2)))
        i2--;
      int i9 = i2 - i5;
      SparseBooleanArray localSparseBooleanArray = this.t;
      localSparseBooleanArray.clear();
      int i10;
      int i35;
      if (this.p)
      {
        i10 = i3 / this.s;
        i35 = i3 % this.s;
      }
      for (int i11 = this.s + i35 / i10; ; i11 = 0)
      {
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        r localr1;
        View localView2;
        int i15;
        int i33;
        if (i12 < i1)
        {
          localr1 = (r)localArrayList.get(i12);
          if (localr1.j())
          {
            localView2 = a(localr1, this.u, localViewGroup);
            if (this.u == null)
              this.u = localView2;
            if (this.p)
            {
              i14 -= ActionMenuView.a(localView2, i11, i14, i4, 0);
              i15 = localView2.getMeasuredWidth();
              i33 = i3 - i15;
              if (i13 != 0)
                break label808;
            }
          }
        }
        while (true)
        {
          int i34 = localr1.getGroupId();
          if (i34 != 0)
            localSparseBooleanArray.put(i34, true);
          localr1.d(true);
          int i16 = i33;
          int i17 = i9;
          while (true)
          {
            i12++;
            i3 = i16;
            i9 = i17;
            i13 = i15;
            break;
            localView2.measure(i4, i4);
            break label291;
            if (localr1.i())
            {
              int i18 = localr1.getGroupId();
              boolean bool1 = localSparseBooleanArray.get(i18);
              boolean bool2;
              View localView1;
              int i27;
              label496: int i26;
              label500: int i30;
              boolean bool3;
              int i19;
              int i20;
              if (((i9 > 0) || (bool1)) && (i3 > 0) && ((!this.p) || (i14 > 0)))
              {
                bool2 = true;
                if (!bool2)
                  break label778;
                localView1 = a(localr1, this.u, localViewGroup);
                if (this.u == null)
                  this.u = localView1;
                if (!this.p)
                  break label619;
                int i31 = ActionMenuView.a(localView1, i11, i14, i4, 0);
                int i32 = i14 - i31;
                if (i31 != 0)
                  break label771;
                i27 = 0;
                i26 = i32;
                int i28 = localView1.getMeasuredWidth();
                i3 -= i28;
                if (i13 == 0)
                  i13 = i28;
                if (!this.p)
                  break label649;
                if (i3 < 0)
                  break label643;
                i30 = 1;
                bool3 = i27 & i30;
                i19 = i13;
                i20 = i26;
              }
              while (true)
              {
                int i21;
                if ((bool3) && (i18 != 0))
                {
                  localSparseBooleanArray.put(i18, true);
                  i21 = i9;
                }
                while (true)
                {
                  if (bool3)
                    i21--;
                  localr1.d(bool3);
                  i15 = i19;
                  i16 = i3;
                  int i22 = i20;
                  i17 = i21;
                  i14 = i22;
                  break;
                  bool2 = false;
                  break label428;
                  label619: localView1.measure(i4, i4);
                  int i25 = bool2;
                  i26 = i14;
                  i27 = i25;
                  break label500;
                  i30 = 0;
                  break label538;
                  if (i3 + i13 > 0);
                  for (int i29 = 1; ; i29 = 0)
                  {
                    bool3 = i27 & i29;
                    i19 = i13;
                    i20 = i26;
                    break;
                  }
                  if (bool1)
                  {
                    localSparseBooleanArray.put(i18, false);
                    int i23 = i9;
                    int i24 = 0;
                    while (i24 < i12)
                    {
                      r localr2 = (r)localArrayList.get(i24);
                      if (localr2.getGroupId() == i18)
                      {
                        if (localr2.h())
                          i23++;
                        localr2.d(false);
                      }
                      i24++;
                      continue;
                      return true;
                    }
                    i21 = i23;
                  }
                  else
                  {
                    i21 = i9;
                  }
                }
                i27 = bool2;
                break label496;
                bool3 = bool2;
                i19 = i13;
                i20 = i14;
              }
            }
            i15 = i13;
            i16 = i3;
            i17 = i9;
          }
          i15 = i13;
        }
        i10 = 0;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuPresenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
