package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.a.a.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class x
{
  static final ab a = new y();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      a = new aa();
      return;
    }
    if (i >= 11)
    {
      a = new z();
      return;
    }
  }

  public static MenuItem a(MenuItem paramMenuItem, l paraml)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).a(paraml);
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }

  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramView);
    return a.a(paramMenuItem, paramView);
  }

  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
    {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    }
    a.a(paramMenuItem, paramInt);
  }

  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramInt);
    return a.b(paramMenuItem, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
