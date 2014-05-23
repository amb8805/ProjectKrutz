package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.c.c;
import android.support.v4.c.m;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final m<String, Class<?>> a = new m();
  int A;
  i B;
  FragmentActivity C;
  i D;
  Fragment E;
  int F;
  int G;
  String H;
  boolean I;
  boolean J;
  boolean K;
  boolean L;
  boolean M;
  boolean N = true;
  boolean O;
  int P;
  ViewGroup Q;
  View R;
  View S;
  boolean T;
  boolean U = true;
  p V;
  boolean W;
  boolean X;
  int j = 0;
  View k;
  int l;
  Bundle m;
  SparseArray<Parcelable> n;
  int o = -1;
  String p;
  Bundle q;
  Fragment r;
  int s = -1;
  int t;
  boolean u;
  boolean v;
  boolean w;
  boolean x;
  boolean y;
  boolean z;

  public Fragment()
  {
  }

  public static Fragment a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }

  public static Fragment a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass = (Class)a.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass);
      }
      Fragment localFragment = (Fragment)localClass.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(localFragment.getClass().getClassLoader());
        localFragment.q = paramBundle;
      }
      return localFragment;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new Fragment.InstantiationException("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new Fragment.InstantiationException("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new Fragment.InstantiationException("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localIllegalAccessException);
    }
  }

  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Class localClass = (Class)a.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass);
      }
      boolean bool = Fragment.class.isAssignableFrom(localClass);
      return bool;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return false;
  }

  public static void q()
  {
  }

  public static Animation u()
  {
    return null;
  }

  public static void z()
  {
  }

  final void A()
  {
    this.D = new i();
    this.D.a(this.C, new Fragment.1(this), this);
  }

  final void B()
  {
    if (this.D != null)
      this.D.c(2);
    if (this.W)
    {
      this.W = false;
      if (!this.X)
      {
        this.X = true;
        this.V = this.C.a(this.p, this.W, false);
      }
      if (this.V != null)
      {
        if (this.C.h)
          break label84;
        this.V.c();
      }
    }
    return;
    label84: this.V.d();
  }

  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }

  public final String a(int paramInt)
  {
    return j().getString(paramInt);
  }

  public final String a(int paramInt, Object[] paramArrayOfObject)
  {
    return j().getString(paramInt, paramArrayOfObject);
  }

  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  final void a(int paramInt, Fragment paramFragment)
  {
    this.o = paramInt;
    if (paramFragment != null)
    {
      this.p = (paramFragment.p + ":" + this.o);
      return;
    }
    this.p = ("android:fragment:" + this.o);
  }

  public void a(Activity paramActivity)
  {
    this.O = true;
  }

  public final void a(Intent paramIntent)
  {
    if (this.C == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.C.a(this, paramIntent, -1);
  }

  public final void a(Intent paramIntent, int paramInt)
  {
    if (this.C == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.C.a(this, paramIntent, paramInt);
  }

  public void a(Bundle paramBundle)
  {
    this.O = true;
  }

  public final void a(Fragment.SavedState paramSavedState)
  {
    if (this.o >= 0)
      throw new IllegalStateException("Fragment already active");
    if ((paramSavedState != null) && (paramSavedState.a != null));
    for (Bundle localBundle = paramSavedState.a; ; localBundle = null)
    {
      this.m = localBundle;
      return;
    }
  }

  public final void a(Fragment paramFragment)
  {
    this.r = paramFragment;
    this.t = 0;
  }

  public void a(Menu paramMenu)
  {
  }

  public void a(View paramView, Bundle paramBundle)
  {
  }

  public boolean a(MenuItem paramMenuItem)
  {
    return false;
  }

  public final void a_(boolean paramBoolean)
  {
    if (this.M != paramBoolean)
    {
      this.M = paramBoolean;
      if ((n_()) && (!this.I))
        this.C.v_();
    }
  }

  public LayoutInflater b(Bundle paramBundle)
  {
    return this.C.getLayoutInflater();
  }

  final View b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.D != null)
      this.D.s = false;
    return a(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public void b(Menu paramMenu)
  {
  }

  public void b(boolean paramBoolean)
  {
    if (this.N != paramBoolean)
    {
      this.N = paramBoolean;
      if ((this.M) && (n_()) && (!this.I))
        this.C.v_();
    }
  }

  public final void b_(Bundle paramBundle)
  {
    if (this.o >= 0)
      throw new IllegalStateException("Fragment already active");
    this.q = paramBundle;
  }

  public void c(Bundle paramBundle)
  {
    this.O = true;
  }

  public final void c(boolean paramBoolean)
  {
    if ((!this.U) && (paramBoolean) && (this.j < 4))
      this.B.b(this);
    this.U = paramBoolean;
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.T = bool;
      return;
    }
  }

  public void d(Bundle paramBundle)
  {
  }

  public void d_()
  {
    this.O = true;
  }

  public void e()
  {
    this.O = true;
  }

  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }

  public final Bundle g()
  {
    return this.q;
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  public final FragmentActivity i()
  {
    return this.C;
  }

  public final Resources j()
  {
    if (this.C == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    return this.C.getResources();
  }

  public final String k_()
  {
    return this.H;
  }

  public final g l()
  {
    if (this.D == null)
    {
      A();
      if (this.j < 5)
        break label31;
      this.D.l();
    }
    while (true)
    {
      return this.D;
      label31: if (this.j >= 4)
        this.D.k();
      else if (this.j >= 2)
        this.D.j();
      else if (this.j > 0)
        this.D.i();
    }
  }

  public final Fragment l_()
  {
    return this.r;
  }

  public final Fragment m()
  {
    return this.E;
  }

  public final g m_()
  {
    return this.B;
  }

  public final boolean n_()
  {
    return (this.C != null) && (this.u);
  }

  public final boolean o_()
  {
    return this.J;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.O = true;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.C.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  public void onLowMemory()
  {
    this.O = true;
  }

  public final boolean p()
  {
    return this.w;
  }

  public void p_()
  {
    this.O = true;
    if (!this.W)
    {
      this.W = true;
      if (!this.X)
      {
        this.X = true;
        this.V = this.C.a(this.p, this.W, false);
      }
      if (this.V != null)
        this.V.b();
    }
  }

  public void q_()
  {
    this.O = true;
  }

  public final void r()
  {
    if (this.E != null)
      throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
    this.K = true;
  }

  public final boolean s()
  {
    return this.K;
  }

  public final n t()
  {
    if (this.V != null)
      return this.V;
    if (this.C == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.X = true;
    this.V = this.C.a(this.p, this.W, true);
    return this.V;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    c.a(this, localStringBuilder);
    if (this.o >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.o);
    }
    if (this.F != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.F));
    }
    if (this.H != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.H);
    }
    localStringBuilder.append((char)'}');
    return localStringBuilder.toString();
  }

  public final View v()
  {
    return this.R;
  }

  public void w()
  {
    this.O = true;
  }

  public void x()
  {
    this.O = true;
  }

  public void y()
  {
    this.O = true;
    if (!this.X)
    {
      this.X = true;
      this.V = this.C.a(this.p, this.W, false);
    }
    if (this.V != null)
      this.V.g();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.Fragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
