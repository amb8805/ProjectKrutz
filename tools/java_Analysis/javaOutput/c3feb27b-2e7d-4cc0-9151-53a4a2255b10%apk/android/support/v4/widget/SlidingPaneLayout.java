package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  private static final int DEFAULT_FADE_COLOR = -858993460;
  private static final int DEFAULT_OVERHANG_SIZE = 32;
  static final SlidingPaneLayout.SlidingPanelLayoutImpl IMPL = new SlidingPaneLayout.SlidingPanelLayoutImplBase();
  private static final int MIN_FLING_VELOCITY = 400;
  private static final String TAG = "SlidingPaneLayout";
  private boolean mCanSlide;
  private int mCoveredFadeColor;
  private final ViewDragHelper mDragHelper;
  private boolean mFirstLayout = true;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private boolean mIsUnableToDrag;
  private final int mOverhangSize;
  private SlidingPaneLayout.PanelSlideListener mPanelSlideListener;
  private int mParallaxBy;
  private float mParallaxOffset;
  private final ArrayList<SlidingPaneLayout.DisableLayerRunnable> mPostedRunnables = new ArrayList();
  private boolean mPreservedOpenState;
  private Drawable mShadowDrawable;
  private float mSlideOffset;
  private int mSlideRange;
  private View mSlideableView;
  private int mSliderFadeColor = -858993460;
  private final Rect mTmpRect = new Rect();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      IMPL = new SlidingPaneLayout.SlidingPanelLayoutImplJBMR1();
      return;
    }
    if (i >= 16)
    {
      IMPL = new SlidingPaneLayout.SlidingPanelLayoutImplJB();
      return;
    }
  }

  public SlidingPaneLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.mOverhangSize = (int)(0.5F + 32.0F * f);
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    ViewCompat.setAccessibilityDelegate(this, new SlidingPaneLayout.AccessibilityDelegate(this));
    ViewCompat.setImportantForAccessibility(this, 1);
    this.mDragHelper = ViewDragHelper.create(this, 0.5F, new SlidingPaneLayout.DragHelperCallback(this, null));
    this.mDragHelper.setEdgeTrackingEnabled(1);
    this.mDragHelper.setMinVelocity(400.0F * f);
  }

  private boolean closePane(View paramView, int paramInt)
  {
    boolean bool1;
    if (!this.mFirstLayout)
    {
      boolean bool2 = smoothSlideTo(0.0F, paramInt);
      bool1 = false;
      if (!bool2);
    }
    else
    {
      this.mPreservedOpenState = false;
      bool1 = true;
    }
    return bool1;
  }

  private void dimChildView(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i = (int)(paramFloat * (0xFF000000 & paramInt) >>> 24) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.dimPaint == null)
        localLayoutParams.dimPaint = new Paint();
      localLayoutParams.dimPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_OVER));
      if (ViewCompat.getLayerType(paramView) != 2)
        ViewCompat.setLayerType(paramView, 2, localLayoutParams.dimPaint);
      invalidateChildRegion(paramView);
    }
    while (ViewCompat.getLayerType(paramView) == 0)
    {
      int i;
      return;
    }
    if (localLayoutParams.dimPaint != null)
      localLayoutParams.dimPaint.setColorFilter(null);
    SlidingPaneLayout.DisableLayerRunnable localDisableLayerRunnable = new SlidingPaneLayout.DisableLayerRunnable(this, paramView);
    this.mPostedRunnables.add(localDisableLayerRunnable);
    ViewCompat.postOnAnimation(this, localDisableLayerRunnable);
  }

  private void invalidateChildRegion(View paramView)
  {
    IMPL.invalidateChildRegion(this, paramView);
  }

  private void onPanelDragged(int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.mSlideableView.getLayoutParams();
    this.mSlideOffset = (paramInt - (getPaddingLeft() + localLayoutParams.leftMargin) / this.mSlideRange);
    if (this.mParallaxBy != 0)
      parallaxOtherViews(this.mSlideOffset);
    if (localLayoutParams.dimWhenOffset)
      dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
    dispatchOnPanelSlide(this.mSlideableView);
  }

  private boolean openPane(View paramView, int paramInt)
  {
    if ((this.mFirstLayout) || (smoothSlideTo(1.0F, paramInt)))
    {
      this.mPreservedOpenState = true;
      return true;
    }
    return false;
  }

  private void parallaxOtherViews(float paramFloat)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.mSlideableView.getLayoutParams();
    int i;
    int k;
    label36: View localView;
    if ((localLayoutParams.dimWhenOffset) && (localLayoutParams.leftMargin <= 0))
    {
      i = 1;
      int j = getChildCount();
      k = 0;
      if (k >= j)
        return;
      localView = getChildAt(k);
      if (localView != this.mSlideableView)
        break label71;
    }
    while (true)
    {
      k++;
      break label36;
      i = 0;
      break;
      label71: int m = (int)((1.0F - this.mParallaxOffset) * this.mParallaxBy);
      this.mParallaxOffset = paramFloat;
      localView.offsetLeftAndRight(m - (int)((1.0F - paramFloat) * this.mParallaxBy));
      if (i != 0)
        dimChildView(localView, 1.0F - this.mParallaxOffset, this.mCoveredFadeColor);
    }
  }

  private static boolean viewIsOpaque(View paramView)
  {
    if (ViewCompat.isOpaque(paramView));
    Drawable localDrawable;
    do
    {
      return true;
      if (Build.VERSION.SDK_INT >= 18)
        return false;
      localDrawable = paramView.getBackground();
      if (localDrawable == null)
        break;
    }
    while (localDrawable.getOpacity() == -1);
    return false;
    return false;
  }

  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = paramView.getScrollX();
      int j = paramView.getScrollY();
      for (int k = -1 + localViewGroup.getChildCount(); k >= 0; k--)
      {
        View localView = localViewGroup.getChildAt(k);
        if ((paramInt2 + i >= localView.getLeft()) && (paramInt2 + i < localView.getRight()) && (paramInt3 + j >= localView.getTop()) && (paramInt3 + j < localView.getBottom()) && (canScroll(localView, true, paramInt1, paramInt2 + i - localView.getLeft(), paramInt3 + j - localView.getTop())))
          return true;
      }
    }
    return (paramBoolean) && (ViewCompat.canScrollHorizontally(paramView, -paramInt1));
  }

  @Deprecated
  public boolean canSlide()
  {
    return this.mCanSlide;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public boolean closePane()
  {
    return closePane(this.mSlideableView, 0);
  }

  public void computeScroll()
  {
    if (this.mDragHelper.continueSettling(true))
    {
      if (!this.mCanSlide)
        this.mDragHelper.abort();
    }
    else
      return;
    ViewCompat.postInvalidateOnAnimation(this);
  }

  void dispatchOnPanelClosed(View paramView)
  {
    if (this.mPanelSlideListener != null)
      this.mPanelSlideListener.onPanelClosed(paramView);
    sendAccessibilityEvent(32);
  }

  void dispatchOnPanelOpened(View paramView)
  {
    if (this.mPanelSlideListener != null)
      this.mPanelSlideListener.onPanelOpened(paramView);
    sendAccessibilityEvent(32);
  }

  void dispatchOnPanelSlide(View paramView)
  {
    if (this.mPanelSlideListener != null)
      this.mPanelSlideListener.onPanelSlide(paramView, this.mSlideOffset);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (getChildCount() > 1);
    for (View localView = getChildAt(1); (localView == null) || (this.mShadowDrawable == null); localView = null)
      return;
    int i = this.mShadowDrawable.getIntrinsicWidth();
    int j = localView.getLeft();
    int k = localView.getTop();
    int m = localView.getBottom();
    int n = j - i;
    this.mShadowDrawable.setBounds(n, k, j, m);
    this.mShadowDrawable.draw(paramCanvas);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save(2);
    if ((this.mCanSlide) && (!localLayoutParams.slideable) && (this.mSlideableView != null))
    {
      paramCanvas.getClipBounds(this.mTmpRect);
      this.mTmpRect.right = Math.min(this.mTmpRect.right, this.mSlideableView.getLeft());
      paramCanvas.clipRect(this.mTmpRect);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT >= 11)
      bool = super.drawChild(paramCanvas, paramView, paramLong);
    while (true)
    {
      paramCanvas.restoreToCount(i);
      return bool;
      if ((localLayoutParams.dimWhenOffset) && (this.mSlideOffset > 0.0F))
      {
        if (!paramView.isDrawingCacheEnabled())
          paramView.setDrawingCacheEnabled(true);
        Bitmap localBitmap = paramView.getDrawingCache();
        if (localBitmap != null)
        {
          paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.dimPaint);
          bool = false;
        }
        else
        {
          Log.e("SlidingPaneLayout", "drawChild: child view " + paramView + " returned null drawing cache");
          bool = super.drawChild(paramCanvas, paramView, paramLong);
        }
      }
      else
      {
        if (paramView.isDrawingCacheEnabled())
          paramView.setDrawingCacheEnabled(false);
        bool = super.drawChild(paramCanvas, paramView, paramLong);
      }
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }

  public int getCoveredFadeColor()
  {
    return this.mCoveredFadeColor;
  }

  public int getParallaxDistance()
  {
    return this.mParallaxBy;
  }

  public int getSliderFadeColor()
  {
    return this.mSliderFadeColor;
  }

  boolean isDimmed(View paramView)
  {
    if (paramView == null);
    SlidingPaneLayout.LayoutParams localLayoutParams;
    do
    {
      return false;
      localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    }
    while ((!this.mCanSlide) || (!localLayoutParams.dimWhenOffset) || (this.mSlideOffset <= 0.0F));
    return true;
  }

  public boolean isOpen()
  {
    return (!this.mCanSlide) || (this.mSlideOffset == 1.0F);
  }

  public boolean isSlideable()
  {
    return this.mCanSlide;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mFirstLayout = true;
    int i = 0;
    int j = this.mPostedRunnables.size();
    while (i < j)
    {
      ((SlidingPaneLayout.DisableLayerRunnable)this.mPostedRunnables.get(i)).run();
      i++;
    }
    this.mPostedRunnables.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = MotionEventCompat.getActionMasked(paramMotionEvent);
    if ((!this.mCanSlide) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
        if (this.mDragHelper.isViewUnder(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label98;
    }
    label98: for (boolean bool5 = true; ; bool5 = false)
    {
      this.mPreservedOpenState = bool5;
      if ((this.mCanSlide) && ((!this.mIsUnableToDrag) || (i == 0)))
        break;
      this.mDragHelper.cancel();
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    if ((i == 3) || (i == 1))
    {
      this.mDragHelper.cancel();
      return false;
    }
    int j = 0;
    switch (i)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    while ((this.mDragHelper.shouldInterceptTouchEvent(paramMotionEvent)) || (j != 0))
    {
      return true;
      this.mIsUnableToDrag = false;
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.mInitialMotionX = f5;
      this.mInitialMotionY = f6;
      boolean bool3 = this.mDragHelper.isViewUnder(this.mSlideableView, (int)f5, (int)f6);
      j = 0;
      if (bool3)
      {
        boolean bool4 = isDimmed(this.mSlideableView);
        j = 0;
        if (bool4)
        {
          j = 1;
          continue;
          float f1 = paramMotionEvent.getX();
          float f2 = paramMotionEvent.getY();
          float f3 = Math.abs(f1 - this.mInitialMotionX);
          float f4 = Math.abs(f2 - this.mInitialMotionY);
          boolean bool1 = f3 < this.mDragHelper.getTouchSlop();
          j = 0;
          if (bool1)
          {
            boolean bool2 = f4 < f3;
            j = 0;
            if (bool2)
            {
              this.mDragHelper.cancel();
              this.mIsUnableToDrag = true;
              return false;
            }
          }
        }
      }
    }
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = getPaddingTop();
    int n = getChildCount();
    int i1 = j;
    int i2 = i1;
    if (this.mFirstLayout)
      if ((!this.mCanSlide) || (!this.mPreservedOpenState))
        break label102;
    View localView;
    label102: for (float f = 1.0F; ; f = 0.0F)
    {
      this.mSlideOffset = f;
      for (int i3 = 0; ; i3++)
      {
        if (i3 >= n)
          break label326;
        localView = getChildAt(i3);
        if (localView.getVisibility() != 8)
          break;
      }
    }
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
    int i5 = localView.getMeasuredWidth();
    int i6 = 0;
    boolean bool;
    if (localLayoutParams.slideable)
    {
      int i8 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i9 = Math.min(i2, i - k - this.mOverhangSize) - i1 - i8;
      this.mSlideRange = i9;
      if (i9 + (i1 + localLayoutParams.leftMargin) + i5 / 2 > i - k)
      {
        bool = true;
        label205: localLayoutParams.dimWhenOffset = bool;
        i1 += (int)(i9 * this.mSlideOffset) + localLayoutParams.leftMargin;
      }
    }
    while (true)
    {
      int i7 = i1 - i6;
      localView.layout(i7, m, i7 + i5, m + localView.getMeasuredHeight());
      i2 += localView.getWidth();
      break;
      bool = false;
      break label205;
      if ((this.mCanSlide) && (this.mParallaxBy != 0))
      {
        i6 = (int)((1.0F - this.mSlideOffset) * this.mParallaxBy);
        i1 = i2;
      }
      else
      {
        i1 = i2;
        i6 = 0;
      }
    }
    label326: if (this.mFirstLayout)
    {
      if (!this.mCanSlide)
        break label401;
      if (this.mParallaxBy != 0)
        parallaxOtherViews(this.mSlideOffset);
      if (((SlidingPaneLayout.LayoutParams)this.mSlideableView.getLayoutParams()).dimWhenOffset)
        dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
    }
    while (true)
    {
      updateObscuredViewsVisibility(this.mSlideableView);
      this.mFirstLayout = false;
      return;
      label401: for (int i4 = 0; i4 < n; i4++)
        dimChildView(getChildAt(i4), 0.0F, this.mSliderFadeColor);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n;
    int i1;
    label80: float f;
    boolean bool1;
    int i2;
    int i3;
    int i4;
    label129: View localView2;
    SlidingPaneLayout.LayoutParams localLayoutParams2;
    if (i != 1073741824)
      if (isInEditMode())
        if (i == -2147483648)
        {
          n = -1;
          i1 = 0;
          switch (k)
          {
          default:
            f = 0.0F;
            bool1 = false;
            i2 = j - getPaddingLeft() - getPaddingRight();
            i3 = getChildCount();
            if (i3 > 2)
              Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
            this.mSlideableView = null;
            i4 = 0;
            if (i4 >= i3)
              break label543;
            localView2 = getChildAt(i4);
            localLayoutParams2 = (SlidingPaneLayout.LayoutParams)localView2.getLayoutParams();
            if (localView2.getVisibility() == 8)
              localLayoutParams2.dimWhenOffset = false;
          case 1073741824:
          case -2147483648:
          }
        }
    do
    {
      i4++;
      break label129;
      if (i != 0)
        break;
      j = 300;
      break;
      throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
      if (k != 0)
        break;
      if (isInEditMode())
      {
        if (k != 0)
          break;
        k = -2147483648;
        m = 300;
        break;
      }
      throw new IllegalStateException("Height must not be UNSPECIFIED");
      n = m - getPaddingTop() - getPaddingBottom();
      i1 = n;
      break label80;
      n = m - getPaddingTop() - getPaddingBottom();
      i1 = 0;
      break label80;
      if (localLayoutParams2.weight <= 0.0F)
        break label309;
      f += localLayoutParams2.weight;
    }
    while (localLayoutParams2.width == 0);
    label309: int i14 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
    int i15;
    label345: int i16;
    if (localLayoutParams2.width == -2)
    {
      i15 = View.MeasureSpec.makeMeasureSpec(j - i14, -2147483648);
      if (localLayoutParams2.height != -2)
        break label499;
      i16 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
      label365: localView2.measure(i15, i16);
      int i17 = localView2.getMeasuredWidth();
      int i18 = localView2.getMeasuredHeight();
      if ((k == -2147483648) && (i18 > i1))
        i1 = Math.min(i18, n);
      i2 -= i17;
      if (i2 >= 0)
        break label537;
    }
    label537: for (boolean bool2 = true; ; bool2 = false)
    {
      localLayoutParams2.slideable = bool2;
      bool1 |= bool2;
      if (!localLayoutParams2.slideable)
        break;
      this.mSlideableView = localView2;
      break;
      if (localLayoutParams2.width == -1)
      {
        i15 = View.MeasureSpec.makeMeasureSpec(j - i14, 1073741824);
        break label345;
      }
      i15 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
      break label345;
      label499: if (localLayoutParams2.height == -1)
      {
        i16 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        break label365;
      }
      i16 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
      break label365;
    }
    label543: if ((bool1) || (f > 0.0F))
    {
      int i5 = j - this.mOverhangSize;
      int i6 = 0;
      if (i6 < i3)
      {
        View localView1 = getChildAt(i6);
        if (localView1.getVisibility() == 8);
        while (true)
        {
          i6++;
          break;
          SlidingPaneLayout.LayoutParams localLayoutParams1 = (SlidingPaneLayout.LayoutParams)localView1.getLayoutParams();
          if (localView1.getVisibility() != 8)
          {
            int i7;
            label639: int i8;
            int i13;
            if ((localLayoutParams1.width == 0) && (localLayoutParams1.weight > 0.0F))
            {
              i7 = 1;
              if (i7 != 0)
              {
                i8 = 0;
                if ((!bool1) || (localView1 == this.mSlideableView))
                  break label799;
                if ((localLayoutParams1.width >= 0) || ((i8 <= i5) && (localLayoutParams1.weight <= 0.0F)))
                  continue;
                if (i7 == 0)
                  break label783;
                if (localLayoutParams1.height != -2)
                  break label745;
                i13 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
              }
            }
            else
            {
              while (true)
              {
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i13);
                break;
                i7 = 0;
                break label639;
                i8 = localView1.getMeasuredWidth();
                break label647;
                label745: if (localLayoutParams1.height == -1)
                {
                  i13 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
                }
                else
                {
                  i13 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                  continue;
                  i13 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                }
              }
              label799: if (localLayoutParams1.weight > 0.0F)
              {
                int i9;
                if (localLayoutParams1.width == 0)
                  if (localLayoutParams1.height == -2)
                    i9 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
                while (true)
                {
                  if (!bool1)
                    break label941;
                  int i11 = j - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                  int i12 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                  if (i8 == i11)
                    break;
                  localView1.measure(i12, i9);
                  break;
                  if (localLayoutParams1.height == -1)
                  {
                    i9 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
                  }
                  else
                  {
                    i9 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                    continue;
                    i9 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                  }
                }
                label941: int i10 = Math.max(0, i2);
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i8 + (int)(localLayoutParams1.weight * i10 / f), 1073741824), i9);
              }
            }
          }
        }
      }
    }
    label647: label783: setMeasuredDimension(j, i1);
    this.mCanSlide = bool1;
    if ((this.mDragHelper.getViewDragState() != 0) && (!bool1))
      this.mDragHelper.abort();
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.isOpen)
      openPane();
    while (true)
    {
      this.mPreservedOpenState = localSavedState.isOpen;
      return;
      closePane();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    if (isSlideable());
    for (boolean bool = isOpen(); ; bool = this.mPreservedOpenState)
    {
      localSavedState.isOpen = bool;
      return localSavedState;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.mFirstLayout = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.mCanSlide)
      bool = super.onTouchEvent(paramMotionEvent);
    float f1;
    float f2;
    float f3;
    float f4;
    int j;
    do
    {
      do
      {
        return bool;
        this.mDragHelper.processTouchEvent(paramMotionEvent);
        int i = paramMotionEvent.getAction();
        bool = true;
        switch (i & 0xFF)
        {
        default:
          return bool;
        case 0:
          float f5 = paramMotionEvent.getX();
          float f6 = paramMotionEvent.getY();
          this.mInitialMotionX = f5;
          this.mInitialMotionY = f6;
          return bool;
        case 1:
        }
      }
      while (!isDimmed(this.mSlideableView));
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      f3 = f1 - this.mInitialMotionX;
      f4 = f2 - this.mInitialMotionY;
      j = this.mDragHelper.getTouchSlop();
    }
    while ((f3 * f3 + f4 * f4 >= j * j) || (!this.mDragHelper.isViewUnder(this.mSlideableView, (int)f1, (int)f2)));
    closePane(this.mSlideableView, 0);
    return bool;
  }

  public boolean openPane()
  {
    return openPane(this.mSlideableView, 0);
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.mCanSlide))
      if (paramView1 != this.mSlideableView)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.mPreservedOpenState = bool;
      return;
    }
  }

  void setAllChildrenVisible()
  {
    int i = 0;
    int j = getChildCount();
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 4)
        localView.setVisibility(0);
      i++;
    }
  }

  public void setCoveredFadeColor(int paramInt)
  {
    this.mCoveredFadeColor = paramInt;
  }

  public void setPanelSlideListener(SlidingPaneLayout.PanelSlideListener paramPanelSlideListener)
  {
    this.mPanelSlideListener = paramPanelSlideListener;
  }

  public void setParallaxDistance(int paramInt)
  {
    this.mParallaxBy = paramInt;
    requestLayout();
  }

  public void setShadowDrawable(Drawable paramDrawable)
  {
    this.mShadowDrawable = paramDrawable;
  }

  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }

  public void setSliderFadeColor(int paramInt)
  {
    this.mSliderFadeColor = paramInt;
  }

  @Deprecated
  public void smoothSlideClosed()
  {
    closePane();
  }

  @Deprecated
  public void smoothSlideOpen()
  {
    openPane();
  }

  boolean smoothSlideTo(float paramFloat, int paramInt)
  {
    if (!this.mCanSlide);
    int i;
    do
    {
      return false;
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.mSlideableView.getLayoutParams();
      i = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.mSlideRange);
    }
    while (!this.mDragHelper.smoothSlideViewTo(this.mSlideableView, i, this.mSlideableView.getTop()));
    setAllChildrenVisible();
    ViewCompat.postInvalidateOnAnimation(this);
    return true;
  }

  void updateObscuredViewsVisibility(View paramView)
  {
    int i = getPaddingLeft();
    int j = getWidth() - getPaddingRight();
    int k = getPaddingTop();
    int m = getHeight() - getPaddingBottom();
    int i1;
    int i2;
    int i3;
    int n;
    if ((paramView != null) && (viewIsOpaque(paramView)))
    {
      i1 = paramView.getLeft();
      i2 = paramView.getRight();
      i3 = paramView.getTop();
      n = paramView.getBottom();
    }
    int i4;
    View localView;
    while (true)
    {
      i4 = 0;
      int i5 = getChildCount();
      if (i4 < i5)
      {
        localView = getChildAt(i4);
        if (localView != paramView)
          break;
      }
      return;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
    }
    int i6 = Math.max(i, localView.getLeft());
    int i7 = Math.max(k, localView.getTop());
    int i8 = Math.min(j, localView.getRight());
    int i9 = Math.min(m, localView.getBottom());
    if ((i6 >= i1) && (i7 >= i3) && (i8 <= i2) && (i9 <= n));
    for (int i10 = 4; ; i10 = 0)
    {
      localView.setVisibility(i10);
      i4++;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
