package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.appcompat.R.attr;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View;;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class ListPopupWindow
{
  private static final boolean DEBUG = false;
  private static final int EXPAND_LIST_TIMEOUT = 250;
  public static final int FILL_PARENT = -1;
  public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
  public static final int INPUT_METHOD_NEEDED = 1;
  public static final int INPUT_METHOD_NOT_NEEDED = 2;
  public static final int POSITION_PROMPT_ABOVE = 0;
  public static final int POSITION_PROMPT_BELOW = 1;
  private static final String TAG = "ListPopupWindow";
  public static final int WRAP_CONTENT = -2;
  private ListAdapter mAdapter;
  private Context mContext;
  private boolean mDropDownAlwaysVisible = false;
  private View mDropDownAnchorView;
  private int mDropDownHeight = -2;
  private int mDropDownHorizontalOffset;
  private ListPopupWindow.DropDownListView mDropDownList;
  private Drawable mDropDownListHighlight;
  private int mDropDownVerticalOffset;
  private boolean mDropDownVerticalOffsetSet;
  private int mDropDownWidth = -2;
  private boolean mForceIgnoreOutsideTouch = false;
  private Handler mHandler = new Handler();
  private final ListPopupWindow.ListSelectorHider mHideSelector = new ListPopupWindow.ListSelectorHider(this, null);
  private AdapterView.OnItemClickListener mItemClickListener;
  private AdapterView.OnItemSelectedListener mItemSelectedListener;
  private int mLayoutDirection;
  int mListItemExpandMaximum = 2147483647;
  private boolean mModal;
  private DataSetObserver mObserver;
  private PopupWindow mPopup;
  private int mPromptPosition = 0;
  private View mPromptView;
  private final ListPopupWindow.ResizePopupRunnable mResizePopupRunnable = new ListPopupWindow.ResizePopupRunnable(this, null);
  private final ListPopupWindow.PopupScrollListener mScrollListener = new ListPopupWindow.PopupScrollListener(this, null);
  private Runnable mShowDropDownRunnable;
  private Rect mTempRect = new Rect();
  private final ListPopupWindow.PopupTouchInterceptor mTouchInterceptor = new ListPopupWindow.PopupTouchInterceptor(this, null);

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, R.attr.listPopupWindowStyle);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.listPopupWindowStyle);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.mContext = paramContext;
    this.mPopup = new PopupWindow(paramContext, paramAttributeSet, paramInt);
    this.mPopup.setInputMethodMode(1);
  }

  private int buildDropDown()
  {
    boolean bool2;
    Object localObject;
    View localView2;
    int i;
    LinearLayout localLinearLayout;
    LinearLayout.LayoutParams localLayoutParams2;
    label252: int j;
    if (this.mDropDownList == null)
    {
      Context localContext = this.mContext;
      this.mShowDropDownRunnable = new ListPopupWindow.1(this);
      if (!this.mModal)
      {
        bool2 = true;
        this.mDropDownList = new ListPopupWindow.DropDownListView(localContext, bool2);
        if (this.mDropDownListHighlight != null)
          this.mDropDownList.setSelector(this.mDropDownListHighlight);
        this.mDropDownList.setAdapter(this.mAdapter);
        this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
        this.mDropDownList.setFocusable(true);
        this.mDropDownList.setFocusableInTouchMode(true);
        this.mDropDownList.setOnItemSelectedListener(new ListPopupWindow.2(this));
        this.mDropDownList.setOnScrollListener(this.mScrollListener);
        if (this.mItemSelectedListener != null)
          this.mDropDownList.setOnItemSelectedListener(this.mItemSelectedListener);
        localObject = this.mDropDownList;
        localView2 = this.mPromptView;
        i = 0;
        if (localView2 != null)
        {
          localLinearLayout = new LinearLayout(localContext);
          localLinearLayout.setOrientation(1);
          localLayoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        }
        switch (this.mPromptPosition)
        {
        default:
          Log.e("ListPopupWindow", "Invalid hint position " + this.mPromptPosition);
          localView2.measure(View.MeasureSpec.makeMeasureSpec(this.mDropDownWidth, -2147483648), 0);
          LinearLayout.LayoutParams localLayoutParams3 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
          i = localView2.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin;
          localObject = localLinearLayout;
          this.mPopup.setContentView((View)localObject);
          label309: Drawable localDrawable = this.mPopup.getBackground();
          if (localDrawable != null)
          {
            localDrawable.getPadding(this.mTempRect);
            j = this.mTempRect.top + this.mTempRect.bottom;
            if (!this.mDropDownVerticalOffsetSet)
              this.mDropDownVerticalOffset = (-this.mTempRect.top);
            label369: if (this.mPopup.getInputMethodMode() != 2)
              break label528;
          }
        case 1:
        case 0:
        }
      }
    }
    int k;
    label528: for (boolean bool1 = true; ; bool1 = false)
    {
      k = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, bool1);
      if ((!this.mDropDownAlwaysVisible) && (this.mDropDownHeight != -1))
        break label534;
      return k + j;
      bool2 = false;
      break;
      localLinearLayout.addView((View)localObject, localLayoutParams2);
      localLinearLayout.addView(localView2);
      break label252;
      localLinearLayout.addView(localView2);
      localLinearLayout.addView((View)localObject, localLayoutParams2);
      break label252;
      ((ViewGroup)this.mPopup.getContentView());
      View localView1 = this.mPromptView;
      i = 0;
      if (localView1 == null)
        break label309;
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
      i = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
      break label309;
      this.mTempRect.setEmpty();
      j = 0;
      break label369;
    }
    label534: int m;
    switch (this.mDropDownWidth)
    {
    default:
      m = View.MeasureSpec.makeMeasureSpec(this.mDropDownWidth, 1073741824);
    case -2:
    case -1:
    }
    while (true)
    {
      int n = this.mDropDownList.measureHeightOfChildrenCompat(m, 0, -1, k - i, -1);
      if (n > 0)
        i += j;
      return n + i;
      m = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), -2147483648);
      continue;
      m = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
    }
  }

  private void removePromptView()
  {
    if (this.mPromptView != null)
    {
      ViewParent localViewParent = this.mPromptView.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.mPromptView);
    }
  }

  public void clearListSelection()
  {
    ListPopupWindow.DropDownListView localDropDownListView = this.mDropDownList;
    if (localDropDownListView != null)
    {
      ListPopupWindow.DropDownListView.access$502(localDropDownListView, true);
      localDropDownListView.requestLayout();
    }
  }

  public void dismiss()
  {
    this.mPopup.dismiss();
    removePromptView();
    this.mPopup.setContentView(null);
    this.mDropDownList = null;
    this.mHandler.removeCallbacks(this.mResizePopupRunnable);
  }

  public View getAnchorView()
  {
    return this.mDropDownAnchorView;
  }

  public int getAnimationStyle()
  {
    return this.mPopup.getAnimationStyle();
  }

  public Drawable getBackground()
  {
    return this.mPopup.getBackground();
  }

  public int getHeight()
  {
    return this.mDropDownHeight;
  }

  public int getHorizontalOffset()
  {
    return this.mDropDownHorizontalOffset;
  }

  public int getInputMethodMode()
  {
    return this.mPopup.getInputMethodMode();
  }

  public ListView getListView()
  {
    return this.mDropDownList;
  }

  public int getMaxAvailableHeight(View paramView, int paramInt, boolean paramBoolean)
  {
    Rect localRect = new Rect();
    paramView.getWindowVisibleDisplayFrame(localRect);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = localRect.bottom;
    if (paramBoolean)
      i = paramView.getContext().getResources().getDisplayMetrics().heightPixels;
    int j = Math.max(i - (arrayOfInt[1] + paramView.getHeight()) - paramInt, paramInt + (arrayOfInt[1] - localRect.top));
    if (this.mPopup.getBackground() != null)
    {
      this.mPopup.getBackground().getPadding(this.mTempRect);
      j -= this.mTempRect.top + this.mTempRect.bottom;
    }
    return j;
  }

  public int getPromptPosition()
  {
    return this.mPromptPosition;
  }

  public Object getSelectedItem()
  {
    if (!isShowing())
      return null;
    return this.mDropDownList.getSelectedItem();
  }

  public long getSelectedItemId()
  {
    if (!isShowing())
      return -9223372036854775808L;
    return this.mDropDownList.getSelectedItemId();
  }

  public int getSelectedItemPosition()
  {
    if (!isShowing())
      return -1;
    return this.mDropDownList.getSelectedItemPosition();
  }

  public View getSelectedView()
  {
    if (!isShowing())
      return null;
    return this.mDropDownList.getSelectedView();
  }

  public int getSoftInputMode()
  {
    return this.mPopup.getSoftInputMode();
  }

  public int getVerticalOffset()
  {
    if (!this.mDropDownVerticalOffsetSet)
      return 0;
    return this.mDropDownVerticalOffset;
  }

  public int getWidth()
  {
    return this.mDropDownWidth;
  }

  public boolean isDropDownAlwaysVisible()
  {
    return this.mDropDownAlwaysVisible;
  }

  public boolean isInputMethodNotNeeded()
  {
    return this.mPopup.getInputMethodMode() == 2;
  }

  public boolean isModal()
  {
    return this.mModal;
  }

  public boolean isShowing()
  {
    return this.mPopup.isShowing();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i;
    int j;
    int k;
    int m;
    if ((isShowing()) && (paramInt != 62) && ((this.mDropDownList.getSelectedItemPosition() >= 0) || ((paramInt != 66) && (paramInt != 23))))
    {
      i = this.mDropDownList.getSelectedItemPosition();
      ListAdapter localListAdapter;
      if (!this.mPopup.isAboveAnchor())
      {
        j = 1;
        localListAdapter = this.mAdapter;
        k = 2147483647;
        m = -2147483648;
        if (localListAdapter != null)
        {
          boolean bool = localListAdapter.areAllItemsEnabled();
          if (!bool)
            break label167;
          k = 0;
          label93: if (!bool)
            break label181;
        }
      }
      label167: label181: for (m = -1 + localListAdapter.getCount(); ; m = ListPopupWindow.DropDownListView.access$600(this.mDropDownList, -1 + localListAdapter.getCount(), false))
      {
        if (((j == 0) || (paramInt != 19) || (i > k)) && ((j != 0) || (paramInt != 20) || (i < m)))
          break label203;
        clearListSelection();
        this.mPopup.setInputMethodMode(1);
        show();
        return true;
        j = 0;
        break;
        k = ListPopupWindow.DropDownListView.access$600(this.mDropDownList, 0, true);
        break label93;
      }
      label203: ListPopupWindow.DropDownListView.access$502(this.mDropDownList, false);
      if (!this.mDropDownList.onKeyDown(paramInt, paramKeyEvent))
        break label290;
      this.mPopup.setInputMethodMode(2);
      this.mDropDownList.requestFocusFromTouch();
      show();
      switch (paramInt)
      {
      case 19:
      case 20:
      case 23:
      case 66:
      }
    }
    label290: 
    do
    {
      do
      {
        return false;
        if ((j == 0) || (paramInt != 20))
          break;
      }
      while (i != m);
      return true;
    }
    while ((j != 0) || (paramInt != 19) || (i != k));
    return true;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((isShowing()) && (this.mDropDownList.getSelectedItemPosition() >= 0))
    {
      boolean bool = this.mDropDownList.onKeyUp(paramInt, paramKeyEvent);
      if (bool);
      switch (paramInt)
      {
      default:
        return bool;
      case 23:
      case 66:
      }
      dismiss();
      return bool;
    }
    return false;
  }

  public boolean performItemClick(int paramInt)
  {
    if (isShowing())
    {
      if (this.mItemClickListener != null)
      {
        ListPopupWindow.DropDownListView localDropDownListView = this.mDropDownList;
        View localView = localDropDownListView.getChildAt(paramInt - localDropDownListView.getFirstVisiblePosition());
        ListAdapter localListAdapter = localDropDownListView.getAdapter();
        this.mItemClickListener.onItemClick(localDropDownListView, localView, paramInt, localListAdapter.getItemId(paramInt));
      }
      return true;
    }
    return false;
  }

  public void postShow()
  {
    this.mHandler.post(this.mShowDropDownRunnable);
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.mObserver == null)
      this.mObserver = new ListPopupWindow.PopupDataSetObserver(this, null);
    while (true)
    {
      this.mAdapter = paramListAdapter;
      if (this.mAdapter != null)
        paramListAdapter.registerDataSetObserver(this.mObserver);
      if (this.mDropDownList != null)
        this.mDropDownList.setAdapter(this.mAdapter);
      return;
      if (this.mAdapter != null)
        this.mAdapter.unregisterDataSetObserver(this.mObserver);
    }
  }

  public void setAnchorView(View paramView)
  {
    this.mDropDownAnchorView = paramView;
  }

  public void setAnimationStyle(int paramInt)
  {
    this.mPopup.setAnimationStyle(paramInt);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.mPopup.setBackgroundDrawable(paramDrawable);
  }

  public void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.mPopup.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.mTempRect);
      this.mDropDownWidth = (paramInt + (this.mTempRect.left + this.mTempRect.right));
      return;
    }
    setWidth(paramInt);
  }

  public void setDropDownAlwaysVisible(boolean paramBoolean)
  {
    this.mDropDownAlwaysVisible = paramBoolean;
  }

  public void setForceIgnoreOutsideTouch(boolean paramBoolean)
  {
    this.mForceIgnoreOutsideTouch = paramBoolean;
  }

  public void setHeight(int paramInt)
  {
    this.mDropDownHeight = paramInt;
  }

  public void setHorizontalOffset(int paramInt)
  {
    this.mDropDownHorizontalOffset = paramInt;
  }

  public void setInputMethodMode(int paramInt)
  {
    this.mPopup.setInputMethodMode(paramInt);
  }

  void setListItemExpandMax(int paramInt)
  {
    this.mListItemExpandMaximum = paramInt;
  }

  public void setListSelector(Drawable paramDrawable)
  {
    this.mDropDownListHighlight = paramDrawable;
  }

  public void setModal(boolean paramBoolean)
  {
    this.mModal = true;
    this.mPopup.setFocusable(paramBoolean);
  }

  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mPopup.setOnDismissListener(paramOnDismissListener);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.mItemClickListener = paramOnItemClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.mItemSelectedListener = paramOnItemSelectedListener;
  }

  public void setPromptPosition(int paramInt)
  {
    this.mPromptPosition = paramInt;
  }

  public void setPromptView(View paramView)
  {
    boolean bool = isShowing();
    if (bool)
      removePromptView();
    this.mPromptView = paramView;
    if (bool)
      show();
  }

  public void setSelection(int paramInt)
  {
    ListPopupWindow.DropDownListView localDropDownListView = this.mDropDownList;
    if ((isShowing()) && (localDropDownListView != null))
    {
      ListPopupWindow.DropDownListView.access$502(localDropDownListView, false);
      localDropDownListView.setSelection(paramInt);
      if (localDropDownListView.getChoiceMode() != 0)
        localDropDownListView.setItemChecked(paramInt, true);
    }
  }

  public void setSoftInputMode(int paramInt)
  {
    this.mPopup.setSoftInputMode(paramInt);
  }

  public void setVerticalOffset(int paramInt)
  {
    this.mDropDownVerticalOffset = paramInt;
    this.mDropDownVerticalOffsetSet = true;
  }

  public void setWidth(int paramInt)
  {
    this.mDropDownWidth = paramInt;
  }

  public void show()
  {
    boolean bool1 = true;
    int i = -1;
    int j = buildDropDown();
    boolean bool2 = isInputMethodNotNeeded();
    if (this.mPopup.isShowing())
    {
      int n;
      int i1;
      if (this.mDropDownWidth == i)
      {
        n = -1;
        if (this.mDropDownHeight != i)
          break label221;
        if (!bool2)
          break label176;
        i1 = j;
        label52: if (!bool2)
          break label187;
        PopupWindow localPopupWindow4 = this.mPopup;
        if (this.mDropDownWidth != i)
          break label182;
        label71: localPopupWindow4.setWindowLayoutMode(i, 0);
      }
      while (true)
      {
        PopupWindow localPopupWindow2 = this.mPopup;
        boolean bool3 = this.mForceIgnoreOutsideTouch;
        boolean bool4 = false;
        if (!bool3)
        {
          boolean bool5 = this.mDropDownAlwaysVisible;
          bool4 = false;
          if (!bool5)
            bool4 = bool1;
        }
        localPopupWindow2.setOutsideTouchable(bool4);
        this.mPopup.update(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, n, i1);
        return;
        if (this.mDropDownWidth == -2)
        {
          n = getAnchorView().getWidth();
          break;
        }
        n = this.mDropDownWidth;
        break;
        label176: i1 = i;
        break label52;
        label182: i = 0;
        break label71;
        label187: PopupWindow localPopupWindow3 = this.mPopup;
        if (this.mDropDownWidth == i);
        for (int i2 = i; ; i2 = 0)
        {
          localPopupWindow3.setWindowLayoutMode(i2, i);
          break;
        }
        label221: if (this.mDropDownHeight == -2)
          i1 = j;
        else
          i1 = this.mDropDownHeight;
      }
    }
    int k;
    label256: int m;
    label267: PopupWindow localPopupWindow1;
    if (this.mDropDownWidth == i)
    {
      k = -1;
      if (this.mDropDownHeight != i)
        break label429;
      m = -1;
      this.mPopup.setWindowLayoutMode(k, m);
      localPopupWindow1 = this.mPopup;
      if ((this.mForceIgnoreOutsideTouch) || (this.mDropDownAlwaysVisible))
        break label469;
    }
    while (true)
    {
      localPopupWindow1.setOutsideTouchable(bool1);
      this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
      this.mPopup.showAsDropDown(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset);
      this.mDropDownList.setSelection(i);
      if ((!this.mModal) || (this.mDropDownList.isInTouchMode()))
        clearListSelection();
      if (this.mModal)
        break;
      this.mHandler.post(this.mHideSelector);
      return;
      if (this.mDropDownWidth == -2)
      {
        this.mPopup.setWidth(getAnchorView().getWidth());
        k = 0;
        break label256;
      }
      this.mPopup.setWidth(this.mDropDownWidth);
      k = 0;
      break label256;
      label429: if (this.mDropDownHeight == -2)
      {
        this.mPopup.setHeight(j);
        m = 0;
        break label267;
      }
      this.mPopup.setHeight(this.mDropDownHeight);
      m = 0;
      break label267;
      label469: bool1 = false;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ListPopupWindow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
