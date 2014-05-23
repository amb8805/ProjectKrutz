package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

class IcsLinearLayout extends LinearLayout
{
  private static final int[] LL = { 16843049, 16843561, 16843562 };
  private static final int LL_DIVIDER = 0;
  private static final int LL_DIVIDER_PADDING = 2;
  private static final int LL_SHOW_DIVIDER = 1;
  private Drawable mDivider;
  private int mDividerHeight;
  private int mDividerPadding;
  private int mDividerWidth;
  private int mShowDividers;

  public IcsLinearLayout(Context paramContext, int paramInt)
  {
    super(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, LL, paramInt, 0);
    setDividerDrawable(localTypedArray.getDrawable(0));
    this.mDividerPadding = localTypedArray.getDimensionPixelSize(2, 0);
    this.mShowDividers = localTypedArray.getInteger(1, 0);
    localTypedArray.recycle();
  }

  private void drawDividersHorizontal(Canvas paramCanvas)
  {
    int i = getChildCount();
    int j = 0;
    View localView2;
    if (j >= i)
      if (hasDividerBeforeChildAt(i))
      {
        localView2 = getChildAt(i - 1);
        if (localView2 != null)
          break label120;
      }
    label120: for (int k = getWidth() - getPaddingRight() - this.mDividerWidth; ; k = localView2.getRight())
    {
      drawVerticalDivider(paramCanvas, k);
      return;
      View localView1 = getChildAt(j);
      if ((localView1 != null) && (localView1.getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView1.getLayoutParams();
        drawVerticalDivider(paramCanvas, localView1.getLeft() - localLayoutParams.leftMargin);
      }
      j++;
      break;
    }
  }

  private void drawDividersVertical(Canvas paramCanvas)
  {
    int i = getChildCount();
    int j = 0;
    View localView2;
    if (j >= i)
      if (hasDividerBeforeChildAt(i))
      {
        localView2 = getChildAt(i - 1);
        if (localView2 != null)
          break label120;
      }
    label120: for (int k = getHeight() - getPaddingBottom() - this.mDividerHeight; ; k = localView2.getBottom())
    {
      drawHorizontalDivider(paramCanvas, k);
      return;
      View localView1 = getChildAt(j);
      if ((localView1 != null) && (localView1.getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView1.getLayoutParams();
        drawHorizontalDivider(paramCanvas, localView1.getTop() - localLayoutParams.topMargin);
      }
      j++;
      break;
    }
  }

  private void drawHorizontalDivider(Canvas paramCanvas, int paramInt)
  {
    this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, paramInt, getWidth() - getPaddingRight() - this.mDividerPadding, paramInt + this.mDividerHeight);
    this.mDivider.draw(paramCanvas);
  }

  private void drawVerticalDivider(Canvas paramCanvas, int paramInt)
  {
    this.mDivider.setBounds(paramInt, getPaddingTop() + this.mDividerPadding, paramInt + this.mDividerWidth, getHeight() - getPaddingBottom() - this.mDividerPadding);
    this.mDivider.draw(paramCanvas);
  }

  private boolean hasDividerBeforeChildAt(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == getChildCount()));
    while (true)
    {
      return false;
      if ((0x2 & this.mShowDividers) != 0)
        for (int i = paramInt - 1; i >= 0; i--)
          if (getChildAt(i).getVisibility() != 8)
            return true;
    }
  }

  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = indexOfChild(paramView);
    int j = getOrientation();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if (hasDividerBeforeChildAt(i))
    {
      if (j == 1)
        localLayoutParams.topMargin = this.mDividerHeight;
    }
    else
    {
      int k = getChildCount();
      if ((i == k - 1) && (hasDividerBeforeChildAt(k)))
      {
        if (j != 1)
          break label109;
        localLayoutParams.bottomMargin = this.mDividerHeight;
      }
    }
    while (true)
    {
      super.measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      localLayoutParams.leftMargin = this.mDividerWidth;
      break;
      label109: localLayoutParams.rightMargin = this.mDividerWidth;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.mDivider != null)
    {
      if (getOrientation() != 1)
        break label26;
      drawDividersVertical(paramCanvas);
    }
    while (true)
    {
      super.onDraw(paramCanvas);
      return;
      label26: drawDividersHorizontal(paramCanvas);
    }
  }

  public void setDividerDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.mDivider)
      return;
    this.mDivider = paramDrawable;
    if (paramDrawable != null)
      this.mDividerWidth = paramDrawable.getIntrinsicWidth();
    for (this.mDividerHeight = paramDrawable.getIntrinsicHeight(); ; this.mDividerHeight = 0)
    {
      boolean bool = false;
      if (paramDrawable == null)
        bool = true;
      setWillNotDraw(bool);
      requestLayout();
      return;
      this.mDividerWidth = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.viewpagerindicator.IcsLinearLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
