package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

class SpinnerICS extends AbsSpinnerICS
  implements DialogInterface.OnClickListener
{
  private static final int MAX_ITEMS_MEASURED = 15;
  static final int MODE_DIALOG = 0;
  static final int MODE_DROPDOWN = 1;
  private static final int MODE_THEME = -1;
  private static final String TAG = "Spinner";
  int mDropDownWidth;
  private int mGravity;
  private SpinnerICS.SpinnerPopup mPopup;
  private SpinnerICS.DropDownAdapter mTempAdapter;
  private Rect mTempRect = new Rect();

  SpinnerICS(Context paramContext)
  {
    this(paramContext, null);
  }

  SpinnerICS(Context paramContext, int paramInt)
  {
    this(paramContext, null, R.attr.spinnerStyle, paramInt);
  }

  SpinnerICS(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.spinnerStyle);
  }

  SpinnerICS(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }

  SpinnerICS(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Spinner, paramInt1, 0);
    if (paramInt2 == -1)
      paramInt2 = localTypedArray.getInt(7, 0);
    switch (paramInt2)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      this.mGravity = localTypedArray.getInt(0, 17);
      this.mPopup.setPromptText(localTypedArray.getString(6));
      localTypedArray.recycle();
      if (this.mTempAdapter != null)
      {
        this.mPopup.setAdapter(this.mTempAdapter);
        this.mTempAdapter = null;
      }
      return;
      this.mPopup = new SpinnerICS.DialogPopup(this, null);
      continue;
      SpinnerICS.DropdownPopup localDropdownPopup = new SpinnerICS.DropdownPopup(this, paramContext, paramAttributeSet, paramInt1);
      this.mDropDownWidth = localTypedArray.getLayoutDimension(3, -2);
      localDropdownPopup.setBackgroundDrawable(localTypedArray.getDrawable(2));
      int i = localTypedArray.getDimensionPixelOffset(5, 0);
      if (i != 0)
        localDropdownPopup.setVerticalOffset(i);
      int j = localTypedArray.getDimensionPixelOffset(4, 0);
      if (j != 0)
        localDropdownPopup.setHorizontalOffset(j);
      this.mPopup = localDropdownPopup;
    }
  }

  private View makeAndAddView(int paramInt)
  {
    if (!this.mDataChanged)
    {
      View localView2 = this.mRecycler.get(paramInt);
      if (localView2 != null)
      {
        setUpChild(localView2);
        return localView2;
      }
    }
    View localView1 = this.mAdapter.getView(paramInt, null, this);
    setUpChild(localView1);
    return localView1;
  }

  private void setUpChild(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = generateDefaultLayoutParams();
    addViewInLayout(paramView, 0, localLayoutParams);
    paramView.setSelected(hasFocus());
    int i = ViewGroup.getChildMeasureSpec(this.mHeightMeasureSpec, this.mSpinnerPadding.top + this.mSpinnerPadding.bottom, localLayoutParams.height);
    paramView.measure(ViewGroup.getChildMeasureSpec(this.mWidthMeasureSpec, this.mSpinnerPadding.left + this.mSpinnerPadding.right, localLayoutParams.width), i);
    int j = this.mSpinnerPadding.top + (getMeasuredHeight() - this.mSpinnerPadding.bottom - this.mSpinnerPadding.top - paramView.getMeasuredHeight()) / 2;
    int k = j + paramView.getMeasuredHeight();
    paramView.layout(0, j, 0 + paramView.getMeasuredWidth(), k);
  }

  public int getBaseline()
  {
    int i = -1;
    View localView;
    if (getChildCount() > 0)
      localView = getChildAt(0);
    while (true)
    {
      if (localView != null)
      {
        int k = localView.getBaseline();
        if (k >= 0)
          i = k + localView.getTop();
      }
      return i;
      SpinnerAdapter localSpinnerAdapter = this.mAdapter;
      localView = null;
      if (localSpinnerAdapter != null)
      {
        int j = this.mAdapter.getCount();
        localView = null;
        if (j > 0)
        {
          localView = makeAndAddView(0);
          this.mRecycler.put(0, localView);
          removeAllViewsInLayout();
        }
      }
    }
  }

  public CharSequence getPrompt()
  {
    return this.mPopup.getHintText();
  }

  void layout(int paramInt, boolean paramBoolean)
  {
    int i = this.mSpinnerPadding.left;
    int j = getRight() - getLeft() - this.mSpinnerPadding.left - this.mSpinnerPadding.right;
    if (this.mDataChanged)
      handleDataChanged();
    if (this.mItemCount == 0)
    {
      resetList();
      return;
    }
    if (this.mNextSelectedPosition >= 0)
      setSelectedPositionInt(this.mNextSelectedPosition);
    recycleAllViews();
    removeAllViewsInLayout();
    this.mFirstPosition = this.mSelectedPosition;
    View localView = makeAndAddView(this.mSelectedPosition);
    int k = localView.getMeasuredWidth();
    int m = i;
    switch (0x7 & this.mGravity)
    {
    default:
    case 1:
    case 5:
    }
    while (true)
    {
      localView.offsetLeftAndRight(m);
      this.mRecycler.clear();
      invalidate();
      checkSelectionChanged();
      this.mDataChanged = false;
      this.mNeedSync = false;
      setNextSelectedPositionInt(this.mSelectedPosition);
      return;
      m = i + j / 2 - k / 2;
      continue;
      m = i + j - k;
    }
  }

  int measureContentWidth(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int i;
    if (paramSpinnerAdapter == null)
      i = 0;
    do
    {
      return i;
      i = 0;
      View localView = null;
      int j = 0;
      int k = View.MeasureSpec.makeMeasureSpec(0, 0);
      int m = View.MeasureSpec.makeMeasureSpec(0, 0);
      int n = Math.max(0, getSelectedItemPosition());
      int i1 = Math.min(paramSpinnerAdapter.getCount(), n + 15);
      for (int i2 = Math.max(0, n - (15 - (i1 - n))); i2 < i1; i2++)
      {
        int i3 = paramSpinnerAdapter.getItemViewType(i2);
        if (i3 != j)
        {
          j = i3;
          localView = null;
        }
        localView = paramSpinnerAdapter.getView(i2, localView, this);
        if (localView.getLayoutParams() == null)
          localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        localView.measure(k, m);
        i = Math.max(i, localView.getMeasuredWidth());
      }
    }
    while (paramDrawable == null);
    paramDrawable.getPadding(this.mTempRect);
    return i + (this.mTempRect.left + this.mTempRect.right);
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    setSelection(paramInt);
    paramDialogInterface.dismiss();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.mPopup != null) && (this.mPopup.isShowing()))
      this.mPopup.dismiss();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mInLayout = true;
    layout(0, false);
    this.mInLayout = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.mPopup != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
  }

  public boolean performClick()
  {
    boolean bool = super.performClick();
    if (!bool)
    {
      bool = true;
      if (!this.mPopup.isShowing())
        this.mPopup.show();
    }
    return bool;
  }

  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    super.setAdapter(paramSpinnerAdapter);
    if (this.mPopup != null)
    {
      this.mPopup.setAdapter(new SpinnerICS.DropDownAdapter(paramSpinnerAdapter));
      return;
    }
    this.mTempAdapter = new SpinnerICS.DropDownAdapter(paramSpinnerAdapter);
  }

  public void setGravity(int paramInt)
  {
    if (this.mGravity != paramInt)
    {
      if ((paramInt & 0x7) == 0)
        paramInt |= 3;
      this.mGravity = paramInt;
      requestLayout();
    }
  }

  public void setOnItemClickListener(AdapterViewICS.OnItemClickListener paramOnItemClickListener)
  {
    throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
  }

  void setOnItemClickListenerInt(AdapterViewICS.OnItemClickListener paramOnItemClickListener)
  {
    super.setOnItemClickListener(paramOnItemClickListener);
  }

  public void setPrompt(CharSequence paramCharSequence)
  {
    this.mPopup.setPromptText(paramCharSequence);
  }

  public void setPromptId(int paramInt)
  {
    setPrompt(getContext().getText(paramInt));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.SpinnerICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
