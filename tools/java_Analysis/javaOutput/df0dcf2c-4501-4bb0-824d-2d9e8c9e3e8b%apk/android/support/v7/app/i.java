package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.a.b;
import android.support.v7.a.c;
import android.support.v7.a.f;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

class i extends ActionBar
{
  final Handler a = new Handler();
  private Context b;
  private Context c;
  private ActionBarActivity d;
  private ActionBarOverlayLayout e;
  private ActionBarContainer f;
  private ViewGroup g;
  private ActionBarView h;
  private ActionBarContextView i;
  private ActionBarContainer j;
  private ScrollingTabContainerView k;
  private ArrayList l = new ArrayList();
  private int m = -1;
  private boolean n;
  private ArrayList o = new ArrayList();
  private int p;
  private boolean q;
  private int r = 0;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v = true;
  private boolean w;
  private a x;

  public i(ActionBarActivity paramActionBarActivity, a parama)
  {
    this.d = paramActionBarActivity;
    this.b = paramActionBarActivity;
    this.x = parama;
    ActionBarActivity localActionBarActivity = this.d;
    this.e = ((ActionBarOverlayLayout)localActionBarActivity.findViewById(f.d));
    if (this.e != null)
      this.e.a(this);
    this.h = ((ActionBarView)localActionBarActivity.findViewById(f.a));
    this.i = ((ActionBarContextView)localActionBarActivity.findViewById(f.h));
    this.f = ((ActionBarContainer)localActionBarActivity.findViewById(f.c));
    this.g = ((ViewGroup)localActionBarActivity.findViewById(f.F));
    if (this.g == null)
      this.g = this.f;
    this.j = ((ActionBarContainer)localActionBarActivity.findViewById(f.C));
    if ((this.h == null) || (this.i == null) || (this.f == null))
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    this.h.a(this.i);
    int i1;
    if (this.h.i())
    {
      i1 = 1;
      this.p = i1;
      if ((0x4 & this.h.o()) == 0)
        break label359;
    }
    label359: for (int i2 = 1; ; i2 = 0)
    {
      if (i2 != 0)
        this.n = true;
      android.support.v7.internal.view.a locala = android.support.v7.internal.view.a.a(this.b);
      boolean bool;
      if (!locala.e())
      {
        bool = false;
        if (i2 == 0);
      }
      else
      {
        bool = true;
      }
      this.h.c(bool);
      c(locala.c());
      a(this.d.getTitle());
      return;
      i1 = 0;
      break;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = this.h.o();
    if ((paramInt2 & 0x4) != 0)
      this.n = true;
    this.h.b(paramInt1 & paramInt2 | i1 & (paramInt2 ^ 0xFFFFFFFF));
  }

  private void c(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.q = paramBoolean;
    boolean bool2;
    label46: label65: ActionBarView localActionBarView;
    if (!this.q)
    {
      this.h.a(null);
      this.f.a(this.k);
      if (this.h.n() != 2)
        break label111;
      bool2 = bool1;
      if (this.k != null)
      {
        if (!bool2)
          break label116;
        this.k.setVisibility(0);
      }
      localActionBarView = this.h;
      if ((this.q) || (!bool2))
        break label128;
    }
    while (true)
    {
      localActionBarView.d(bool1);
      return;
      this.f.a(null);
      this.h.a(this.k);
      break;
      label111: bool2 = false;
      break label46;
      label116: this.k.setVisibility(8);
      break label65;
      label128: bool1 = false;
    }
  }

  private void j()
  {
    boolean bool1 = true;
    boolean bool2 = this.s;
    boolean bool3 = this.t;
    int i1;
    if ((!this.u) && ((bool2) || (bool3)))
    {
      i1 = 0;
      if (i1 == 0)
        break label166;
      if (!this.v)
      {
        this.v = bool1;
        this.g.clearAnimation();
        if (this.g.getVisibility() != 0)
        {
          if (!i())
            break label161;
          label71: if (bool1)
          {
            Animation localAnimation4 = AnimationUtils.loadAnimation(this.b, b.b);
            this.g.startAnimation(localAnimation4);
          }
          this.g.setVisibility(0);
          if ((this.j != null) && (this.j.getVisibility() != 0))
          {
            if (bool1)
            {
              Animation localAnimation3 = AnimationUtils.loadAnimation(this.b, b.a);
              this.j.startAnimation(localAnimation3);
            }
            this.j.setVisibility(0);
          }
        }
      }
    }
    label161: label166: 
    do
    {
      do
      {
        return;
        i1 = bool1;
        break;
        bool1 = false;
        break label71;
      }
      while (!this.v);
      this.v = false;
      this.g.clearAnimation();
    }
    while (this.g.getVisibility() == 8);
    if (i());
    while (true)
    {
      if (bool1)
      {
        Animation localAnimation2 = AnimationUtils.loadAnimation(this.b, b.d);
        this.g.startAnimation(localAnimation2);
      }
      this.g.setVisibility(8);
      if ((this.j == null) || (this.j.getVisibility() == 8))
        break;
      if (bool1)
      {
        Animation localAnimation1 = AnimationUtils.loadAnimation(this.b, b.c);
        this.j.startAnimation(localAnimation1);
      }
      this.j.setVisibility(8);
      return;
      bool1 = false;
    }
  }

  public final void a()
  {
    this.h.l();
  }

  public final void a(int paramInt)
  {
    a(LayoutInflater.from(e()).inflate(paramInt, this.h, false));
  }

  public final void a(Drawable paramDrawable)
  {
    this.h.a(paramDrawable);
  }

  public final void a(View paramView)
  {
    this.h.a(paramView);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.h.a(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = 16; ; i1 = 0)
    {
      a(i1, 16);
      return;
    }
  }

  public final void b()
  {
    a(4, 4);
  }

  public final void b(Drawable paramDrawable)
  {
    this.f.a(paramDrawable);
  }

  public final void b(boolean paramBoolean)
  {
    this.w = paramBoolean;
    if (!paramBoolean)
    {
      this.g.clearAnimation();
      if (this.j != null)
        this.j.clearAnimation();
    }
  }

  public final View c()
  {
    return this.h.m();
  }

  public final int d()
  {
    return this.h.o();
  }

  public final Context e()
  {
    int i1;
    if (this.c == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.b.getTheme().resolveAttribute(c.d, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0)
        break label61;
    }
    label61: for (this.c = new ContextThemeWrapper(this.b, i1); ; this.c = this.b)
      return this.c;
  }

  public final void f()
  {
    c(android.support.v7.internal.view.a.a(this.b).c());
  }

  final void g()
  {
    if (!this.u)
    {
      this.u = true;
      j();
    }
  }

  final void h()
  {
    if (this.u)
    {
      this.u = false;
      j();
    }
  }

  boolean i()
  {
    return this.w;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
