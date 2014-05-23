package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;

public class TabPageIndicator extends HorizontalScrollView
  implements PageIndicator
{
  private static final CharSequence EMPTY_TITLE = "";
  private ViewPager.OnPageChangeListener mListener;
  private int mMaxTabWidth;
  private int mSelectedTabIndex;
  private final View.OnClickListener mTabClickListener = new TabPageIndicator.1(this);
  private final IcsLinearLayout mTabLayout;
  private TabPageIndicator.OnTabReselectedListener mTabReselectedListener;
  private Runnable mTabSelector;
  private ViewPager mViewPager;

  public TabPageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }

  public TabPageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setHorizontalScrollBarEnabled(false);
    this.mTabLayout = new IcsLinearLayout(paramContext, R.attr.vpiTabPageIndicatorStyle);
    addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
  }

  private void addTab(int paramInt1, CharSequence paramCharSequence, int paramInt2)
  {
    TabPageIndicator.TabView localTabView = new TabPageIndicator.TabView(this, getContext());
    TabPageIndicator.TabView.access$0(localTabView, paramInt1);
    localTabView.setFocusable(true);
    localTabView.setOnClickListener(this.mTabClickListener);
    localTabView.setText(paramCharSequence);
    if (paramInt2 != 0)
      localTabView.setCompoundDrawablesWithIntrinsicBounds(paramInt2, 0, 0, 0);
    this.mTabLayout.addView(localTabView, new LinearLayout.LayoutParams(0, -1, 1.0F));
  }

  private void animateToTab(int paramInt)
  {
    View localView = this.mTabLayout.getChildAt(paramInt);
    if (this.mTabSelector != null)
      removeCallbacks(this.mTabSelector);
    this.mTabSelector = new TabPageIndicator.2(this, localView);
    post(this.mTabSelector);
  }

  public void notifyDataSetChanged()
  {
    this.mTabLayout.removeAllViews();
    PagerAdapter localPagerAdapter = this.mViewPager.getAdapter();
    boolean bool = localPagerAdapter instanceof IconPagerAdapter;
    IconPagerAdapter localIconPagerAdapter = null;
    if (bool)
      localIconPagerAdapter = (IconPagerAdapter)localPagerAdapter;
    int i = localPagerAdapter.getCount();
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        if (this.mSelectedTabIndex > i)
          this.mSelectedTabIndex = (i - 1);
        setCurrentItem(this.mSelectedTabIndex);
        requestLayout();
        return;
      }
      CharSequence localCharSequence = localPagerAdapter.getPageTitle(j);
      if (localCharSequence == null)
        localCharSequence = EMPTY_TITLE;
      int k = 0;
      if (localIconPagerAdapter != null)
        k = localIconPagerAdapter.getIconResId(j);
      addTab(j, localCharSequence, k);
    }
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.mTabSelector != null)
      post(this.mTabSelector);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.mTabSelector != null)
      removeCallbacks(this.mTabSelector);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (i == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int j = this.mTabLayout.getChildCount();
      if ((j <= 1) || ((i != 1073741824) && (i != -2147483648)))
        break label124;
      if (j <= 2)
        break label111;
      this.mMaxTabWidth = (int)(0.4F * View.MeasureSpec.getSize(paramInt1));
    }
    while (true)
    {
      int k = getMeasuredWidth();
      super.onMeasure(paramInt1, paramInt2);
      int m = getMeasuredWidth();
      if ((bool) && (k != m))
        setCurrentItem(this.mSelectedTabIndex);
      return;
      bool = false;
      break;
      label111: this.mMaxTabWidth = (View.MeasureSpec.getSize(paramInt1) / 2);
      continue;
      label124: this.mMaxTabWidth = -1;
    }
  }

  public void onPageScrollStateChanged(int paramInt)
  {
    if (this.mListener != null)
      this.mListener.onPageScrollStateChanged(paramInt);
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.mListener != null)
      this.mListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
  }

  public void onPageSelected(int paramInt)
  {
    setCurrentItem(paramInt);
    if (this.mListener != null)
      this.mListener.onPageSelected(paramInt);
  }

  public void setCurrentItem(int paramInt)
  {
    if (this.mViewPager == null)
      throw new IllegalStateException("ViewPager has not been bound.");
    this.mSelectedTabIndex = paramInt;
    this.mViewPager.setCurrentItem(paramInt);
    int i = this.mTabLayout.getChildCount();
    int j = 0;
    if (j >= i)
      return;
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

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mListener = paramOnPageChangeListener;
  }

  public void setOnTabReselectedListener(TabPageIndicator.OnTabReselectedListener paramOnTabReselectedListener)
  {
    this.mTabReselectedListener = paramOnTabReselectedListener;
  }

  public void setViewPager(ViewPager paramViewPager)
  {
    if (this.mViewPager == paramViewPager)
      return;
    if (this.mViewPager != null)
      this.mViewPager.setOnPageChangeListener(null);
    if (paramViewPager.getAdapter() == null)
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    this.mViewPager = paramViewPager;
    paramViewPager.setOnPageChangeListener(this);
    notifyDataSetChanged();
  }

  public void setViewPager(ViewPager paramViewPager, int paramInt)
  {
    setViewPager(paramViewPager);
    setCurrentItem(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.viewpagerindicator.TabPageIndicator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
