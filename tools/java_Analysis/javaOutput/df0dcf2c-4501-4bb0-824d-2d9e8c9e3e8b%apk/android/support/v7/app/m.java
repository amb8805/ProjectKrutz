package android.support.v7.app;

import android.view.MenuItem;
import android.view.Window.Callback;
import com.spotify.mobile.android.util.ui.b;

final class m extends b
{
  public m(Window.Callback paramCallback)
  {
    super(paramCallback);
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    CharSequence localCharSequence = paramMenuItem.getTitleCondensed();
    if (localCharSequence != null)
      paramMenuItem.setTitleCondensed(localCharSequence.toString());
    while (true)
    {
      boolean bool = super.onMenuItemSelected(paramInt, paramMenuItem);
      paramMenuItem.setTitleCondensed(localCharSequence);
      return bool;
      if (paramMenuItem.getTitle() != null)
        paramMenuItem.setTitleCondensed(paramMenuItem.getTitle().toString());
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
