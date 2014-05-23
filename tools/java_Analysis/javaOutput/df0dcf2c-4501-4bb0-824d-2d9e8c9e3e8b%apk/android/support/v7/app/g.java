package android.support.v7.app;

import android.os.Bundle;
import android.support.v7.internal.view.b;
import android.support.v7.internal.view.menu.ae;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

final class g extends d
{
  Menu d;

  g(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  public final ActionBar a()
  {
    return new l(this.a, this.a);
  }

  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  public final void a(Bundle paramBundle)
  {
    if ("splitActionBarWhenNarrow".equals(i()))
      this.a.getWindow().setUiOptions(1, 1);
    super.a(paramBundle);
    if (this.b)
      this.a.requestWindowFeature(8);
    if (this.c)
      this.a.requestWindowFeature(9);
    Window localWindow = this.a.getWindow();
    localWindow.setCallback(new h(this, localWindow.getCallback()));
  }

  public final void a(ActionMode paramActionMode)
  {
    new b(j(), paramActionMode);
  }

  public final void a(View paramView)
  {
    this.a.a(paramView);
  }

  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.a.a(paramView, paramLayoutParams);
  }

  public final void a(CharSequence paramCharSequence)
  {
  }

  public final boolean a(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) || (paramInt == 8))
    {
      if (this.d == null)
        this.d = ae.a(paramMenu);
      return this.a.a(paramInt, this.d);
    }
    return this.a.a(paramInt, paramMenu);
  }

  public final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    if (paramInt == 0)
      paramMenuItem = ae.a(paramMenuItem);
    return this.a.a(paramInt, paramMenuItem);
  }

  public final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) || (paramInt == 8))
      return this.a.a(paramInt, paramView, this.d);
    return this.a.a(paramInt, paramView, paramMenu);
  }

  public final View b(int paramInt)
  {
    return null;
  }

  public final void b(ActionMode paramActionMode)
  {
    new b(j(), paramActionMode);
  }

  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.a.b(paramView, paramLayoutParams);
  }

  public final void d()
  {
  }

  public final void e()
  {
  }

  public final void f()
  {
  }

  public final void g()
  {
    this.d = null;
  }

  public final boolean h()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
