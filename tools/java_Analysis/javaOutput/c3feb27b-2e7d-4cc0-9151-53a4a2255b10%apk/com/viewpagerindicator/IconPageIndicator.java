package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class IconPageIndicator extends HorizontalScrollView
  implements PageIndicator
{
  private Runnable mIconSelector;
  private final IcsLinearLayout mIconsLayout;
  private ViewPager.OnPageChangeListener mListener;
  private int mSelectedIndex;
  private ViewPager mViewPager;

  public IconPageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }

  public IconPageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setHorizontalScrollBarEnabled(false);
    this.mIconsLayout = new IcsLinearLayout(paramContext, R.attr.vpiIconPageIndicatorStyle);
    addView(this.mIconsLayout, new FrameLayout.LayoutParams(-2, -1, 17));
  }

  private void animateToIcon(int paramInt)
  {
    View localView = this.mIconsLayout.getChildAt(paramInt);
    if (this.mIconSelector != null)
      removeCallbacks(this.mIconSelector);
    this.mIconSelector = new IconPageIndicator.1(this, localView);
    post(this.mIconSelector);
  }

  public void notifyDataSetChanged()
  {
    this.mIconsLayout.removeAllViews();
    IconPagerAdapter localIconPagerAdapter = (IconPagerAdapter)this.mViewPager.getAdapter();
    int i = localIconPagerAdapter.getCount();
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        if (this.mSelectedIndex > i)
          this.mSelectedIndex = (i - 1);
        setCurrentItem(this.mSelectedIndex);
        requestLayout();
        return;
      }
      ImageView localImageView = new ImageView(getContext(), null, R.attr.vpiIconPageIndicatorStyle);
      localImageView.setImageResource(localIconPagerAdapter.getIconResId(j));
      this.mIconsLayout.addView(localImageView);
    }
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.mIconSelector != null)
      post(this.mIconSelector);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.mIconSelector != null)
      removeCallbacks(this.mIconSelector);
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
    this.mSelectedIndex = paramInt;
    this.mViewPager.setCurrentItem(paramInt);
    int i = this.mIconsLayout.getChildCount();
    int j = 0;
    if (j >= i)
      return;
    View localView = this.mIconsLayout.getChildAt(j);
    if (j == paramInt);
    for (boolean bool = true; ; bool = false)
    {
      localView.setSelected(bool);
      if (bool)
        animateToIcon(paramInt);
      j++;
      break;
    }
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mListener = paramOnPageChangeListener;
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
 * Qualified Name:     com.viewpagerindicator.IconPageIndicator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
