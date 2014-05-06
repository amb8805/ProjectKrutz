package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MenuItem;

public class MenuCompat
{
  static final MenuCompat.MenuVersionImpl IMPL = new MenuCompat.BaseMenuVersionImpl();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new MenuCompat.HoneycombMenuVersionImpl();
      return;
    }
  }

  public MenuCompat()
  {
  }

  public static boolean setShowAsAction(MenuItem paramMenuItem, int paramInt)
  {
    return IMPL.setShowAsAction(paramMenuItem, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.MenuCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
