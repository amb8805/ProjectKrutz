package android.support.v7.internal.view.menu;

import android.support.v4.view.l;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class t extends ActionProvider
{
  final l a;

  public t(s params, l paraml)
  {
    super(paraml.a());
    this.a = paraml;
    if (s.a(params))
      this.a.a(new t.1(this, params));
  }

  public boolean hasSubMenu()
  {
    return false;
  }

  public View onCreateActionView()
  {
    if (s.a(this.b))
      this.b.b();
    return this.a.b();
  }

  public boolean onPerformDefaultAction()
  {
    return false;
  }

  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
    this.b.a(paramSubMenu);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
