package android.support.v7.internal.view.menu;

import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;

public final class ae
{
  public static Menu a(Menu paramMenu)
  {
    if (Build.VERSION.SDK_INT >= 14)
      paramMenu = new af(paramMenu);
    return paramMenu;
  }

  public static MenuItem a(MenuItem paramMenuItem)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramMenuItem = new w(paramMenuItem);
    while (Build.VERSION.SDK_INT < 14)
      return paramMenuItem;
    return new s(paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
