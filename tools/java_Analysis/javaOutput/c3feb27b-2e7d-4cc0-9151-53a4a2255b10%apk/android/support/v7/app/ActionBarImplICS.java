package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class ActionBarImplICS extends ActionBar
{
  final android.app.ActionBar mActionBar;
  final Activity mActivity;
  private ArrayList<WeakReference<ActionBarImplICS.OnMenuVisibilityListenerWrapper>> mAddedMenuVisWrappers = new ArrayList();
  final ActionBar.Callback mCallback;

  public ActionBarImplICS(Activity paramActivity, ActionBar.Callback paramCallback)
  {
    this.mActivity = paramActivity;
    this.mCallback = paramCallback;
    this.mActionBar = paramActivity.getActionBar();
  }

  private ActionBarImplICS.OnMenuVisibilityListenerWrapper findAndRemoveMenuVisWrapper(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    int i = 0;
    if (i < this.mAddedMenuVisWrappers.size())
    {
      ActionBarImplICS.OnMenuVisibilityListenerWrapper localOnMenuVisibilityListenerWrapper = (ActionBarImplICS.OnMenuVisibilityListenerWrapper)((WeakReference)this.mAddedMenuVisWrappers.get(i)).get();
      if (localOnMenuVisibilityListenerWrapper == null)
      {
        localArrayList = this.mAddedMenuVisWrappers;
        j = i - 1;
        localArrayList.remove(i);
        i = j;
      }
      while (localOnMenuVisibilityListenerWrapper.mWrappedListener != paramOnMenuVisibilityListener)
      {
        ArrayList localArrayList;
        int j;
        i++;
        break;
      }
      this.mAddedMenuVisWrappers.remove(i);
      return localOnMenuVisibilityListenerWrapper;
    }
    return null;
  }

  public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    if (paramOnMenuVisibilityListener != null)
    {
      ActionBarImplICS.OnMenuVisibilityListenerWrapper localOnMenuVisibilityListenerWrapper = new ActionBarImplICS.OnMenuVisibilityListenerWrapper(paramOnMenuVisibilityListener);
      this.mAddedMenuVisWrappers.add(new WeakReference(localOnMenuVisibilityListenerWrapper));
      this.mActionBar.addOnMenuVisibilityListener(localOnMenuVisibilityListenerWrapper);
    }
  }

  public void addTab(ActionBar.Tab paramTab)
  {
    this.mActionBar.addTab(((ActionBarImplICS.TabWrapper)paramTab).mWrappedTab);
  }

  public void addTab(ActionBar.Tab paramTab, int paramInt)
  {
    this.mActionBar.addTab(((ActionBarImplICS.TabWrapper)paramTab).mWrappedTab, paramInt);
  }

  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    this.mActionBar.addTab(((ActionBarImplICS.TabWrapper)paramTab).mWrappedTab, paramInt, paramBoolean);
  }

  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    this.mActionBar.addTab(((ActionBarImplICS.TabWrapper)paramTab).mWrappedTab, paramBoolean);
  }

  public View getCustomView()
  {
    return this.mActionBar.getCustomView();
  }

  public int getDisplayOptions()
  {
    return this.mActionBar.getDisplayOptions();
  }

  public int getHeight()
  {
    return this.mActionBar.getHeight();
  }

  public int getNavigationItemCount()
  {
    return this.mActionBar.getNavigationItemCount();
  }

  public int getNavigationMode()
  {
    return this.mActionBar.getNavigationMode();
  }

  public int getSelectedNavigationIndex()
  {
    return this.mActionBar.getSelectedNavigationIndex();
  }

  public ActionBar.Tab getSelectedTab()
  {
    return (ActionBar.Tab)this.mActionBar.getSelectedTab().getTag();
  }

  public CharSequence getSubtitle()
  {
    return this.mActionBar.getSubtitle();
  }

  public ActionBar.Tab getTabAt(int paramInt)
  {
    return (ActionBar.Tab)this.mActionBar.getTabAt(paramInt).getTag();
  }

  public int getTabCount()
  {
    return this.mActionBar.getTabCount();
  }

  public Context getThemedContext()
  {
    return this.mActionBar.getThemedContext();
  }

  public CharSequence getTitle()
  {
    return this.mActionBar.getTitle();
  }

  public void hide()
  {
    this.mActionBar.hide();
  }

  public boolean isShowing()
  {
    return this.mActionBar.isShowing();
  }

  public ActionBar.Tab newTab()
  {
    android.app.ActionBar.Tab localTab = this.mActionBar.newTab();
    ActionBarImplICS.TabWrapper localTabWrapper = new ActionBarImplICS.TabWrapper(this, localTab);
    localTab.setTag(localTabWrapper);
    return localTabWrapper;
  }

  public void removeAllTabs()
  {
    this.mActionBar.removeAllTabs();
  }

  public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    ActionBarImplICS.OnMenuVisibilityListenerWrapper localOnMenuVisibilityListenerWrapper = findAndRemoveMenuVisWrapper(paramOnMenuVisibilityListener);
    this.mActionBar.removeOnMenuVisibilityListener(localOnMenuVisibilityListenerWrapper);
  }

  public void removeTab(ActionBar.Tab paramTab)
  {
    this.mActionBar.removeTab(((ActionBarImplICS.TabWrapper)paramTab).mWrappedTab);
  }

  public void removeTabAt(int paramInt)
  {
    this.mActionBar.removeTabAt(paramInt);
  }

  public void selectTab(ActionBar.Tab paramTab)
  {
    this.mActionBar.selectTab(((ActionBarImplICS.TabWrapper)paramTab).mWrappedTab);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.mActionBar.setBackgroundDrawable(paramDrawable);
  }

  public void setCustomView(int paramInt)
  {
    this.mActionBar.setCustomView(paramInt);
  }

  public void setCustomView(View paramView)
  {
    this.mActionBar.setCustomView(paramView);
  }

  public void setCustomView(View paramView, ActionBar.LayoutParams paramLayoutParams)
  {
    android.app.ActionBar.LayoutParams localLayoutParams = new android.app.ActionBar.LayoutParams(paramLayoutParams);
    localLayoutParams.gravity = paramLayoutParams.gravity;
    this.mActionBar.setCustomView(paramView, localLayoutParams);
  }

  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    this.mActionBar.setDisplayHomeAsUpEnabled(paramBoolean);
  }

  public void setDisplayOptions(int paramInt)
  {
    this.mActionBar.setDisplayOptions(paramInt);
  }

  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    this.mActionBar.setDisplayOptions(paramInt1, paramInt2);
  }

  public void setDisplayShowCustomEnabled(boolean paramBoolean)
  {
    this.mActionBar.setDisplayShowCustomEnabled(paramBoolean);
  }

  public void setDisplayShowHomeEnabled(boolean paramBoolean)
  {
    this.mActionBar.setDisplayShowHomeEnabled(paramBoolean);
  }

  public void setDisplayShowTitleEnabled(boolean paramBoolean)
  {
    this.mActionBar.setDisplayShowTitleEnabled(paramBoolean);
  }

  public void setDisplayUseLogoEnabled(boolean paramBoolean)
  {
    this.mActionBar.setDisplayUseLogoEnabled(paramBoolean);
  }

  public void setIcon(int paramInt)
  {
    this.mActionBar.setIcon(paramInt);
  }

  public void setIcon(Drawable paramDrawable)
  {
    this.mActionBar.setIcon(paramDrawable);
  }

  public void setListNavigationCallbacks(SpinnerAdapter paramSpinnerAdapter, ActionBar.OnNavigationListener paramOnNavigationListener)
  {
    android.app.ActionBar localActionBar = this.mActionBar;
    if (paramOnNavigationListener != null);
    for (ActionBarImplICS.OnNavigationListenerWrapper localOnNavigationListenerWrapper = new ActionBarImplICS.OnNavigationListenerWrapper(paramOnNavigationListener); ; localOnNavigationListenerWrapper = null)
    {
      localActionBar.setListNavigationCallbacks(paramSpinnerAdapter, localOnNavigationListenerWrapper);
      return;
    }
  }

  public void setLogo(int paramInt)
  {
    this.mActionBar.setLogo(paramInt);
  }

  public void setLogo(Drawable paramDrawable)
  {
    this.mActionBar.setLogo(paramDrawable);
  }

  public void setNavigationMode(int paramInt)
  {
    this.mActionBar.setNavigationMode(paramInt);
  }

  public void setSelectedNavigationItem(int paramInt)
  {
    this.mActionBar.setSelectedNavigationItem(paramInt);
  }

  public void setSubtitle(int paramInt)
  {
    this.mActionBar.setSubtitle(paramInt);
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.mActionBar.setSubtitle(paramCharSequence);
  }

  public void setTitle(int paramInt)
  {
    this.mActionBar.setTitle(paramInt);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.mActionBar.setTitle(paramCharSequence);
  }

  public void show()
  {
    this.mActionBar.show();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarImplICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
