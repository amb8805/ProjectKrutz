package android.support.v7.internal.view.menu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.l;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

class s extends j<MenuItem>
  implements android.support.v4.a.a.b
{
  private final boolean b;
  private boolean c;

  s(MenuItem paramMenuItem)
  {
    this(paramMenuItem, true);
  }

  s(MenuItem paramMenuItem, boolean paramBoolean)
  {
    super(paramMenuItem);
    this.c = paramMenuItem.isVisible();
    this.b = paramBoolean;
  }

  public final android.support.v4.a.a.b a(l paraml)
  {
    MenuItem localMenuItem = (MenuItem)this.a;
    if (paraml != null);
    for (t localt = b(paraml); ; localt = null)
    {
      localMenuItem.setActionProvider(localt);
      return this;
    }
  }

  t b(l paraml)
  {
    return new t(this, paraml);
  }

  final boolean b()
  {
    t localt;
    if (this.c)
    {
      localt = (t)((MenuItem)this.a).getActionProvider();
      if (localt == null);
    }
    return false;
  }

  public boolean collapseActionView()
  {
    return ((MenuItem)this.a).collapseActionView();
  }

  public boolean expandActionView()
  {
    return ((MenuItem)this.a).expandActionView();
  }

  public ActionProvider getActionProvider()
  {
    return ((MenuItem)this.a).getActionProvider();
  }

  public View getActionView()
  {
    View localView = ((MenuItem)this.a).getActionView();
    if ((localView instanceof u))
      localView = (View)((u)localView).a;
    return localView;
  }

  public char getAlphabeticShortcut()
  {
    return ((MenuItem)this.a).getAlphabeticShortcut();
  }

  public int getGroupId()
  {
    return ((MenuItem)this.a).getGroupId();
  }

  public Drawable getIcon()
  {
    return ((MenuItem)this.a).getIcon();
  }

  public Intent getIntent()
  {
    return ((MenuItem)this.a).getIntent();
  }

  public int getItemId()
  {
    return ((MenuItem)this.a).getItemId();
  }

  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((MenuItem)this.a).getMenuInfo();
  }

  public char getNumericShortcut()
  {
    return ((MenuItem)this.a).getNumericShortcut();
  }

  public int getOrder()
  {
    return ((MenuItem)this.a).getOrder();
  }

  public SubMenu getSubMenu()
  {
    return a(((MenuItem)this.a).getSubMenu());
  }

  public CharSequence getTitle()
  {
    return ((MenuItem)this.a).getTitle();
  }

  public CharSequence getTitleCondensed()
  {
    return ((MenuItem)this.a).getTitleCondensed();
  }

  public boolean hasSubMenu()
  {
    return ((MenuItem)this.a).hasSubMenu();
  }

  public boolean isActionViewExpanded()
  {
    return ((MenuItem)this.a).isActionViewExpanded();
  }

  public boolean isCheckable()
  {
    return ((MenuItem)this.a).isCheckable();
  }

  public boolean isChecked()
  {
    return ((MenuItem)this.a).isChecked();
  }

  public boolean isEnabled()
  {
    return ((MenuItem)this.a).isEnabled();
  }

  public boolean isVisible()
  {
    return ((MenuItem)this.a).isVisible();
  }

  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    ((MenuItem)this.a).setActionProvider(paramActionProvider);
    if ((paramActionProvider != null) && (this.b))
      b();
    return this;
  }

  public MenuItem setActionView(int paramInt)
  {
    ((MenuItem)this.a).setActionView(paramInt);
    View localView = ((MenuItem)this.a).getActionView();
    if ((localView instanceof android.support.v7.b.b))
      ((MenuItem)this.a).setActionView(new u(localView));
    return this;
  }

  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof android.support.v7.b.b))
      paramView = new u(paramView);
    ((MenuItem)this.a).setActionView(paramView);
    return this;
  }

  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((MenuItem)this.a).setAlphabeticShortcut(paramChar);
    return this;
  }

  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((MenuItem)this.a).setCheckable(paramBoolean);
    return this;
  }

  public MenuItem setChecked(boolean paramBoolean)
  {
    ((MenuItem)this.a).setChecked(paramBoolean);
    return this;
  }

  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((MenuItem)this.a).setEnabled(paramBoolean);
    return this;
  }

  public MenuItem setIcon(int paramInt)
  {
    ((MenuItem)this.a).setIcon(paramInt);
    return this;
  }

  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((MenuItem)this.a).setIcon(paramDrawable);
    return this;
  }

  public MenuItem setIntent(Intent paramIntent)
  {
    ((MenuItem)this.a).setIntent(paramIntent);
    return this;
  }

  public MenuItem setNumericShortcut(char paramChar)
  {
    ((MenuItem)this.a).setNumericShortcut(paramChar);
    return this;
  }

  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    ((MenuItem)this.a).setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }

  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    MenuItem localMenuItem = (MenuItem)this.a;
    if (paramOnMenuItemClickListener != null);
    for (v localv = new v(this, paramOnMenuItemClickListener); ; localv = null)
    {
      localMenuItem.setOnMenuItemClickListener(localv);
      return this;
    }
  }

  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((MenuItem)this.a).setShortcut(paramChar1, paramChar2);
    return this;
  }

  public void setShowAsAction(int paramInt)
  {
    ((MenuItem)this.a).setShowAsAction(paramInt);
  }

  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((MenuItem)this.a).setShowAsActionFlags(paramInt);
    return this;
  }

  public MenuItem setTitle(int paramInt)
  {
    ((MenuItem)this.a).setTitle(paramInt);
    return this;
  }

  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((MenuItem)this.a).setTitle(paramCharSequence);
    return this;
  }

  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((MenuItem)this.a).setTitleCondensed(paramCharSequence);
    return this;
  }

  public MenuItem setVisible(boolean paramBoolean)
  {
    if (this.b)
    {
      this.c = paramBoolean;
      b();
    }
    return ((MenuItem)this.a).setVisible(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
