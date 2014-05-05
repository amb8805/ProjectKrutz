package android.support.v4.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Scroller;
import java.util.ArrayList;

public class ViewPager extends ViewGroup
{
  private static final boolean DEBUG = false;
  private static final int INVALID_POINTER = -1;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "ViewPager";
  private static final boolean USE_CACHE;
  private int mActivePointerId = -1;
  private PagerAdapter mAdapter;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCurItem;
  private boolean mInLayout;
  private float mInitialMotionX;
  private boolean mIsBeingDragged;
  private boolean mIsUnableToDrag;
  private final ArrayList mItems = new ArrayList();
  private float mLastMotionX;
  private float mLastMotionY;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private PagerAdapter.DataSetObserver mObserver;
  private ViewPager.OnPageChangeListener mOnPageChangeListener;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState = null;
  private ClassLoader mRestoredClassLoader = null;
  private int mRestoredCurItem = -1;
  private int mScrollState = 0;
  private Scroller mScroller;
  private boolean mScrolling;
  private boolean mScrollingCacheEnabled;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;

  public ViewPager(Context paramContext)
  {
    super(paramContext);
    initViewPager();
  }

  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initViewPager();
  }

  private void completeScroll()
  {
    boolean bool1 = this.mScrolling;
    if (bool1)
    {
      setScrollingCacheEnabled(false);
      this.mScroller.abortAnimation();
      int j = getScrollX();
      int k = getScrollY();
      int m = this.mScroller.getCurrX();
      int n = this.mScroller.getCurrY();
      if ((j != m) || (k != n))
        scrollTo(m, n);
      setScrollState(0);
    }
    this.mPopulatePending = false;
    this.mScrolling = false;
    int i = 0;
    boolean bool3;
    for (boolean bool2 = bool1; i < this.mItems.size(); bool2 = bool3)
    {
      ViewPager.ItemInfo localItemInfo = (ViewPager.ItemInfo)this.mItems.get(i);
      if (localItemInfo.scrolling)
      {
        bool2 = true;
        localItemInfo.scrolling = false;
      }
      bool3 = bool2;
      i++;
    }
    if (bool2)
      populate();
  }

  private void endDrag()
  {
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }

  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = MotionEventCompat.getActionIndex(paramMotionEvent);
    if (MotionEventCompat.getPointerId(paramMotionEvent, i) == this.mActivePointerId)
      if (i != 0)
        break label56;
    label56: for (int j = 1; ; j = 0)
    {
      this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, j);
      this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, j);
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.clear();
      return;
    }
  }

  private void setScrollState(int paramInt)
  {
    if (this.mScrollState == paramInt);
    do
    {
      return;
      this.mScrollState = paramInt;
    }
    while (this.mOnPageChangeListener == null);
    this.mOnPageChangeListener.onPageScrollStateChanged(paramInt);
  }

  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.mScrollingCacheEnabled != paramBoolean)
      this.mScrollingCacheEnabled = paramBoolean;
  }

  void addNewItem(int paramInt1, int paramInt2)
  {
    ViewPager.ItemInfo localItemInfo = new ViewPager.ItemInfo();
    localItemInfo.position = paramInt1;
    localItemInfo.object = this.mAdapter.instantiateItem(this, paramInt1);
    if (paramInt2 < 0)
    {
      this.mItems.add(localItemInfo);
      return;
    }
    this.mItems.add(paramInt2, localItemInfo);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.mInLayout)
    {
      addViewInLayout(paramView, paramInt, paramLayoutParams);
      paramView.measure(this.mChildWidthMeasureSpec, this.mChildHeightMeasureSpec);
      return;
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }

  public void computeScroll()
  {
    if ((!this.mScroller.isFinished()) && (this.mScroller.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = this.mScroller.getCurrX();
      int m = this.mScroller.getCurrY();
      if ((i != k) || (j != m))
        scrollTo(k, m);
      if (this.mOnPageChangeListener != null)
      {
        int n = getWidth();
        int i1 = k / n;
        int i2 = k % n;
        float f = i2 / n;
        this.mOnPageChangeListener.onPageScrolled(i1, f, i2);
      }
      invalidate();
      return;
    }
    completeScroll();
  }

  void dataSetChanged()
  {
    int i;
    int j;
    int k;
    int m;
    label29: ViewPager.ItemInfo localItemInfo;
    int i1;
    int i6;
    int i4;
    int i2;
    int i3;
    if ((this.mItems.isEmpty()) && (this.mAdapter.getCount() > 0))
    {
      i = 1;
      j = 0;
      k = -1;
      m = i;
      if (j >= this.mItems.size())
        break label225;
      localItemInfo = (ViewPager.ItemInfo)this.mItems.get(j);
      i1 = this.mAdapter.getItemPosition(localItemInfo.object);
      if (i1 == -1)
        break label260;
      if (i1 != -2)
        break label181;
      this.mItems.remove(j);
      i6 = j - 1;
      this.mAdapter.destroyItem(this, localItemInfo.position, localItemInfo.object);
      if (this.mCurItem != localItemInfo.position)
        break label273;
      int i7 = Math.max(0, Math.min(this.mCurItem, this.mAdapter.getCount() - 1));
      i4 = 1;
      i2 = i6;
      i3 = i7;
    }
    label260: label273: 
    while (true)
    {
      int i5 = i2 + 1;
      m = i4;
      k = i3;
      j = i5;
      break label29;
      i = 0;
      break;
      label181: if (localItemInfo.position != i1)
      {
        if (localItemInfo.position == this.mCurItem)
          k = i1;
        localItemInfo.position = i1;
        i2 = j;
        i3 = k;
        i4 = 1;
        continue;
        label225: if (k >= 0)
          setCurrentItemInternal(k, false, true);
        for (int n = 1; ; n = m)
        {
          if (n != 0)
          {
            populate();
            requestLayout();
          }
          return;
        }
      }
      else
      {
        i2 = j;
        i3 = k;
        i4 = m;
        continue;
        i2 = i6;
        i3 = k;
        i4 = 1;
      }
    }
  }

  public PagerAdapter getAdapter()
  {
    return this.mAdapter;
  }

  ViewPager.ItemInfo infoForChild(View paramView)
  {
    for (int i = 0; i < this.mItems.size(); i++)
    {
      ViewPager.ItemInfo localItemInfo = (ViewPager.ItemInfo)this.mItems.get(i);
      if (this.mAdapter.isViewFromObject(paramView, localItemInfo.object))
        return localItemInfo;
    }
    return null;
  }

  void initViewPager()
  {
    setWillNotDraw(false);
    this.mScroller = new Scroller(getContext());
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(localViewConfiguration);
    this.mMinimumVelocity = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.mAdapter != null)
      populate();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0xFF & paramMotionEvent.getAction();
    if ((i == 3) || (i == 1))
    {
      this.mIsBeingDragged = false;
      this.mIsUnableToDrag = false;
      this.mActivePointerId = -1;
      return false;
    }
    if (i != 0)
    {
      if (this.mIsBeingDragged)
        return true;
      if (this.mIsUnableToDrag)
        return false;
    }
    switch (i)
    {
    default:
    case 2:
    case 0:
    case 6:
    }
    while (true)
    {
      return this.mIsBeingDragged;
      int j = this.mActivePointerId;
      if (j != -1)
      {
        int k = MotionEventCompat.findPointerIndex(paramMotionEvent, j);
        float f2 = MotionEventCompat.getX(paramMotionEvent, k);
        float f3 = Math.abs(f2 - this.mLastMotionX);
        float f4 = Math.abs(MotionEventCompat.getY(paramMotionEvent, k) - this.mLastMotionY);
        if ((f3 > this.mTouchSlop) && (f3 > f4))
        {
          this.mIsBeingDragged = true;
          setScrollState(1);
          this.mLastMotionX = f2;
          setScrollingCacheEnabled(true);
        }
        else if (f4 > this.mTouchSlop)
        {
          this.mIsUnableToDrag = true;
          continue;
          float f1 = paramMotionEvent.getX();
          this.mInitialMotionX = f1;
          this.mLastMotionX = f1;
          this.mLastMotionY = paramMotionEvent.getY();
          this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, 0);
          if (this.mScrollState == 2)
          {
            this.mIsBeingDragged = true;
            this.mIsUnableToDrag = false;
            setScrollState(1);
          }
          else
          {
            completeScroll();
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            continue;
            onSecondaryPointerUp(paramMotionEvent);
          }
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    this.mInLayout = true;
    populate();
    this.mInLayout = false;
    int j = getChildCount();
    int k = paramInt3 - paramInt1;
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() != 8)
      {
        ViewPager.ItemInfo localItemInfo = infoForChild(localView);
        if (localItemInfo != null)
        {
          int m = k * localItemInfo.position + getPaddingLeft();
          int n = getPaddingTop();
          localView.layout(m, n, m + localView.getMeasuredWidth(), n + localView.getMeasuredHeight());
        }
      }
      i++;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824);
    this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824);
    this.mInLayout = true;
    populate();
    this.mInLayout = false;
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
        localView.measure(this.mChildWidthMeasureSpec, this.mChildHeightMeasureSpec);
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    ViewPager.SavedState localSavedState = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.mAdapter != null)
    {
      this.mAdapter.restoreState(localSavedState.adapterState, localSavedState.loader);
      setCurrentItemInternal(localSavedState.position, false, true);
      return;
    }
    this.mRestoredCurItem = localSavedState.position;
    this.mRestoredAdapterState = localSavedState.adapterState;
    this.mRestoredClassLoader = localSavedState.loader;
  }

  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.position = this.mCurItem;
    localSavedState.adapterState = this.mAdapter.saveState();
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    int i = paramInt1 * this.mCurItem;
    if (i != getScrollX())
    {
      completeScroll();
      scrollTo(i, getScrollY());
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      return false;
    if ((this.mAdapter == null) || (this.mAdapter.getCount() == 0))
      return false;
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      return true;
      completeScroll();
      float f10 = paramMotionEvent.getX();
      this.mInitialMotionX = f10;
      this.mLastMotionX = f10;
      this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, 0);
      continue;
      if (!this.mIsBeingDragged)
      {
        int i1 = MotionEventCompat.findPointerIndex(paramMotionEvent, this.mActivePointerId);
        float f7 = MotionEventCompat.getX(paramMotionEvent, i1);
        float f8 = Math.abs(f7 - this.mLastMotionX);
        float f9 = Math.abs(MotionEventCompat.getY(paramMotionEvent, i1) - this.mLastMotionY);
        if ((f8 > this.mTouchSlop) && (f8 > f9))
        {
          this.mIsBeingDragged = true;
          this.mLastMotionX = f7;
          setScrollState(1);
          setScrollingCacheEnabled(true);
        }
      }
      if (this.mIsBeingDragged)
      {
        float f1 = MotionEventCompat.getX(paramMotionEvent, MotionEventCompat.findPointerIndex(paramMotionEvent, this.mActivePointerId));
        float f2 = this.mLastMotionX - f1;
        this.mLastMotionX = f1;
        float f3 = f2 + getScrollX();
        int k = getWidth();
        float f4 = Math.max(0, k * (this.mCurItem - 1));
        float f5 = k * Math.min(1 + this.mCurItem, this.mAdapter.getCount() - 1);
        if (f3 < f4)
          f3 = f4;
        while (true)
        {
          this.mLastMotionX += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          if (this.mOnPageChangeListener == null)
            break;
          int m = (int)f3 / k;
          int n = (int)f3 % k;
          float f6 = n / k;
          this.mOnPageChangeListener.onPageScrolled(m, f6, n);
          break;
          if (f3 > f5)
            f3 = f5;
        }
        if (this.mIsBeingDragged)
        {
          VelocityTracker localVelocityTracker = this.mVelocityTracker;
          localVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
          int j = (int)VelocityTrackerCompat.getYVelocity(localVelocityTracker, this.mActivePointerId);
          this.mPopulatePending = true;
          if ((Math.abs(j) > this.mMinimumVelocity) || (Math.abs(this.mInitialMotionX - this.mLastMotionX) >= getWidth() / 3))
            if (this.mLastMotionX > this.mInitialMotionX)
              setCurrentItemInternal(this.mCurItem - 1, true, true);
          while (true)
          {
            this.mActivePointerId = -1;
            endDrag();
            break;
            setCurrentItemInternal(1 + this.mCurItem, true, true);
            continue;
            setCurrentItemInternal(this.mCurItem, true, true);
          }
          if (this.mIsBeingDragged)
          {
            setCurrentItemInternal(this.mCurItem, true, true);
            this.mActivePointerId = -1;
            endDrag();
            continue;
            int i = MotionEventCompat.getActionIndex(paramMotionEvent);
            this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, i);
            this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, i);
            continue;
            onSecondaryPointerUp(paramMotionEvent);
            this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, MotionEventCompat.findPointerIndex(paramMotionEvent, this.mActivePointerId));
          }
        }
      }
    }
  }

  void populate()
  {
    if (this.mAdapter == null);
    while ((this.mPopulatePending) || (getWindowToken() == null))
      return;
    this.mAdapter.startUpdate(this);
    int i;
    int j;
    int k;
    label69: int m;
    int n;
    label75: ViewPager.ItemInfo localItemInfo;
    if (this.mCurItem > 0)
    {
      i = this.mCurItem - 1;
      j = this.mAdapter.getCount();
      if (this.mCurItem >= j - 1)
        break label183;
      k = 1 + this.mCurItem;
      m = 0;
      n = -1;
      if (m >= this.mItems.size())
        break label253;
      localItemInfo = (ViewPager.ItemInfo)this.mItems.get(m);
      if (((localItemInfo.position >= i) && (localItemInfo.position <= k)) || (localItemInfo.scrolling))
        break label190;
      this.mItems.remove(m);
      m--;
      this.mAdapter.destroyItem(this, localItemInfo.position, localItemInfo.object);
    }
    while (true)
    {
      int i4 = localItemInfo.position;
      m++;
      n = i4;
      break label75;
      i = this.mCurItem;
      break;
      label183: k = j - 1;
      break label69;
      label190: if ((n < k) && (localItemInfo.position > i))
      {
        int i3 = n + 1;
        if (i3 < i)
          i3 = i;
        while ((i3 <= k) && (i3 < localItemInfo.position))
        {
          addNewItem(i3, m);
          i3++;
          m++;
        }
      }
    }
    label253: int i1;
    int i2;
    if (this.mItems.size() > 0)
    {
      i1 = ((ViewPager.ItemInfo)this.mItems.get(this.mItems.size() - 1)).position;
      if (i1 >= k)
        break label336;
      i2 = i1 + 1;
      if (i2 <= i)
        break label330;
    }
    while (true)
    {
      if (i2 > k)
        break label336;
      addNewItem(i2, -1);
      i2++;
      continue;
      i1 = -1;
      break;
      label330: i2 = i;
    }
    label336: this.mAdapter.finishUpdate(this);
  }

  public void setAdapter(PagerAdapter paramPagerAdapter)
  {
    if (this.mAdapter != null)
      this.mAdapter.setDataSetObserver(null);
    this.mAdapter = paramPagerAdapter;
    if (this.mAdapter != null)
    {
      if (this.mObserver == null)
        this.mObserver = new ViewPager.DataSetObserver(this, null);
      this.mAdapter.setDataSetObserver(this.mObserver);
      this.mPopulatePending = false;
      if (this.mRestoredCurItem >= 0)
      {
        this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
        setCurrentItemInternal(this.mRestoredCurItem, false, true);
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
      }
    }
    else
    {
      return;
    }
    populate();
  }

  public void setCurrentItem(int paramInt)
  {
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, true, false);
  }

  void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.mAdapter == null) || (this.mAdapter.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.mCurItem == paramInt) && (this.mItems.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i;
    if (paramInt < 0)
      i = 0;
    while (true)
    {
      if ((i > 1 + this.mCurItem) || (i < this.mCurItem - 1))
      {
        int j = 0;
        while (true)
          if (j < this.mItems.size())
          {
            ((ViewPager.ItemInfo)this.mItems.get(j)).scrolling = true;
            j++;
            continue;
            if (paramInt < this.mAdapter.getCount())
              break label250;
            i = this.mAdapter.getCount() - 1;
            break;
          }
      }
      if (this.mCurItem != i);
      for (int k = 1; ; k = 0)
      {
        this.mCurItem = i;
        populate();
        if (!paramBoolean1)
          break label210;
        smoothScrollTo(i * getWidth(), 0);
        if ((k == 0) || (this.mOnPageChangeListener == null))
          break;
        this.mOnPageChangeListener.onPageSelected(i);
        return;
      }
      label210: if ((k != 0) && (this.mOnPageChangeListener != null))
        this.mOnPageChangeListener.onPageSelected(i);
      completeScroll();
      scrollTo(i * getWidth(), 0);
      return;
      label250: i = paramInt;
    }
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mOnPageChangeListener = paramOnPageChangeListener;
  }

  void smoothScrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i = getScrollX();
    int j = getScrollY();
    int k = paramInt1 - i;
    int m = paramInt2 - j;
    if ((k == 0) && (m == 0))
    {
      completeScroll();
      return;
    }
    setScrollingCacheEnabled(true);
    this.mScrolling = true;
    setScrollState(2);
    this.mScroller.startScroll(i, j, k, m);
    invalidate();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewPager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
