package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.c;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.j;
import android.support.v7.a.k;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.ac;
import android.support.v7.internal.view.menu.ae;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;

class e extends d
  implements ab, o
{
  private static final int[] d = arrayOfInt;
  private ActionBarView e;
  private l f;
  private n g;
  private a h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private final Runnable m = new e.1(this);

  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = c.i;
  }

  e(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  private void c(n paramn)
  {
    if (paramn == this.g);
    do
    {
      return;
      if (this.g != null)
        this.g.b(this.f);
      this.g = paramn;
      if ((paramn != null) && (this.f != null))
        paramn.a(this.f);
    }
    while (this.e == null);
    this.e.a(paramn, this);
  }

  private n l()
  {
    n localn = new n(j());
    localn.a(this);
    return localn;
  }

  public ActionBar a()
  {
    k();
    return new i(this.a, this.a);
  }

  public final void a(int paramInt)
  {
    k();
    if (this.b)
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(f.b);
      localViewGroup.removeAllViews();
      this.a.getLayoutInflater().inflate(paramInt, localViewGroup);
      return;
    }
    this.a.a(paramInt);
  }

  public final void a(n paramn)
  {
    if ((this.e != null) && (this.e.f()))
    {
      if (!this.e.e())
      {
        if (this.e.getVisibility() == 0)
          this.e.b();
        return;
      }
      this.e.d();
      return;
    }
    paramn.close();
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    this.a.closeOptionsMenu();
  }

  public final void a(View paramView)
  {
    k();
    if (this.b)
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(f.b);
      localViewGroup.removeAllViews();
      localViewGroup.addView(paramView);
      return;
    }
    this.a.a(paramView);
  }

  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    k();
    if (this.b)
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(f.b);
      localViewGroup.removeAllViews();
      localViewGroup.addView(paramView, paramLayoutParams);
      return;
    }
    this.a.a(paramView, paramLayoutParams);
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (this.e != null)
      this.e.b(paramCharSequence);
  }

  public final boolean a(int paramInt, Menu paramMenu)
  {
    if (paramInt != 0)
      return this.a.a(paramInt, paramMenu);
    return false;
  }

  public final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    if (paramInt == 0)
      paramMenuItem = ae.a(paramMenuItem);
    return this.a.a(paramInt, paramMenuItem);
  }

  public final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt != 0)
      return this.a.a(paramInt, paramView, paramMenu);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    return this.a.onMenuItemSelected(0, paramMenuItem);
  }

  public final View b(int paramInt)
  {
    View localView = null;
    ActionBarActivity localActionBarActivity;
    ac localac;
    if (paramInt == 0)
    {
      boolean bool = true;
      n localn1 = this.g;
      if (this.h == null)
      {
        if (localn1 == null)
        {
          localn1 = l();
          c(localn1);
          localn1.f();
          bool = this.a.a(0, localn1);
        }
        if (bool)
        {
          localn1.f();
          bool = this.a.a(0, null, localn1);
        }
      }
      if (!bool)
        break label212;
      localActionBarActivity = this.a;
      n localn2 = this.g;
      localac = null;
      if (localn2 == null)
      {
        localView = (View)localac;
        localn1.g();
      }
    }
    else
    {
      return localView;
    }
    if (this.f == null)
    {
      TypedArray localTypedArray = localActionBarActivity.obtainStyledAttributes(k.o);
      int n = localTypedArray.getResourceId(4, j.a);
      localTypedArray.recycle();
      this.f = new l(h.m, n);
      this.f.a(this);
      this.g.a(this.f);
    }
    while (true)
    {
      localac = this.f.a(new FrameLayout(localActionBarActivity));
      break;
      this.f.c(false);
    }
    label212: c(null);
    return null;
  }

  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    k();
    if (this.b)
    {
      ((ViewGroup)this.a.findViewById(f.b)).addView(paramView, paramLayoutParams);
      return;
    }
    this.a.a(paramView, paramLayoutParams);
  }

  public final boolean b(n paramn)
  {
    return false;
  }

  public final void d()
  {
    if ((this.b) && (this.i))
      ((i)b()).f();
  }

  public final void e()
  {
    i locali = (i)b();
    if (locali != null)
      locali.b(false);
  }

  public final void f()
  {
    i locali = (i)b();
    if (locali != null)
      locali.b(true);
  }

  public final void g()
  {
    if (!this.l)
    {
      this.l = true;
      this.a.getWindow().getDecorView().post(this.m);
    }
  }

  public final boolean h()
  {
    if (this.h != null)
    {
      this.h.a();
      return true;
    }
    if ((this.e != null) && (this.e.j()))
    {
      this.e.k();
      return true;
    }
    return false;
  }

  final void k()
  {
    boolean bool1;
    if ((this.b) && (!this.i))
    {
      if (!this.c)
        break label208;
      this.a.a(h.b);
      this.e = ((ActionBarView)this.a.findViewById(f.a));
      this.e.a(this.a);
      if (this.j)
        this.e.g();
      if (this.k)
        this.e.h();
      bool1 = "splitActionBarWhenNarrow".equals(i());
      if (!bool1)
        break label221;
    }
    label208: label221: boolean bool2;
    for (boolean bool3 = this.a.getResources().getBoolean(android.support.v7.a.d.e); ; bool3 = bool2)
    {
      ActionBarContainer localActionBarContainer = (ActionBarContainer)this.a.findViewById(f.C);
      if (localActionBarContainer != null)
      {
        this.e.a(localActionBarContainer);
        this.e.a(bool3);
        this.e.b(bool1);
        ActionBarContextView localActionBarContextView = (ActionBarContextView)this.a.findViewById(f.h);
        localActionBarContextView.a(localActionBarContainer);
        localActionBarContextView.a(bool3);
        localActionBarContextView.b(bool1);
      }
      this.i = true;
      g();
      return;
      this.a.a(h.a);
      break;
      TypedArray localTypedArray = this.a.obtainStyledAttributes(k.c);
      bool2 = localTypedArray.getBoolean(2, false);
      localTypedArray.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
