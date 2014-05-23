package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.layout;
import android.support.v7.internal.view.ActionBarPolicy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ScrollingTabContainerView extends HorizontalScrollView
  implements AdapterViewICS.OnItemClickListener
{
  private static final String TAG = "ScrollingTabContainerView";
  private boolean mAllowCollapse;
  private int mContentHeight;
  private final LayoutInflater mInflater;
  int mMaxTabWidth;
  private int mSelectedTabIndex;
  int mStackedTabMaxWidth;
  private ScrollingTabContainerView.TabClickListener mTabClickListener;
  private LinearLayout mTabLayout;
  Runnable mTabSelector;
  private SpinnerICS mTabSpinner;

  public ScrollingTabContainerView(Context paramContext)
  {
    super(paramContext);
    this.mInflater = LayoutInflater.from(paramContext);
    setHorizontalScrollBarEnabled(false);
    ActionBarPolicy localActionBarPolicy = ActionBarPolicy.get(paramContext);
    setContentHeight(localActionBarPolicy.getTabContainerHeight());
    this.mStackedTabMaxWidth = localActionBarPolicy.getStackedTabMaxWidth();
    this.mTabLayout = ((LinearLayout)this.mInflater.inflate(R.layout.abc_action_bar_tabbar, this, false));
    addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
  }

  private SpinnerICS createSpinner()
  {
    SpinnerICS localSpinnerICS = new SpinnerICS(getContext(), null, R.attr.actionDropDownStyle);
    localSpinnerICS.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    localSpinnerICS.setOnItemClickListenerInt(this);
    return localSpinnerICS;
  }

  private ScrollingTabContainerView.TabView createTabView(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = (ScrollingTabContainerView.TabView)this.mInflater.inflate(R.layout.abc_action_bar_tab, this.mTabLayout, false);
    localTabView.attach(this, paramTab, paramBoolean);
    if (paramBoolean)
    {
      localTabView.setBackgroundDrawable(null);
      localTabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
      return localTabView;
    }
    localTabView.setFocusable(true);
    if (this.mTabClickListener == null)
      this.mTabClickListener = new ScrollingTabContainerView.TabClickListener(this, null);
    localTabView.setOnClickListener(this.mTabClickListener);
    return localTabView;
  }

  private boolean isCollapsed()
  {
    return (this.mTabSpinner != null) && (this.mTabSpinner.getParent() == this);
  }

  private void performCollapse()
  {
    if (isCollapsed())
      return;
    if (this.mTabSpinner == null)
      this.mTabSpinner = createSpinner();
    removeView(this.mTabLayout);
    addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
    if (this.mTabSpinner.getAdapter() == null)
      this.mTabSpinner.setAdapter(new ScrollingTabContainerView.TabAdapter(this, null));
    if (this.mTabSelector != null)
    {
      removeCallbacks(this.mTabSelector);
      this.mTabSelector = null;
    }
    this.mTabSpinner.setSelection(this.mSelectedTabIndex);
  }

  private boolean performExpand()
  {
    if (!isCollapsed())
      return false;
    removeView(this.mTabSpinner);
    addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.mTabSpinner.getSelectedItemPosition());
    return false;
  }

  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = createTabView(paramTab, false);
    this.mTabLayout.addView(localTabView, paramInt, new LinearLayout.LayoutParams(0, -1, 1.0F));
    if (this.mTabSpinner != null)
      ((ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    if (paramBoolean)
      localTabView.setSelected(true);
    if (this.mAllowCollapse)
      requestLayout();
  }

  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ScrollingTabContainerView.TabView localTabView = createTabView(paramTab, false);
    this.mTabLayout.addView(localTabView, new LinearLayout.LayoutParams(0, -1, 1.0F));
    if (this.mTabSpinner != null)
      ((ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    if (paramBoolean)
      localTabView.setSelected(true);
    if (this.mAllowCollapse)
      requestLayout();
  }

  public void animateToTab(int paramInt)
  {
    View localView = this.mTabLayout.getChildAt(paramInt);
    if (this.mTabSelector != null)
      removeCallbacks(this.mTabSelector);
    this.mTabSelector = new ScrollingTabContainerView.1(this, localView);
    post(this.mTabSelector);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.mTabSelector != null)
      post(this.mTabSelector);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    ActionBarPolicy localActionBarPolicy = ActionBarPolicy.get(getContext());
    setContentHeight(localActionBarPolicy.getTabContainerHeight());
    this.mStackedTabMaxWidth = localActionBarPolicy.getStackedTabMaxWidth();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.mTabSelector != null)
      removeCallbacks(this.mTabSelector);
  }

  public void onItemClick(AdapterViewICS<?> paramAdapterViewICS, View paramView, int paramInt, long paramLong)
  {
    ((ScrollingTabContainerView.TabView)paramView).getTab().select();
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label70: label85: int k;
    int m;
    if (i == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int j = this.mTabLayout.getChildCount();
      if ((j <= 1) || ((i != 1073741824) && (i != -2147483648)))
        break label204;
      if (j <= 2)
        break label191;
      this.mMaxTabWidth = (int)(0.4F * View.MeasureSpec.getSize(paramInt1));
      this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
      k = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
      if ((bool) || (!this.mAllowCollapse))
        break label212;
      m = 1;
      label112: if (m == 0)
        break label226;
      this.mTabLayout.measure(0, k);
      if (this.mTabLayout.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label218;
      performCollapse();
    }
    while (true)
    {
      int n = getMeasuredWidth();
      super.onMeasure(paramInt1, k);
      int i1 = getMeasuredWidth();
      if ((bool) && (n != i1))
        setTabSelected(this.mSelectedTabIndex);
      return;
      bool = false;
      break;
      label191: this.mMaxTabWidth = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label70;
      label204: this.mMaxTabWidth = -1;
      break label85;
      label212: m = 0;
      break label112;
      label218: performExpand();
      continue;
      label226: performExpand();
    }
  }

  public void removeAllTabs()
  {
    this.mTabLayout.removeAllViews();
    if (this.mTabSpinner != null)
      ((ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    if (this.mAllowCollapse)
      requestLayout();
  }

  public void removeTabAt(int paramInt)
  {
    this.mTabLayout.removeViewAt(paramInt);
    if (this.mTabSpinner != null)
      ((ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    if (this.mAllowCollapse)
      requestLayout();
  }

  public void setAllowCollapse(boolean paramBoolean)
  {
    this.mAllowCollapse = paramBoolean;
  }

  public void setContentHeight(int paramInt)
  {
    this.mContentHeight = paramInt;
    requestLayout();
  }

  public void setTabSelected(int paramInt)
  {
    this.mSelectedTabIndex = paramInt;
    int i = this.mTabLayout.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = this.mTabLayout.getChildAt(j);
      if (j == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
          animateToTab(paramInt);
        j++;
        break;
      }
    }
  }

  public void updateTab(int paramInt)
  {
    ((ScrollingTabContainerView.TabView)this.mTabLayout.getChildAt(paramInt)).update();
    if (this.mTabSpinner != null)
      ((ScrollingTabContainerView.TabAdapter)this.mTabSpinner.getAdapter()).notifyDataSetChanged();
    if (this.mAllowCollapse)
      requestLayout();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
