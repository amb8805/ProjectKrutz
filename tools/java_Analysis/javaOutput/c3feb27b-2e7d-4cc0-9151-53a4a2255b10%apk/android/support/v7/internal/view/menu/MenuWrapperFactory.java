package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class MenuWrapperFactory
{
  private MenuWrapperFactory()
  {
  }

  public static MenuItem createMenuItemWrapper(MenuItem paramMenuItem)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramMenuItem = new MenuItemWrapperJB(paramMenuItem);
    while (Build.VERSION.SDK_INT < 14)
      return paramMenuItem;
    return new MenuItemWrapperICS(paramMenuItem);
  }

  public static Menu createMenuWrapper(Menu paramMenu)
  {
    if (Build.VERSION.SDK_INT >= 14)
      paramMenu = new MenuWrapperICS(paramMenu);
    return paramMenu;
  }

  public static SupportMenuItem createSupportMenuItemWrapper(MenuItem paramMenuItem)
  {
    if (Build.VERSION.SDK_INT >= 16)
      return new MenuItemWrapperJB(paramMenuItem);
    if (Build.VERSION.SDK_INT >= 14)
      return new MenuItemWrapperICS(paramMenuItem);
    throw new UnsupportedOperationException();
  }

  public static SupportMenu createSupportMenuWrapper(Menu paramMenu)
  {
    if (Build.VERSION.SDK_INT >= 14)
      return new MenuWrapperICS(paramMenu);
    throw new UnsupportedOperationException();
  }

  public static SupportSubMenu createSupportSubMenuWrapper(SubMenu paramSubMenu)
  {
    if (Build.VERSION.SDK_INT >= 14)
      return new SubMenuWrapperICS(paramSubMenu);
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.MenuWrapperFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
