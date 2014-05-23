package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.support.v7.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

class MenuItemWrapperICS extends BaseMenuWrapper<MenuItem>
  implements SupportMenuItem
{
  private final boolean mEmulateProviderVisibilityOverride;
  private boolean mLastRequestVisible;

  MenuItemWrapperICS(MenuItem paramMenuItem)
  {
    this(paramMenuItem, true);
  }

  MenuItemWrapperICS(MenuItem paramMenuItem, boolean paramBoolean)
  {
    super(paramMenuItem);
    this.mLastRequestVisible = paramMenuItem.isVisible();
    this.mEmulateProviderVisibilityOverride = paramBoolean;
  }

  final boolean checkActionProviderOverrideVisibility()
  {
    boolean bool1 = this.mLastRequestVisible;
    boolean bool2 = false;
    if (bool1)
    {
      android.support.v4.view.ActionProvider localActionProvider = getSupportActionProvider();
      bool2 = false;
      if (localActionProvider != null)
      {
        boolean bool3 = localActionProvider.overridesItemVisibility();
        bool2 = false;
        if (bool3)
        {
          boolean bool4 = localActionProvider.isVisible();
          bool2 = false;
          if (!bool4)
          {
            wrappedSetVisible(false);
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }

  public boolean collapseActionView()
  {
    return ((MenuItem)this.mWrappedObject).collapseActionView();
  }

  MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(android.support.v4.view.ActionProvider paramActionProvider)
  {
    return new MenuItemWrapperICS.ActionProviderWrapper(this, paramActionProvider);
  }

  public boolean expandActionView()
  {
    return ((MenuItem)this.mWrappedObject).expandActionView();
  }

  public android.view.ActionProvider getActionProvider()
  {
    return ((MenuItem)this.mWrappedObject).getActionProvider();
  }

  public View getActionView()
  {
    View localView = ((MenuItem)this.mWrappedObject).getActionView();
    if ((localView instanceof MenuItemWrapperICS.CollapsibleActionViewWrapper))
      localView = ((MenuItemWrapperICS.CollapsibleActionViewWrapper)localView).getWrappedView();
    return localView;
  }

  public char getAlphabeticShortcut()
  {
    return ((MenuItem)this.mWrappedObject).getAlphabeticShortcut();
  }

  public int getGroupId()
  {
    return ((MenuItem)this.mWrappedObject).getGroupId();
  }

  public Drawable getIcon()
  {
    return ((MenuItem)this.mWrappedObject).getIcon();
  }

  public Intent getIntent()
  {
    return ((MenuItem)this.mWrappedObject).getIntent();
  }

  public int getItemId()
  {
    return ((MenuItem)this.mWrappedObject).getItemId();
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((MenuItem)this.mWrappedObject).getMenuInfo();
  }

  public char getNumericShortcut()
  {
    return ((MenuItem)this.mWrappedObject).getNumericShortcut();
  }

  public int getOrder()
  {
    return ((MenuItem)this.mWrappedObject).getOrder();
  }

  public SubMenu getSubMenu()
  {
    return getSubMenuWrapper(((MenuItem)this.mWrappedObject).getSubMenu());
  }

  public android.support.v4.view.ActionProvider getSupportActionProvider()
  {
    MenuItemWrapperICS.ActionProviderWrapper localActionProviderWrapper = (MenuItemWrapperICS.ActionProviderWrapper)((MenuItem)this.mWrappedObject).getActionProvider();
    if (localActionProviderWrapper != null)
      return localActionProviderWrapper.mInner;
    return null;
  }

  public CharSequence getTitle()
  {
    return ((MenuItem)this.mWrappedObject).getTitle();
  }

  public CharSequence getTitleCondensed()
  {
    return ((MenuItem)this.mWrappedObject).getTitleCondensed();
  }

  public boolean hasSubMenu()
  {
    return ((MenuItem)this.mWrappedObject).hasSubMenu();
  }

  public boolean isActionViewExpanded()
  {
    return ((MenuItem)this.mWrappedObject).isActionViewExpanded();
  }

  public boolean isCheckable()
  {
    return ((MenuItem)this.mWrappedObject).isCheckable();
  }

  public boolean isChecked()
  {
    return ((MenuItem)this.mWrappedObject).isChecked();
  }

  public boolean isEnabled()
  {
    return ((MenuItem)this.mWrappedObject).isEnabled();
  }

  public boolean isVisible()
  {
    return ((MenuItem)this.mWrappedObject).isVisible();
  }

  public MenuItem setActionProvider(android.view.ActionProvider paramActionProvider)
  {
    ((MenuItem)this.mWrappedObject).setActionProvider(paramActionProvider);
    if ((paramActionProvider != null) && (this.mEmulateProviderVisibilityOverride))
      checkActionProviderOverrideVisibility();
    return this;
  }

  public MenuItem setActionView(int paramInt)
  {
    ((MenuItem)this.mWrappedObject).setActionView(paramInt);
    View localView = ((MenuItem)this.mWrappedObject).getActionView();
    if ((localView instanceof CollapsibleActionView))
      ((MenuItem)this.mWrappedObject).setActionView(new MenuItemWrapperICS.CollapsibleActionViewWrapper(localView));
    return this;
  }

  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof CollapsibleActionView))
      paramView = new MenuItemWrapperICS.CollapsibleActionViewWrapper(paramView);
    ((MenuItem)this.mWrappedObject).setActionView(paramView);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((MenuItem)this.mWrappedObject).setAlphabeticShortcut(paramChar);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((MenuItem)this.mWrappedObject).setCheckable(paramBoolean);
    return this;
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    ((MenuItem)this.mWrappedObject).setChecked(paramBoolean);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((MenuItem)this.mWrappedObject).setEnabled(paramBoolean);
    return this;
  }

  public MenuItem setIcon(int paramInt)
  {
    ((MenuItem)this.mWrappedObject).setIcon(paramInt);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((MenuItem)this.mWrappedObject).setIcon(paramDrawable);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    ((MenuItem)this.mWrappedObject).setIntent(paramIntent);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    ((MenuItem)this.mWrappedObject).setNumericShortcut(paramChar);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    ((MenuItem)this.mWrappedObject).setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    MenuItem localMenuItem = (MenuItem)this.mWrappedObject;
    if (paramOnMenuItemClickListener != null);
    for (MenuItemWrapperICS.OnMenuItemClickListenerWrapper localOnMenuItemClickListenerWrapper = new MenuItemWrapperICS.OnMenuItemClickListenerWrapper(this, paramOnMenuItemClickListener); ; localOnMenuItemClickListenerWrapper = null)
    {
      localMenuItem.setOnMenuItemClickListener(localOnMenuItemClickListenerWrapper);
      return this;
    }
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((MenuItem)this.mWrappedObject).setShortcut(paramChar1, paramChar2);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    ((MenuItem)this.mWrappedObject).setShowAsAction(paramInt);
  }

  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((MenuItem)this.mWrappedObject).setShowAsActionFlags(paramInt);
    return this;
  }

  public SupportMenuItem setSupportActionProvider(android.support.v4.view.ActionProvider paramActionProvider)
  {
    MenuItem localMenuItem = (MenuItem)this.mWrappedObject;
    if (paramActionProvider != null);
    for (MenuItemWrapperICS.ActionProviderWrapper localActionProviderWrapper = createActionProviderWrapper(paramActionProvider); ; localActionProviderWrapper = null)
    {
      localMenuItem.setActionProvider(localActionProviderWrapper);
      return this;
    }
  }

  public SupportMenuItem setSupportOnActionExpandListener(MenuItemCompat.OnActionExpandListener paramOnActionExpandListener)
  {
    MenuItem localMenuItem = (MenuItem)this.mWrappedObject;
    if (paramOnActionExpandListener != null);
    for (MenuItemWrapperICS.OnActionExpandListenerWrapper localOnActionExpandListenerWrapper = new MenuItemWrapperICS.OnActionExpandListenerWrapper(this, paramOnActionExpandListener); ; localOnActionExpandListenerWrapper = null)
    {
      localMenuItem.setOnActionExpandListener(localOnActionExpandListenerWrapper);
      return null;
    }
  }

  public MenuItem setTitle(int paramInt)
  {
    ((MenuItem)this.mWrappedObject).setTitle(paramInt);
    return this;
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((MenuItem)this.mWrappedObject).setTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((MenuItem)this.mWrappedObject).setTitleCondensed(paramCharSequence);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    if (this.mEmulateProviderVisibilityOverride)
    {
      this.mLastRequestVisible = paramBoolean;
      if (checkActionProviderOverrideVisibility())
        return this;
    }
    return wrappedSetVisible(paramBoolean);
  }

  final MenuItem wrappedSetVisible(boolean paramBoolean)
  {
    return ((MenuItem)this.mWrappedObject).setVisible(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.MenuItemWrapperICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
