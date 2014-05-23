package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import java.util.ArrayList;

public class TitlePageIndicator extends View
  implements PageIndicator
{
  private static final float BOLD_FADE_PERCENTAGE = 0.05F;
  private static final String EMPTY_TITLE = "";
  private static final int INVALID_POINTER = -1;
  private static final float SELECTION_FADE_PERCENTAGE = 0.25F;
  private int mActivePointerId = -1;
  private boolean mBoldText;
  private final Rect mBounds = new Rect();
  private TitlePageIndicator.OnCenterItemClickListener mCenterItemClickListener;
  private float mClipPadding;
  private int mColorSelected;
  private int mColorText;
  private int mCurrentPage = -1;
  private float mFooterIndicatorHeight;
  private TitlePageIndicator.IndicatorStyle mFooterIndicatorStyle;
  private float mFooterIndicatorUnderlinePadding;
  private float mFooterLineHeight;
  private float mFooterPadding;
  private boolean mIsDragging;
  private float mLastMotionX = -1.0F;
  private TitlePageIndicator.LinePosition mLinePosition;
  private ViewPager.OnPageChangeListener mListener;
  private float mPageOffset;
  private final Paint mPaintFooterIndicator = new Paint();
  private final Paint mPaintFooterLine = new Paint();
  private final Paint mPaintText = new Paint();
  private Path mPath = new Path();
  private int mScrollState;
  private float mTitlePadding;
  private float mTopPadding;
  private int mTouchSlop;
  private ViewPager mViewPager;

  public TitlePageIndicator(Context paramContext)
  {
    this(paramContext, null);
  }

  public TitlePageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.vpiTitlePageIndicatorStyle);
  }

  public TitlePageIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (isInEditMode())
      return;
    Resources localResources = getResources();
    int i = localResources.getColor(R.color.default_title_indicator_footer_color);
    float f1 = localResources.getDimension(R.dimen.default_title_indicator_footer_line_height);
    int j = localResources.getInteger(R.integer.default_title_indicator_footer_indicator_style);
    float f2 = localResources.getDimension(R.dimen.default_title_indicator_footer_indicator_height);
    float f3 = localResources.getDimension(R.dimen.default_title_indicator_footer_indicator_underline_padding);
    float f4 = localResources.getDimension(R.dimen.default_title_indicator_footer_padding);
    int k = localResources.getInteger(R.integer.default_title_indicator_line_position);
    int m = localResources.getColor(R.color.default_title_indicator_selected_color);
    boolean bool = localResources.getBoolean(R.bool.default_title_indicator_selected_bold);
    int n = localResources.getColor(R.color.default_title_indicator_text_color);
    float f5 = localResources.getDimension(R.dimen.default_title_indicator_text_size);
    float f6 = localResources.getDimension(R.dimen.default_title_indicator_title_padding);
    float f7 = localResources.getDimension(R.dimen.default_title_indicator_clip_padding);
    float f8 = localResources.getDimension(R.dimen.default_title_indicator_top_padding);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.TitlePageIndicator, paramInt, 0);
    this.mFooterLineHeight = localTypedArray.getDimension(6, f1);
    this.mFooterIndicatorStyle = TitlePageIndicator.IndicatorStyle.fromValue(localTypedArray.getInteger(7, j));
    this.mFooterIndicatorHeight = localTypedArray.getDimension(8, f2);
    this.mFooterIndicatorUnderlinePadding = localTypedArray.getDimension(9, f3);
    this.mFooterPadding = localTypedArray.getDimension(10, f4);
    this.mLinePosition = TitlePageIndicator.LinePosition.fromValue(localTypedArray.getInteger(11, k));
    this.mTopPadding = localTypedArray.getDimension(14, f8);
    this.mTitlePadding = localTypedArray.getDimension(13, f6);
    this.mClipPadding = localTypedArray.getDimension(4, f7);
    this.mColorSelected = localTypedArray.getColor(3, m);
    this.mColorText = localTypedArray.getColor(1, n);
    this.mBoldText = localTypedArray.getBoolean(12, bool);
    float f9 = localTypedArray.getDimension(0, f5);
    int i1 = localTypedArray.getColor(5, i);
    this.mPaintText.setTextSize(f9);
    this.mPaintText.setAntiAlias(true);
    this.mPaintFooterLine.setStyle(Paint.Style.FILL_AND_STROKE);
    this.mPaintFooterLine.setStrokeWidth(this.mFooterLineHeight);
    this.mPaintFooterLine.setColor(i1);
    this.mPaintFooterIndicator.setStyle(Paint.Style.FILL_AND_STROKE);
    this.mPaintFooterIndicator.setColor(i1);
    Drawable localDrawable = localTypedArray.getDrawable(2);
    if (localDrawable != null)
      setBackgroundDrawable(localDrawable);
    localTypedArray.recycle();
    this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(paramContext));
  }

  private Rect calcBounds(int paramInt, Paint paramPaint)
  {
    Rect localRect = new Rect();
    CharSequence localCharSequence = getTitle(paramInt);
    localRect.right = (int)paramPaint.measureText(localCharSequence, 0, localCharSequence.length());
    localRect.bottom = (int)(paramPaint.descent() - paramPaint.ascent());
    return localRect;
  }

  private ArrayList<Rect> calculateAllBounds(Paint paramPaint)
  {
    ArrayList localArrayList = new ArrayList();
    int i = this.mViewPager.getAdapter().getCount();
    int j = getWidth();
    int k = j / 2;
    for (int m = 0; ; m++)
    {
      if (m >= i)
        return localArrayList;
      Rect localRect = calcBounds(m, paramPaint);
      int n = localRect.right - localRect.left;
      int i1 = localRect.bottom - localRect.top;
      localRect.left = (int)(k - n / 2.0F + (m - this.mCurrentPage - this.mPageOffset) * j);
      localRect.right = (n + localRect.left);
      localRect.top = 0;
      localRect.bottom = i1;
      localArrayList.add(localRect);
    }
  }

  private void clipViewOnTheLeft(Rect paramRect, float paramFloat, int paramInt)
  {
    paramRect.left = (int)(paramInt + this.mClipPadding);
    paramRect.right = (int)(paramFloat + this.mClipPadding);
  }

  private void clipViewOnTheRight(Rect paramRect, float paramFloat, int paramInt)
  {
    paramRect.right = (int)(paramInt - this.mClipPadding);
    paramRect.left = (int)(paramRect.right - paramFloat);
  }

  private CharSequence getTitle(int paramInt)
  {
    Object localObject = this.mViewPager.getAdapter().getPageTitle(paramInt);
    if (localObject == null)
      localObject = "";
    return localObject;
  }

  public float getClipPadding()
  {
    return this.mClipPadding;
  }

  public int getFooterColor()
  {
    return this.mPaintFooterLine.getColor();
  }

  public float getFooterIndicatorHeight()
  {
    return this.mFooterIndicatorHeight;
  }

  public float getFooterIndicatorPadding()
  {
    return this.mFooterPadding;
  }

  public TitlePageIndicator.IndicatorStyle getFooterIndicatorStyle()
  {
    return this.mFooterIndicatorStyle;
  }

  public float getFooterLineHeight()
  {
    return this.mFooterLineHeight;
  }

  public TitlePageIndicator.LinePosition getLinePosition()
  {
    return this.mLinePosition;
  }

  public int getSelectedColor()
  {
    return this.mColorSelected;
  }

  public int getTextColor()
  {
    return this.mColorText;
  }

  public float getTextSize()
  {
    return this.mPaintText.getTextSize();
  }

  public float getTitlePadding()
  {
    return this.mTitlePadding;
  }

  public float getTopPadding()
  {
    return this.mTopPadding;
  }

  public Typeface getTypeface()
  {
    return this.mPaintText.getTypeface();
  }

  public boolean isSelectedBold()
  {
    return this.mBoldText;
  }

  public void notifyDataSetChanged()
  {
    invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.mViewPager == null);
    ArrayList localArrayList;
    int j;
    int i3;
    label170: int i4;
    label181: label192: float f5;
    label288: float f8;
    float f9;
    label556: label562: label568: label866: 
    do
    {
      int i;
      do
      {
        return;
        i = this.mViewPager.getAdapter().getCount();
      }
      while (i == 0);
      if ((this.mCurrentPage == -1) && (this.mViewPager != null))
        this.mCurrentPage = this.mViewPager.getCurrentItem();
      localArrayList = calculateAllBounds(this.mPaintText);
      j = localArrayList.size();
      if (this.mCurrentPage >= j)
      {
        setCurrentItem(j - 1);
        return;
      }
      int k = i - 1;
      float f1 = getWidth() / 2.0F;
      int m = getLeft();
      float f2 = m + this.mClipPadding;
      int n = getWidth();
      int i1 = getHeight();
      int i2 = m + n;
      float f3 = i2 - this.mClipPadding;
      i3 = this.mCurrentPage;
      float f4;
      int i5;
      int i13;
      if (this.mPageOffset <= 0.5D)
      {
        f4 = this.mPageOffset;
        if (f4 > 0.25F)
          break label556;
        i4 = 1;
        if (f4 > 0.05F)
          break label562;
        i5 = 1;
        f5 = (0.25F - f4) / 0.25F;
        Rect localRect1 = (Rect)localArrayList.get(this.mCurrentPage);
        float f6 = localRect1.right - localRect1.left;
        if (localRect1.left < f2)
          clipViewOnTheLeft(localRect1, f6, m);
        if (localRect1.right > f3)
          clipViewOnTheRight(localRect1, f6, i2);
        if (this.mCurrentPage > 0)
        {
          i13 = -1 + this.mCurrentPage;
          if (i13 >= 0)
            break label568;
        }
        if (this.mCurrentPage >= k);
      }
      int i6;
      int i7;
      for (int i11 = 1 + this.mCurrentPage; ; i11++)
      {
        if (i11 >= i)
        {
          i6 = this.mColorText >>> 24;
          i7 = 0;
          if (i7 < i)
            break label805;
          float f7 = this.mFooterLineHeight;
          f8 = this.mFooterIndicatorHeight;
          if (this.mLinePosition == TitlePageIndicator.LinePosition.Top)
          {
            i1 = 0;
            f7 = -f7;
            f8 = -f8;
          }
          this.mPath.reset();
          this.mPath.moveTo(0.0F, i1 - f7 / 2.0F);
          this.mPath.lineTo(n, i1 - f7 / 2.0F);
          this.mPath.close();
          paramCanvas.drawPath(this.mPath, this.mPaintFooterLine);
          f9 = i1 - f7;
        }
        switch ($SWITCH_TABLE$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle()[this.mFooterIndicatorStyle.ordinal()])
        {
        default:
          return;
        case 2:
          this.mPath.reset();
          this.mPath.moveTo(f1, f9 - f8);
          this.mPath.lineTo(f1 + f8, f9);
          this.mPath.lineTo(f1 - f8, f9);
          this.mPath.close();
          paramCanvas.drawPath(this.mPath, this.mPaintFooterIndicator);
          return;
          i3++;
          f4 = 1.0F - this.mPageOffset;
          break label170;
          i4 = 0;
          break label181;
          i5 = 0;
          break label192;
          Rect localRect7 = (Rect)localArrayList.get(i13);
          if (localRect7.left < f2)
          {
            int i14 = localRect7.right - localRect7.left;
            clipViewOnTheLeft(localRect7, i14, m);
            Rect localRect8 = (Rect)localArrayList.get(i13 + 1);
            if (localRect7.right + this.mTitlePadding > localRect8.left)
            {
              localRect7.left = (int)(localRect8.left - i14 - this.mTitlePadding);
              localRect7.right = (i14 + localRect7.left);
            }
          }
          i13--;
          break label288;
          Rect localRect5 = (Rect)localArrayList.get(i11);
          if (localRect5.right > f3)
          {
            int i12 = localRect5.right - localRect5.left;
            clipViewOnTheRight(localRect5, i12, i2);
            Rect localRect6 = (Rect)localArrayList.get(i11 - 1);
            if (localRect5.left - this.mTitlePadding < localRect6.right)
            {
              localRect5.left = (int)(localRect6.right + this.mTitlePadding);
              localRect5.right = (i12 + localRect5.left);
            }
          }
        case 3:
        }
      }
      Rect localRect2 = (Rect)localArrayList.get(i7);
      int i8;
      CharSequence localCharSequence;
      Paint localPaint;
      if (((localRect2.left > m) && (localRect2.left < i2)) || ((localRect2.right > m) && (localRect2.right < i2)))
      {
        if (i7 != i3)
          break label1154;
        i8 = 1;
        localCharSequence = getTitle(i7);
        localPaint = this.mPaintText;
        if ((i8 == 0) || (i5 == 0) || (!this.mBoldText))
          break label1160;
      }
      for (boolean bool = true; ; bool = false)
      {
        localPaint.setFakeBoldText(bool);
        this.mPaintText.setColor(this.mColorText);
        if ((i8 != 0) && (i4 != 0))
          this.mPaintText.setAlpha(i6 - (int)(f5 * i6));
        int i9 = j - 1;
        if (i7 < i9)
        {
          Rect localRect3 = (Rect)localArrayList.get(i7 + 1);
          if (localRect2.right + this.mTitlePadding > localRect3.left)
          {
            int i10 = localRect2.right - localRect2.left;
            localRect2.left = (int)(localRect3.left - i10 - this.mTitlePadding);
            localRect2.right = (i10 + localRect2.left);
          }
        }
        paramCanvas.drawText(localCharSequence, 0, localCharSequence.length(), localRect2.left, localRect2.bottom + this.mTopPadding, this.mPaintText);
        if ((i8 != 0) && (i4 != 0))
        {
          this.mPaintText.setColor(this.mColorSelected);
          this.mPaintText.setAlpha((int)(f5 * this.mColorSelected >>> 24));
          paramCanvas.drawText(localCharSequence, 0, localCharSequence.length(), localRect2.left, localRect2.bottom + this.mTopPadding, this.mPaintText);
        }
        i7++;
        break;
        i8 = 0;
        break label866;
      }
    }
    while ((i4 == 0) || (i3 >= j));
    label805: Rect localRect4 = (Rect)localArrayList.get(i3);
    label1154: label1160: float f10 = localRect4.right + this.mFooterIndicatorUnderlinePadding;
    float f11 = localRect4.left - this.mFooterIndicatorUnderlinePadding;
    float f12 = f9 - f8;
    this.mPath.reset();
    this.mPath.moveTo(f11, f9);
    this.mPath.lineTo(f10, f9);
    this.mPath.lineTo(f10, f12);
    this.mPath.lineTo(f11, f12);
    this.mPath.close();
    this.mPaintFooterIndicator.setAlpha((int)(255.0F * f5));
    paramCanvas.drawPath(this.mPath, this.mPaintFooterIndicator);
    this.mPaintFooterIndicator.setAlpha(255);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    float f;
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824)
      f = View.MeasureSpec.getSize(paramInt2);
    while (true)
    {
      setMeasuredDimension(i, (int)f);
      return;
      this.mBounds.setEmpty();
      this.mBounds.bottom = (int)(this.mPaintText.descent() - this.mPaintText.ascent());
      f = this.mBounds.bottom - this.mBounds.top + this.mFooterLineHeight + this.mFooterPadding + this.mTopPadding;
      if (this.mFooterIndicatorStyle != TitlePageIndicator.IndicatorStyle.None)
        f += this.mFooterIndicatorHeight;
    }
  }

  public void onPageScrollStateChanged(int paramInt)
  {
    this.mScrollState = paramInt;
    if (this.mListener != null)
      this.mListener.onPageScrollStateChanged(paramInt);
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    this.mCurrentPage = paramInt1;
    this.mPageOffset = paramFloat;
    invalidate();
    if (this.mListener != null)
      this.mListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
  }

  public void onPageSelected(int paramInt)
  {
    if (this.mScrollState == 0)
    {
      this.mCurrentPage = paramInt;
      invalidate();
    }
    if (this.mListener != null)
      this.mListener.onPageSelected(paramInt);
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    TitlePageIndicator.SavedState localSavedState = (TitlePageIndicator.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.mCurrentPage = localSavedState.currentPage;
    requestLayout();
  }

  public Parcelable onSaveInstanceState()
  {
    TitlePageIndicator.SavedState localSavedState = new TitlePageIndicator.SavedState(super.onSaveInstanceState());
    localSavedState.currentPage = this.mCurrentPage;
    return localSavedState;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (super.onTouchEvent(paramMotionEvent))
      return true;
    if ((this.mViewPager == null) || (this.mViewPager.getAdapter().getCount() == 0))
      return false;
    int i = 0xFF & paramMotionEvent.getAction();
    switch (i)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
      while (true)
      {
        return true;
        this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, 0);
        this.mLastMotionX = paramMotionEvent.getX();
        continue;
        float f6 = MotionEventCompat.getX(paramMotionEvent, MotionEventCompat.findPointerIndex(paramMotionEvent, this.mActivePointerId));
        float f7 = f6 - this.mLastMotionX;
        if ((!this.mIsDragging) && (Math.abs(f7) > this.mTouchSlop))
          this.mIsDragging = true;
        if (this.mIsDragging)
        {
          this.mLastMotionX = f6;
          if ((this.mViewPager.isFakeDragging()) || (this.mViewPager.beginFakeDrag()))
          {
            this.mViewPager.fakeDragBy(f7);
            continue;
            if (!this.mIsDragging)
            {
              int n = this.mViewPager.getAdapter().getCount();
              int i1 = getWidth();
              float f1 = i1 / 2.0F;
              float f2 = i1 / 6.0F;
              float f3 = f1 - f2;
              float f4 = f1 + f2;
              float f5 = paramMotionEvent.getX();
              if (f5 < f3)
              {
                if (this.mCurrentPage > 0)
                {
                  if (i != 3)
                    this.mViewPager.setCurrentItem(-1 + this.mCurrentPage);
                  return true;
                }
              }
              else if (f5 > f4)
              {
                if (this.mCurrentPage < n - 1)
                {
                  if (i != 3)
                    this.mViewPager.setCurrentItem(1 + this.mCurrentPage);
                  return true;
                }
              }
              else if ((this.mCenterItemClickListener != null) && (i != 3))
                this.mCenterItemClickListener.onCenterItemClick(this.mCurrentPage);
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging())
            {
              this.mViewPager.endFakeDrag();
              continue;
              int m = MotionEventCompat.getActionIndex(paramMotionEvent);
              this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, m);
              this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, m);
            }
          }
        }
      }
    case 6:
    }
    int j = MotionEventCompat.getActionIndex(paramMotionEvent);
    if (MotionEventCompat.getPointerId(paramMotionEvent, j) == this.mActivePointerId)
      if (j != 0)
        break label472;
    label472: for (int k = 1; ; k = 0)
    {
      this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, k);
      this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, MotionEventCompat.findPointerIndex(paramMotionEvent, this.mActivePointerId));
      break;
    }
  }

  public void setClipPadding(float paramFloat)
  {
    this.mClipPadding = paramFloat;
    invalidate();
  }

  public void setCurrentItem(int paramInt)
  {
    if (this.mViewPager == null)
      throw new IllegalStateException("ViewPager has not been bound.");
    this.mViewPager.setCurrentItem(paramInt);
    this.mCurrentPage = paramInt;
    invalidate();
  }

  public void setFooterColor(int paramInt)
  {
    this.mPaintFooterLine.setColor(paramInt);
    this.mPaintFooterIndicator.setColor(paramInt);
    invalidate();
  }

  public void setFooterIndicatorHeight(float paramFloat)
  {
    this.mFooterIndicatorHeight = paramFloat;
    invalidate();
  }

  public void setFooterIndicatorPadding(float paramFloat)
  {
    this.mFooterPadding = paramFloat;
    invalidate();
  }

  public void setFooterIndicatorStyle(TitlePageIndicator.IndicatorStyle paramIndicatorStyle)
  {
    this.mFooterIndicatorStyle = paramIndicatorStyle;
    invalidate();
  }

  public void setFooterLineHeight(float paramFloat)
  {
    this.mFooterLineHeight = paramFloat;
    this.mPaintFooterLine.setStrokeWidth(this.mFooterLineHeight);
    invalidate();
  }

  public void setLinePosition(TitlePageIndicator.LinePosition paramLinePosition)
  {
    this.mLinePosition = paramLinePosition;
    invalidate();
  }

  public void setOnCenterItemClickListener(TitlePageIndicator.OnCenterItemClickListener paramOnCenterItemClickListener)
  {
    this.mCenterItemClickListener = paramOnCenterItemClickListener;
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mListener = paramOnPageChangeListener;
  }

  public void setSelectedBold(boolean paramBoolean)
  {
    this.mBoldText = paramBoolean;
    invalidate();
  }

  public void setSelectedColor(int paramInt)
  {
    this.mColorSelected = paramInt;
    invalidate();
  }

  public void setTextColor(int paramInt)
  {
    this.mPaintText.setColor(paramInt);
    this.mColorText = paramInt;
    invalidate();
  }

  public void setTextSize(float paramFloat)
  {
    this.mPaintText.setTextSize(paramFloat);
    invalidate();
  }

  public void setTitlePadding(float paramFloat)
  {
    this.mTitlePadding = paramFloat;
    invalidate();
  }

  public void setTopPadding(float paramFloat)
  {
    this.mTopPadding = paramFloat;
    invalidate();
  }

  public void setTypeface(Typeface paramTypeface)
  {
    this.mPaintText.setTypeface(paramTypeface);
    invalidate();
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
    this.mViewPager.setOnPageChangeListener(this);
    invalidate();
  }

  public void setViewPager(ViewPager paramViewPager, int paramInt)
  {
    setViewPager(paramViewPager);
    setCurrentItem(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.viewpagerindicator.TitlePageIndicator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
