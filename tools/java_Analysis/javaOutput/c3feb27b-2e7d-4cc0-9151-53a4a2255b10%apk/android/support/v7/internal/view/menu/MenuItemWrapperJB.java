package android.support.v7.internal.view.menu;

import android.support.v4.view.ActionProvider;
import android.view.MenuItem;

class MenuItemWrapperJB extends MenuItemWrapperICS
{
  MenuItemWrapperJB(MenuItem paramMenuItem)
  {
    super(paramMenuItem, false);
  }

  MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider paramActionProvider)
  {
    return new MenuItemWrapperJB.ActionProviderWrapperJB(this, paramActionProvider);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.MenuItemWrapperJB
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
